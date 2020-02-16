# updateAccessAuth


## Description
Update access authorization

## Request Method
PATCH

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessAuths/{accessAuthId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**accessAuthId**|String|True| |Access Authorization ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accessAuthView**|[AccessAuthView](updateaccessauth#accessauthview)|False| |Access authorization details|

### <div id="accessauthview">AccessAuthView</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authUserType**|String|False| |Authorized User Type|
|**accessKey**|String|False| |Access Key|
|**deploymentIds**|String|False| |Separate deployed ids to be associated by comma|
|**description**|String|False| |Description|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](updateaccessauth#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accessAuthId**|String|Updated access authorization ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
