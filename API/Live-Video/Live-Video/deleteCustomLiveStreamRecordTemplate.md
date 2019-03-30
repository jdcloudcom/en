# deleteCustomLiveStreamRecordTemplate


## Description
Delete user customized record template

## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/recordCustoms/{template}

|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**template**|String|True|Recording Template Customized Name|


## Request Parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|requestId|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
