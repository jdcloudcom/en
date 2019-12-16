# unTagResources


## Description
You can disassociate resource tags with this API<br/>



## Request Method
POST

## Request Address
https://resource-tag.jdcloud-api.com/v1/regions/{regionId}/tags:unTagResources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

Description: When cdn resources are disassociated, please specify regionId in url as cn-all


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**unTagResources**|UnTagResourcesReqVo|True| |Disassociate tag parameter|

### UnTagResourcesReqVo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**resources**|ResourcesMap[]|True| |Disassociate tags from designated product lines and resources. Now, only tag disassociation from resources from the same product line is supported|
|**tags**|Tag[]|True| |Tag Array|
### Tag
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|True| |Tag Key|
|**value**|String|True| |Tag Value|
### ResourcesMap
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**serviceCode**|String|True| |Product Line Name List<br>Name of Product Line Supported by the Tag System<br>- vm               disk        sqlserver  es          mongodb               ip<br>- memcached        redis       drds       rds         database              db_ro<br>- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn<br>- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq<br>|
|**resourceId**|String[]|True| |Resource id List|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Response Result Object|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|UnTagResourcesResVo|Resource Tag Disassociation Result Details|
### UnTagResourcesResVo
|Name|Type|Description|
|---|---|---|
|**pin**|String|User pin|
|**region**|String|Region Name|
|**failedResourcesMap**|FailedResourcesMap[]|Disassociation Failure List|
|**successCount**|Integer|Successful Disassociation Times Between Resources and Tags|
### FailedResourcesMap
|Name|Type|Description|
|---|---|---|
|**resourceId**|String|Resources id|
|**msg**|String|Failure reasons for association or disassociation between resource and tag|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
