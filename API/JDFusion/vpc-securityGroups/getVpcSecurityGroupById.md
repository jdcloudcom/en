# getVpcSecurityGroupById


## Description
Search Information of corresponding Security Group resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_securityGroups/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |SecurityGroup ID|
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
|**securityGroup**|SecurityGroupDetail| |
### SecurityGroupDetail
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|ID of Registration Cloud Information|
|**createdTime**|String|Creation Time|
|**description**|String|Security Group Description Information|
|**id**|String|Security Group id|
|**name**|String|Name of Target Security Group|
|**permissions**|PermissionType[]|Set of Security Group Permission Rules|
|**vpcId**|String|VPC id|
### PermissionType
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|Cloud Registration Information ID|
|**description**|String|Description Information|
|**destCidrIp**|String|Target IP address field used for authorization for outbound|
|**destGroupId**|String|Target Security Group used for authorization for outbound|
|**destGroupOwnerAccount**|String|Alibaba Cloud Account Id of Target Security Group|
|**direction**|String|Authorization Direction|
|**ipProtocol**|String|IP Protocol|
|**nicType**|String|Network Type|
|**policy**|String|Authorization Policy|
|**portRange**|String|Port Range|
|**priority**|String|Rule Priority|
|**sourceCidrIp**|String|Source IP Address field used for authorization for inbound|
|**sourceGroupId**|String|Source Security Group used for authorization for inbound|
|**sourceGroupOwnerAccount**|String|Alibaba Cloud Account Id of Target Security Group|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|not found|
