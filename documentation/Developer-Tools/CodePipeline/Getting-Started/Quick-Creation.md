# Quick Creation
The user can create a CodePipeline containing Source Code-Construction-Deployment phases according to the template by Quick Creation function.

Operation Steps

1. Access [CodePipeline Console](https://codepipeline-console.jdcloud.com/pipeline/list) or [JD Cloud Console](https://console.jdcloud.com), click **Developer Tools**-**CodePipeline** at the left navigation bar to enter CodePipeline List page.

2. Click **Quickly Create** on "CodePipeline List" page to enter "Quickly Create" page.
 ![](/image/codepipeline/Quick-Creation.png) 

3. The default CodePipeline template contains the source code, construction and deployment phases 

   1) Configure CodePipeline
  
   CodePipeline name: you need set name for created CodePipeline, which the name cannot be null, only supports Chinese characters, numbers, capital and lower-case letters, English underline "_" and line-through "-", with at most 32 characters

   2) Set Source Code
  
   In the source code phase, add one (or more) source code type actions. There is at least one action task in one phase.
   
   ![](/image/codepipeline/cre-source-stage.png)
   
   ![](/image/codepipeline/cre-source-stage2.png) 
  
   * Operation Type: Source Code
   * Operation name: Generate a default name according to the operation type. We recommend users to modify it by themselves in order for a better identification degree when it is associated in subsequent operations.
   * Code source: Support CodeCommit, GitHub.
   * Codebase: Select a codebase
   * Branch: Select branch
   * Webhook Trigger: Select **Yes** to automatically trigger the CodePipeline when changes occur in the source code


   3) Set Construction Stage
  
   In the construction phase, add one (or more) build type actions.
   
   ![](/image/codepipeline/cre-build-stage.png)
      
   ![](/image/codepipeline/cre-build-action.png)
 
   * Operation Type: Construction
   * Operation name: Generate a default name according to the operation type. We recommend users to modify it by themselves in order for a better identification degree when it is associated in subsequent operations.
   * Operation Provider: CodeBuild
   * Code source: The source code compiled by this construction task shall select the source code added at the previous stage
   * CodeBuild-Task: Please select the CodeBuild task corresponding to 「code source」.
   * Manual Confirmation: If manual confirmation is selected, the action will be executed after the user clicks **Confirm**. It is automatically executed by default.

   4) Set Deployment Stage
  
   In the deployment phase, add one (or more) deployment type actions.
   
   
  ![](/image/codepipeline/cre-deploy-stage.png) 
     
  ![](/image/codepipeline/cre-deploy-action.png)
  
  ![](/image/codepipeline/cre-deploy-action2.png)

  

   * Operation Type: Deployment
   * Operation name: Generate a default name according to the operation type. We recommend users to modify it by themselves in order for a better identification degree when it is associated in subsequent operations.
   * Operation provider: CodeDeploy, JCS for Kubernetes
   * Deployment application: Please select CodeDeploy-application
   * Deployment group: Please select CodeDeploy-deployment group
   * Deployment command: Enter the deployment command or use the jdcloud-codedeploy.yml file under the code root directory
   * Manual Confirmation: If manual confirmation is selected, the action will be executed after the user clicks **Confirm**. It is automatically executed by default.

4. The just created records can be view on the CodePipeline page after creation.

