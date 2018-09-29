# createNetworkInterface


## Description
Create network interface API, can only create secondary network interface

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|False| |Availability Zone, User’s Default Availability Zone|
|**description**|String|False| |Description, allow all characters under UTF-8 coding, which cannot exceed 256 characters|
|**networkInterfaceName**|String|False| |Network interface name, only allow Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|
|**primaryIpAddress**|String|False| |Network interface primary IP, if it has not been assigned, it will be allocated automatically from the subnet|
|**sanityCheck**|Integer|False| |Source and target IP address verification, with value 0 or 1, default value is 1|
|**secondaryIpAddresses**|String[]|False| |Secondary IP List|
|**secondaryIpCount**|Integer|False| |Amount of Secondary IP Assigned Automatically|
|**securityGroups**|String[]|False| |Security Group ID list to be associated, a maximum of 5 Security Groups can be done|
|**subnetId**|String|True| |Subnet ID|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**networkInterfaceId**|String|Elastic Network Interface ID|

## Response code
|Return code|Description|
|---|---|
|**200**|Successful Operation|
|**409**|Resource 'primaryIp' already be used|
|**404**|Resource 'subnetId' not found|
|**429**|NetworkInterface quota limit exceeded|
