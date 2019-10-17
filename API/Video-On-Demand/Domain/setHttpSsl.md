# setHttpSsl


## Description
Set SSL Configuration of CDN Domain

## Request Method
POST

## Request Address
https://vod.jdcloud-api.com/v1/domains/{domainId}:setHttpSsl

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Long|True| |Domain Name ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**source**|String|False| |Certificate Sources. Value range: default|
|**title**|String|False| |Certificate Title|
|**sslCert**|String|False| |Credential Content|
|**sslKey**|String|False| |Credential Private Key|
|**jumpType**|String|False| |Redirect Type. Value range: <br>default - Adopt the default protocol of back-to-origin domain<br>http - Enforce http protocol back-to-origin<br>https - Enforce https protocol back-to-origin<br>|
|**enabled**|Boolean|False| |Enabling Status of SSL Configuration|


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
https://vod.jdcloud-api.com/v1/domains/2:setHttpSsl

```
```
{
    "enabled": true, 
    "jumpType": "https", 
    "source": "default", 
    "sslCert": "-----BEGIN CERTIFICATE----- ... -----END CERTIFICATE-----", 
    "sslKey": "-----BEGIN RSA PRIVATE KEY----- ...  -----END RSA PRIVATE KEY-----", 
    "title": "Testing Certificate"
}
```

