# deleteApp


## Description
Delete Application

## Request Method
DELETE

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
|**result**|Result|Delete application returned results|

### Result
|Name|Type|Description|
|---|---|---|
|**count**|Integer|Deletion Result [1: deleted successfully, 0: deleted failed]|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
