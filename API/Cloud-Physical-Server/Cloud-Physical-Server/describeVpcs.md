# describeVpcs


## Description
Query virtual private cloud list

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/vpcs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Segmentation size; it is 20 by default; value range[20, 100]|
|**name**|String|False| |Name of VPC|
|**filters**|[Filter[]](describevpcs#filter)|False| |vpcId - VPC ID, exact match, supporting multiple<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describevpcs#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**vpcs**|[Vpc[]](describevpcs#vpc)| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Segmentation size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
### <div id="vpc">Vpc</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, e.g. cn-north-1|
|**vpcId**|String|VPC ID|
|**name**|String|Name of VPC|
|**cidr**|String|VPC CIDR|
|**description**|String|Description|
|**createTime**|String|Creation Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
