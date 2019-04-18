# getVpcSlbById


## Description
Search Information of corresponding SLB resource according to the cloud provider

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_slbs/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |LB ID|
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
|**slb**|SlbInfoDetail| |
### SlbInfoDetail
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|ID of Cloud|
|**id**|String|ID of Load Balancer Instance.|
|**name**|String|Name of Load Balancer Instance.|
|**status**|String|Status of Load Balancer Instance|
|**ipAddress**|String|Service Address of Load Balancer Instance.|
|**addressType**|String|Network Type of Load Balancer Instance.|
|**subnetId**|String|Switch ID of Private Load Balancer Instance.|
|**vpc**|String|Exclusive Network ID of Private Load Balancer Instance.|
|**networkType**|String|Network Type of Private Load Balancer Instance|
|**masterAz**|String|Primary Availability Zone ID of Instance.|
|**slaveAz**|String|Backup Availability Zone ID of Instance.|
|**createdTime**|String|Creation Time|
|**listenerPortsAndProtocol**|ListenerPortsAndProtocol[]|Port and Protocol List used by Frontend of Load Balancer Instance.|
|**backendServers**|BackendServer2[]|Backend Server List of Load Balancer Instance.|
|**loadBalancerSpec**|String|Performance Specifications of Load Balancer Instance. Value: slb.s1.small, slb.s2.small, slb.s2.medium, slb.s3.small, slb.s3.medium, slb.s3.large|
### BackendServer2
|Name|Type|Description|
|---|---|---|
|**serverId**|String|ID of Backend Server Name (ECS instance).|
|**weight**|Integer|Weight of Backend Server.|
|**type**|String|Backend Server Type.|
### ListenerPortsAndProtocol
|Name|Type|Description|
|---|---|---|
|**listenerPort**|Integer|Port Used by Instance Frontend of Load Balancer.|
|**listenerProtocol**|String|Protocol Used by Instance Frontend of Load Balancer.|
|**listenerForward**|String|Whether enable listening forward.|
|**forwardPort**|Integer|Listener port forwarding to destination must be existing HTTPS listener port.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|
|**404**|not found|
