# One-click Alarm
The one-click alarm service is used to help users quickly establish an alarm system. You only need to turn on the alarm switch by one-click to quickly enable the monitoring for all resources under corresponding cloud service.

## Support cloud service and default alarm policy
|Cloud Service|Description|Default Configuration Policy|
|---|----|----|
|RDS|Monitor index data on CPU util, hard disk utilization rate and memory util by default. After the one-click alarm is enabled, all MySQL, SQL Server, MariaDB, PostgreSQL and Percona instances will take effective. |Average of CPU util in 5 minutes >= 80%, for 3 consecutive times or average of memory util in 5 minutes  = 80%, for 5 consecutive times or average of hard disk utilization rate in 5 minutes  > 80.00 % for 3 consecutive times; the notification cycle is 3 hours, notified by SMS or email.|
| JCS for Elasticsearch | Monitor the monitoring data of JCS for Elasticsearch instances and nodes, including cluster status, node hard disk utilization rate, node HeapMemory utilization rate and relevant index data. |  Maximum of cluster status in 1 minute >= 2.00, occur once or maximum of cluster status in 1 minute == 1.00, occur once or maximum of node hard disk utilization rate in 1 minute >= 75.00 %, once or maximum of node HeapMemory utilization rate in 1 minute >= 85.00 %, 10 consecutive times; the notification cycle is 3 hours, notified by SMS or email.|

## Use One-click Alarm Service

### **Operation Description**
- After the one-click alarm is enabled, all resources under corresponding cloud service, including resources later purchased and created.
- Only some common core indexes are enabled by default in one-click alarm. If there is a demand for other indexes, you can add it by modification. If some instances have a demand for particular monitoring alarm, you can use the alarm rule service for customized addition.

### **Operation Steps**

#### [Enable One-click Alarm]
1.  Access [Monitoring Console](http://cms-console.jdcloud.com/alarm/oneclick/) to immediately enter the One-click Alarm Service List Page. Or access [JD Cloud & AI Console](https://console.jdcloud.com) and click **Cloud Service** on the top navigation to search for "Monitoring"; according to the search result, click and log in the Monitoring Console. On the left menu, unfold **Alarm Management** - click **One-click Alarm** to enter the one-click alarm service page.
2. Select the cloud service requiring one-click alarm, and then turn on the enabling switch.
![一键报警1](../../../../../image/Cloud-Monitor/Alarm-Management/1-oneclick.png)

#### [Modify Policy]  
If the built-in default policy cannot meet the demand, you can modify and add a trigger condition, notification policy and other information according to the demand. Take JCS for Elasticsearch for example. The specific operation steps are as follows:  
1. Select the JCS for Elasticsearch cloud service, click **Unfold** to open the One-click Alarm Policy List. Click **Modify** in the operation. Open the Modify Alarm Rule Page.  

![一键报警2](../../../../../image/Cloud-Monitor/Alarm-Management/2-oneclick.png) 

![一键报警3](../../../../../image/Cloud-Monitor/Alarm-Management/3-Oneclick.png)

2. You can either modify the trigger conditions according to demands, such as the default monitoring cycle, alarm threshold, duration, etc., or increase or delete the trigger conditions; the notification policy has built in common options such as notification cycle, effective time, notification condition and other information, and the notification contact is the account contact by default, which can be modified according to demands.
