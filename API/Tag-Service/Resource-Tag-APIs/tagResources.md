# tagResources


## Description
You can associate resource tags with this API<br/>



## Request Method
POST

## Request Address
https://resource-tag.jdcloud-api.com/v1/regions/{regionId}/tags:tagResources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

Description: When cdn resources are associated, please specify regionId in url as cn-all

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**tagResources**|TagResourcesReqVo|True| |Associate tag parameter|

### TagResourcesReqVo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**resources**|ResourcesMap[]|True| |Designated resources of designated product lines can be tagged. Now, tags can only be associated to resources from the same product line|
|**tags**|Tag[]|True| |Tag Set|
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
|**data**|TagResourcesResVo|Resource Tag Association Result Details|
### TagResourcesResVo
|Name|Type|Description|
|---|---|---|
|**pin**|String|User pin|
|**region**|String|Region Name|
|**failedResourcesMap**|FailedResourcesMap[]|Tag Association Failure List|
|**successCount**|Integer|Successful Association Times Between Resources and Tags|
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
