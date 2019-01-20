# createVpcPeering


## Description
Create VPCPeering API

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcPeerings/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**vpcPeeringName**|String|True| |VPCPeering Name, Must Provide A nName. Value Range of Name: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**vpcId**|String|True| |VPCPeering Home Terminal VPC ID|
|**description**|String|False| |VPCPeering Description. Value Range: 0-256 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**remoteVpcId**|String|True| |VPCPeering Opposite Terminal VPC ID|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**vpcPeering**|VpcPeering|VPCPeering Resource Information|
### VpcPeering
|Name|Type|Description|
|---|---|---|
|**vpcPeeringName**|String|VPCPeering name, no duplicate under the same account is allowed. Value Range: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**vpcPeeringId**|String|VPCPeering ID|
|**description**|String|VPCPeering description, can be null. Value Range: 0-256 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**remoteVpcInfo**|VpcPeeringVpcInfo|Opposite Terminal VPC information|
|**vpcPeeringState**|String|Status, values include Connected, Disconnected, Initiated|
|**createdTime**|String|VPCPeering Creation Time|
|**vpcInfo**|VpcPeeringVpcInfo|VPC Information Launching VPCPeering|
### VpcPeeringVpcInfo
|Name|Type|Description|
|---|---|---|
|**addressPrefix**|String[]|If it is blank, segment is not limited; if it is not blank, it is 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28|
|**vpcName**|String|VPC Name. Value Range: 1-60 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**vpcId**|String|VPC ID of Subnet|

## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**409**|Already has VpcPeering with param|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource not found|
|**429**|VpcPeering quota limit exceeded.|
