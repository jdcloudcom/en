# showClusterDetails


## Description
Query the corresponding cluster details according to clusterId

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/detail

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**id**|String|True| |Cluster ID: Composed of eight characters|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|ClusterDetailModel|Corresponding Cluster Details|
|**message**|String| |
|**status**|String| |
### ClusterDetailModel
|Name|Type|Description|
|---|---|---|
|**bandwidthOut**|Integer|Network Bandwidth|
|**clusterPrimaryId**|Integer|Cluster Primary Key ID|
|**createTime**|String|Creation Time|
|**dataCenter**|String|Region, the same as regionID|
|**duration**|String|Operating Hours|
|**haFlag**|Boolean|Whether it is high availability mode or not|
|**hardware**|HardwareInfo[]| |
|**id**|String|Cluster ID|
|**jssFlag**|Boolean|Whether to associate the Object Storage Service or not|
|**name**|String|Cluster name allows Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, with the length of 6-32 characters.|
|**nodeCount**|Integer|Node Number|
|**payPrice**|String|Payment Price|
|**payType**|String|Payment Type|
|**softwareStack**|Object|Software Information|
|**status**|String|Cluster Status|
|**vpcName**|String|Name of Virtual Private Cloud|
|**vpcSubnetName**|String|Subnet Name|
### HardwareInfo
|Name|Type|Description|
|---|---|---|
|**firewall**|String|Firewall|
|**innerIp**|String|Private IP|
|**instanceInfo**|String|Node Hardware Type|
|**instanceType**|String|Node Hardware Configuration|
|**msg**|String|Message|
|**nodeCoreNum**|Integer|Node Core Number|
|**nodeDiskType**|String|Node Hard Disk Type|
|**nodeDiskVolume**|Integer|Node Hard Disk Capacity|
|**nodeMemoryNum**|Integer|Node Memory|
|**nodeName**|String|Node Name|
|**nodeStatus**|String|Node Status|
|**nodeSystemInfo**|String|Node System Information|
|**nodeType**|String|Node Type|
|**outerIp**|String|Internet IP|
|**serverId**|String|Node Instance ID|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
