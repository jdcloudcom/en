# describeQuotas


## Description
Search (ag) quota

## Request Method
GET

## Request Address
https://ag.jdcloud-api.com/v1/regions/{regionId}/quotas

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |resourceTypes - Resource type, currently supporting [ag]<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**quotas**|Quota[]|Quota List|
### Quota
|Name|Type|Description|
|---|---|---|
|**resourceType**|String|Resource Type [ag]|
|**limit**|Integer|Quota Cap|
|**used**|Integer|Quota Used|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
