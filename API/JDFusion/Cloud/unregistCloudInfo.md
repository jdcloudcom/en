# unregistCloudInfo


## Description
Obtain designated cloud information

## Request Method
DELETE

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/cloud_info/{cloudId}

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
|**204**|OK|
|**404**|User not found|
