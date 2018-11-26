# Data Visualization

The purpose of data visualization is to enable users to intuitively view monitoring data in the chart. The data visualization function provided by us includes trend chart, dashboard and single IP search graph.

**(1) Dashboard**: User business logic and hierarchy relationship can be freely combined into graphs and charts, concentrated data that are frequently viewed are available at any time after successful configuration

​       •  Three-level menu can be created at most according to business logic and hierarchy relationship

​      •  Support to configure contract diagram of the same time

​      •  Support to place multiple monitoring items with the same type or inner link in the same diagram for view

​      •  Users can combine dashboard freely, with the following usages:

​       (1) Resource utilization of routine inspection: quantity of business machines, resource utilization of resource machines (cpu idle rate, disk idle rate, percentage of available memory)

​       (2) Business situation of routine inspection: Business volume of key modules, number/traffic of key business indicators, etc.

​       (3) Monitoring of Error Types

​       (4) More...

**(2) Trend chart**: View monitoring value of each monitoring object according to the dimensions of monitoring indicators

​      •  One-click to view common monitoring items

​      •  Support one-key sharing

​      •  Support to view large image

  **(3) Single IP search diagram**: View monitoring indicators of a stand-alone machine and its instances.

​          Enter IP to have a quick view of trend chart

## Operation Guide


**(1) Dashboard:**

Step 1: Select the node in the service tree, select [Intelligent Monitoring] - [Data Visualization] - [Dashboard] in the menu to access the following page.

Click **New Dashboard** menu to create dashboard menu first.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide39.JPG)

Click **Add First Level Menu** to create first level directory first, which is be considered as the main level or classification. Then continue to add second level, third level menus. The dashboard allows three levels of menu to be added at most. Click **☆** at the end of the menu item to set it as the default menu that displays in the dashboard home page of current service tree node. Click Edit (return to chart) button to return to chart display page.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide40.JPG)

Step 2: click **Setting** in the diagram, then select "Add charts" - "Trend Chart" in the drop-down box to open the configuration window of adding trend chart.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide41.JPG)

Nodes at or below product line support to configure dashboard with two methods of sheet and JSON. Monitoring items you want to view can be configured by following the steps as shown in the figure.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide42.JPG)


**(2) Trend Chart**

Select the node at application, system or product line in the service tree, select [Intelligent Monitoring] - [Data Visualization] - [Trend Chart] menu to access the following page.

Select ns at the left area, then select monitoring item types and specific monitoring items to be viewed at the right box, which will form the chart below after checked. The data situation of monitoring items to be viewed display in the form of trend chart.

Customer Scenario:

(1) Observe data situation (change trend, no data, breakpoint and other situations of the trend chart), you can make a quick view of trend chart of multiple instances or (multiple) metric corresponding to machine under a certain application or group and quickly switch ns;

(2) Troubleshooting.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide43.JPG)


**(3) Single IP Search Diagram**

Select [Intelligent Monitoring] - [Data Visualization] - [Single IP Search Diagram] to access the following page. Enter IP in the search box, click **Search** to view monitoring items and trend chart of corresponding machine, instances Support to switch product lines (some machines may cross product lines), facilitating users to view various monitoring data to search and position problems according to machine IP.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide44.jpg)
