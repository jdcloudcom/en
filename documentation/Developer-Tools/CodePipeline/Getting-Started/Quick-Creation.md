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
  
   * Operation Name: the name of operation which shall be unique within a CodePipeline. It cannot be null; it only supports Chinese characters, numbers, capital and lower-case letters, English underline "_" and line-through "-", with at most 32 characters
   * Operation Type: Source Code
   * Code source: Support CodeCommit, GitHub.
   * Codebase: Select a codebase
   * Branch: Select branch
   * Webhook Trigger: Select **Yes** to automatically trigger the CodePipeline when changes occur in the source code


   3) Set Construction Stage
  
   In the construction phase, add one (or more) build type actions.
   
   ![](/image/codepipeline/cre-build-stage.png)
      
   ![](/image/codepipeline/cre-build-action.png)
 
   * Operation Name: the name of operation which shall be unique within a CodePipeline. It cannot be null; it only supports Chinese characters, numbers, capital and lower-case letters, English underline "_" and line-through "-", with at most 32 characters
   * Operation Type: Construction
   * Operation Provider: CodeBuild
   * Code Source: The source code compiled by this construction task, select the source code action defined in the CodePipeline.
   * Application: Select the compilation task. Based on the code source selected above, the compiled application in the CodeBuild will be filtered.
   * Manual Confirmation: If manual confirmation is selected, the action will be executed after the user clicks **Confirm**. It is automatically executed by default.

   4) Set Deployment Stage
  
   In the deployment phase, add one (or more) deployment type actions.
   
  ![](/image/codepipeline/cre-deploy-stage.png) 
     
  ![](/image/codepipeline/cre-deploy-action.png)
  
  ![](/image/codepipeline/cre-deploy-action2.png)

 

 
   * Operation Name: the name of operation which shall be unique within a CodePipeline. It cannot be null; it only supports Chinese characters, numbers, capital and lower-case letters, English underline "_" and line-through "-", with at most 32 characters
   * Operation Type: Deployment
   * Operation Provider: JCS for Kubernetes
   * Cluster: The corresponding project in JCS for Kubernetes. Select the JCS for Kubernetes that the user has created in the JD Cloud Console. Or go to the Console to create the JCS for Kubernetes and return to this task
   * Manual Confirmation: If manual confirmation is selected, the action will be executed after the user clicks **Confirm**. It is automatically executed by default.

4. The just created records can be view on the CodePipeline page after creation.

