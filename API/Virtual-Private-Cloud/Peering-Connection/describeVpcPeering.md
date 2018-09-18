# describeVpcPeering


## Description
Query VpcPeering resource details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcPeerings/{vpcPeeringId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**vpcPeeringId**|String|True||vpcPeeringId ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned results|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**vpcPeering**|VpcPeering|VpcPeering resource information|
### <a name="VpcPeering">VpcPeering</a>
|Name|Type|Description|
|---|---|---|
|**createdTime**|String|VpcPeering creation time|
|**description**|String|VpcPeering description, can be null value, value range: 0-256 Chinese, English capital and lowercase letters, numbers and underline delimiter|
|**remoteVpcInfo**|VpcPeeringVpcInfo|Opposite terminal Vpc information|
|**vpcInfo**|VpcPeeringVpcInfo|Vpc information launching VpcPeering|
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
