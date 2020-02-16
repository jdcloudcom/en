# queryAccessAuths


## Description
Search access authorization list

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessAuths

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**filters**|[Filter[]](queryaccessauths#filter)|False| |auth_user_type - authorization type, all types by default<br>auth_user_id - user identifier, exact match, jd_cloud (JD Cloud User), jd_apikms (api gateway signature key pair), jd_subscription_key (subscribe key pair), jd_cloud_pin (activated user)<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryaccessauths#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accessAuths**|[AccessAuth[]](queryaccessauths#accessauth)|Access authorization details|
|**totalCount**|Integer|Access authorizations searched|
### <div id="accessauth">AccessAuth</div>
|Name|Type|Description|
|---|---|---|
|**accessAuthId**|String|Access Authorization ID|
|**authUserType**|String|Authorized User Type|
|**accessKey**|String|Access Key|
|**description**|String|Description|
|**bindGroups**|String|Associated group, separated by English comma|
|**appId**|String|appid of api Caller|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
