# Set alarm rules
You can set monitoring items and create alarm rules to notify all contacts in the alarm contact group when the alarm rules of monitoring items are triggered because of detecting exception of instance. 

## Action Steps
1. Log in [Block Chain Data Service console](https://bds-console.jdcloud.com/block/list).   
2. Select the target instance needs to set alarm rules. Click the target instance to enter the detail of the instance. Click **Monitoring** tab; click **Set Alarm Rules** on the right side to enter the instance monitoring details of cloud monitor; then click **Add Alarm Rules**.  
3. The parameter description of setting alarm rules
    * Instance: the instance which will be added new alarm rules is selected by default, you can click the drop-down box to select other instance at the same region, then all instances will be added corresponding alarm rules together.
    * Use existing alarm rules template: if you want to use the existing alarm rules template, directly select the check box and then the templates will show; just select the template you need; there is no template by default.
    * Add an alarm rule: click **Add an Alarm Rule** to add an alarm monitoring item in the list; you can select the item you want to monitor and set the statistical period, threshold, statistical method and other information for the alarm.
    * Delete: delete the alarm monitoring item in this row.
    * Save as a new alarm rule template: if you want to save the current alarm rules as a template, please select this check box.
    ![Set Alarm Rules](Pic/Set alarm rules.png)
4. Click **Next** to enter the setting interface of notification contacts. Interface parameter description
    * All Contacts: if the notification object is a contact, a list of all contacts under current account will be displayed; if the notification object is a contact group, a list of all contact groups under current account will be displayed.
    * Add notification contact or contact group, select the contact or contact group in the list of all contacts and click the middle button “>”, then the selected contact or contact group will be removed from the list of all contacts and added to the end of the list of selected contacts.
    * Remove notification contact or contact group, select the contact or contact group in the list of selected contacts and click the middle button “<”, then the selected contact or contact group will be removed from the list of selected contacts and added to the end of the list of all contacts.
    ![Notification Contacts](Pic/Notification contacts.png)
5. Click **Next** to complete the setting of alarm rules.
