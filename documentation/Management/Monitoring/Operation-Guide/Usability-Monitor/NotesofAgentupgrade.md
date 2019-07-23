# Agent Upgrade Operation Description
## Applying for AK/SK  
1. Log into the Administrative Console https://console.jdcloud.com as an administrator, click **Login User**->Access Key Management.  

![](https://raw.githubusercontent.com/luolei-laurel/cn/patch-6/image/Cloud-Monitor/Usability-Monitor/aksk.png)  

2. If Access Key is not available, click **Create Access Key** to perform creation operation. If ak/sk is available, paste it directly (it is recommended to create ak/sk dedicated to Monitoring agent).  

## Configure credential files  
1. Log in Availability Monitoring Tasks, select Virtual Machines as the detection source.  
2. Configure credential files of user authentication
   - Create ~/.jdc/monitor_credentials.yml file
   - Edit and save monitor_credentials.yml file. The file content is:
   ```
   ak: xxxxxxx(fill in YourAccessKeyID)   
   sk: xxxxxxx(fill in YourAccessKeySecret) 
   ```  
   Note: content filling in ak\sk must conform to yaml syntax (there must be spaces between key-value pairs), otherwise reading of ak\sk will fail. For example: ak:(space)xxxxxx
