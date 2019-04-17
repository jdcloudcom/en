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
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**netInterface**|NetInterfaceInfo| |
### NetInterfaceInfo
|Name|Type|Description|
|---|---|---|
|**associatedPublicIp**|String|Public IP Associated with Elastic Network Interface|
|**az**|String|ID of Availability Zone|
|**cloudID**|String|Provider ID of the Cloud|
|**createdTime**|String|Creation Time|
|**description**|String|Network Interface Description Information|
|**id**|String|Id of Network Interface|
|**instanceId**|String|Additional Instance ID to Elastic Network Interface|
|**macAddress**|String|MAC Address of Elastic Network Interface|
|**name**|String|Network Interface Name|
|**privateIpAddress**|String|Primary Private IP Address of Elastic Network Interface|
|**subnetId**|String|Subnet id|
|**type**|String|Network Interface Type|
|**vpcId**|String|VPC Id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|not found|
