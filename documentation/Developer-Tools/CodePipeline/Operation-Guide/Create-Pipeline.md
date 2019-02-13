# Create CodePipeline

When creating CodePipeline, it must include one source stage and one or two next stages:

* Construction Phase.

* Deployment Phase.

JD Cloud provide users with two methods for creating CodePipeline, including:

* [Quick Creation](../Getting-Started/Quick-Creation.md)

* [Customized Creation](../Getting-Started/Create-Customized-Instance.md)

Of which, when using quick creation, CodePipeline will create three stages with the stage names of source, build and deploy which you can add more operations.

## Operation Steps
1. Create CodePipeline
If you need to conduct quick creation based on recommended templates, you select **Quickly Create** in the creation method. You can also create CodePipeline according to your business situation with the method of customized creation.

	CodePipeline name: you need set name for created CodePipeline, which the name cannot be null, only supports Chinese characters, numbers, capital and lower-case letters, English underline "_" and line-through "-", with at most 32 characters.

2. Create source stage
When conducting quick creation, the name of the stage is source by default, which supports users to modify the stage name. Adding five atomic operations is supported under one stage, which atomic operations are executed in parallel, wherein one fails will lead to the failure of the stage.


	The operation elements of source code in the template are as follows:

	- Operation Name: Source Code Operation
	- Operation Type: Source Code
	- Operation Provider: GitHub
	- Repository: repo Address
	- Branch: Compilation Branches
	- Change Detection Operation: Triggering Method
	- Manual Confirmation: the execution method of the operation, which will automatically circulated by default
	

3. Create Compilation Stage
When conducting quick creation, the name of the stage is built by default, which supports users to modify the stage name.

	The construction elements in the template are as follows:
	
	- Operation Name: Construction Operation
	- Operation Type: Construction
	- Operation Provider: CodeBuild
	- Entering Operation: operations need to be compiled, i.e., the source code operations named in the previous step
	- Project: Projects Created in CodeBuild
	- Manual Confirmation: the execution method of the operation, which will automatically circulated by default

4. Create Deployment Stage
When conducting quick creation, the name of the stage is deploy by default, which supports users to modify the stage name.

	The construction elements in the template are as follows:
	
	- Operation Name: Deployment Operation
	- Operation Type: Deployment
	- Operation Provider: JCS for Kubernetes
	- Project: Cluster Projects Created in JCS for Kubernetes
	- Upload yaml: upload cluster deployment configuration files
	- Image: list images used in the deployment file. If you want to use images of construction output as replacement, please click **Replace** and select corresponding operations to construction.
	- Manual Confirmation: the execution method of the operation, which will automatically circulated by default
	
  Save to complete creation according to the templates.

You may add more stages by clicking **+** in the navigation. You can also create CodePipeline meeting your own business logic by means of customized creation.
