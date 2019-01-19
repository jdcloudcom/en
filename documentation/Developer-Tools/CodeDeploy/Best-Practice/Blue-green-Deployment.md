
## Blue and Green Deployment

### Overview

Basic services are listed by taking example of producing a program with source codes in the CodeCommit after using the CodeBuild and then adding the same into the Virtual Machines by using the blue and green deployment of the CodeDeploy, to provide quick start for the user.

The basic operation process is as follows:

1) Compile and construct the sample source code in the CodeBuild to produce the program package

2) Please deploy the program package to the Virtual Machines with the CodeDeploy

3) Access the sample code with the Public IP and ports of the Load Balancer

Example Precondition:

- Existing Virtual Machines
- Existing Load Balancer Instances and Listener
- Sample codes have been cloned in the CodeCommit


### Create Virtual Machines

Create 2 Virtual Machines in the region cn-north-1, with specific information as follows:

- Creation method: Create customized instance
- Image: Official CentOS CentOS 7.4 64-bit
- Specification: General 1c4g
- Storage: Default Option
- Network: Select the existed VPC and subnet and select the default security group to allow all traffic
- Basic Information: Fill in machine name and password. The machine name to be filled in here shall be: codedeploy-demo03

Next, install Agent and execute the same by the root user upon logging in the Virtual Machines

```
# cn-north-1
wget -c http://devops-hb.oss-internal.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
```

The execution results are as below:

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/practice10.png)


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

The address of the sample code: git@code.jdcloud.com:devops-demo/java-demo.git

Please clone the sample code to the CodeCommit and the address of the CodeCommit is https://code.jdcloud.com/


### Perform compilation and construction in the CodeBuild

Create a new project in the CodeBuild, with specific information as below:

-  Project Name: codedeploy-ci-demo03
-  Image Compilation: maven/Maven:3.5.0,Jdk:8u20
-  Source Provider: CodeCommit
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

So far, the sample code has been successfully complied and uploaded in the space of cn-north-1 in the Object Storage Service.

Next, please deploy the program package to the Virtual Machines with the CodeDeploy.


### Create application and deployment group

On the **Deployment Application** page, after appointing the region as the same as that of Virtual Machines and Object Storage Service, click **Create Application**,

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting5.png)

redirect to the **New Application** page.

On the **New Application** page, first fill in the application information. Application name: codedeploy-app-demo03

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/practice12.png)

Click **Create

Next, create deployment groups in application.

There are options as below:

- Name of Deployment Group: Please fill in the deployment group name, codedeploy-group-demo03
- Deployment Type: Please select **Blue and Green Deployment
- Deployment Target: Click **Select** and select Virtual Machines in the popup. Three filter conditions for selection are supported: Availability Group, Tag and IP. Please select the Virtual Machines created in the previous step here, namely the machine in the name of codedeploy-demo031 is added to the blue group, while the machine in the name of codedeploy-demo032 is added to the green group
- Use of Load Balancer: Yes
- Load Balancer Instance: Please select the existing Load Balancer Instances in cn-north-1, codedeploy-lb-demo03
- Backend service of Load Balancer: Please select the backend service under the Load Balancer Instance specified in the last entry, codedeploy-backend-demo03
- Advanced Option: Keep the default option. See Operation Guide for details

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/practice13.png)

After filling in the basic information of the deployment group, please click **Create** to create the deployment group in the application.

It will redirect to the **Application** page after the creation succeeds.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/practice14.png)

### Create Deployment

On the **Application** page, you can view the deployment group created in the previous step through the **Deployment Group** page.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/practice14.png)

For a single deployment group, its supported operations include Initiate Deployment, Deployment History, Edit and Delete.

Click **Deployment**  and access **Create Deployment** page, and there are options as below:

- Deployment Description: Optional, it is the description information for this deployment
- Deployment Source: Multiple deployment sources are supported. Please select **My CodeBuild
- Project Name of CodeBuild: Please fill in codedeploy-ci-demo03
- Construction SN of CodeBuild: Please fill in the construction SN compiled in the previous step
- File Type: Please select .tar.gz
- Deployment Operating Command: Please select **Enter Deployment Operating Command** and use the **Form Completion** function to fill in specific operating commands. The operations are as below:
```
Deployment Path: Source File/Directory:/       Target Directory:/home
Script executing account:  root       
Time-out period of script (s): 100
Path to stop script: /home/bin/stop.sh
Path to start script: /home/bin/start.sh
```

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/practice15.png)

After filling in the deployment task information, please click **Deployment** to trigger deployment operations.

It will redirect to **Deployment Details** page.

### View Deployment Details

On the **Deployment Details** page, you can view the progress of this deployment. In the process of deployment, **Cancel** is supported.

Click **View Configuration** to view the detailed configuration information of this deployment task.

Click **View Log** in the specified instance to view the deployment log.


### Verification Result

Public IP of Load Balancer: 80

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/practice16.png)
