# describeApiGroups


## Description
Search groups

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**filters**|[Filter[]](describeapigroups#filter)|False| |groupName - Group name, fuzzy matching, supporting a single group name<br>description - Description information, fuzzy matching, supporting a single description information<br>groupId - Group ID, exact matching<br>domain - Domain name, fuzzy matching<br>jdsfId - JD Distributed Service Gateway ID, exact matching<br>|
|**tagFilters**|[TagFilter[]](describeapigroups#tagfilter)|False| |Conditions for Tag Search|

### <div id="tagfilter">TagFilter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|True| |Tag Key|
|**values**|String[]|True| |Tag Value|
### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeapigroups#result)|Search Result Set|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**apiGroups**|[ApiGroup[]](describeapigroups#apigroup)|Searched API group details list|
|**totalCount**|Integer|Searched Group Counts|
### <div id="apigroup">ApiGroup</div>
|Name|Type|Description|
|---|---|---|
|**apiGroupId**|String|Group ID|
|**groupName**|String|Name|
|**description**|String|Description|
|**prefix**|String|Group Path Prefix|
|**version**|String|Version Number|
|**regionId**|String|Zone|
|**domain**|String|Domain|
|**environment**|String|Release environment information. In case of null, it is not released|
|**keyCheck**|String|Key pair verification mode: check_exist (Key pair must be configured in the access authorization) and no_check_exist (No need to configure in advance)|
|**authType**|String|Access authorization mode: None (No authentication), jd_cloud (Enable Access Authorization and must use the signature verification of AK and SK for JD Cloud) and hufu (hufu user)|
|**prefixStrip**|Integer|Whether to forward the group path to the backend service: 0 (not forward) and 1 (forward)|
|**groupType**|String|Group type: api_group (api group) and jdsf_group (JD Distributed Service group)|
|**jdsfName**|String|The name of JD Distributed Service Gateway|
|**jdsfRegistryName**|String|JD Distributed Service Registration Center ID|
|**jdsfId**|String|JD Distributed Service Gateway ID|
|**deploy**|Integer|Whether group is released: 0 (not released) and 1 (released)|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
