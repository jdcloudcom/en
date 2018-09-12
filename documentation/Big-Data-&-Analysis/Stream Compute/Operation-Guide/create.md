# Operating Instruction<br>
## Create Application<br>
1. **Preparation Work**<br>
Before using the streaming data bus service, you first need to register for a JD Cloud account. <br><br>
2.	**Create Application**<br>
Step 1: Login to the WEB console of stream computing, enter the “Application Management” page of the stream computing, and click “Create”. <br>
![sc-013](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-013.png?raw=true)<br><br>
Enter data information the create application interface, then click OK to complete the application creation. <br>
![sc-014](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-014.png?raw=true)<br>
Application Name: <br>
Create an app name that is easy for you to remember<br><br>
Task Type: <br>
Select the underlying computing engine to use, currently providing spark streaming-2.1.0, followed by storm, and flink. <br><br>
Streaming Computing Unit <br>
Streaming Computing Unit It indicates the computing resources consumed by the execution of the operation, a streaming computing unit containing 1 CPU and 4GB of memory<br><br>
Pay attention that the streaming computing unit here is the upper limit of the computing unit which you can use later. <br>
For example, if you select 20 streaming computing units when creating the application and if you create 4 job tasks after entering the application, you can allocate computing resources independently for each job task, however the total computing resources allocated to the 4 job tasks shall not exceed the streaming computing units defined here