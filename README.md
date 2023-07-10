# TalusWebBackend-JenkinsDSL

:bookmark: All required pipelines by Jenkins Controller(Master). Includes DSL scripts to create "Organization Folder" in Jenkins with connected "GitHub Organization" and "Unity3D" Build/Deliver pipeline scripts.

- :seedling: [Pipeline: Seed](https://github.com/ChimpDelivery/ChimpDelivery-JenkinsDSL/blob/master/Jenkinsfile)
  - Jenkinsfile that uses DSL scripts to create "Organization Folder" in Jenkins. 
  - WARNING! Job name must be synced with [Jenkins Configs in ChimpDelivery](https://github.com/ChimpDelivery/ChimpDelivery/blob/master/config/jenkins.php).
- :seedling: [Pipeline: Unity3D Build&Deliver](https://github.com/ChimpDelivery/ChimpDelivery-JenkinsDSL/blob/master/files/Jenkinsfile)
  - Jenkinsfile to handle Unity3D Build/Deliver pipeline.
  - It uses [ChimpDelivery-JenkinsLibrary](https://github.com/ChimpDelivery/ChimpDelivery-JenkinsLibrary) as a shared library.
