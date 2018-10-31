# Performance Monitoring

Currently, there are six types of monitoring: Memory Usage, Memory Utilization Rate, Intranet Inbound and Outbound Traffic, QPS, Hit Ratio, and the Number of Instance Keys:

1. Log in to the [JCS for Redis Console](https://redis-console.jdcloud.com/redis) to locate the target instance.

2. Click **Instance Name** to go to the details of the instance page.

3. In the navigation tab above, select **Monitoring**.

4. Select **Monitoring Time** to view.

5. In the upper right corner, you can set the alarm rules, or click to enter the alarm rules page of Monitoring.


## Monitoring Items

- Memory Usage (MByte): Used memory of cloud cache;

- Memory Utilization Rate (%): The ratio of used memory to total memory in the cloud cache;

- Inbound and Outbound Traffic (kbps) of Intranet: Traffic flowing in and out of the cloud cache through the intranet every second;

- QPS (times/s): Number of visits per second;

- Hit Ratio (%): The probability of requesting a hit cache;

- Number of instance keys (piece): The current number of JCS for Redis instance keys.

## Monitoring Diagram

Currently, a line chart is displayed. The minimum period of sampling data is 1 minute. The display time is 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days and 14 days. You can also select the date range by yourself.

If you want to view more detailed monitoring indicator data, please visit the Monitoring menu.

![Monitoring](https://github.com/jdcloudcom/cn/tree/edit/image/Redis/monitoring.png)
