
## Build and deploy to CodeDeploy

The document takes an example of building java project and deploying it to JD Cloud - CodeDeploy to describe how to use CodePipeline.

The basic operation process is as follows:

1) Create source code in JD Cloud - CodeCommit

2) Compile and build the example source code in JD Cloud - CodeBuild to produce application package

3) Create deployment application and deployment group in JD Cloud - CodeDeploy

Please ensure that CodeBuild task, CodeDeploy application and CodePipeline are in the same region.


### Clone example codes to the CodeCommit

The code example address: https://code.jdcloud.com/JDCloud-Codebuild/hello-java

Please clone the example code to the CodeCommit and the address of the CodeCommit is https://code.jdcloud.com/


### Create compilation task in the CodeBuild

Create a new task in the CodeBuild, with specific information as below:

-  Application Name: ci-demo
-  Image Compilation: maven/maven3.6.0-jdk13
-  Code Source: JD Cloud-CodeCommit
-  Codebase: Select an example code, JDCloud-Codebuild/hello-java
-  Branch: master
-  Building Command: Use jdcloud-build.yml under the source code root directory
-  Building Type: Application Package
-  Bucket: Please select the existing Object Storage Service bucket
-  Folder Name: Optional, can be null
-  Advanced Configuration: Keep the default option

Save, to complete the preparation of CodeBuild task.

### Create application and deployment group in CodeDeploy

Before using CodeDeploy, please ensure there are Virtual Machines successfully installed and deployed[Agent](../../../Developer-Tools/CodeDeploy/Operation-Guide/Install-Agent.md)


For successful access to deployment application, you’re suggested to [Associate EIP](../../../Elastic-Compute/Virtual-Machines/Operation-Guide/Network/Associate-Elastic-IP.md) for Virtual Machines.


On the **New Application** page, first fill in the application information.

Application Name: cd-demo

   ![](/image/codepipeline/cre-deploy.PNG)

Click **Create**.

Next, create deployment groups in application,

There are options as below:

- Name of Deployment Group: Please fill in the deployment group name, cd-demo-group
- Deployment Type: Please select **Rolling Deployment
- Deployment Target: Click **Select** and select Virtual Machines in the popup. Three filter conditions for selection are supported: Availability Group, Tag and IP. Please select the Virtual Machines created in the previous step here.
- Use Load Balancer or not: No
- Advanced Option: Keep the default option. See Operation Guide for details


    ![](/image/codepipeline/cd-demo-group.PNG)
     

After filling in the basic information of deployment group, please click **Create** to complete deployment application preparation.

### Create CodePipeline

The detailed operation steps are as follows:

1. Click **Create** and select **Quickly Create**. Configure the name of CodePipeline, e.g. pipeline-demo

     ![](/image/codepipeline/pipeline-demo.PNG)

2. Configure Source Code

  The default stage name is source code; add the operation of source code. Select JD Cloud - CodeCommit in atomic operation, and select example code JDCloud-Codebuild/hello-java.
  
   ![](/image/codepipeline/source-best2.PNG)


3. Configure Building.

  The default stage name is building stage; add building operation.   
  
   ![](/image/codepipeline/build-best2.PNG)

-  Operation Name: Building Operation
-  Operation Type: Building
-  Operation Provider: CodeBuild
-  Code Source: Build source code of this task, and select the source code operation created in the previous step.
-  Task: Select the compilation task created in CodeBuild, e.g. ci-demo
-  Manual Confirmation: If manual confirmation is selected, the operation will be executed after the user clicks **Confirm**.
     
   
 
4. Configure Deployment.
 
 The default stage name is deployment stage; add deployment operation. 
 
 
   ![](/image/codepipeline/deploy-best2.PNG)
        
      
   ![](/image/codepipeline/deploy-best2.1.PNG)
       
      
-  Operation Name: Deployment Operation
-  Operation Type: Deployment
-  Operation Provider: CodeDeploy
-  Deployment Source: Deployment tasks. It currently only supports the CodeBuild tasks with the building type of application package.
-  Deployment Application: Select deployment tasks created in CodeDeploy, e.g. cd-demo
-  Deployment Group: Select deployment group created in CodeDeploy
-  Deployment Command: Provide deployment commands, select Enter Deployment Operating Command, and paste the following command in yaml:

 ```
files:
  - source: /
    destination: /home/demo
hooks:
  ApplicationStart:
    - command: /home/demo/bin/start.sh
      timeout: 10
      runas: root
permisssions: []
env: {}
 ```

-  Manual Confirmation: If manual confirmation is selected, the operation will be executed after the user clicks **Confirm**.
 
 
Save and release. 

Effects of successfully released applications with Public IP: 8080 access are as follows:

 ![](/image/codepipeline/success.PNG)

