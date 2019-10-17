# describeInstanceMonitorInfo


## Description
Search Cloud Physical Server monitoring information

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/monitor

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|
|**instanceId**|String|True| |Cloud Physical Server ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|Long|False| |Time Stamp of Start Time, Format: 1562915166551|
|**endTime**|Long|False| |Time Stamp of End Time, Format: 1562915166551|
|**metrics**|String[]|False| |cps.cpu.util - CPU Util<br/><br>cps.memory.util - Memory Util<br/><br>cps.memory.used - Memory Used<br/><br>cps.disk.used - Disk Used<br/><br>cps.disk.util - Disk Util<br/><br>cps.disk.bytes.read - Disk Read Traffic<br/><br>cps.disk.bytes.write - Disk Write Traffic<br/><br>cps.disk.counts.read - IOPS for Disk Counts Read<br/><br>cps.disk.counts.write - IOPS for Disk Counts Write<br/><br>cps.network.bytes.ingress - Network Interface Ingress Traffic<br/><br>cps.network.bytes.egress - Network Interface Egress Traffic<br/><br>cps.network.packets.ingress - Network Ingress Packets <br/><br>cps.network.packets.egress - Network Egress Packets<br/><br>cps.avg.load1 - CPU Average Load 1min<br/><br>cps.avg.load5 - CPU Average Load 5min<br/><br>cps.avg.load15 - CPU Average Load 15min<br/><br>cps.tcp.connect.total - TCP Total Connection <br/><br>cps.tcp.connect.established - TCP Normal Connection<br/><br>cps.process.total - Total Process Count<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**metricDatas**|MetricData|Cloud Physical Server Monitoring Information|
### MetricData
|Name|Type|Description|
|---|---|---|
|**data**|MetricValue[]|Monitoring Indicator Data|
|**tags**|MetricTag[]|Monitoring Indicator Tag|
|**metric**|MetricInfo|Monitoring Indicator Overview|
### MetricInfo
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Statistical Unit of Monitoring Data|
|**metirc**|String|Monitoring Data Index|
|**metricName**|String|Monitoring Data Index Description|
|**aggregator**|String|Monitoring Data Aggregation Method|
|**period**|String|Statistical Period of Monitoring Data|
### MetricTag
|Name|Type|Description|
|---|---|---|
|**tagKey**|String|Monitoring Data Tag|
|**tagValue**|String|Monitoring Data Tag Data|
### MetricValue
|Name|Type|Description|
|---|---|---|
|**timestamp**|Long|Data Collection Time, Format: 1562915166551|
|**value**|String|Collected Data|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
