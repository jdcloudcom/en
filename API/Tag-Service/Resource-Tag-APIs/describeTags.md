# describeTags


## Description
You can search all tags via this API<br/>



## Request Method
POST

## Request Address
https://resource-tag.jdcloud-api.com/v1/regions/{regionId}/describeTags

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

Description: When cdn resources are searched, please specify regionId in url as cn-all. When all region tags are searched, please specify regionId in url as all-region.

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**tagKeysVo**|TagsReqVo|True| |Tag Parameter|

### TagsReqVo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**serviceCodes**|String[]|False| |Product Line Name List<br>Name of Product Line Supported by the Tag System<br>- vm               disk        sqlserver  es          mongodb               ip<br>- memcached        redis       drds       rds         database              db_ro<br>- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn<br>- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq<br>|
|**kind**|String|False|all|The values of search type include all and cost<br/><br>all: refer to search tags of all types, which is the default value and is not required to be uploaded<br>cost: refer to search tags with cost attribute<br>|
|**tagFilters**|TagFilter[]|False| |Tag Filter List|
### TagFilter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|False| |Tag Key|
|**values**|String[]|False| |Tag Value List|
|**operator**|String|False|eq|Operation option, eq by default, which means exact matching|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Response Result Object|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|TagsResVo|Obtain tag result details|
### TagsResVo
|Name|Type|Description|
|---|---|---|
|**pin**|String|User pin|
|**region**|String|Region Name|
|**tags**|Tag[]|Tag Array|
### Tag
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
