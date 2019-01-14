# disassociateVpcEipById


## Description
Disassociate EIP

## Request Method
PUT

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_eips/{id}:disassociate

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Public IP ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**body**|UnassociateEipAddressReq|True| |Disassociate EIP|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### UnassociateEipAddressReq
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**unassociate**|UnassociateEipAddress|False| | |
### UnassociateEipAddress
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**force**|Boolean|False| |Whether to force to disassociate|
|**instanceId**|String|False| |Instance ID of Cloud Product|
|**instanceType**|String|False| |Resource Type to be Disassociated|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**204**|OK|
|**404**|eip not found|
