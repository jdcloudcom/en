# describeNetworkInterface


## Description
Query elastic network interface information details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/{networkInterfaceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkInterfaceId**|String|True||networkInterface ID|
|**regionId**|String|True||Region ID|

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
|**networkInterface**|NetworkInterface|networkInterface resource information|
### <a name="NetworkInterface">NetworkInterface</a>
|Name|Type|Description|
|---|---|---|
|**az**|String|Availability zone name|
|**createdTime**|String|Creation time of elastic network interface|
|**description**|String|Network interface description information|
|**deviceIndex**|Integer|Device reference number of network interface on the instance, value range: [0,8], 0: secondary network interface doesn't associate device, 1: primary network interface, 2-8: secondary network interface has associated device|
|**instanceId**|String|Associated instance ID|
|**instanceOwnerId**|String|Account of instance|
|**instanceType**|String|Associated instance type family, value range: vm|
|**macAddress**|String|Ethernet address|
|**networkInterfaceId**|String|Elastic network interface ID|
|**networkInterfaceName**|String|Elastic network interface name|
|**networkSecurityGroupIds**|String[]|Security group ID list|
|**primaryIp**|NetworkInterfacePrivateIp|Primary IP of network interface|
|**role**|String|Network interface role, value range: Primary (primary network interface), Secondary (secondary network interface)|
|**sanityCheck**|Integer|Source and target IP address verification, with value 0 or 1|
|**secondaryIps**|NetworkInterfacePrivateIp[]|Network interface auxiliary IP list|
|**subnetId**|String|Subnet ID|
|**vpcId**|String|Virtual network ID|
### <a name="NetworkInterfacePrivateIp">NetworkInterfacePrivateIp</a>
|Name|Type|Description|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP instance address|
|**elasticIpId**|String|Elastic IP instance ID|
|**privateIpAddress**|String|IPV4 address of private IP|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
