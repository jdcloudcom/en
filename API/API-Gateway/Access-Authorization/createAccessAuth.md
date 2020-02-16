# createAccessAuth


## Description
Create access authorization

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessAuths

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accessAuthView**|[AccessAuthView](createaccessauth#accessauthview)|False| |api Group|

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
|**result**|[Result](createaccessauth#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accessAuthId**|String|Created access authorization ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
