# FAQs about Monitoring
**1.Q: How to view the monitoring for a specified date?**

   A: Enter the JD Cloud Console -Monitoring menu, and the monitoring list of each resource can be seen, click **Monitoring Table** in the operation column of each instance, select the custom time query on this page, select start time and end time to determine the specified date range for query. Currently, the Cloud Monitor supports monitoring queries as early as one month ago.
   
**2.Q: Is the monitoring status showing insufficient data?**

   A: When this happens, please make sure that your resources are not stopped during the data interruption period. When the resources are stopped, the Monitoring will not be able to obtain data. If this is not the case, please contact us by applying for a ticket.
# FAQ about Alarm
**1.Q: How to add/use an Alarm Rule Template?**

   A: Enter the JD Cloud Console - Monitoring menu, find the instance of the alarm rules that needs to be modified, click **Alarm Rules**. Click the newly added alarm rules on this page, modify the metric, statistical period, statistical method, calculation method, threshold, duration, and alarm level according to the needs. When finished, check the “Save as New Alarm Rules Template” to save the rule as a template.
   
After the alarm template is available, check "Use Existing Alarm Rules Template" to select the available template to use on the Newly Added Alarm Rules page.

**2.Q: How to query the alarm history of a specified date?**

   A: After logging in the JD Cloud Account, enter the Console page and select **Manage - Monitoring - Alarm Management - Historical Alarms** in the left menu bar. The query time period can be adjusted on this page, and the start and end time supports fine-tuning to the second level.
   
**3.Q: What to do if the sub-account reminds insufficient permissions during operation?**

   A: Reminder "Insufficient permissions" means that the current sub-account has no permission to perform this operation. If you need permission, please contact your main account administrator.
   
**4.Q: How is the alarm rule implemented?**

   A: Once the monitoring rules are met, the system immediately notifies the contact. The alarm notification interval is 24 hours, if the alarm is continuous within 24 hours, the alarm notification will be sent again after 24 hours; if it is not met, the alarm notification will not be sent again. In the alarm notification, the system will inform you the triggered Monitoring Rules Items and the Threshold you set.
