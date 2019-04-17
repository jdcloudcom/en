# getVpcEips


## Description
Search information of corresponding Public IP resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_eips

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**eipAddresses**|EipAddress[]| |
### EipAddress
|Name|Type|Description|
|---|---|---|
|**allocationTime**|String|Creation Time of EIP|
|**bandwidth**|String|Bandwidth Peak of EIP, Unit: Mbps|
|**cloudID**|String|Cloud Registration Information ID|
|**id**|String|Public IP ID|
|**instanceId**|String|Currently Associated Instance ID|
|**instanceType**|String|Currently Associated Instance Type|
|**ipAddress**|String|EIP Address|
|**status**|String|Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
