# describeAccessPoint


## Description
View access point APIs

## Request Method
GET

## Request Address
https://jcq.jdcloud-api.com/v1/regions/{regionId}/topics/{topicName}/accessPoints

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of the Region|
|**topicName**|String|True| |topic Name|

## Request Parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**accessPoint**|AccessPoint| |
### AccessPoint
|Name|Type|Description|
|---|---|---|
|**httpAddress**|String|http Access Point|
|**sdkAddress**|String|sdk Access Point|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
