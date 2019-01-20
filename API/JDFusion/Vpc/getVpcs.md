# getVpcs


## Description
Search VPC resource list

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_vpcs

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
|**vpcs**|VpcInfo[]| |
### VpcInfo
|Name|Type|Description|
|---|---|---|
|**cidrBlock**|String|Address Range|
|**cloudID**|String|Provider ID of the Cloud|
|**createdTime**|String|Creation Time|
|**description**|String|VPC Description|
|**id**|String|Vpc Id|
|**name**|String|Name of VPC|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
