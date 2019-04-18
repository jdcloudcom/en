# createVpcVServerGroup


## Description
Create Virtual Server Group and add Backend Server

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_vserverGroups

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**vserverGroup**|CreateVserverGroup|True| |Create Virtual Server Group|

### CreateVserverGroup
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**loadBalancerId**|String|False| |Load Balancer Instance ID|
|**vserverGroupName**|String|False| |Name of Server Group|
|**backendServers**|BackendServer[]|False| |Set of Security Group Permission Rules|
### BackendServer
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudID**|String|False| |ID of Cloud|
|**serverId**|String|False| |ID of Load Balancer Instance.|
|**serverHealthStatus**|String|False| |Name of Load Balancer Instance.|
|**port**|Integer|False| |Port of Backend Server.|
|**weight**|Integer|False| |Weight of Backend Server.|
|**type**|String|False| |Backend Server Type.|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid|
|**body**|String|Request Body|
|**status**|String|Status|
|**result**|String|Execution Results|
|**createdTime**|String|Creation Time|
|**updateTime**|String|Update Time|
|**provider**|String|cloud provider|
|**cloudId**|String|cloud ID|
|**userId**|String|user ID|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
