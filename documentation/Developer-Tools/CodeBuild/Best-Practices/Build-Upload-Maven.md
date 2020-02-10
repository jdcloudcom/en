# Use maven to Build and Upload an Artifact to JD Cloud Artifact Repository

This document provides examples of uploading a built artifact to JD Cloud artifact repository on CodeBuild.


The basic operation process is as follows:

1) Create source code in JD Cloud - CodeCommit

2) Create private user repository in JD Cloud - Artifact Repository

3) Configure pom.xml of codebase in JD Cloud

4) Download settings file of private repository in JD Cloud - Artifact Repository, and upload the same to the example code repository to modify settings file specified by building script

5) Build the example code in JD Cloud - CodeBuild and download private dependency package in the process of building


### Upload the code to CodeCommit

Service Address of JD Cloud CodeCommit is: https://code.jdcloud.com/

### Get private repository configuration

**I. Download settings file in User Guide**
 1. Refer to Artifact Repository, [Private User Repository - User Guide](https://docs.jdcloud.com/en/artifacts/private)

### Modify code

1) Upload settings.xml to codebase root directory

2) Modify building script and build by using the settings.xml in the repository

### Create compilation task in the CodeBuild

Click **Create Task** on the CodeBuild Task List Page.

Specific information is as below:

   ![](/image/codebuild/best-maven-jobconf.png)
   
Add a specified settings.xml command in building command:

   ![](/image/codebuild/deploy-settings.png)

Add artifact upload configuration in pom.xml file

   ![](/image/codebuild/upload-artifacts.png)

Save and run the setting. Compile and build tasks.

 
### View Building Logs

You can view the latest building logs in the Task Details page, and the previous building history in the Building History page.
You can see that the output is uploaded according to the coordinate designated by the pom file.

   ![](/image/codebuild/upload-artifacts-log.png)

You can see the uploaded artifact in private user repository
   
   ![](/image/codebuild/private-browse.png)
