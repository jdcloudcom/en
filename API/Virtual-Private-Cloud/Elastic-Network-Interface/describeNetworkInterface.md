# describeNetworkInterface


## 描述
Query elastic network interface information details

## 请求方式
GET

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/{networkInterfaceId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**networkInterfaceId**|String|True||networkInterface ID|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Returned results|


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**networkInterface**|[NetworkInterface](##NetworkInterface)|networkInterface resource information|
### <a name="NetworkInterface">NetworkInterface</a>
|名称|类型|描述|
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
|**primaryIp**|[NetworkInterfacePrivateIp](##NetworkInterfacePrivateIp)|Primary IP of network interface|
|**role**|String|Network interface role, value range: Primary (primary network interface), Secondary (secondary network interface)|
|**sanityCheck**|Integer|Source and target IP address verification, with value 0 or 1|
|**secondaryIps**|[NetworkInterfacePrivateIp[]](##NetworkInterfacePrivateIp)|Network interface auxiliary IP list|
|**subnetId**|String|Subnet ID|
|**vpcId**|String|Virtual network ID|
### <a name="NetworkInterfacePrivateIp">NetworkInterfacePrivateIp</a>
|名称|类型|描述|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP instance address|
|**elasticIpId**|String|Elastic IP instance ID|
|**privateIpAddress**|String|IPV4 address of private IP|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**401**|Authentication failed|
