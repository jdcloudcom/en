# Set alarm rules
You can set monitoring items and create alarm rules to notify all contacts in the alarm contact group when the alarm rules of monitoring items are triggered because of detecting exception of instance. 

## Action Steps
1. Log in [Block chain data service console](https://bds-console.jdcloud.com/block/list).   
2. Select the target instance needs to set alarm rules; click the target instance to enter the details of the instance; click **Monitoring** tab; click **Set Alarm Rules** on the right side to enter the instance monitoring details of cloud monitor; then click **Add an Alarm Rule**.  
3. Interface parameter description for setting alarm rules
    * Instance: Click the instance to be added new alarm rules by default whilst you can click the drop-down box to select other instances at the same region in order to add corresponding alarm rules together.
    * Use existing alarm rules template: if you want to use the existing alarm template, directly select the check box and then the select box for templates will show; just select the template you need; there is no template by default.
    * Add an alarm rule: click **Add an Alarm Rule** to Add an alarm monitoring item in the list; you can select the item you want to monitor and set the statistical period, threshold, statistical method and other information for the alarm.
    * Delete: delete the alarm monitoring item in this row as one of the conditions for alarm.
    * Save as new alarm rule template: if you want to maintain the current alarm rules as a template, please select this check box.
    ![Set alarm rules](Pic/Set alarm rules.png)
4. Click **Next** to enter the setting interface of notification contacts. Interface parameter description
    * All contacts: If the notification object is a contact, a list of all contacts under current account will be displayed; if the notification object is a contact group, a list of all contact groups under current account will be displayed.
    * Add notification contacts/contact group, click the contacts/contact group in the list of all contacts and click the middle button “>”, then the selected contacts/contact group will be removed from the list of all contacts database and added to the end of the list of selected contacts.
    * Remove notification contacts/contact group, click the contacts/contact group in the list of selected contacts and click the middle button “<”, then the selected contacts/contact group will be removed from the list of selected contacts database and added to the end of the list of all contacts.
    ![Notification contacts](Pic/Notification contacts.png)
5. Click **Next** to complete the setting of alarm rules.
