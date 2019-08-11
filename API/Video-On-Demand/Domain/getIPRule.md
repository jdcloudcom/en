# getIPRule


## Description
Search configuration of CDN domain IP blacklist rule

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}:getIPRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Search configuration result of CDN domain IP blacklist rule|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**ruleType**|String|The rule type value is 'ip'|
|**config**|IPRuleConfigObject|Configuration Object of IP Blacklist Rule|
|**enabled**|Boolean|Enable the rule or not|
### IPRuleConfigObject
|Name|Type|Description|
|---|---|---|
|**ips**|String[]|IP blacklist|

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
https://vod.jdcloud-api.com/v1/domains/2:getIPRule

```

## Return Example
```
{
    "code": 200, 
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "config": {
            "ips": [
                "140.205.94.189", 
                "140.205.130.99"
            ]
        }, 
        "enabled": true, 
        "ruleType": "ip"
    }
}
```
