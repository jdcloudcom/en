# getURLRule


## Description
Search configuration of CDN domain URL authentication rule

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}:getURLRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](geturlrule#result)|Search configuration result of CDN domain URL authentication rule|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**ruleType**|String|Value of rule type is 'url'|
|**config**|[URLRuleConfigObject](geturlrule#urlruleconfigobject)|URL authentication rule configuration object|
|**enabled**|Boolean|Enable the rule or not|
### <div id="urlruleconfigobject">URLRuleConfigObject</div>
|Name|Type|Description|
|---|---|---|
|**authType**|String|Authentication type. Value range: <br>  by_params - parameter authentication<br>  by_path - path authentication<br>|
|**authKey**|String|Authentication Key|

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
https://vod.jdcloud-api.com/v1/domains/2:getURLRule

```

## Return Example
```
{
    "code": 200, 
    "requestId": "edfc74ea-be4c-418b-b841-31ddd2b33203", 
    "result": {
        "config": {
            "authKey": "Secret001", 
            "authType": "by_params"
        }, 
        "enabled": true, 
        "ruleType": "url"
    }
}
```
