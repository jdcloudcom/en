# getApp


## Description
Get Application

## Request Method
GET

## Request Address
https://ias.jdcloud-api.com/v1/regions/{regionId}/app/{clientId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**clientId**|String|True| |Application ID, which is a 16-bits digital ID assigned by JD Cloud when creating the application|
|**regionId**|String|True| |For region code, please refer to common declaration of OpenAPI|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result|Obtain application returned results|

### Result
|Name|Type|Description|
|---|---|---|
|**accessTokenValiditySeconds**|Integer|Period of Validity of Access Tokens|
|**account**|String|Create Application Account User Name|
|**clientId**|String|Application ID, which is a 16-bits digital ID assigned by JD Cloud|
|**clientName**|String|Application Name|
|**clientUri**|String|Application Introduction Address|
|**contacts**|String|Application Contact Information|
|**createTime**|Long|Application Creation Time|
|**extension**|String|Application Extension Information|
|**grantTypes**|String|Supported OAuth types|
|**jwks**|String|JWKS|
|**jwksUri**|String|JWKS Address|
|**logoUri**|String|Application Logo Address|
|**multiTenant**|Boolean|Whether it is a multi-tenant application|
|**policyUri**|String|Application Privacy Terms Address|
|**redirectUris**|String|Callback Address|
|**refreshTokenValiditySeconds**|Integer|Refresh Period of Validity of Tokens|
|**responseTypes**|String|When grantTypes is authorization_code, then responseTypes is code; when grantTypes is implicit, responseTypes is tokenen|
|**scope**|String|Authorization Scope of OAuth Scope|
|**secretUpdateTime**|Long|Update Time of Application Password|
|**tokenEndpointAuthMethod**|String|Client Verification Mode|
|**tosUri**|String|Application Service Protocol Address|
|**updateTime**|Long|Application Update Time|
|**userType**|String|Account Types Allowed to Login Application|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
