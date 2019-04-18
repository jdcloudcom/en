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
|**x-jdcloud-nonce**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-date**|String|True| |See guide document of signature algorithm for obtaining method|
|**authorization**|String|True| |See guide document of signature algorithm for obtaining method|
|**x-jdcloud-fusion-cloudid**|String|True| |Cloud Registration Information ID|
|**netInterface**|CreateNetInterface|True| |Create Network Interface|

### CreateNetInterface
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|False| |Id of Network Interface|
|**name**|String|False| |Network Interface Name|
|**description**|String|False| |Network Interface Description Information|
|**vpcId**|String|False| |VPC Id|
|**type**|String|False| |Network Interface Type|
|**subnetId**|String|True| |Subnet id|
|**az**|String|False| |ID of Availability Zone|
|**associatedPublicIp**|String|False| |Public IP Associated with Elastic Network Interface|
|**privateIpAddress**|String|False| |Primary Private IP Address of Elastic Network Interface|
|**macAddress**|String|False| |MAC Address of Elastic Network Interface|
|**instanceId**|String|False| |Additional Instance ID to Elastic Network Interface|
|**createdTime**|String|False| |Creation Time|
|**cloudID**|String|False| |Provider ID of the Cloud|
|**securityGroupId**|String|True| |Security Group|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|Name|Type|Description|
|---|---|---|
|**uuid**|String|uuid|
|**body**|String|Request Body|
|**status**|String|Status|
|**result**|String|Execution Results|
|**createdTime**|String|Creation Time|
|**updateTime**|String|Update Time|
|**provider**|String|cloud provider|
|**cloudId**|String|cloud ID|
|**userId**|String|user ID|

## Return Code
|Return Code|Description|
|---|---|
|**201**|CREATED|
