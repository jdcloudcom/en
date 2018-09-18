# describeIpResourceFlow


## Description
Search the EIP monitoring traffic

## Request method
GET

## Request address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}/monitorFlow

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|True||EIP address|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|False||Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|IpResourceFlow||
### <a name="IpResourceFlow">IpResourceFlow</a>
|Name|Type|Description|
|---|---|---|
|**bps**|IpResourceFlowDetail||
|**pps**|IpResourceFlowDetail||
### <a name="IpResourceFlowDetail">IpResourceFlowDetail</a>
|Name|Type|Description|
|---|---|---|
|**times**|String[]|Time point|
|**used**|Integer[]|Use value of corresponding time point|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
