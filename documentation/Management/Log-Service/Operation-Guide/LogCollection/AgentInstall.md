## Installation of Business Application Log Collection Plug-in 

The corresponding log subject and collection configuration of log set have been created on the Console. Select the Virtual Machines that need to collect business application logs (support Linux machines only), and log in to the Virtual Machines.

Overall process:

- Create a log set and log subject in the Console, and add the collection configuration.
- Create a sub-user and authorize to get AKSK.
- Log in Virtual Machines and install agent.

### I. Authorization steps

1. Create a sub-user

2. Create policy

- Log in the Console Management -> Identity and Access Management page to choose policy management.
- Click **Create Policy**, enter policy name and description, and select the resource type of **Log Service**. Access Permissions are allowed by default, and the operation permission can be select as **describeInstanceCollectConfs** and **describeLogdCA**. Regarding to resources, you can select all or designated resources according to your own needs.
- Click **Create Policy** to complete policy creation.

3. Grant above-mentioned policy to sub-user.

### II. Agent Installation Steps

1. Configure credential files     
- Create ~/.jdcloud/logs_credentials.yml file     
- Edit and save logs_credentials.yml file. The file content is:        

```
ak: xxxxxxx (Fill in sub-user AccessKeyID)
sk: xxxxxxx(Fill in sub-user AccessKeySecret)   
```
**Note:**

- It is recommended to use the sub-user AKSK, so as to control the permission scope.
- Method to obtain AKSK: Click the user management in Identity and Access Management, select a sub-user, enter the user details, and click security credential to see the AKSK of the sub-user. (If no AKSK is available, click to create AccessKey)
- ak (there must be spaces between key-value pairs). Otherwise ak will be read. For example: ak:(space)xxxxxx


2. Replicate installation commands to Virtual Machines.  

`curl -fsSL https://deploy-code-vpc.jdcloud.com/dl-ifrit-agents/install | bash -s jdcloud-logs-agent`

3. Press the Enter key to execute installation operation.   
 	
 ![image](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogCollection/logs-agent-install-1.png)
  
4. Wait for 1 to 3 minutes, and execute the following command to verify whether agent has been installed successfully.

`ps -ef | grep jdcloud-logs-agent`

5. The existence of the process indicates successful installation. The examples are as follows: 

 ![image](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogCollection/logs-agent-install-2.png)

**Note: If installation fails, execute the installation command again after 1 to 3 minutes. Please contact the customer service if the installation failed for several times.**
