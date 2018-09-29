# modifyVpcPeering


## 描述
Modify VPCPeering API

## 请求方式
PUT

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcPeerings/{vpcPeeringId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**vpcPeeringId**|String|True| |vpcPeeringId ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False| |VPCPeering Description. Value Range: 0-256 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**vpcPeeringName**|String|False| |VPCPeering Name, Must Provide A nName. Value Range of Name: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**vpcPeering**|VpcPeering|VPCPeering Resource Information|

### VpcPeering
|名称|类型|描述|
|---|---|---|
|**vpcPeering**|VpcPeering| |
### VpcPeering
|名称|类型|描述|
|---|---|---|
|**createdTime**|String|VPCPeering Creation Time|
|**description**|String|VPCPeering description, can be null. Value Range: 0-256 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**remoteVpcInfo**|VpcPeeringVpcInfo|Opposite Terminal VPC information|
|**vpcInfo**|VpcPeeringVpcInfo|VPC Information Launching VPCPeering|
|**vpcPeeringId**|String|VPCPeering ID|
|**vpcPeeringName**|String|VPCPeering name, no duplicate under the same account is allowed. Value Range: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**vpcPeeringState**|String|Status, values include Connected, Disconnected, Initiated|
### VpcPeeringVpcInfo
|名称|类型|描述|
|---|---|---|
|**addressPrefix**|String[]|If it is blank, segment is not limited; if it is not blank, it is 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28|
|**vpcId**|String|VPC ID of Subnet|
|**vpcName**|String|VPC Name. Value Range: 1-60 Chinese, English capital and lowercase letters, numbers and underline delimiter|

## 返回码
|返回码|描述|
|---|---|
|**200**|Successful Operation|
|**409**|Already has VpcPeering with param|
|**404**|Resource Not Found|
|**429**|VpcPeering quota limit exceeded.|
