pipeline
{
    agent any
    
    parameters 
    {
        credentials(name: 'DASHBOARD_URL', description: 'dashboard url', defaultValue: 'default_dashboard_url', credentialType: 'Secret Text', required: true)
        credentials(name: 'DASHBOARD_TOKEN', description: 'dashboard account token', defaultValue: 'default_dashboard_account_token', credentialType: 'Secret Text', required: true)
        credentials(name: 'GIT_USERNAME', description: 'connected account name', defaultValue: 'default_account_name', credentialType: 'Secret Text', required: true)
        credentials(name: 'GIT_ACCESS_TOKEN', description: 'connected account token', defaultValue: 'default_account_token', credentialType: 'Secret Text', required: true)
        string(name: 'GITHUB_TOPIC', description: 'github repo topic', defaultValue: 'default_github_repo_topic')
        string(name: 'REPO_OWNER', description: 'connected github org name', defaultValue: 'default_github_org_name')
        credentials(name: 'TESTFLIGHT_USERNAME', description: 'connected test-flight related acc name', defaultValue: 'default_tf_account_name', credentialType: 'Secret Text', required: true)
        credentials(name: 'TESTFLIGHT_PASSWORD', description: 'connected test-flight related app specific pass', defaultValue: 'default_tf_account_app_specific_pass', credentialType: 'Secret Text', required: true)
        credentials(name: 'ANDROID_KEYSTORE_FILE', description: 'key.keystore file is required by Unity3D to sign Android app.', defaultValue: 'default_android_keystore_path', credentialType: 'Secret Text', required: true)
        credentials(name: 'ANDROID_KEYSTORE_PASS', description: 'key.keystore file pass is required by Unity3D to sign Android app.', defaultValue: 'default_android_keystore_pass', credentialType: 'Secret Text', required: true)
        credentials(name: 'GOOGLE_PLAY_SERVICE_ACCOUNT', description: 'google play service account json file', defaultValue: 'default_google_play_service_account', credentialType: 'Secret Text', required: true)
    }
    
    stages
    {
        stage('Run')
        {
            steps
            {
                jobDsl targets: 'dsl/createOrganization.groovy'
            }
        }
    }
}
