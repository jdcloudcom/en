# Create Monitoring Task
1. Log in the Cloud Detection Console of JD Cloud and click **Management -> Cloud Detection -> Site Monitoring** to log in the monitoring task list page. Click **Create Task** in the upper left corner.  
![任务列表](../../../../../image/Cloud-Detection/task-site-list.png)  
2. Add basic information
- Task name: Name of monitoring task, facilitating task identification, such as XXX website service
- Detection protocols: Support protocols such as HTTP(S), TCP, UDP, PING, FTP and SMTP. Application scenarios of a few protocols are as follows, which can be selected and set according to demands.  

Protocol Type |	Applicable Scenario
----| ----
HTTP(S)	| Web site monitoring service quality
TCP	| TCP port of monitoring server
UDP	| UDP ports of monitoring servers
PING |If monitoring service can be pinged
FTP	 | Suitable for providing the site monitoring of file service
SMTP | Suitable for the site monitoring providing email reception service
- Site address: Enter domains accessible by public networks or IP addresses, and settings for different protocols are as follows:  
HTTP(S): The request method can also be selected according to demands, the "Advanced Configuration" can be checked, and "HTTP(S) Request Head" and Cookie information can be added as the GET method; "Submission Content" can be added as the POST method, i.e., the request content of the body part; and "HTTP(S) Request Head" and "Cookie" information can be added as the HEAD method.  
TCP and UDP: It needs to fill in the port number; meanwhile, TCP request format, request contents, response format and response content can be configured in advanced configuration.  
SMTP: The port number needs to be filled in, selection of "Use Security Link SSL" or not is supported, and necessary user name and password are required to be accessed at the same time.  
FTP: The port number needs to be filled in. If identity verification is required by the selection, the necessary user name and password shall be filled in.
- Provide "Verification" operation and the temporary detection can be initiated once to verify if the entered information is valid or not.  

3. Set detection scheme
- Detection frequency: How often the detection is initiated once, 1 minute, 5 minutes, 10 minutes or 30 minutes.
- Detection point: Provide options including the default detection point and the customized detection point. At most 5 detection points can be selected as the customized detection points.  

4. Click **OK** and save the monitoring task.  
![新建任务](../../../../../image/Cloud-Detection/create-task-site-1.png)   
![新建任务](../../../../../image/Cloud-Detection/create-task-site-2.png)

# Modify monitoring task  
1. Log in the Cloud Detection Console of JD Cloud and click **Management -> Cloud Detection -> Site Monitoring** to log in the monitoring task list page.  
2. Select the task to be modified and click **Modify** to enter the task modifying page.
- The task name, site address and senior configuration in the basic information can be modified (referring to the newly created task)
- The "Detection Frequency" can be modified in the detection scheme.  

3. Click **OK** and save the monitoring task.

# Alarm History   
1. Log in the Cloud Detection Console of JD Cloud and click **Management -> Cloud Detection -> Site Monitoring** to log in the monitoring task list page.  
![任务列表](../../../../../image/Cloud-Detection/task-site-list.png) 
2. Select a monitoring task where the alarm is required to be viewed, click **More -> Alarm History** under the operation bar.  
3. Redirect to the All Alarm History -> Site Monitoring page, to show alarm conditions of the latest 1 day for the monitoring task. If you need to view alarm history of other periods, please just modify the date range.  
![报警历史](../../../../../image/Cloud-Detection/alarmhistory.png)

# Delete the monitoring task 
1. Log in the Cloud Detection Console of JD Cloud and click **Management -> Cloud Detection -> Site Monitoring** to log in the monitoring task list page.  
2. Select the monitoring task to be deleted, click **More -> Delete** under the operation bar or select the check box ahead the task and click **Delete** in batches.  
3. Click **OK** in the deletion notification tooltip.
