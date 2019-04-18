# getCloudInfos


## Description
Obtain cloud registration information of the current user

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/cloud_info

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**driver**|String|False| |Only obtain cloud information of corresponding driver|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**clouds**|CloudInfo[]| |
### CloudInfo
|Name|Type|Description|
|---|---|---|
|**id**|String| |
|**name**|String| |
|**vendor**|String| |
|**info**|Object| |
|**metadata**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|User not found|
