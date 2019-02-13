# Function
## Implement the automation of release process
### End-to-end CodePipeline
Implement complete end-to-end CodePipeline function in terms of code submission, construction, test and deployment. Automatically execute CodePipeline by means of Webhook trigger or incident list. In the meanwhile, CodePipeline also provides manual control capability, which supports users to test or deploy CodePipeline to different environments manually by adding the method of manual approval during the execution process.
### Customized CodePipeline
It supports to configure CodePipeline flexibly according to different emphases of users in different product stages. Tasks in the same stage can be set to execute in serial or parallel for meeting multiple customer scenarios.
## Connect normal tools of users
### Multiple Source Code Providers
Support the integration multiple code management platform, which can implement seamless integration with Git, GitHub, JD Cloud CodeCommit and other platforms and obtain source codes.
### Continuous Integration
Support the construction of Java, Golang, NodeJs, Python and other compilation languages and unit test. Support Docker Image compilation, which provides compilation and construction and security check by means of resource separation at container level.
### Continuous Deployment
Deep integrated with JCS for Kubernetes Service to support life cycle management of containerization application, implement the automation of whole application release process under container environment.
## View execution records
### View execution progress of process
Support to view the execution status of CodePipeline, detailed information of access operation, operation records, etc.
### View detailed historical information of the pipeline
Support to view detailed execution information of CodePipeline, including start time and end time, execution duration and execution ID.
