# getHttpSsl


## Description
Search configuration of CDN domain SSL

## Request Method
GET

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}:getHttpSsl

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](gethttpssl#result)|Search configuration results of CDN domain SSL|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**source**|String|Certificate Sources. Value range: default|
|**title**|String|Certificate Title|
|**sslCert**|String|Credential Content|
|**sslKey**|String|Credential Private Key|
|**jumpType**|String|Redirect Type. Value range: <br>default - Adopt the default protocol of back-to-origin domain<br>http - Enforce http protocol back-to-origin<br>https - Enforce https protocol back-to-origin<br>|
|**enabled**|Boolean|Enabling Status of SSL Configuration|

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
https://vod.jdcloud-api.com/v1/domains/2:getHttpSsl

```

## Return Example
```
{
    "code": 200, 
    "requestId": "b81638b2-93a2-4541-97d7-db01a8f56aa9", 
    "result": {
        "enabled": false, 
        "jumpType": "https", 
        "source": "default", 
        "sslCert": "-----BEGIN CERTIFICATE----- ... -----END CERTIFICATE-----", 
        "sslKey": "-----BEGIN RSA PRIVATE KEY----- ... -----END RSA PRIVATE KEY-----", 
        "title": "Testing Certificate"
    }
}
```
