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
                            password(DASHBOARD_TOKEN)
                            scope('GLOBAL')
                            username(DASHBOARD_URL)
                            usernameSecret(false)
                        }
                        
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
                        
                        // Android Keystore Pass
                        usernamePassword
                        {
                            description('Android Keystore file and pass')
                            id('ANDROID_KEYSTORE')
                            password(ANDROID_KEYSTORE_PASS)
                            scope('GLOBAL')
                            username('ANDROID_KEYSTORE_PASS')
                            usernameSecret(false)
                        }
                           
                        usernamePassword
                        {
                            description('Google Play Service Account')
                            id('GOOGLE_SERVICE_ACCOUNT')
                            password(build.environment.get("ENV_GOOGLE_PLAY_SERVICE_ACCOUNT"))
                            scope('GLOBAL')
                            username('GooglePlayServiceAccount')
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
                            url("https://github.com/TalusStudio/TalusWebBackend-JenkinsDSL.git")
                            refspec("")
                            credentialsId("GIT_ACCOUNT")
                        }
                        browser{}
                        gitTool("")
                    }
                }
            }
        }
    }
}
