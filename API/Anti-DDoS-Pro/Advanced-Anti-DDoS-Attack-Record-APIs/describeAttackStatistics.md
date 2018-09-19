# describeAttackStatistics


## Description
Query the attack counts and traffic peak value

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog/describeAttackStatistics

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|True||Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|String[]|False||Advanced Anti-DDoS instance ID|
|**startTime**|String|True||Start time, up to the latest 30 days, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**type**|Integer|True||Attack type, 0 is DDos, and 1 is CC|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### Result
|Name|Type|Description|
|---|---|---|
|**count**|Integer|Attack counts|
|**flow**|Number|Attack traffic peak value|
|**unit**|String|Traffic Unit, bps, Kbps, Mbps, Gbps|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
