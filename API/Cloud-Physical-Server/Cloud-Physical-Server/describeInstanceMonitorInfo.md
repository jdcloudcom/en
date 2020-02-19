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
|**filters**|[Filter[]](describeinstancemonitorinfo#filter)|False| |metric - monitoring indicator, exact matching, supporting multiple indicators, with details below<br/><br>cps.cpu.util - CPU Utilization Rate<br/><br>cps.memory.util - Memory Utilization Rate<br/><br>cps.memory.used - Memory Used<br/><br>cps.disk.used - Disk Used<br/><br>cps.disk.util - Disk Utilization Rate<br/><br>cps.disk.bytes.read - Disk Read Traffic<br/><br>cps.disk.bytes.write - Disk Write Traffic<br/><br>cps.disk.counts.read - Disk Read IOPS<br/><br>cps.disk.counts.write - Disk Write IOPS<br/><br>cps.network.bytes.ingress - Network Interface Ingress Traffic<br/><br>cps.network.bytes.egress - Network Interface Egress Traffic<br/><br>cps.network.packets.ingress - Network Ingress Packets<br/><br>cps.network.packets.egress - Network Egress Packets<br/><br>cps.avg.load1 - CPU Average Load 1min<br/><br>cps.avg.load5 - CPU Average Load 5min<br/><br>cps.avg.load15 - CPU Average Load 15min<br/><br>cps.tcp.connect.total - TCP Total Connection<br/><br>cps.tcp.connect.established - TCP Normal Connection<br/><br>cps.process.total - Total Process Count<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeinstancemonitorinfo#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**metricDatas**|[MetricData[]](describeinstancemonitorinfo#metricdata)| |
### <div id="metricdata">MetricData</div>
|Name|Type|Description|
|---|---|---|
|**data**|[MetricValue[]](describeinstancemonitorinfo#metricvalue)|Monitoring Indicator Data|
|**tags**|[MetricTag[]](describeinstancemonitorinfo#metrictag)|Monitoring Indicator Tag|
|**metric**|[MetricInfo](describeinstancemonitorinfo#metricinfo)|Monitoring Indicator Overview|
### <div id="metricinfo">MetricInfo</div>
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Statistical Unit of Monitoring Data|
|**metirc**|String|Monitoring Data Index|
|**metricName**|String|Monitoring Data Index Description|
|**aggregator**|String|Monitoring Data Aggregation Method|
|**period**|String|Statistical Period of Monitoring Data|
### <div id="metrictag">MetricTag</div>
|Name|Type|Description|
|---|---|---|
|**tagKey**|String|Monitoring Data Tag|
|**tagValue**|String|Monitoring Data Tag Data|
### <div id="metricvalue">MetricValue</div>
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
