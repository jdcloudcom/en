# Add Alarm Rule
1. Log in JD Cloud Console, click **Management -> Monitoring -> Alarm Management -> Alarm Rules**, enter the page of List of Alarm Rules, and switch to the tab of "Custom Metric Monitoring".  
![报警规则列表](../../../../../image/Cloud-Monitor/CustomMetric/alarm_rules_cs.png)   
2.	 Click **Add Alarm Rule** button on the top of the list and open the page of Add Alarm Rule.  
![添加报警规则](../../../../../image/Cloud-Monitor/CustomMetric/create_rules.png)     
3. Configure information as per steps below  
a. Basic Information
- Configure the rule name, region, namespace, monitoring indicator and aggregation method.
- For monitoring dimensions, you need to select the key of the dimension, and the options "All" or "Specified Dimension Value" can be selected as the value of the corresponding dimension
```
Note: 
① When you select "All" for the dimension value, the existing dimension value under current dimension and the subsequent newly reported dimension value will be monitored. 
② When you select "Specified Dimension Value", one or more existing dimension values can be specified for monitoring.
③ When "All" or "Specified Dimension Value" are selected for the dimension value, aggregation can be specified. When the aggregation is selected, these dimension values configured will be combined as 1 piece of data.  
```
b. Triggering Condition 
Select the monitoring item, statistical period, statistical method, calculation method, threshold and period, and configure alarm level based on demands at the same time.   

c. Notification Policy 
- Notification period: It means the notification sending interval when any resource remains in the alarm status and is not recovered. Options include 5 minutes, 10 minutes, 15 minutes, 30 minutes, 1 hour, 3 hours, 6 hours, 12 hours and 24 hours.  
- Effective period: Alarm SMS and emails will be sent within the specified time period and will be sent all day by default.
- Notification conditions: Two scenarios, "Alarm" and "Recover", are provided. By default, only the alarm status is sent and notification conditions must be appointed.  
- Receiving channel: Two types, "SMS" and "Email", are provided. By default, the two sending channels are used and please choose the channel according to your demands. 
- Notification object: Selection of a contact or a contact group is supported. For addition of contacts and contact groups, please click **Account Management-Contact Management** on the bottom of choice box and make configuration in the User Center.  
- Alarm callback: When any resource alarm is sent, JD Cloud will actively carry out callback as per URL address and POST parameters configured.

4. Click **Complete Creation** on the page bottom to complete alarm rule creation.
