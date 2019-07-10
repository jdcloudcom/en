# describeSubUser


## Description
Search sub-user information

## Request Method
GET

## Request Address
https://iam.jdcloud-api.com/v1/subUser/{subUser}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**subUser**|String|True| |Sub-user Name|

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
|**subUser**|SubUser| |
### SubUser
|Name|Type|Description|
|---|---|---|
|**name**|String|User Name|
|**phone**|String|Mobile Phone Number|
|**email**|String|Email|
|**description**|String|Description Information|
|**account**|String|Primary Account|
|**createTime**|String|User Creation Time|
|**updateTime**|String|User Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
