# createUserDomain


## Description
Add user domain

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/userdomain

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |Domain|
|**protocol**|String|False| |Protocol|
|**apiGroupId**|String|True| |api Group id|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createuserdomain#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**domainId**|String|Generated domainId|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
