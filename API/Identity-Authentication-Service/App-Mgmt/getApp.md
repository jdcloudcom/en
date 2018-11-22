# getApp


## Description
Get application details

## Request Method
GET

## Request Address
https://ias.jdcloud-api.com/v1/regions/{regionId}/app/{clientId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**clientId**|String|True| |Application ID, the 16-number ID assigned by JD Cloud at the time of creation|
|**regionId**|String|True| |For region code, please refer to common declaration of OpenAPI|

## Request Parameter
None

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result|Returned Results|

### Result
|Name|Type|Description|
|---|---|---|
|**account**|String|Create Application Account User Name|
|**clientId**|String|Application ID|
|**clientName**|String|clientName|
|**redirectUris**|String|redirectUris|
|**tokenEndpointAuthMethod**|String|tokenEndpointAuthMethod|
|**grantTypes**|String|grantTypes|
|**accessTokenValiditySeconds**|Integer|accessTokenValiditySeconds|
|**refreshTokenValiditySeconds**|Integer|refreshTokenValiditySeconds|
|**multiTenant**|Boolean|multiTenant|
|**userType**|String|userType|
|**scope**|String|scope|
|**secretUpdateTime**|Integer|Update Time Stamp of secret|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
