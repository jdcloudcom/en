# describeVpcs


## Description
Search Virtual Private Cloud List

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/vpcs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Page size; it is 20 by default; value range[20, 100]|
|**name**|String|False| |Name of VPC|
|**filters**|[Filter[]](#filter)|False| |vpcId - VPC ID, exact match, supporting multiple<br>|

### <div id="Filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**vpcs**|[Vpc[]](#vpc)| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Page size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
### <div id="Vpc">Vpc</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region code, e.g. cn-east-tz1|
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
