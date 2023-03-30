# TalusWebBackend-JenkinsDSL

All required pipelines by Jenkins Controller. Includes DSL scripts to create "Organization Folder" in Jenkins with connected GitHub organization and Unity3D Build/Deliver pipeline scripts.

- [Seeder Job Pipeline](https://github.com/TalusStudio/TalusWebBackend-JenkinsDSL/blob/master/Jenkinsfile)
  - Creates organization folders in Jenkins. 
  - WARNING! Job name must be synced with [Jenkins Configs in Dashboard](https://github.com/TalusStudio/TalusWebBackend/blob/master/config/jenkins.php).
- [Remote Jenkinsfile](https://github.com/TalusStudio/TalusWebBackend-JenkinsDSL/blob/master/files/Jenkinsfile)
  - Jenkinsfile to handle Unity3D Build/Deliver pipeline.
