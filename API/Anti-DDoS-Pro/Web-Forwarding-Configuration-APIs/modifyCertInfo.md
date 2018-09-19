# modifyCertInfo


## Description
Edit Certificate

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}:modifyCertInfo

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Belonging Region ID|
|**webRuleId**|String|True||Web Service Rule ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**certInfoModifySpec**|CertInfoModifySpec|True||Request Parameter of Editing Certificate|

### CertInfoModifySpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**httpsCertContent**|String|False||Certificate Content|
|**httpsRsaKey**|String|False||Private Key|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
