# validCloudInfo


## Description
Verify AK and SK of designated cloud information

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/cloud_info/{cloudId}/valid

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudId**|String|True| |Cloud Information ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**401**|NOT PASS|
