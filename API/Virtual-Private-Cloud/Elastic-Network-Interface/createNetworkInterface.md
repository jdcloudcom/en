# createNetworkInterface


## 描述
Create network interface, can only create secondary network interface

## 请求方式
POST

## 请求地址
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkInterfaces/

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**az**|String|False||Availability zone, user’s default availability zone|
|**description**|String|False||Description, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters|
|**networkInterfaceName**|String|False||Network interface name, only allowed to enter Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|
|**primaryIpAddress**|String|False||Network interface primary IP, if it has not been assigned, it will be allocated automatically from the subnet|
|**sanityCheck**|Integer|False||Source and target IP address verification, with value 0 or 1, default value is 1|
|**secondaryIpAddresses**|String[]|False||SecondaryIp list|
|**secondaryIpCount**|Integer|False||Amount of SecondaryIp assigned automatically|
|**securityGroups**|String[]|False||Security group ID list to be associated, a maximum of 5 security groups can be done|
|**subnetId**|String|True||Subnet ID|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)|Returned results|


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**networkInterfaceId**|String|Elastic network interface Id|

## 返回码
|返回码|描述|
|---|---|
|**200**|Successful operation|
|**409**|Resource 'primaryIp' already be used|
|**404**|Resource 'subnetId' not found|
|**429**|NetworkInterface quota limit exceeded|
