# Monitoring site quality
**Create the monitoring task**  

1. Log in the Cloud Detection Console of JD Cloud & AI and click **Management -> Cloud Detection -> Site Monitoring** to log in the monitoring task list page. Click **Create Task** in the upper left corner.  
2. Fill in the basic information
- Name of monitoring task, e.g., test_1,
- Select detection protocol "HTTP(S)",
- Specify monitored target address, such as: console.jdcloud.com.  

3. Set detection scheme  
- Detection frequency: i.e., please select the detection period for monitoring task as "5 minutes",
- Select "default detection point".  

4. Click **OK** to finish monitoring configuration for the site address "console.jdcloud.com".

**View the monitoring graph**  

After the above-mentioned task is successfully added, wait for 5 to 10 minutes, and click **Monitoring Graph** in the monitoring task list to enter the Monitoring Information Details page. The availability rate and response time of this site address can be viewed.

**Set alarm rules**  

1. Switch to the "Alarm Rule" page, click **Add Alarm Rule** and enter the alarm rule setting page.  
2. Set and select a region, such as "ensemble average", monitoring item; "site availability ratio", statistical period; "5 minutes", statistical method; "average value", calculation method; "＜", threshold; "90%" and duration; "continuing for 2 periods"; in the notification policy, select the contact to be notified and click **OK** to finish alarm configuration.  
Note: Alarm service will continuously monitor the site availability rate of this task. Once the alarm threshold is reached, a notice will be immediately given.

