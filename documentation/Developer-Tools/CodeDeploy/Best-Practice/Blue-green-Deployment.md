
## Blue and Green Deployment

### Overview

Basic services are listed by taking example of producing a program with source codes in the CodeCommit after using the CodeBuild and then adding the same into the Virtual Machines by using the blue and green deployment of the CodeDeploy, to provide quick start for the user.

The basic operation process is as follows:

1) Compile and construct the sample source code in the CodeBuild to produce the program package

2) Please deploy the program package to the Virtual Machines with the CodeDeploy

3) Access the sample code with the Public IP: Ports of the Load Balancer

Example Precondition:

- Existing Virtual Machines
- Existing Load Balancer Instances and Listener
- Sample codes have been cloned in the CodeCommit
- Existing Object Storage Service Bucket


### Create Virtual Machines

In regions: Create 2 Virtual Machines in the region cn-north-1, with specific information as follows:

- Creation method: Create customized instance
- Image: Official CentOS CentOS 7.4 64-bit
- Specification: General 1c4g
- Storage: Default Option
- Network: Select the existed VPC and subnet and select the default security group to allow all traffic
- Basic Information: Fill in machine name and password. The machine name to be filled in here shall be: codedeploy-demo03

Next, install Agent and execute the same by the root user upon logging in the Virtual Machines

```
curl -fsSL http://deploy-code-vpc.jdcloud.com/dl-ifrit-agents/install_deploy | bash
```

The execution results are as below:

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting20.png)


### Create Load Balancer Instances and Listener

Create Load Balancer Instances in the region cn-north-1, with specific information as follows:

- Region: cn-north-1
- Availability Zone: Availability Zone A
- Virtual Private Cloud: Please select the Virtual Private Cloud consistent with the Virtual Machines
- Name: codedeploy-lb-demo03

Next, create a listener in this Load Balancer Instance and click **Add Listener** to enter the listener creation page.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/practice11.png)


Specific information is as shown below:

- Listening protocol [port]: Http 80
- Idle link timeout: 60
- Default Backend Service: Create a new backend service
- Backend Service Name: codedeploy-backend-demo03
- Port: 9011
- Selection of Server Group: Add no server now


### Clone sample codes to the CodeCommit

The address of the sample code: https://code.jdcloud.com/devops-demo/java-demo.git

Please clone the sample code to the CodeCommit and the address of the CodeCommit is https://code.jdcloud.com/


### Perform compilation and construction in the CodeBuild

Create a new task in the CodeBuild, with specific information as below:

-  Task Name: codedeploy-ci-demo03
-  Image Compilation: maven/maven3.6.0-jdk8
-  Source Provider: JD Cloud-CodeCommit
-  Repository Address: Please fill in the address based on the real conditions, for example devops-demo/java-demo
-  Code Branch: devops-demo
-  Creation Specification: Insert construction command
-  Construction Command:
```
---
# Set the required environment variables, it is not required to write if not necessary
#envs:
#  - name: 'name1' refers to the environment variable name here
#    value: 'value1' refers to the environment variable value here
#  - name: 'name2' sets multiple values in the listing manner
#    value: 'value2'

# Set compiled commands in the same setting manner as the environmental variables
# For example:
#cmds: 
#  - name: 'do make'  Step Name
#    cmd: 'make' True command, if it’s not in the PATH, please write the full path
#  - name: 'do install'
#    cmd: 'make install'
cmds:
  - name: 'chmod'
    cmd: 'chmod a+x ./build.sh'
  - name: 'demo'
    cmd: './build.sh'

# Package-extracting path is required
out_dir: 'output'
```
-  Construction Type: Application Package
-  Bucket: Please select the existing Object Storage Service bucket

So far, the example code has been successfully complied and uploaded in the Object Storage Service bucket.

Next, please deploy the program package to the Virtual Machines with the CodeDeploy.


### Create application and deployment group

On the **Deployment Application** page, after appointing the region as the same as that of Virtual Machines and Object Storage Service, click **Create Application**,

Use JD Distributed Service Framework: Please select **No** by default

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-1%EF%BC%88Ch%EF%BC%89.png)

redirect to the **New Application** page.

On the **New Application** page, first fill in the application information. Application name: codedeploy-app-demo03

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-2%EF%BC%88Ch%EF%BC%89.png)

Click **Create**.

Next, create deployment groups in application.

There are options as below:

- Name of Deployment Group: Please fill in the deployment group name, group1
- Deployment Type: Please select **Blue and Green Deployment
- Deployment Target: Click **Select** and select Virtual Machines in the popup. Three filter conditions for selection are supported: Availability Group, Tag and IP. Please select the Virtual Machines created in the previous step here, namely the machine in the name of codedeploy-demo031 is added to the blue group, while the machine in the name of codedeploy-demo032 is added to the green group
- Use of Load Balancer: Yes
- Load Balancer Instance: Please select the existing Load Balancer Instances in cn-north-1, codedeploy-lb-demo03
- Backend service of Load Balancer: Please select the backend service under the Load Balancer Instance specified in the last entry, codedeploy-backend-demo03
- Advanced Option: Keep the default option. See Operation Guide for details

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-3%EF%BC%88Ch%EF%BC%89.png)

After filling in the basic information of the deployment group, please click **Create** to create the deployment group in the application.

It will redirect to the **Application Details** page after the creation succeeds.

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-4%EF%BC%88Ch%EF%BC%89.png)

### Create Deployment

On the **Application Details** page, you can view the deployment group created in the previous step through the **Deployment Group** page.

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-4%EF%BC%88Ch%EF%BC%89.png)

For a single deployment group, its supported operations include Initiate Deployment, Deployment History, Edit and Delete.

Click **Initiate Deployment** and access **Create Deployment** page.

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-5%EF%BC%88Ch%EF%BC%89.png)

There are options as below:

- Deployment Description: Optional, it is the description information for this deployment
- Deployment Source: Multiple deployment sources are supported. Please select **CodeBuild**
- Task Name of CodeBuild: Please fill in codedeploy-ci-demo03
- Construction SN of CodeBuild: Please fill in the construction SN compiled in the previous step
- File Type: Please select .tar.gz
- Deployment Operating Command: Please select **Enter Deployment Operating Command** and use the **Form Completion** function to fill in specific operating commands. The operations are as below:
```
Deployment Path: Source Directory or File: /       Target Directory: /home
Stop Script: /home/bin/stop.sh     
Start Script: /home/bin/start.sh
Check Script:
Script executing account:  root       
Time-out period of script (s): 100
```

Note: First deployment does not require stoping script.

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-6%EF%BC%88Ch%EF%BC%89.png)

After filling in the deployment task information, please click **Initiate Deployment** to trigger deployment operations.

It will redirect to **Deployment Details** page.

### View Deployment Details

On the **Deployment Details** page, you can view the progress of this deployment. In the process of deployment, **Cancel** is supported.

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Pra-7%EF%BC%88Ch%EF%BC%89.png)

Click **View Configuration** to view the detailed configuration information of this deployment task.

Click **View Log** in the specified instance to view the deployment log.


### Verification Result

Public IP of Load Balancer: 80

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/practice16.png)
