# Install monitoring plug-ins
Select the Virtual Machines needed to be the detection source (only Linux machines supported), and log in to the Virtual Machines.  
1. Configure credential files  
  - Create ~/.jdcloud/monitor_credentials.yml file  
  - Edit and save monitor_credentials.yml file. The file content is:  
```
ak: xxxxxxx(fill in YourAccessKeyID)   
sk: xxxxxxx(fill in YourAccessKeySecret) 
```
   Note: Content filling in ak\sk must conform to yaml syntax (there must be spaces between key-value pairs), otherwise reading of ak\sk will fail. For example: ak:(space)xxxxxx

2. Replicate installation commands to Virtual Machines.  
```
curl -fsSL http://deploy-code-vpc.jdcloud.com/dl-ifrit-agents/install | bash -s jcmagent
```  

3. Press Enter key to execute installation operation.  
   ![安装Agent](../../../../../image/Cloud-Detection/install-new1.png)  

4. Wait for 1 to 3 minutes, and execute the following command to verify whether jcmagent has been installed successfully.  
  - Verification Command:
```
curl http://localhost:1236/ping
```
  - Return: pong  indicates that jcmagent has been installed successfully.  
  The examples are as follows:  
 ![安装Agent](../../../../../image/Cloud-Detection/install-new2.png)    
 Note: If installation fails, execute the installation command again after 1 to 3 minutes. Please contact the customer service if the installation failed for several times.
