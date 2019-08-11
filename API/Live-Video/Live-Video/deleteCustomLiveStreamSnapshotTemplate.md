# deleteCustomLiveStreamSnapshotTemplate


## Description
Delete user customized live snapshot template
- Before deleting snapshot template, please delete the snapshot configuration associated with the template first, otherwise on-line business will be affected


## Request Method
DELETE

## Request Address
https://live.jdcloud-api.com/v1/snapshotCustoms/{template}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**template**|String|True| |Snapshot Template|

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
https://live.jdcloud-api.com/v1/snapshotCustoms/yoursnapshottemplate
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41"
}
```
