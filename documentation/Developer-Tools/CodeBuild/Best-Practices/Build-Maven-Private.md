# Use JD Cloud artifact repository in Maven engineering

This document provides examples of using JD Cloud artifact repository on CodeBuild.


The basic operation process is as follows:

1) Create source code in JD Cloud - CodeCommit

2) Create private user repository in JD Cloud - Artifact Repository

3) Upload private dependency package in JD Cloud - Artifact Repository

4) Download settings file of private repository in JD Cloud - Artifact Repository, and upload the same to the example code repository to modify settings file specified by building script

5) Build the example code in JD Cloud - CodeBuild and download private dependency package in the process of building


### Upload the code to CodeCommit

Service Address of JD Cloud CodeCommit is: https://code.jdcloud.com/

### Upload private dependency package in artifact to obtain private repository configuration

**I. Upload private dependency package in private repository**
 1. Refer to Artifact Repository, [Management of Artifact - Upload Artifact](https://docs.jdcloud.com/en/artifacts/manage-artifacts)

**II. Download settings file in User Guide**
 1. Refer to Artifact Repository, [Private User Repository - User Guide](https://docs.jdcloud.com/en/artifacts/private)

### Modify code

1) Upload settings.xml to codebase root directory

2) Modify building script and build by using the settings.xml in the repository

### Create compilation task in the CodeBuild

Click **Create Task** on the CodeBuild Task List Page.

Specific information is as below:

   ![](/image/codebuild/best-maven-jobconf.png)
   
Add a specified settings.xml command in building command:

   ![](/image/codebuild/best-maven-settings.png)

Add dependence on private repository package in pom.xml file

   ![](/image/codebuild/best-deps.png)

Save and run the setting. Compile and build tasks.

 
### View Building Logs

The latest building logs can be viewed in the Task Details Page or the building history can be viewed in the following building history page.
It can be seen that the private dependency package has been downloaded in private repository.

   ![](/image/codebuild/best-maven-dl.png)

