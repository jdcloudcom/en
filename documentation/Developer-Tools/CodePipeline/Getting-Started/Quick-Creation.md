# Quick Creation
The user can quickly create Code-Construction-Deployment according to the template by Quick Creation function.

Operation Steps

1. Access [CodePipeline Console](https://codepipeline-console.jdcloud.com/pipeline/list) or [JD Cloud Console](https://console.jdcloud.com), click **Developer Tools**-**CodePipeline** at the left navigation bar to enter CodePipeline List page.

2. Click **Quickly Create** on "CodePipeline List" page to enter "Quickly Create" page.
 ![](/image/codepipeline/Quick-Creation.png) 

3. The default CodePipeline includes source code, construction and deployment stages 

   1) Configure CodePipeline
  
   CodePipeline name: you need set name for created CodePipeline, which the name cannot be null, only supports Chinese characters, numbers, capital and lower-case letters, English underline "_" and line-through "-", with at most 32 characters

   2) Set Source Code
  
   In the stage of source code, it accesses operations of source code type by default. It needs at least one operation under one stage.
  ![](/image/codepipeline/cre-source-stage.png) 
 
   * Operation Name: the name of operation which shall be unique within a CodePipeline. It cannot be null; it only supports Chinese characters, numbers, capital and lower-case letters, English underline "_" and line-through "-", with at most 32 characters
   * Operation Type: Source Code
   * Operation provider: support CodeCommit, GitHub and other Git repositories.
   * Repository: code repository name
   * Branch: designated compilation branch
   * Manual Confirmation: the execution method of the operation, which will automatically circulated by default

   3) Set Construction Stage
  
   In the construction stage, it accesses operations of construction type by default.
     
 ![](/image/codepipeline/cre-build-stage.png)
    
 ![](/image/codepipeline/cre-build-action.png)
 
   * Operation Name: the name of operation which shall be unique within a CodePipeline. It cannot be null; it only supports Chinese characters, numbers, capital and lower-case letters, English underline "_" and line-through "-", with at most 32 characters
   * Operation Type: Construction
   * Operation Provider: CodeBuild
   * Entering project: constructed source code is the entering project of the operation. The content of drop down is the operation that takes the type created in the CodePipeline as source code.
   * Project: construct corresponding project, i.e., the project that has been created in CodeBuild. If there are no projects, you can quickly create a compilation project through **Create New Project**.
   * Manual confirmation: the execution method of the operation, which will be automatically circulated by default. After manual confirmation, the process will not stop until it executes the operation. It cannot continue to execute the operation unless the user clicks **OK** on the page.

   4) Set Deployment Stage
  
   In the Deployment stage, it accesses operations of deployment type by default.
   
  ![](/image/codepipeline/cre-deploy-stage.png)
  
  ![](/image/codepipeline/cre-deploy-action.png)

 

 
   * Operation Name: the name of operation which shall be unique within a CodePipeline. It cannot be null; it only supports Chinese characters, numbers, capital and lower-case letters, English underline "_" and line-through "-", with at most 32 characters
   * Operation Type: Deployment
   * Operation Provider: JCS for Kubernetes
   * Entering project: the deployed source code or compiled output is the entering project of the operation. The content of drop down is the operation that takes the type created in the CodePipeline as source code and construction.
   * Project: the corresponding project in Kubernetes project, i.e., the project has been created in JCS for Kubernetes. If there are no projects, you can quickly create a compilation project through **Create New Project**.
   * Manual confirmation: the execution method of the operation, which will be automatically circulated by default. After manual confirmation, the process will not stop until it executes the operation. It cannot continue to execute the operation unless the user clicks **OK** on the page.

4. 	The just created records can be view on the CodePipeline page after creation.

