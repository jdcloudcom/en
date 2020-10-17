# Use site monitoring
**Create the monitoring task**  

1. Log in the Cloud Detection Console of JD Cloud & AI and click **Management -> Cloud Detection -> Site Monitoring** to log in the monitoring task list page. Click **Create Task** in the upper left corner.  
2. Fill in the basic information  
- Name of monitoring task.
- Detection protocols: Support HTTP(S), Ping, TCP, UDP, DNS, SMTP, POP3 and FTP and select HTTP(S);
- Site address: Specify target monitoring address, such as console.jdcloud.com;  

3. Set detection scheme
- Detection frequency: i.e., please select the detection period for monitoring task as "5 minutes".
- Select "default detection point".  

4. Click **OK** to finish detection task configuration.

**View the monitoring graph**  

After the above-mentioned task is successfully added, wait for 5 to 10 minutes, and click **Monitoring Graph** in the monitoring task list to view detection points of this task, overall availability rate and response time.

**Set monitoring alarm**  

1. Return to the monitoring task list, click **Alarm Rule** to enter the **Alarm Rule** page, and click **Add Alarm Rule** to open the alarm rule setting page.  
2. Set rule name, for triggering conditions, select overall or city-operator for detection node, configure monitoring items, statistical cycle, statistical method, calculation method, threshold and duration, in notification policy, select contact or contact group, click **OK** to complete the alarm configuration.
