# View NAT Gateway Monitoring Information
1. Open VPC Console https://cns-console.jdcloud.com/host/vpc/list

2. Click **NAT Gateway** on the navigation bar on left side**

3. In ID/ Name column, click **NAT Gateway Name** to be edited, go to the NAT Gateway Details

4. Enter the Monitoring page by click **Monitoring** in the Details to view monitoring information

Detailed description of monitoring item is as shown in the table below

| Monitoring Item | Description |
| :- | :- |
| Number of New Connections | Monitor and count up the total connections created (including those have already ended and been deleted) by NAT Gateway within the minimal granularity time. (Unit: Piece) |
| Number of Active Connections | Monitor and count up the sampling value of active concurrent connections (including all statuses of TCP) of NAT Gateway. A zero value indicates that no connection is activated through the NAT Gateway. |
| Public IP Rate (Inbound/Outbound)| Public network traffic generated through NAT Gateway Public IP, which is the average rate counted by inbound and outbound within the period of monitoring and statistics. Unit: bps |
| NAT Gateway Rate (Inbound/Outbound) | NAT Gateway rates, including traffic rates flowing in and out of the NAT Gateway. Unit: bps |
| Depletion Number of Source Port | The NAT Gateway assigns all available source ports of the designated 4-tuple (Destination IP/Target Port Number/Protocol Type/Source IP), so it is unable to assign the times of source ports. A value greater than zero indicates too many concurrent connections opened through the NAT Gateway. |

In different monitoring periods, the minimal granularities aggregated are mapped as follows (report once every 60s sampling):

| **Monitoring Period** | **Minimal Granularity** | **Sampling Point** |
| ------------ | ------------ | ---------- |
| 1 Hour        | 1 Minute        | 1 Piece        |
| 6 Hour        | 5 Minute        | 5 Piece        |
| 12 Hour       | 10 Minute       | 10 Piece       |
| 1 Day          | 20 Minute       | 20 Piece       |
| 3 Day          | 1 Hour        | 60 Piece       |
| 7 Day          | 2 Hour        | 120 Piece      |
| 1 Month        | 3 Hour        | 180 Piece      |

**Description for Aggregation Statistical Approach of Monitoring-side NAT Gateway Monitoring Items**

The monitoring items of Monitoring can aggregate the monitoring data within the designated statistical period. Now, the provided aggregation statistical approaches include: Average, maximum, minimum and summation.

Aggregation method is to aggregate based on the sampling data, average (avg): Calculate the average rate of all sampling values within the statistical period, maximum (max): Select the maximal value in the sampling values within the statistical period, minimum (min): Select the minimal value in the sampling values within the statistical period, summation (sum): Calculate the sum of all sampling values within the statistical period. The last in the options in aggregation method indicates the value of the last sampling point within the statistical period.

New connection means the increment within one sampling period. When the statistical period changes, it is calculated by summation in the aggregation, so the aggregation method shows sum;

Active connection means the data selected at the moment of sampling. When the statistical period changes, it is calculated by averaging in the aggregation by default, so the aggregation method shows avg;

**Best Practices of NAT Gateway Monitoring and Alarming**

Currently, NAT Gateway of different models offers different specifications and doesn't support automatic upgrade and downgrade. If customers want to monitor new connections per second and maximum active connections, they can manually upgrade the NAT Gateway when it alarms after reaching the approximate specification.

For example, a customer has created a medium NAT Gateway, with a maximum of 3 million active connections/30,000 new connections per second. If the customer sets an alarm rule as per 80% of the maximum, the customized monitoring and alarming are done by the following means:

For 30,000 new connections per second, set 80% as threshold and calculate it as per monitoring the minimal granularity in 1 minute, so the total new connections shall be 30000×60×80%=1440000. The aggregation method is summation; the statistical period is 1 minute; it alarms when the sum of new connections is greater than or equal to 1440000;

For a maximum of 3 million active connections, set 80% as threshold and calculate it as per monitoring the minimal granularity in 1 minute, so the total active connections shall be 3000000×80%=2400000. The aggregation method is maximum; the statistical period is 1 minute; it alarms when the maximum of active connections is greater than or equal to 2400000.