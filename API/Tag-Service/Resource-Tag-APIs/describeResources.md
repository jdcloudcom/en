# describeResources


## Description
You can search the association relation by resource id search tags and resources via this API<br/>


## Request Method
POST

## Request Address
https://resource-tag.jdcloud-api.com/v1/regions/{regionId}/tags:describeResources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

Description: When cdn resources are searched, please specify regionId in url as cn-all

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**resourceVo**|ResourceReqVo|True| |Resource Tag Parameter Object|

### ResourceReqVo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**serviceCodes**|String[]|False| |Product Line Name List<br>Name of Product Line Supported by the Tag System<br>- vm               disk        sqlserver  es          mongodb               ip<br>- memcached        redis       drds       rds         database              db_ro<br>- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn<br>- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq<br>|
|**resourceIds**|String[]|False| |Resource id List|
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
|**data**|ResourceResVo|Resource and Corresponding Tag List Details|
### ResourceResVo
|Name|Type|Description|
|---|---|---|
|**pin**|String|User pin|
|**region**|String|Region Name|
|**resourceTagMappingList**|ResourceTagMapping[]|Resource Tag Detail List|
### ResourceTagMapping
|Name|Type|Description|
|---|---|---|
|**jrn**|String|jrn is not required at this phase and is null by default|
|**serviceCode**|String|Product Line Name|
|**resourceId**|String|Resources id|
|**tags**|Tag[]|Array composed of tags associated to the resource|
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
