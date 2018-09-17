# createNetworkInterface


## Description
Create network interface, can only create secondary network interface

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|False||Availability zone, user’s default availability zone|
|**description**|String|False||Description, all characters allowed to enter under UTF-8 encoding, without exceeding 256 characters|
|**networkInterfaceName**|String|False||Network interface name, only allowed to enter Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters. |
|**primaryIpAddress**|String|False||Network interface primary IP, if it has not been assigned, it will be allocated automatically from the subnet|
|**sanityCheck**|Integer|False||Source and target IP address verification, with value 0 or 1, 1 by default|
|**secondaryIpAddresses**|String[]|False||SecondaryIp list|
|**secondaryIpCount**|Integer|False||Number of SecondaryIp assigned automatically|
|**securityGroups**|String[]|False||Security group ID list to be associated, a maximum of 5 security groups can be assigned|
|**subnetId**|String|True||Subnet ID|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Return result|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**networkInterfaceId**|String|Elastic network interface Id|

## Return code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**409**|Resource 'primaryIp' already be used|
|**404**|Resource 'subnetId' not found|
|**429**|NetworkInterface quota limit exceeded|
