pipeline
{
    agent any
    
    parameters 
    {
        credentials(
            name: 'GIT_USERNAME',
            description: 'connected account name',
            defaultValue: 'default_account_name',
            credentialType: 'Secret Text',
            required: true
         )
    
    stages
    {
        stage('Run')
        {
            steps
            {
                echo "Hello World!"
            }
        }
    }
}
