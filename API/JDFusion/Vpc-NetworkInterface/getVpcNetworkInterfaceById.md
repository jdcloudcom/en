# getVpcNetworkInterfaceById


## Description
Search Information of corresponding Network Interface resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_networkInterfaces/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |Network Interface ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**netInterface**|NetInterfaceInfo| |
### NetInterfaceInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|Id of Network Interface|
|**name**|String|Network Interface Name|
|**description**|String|Network Interface Description Information|
|**vpcId**|String|VPC Id|
|**type**|String|Network Interface Type|
|**subnetId**|String|Subnet id|
|**az**|String|ID of Availability Zone|
|**associatedPublicIp**|String|Public IP Associated with Elastic Network Interface|
|**privateIpAddress**|String|Primary Private IP Address of Elastic Network Interface|
|**macAddress**|String|MAC Address of Elastic Network Interface|
|**instanceId**|String|Additional Instance ID to Elastic Network Interface|
|**createdTime**|String|Creation Time|
|**cloudID**|String|Provider ID of the Cloud|
|**securityGroupIds**|String[]|Security Group id List|
|**privateIps**|PrivateIp[]|Private ip Detailed List.|
### PrivateIp
|Name|Type|Description|
|---|---|---|
|**ipAddress**|String|Address of Private IP.|
|**primary**|Boolean|Primary IP or Not.|
|**eipId**|String|Elastic IP instance ID.|
|**eipAddress**|String|Elastic IP Instance Address.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|not found|
