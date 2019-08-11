# setIPRule


## Description
Set CDN domain IP blacklist rule

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}:setIPRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**config**|IPRuleConfigObject|True| |Configuration Object of IP Blacklist Rule|
|**enabled**|Boolean|True| |Enable the rule or not|

### IPRuleConfigObject
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ips**|String[]|True| |IP Blacklist|

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
https://vod.jdcloud-api.com/v1/domains/2:setIPRule

```
```
{
    "config": {
        "ips": [
            "140.205.94.189", 
            "140.205.130.99"
        ]
    }, 
    "enabled": true
}
```

