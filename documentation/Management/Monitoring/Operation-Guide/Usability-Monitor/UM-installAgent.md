## Install monitoring plug-in with availability

### 1. Login Linux Machines of JD Cloud.

![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Cloud-Monitor/Usability-Monitor/agent1.jpg)

### 2. Replicate installation commands to Virtual Machines according to the region where Virtual Machines locate.

Region | Installation command
-- |--
**cn-north-1** | `wget -c http://devops-hb.oss-internal.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a jcmagent /usr/local/share/jdcloud/ifrit && rm -f installer`
**cn-east-2** | `wget -c http://devops-hd.oss-internal.cn-east-2.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer  -- -a jcmagent /usr/local/share/jdcloud/ifrit && rm -f installer`
**cn-east-1** | `wget -c http://devops-sq.oss-internal.cn-east-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a jcmagent /usr/local/share/jdcloud/ifrit && rm -f installer`
**cn-south-1** | `wget -c http://devops.oss-internal.cn-south-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a jcmagent  /usr/local/share/jdcloud/ifrit && rm -f installer`

![](https://raw.githubusercontent.com/jdcloudcom/cn/monitoring/image/Cloud-Monitor/Usability-Monitor/agent2.jpg)

### 3. Click **Return** to execute installation command.

![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Cloud-Monitor/Usability-Monitor/agent3.jpg)

### 4. After executing installation command, wait for 1 - 3 minutes, then use ps -ef|grep jcmagent command to confirm whether jcmagent process is started.

![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Cloud-Monitor/Usability-Monitor/agent4.jpg)

### 5. If installation is failed, execute installation command again after 1 - 3 minutes. Please contact the customer service if the installation failed for several times.

### 6. Configure credential file  
#### Create monitor_credentials.yml file to save directory according to users who currently execute agent installation operation.  
  - Use root user to install agent and execute operations:  
    ```
    mkdir -p /root/.jdcloud/  
    ```  
    The save path for the complete monitor_credentials.yml file is: /root/.jdcloud/monitor_credentials.yml  
    
  - Use non-root user to install agent and execute operations:  
    ```
    mkdir -p /home/{USER}/.jdcloud/  
    ```  
    The save path for the complete monitor_credentials.yml file is: /home/{USER}/.jdcloud/monitor_credentials.yml  
    Note: {USER} needs to be replaced as the user name actually executing agent installation operation
    
   Note: Please create file according to the above path. If the path is wrong, agent cannot work properly and there will be no monitoring data. 
   
#### Edit and save monitor_credentials.yml file. The file content is:  

   ```
   ak: xxxxxxx(fill in YourAccessKeyID)   
   sk: xxxxxxx(fill in YourAccessKeySecret) 
   ```
