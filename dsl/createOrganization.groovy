organizationFolder(REPO_OWNER)
{
    description('This contains branch source jobs for GitHub')
    displayName(REPO_OWNER)

    properties
    {
        suppressFolderAutomaticTriggering
        {
            branches('auto-deploy');
        }

        folderCredentialsProperty
        {
            domainCredentials
            {
                domainCredentials
                {
                    credentials
                    {
                        usernamePassword
                        {
                            description('GIT username and personal access token')
                            id('GIT_USER_ACCOUNT')
                            password(GIT_ACCESS_TOKEN)
                            scope('GLOBAL')
                            username(GIT_USERNAME)
                            usernameSecret(false)
                        }

                        usernamePassword
                        {
                            description('TESTLIGHT username and app-specific pass')
                            id('TF_USER_ACCOUNT')
                            password(TESTFLIGHT_PASSWORD)
                            scope('GLOBAL')
                            username(TESTFLIGHT_USERNAME)
                            usernameSecret(false)
                        }

                        domain
                        {
                            description(null)
                            name(null)
                        }
                    }
                }
            }
        }
    }

    organizations
    {
        github
        {
            credentialsId('GIT_USER_ACCOUNT')
            repoOwner(REPO_OWNER)
            traits
            {
                gitHubTopicsFilter
                {
                    topicList(GITHUB_TOPIC)
                }

                gitHubExcludeArchivedRepositories()

                gitHubBranchDiscovery
                {
                    strategyId(1)
                }
            }
        }
    }

    projectFactories
    {
        remoteJenkinsFileWorkflowMultiBranchProjectFactory
        {
            localMarker("")
            matchBranches(true)
            remoteJenkinsFile("files/Jenkinsfile")
            remoteJenkinsFileSCM
            {
                gitSCM
                {
                    userRemoteConfigs
                    {
                        userRemoteConfig
                        {
                            name("TalusWebBackend-JenkinsDSL") // Custom Repository Name or ID
                            url("https://github.com/TalusStudio/TalusWebBackend-JenkinsDSL.git") //URL for the repository
                            refspec("master") // Branch spec
                            credentialsId("GIT_ACCOUNT") // Credential ID. Leave blank if not required
                        }
                        browser{} // Leave blank for default Git Browser
                        gitTool("") //Leave blank for default git executable
                    }
                }
            }
        }
    }
}
