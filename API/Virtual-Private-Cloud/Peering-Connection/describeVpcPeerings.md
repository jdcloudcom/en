# describeVpcPeerings


## Description
"Query VpcPeering resource list

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcPeerings/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||vpcPeeringIds - vpcPeering ID, support multiple IDs<br>vpcPeeringNames - vpcPeering name list, support multiple names<br>vpcId	- vpcPeering home terminal Vpc Id, support single Id<br>remoteVpcId - vpcPeering opposite terminal Vpc Id, support single Id<br>|
|**pageNumber**|Integer|False|1|Page, 1 by default, value range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging size, 20 by default; value range: [10,100]|

### <a name="Filter">Filter</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Return result|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**totalCount**|Number|Total amount|
|**vpcPeerings**|[VpcPeering[]](##VpcPeering)|VpcPeering resource information list|
### <a name="VpcPeering">VpcPeering</a>
|Name|Type|Description|
|---|---|---|
|**createdTime**|String|VpcPeering creation time|
|**description**|String|VpcPeering description, can be null value, value range: 0-256 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**remoteVpcInfo**|[VpcPeeringVpcInfo](##VpcPeeringVpcInfo)|Opposite terminal Vpc information|
|**vpcInfo**|[VpcPeeringVpcInfo](##VpcPeeringVpcInfo)|Vpc information launching VpcPeering|
|**vpcPeeringId**|String|VpcPeering Id|
|**vpcPeeringName**|String|VpcPeering name, a name cannot be duplicate under the same account, value range: 1-32 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**vpcPeeringState**|String|Status, values include Connected, Disconnected, Initiated|
### <a name="VpcPeeringVpcInfo">VpcPeeringVpcInfo</a>
|Name|Type|Description|
|---|---|---|
|**addressPrefix**|String[]|If it is blank, segment is not limited; if it is not blank, it is 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28|
|**vpcId**|String|VPC Id of subnet|
|**vpcName**|String|Virtual private cloud name, value range: 1-60 Chinese, English capital and lowercase letters, numbers and underline delimiter|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
