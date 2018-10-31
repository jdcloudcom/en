# Intelligent monitoring

**Operation steps**

I. 	Collection configuration

1)	Select the Service Tree node (Product line and below), select Intelligent Monitoring-Monitoring Configuration from the menu, select Monitoring Type from the Collection Configuration tab, then click “New”

2)	Select Monitoring Type, set the name of the Collection Configuration, then configure the scope, nodes, collection cycle, monitoring contents and other information of the monitoring according to the monitoring item description at the right side of the Creation Configuration window

3)	After completing Collection Configuration, you may click “View Chart” to view the trend chart of monitoring metrics at Operation bar of Collection Configuration list

II. 	Data Visualization

1)	Trend chart: select the Service Tree Node (Product line and below), select Trend Chart from the menu, you may quickly view the trend chart of monitoring metrics with designated NS

2)	Search chart with single IP: select Intelligent Chart with Single IP from the menu, you can quickly view the trend chart with designated IP

3)	Dashboard:
Select Service Tree node, click “New Dashboard Menu” to create dashboard menu which can be added for three levels at most;
After saving the menu, click Setting button to add charts for all levels of menu respectively (supporting trend chart and list) so as to enable flexible and diversified chart view.

III. 	Aggregation Configuration (optional)

1)	Configure primary aggregation first: select Monitoring Configuration from the menu, select “Primary Aggregation” check box at the left side of the Aggregation Configuration tab, click “New” at the right side to set the name, scope nodes for the aggregation collection and select monitoring type required to be aggregated, monitoring items and aggregated methods.

2)	Secondary aggregation:
Only the monitoring items with primary aggregation configured can be configured for secondary aggregation, select “Secondary Aggregation” check box at the left side, click New to set the name, scope nodes for the secondary aggregation, configure the json script with reference to the json description at the right side.

IV.	 Alarm Configuration

1)	Click “New” at the Alarm Configuration tab to set the name, scope, nodes, alarm level, Chinese description for the Alarm Configuration, and set alarm rules according to the business requirements. It supports to configure AND (alarm only all rules are satisfied) and OR (alarm when one rule is satisfied) for multiple rules

2)	Click the Advanced Configuration below to set the maximum alarm times, time, alarm merge for the alarm

3)	After completing the operation above, click “Next” to set alarm methods which support e-mail, SMS and voice, add Alarm group (the alarm group can be set on the Alarm Group Configuration tab)

V. 	Alarm Management

1)	Alarm history:

Select Service Tree Node, select Alarm Management-Alarm History from the menu to view historical alarms, supporting quick chart view, collection configuration view, alarm rule view, ACK by one key (current alarms will no longer sent after confirmation), manual repair alarm and other functions. Filtered alarm history supports export and sharing.

2)	 Alarm block:

select Alarm block from the menu, select the Service Tree Node, the alarm methods support (1) block by NS (2) block by alarm rules, then select NS that you want to block alarm and set block time.
