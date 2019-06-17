---
title: ‘Alarm Group&Duty Group'
---
# Alarm Group&Duty Group

The alarm group and the duty group are both the recipients of alarm notifications, and the duty group is the on-duty personnel who receive the alarms. Generally, the duty group refers to a group of on-duty persons receiving the voice alarm, to reduce alarm influence to those which are not on duty. You can create the corresponding alarm group and duty group before configuring the alarm policy.

There are two types of alarm groups:

(1) Node Alarm Group:

​    •   After the service tree node is created, the monitoring system will automatically generate three alarm groups: System PM ($sys_pm$), system operation and maintenance ($sys_op$), and system testing ($sys_qa$), according to the roles added on the service tree nodes. The ($app_dev$) alarm group is generated on the application node,

​    •   In the alarm configuration, the usage rule of the node alarm group is to send an alarm to the corresponding node role alarm group when the NS triggers an alarm.

(2) Global Alarm Group:

​    •   The name of global alarm group is customized by the user;

​    •   For a global alarm group within the product line scope, any node is visible and available.

## Operation Guide

**(1) Alarm Group Configuration**

After selecting the service tree nodes (shown as system nodes in the figure), select [Intelligent Monitoring] - [Monitoring Configuration] in the menu, and you can edit the alarm groups added by default and perform the contact addition and deletion operations on the "Alarm Group Configuration" page.

Click **Create**, open the page as shown in the figure.

Alarm group type: Select from role alarm group or global alarm group

Role: May select operation and maintenance, testing, R&D and product. The role alarm group does not need to set this item.

Scope: As shown in the figure, it is the system node; it can be selected as "system" and "application", which respectively represent the alarm group that creates the system node and the one creates application node. When creating a global alarm group, the scope and node are current product line nodes, not optional.

Node: Select a specific service tree node.

Contact: Add contact erp (if only erp is filled in, the user’s email, mobile phone number and Dongdong will be matched by default), mobile phone number (may be added and matched separately), mailbox (may be added and matched separately), the default status is to notify the added contacts of all levels of alarm notifications; click **+** on the right side to set the alarm contact groups for level alarm.

![10报警组](/images/10baojingzu.JPG)

**(2) Duty Group Configuration**

Select the service tree system or product line nodes (shown as system nodes in the figure), select [Intelligent Monitoring] - [Monitoring Configuration] in the menu, and click **Create** on the "Duty Group Configuration" page to open the page as shown in the figure.

Name: The duty group name is onCall by default and cannot be changed by users.

Scope: As shown in the figure, it is the system node; it can only be selected as "system", and can select product line or system in the product line node.

Node: Select a specific service tree node.

Contact: Add contact erp, mobile phone number, mailbox, the default status is to notify the added contacts of all levels of alarm notifications; click **+** on the right side to set the alarm contact groups for level alarm.

![10值班组](/images/10zhibanzu.JPG)