# queryUserDomains


## Description
Search domian list

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/userdomain

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**orderBy**|String|False| |Sort types|
|**apiGroupId**|String|True| |api Group id|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryuserdomains#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer|total count|
|**data**|[DomainInfo[]](queryuserdomains#domaininfo)|key Details|
### <div id="domaininfo">DomainInfo</div>
|Name|Type|Description|
|---|---|---|
|**apiGroupId**|String|api Group id|
|**domainId**|String|Domain id|
|**domain**|String|Domain|
|**cname**|String|Resolved cname|
|**protocol**|String|Protocol used by domain|
|**createTime**|String|Creation time of domain|
|**status**|String|Domain Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
