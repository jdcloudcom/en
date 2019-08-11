# describeSnapshotBinding


## Description
Search Snapshot Template Association


## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/snapshotTemplates/{template}:binding

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**template**|String|True| |Snapshot Template|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**bindingList**|TemplateBinding[]|Snapshot Template Association Set|
### TemplateBinding
|Name|Type|Description|
|---|---|---|
|**publishDomain**|String|Pushing Streaming Domain|
|**appName**|String|Application Name|
|**streamName**|String|Stream Name|
|**template**|String|Template|

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
GET
```
https://live.jdcloud-api.com/v1/snapshotTemplates/template:binding
```

## Return Example
```
{
    "code": 200, 
    "requestId": "xxxxx", 
    "result": {
        "bindingList": [
            {
                "publishDomain": "push.yourdmain.com", 
                "template": "snapshot-test"
            }, 
            {
                "appName": "live", 
                "publishDomain": "push.yourdmain.com", 
                "template": "snapshot-test"
            }, 
            {
                "appName": "live", 
                "publishDomain": "push.yourdmain.com", 
                "streamName": "streamName", 
                "template": "snapshot-test"
            }
        ]
    }
}
```
