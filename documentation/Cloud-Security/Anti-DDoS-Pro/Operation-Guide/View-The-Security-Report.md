# View Security Report
Anti-DDoS Pro provides rich security reports to help you understand the protective effects after getting access to Anti-DDoS Pro.

## Operation Steps
### Mode 1
Log in [Monitoring Report Page](https://ip-anti-console.jdcloud.com/charts) of Anti-DDoS Pro. By default, relevant reports of the first instance will be displayed. You can switch instances in the drop-down box under **Instance Name** or select several or all instances. If several instances are selected, data will be displayed in the diagram of the report in an accumulated way.
![图表](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/report%2006.png)

### Mode 2
Log in [Anti-DDoS Pro Console](https://ip-anti-console.jdcloud.com/instancelist). Find an instance of report to be viewed and click **View the Report**. Then, you can view the report of the instance.</br>
![图表](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/report%2009.png)

## Report Type
Reports of Anti-DDoS Pro can be divided into four categories: DDoS Attack Protection, business traffic, CC defense and connections. Reports for the current day are displayed by default, or for the last 7 or 30 days if selected. Reports within maximum 30 days can be viewed, and the minimum report granularity is 5min. Attack logs are shown below the reports.</BR>

1. Report of DDoS Attack Protection</BR>
Traffic before protection and traffic comparison after protection are included. Click the legend above the diagram to hide traffic curves before or after protection. Drag the time window scroll bar in the diagram below to zoom out the time window query in the current query time scope. Move cursor on the diagram to display traffic data of this line.</BR>
![图表](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/report%2010.png)

2. Business Traffic Reports</BR>
The traffic comprises IN and OUT traffic. IN traffic refers to the traffic forwarded to the origin server after cleaning, and OUT traffic refers to the response traffic of the origin server.</BR>
![图表](../../../../image/Advanced%20Anti-DDoS/report%2011.png)

3. CC Defense Report</BR>
In case of CC attacks defensed by Anti-DDoS Pro, the CC protection table will be produced, which supports switch of different domains. CC protection is only effective to web service businesses.</BR>
![图表](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/report%2012.png)

4. Connection Count Reports</BR>
New connection count: It refers to the count of connections created by the system in 1 second.</BR>
![图表](../../../../image/Advanced%20Anti-DDoS/report%2013.png)


