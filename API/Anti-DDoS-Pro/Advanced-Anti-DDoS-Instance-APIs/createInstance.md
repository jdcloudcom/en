# createInstance


## Description
Create an instance

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceSpec**|InstanceSpec|True||Instance type parameter|

### InstanceSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bp**|Integer|False||Minimum bandwidth: unit: Gbps|
|**buyType**|Integer|False||Purchase Type, 1->newly purchased  3->upgraded|
|**bw**|Integer|False||Business bandwidth: unit: Mbps|
|**carrier**|String|False||ISP Line: TELECOM->China Telecom's ISP line  UNICOM->Unicom's ISP line CMCC->CMCC's ISP line|
|**ep**|Integer|False||Elastic bandwidth: unit: Gbps|
|**name**|String|False||Instance Name|
|**returnUrl**|String|False||The page jumped to after the payment succeeds. The field is transferred in the console interaction mode|
|**timeSpan**|Integer|False||Purchase Duration|
|**timeUnit**|Integer|False||Purchase Duration Unit, 3->month  4->year|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### Result
|Name|Type|Description|
|---|---|---|
|**orderId**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
