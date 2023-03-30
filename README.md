# TalusWebBackend-JenkinsDSL

:bookmark: All required pipelines by Jenkins Controller(Master). Includes DSL scripts to create "Organization Folder" in Jenkins with connected "GitHub Organization" and "Unity3D" Build/Deliver pipeline scripts.

- :seedling: [Pipeline: Seed](https://github.com/TalusStudio/TalusWebBackend-JenkinsDSL/blob/master/Jenkinsfile)
  - Jenkinsfile that uses DSL scripts to create "Organization Folder" in Jenkins. 
  - WARNING! Job name must be synced with [Jenkins Configs in TalusWebBackend](https://github.com/TalusStudio/TalusWebBackend/blob/master/config/jenkins.php).
- :seedling: [Pipeline: Unity3D Build&Deliver](https://github.com/TalusStudio/TalusWebBackend-JenkinsDSL/blob/master/files/Jenkinsfile)
  - Jenkinsfile to handle Unity3D Build/Deliver pipeline.
  - It uses [TalusWebBackend-JenkinsLibrary](https://github.com/TalusStudio/TalusWebBackend-JenkinsLibrary) as a shared library.
