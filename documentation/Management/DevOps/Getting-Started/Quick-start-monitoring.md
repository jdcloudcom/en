# Monitoring Access Guide
## Intelligent Monitoring  
Realization of intelligent monitoring comprises sections below:

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started8.jpg) 

[**Data Acquisition**] Obtain data to be monitored by collecting plug-ins and standardize the same. Now, 9 monitoring types of four levels are supported, including machine monitoring, crash monitoring, port monitoring, process monitoring, log monitoring, method monitoring, component monitoring, domain monitoring and custom metric monitoring. Except that the machine monitoring is collected by agent by default, corresponding configurations shall be configured to other monitoring types.

[**Visual Data**] Provide the data visualization function for three different uses, including the trend chart, the dashboard and the single-IP chart search, to realize daily routine inspection, troubleshooting, etc.

[**Alarm Configuration**] Alarms are configured to the objects to be monitored by configuring alarm rules, alarm notifier, alarm method, etc.

[**Intelligent Analysis**] For the event flow, alarm, deployment, Service Tree change and other events will be integrated via a flow map to facilitate the user to make quick troubleshooting and problem positioning.


## Quick Start and Operation Guide

**Step 1: Agent Deployment and Monitoring Access**

Before using the intelligent monitoring, please ensure that ifrit-agent is successfully deployed. After deployment, the agent status can be viewed via the modes below: select the product line of Service Tree and nodes hereunder. Then, the agent status of a machine can be viewed in the “Machine List” page.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started9.jpg)

**Step 2: Acquisition Configuration**

(1) Select the product line of Service Tree or nodes under the product line and select [Intelligent Monitoring] - [Monitoring Configuration] in the menu, to log in the [Acquisition Configuration] page.

PS: Please add other acquisition tasks here, except the machine monitoring. Data agent monitored by the machine will be collected by default, without additional configuration.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started10.JPG)

(2) Click **Create** on the right side, open the configuration creation window (as shown in the figure), and support the configuration via the form and JSON.

Select the monitoring type first and then set name, scope, specific node, acquisition period of the acquisition task as well as other contents necessary for other monitoring. Several acquisition tasks can be added here in accordance with demands and recommendations and acquisition configuration can be gradually completed.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started11.jpg)

**Step 3: Trend Chart View**

Upon creation of acquisition configuration task, the data collected can be viewed via a trend chart.

**Entrance I **: After completing task addition task in the acquisition and configuration page in step 2, you may click **Operation** in the acquisition and configuration task list and click **View Chart** to log in the chart view page and view trend chart of current acquisition task.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started12.jpg)

**Entrance II**: Select any node with acquisition configuration from the Service Tree on the left side, click menu [Intelligent Monitoring] - [Data Visualization] - [Trend Chart] to log in the page of Trend Chart.

Select NS (monitoring object) of the trend chart to be viewed from the left-side window, select [Monitoring Type] -- [Monitoring Item] from the right-side window and check to view corresponding trend chart on the lower part.
In this page, Service Tree nodes, NS, monitoring types and monitoring items can be switched and trend charts of all acquisition and configuration can be viewed.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started13.jpg)

**Step 4: Configuration of Alarm Group and Duty Group**

Upon completing acquisition and confirming acquisition of necessary data, please add alarms for machines and services to be monitored. Before adding alarms, please add corresponding alarm contacts for each node of the Service Tree.

(1) Add alarm configuration group: Select menu [Intelligent Monitoring] - [Monitoring Configuration] and select [Alarm Configuration] tab. The alarm group can be divided into the node alarm group and the global alarm group.

Node alarm group: Alarms are sent to corresponding node roles depending on NS nodes when an alarm is triggered by NS. Depending on the role of the Service Tree at the time of creating the node, the system will automatically output alarm groups for four roles, including the system PM, the system operation and maintenance personnel, the system tester and the application R&D personnel. Users may edit persons of any alarm group in accordance with the actual demands.

Global alarm group: Any nodes are available within the range of the current product line.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started14.jpg)

Click **Create** to open the alarm group creation window (as shown in the figure), set alarm group name and add contacts only. The contacts can be added via three modes, including erp, mobile phone number and e-mail.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started15.jpg)

(2) Add duty group: A duty group can be created in the system and the product line node, and only one duty group can be created for each node. Generally, the duty group refers to a group of on-duty persons receiving the voice alarm, to reduce alarm influence to those which are not on duty.

**Step 5: Alarm Configuration**

(1) Add alarm configuration: Select menu [Intelligent Monitoring]-[Monitoring Configuration] and select [Alarm Configuration] tab. in the page to log in the window blow. In which,

Name: Set the name of this alarm configuration;

Alarm Level: There are four levels, which are P0, P1, P2 and P3, with the severity decreases progressively.

Description: Add Chinese description for the alarm.

Alarm Rules: Support addition of several alarm rules and setting of dependency as and/or.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started16.jpg)

Alarm Interval: Alarm notification interval can be set;

Alarm Callback: It is used to configure and trigger some operation and supports GET and POST modes of HTTP requests.

Maximum Number of Alarms: Refer to the maximum number of alarm notifications sent per alarm event.

Effective Time: When the alarm is enabled, the voice alarm is not subject to restrictions of effective time period of alarm configuration.
Enable Alarm Merging: With a valid alarm convergence mode, merging can be enabled only when the ns type of monitoring item is Host or INSTANCE. The modes include merging by APP and merging by groups. When multiple ns trigger the alarm at the same time, the first alarm notification contains one ns, and the subsequent alarm notifications will be merged and sent, showing one ns, and the rest merges are notified by “Alarm and Merging of N sets of NSs”.

Reception of Recovery Notification: Whether to send a notification when the alarm event is recovered.

Click **Next Step** to add the alarm contact group to finish the alarm configuration.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started17.jpg)

**Step 6: Alarm Management**

(1) Alarm History: Select [Intelligent Monitoring] - [Alarm Management] - [Alarm History]. Open the alarm list page as shown in the figure, record all alarm events that occur, including monitoring objects, alarm time, number of alarms, rules, recovery, etc., and allow users to view alarm configurations, query figures, perform ack and manual repair operations.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started18.JPG)

(2) Alarm Shield: Select [Intelligent Monitoring] - [Alarm Management] - [Alarm Shielding]. You can shield those alarm events which are unnecessary for reception and treatment. The alarm history will still be recorded for the shielded alarms. However, the alarm notification will not be sent during the blocking period.

Shield by NS: Shield all alarms of the selected NS.

Shield by rules: For a shield rule, some NS alarm can be set.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started19.jpg)

**Step 7: Configuration of Dashboard**

The user is allowed to freely combine the figures and charts of dashboard, gather data sets to be checked frequently and view the succeeded configuration whenever.

(1) Select a Service Tree node, select the menu [Intelligent Monitoring] - [Data Visualization] - [Dashboard], and click **Create dashboard Menu** to create the dashboard menu at first. As shown in the figure, at most a three-level menu can be added.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started20.JPG)

(2) Upon creating the menu, click **dashboard** to view. Log in the Dashboard Configuration page, click **Setting** under the menu and select **Add Trend Chart**, to open the trend chart configuration page (as shown in the graph). The product line and nodes hereunder can be configured via two modes, i.e. the form and JSON.
Selection areas for ns, monitoring items, statistics and the like are located at the left side of the page, while the graph pre-view area is located on the right side. Upon configuration, figures and charts can be viewed immediately.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Getting-Started21.jpg)
