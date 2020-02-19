# setURLRule


## Description
Set CDN domain URL authentication rule

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}:setURLRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**config**|[URLRuleConfigObject](seturlrule#urlruleconfigobject)|True| |URL authentication rule configuration object|
|**enabled**|Boolean|True| |Enable the rule or not|

### <div id="urlruleconfigobject">URLRuleConfigObject</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authType**|String|True| |Authentication Type. Value range: <br>  by_params - parameter authentication<br>  by_path - path authentication<br>|
|**authKey**|String|True| |Authentication Key|

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
POST
```
https://vod.jdcloud-api.com/v1/domains/2:setURLRule

```
```
{
    "config": {
        "authKey": "Secret001", 
        "authType": "by_params"
    }, 
    "enabled": true
}
```

