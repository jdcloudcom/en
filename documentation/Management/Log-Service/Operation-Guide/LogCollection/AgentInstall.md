## Installation of Business Application Log Collection Plug-in 

The corresponding log subject and collection configuration of log set have been created on the Console. Select the Virtual Machines that need to collect business application logs (support Linux machines only), and log in to the Virtual Machines.

Overall process:

- Create a log set and log subject in the Console, and add the collection configuration. [Add Business Application Log Collection Configuration](https://docs.jdcloud.com/en/log-service/customlog)
- Log in Virtual Machines and install agent.

### Agent Installation Steps

1. Replicate installation commands to Virtual Machines.  

`curl -fsSL https://deploy-code-vpc.jdcloud.com/dl-ifrit-agents/install | bash -s jdcloud-logs-agent`

2. Press the Enter key to execute installation operation.   
 	
 ![image](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogCollection/logs-agent-install-1.png)
  
3. Wait for 1 to 3 minutes, and execute the following command to verify whether agent has been installed successfully.

`ps -ef | grep jdcloud-logs-agent`

4. The existence of the process indicates successful installation. The examples are as follows: 

 ![image](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogCollection/logs-agent-install-2.png)

**Note: If installation fails, execute the installation command again after 1 to 3 minutes. Please contact the customer service if the installation failed for several times.**
