# modifyInstanceCC


## Description
Set the instance CC defense

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setCC

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**cCSpec**|CCSpec|True||cc parameter|

### <a name="CCSpec">CCSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ccProtectMode**|Integer|False||cc defense mode, 0->normal  1->loose  2->critical  3->customized|
|**ccThreshold**|Integer|False||Threshold of CC defense|
|**hostQps**|Integer|False||When ccProtectMode is a customized mode, specify the protection threshold of each Host|
|**hostUrlQps**|Integer|False||When ccProtectMode is a customized mode, specify the protection threshold of each Host+URI|
|**ipHostQps**|Integer|False||When ccProtectMode is a customized mode, specify the protection threshold of each source IP to Host|
|**ipHostUrlQps**|Integer|False||When ccProtectMode is a customized mode, specify the protection threshold of each source IP to Host+URI|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
