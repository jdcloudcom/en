# describeGroup


## Description
Search details of user groups

## Request Method
GET

## Request Address
https://iam.jdcloud-api.com/v1/group/{groupName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**groupName**|String|True| |Name of User Group|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**group**|GroupDetail|User Group Information|
### GroupDetail
|Name|Type|Description|
|---|---|---|
|**groupId**|String|User Group ID|
|**name**|String|User Group name|
|**jrn**|String|JD Cloud Resource Identifier (jrn)|
|**description**|String|User Group Description|
|**createTime**|String|Creation Time of User Group|
|**updateTime**|String|Update Time of User Group|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
