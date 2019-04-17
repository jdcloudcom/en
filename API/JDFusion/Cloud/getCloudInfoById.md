# getCloudInfoById


## Description
Obtain designated cloud information

## Request Method
GET

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
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**cloud**|CloudInfo| |
### CloudInfo
|Name|Type|Description|
|---|---|---|
|**id**|String| |
|**info**|Object| |
|**metadata**|Object| |
|**name**|String| |
|**vendor**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|User not found|
