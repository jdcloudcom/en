# View Security Report
Anti-DDoS Pro provides rich security reports to help you understand the protective effects after getting access to Anti-DDoS Pro.

## Operation Steps
### Mode 1
1. Log in to the Anti-DDoS Pro [Monitoring Report Page](https://ip-anti-console.jdcloud.com/charts). Menu bar position is as follows: </BR>

![](../../../../image/Advanced%20Anti-DDoS/report%2001.png)

2. The relevant reports of the first instance will be displayed by default. You can switch the instance in the dropdown box of the **Instance name**, or you can select multiple or all of the instances. If more than one instance is selected, the chart data in report will be displayed in an accumulative way.
![](../../../../image/Advanced%20Anti-DDoS/report%2006.png)

### Mode 2
1. Log in [Anti-DDoS Pro Console](https://ip-anti-console.jdcloud.com/instancelist).
2. To find the instance of report that you want to view, you need to click **View report** to view the report of that instance.
![](../../../../image/Advanced%20Anti-DDoS/report%2002.png)

## Report Type
Reports of Anti-DDoS Pro can be divided into four categories: DDoS Attack Protection, business traffic, CC defense and connections. Reports for the current day are displayed by default, or for the last 7 or 30 days if selected. Reports within maximum 30 days can be viewed, and the minimum report granularity is 5min. Attack logs are shown below the reports.</BR>

1. Report of DDoS Attack Protection</BR>
Includes the comparison of the traffic before and after protection. Click the legend to view only the traffic before or after protection. Move the mouse to the figure to show the traffic data of that line.
![](../../../../image/Advanced%20Anti-DDoS/report%2003.png)

2. Business Traffic Reports</BR>
The traffic comprises IN and OUT traffic. IN traffic refers to the traffic forwarded to the origin server after cleaning, and OUT traffic refers to the response traffic of the origin server.
![](../../../../image/Advanced%20Anti-DDoS/report%2007.png)

3. CC Defense Report</BR>
Anti-DDoS Pro defends CC attack and a CC defense report will be produced. CC report supports switching between different domains.</BR>
Because CC defense only takes effect on the Web Service, of all CC defense reports, only the Web Service forwarding rules can produce CC defense traffic.
![](../../../../image/Advanced%20Anti-DDoS/report%2005.png)

4. Connection Count Reports</BR>
The connection count includes concurrent connection count and new connection count.</BR>
Concurrent connection count: It refers to the count of all created connections existing at a certain time point, including active and inactive connections. Active connections refer to all ESTABLISHED TCP connections, and inactive connections refer to all TCP connections other than ESTABLISHED TCP connections.</BR>
New connection count: It refers to the count of connections created by the system in 1 second.</BR>
![](../../../../image/Advanced%20Anti-DDoS/report%2008.png)


