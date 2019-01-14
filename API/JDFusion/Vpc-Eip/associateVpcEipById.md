# associateVpcEipById


## Description
Associate Elastic IP to Virtual Machines

## Request Method
PUT

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_eips/{id}:associate

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Public IP ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**body**|AssociateEipAddressReq|True| |Associate Elastic IP to Virtual Machines|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### AssociateEipAddressReq
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**associate**|AssociateEipAddress|False| | |
### AssociateEipAddress
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|False| |Instance ID of Cloud Product|
|**instanceType**|String|False| |Type of Cloud Product Instance to be Associated|

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
