# getVpcEipById


## Description
Search information of corresponding Public IP resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_eips/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Public IP ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**eipAddress**|EipAddress| |
### EipAddress
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|Cloud Registration Information ID|
|**ipAddress**|String|EIP Address|
|**id**|String|Public IP ID|
|**status**|String|Status|
|**instanceType**|String|Currently Associated Instance Type|
|**instanceId**|String|Currently Associated Instance ID|
|**bandwidth**|String|Bandwidth Peak of EIP, Unit: Mbps|
|**allocationTime**|String|Creation Time of EIP|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|Public IP not found|
