# Use Availability Monitoring

**Install monitoring plug-ins**  

Log in to the Virtual Machines needed to be the detection source (only Linux machines supported), and install monitoring plug-ins. Specific procedures are as below:  
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

3. Press the Enter key to execute installation operation. Wait for 1 to 3 minutes, and execute the following command to verify whether jcmagent has been installed successfully.  
 - Verification Command:
  ```
  curl http://localhost:1236/ping
  ```
 - Return: pong  indicates that jcmagent has been installed successfully.  
 
 The examples are as follows:  
 ![安装Agent](../../../../image/Cloud-Detection/install-new2.png)  
 

   

**Create the monitoring task**   

4. Log in to JD Cloud Detection Console and click **Management->Cloud Detection->Availability Monitoring** to enter the availability monitoring task list page. Click **Create Task** button in the upper left corner.  
5. Complete configuration information
- Complete name of the availability monitoring task;
- Select the detection source, and select the Virtual Machines in which the monitoring plug-in has been installed, and the plug-in is in "normal" status
- Select the detection target URL/IP, with the detection protocol as HTTP(S), and enter the detection target, e.g., console.jdcloud.com  

6. Click **Confirm** to complete creation.

**View the monitoring graph**  

7. After the above-mentioned task is successfully added, wait for 5 to 10 minutes, and click **Monitoring Graph** in the availability monitoring task list to view the response time and availability to the detection target of the task in the selected detection source.  

**Set alarm**  

8. Return to the availability monitoring task list, click **Alarm Rule** to enter the **Alarm Rule** page, and click **Add Alarm Rule** to open the set alarm rule page.  
9. Select monitoring items, statistical periods, statistic methods, calculation methods, thresholds and durations; click **Next** to set the notification method, select the contact person to be notified, and click **Next** to complete alarm configuration.
