# getVpcSecurityGroups


## Description
Search Information of corresponding Security Group resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_securityGroups

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
|**securityGroups**|SecurityGroupInfo[]| |
### SecurityGroupInfo
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|ID of Registration Cloud Information|
|**createdTime**|String|Creation Time|
|**description**|String|Security Group Description Information|
|**id**|String|Security Group id|
|**name**|String|Name of Target Security Group|
|**vpcId**|String|VPC id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
