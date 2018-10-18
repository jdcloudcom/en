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
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**networkInterface**|NetworkInterface|networkInterface Resource Information|
### NetworkInterface
|Name|Type|Description|
|---|---|---|
|**az**|String|Availability Zone Name|
|**createdTime**|String|Creation Time of Elastic Network Interface|
|**description**|String|Network Interface Description Information|
|**deviceIndex**|Integer|Device Reference Number of Network Interface on the Instance. Value Range: [0,8], 0: secondary network interface doesn't associate device, 1: primary network interface, 2-8: secondary network interface has associated device|
|**instanceId**|String|Associated Instance ID|
|**instanceOwnerId**|String|Account of Instance|
|**instanceType**|String|Associated Instance Type. Value Range: vm|
|**macAddress**|String|Ethernet Address|
|**networkInterfaceId**|String|ENI ID|
|**networkInterfaceName**|String|Elastic Network Interface Name|
|**networkSecurityGroupIds**|String[]|Security Group ID List|
|**primaryIp**|NetworkInterfacePrivateIp|Network Interface Primary IP|
|**role**|String|Network Interface Role. Value Range: Primary (primary network interface), Secondary (secondary network interface)|
|**sanityCheck**|Integer|Source and target IP address verification, with value 0 or 1|
|**secondaryIps**|NetworkInterfacePrivateIp[]|Network Interface Auxiliary IP List|
|**subnetId**|String|Subnet ID|
|**vpcId**|String|Virtual Network ID|
### NetworkInterfacePrivateIp
|Name|Type|Description|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP Instance Address|
|**elasticIpId**|String|Elastic IP Instance ID|
|**privateIpAddress**|String|IPV4 Address of Private IP|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
