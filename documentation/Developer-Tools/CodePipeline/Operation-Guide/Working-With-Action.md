# Use Operations

Operation is an atomic action of CodePipeline in a certain stage and a task executed for the project at this stage. Stages in CodePipeline are executed in parallel while operations in each stage are executed in serial.
The CodePipeline supports four operation types:
* Source code: support git, GitHub private/public repository, JD Cloud CodeCommit
* Construction: support JD Cloud CodeBuild
* Test: support JD Cloud CodeBuild
* Deployment: support the deployment of JCS for Kubernetes of JD Cloud


## Common Operation
* [Manual Confirmation](Check-Action.md)
* [Add Operations](Edit-Pipeline.md)
* [Edit Operations](Edit-Pipeline.md)
* [Delete Operations](Edit-Pipeline.md)
