# attachVpcNetworkInterfaceById


## Description
Attach Network Interface to Virtual Machines

## Request Method
PUT

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_networkInterfaces/{id}:attach

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Network Interface ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**body**|AttachNetInterfaceReq|True| |Attach Network Interface to Virtual Machines|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### AttachNetInterfaceReq
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**attach**|AttachNetInterface|False| | |
### AttachNetInterface
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Virtual Machine id|

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
