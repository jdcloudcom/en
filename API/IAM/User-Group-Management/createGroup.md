# createGroup


## Description
Create user groups

## Request Method
POST

## Request Address
https://iam.jdcloud-api.com/v1/group


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**createGroupInfo**|CreateGroupInfo|True| | |

### CreateGroupInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Group name: It supports 4 to 32-digit letters, numbers as well as - and _, and it must begin with a letter|
|**description**|String|False| |Description, 0~256 Characters|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**group**|CreateGroupRes|User Group Information|
### CreateGroupRes
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
