# deleteCustomLiveStreamRecordTemplate


## Description
Delete user customized record template
- Delete user customized record template


## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/recordCustoms/{template}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**template**|String|True| |Recording Template|

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

## Request Example
DELETE
```
https://live.jdcloud-api.com/v1/transcodeCustoms/yourrecordtemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
