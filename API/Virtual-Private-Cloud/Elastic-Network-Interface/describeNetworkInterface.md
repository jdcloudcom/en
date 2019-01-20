# describeNetworkInterface


## Description
Query elastic network interface information details

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/{networkInterfaceId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkInterfaceId**|String|True| |networkInterface ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**networkInterface**|NetworkInterface|networkInterface Resource Information|
### NetworkInterface
|Name|Type|Description|
|---|---|---|
|**macAddress**|String|Ethernet Address|
|**vpcId**|String|Virtual Network ID|
|**description**|String|Network Interface Description Information|
|**instanceId**|String|Associated Instance ID|
|**secondaryIps**|NetworkInterfacePrivateIp[]|Network Interface Auxiliary IP List|
|**subnetId**|String|Subnet ID|
|**az**|String|Availability Zone Name|
|**instanceType**|String|Associated Instance Type. Value Range: vm|
|**instanceOwnerId**|String|Account of Instance|
|**deviceIndex**|Integer|Device Reference Number of Network Interface on the Instance. Value Range: [0,8], 0: secondary network interface doesn't associate device, 1: primary network interface, 2-8: secondary network interface has associated device|
|**networkInterfaceId**|String|ENI ID|
|**sanityCheck**|Integer|Source and target IP address verification, with value 0 or 1|
|**networkSecurityGroupIds**|String[]|Security Group ID List|
|**role**|String|Network Interface Role. Value Range: Primary (primary network interface), Secondary (secondary network interface)|
|**createdTime**|String|Creation Time of Elastic Network Interface|
|**primaryIp**|NetworkInterfacePrivateIp|Network Interface Primary IP|
|**networkInterfaceName**|String|Elastic Network Interface Name|
### NetworkInterfacePrivateIp
|Name|Type|Description|
|---|---|---|
|**privateIpAddress**|String|IPV4 Address of Private IP|
|**elasticIpId**|String|Elastic IP Instance ID|
|**elasticIpAddress**|String|Elastic IP Instance Address|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
