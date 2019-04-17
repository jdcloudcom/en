# describeUserAccessKeys


## Description
Search AccessKey list

## Request Method
GET

## Request Address
https://iam.jdcloud-api.com/v1/regions/{regionId}/userAccessKeys

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**userAccessKeys**|UserAccessKey[]|userAccessKey list|
### UserAccessKey
|Name|Type|Description|
|---|---|---|
|**accessKey**|String|accessKey|
|**accessKeySecret**|String|accessKeySecret|
|**createTime**|String|Creation Time|
|**state**|Integer|Disabled/Enabled Status [0-Disabled, 1-Enabled]|
|**yn**|Integer|Deleted/Valid Status [0-Deleted, 1-Valid]|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
