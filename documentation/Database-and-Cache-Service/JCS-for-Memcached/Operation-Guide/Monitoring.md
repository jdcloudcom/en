# Instance Monitoring
At present, JCS for Memcached provides 26 monitoring indicators, which can be viewed via the monitoring steps below:

1. Log in Memcached console to position target instance

2. Click **Instance Name** to go to the Details of the instance.

3. Select **Monitoring** in the navigation tab above.

4. Select monitoring time to view.

5. In the upper right corner, you can set the alarm rules, or click to enter the alarm rules page of Monitoring.

## Monitoring Time Range:
The minimum period of sampling data is 2 minute. The display time is 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days and 14 days. You can also select the date range by yourself (within 30 days). If you want to view more detailed monitoring indicator data, please view the Monitoring menu.

## Monitoring Indicator
SN|Monitoring Item|English Description|Unit
:---|:--|:--|:---
1|Current Connections|	curr_connections|	Nr.
2	|Rejected Connections	|rejected_connections	|Nr.
3|	Outflow and Inflow Traffic|	OutFlow and InFlow	|MB/s
4|	Total Number of Bytes Sent|	bytes_written	|Byte
5	|Total Number of Bytes Read and Written|	bytes_written	|Byte
6	|Storage Occupancy Bytes|	Storage occupancy bytes|	Byte
7	|Total Number of Storage Data	|curr_items	|Nr.
8	|Number of Items Weeded Out by Iru|	evictions	|Nr.
9	|CPU Use Rate	|CPU Usage|	%
10|	Hits of the Command Get|	get_hits|	Nr.
11	|Misses of the Command Get|	get_misses	|Nr.
12|	Usage Times of the Command Get|	cmd_get|	Nr.
13	|Hits of the Command Delete	|delete_hits|Times
14|	Misses of the Command Delete	|delete_misses|	Times
15	|Hits of the Command Incr	|incr_hits	|Times
16|	Misses of the Command Incr	|incr_misses|	Times
17	|Hits of the Command Decr	|decr_hits	|Times
18|	Misses of the Command Decr|	decr_misses	|Times
19|	Hits of the Command Cas|	cas_hits	|Times
20	|Misses of the Command Cas|	cas_misses	|Times
21|Times of Modifying Life Circle by the 	Touch Command|	touch_hits|	Times
Current Connections|	curr_connections|	Nr.
23|	Processing Times of Authorization Command|	auth_cmds|	Times
24|	Number of Authorization Errors	|auth_errors	|Times
25|	Use Times of the Command Set|	cmd_set	|Times
26	|Request Number of the Command Flush|	cmd_flush	|Times
