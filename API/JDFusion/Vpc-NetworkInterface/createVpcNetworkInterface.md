# createVpcNetworkInterface


## Description
Create Network Interface according to the cloud provider

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_networkInterfaces

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**netInterface**|CreateNetInterface|True| |Create Network Interface|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|

### CreateNetInterface
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**associatedPublicIp**|String|False| |Public IP Associated with Elastic Network Interface|
|**az**|String|False| |ID of Availability Zone|
|**cloudID**|String|False| |Provider ID of the Cloud|
|**createdTime**|String|False| |Creation Time|
|**description**|String|False| |Network Interface Description Information|
|**id**|String|False| |Id of Network Interface|
|**instanceId**|String|False| |Additional Instance ID to Elastic Network Interface|
|**macAddress**|String|False| |MAC Address of Elastic Network Interface|
|**name**|String|False| |Network Interface Name|
|**privateIpAddress**|String|False| |Primary Private IP Address of Elastic Network Interface|
|**securityGroupId**|String|True| |Security Group|
|**subnetId**|String|True| |Subnet id|
|**type**|String|False| |Network Interface Type|
|**vpcId**|String|False| |VPC Id|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**body**|String|Request Body|
|**cloudId**|String|cloud ID|
|**createdTime**|String|Creation Time|
|**provider**|String|cloud provider|
|**result**|String|Execution Results|
|**status**|String|Status|
|**updateTime**|String|Update Time|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
