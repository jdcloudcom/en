# deleteVqdTemplate


## Description
Delete video quality detection templates

## Request Method
DELETE

## Request Address
https://vqd.jdcloud-api.com/v1/vqdTemplates/{templateId}


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**templateId**|String|True| |Template ID, path parameter|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

## Request Example
DELETE
```
https://vqd.jdcloud-api.com/v1/vqdTemplates/10000

```

