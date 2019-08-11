# setRefererRule


## Description
Set CDN domain Referer anti-leech rule

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}:setRefererRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**config**|RefererRuleConfigObject|True| |Configuration Object of Referer Anti-Leech Rule|
|**enabled**|Boolean|True| |Enable the rule or not|

### RefererRuleConfigObject
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**strategy**|String|True| |Enabling Policy. Value range: <br>  denial - deny<br>  allowance - allow<br>|
|**domains**|String[]|True| |Referer Domain List|
|**allowBlank**|Boolean|True| |If it is allowed to set the request header Referer null. If yes, please direct access via the browser, etc.|

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
https://vod.jdcloud-api.com/v1/domains/2:setRefererRule

```
```
{
    "config": {
        "allowBlank": false, 
        "domains": [
            "example1.lomagicode.com", 
            "example2.lomagicode.com"
        ], 
        "strategy": "allowance"
    }, 
    "enabled": true
}
```

