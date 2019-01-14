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
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**body**|CreateVserverGroupReq|True| |Create Virtual Server Group|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### CreateVserverGroupReq
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**vserverGroup**|CreateVserverGroup|False| | |
### CreateVserverGroup
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**backendServers**|BackendServer[]|False| |Set of Security Group Permission Rules|
|**loadBalancerId**|String|False| |Load Balancer Instance ID|
|**vserverGroupName**|String|False| |Name of Server Group|
### BackendServer
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudID**|String|False| |ID of Cloud|
|**port**|Integer|False| |Port of Backend Server.|
|**serverHealthStatus**|String|False| |Name of Load Balancer Instance.|
|**serverId**|String|False| |ID of Load Balancer Instance.|
|**type**|String|False| |Backend Server Type.|
|**weight**|Integer|False| |Weight of Backend Server.|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**body**|String|Request Body|
|**cloudId**|String|cloud ID|
|**createdTime**|String|Creation Time|
|**provider**|String|cloud provider|
|**result**|String|Execution Results|
|**status**|String|Status|
|**updateTime**|String|Update Time|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
