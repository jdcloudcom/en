# describeNetworkInterfaces


## Description
Query elastic network interface list

## Request method
GET

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |networkInterfaceIds - Elastic Network Interface ID List, support multiple IDs<br>networkInterfaceNames - Elastic Network Interface Name List, support multiple names<br>VPCId - VPC ID of Elastic Network Interface, support single ID<br>subnetId	- Subnet Id of Elastic Network Interface, support single Id<br>role - Network Interface Role. Value Range: Primary (primary network interface), Secondary (secondary network interface), support single role<br>|
|**pageNumber**|Integer|False|1|Page: 1 by default. Value Range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging Size; 20 by default. Value Range: [10, 100]|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**networkInterfaces**|NetworkInterface[]|NetworkInterface Resource Information List|
|**totalCount**|Number|Total Number|
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
|**networkInterfaceId**|String|Elastic Network Interface ID|
|**networkInterfaceName**|String|Elastic Network Interface Name|
|**networkSecurityGroupIds**|String[]|Security Group ID List|
|**primaryIp**|NetworkInterfacePrivateIp|Primary IP of Network Interface|
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
