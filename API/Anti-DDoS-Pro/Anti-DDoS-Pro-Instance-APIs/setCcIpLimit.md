# setCcIpLimit


## Description
Set the speed limit of each Ip of instance CC defense

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setCcIpLimit

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cCSpec**|CcIpLimitSpec|True||cc parameter|

### <a name="CcIpLimitSpec">CcIpLimitSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ccSpeedLimit**|Integer|False||Speed limit of each CC defense IP|
|**ccSpeedPeriod**|Integer|False||Speed limit statistic period of each CC defense IP|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
