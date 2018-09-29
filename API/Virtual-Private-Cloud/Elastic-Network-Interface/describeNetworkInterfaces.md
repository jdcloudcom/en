# describeNetworkInterfaces


## 描述
Query elastic network interface list

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |networkInterfaceIds - Elastic Network Interface ID List, support multiple IDs<br>networkInterfaceNames - Elastic Network Interface Name List, support multiple names<br>VPCId - VPC ID of Elastic Network Interface, support single ID<br>subnetId	- Subnet Id of Elastic Network Interface, support single Id<br>role - Network Interface Role. Value Range: Primary (primary network interface), Secondary (secondary network interface), support single role<br>|
|**pageNumber**|Integer|False|1|Page: 1 by default. Value Range: [1,∞); when the pages exceed total pages, show the last page|
|**pageSize**|Integer|False|20|Paging Size; 20 by default. Value Range: [10, 100]|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|

### Result
|名称|类型|描述|
|---|---|---|
|**networkInterfaces**|NetworkInterface[]|NetworkInterface Resource Information List|
|**totalCount**|Number|Total Number|
### NetworkInterface
|名称|类型|描述|
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
|名称|类型|描述|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP Instance Address|
|**elasticIpId**|String|Elastic IP Instance ID|
|**privateIpAddress**|String|IPV4 Address of Private IP|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
