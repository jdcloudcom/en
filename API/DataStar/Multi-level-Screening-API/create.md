# create


## Description
Create Multi-level Filter

## Request Method
POST

## Request Address
https://datastar.cn-south-1.jdcloud-api.com/v1/v1/regions/{regionId}/profileMultiLevel/create

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**dimensions**|String|True| |For multi-level filtered tags, please separate multiple tags with English commas. Maximum three tags can be transmitted.|
|**mallId**|String|True| |Mall ID|
|**profileId**|String|True| |Task ID of Customized Image|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID, requests are different at each time|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|String|Multi-level Filtered Task ID|
|**message**|String|Description Information|
|**status**|Boolean|true is success, false is failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
