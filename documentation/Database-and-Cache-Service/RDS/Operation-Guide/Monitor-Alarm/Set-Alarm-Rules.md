# Set Alarm Rules
Users can set up monitoring items and create alarm rules, by which, the alarm will notify all contacts in the alarm contact group when it detects that the RDS service instance abnormally triggers the alarm rule of the monitoring item.

## Operation Steps
1. Login [RDS Management Console](https://rds-console.jdcloud.com/database).
2. Select the target instance to be set up with alarm rules, click the target instance, enter the instance detailed page, click the tag of ***Monitor***, click ***Alarm Rules Setting*** on the right to enter the detailed page of instance monitoring in Monitoring, and then click ***Add Alarm Rules***.
3. Parameter Description of Alarm Rule Interface Setting
    * Instance: The current instance ready to be added with alarm rules is selected by default. Meanwhile, other instances in the same region can be selected in the pull-down menu, so that the corresponding alarm rules are added at a time.
    * Use Existing Alarm Rule Templates: Tick on the check box directly if to use the existing alarm template, and select the template after the template selection box appears. The default is no template to be used.
    * Add Alarm Rules: Click on the new alarm rules to add an alarm monitoring item to the list. Monitoring, alarm period, threshold, statistical methods can be set up for monitoring items.
    * Delete: Delete the alarm monitoring item of the current row, which is not taken as a condition of the alarm.
    * Save as A New Alarm Rule Template: Tick on this box if to keep the current alarm rule as a template.

    ![image2018-3-7 17_33_23.png](https://img1.jcloudcs.com/cms/015e596a-98cf-42ae-9848-69ca7a02867b20180313173221.png)

4. Click ***Next*** to enter the notification contact settings interface, and parameter description of the interface are as follows
    * All Contacts: If the notification object is a contact, all contacts under the current account will be listed; if the notification object is a contact group, all contact groups under the current account will be listed.
    * Add a notification contact/contact group, click to select the contact/contact group in the all contact list, click the middle button ">", and the selected contact/contact group will be removed from the list of the contact library and added to the end of the selected contact list.
    * Remove the notification contact/contact group, click to select the contact/contact group in the selected contact list, click the middle button "<", the selected contact/contact group will be removed from the selected contact list and added to the end of the entire contact list.
    
    ![image2018-3-13 17_21_54.png](https://img1.jcloudcs.com/cms/3226df61-19a3-4909-88d1-22e47f5876ea20180313173251.png)

5. Click ***Next*** to complete the setting of the alarm rule.
