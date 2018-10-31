# createInstance


## Description
Create Instance

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceSpec**|InstanceSpec|True| |Create instance request parameters|

### InstanceSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bp**|Integer|False| |Minimum Bandwidth: Unit: Gbps|
|**buyType**|Integer|False| |Purchase Type: 1->newly purchased  3->upgraded|
|**bw**|Integer|False| |Business Bandwidth: Unit: Mbps|
|**carrier**|String|False| |ISP Line: TELECOM->China Telecom's ISP Line  UNICOM->Unicom's ISP Line CMCC->CMCC's ISP Line|
|**ep**|Integer|False| |Elastic Bandwidth: Unit: Gbps|
|**name**|String|False| |Instance Name|
|**returnUrl**|String|False| |The page jumped to after the payment succeeds. The field is transferred in the console interaction mode|
|**timeSpan**|Integer|False| |Purchase Duration|
|**timeUnit**|Integer|False| |Purchase Duration Unit: 3->month  4->year|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**orderId**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
