# updateGroup


## Description
Modify user groups

## Request Method
PUT

## Request Address
https://iam.jdcloud-api.com/v1/group/{groupName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**groupName**|String|True| |Name of User Group|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**updateGroupInfo**|UpdateGroupInfo|True| | |

### UpdateGroupInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|False| |User Group Description|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
