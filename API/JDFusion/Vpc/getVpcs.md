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
|**vpcs**|VpcListInfo[]| |
### VpcListInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|Vpc Id|
|**name**|String|Name of VPC|
|**cidrBlock**|String|Segment of VPC|
|**description**|String|VPC Description|
|**createdTime**|String|Creation Time|
|**cloudID**|String|Provider ID of the Cloud|
|**subnetIds**|String[]|Subnet List Included in VPC|
|**routeTableIds**|String[]|ID Set of Route Table|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
