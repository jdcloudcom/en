## Basic Concept
**Monitoring Indicator**  
Represent a data point set released to Monitoring and sorted by time. Indicators can be regarded as the variables to be monitored, and data points represent the value of the variables changing over time. For instance, the CPU utilization rate of a specific VM Instance is an indicator provided by JD Cloud Virtual Machine. Data points themselves can be from any application program or service activity from which you are collecting data. Cloud service resource will sent indicators to Monitoring. You can retrieve statistics on these data points by an ordered set of time series data.

**Indicator Data Aggregation**  
Monitoring will aggregate statistics based on the monitoring period length specified by you when retrieving statistics. When the monitoring period is 1 hour, the minimal granularity shall be 1 minute, which means each data point is the result of aggregating all data collected within one minute. In different monitoring periods, the minimal granularities aggregated are as follows:

Monitoring Period| Minimal Granularity
---|---
1 Hour | 1 Minute
6 Hours | 5 Minutes
12 Hour | 10 Minute
1 Day | 20 Minutes
3 Days | 1 Hour
7 Days | 2 Hours
1 Month | 3 Hours

**Monitoring Period**   
Refer to the monitoring time period of an indicator in Monitoring. The optional time periods: the monitoring period up to one month before the current day is supported. Period range that can be self-selected: 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days, 14 days and self-selection time period.

## Cloud Product Monitored
Cloud products monitored by Monitoring are as follows:
- Virtual Machines
- Cloud Disk Service
- Container Instance
- Pod
- JCS for Kubernetes
- Auto Scaling
- Function Service
- Elastic IP
- Load Balancer
- Direct Connection
- NAT Gateway
- RDS
- MongoDB
- DRDS
- JCS for Redis
- JCS for Memcached
- JCS for InfluxDB
- JCS for Greenplum
- Data Transmission DTS
- Object Storage Service
- Cloud File Service
- CDN
- JMR
- Message Queue
- API Gateway
- Queue Service
- JCS for Elasticsearch
- JD Distributed Service Framework
- Edge Network Tunnel
- Equal Edge Service
- JD Blockchain Open Platform
- IoT Core
- IoT Hub
- IoT Hub Protocol Adaptor
- IoT Edge
- Bastion
- Cloud Event
