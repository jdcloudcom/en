# Performance Monitoring

JCS for Redis provides rich monitoring indicators and you can easily obtain the monitoring information through the Console and OPENAPI to master the real-time status of instance running. Take the Console as an example:

1. Log in to the [JCS for Redis Console](https://redis-console.jdcloud.com/redis) to locate the target instance.

2. Click **Instance Name** to go to the details of the instance page.

3. In the navigation tab above, select **Monitoring**.

4. Select **Monitoring Time** to view.

5. In the upper right corner, you can set the alarm rules, or click to enter the alarm rules page of Monitoring.


## Monitoring Items

### redis 2.8 Monitoring Item

#### Monitoring Group
redis 2.8 provides multiple groups of monitoring groups. You can screen and switch the monitoring groups at will. The details are as shown in the table below:

| Monitoring Group       | Description                                                         |
| ------------ | ------------------------------------------------------------ |
| Basic Monitoring Group   | Instance information and other basic monitoring information, e.g. memory used, intranet inbound traffic, QPS, etc. |
| Keys Monitoring Group   | Monitoring information using commands related to key value, e.g. calling count of commands such as del, dump    |
| String Monitoring Group | Monitoring information using commands related to string data type, e.g. calling count of commands such as append, bitcount |
| Hashes Monitoring Group | Monitoring information using commands related to hash data type, e.g. calling count of commands such as hdel, hexists |
| Lists Monitoring Group  | Monitoring information using commands related to list data type, e.g. calling count of commands such as lindex, linsert |
| Sets Monitoring Group   | Monitoring information using commands related to set data type, e.g. calling count of commands such as sadd, scard |
| Zset Monitoring Group   | Monitoring information using commands related to zset data type, e.g. calling count of commands such as zadd, zcard |

#### Monitoring Item of Basic Monitoring Group
The default monitoring items shall be basic monitoring items, including basic status information of the instance. The details are as shown in the table below:

| Monitoring Item               | Unit    | Description                                     | Statistic Method                                   |
| -------------------- | ------- | ---------------------------------------- | ------------------------------------------ |
| Memory Used of Instance       | Bytes   | Used Memory of Instance                             | Memory Used at the Time of Collection                         |
| Memory Usage of Instance       | %       | Ratio of Used Memory and Total Memory of Instance               | Memory Usage at the Time of Collection                         |
| Inbound and Outbound Traffic of Instance     | KBps    | Traffic Flowing in and out of JCS Through Intranet Every Second       | Total Quantity of Data Received (Sent) at the Time of Collection/Monitoring Cycle      |
| Instance QPS              | count/s | Access Count Every Second                             | Requests at the Time of Collection/Monitoring Cycle                      |
| Instance Hit Ratio           | %       | Probability of Hitting Cache by a Request                        | Requests Hit in Monitoring Cycle/Total Requests            |
| Instance Key Count          | count   | Current Number of Instance keys                        | Number of keys at the Time of Collection                            |
| Expired Key Count of Instance      | count   | Total count of keys with the Expire Time Set                  | For accumulative total value as of collection, re-calculate after instance reboots. |
| Weeded-out Key Count of Instance      | count   | Total Count of keys Weeded Out due to Full Memory                  | For accumulative total value as of collection, re-calculate after instance reboots. |
| Instance Hit Count         | count   | Hit Requests                             | Requests Hit in Monitoring Cycle                     |
| Instance Not Hit Count       | count   | Not Hit Requests                           | Requests Not Hit in Monitoring Cycle                   |
| Memory Rss Used of Instance      | Bytes   | Actually Used Physical Memory (Including Memory Used by Shared Library) | Memory Used at the Time of Collection                           |
| Total Connected Instances through Agency | count   | Total Connected Instances through Agency                     | Total Connected Count at the Time of Collection                             |

#### Other Monitoring Groups

Except basic monitoring groups, other monitoring groups are data of particular type or monitoring indicators of particular function. The indicators are divided into two types:

* Command used count indicator: e.g. count of del, dump, exists commands in Keys monitoring group used in a monitoring cycle every second.

* Command response time indicator: e.g. average response time of del, dump, exists commands in Keys monitoring group in a monitoring cycle.

### redis 4.0 Monitoring Item

redis 4.0 version only includes basic monitoring items currently. The details are as shown in the table below:

|       Monitoring Item       |                Unit                | Description | Statistic Method |
| :----------------- | :--------------------------------- | :----------------- | :----------------- |
| Memory Used of Instance |  Byte      | Used Memory of Instance | Memory Used at the Time of Collection |
| Memory Usage of Instance |    %    | Ratio of Used Memory and Total Memory of Instance | Memory Usage at the Time of Collection |
| Inbound and Outbound Traffic of Instance | KBps | Traffic Flowing in and out of JCS Through Intranet Every Second | Total Quantity of Data Received (Sent) at the Time of Collection/Monitoring Cycle |
| Instance QPS |  count/s  | Access Count Every Second | Requests at the Time of Collection/Monitoring Cycle |
| Instance Hit Ratio    |   %        | Probability of Hitting Cache by a Request | Requests Hit in Monitoring Cycle/Total Requests |
| Instance Key Number   |count       | Current Number of JCS Instance keys | Number of keys at the Time of Collection |
| Expired Key Count of Instance |count | Total count of keys with the Expire Time Set | For accumulative total value as of collection, re-calculate after instance reboots. |


## Monitoring Diagram

Currently, a line chart is displayed. The minimum period of sampling data is 1 minute. The display time is 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days and 14 days. You can select the date range on your own.

For more detailed monitoring indicator data, please click **Set Alarm Rules** on the right side of the page to redirect to the Monitoring menu; click **Monitoring Information** tab page to view it.

![监控图](https://github.com/jdcloudcom/cn/blob/redis-1/image/Redis/monitoring1.PNG)
