# describeVpcPeerings


## 描述
Query VpcPeering resource list

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcPeerings/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||vpcPeeringIds - vpcPeering ID, support multiple IDs<br>vpcPeeringNames - vpcPeering name list, support multiple names<br>vpcId	- vpcPeering home terminal Vpc Id, support single Id<br>remoteVpcId - vpcPeering opposite terminal Vpc Id, support single Id<br>|
|**pageNumber**|Integer|False|1|Page; it is 1 by default, the value range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range[10, 100]|

### <a name="Filter">Filter</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Returned results|


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**totalCount**|Number|Total number|
|**vpcPeerings**|[VpcPeering[]](##VpcPeering)|VpcPeering resource information list|
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
|**200**|OK|
