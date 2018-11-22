# getApps


## Description
Get all applications under the account

## Request Method
GET

## Request Address
https://ias.jdcloud-api.com/v1/regions/{regionId}/app/list

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
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
|**apps**|ApplicationRes[]|Application Data|

### ApplicationRes
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
|**500**|Internal server error|
|**503**|Service unavailable|
