# modifyInstanceName


## Description
Modify the instance name

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:rename

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceSpec**|InstanceSpec|True| |Modify instance name request parameters by providing name field of InstanceSpec only|

### InstanceSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bp**|Integer|False| |Minimum Bandwidth: Unit: Gbps|
|**buyType**|Integer|False| |Purchase Type: 1->Newly Purchased 3->Upgraded|
|**bw**|Integer|False| |Business Bandwidth: Unit: Mbps|
|**carrier**|String|False| |ISP Line: TELECOM means China Telecom line, UNICOM means Unicom line, and CMCC means CMCC line|
|**ep**|Integer|False| |Elastic Bandwidth: Unit: Gbps|
|**name**|String|False| |Instance Name|
|**returnUrl**|String|False| |The page jumped to after the payment succeeds. The field is transferred in the console interaction mode|
|**timeSpan**|Integer|False| |Purchase Duration|
|**timeUnit**|Integer|False| |Purchase Duration Unit: 3 Months 4 Years|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
