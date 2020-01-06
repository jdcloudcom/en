## Add Alarm in Batch
1. Log in JD Cloud Console and click **Management -> Monitoring -> Resource Monitoring**. Taking Virtual Machines of resources for example, select **Virtual Machines** from the four-level menu and enter the VM Monitoring List.  
![云主机监控](../../../../../image/Cloud-Monitor/1-zylb.png)
2. Select Virtual Machines requiring alarm setting in batch, click the **Alarm Setting** button below the table and enter the page of Add Alarm Rule.  
![云主机监控](../../../../../image/Cloud-Monitor/2-plsz.png)  
![设置报警规则](../../../../../image/Cloud-Monitor/3-szbj.png)  

3. Configure information as per steps below  
   1) Basic information: Set a rule name and confirm the resource type and the selected instance information.  
   2) Triggering condition: Both customized addition and association of existing template information are supported.
   - Customized addition: Select the monitoring item, statistical period, statistical method, calculation method, threshold and period, and configure alarm level based on demands at the same time.  If you need to configure multiple triggering conditions, just click the **Add Triggering Condition** button.
 ![报警历史](../../../../../image/Cloud-Monitor/4-zdytj.png)    
![报警级别](../../../../../image/Cloud-Monitor/4-zdytj-0.png) 
   - Use of template: Switch to the "Use Template" option, click the drop-down box and select a template to be used. For specific template details, click **View Template** to open the Template Details.  
![触发条件-使用模板](../../../../../image/Cloud-Monitor/5-symb.png)  
![查看模板详情](../../../../../image/Cloud-Monitor/9-mb-xq.png)

   3) Notification policy:  
   - Notification period: It means the notification sending interval when any resource remains in the alarm status and is not recovered. Options include 5 minutes, 10 minutes, 15 minutes, 30 minutes, 1 hour, 3 hours, 6 hours, 12 hours and 24 hours.
   - Effective period: Alarm SMS and emails will be sent within the specified time period and will be sent all day by default.
   - Notification conditions: Two scenarios, "Alarm" and "Recover", are provided. By default, only the alarm status is sent and notification conditions must be appointed.
   - Receiving channel: Two types, "SMS" and "Email", are provided. By default, the two sending channels are used and please choose the channel according to your demands.  
   - Notification object: Selection of a contact or a contact group is supported. For addition of contacts and contact groups, please click **Account Management-Contact Management** on the bottom of choice box and make configuration in the User Center.  
   - Alarm callback: When any resource alarm is sent, JD Cloud will actively carry out callback as per URL address and POST parameters configured.  
![通知策略](../../../../../image/Cloud-Monitor/6-tzcl.png)  
![报警回调](../../../../../image/Cloud-Monitor/6-tzcl-hd.png)
4. Click **Complete Creation** on the page bottom and then the addition of alarm rule is supported. Click the **Cancel** button and then this operation is given up.
