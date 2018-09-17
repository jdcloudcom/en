# describeIpResourceInfo


## Description
Search the EIP basic information

## Request method
GET

## Request address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|True||EIP address|
|**regionId**|String|True||Belonging region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|[IpResourceInfo](##IpResourceInfo)||
### <a name="IpResourceInfo">IpResourceInfo</a>
|Name|Type|Description|
|---|---|---|
|**blackHoleThreshold**|Integer|Black hole threshold, unit: bps|
|**cleanThresholdBps**|Integer|Traffic rate of trigger cleaning, unit: bps|
|**cleanThresholdPps**|Integer|Package rate of trigger cleaning, unit: pps|
|**ip**|String|EIP address|
|**region**|String|Region, i.e. cn-north-1, cn-south-1, cn-east-1 and cn-east-2|
|**safeStatus**|Integer|Security status, 0->safe  1->clean  2->black hole|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
