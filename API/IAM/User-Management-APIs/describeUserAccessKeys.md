# describeUserAccessKeys


## Description
Search AccessKey list

## Request method
GET

## Request address
https://iam.jdcloud-api.com/v1/regions/{regionId}/userAccessKeys

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
无


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**userAccessKeys**|[UserAccessKey[]](##UserAccessKey)|userAccessKey list|
### <a name="UserAccessKey">UserAccessKey</a>
|Name|Type|Description|
|---|---|---|
|**accessKey**|String|accessKey|
|**accessKeySecret**|String|accessKeySecret|
|**createTime**|String|Creation time|
|**state**|Integer|Disabled/enabled status [0-disabled, 1-enabled]|
|**yn**|Integer|Deleted/valid status [0-deleted, 1-valid]|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
