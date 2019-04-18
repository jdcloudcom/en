# getVpcSecurityGroupById


## Description
Search the designated security group resource information

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
|**securityGroup**|SecurityGroupDetail| |
### SecurityGroupDetail
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|ID of Registration Cloud Information|
|**id**|String|Security Group id|
|**name**|String|Name of Target Security Group|
|**description**|String|Security Group Description Information|
|**vpcId**|String|VPC id|
|**createdTime**|String|Creation Time|
|**permissions**|PermissionType[]|Set of Security Group Permission Rules|
### PermissionType
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|Cloud Registration Information ID|
|**ipProtocol**|String|IP Protocol|
|**portRange**|String|Port Range|
|**description**|String|Description Information|
|**sourceCidrIp**|String|Source IP Address field used for authorization for inbound|
|**sourceGroupId**|String|Source Security Group used for authorization for inbound|
|**sourceGroupOwnerAccount**|String|Alibaba Cloud Account Id of Target Security Group|
|**destCidrIp**|String|Target IP address field used for authorization for outbound|
|**destGroupId**|String|Target Security Group used for authorization for outbound|
|**destGroupOwnerAccount**|String|Alibaba Cloud Account Id of Target Security Group|
|**policy**|String|Authorization Policy|
|**nicType**|String|Network Type|
|**priority**|String|Rule Priority|
|**direction**|String|Authorization Direction|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|not found|
