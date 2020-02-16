# queryUcAccessKeys


## Description
Search key pair list

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/ucAccessKeys

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**filters**|[Filter[]](queryucaccesskeys#filter)|False| |accessKey - accesskey, exact matching<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryucaccesskeys#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accessKeys**|[UcAccessKey[]](queryucaccesskeys#ucaccesskey)|Key Pair Information|
|**totalCount**|Integer|Key Pair Counts Searched|
### <div id="ucaccesskey">UcAccessKey</div>
|Name|Type|Description|
|---|---|---|
|**accessKeyStatus**|String|Key Pair Transfer Status|
|**accessKey**|String|Access Key|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
