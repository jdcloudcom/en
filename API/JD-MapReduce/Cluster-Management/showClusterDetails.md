# showClusterDetails


## 描述
Query the corresponding cluster details according to clusterId

## 请求方式
GET

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/detail

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**id**|String|True||Cluster ID: composed of eight characters|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**data**|[ClusterDetailModel](##ClusterDetailModel)|Corresponding cluster details|
|**message**|String||
|**status**|String||
### <a name="ClusterDetailModel">ClusterDetailModel</a>
|名称|类型|描述|
|---|---|---|
|**bandwidthOut**|Integer|Network bandwidth|
|**clusterPrimaryId**|Integer|Cluster primary key ID|
|**createTime**|String|Creation time|
|**dataCenter**|String|Region, the same as regionID|
|**duration**|String|Operating hours|
|**haFlag**|Boolean|Whether it is high availability mode or not|
|**hardware**|[HardwareInfo[]](##HardwareInfo)||
|**id**|String|Cluster ID|
|**jssFlag**|Boolean|Whether to associate the Object Storage Service or not|
|**name**|String|Cluster name supports Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, with the length of 6-32 characters.|
|**nodeCount**|Integer|Node number|
|**payPrice**|String|Payment price|
|**payType**|String|Payment type|
|**softwareStack**|Object|Software information|
|**status**|String|Cluster status|
|**vpcName**|String|Name of virtual private cloud|
|**vpcSubnetName**|String|Subnet name|
### <a name="HardwareInfo">HardwareInfo</a>
|名称|类型|描述|
|---|---|---|
|**firewall**|String|Firewall|
|**innerIp**|String|Private IP|
|**instanceInfo**|String|Node hardware type|
|**instanceType**|String|Node hardware configuration|
|**msg**|String|Message|
|**nodeCoreNum**|Integer|Node core number|
|**nodeDiskType**|String|Node hard disk type|
|**nodeDiskVolume**|Integer|Node hard disk capacity|
|**nodeMemoryNum**|Integer|Node memory|
|**nodeName**|String|Node name|
|**nodeStatus**|String|Node status|
|**nodeSystemInfo**|String|Node system information|
|**nodeType**|String|Node type|
|**outerIp**|String|Internet IP|
|**serverId**|String|Node instance ID|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|
