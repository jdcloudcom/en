## Installation of Business Application Log Collection Plug-in 

Select the Virtual Machines that need to collect business application logs (support Linux machines only), and log in to the Virtual Machines.
1. Configure credential files     
- Create ~/.jdcloud/logs_credentials.yml file     
- Edit and save logs_credentials.yml file. The file content is:        
ak: xxxxxxx (fill in YourAccessKeyID)       sk: xxxxxxx (fill in YourAccessKeySecret)         
**Note: ak (there must be spaces between key-value pairs), otherwise ak will be read. For example: ak:(space)xxxxxx**

2. Replicate installation commands to Virtual Machines.  

`curl -fsSL https://deploy-code-vpc.jdcloud.com/dl-ifrit-agents/install | bash -s jdcloud-logs-agent`

3. Press the Enter key to execute installation operation.   
 	
 ![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogCollection/logs-agent-install-1.png)
  
4. Wait for 1 to 3 minutes, and execute the following command to verify whether agent has been installed successfully.

`ps -ef | grep jdcloud-logs-agent`

5. The existence of the process indicates successful installation. The examples are as follows: 

 ![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogCollection/logs-agent-install-2.png)

**Note: If installation fails, execute the installation command again after 1 to 3 minutes. Please contact the customer service if the installation failed for several times.**
