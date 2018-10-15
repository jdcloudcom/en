# createClusterInNewNetwork


## Description
Create a new cluster

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/cluster:create

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clusterModel**|ClusterModel|True| | |

### ClusterModel
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bandwidth**|Integer|False|5|Network Bandwidth Cap|
|**coreInstanceType**|String|False| |Core node specification, such as: g.n1.xlarge; please refer to [document](https://www.jdcloud.com/help/detail/296/isCatalog/1) for more specification|
|**dataCenter**|String|False|cn-north-1|Region, the same as regionID|
|**haFlag**|Boolean|False|True|Whether the cluster is in high availability mode or not|
|**jssFlag**|Boolean|False| |Whether to associate the Object Storage Service or not|
|**masterInstanceType**|String|False| |Master node specification, such as: g.n1.xlarge; please refer to [document](https://www.jdcloud.com/help/detail/296/isCatalog/1) for more specification|
|**masterNodeDiskType**|String|False| |"Master node cloud disk type, the optional types are (the following types are separated with "/")"<br>"NBD/NBD_SATA"<br>"Respectively Stand for: Performance Type/Capacity Type"<br>|
|**masterNodeDiskVolume**|Integer|False| |Master node cloud disk capacity must be the integral multiples of 10, but greater than 20 and less than 3000GB|
|**masterNodeNumber**|Integer|False| |Master Node Number|
|**name**|String|False| |Cluster name allows Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, with the length of 6-32 characters.|
|**password**|String|False| |"Cluster Password"<br>"1. It must include three types of the capital letters, lowercase letters, numbers and special characters, and cannot be less than 8 characters nor exceed 30 characters"<br>"2. Special characters are as follows!@#$%^*"<br>"3. Characters or complete words that cannot be included are as follows: jd, JD, 360, bug, BUG, com, COM, jcloud, JCLOUD, cloud, CLOUD, password, PASSWORD"<br>"4. Consecutive numbers cannot be included, such as: 123, 987"<br>"5. Consecutive or key mapping consecutive letters cannot be included, such as abc, CBA, bcde, qaz, tfc, zaq, and qwer"<br>"6. Password can't include your PIN"<br>|
|**payType**|String|False| |"Payment type, please fill in one of the following lists:"<br>"By Amount"<br>|
|**slaveNodeDiskType**|String|False| |"Slave node cloud disk type, the optional types are (the following types are separated with "/")"<br>"NBD/NBD_SATA"<br>"Respectively Stand for: Performance Type/Capacity Type"<br>|
|**slaveNodeDiskVolume**|Integer|False| |Slave node cloud disk capacity must be the integral multiples of 10, but greater than 20 and less than 3000GB|
|**slaveNodeNumber**|Integer|False| |Slave Node Number|
|**softwareList**|String|False|HADOOP,ZOOKEEPER|Software list, different software shall be separated with English comma (,); refer to [document](https://www.jdcloud.com/help/detail/1323/isCatalog/1)|
|**version**|String|False| |"Software service Version, please fill in one of the following lists:"<br>"JMR1.0.0"<br>"JMR1.0.1"<br>"JMR1.0.2"<br>"JMR2.0.0"<br>"JMR_BD-OS-1.0"<br>|
|**vpcId**|String|False|new|Virtual Private Cloud ID|
|**vpcSubnetId**|String|False|new|Subnet UUID can be obtained by querying the subnet list|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
