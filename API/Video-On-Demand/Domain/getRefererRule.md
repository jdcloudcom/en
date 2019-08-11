# getRefererRule


## Description
Search configuration of CDN domain Referer anti-leech rule

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}:getRefererRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search configuration result of CDN domain Referer anti-leech rule|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**ruleType**|String|Value of rule type is 'referer'|
|**config**|RefererRuleConfigObject|Configuration Object of Referer Anti-Leech Rule|
|**enabled**|Boolean|Enable the rule or not|
### RefererRuleConfigObject
|Name|Type|Description|
|---|---|---|
|**strategy**|String|Enabling policy. Value range: <br>  denial - deny<br>  allowance - allow<br>|
|**domains**|String[]|Referer Domain List|
|**allowBlank**|Boolean|If it is allowed to set the request header Referer null. If yes, please direct access via the browser, etc.|

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
https://vod.jdcloud-api.com/v1/domains/2:getRefererRule

```

## Return Example
```
{
    "code": 200, 
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "config": {
            "allowBlank": false, 
            "domains": [
                "www.lomagicode.com", 
                "www.luomo.io"
            ], 
            "strategy": "allowance"
        }, 
        "enabled": true, 
        "ruleType": "referer"
    }
}
```
