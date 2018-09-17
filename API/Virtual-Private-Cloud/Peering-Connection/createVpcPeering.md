# createVpcPeering


## 描述
Create VpcPeering interface

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcPeerings/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**description**|String|False||VpcPeering description, value range: 0-256 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**remoteVpcId**|String|True||VpcPeering opposite terminal Vpc Id|
|**vpcId**|String|True||VpcPeering home terminal Vpc Id|
|**vpcPeeringName**|String|True||VpcPeering name, must provide a name. Value range of name: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Returned results|


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**vpcPeering**|[VpcPeering](##VpcPeering)|VpcPeering resource information|
### <a name="VpcPeering">VpcPeering</a>
|名称|类型|描述|
|---|---|---|
|**createdTime**|String|VpcPeering creation time|
|**description**|String|VpcPeering description, can be null value, value range: 0-256 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**remoteVpcInfo**|[VpcPeeringVpcInfo](##VpcPeeringVpcInfo)|Opposite terminal Vpc information|
|**vpcInfo**|[VpcPeeringVpcInfo](##VpcPeeringVpcInfo)|Vpc information launching VpcPeering|
|**vpcPeeringId**|String|VpcPeering Id|
|**vpcPeeringName**|String|VpcPeering name, a name cannot be duplicate under the same account, value range: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**vpcPeeringState**|String|Status, values include Connected, Disconnected, Initiated|
### <a name="VpcPeeringVpcInfo">VpcPeeringVpcInfo</a>
|名称|类型|描述|
|---|---|---|
|**addressPrefix**|String[]|If it is blank, segment is not limited; if it is not blank, it is 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28|
|**vpcId**|String|VPC Id of subnet|
|**vpcName**|String|Virtual private cloud name, value range: 1-60 Chinese, English capital and lowercase letters, numbers and underline delimiter|

## 返回码
|返回码|描述|
|---|---|
|**200**|Successful operation|
|**409**|Already has VpcPeering with param|
|**400**|Request parameter x.y.z is 'xxx', expected one of [yyy,zzz]|
|**404**|Resource not found|
|**429**|VpcPeering quota limit exceeded.|
