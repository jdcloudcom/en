# describeViewTree


## Description
Query all basic resolution ISP lines of JD Cloud resolution.  
Please call this interface to get ID of resolution ISP lines before using parameters of resolution ISP lines.


## Request Method
GET

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/viewTree

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**loadMode**|Integer|False| |Exhibition method, not used now|
|**packId**|Integer|True| |Package ID, 0->Free Version 1->Enterprise Version 2->Advanced Enterprise Version|
|**viewId**|Integer|True| |view ID, default-1|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ID of Request at this time|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|ViewTree[]|Resolution ISP Line Tree|
### ViewTree
|Name|Type|Description|
|---|---|---|
|**disabled**|Boolean|Is resolution ISP Line disabled|
|**label**|String|Resolution ISP Line Description|
|**leaf**|Boolean|Is the data the leaf node|
|**value**|Integer|Resolution ISP Line ID|
|**viewName**|String|Name of resolution ISP Line, it is used at the location where the viewName parameter is used. If it is null, it means this resolution ISP Line cannot be directly used and please use its sub-line.|
|**children**|ViewTree[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
