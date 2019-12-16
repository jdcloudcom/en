# describeAliasIps


## Description
Search alias IP list

## Request Method
GET

## Request Address
https://edcps.jdcloud-api.com/v1/regions/{regionId}/aliasIps

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, calling APIs (describeEdCPSRegions) to get regions supported by Distributed Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Page size; it is 20 by default; value range[20, 100]|
|**subnetId**|String|False| |Subnet ID|
|**instanceId**|String|False| |Instance ID|
|**cidr**|String|False| |CIDR Fragment, Fuzzy Search|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**aliasIps**|[AliasIp[]](#aliasip)| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Page size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
### <div id="AliasIp">AliasIp</div>
|Name|Type|Description|
|---|---|---|
|**instanceId**|String|Instance ID|
|**region**|String|Region|
|**az**|String|Availability Zone|
|**subnetId**|String|Subnet ID|
|**secondaryCidrId**|String|Secondary cidr ID|
|**aliasIpId**|String|Alias IP ID|
|**cidr**|String|cidr Fragment|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
