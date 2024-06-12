organizationFolder(REPO_OWNER)
{
    description('This contains branch source jobs for GitHub')
    displayName(REPO_OWNER)

    properties
    {
        suppressFolderAutomaticTriggering { branches('auto-deploy'); }

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
                            description('Dashboard username and personal access token')
                            id('DASHBOARD_ACCOUNT')
                            username(DASHBOARD_URL)
                            password(DASHBOARD_TOKEN)
                            scope('GLOBAL')
                            usernameSecret(false)
                        }

                        usernamePassword
                        {
                            description('Unity3D serial')
                            id('UNITY_SERIAL')
                            username(UNITY_USERNAME)
                            password(UNITY_SERIAL)
                            scope('GLOBAL')
                            usernameSecret(false)
                        }

                        usernamePassword
                        {
                            description('Unity3D username and password')
                            id('UNITY_ACCOUNT')
                            username(UNITY_USERNAME)
                            password(UNITY_PASSWORD)
                            scope('GLOBAL')
                            usernameSecret(false)
                        }

                        usernamePassword
                        {
                            description('GIT username and personal access token')
                            id('GIT_USER_ACCOUNT')
                            username(GIT_USERNAME)
                            password(GIT_ACCESS_TOKEN)
                            scope('GLOBAL')
                            usernameSecret(false)
                        }

                        usernamePassword
                        {
                            description('TESTLIGHT username and app-specific pass')
                            id('TF_USER_ACCOUNT')
                            username(TESTFLIGHT_USERNAME)
                            password(TESTFLIGHT_PASSWORD)
                            scope('GLOBAL')
                            usernameSecret(false)
                        }

                        usernamePassword
                        {
                            description('Android Keystore file and pass')
                            id('ANDROID_KEYSTORE')
                            username('ANDROID_KEYSTORE_PASS')
                            password(ANDROID_KEYSTORE_PASS)
                            scope('GLOBAL')
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
                gitHubTopicsFilter { topicList(GITHUB_TOPIC) }
                gitHubExcludeArchivedRepositories()
                gitHubBranchDiscovery { strategyId(1) }
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
                            name("origin")
                            url("https://github.com/ChimpDelivery/ChimpDelivery-JenkinsDSL.git")
                            refspec("master")
                            credentialsId("")
                        }
                        browser{}
                        gitTool("")
                    }
                }
            }
        }
    }
}
