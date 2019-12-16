# queryResource


## Description
You can search corresponding resource id by tags with this API <br/>


## Request Method
POST

## Request Address
https://resource-tag.jdcloud-api.com/v1/regions/{regionId}/queryResource

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

Description: When cdn resources are searched, please specify regionId in url as cn-all

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**queryResource**|QueryResourceReqVo|True| |Search parameter object of resource id|

### QueryResourceReqVo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**serviceCode**|String|True| |Product Line Name List<br>Name of Product Line Supported by the Tag System<br>- vm               disk        sqlserver  es          mongodb               ip<br>- memcached        redis       drds       rds         database              db_ro<br>- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn<br>- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq<br>|
|**tagFilters**|TagFilter[]|False| |Tag Filter List|
|**operator**|String|False|and|Operation Items (the and/or relationship between multiple tagFilters is supported and the default relationship is and)|
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
|**resourceIds**|String[]|Resources id Set|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
