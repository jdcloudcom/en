# deleteLiveRecordFiles


## Description
Delete recording file


## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/recordFiles


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**fileIds**|String|True| |Recording file ID to be deleted, with commas (,) being used as separation between multiple IDs<br>|


## Return Parameter
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
https://live.jdcloud-api.com/v1/recordFiles?fileIds=aaa,bbb,ccc
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
