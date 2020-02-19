# createNodeGroup


## Description
Create working node group<br>
- The cluster status is required to be running


## Request Method
POST

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/nodeGroups

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name (internal cluster of the same user is unique)|
|**description**|String|False| |Description|
|**clusterId**|String|True| |Cluster to which working node belongs|
|**nodeConfig**|[NodeConfigSpec](createnodegroup#nodeconfigspec)|True| |Configuration Information of Working Node Group|
|**azs**|String[]|False| |az in Working Node Group must be subset of cluster az, and cluster az is set by default|
|**initialNodeCount**|Integer|True| |Initial Size of Working Node Group|
|**vpcId**|String|True| |VPC operated by working node group with the initial size|
|**nodeCidr**|String|True| |cidr of Working Node Group|
|**autoRepair**|Boolean|False| |Whether to enable automatic repair of working node group, disable is set by default|
|**caConfig**|[CAConfigSpec](createnodegroup#caconfigspec)|False| |Auto-Scaling Configuration|

### <div id="caconfigspec">CAConfigSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**enable**|Boolean|False| |Whether to enable auto scaling, false<br> is set by default|
|**maxNode**|Integer|False| |Maximum working node number is automatically expanded with the value range being [1, min (2000, subnet surplus ip)]|
|**minNode**|Integer|False| |Minimum working node number is automatically expanded with the value range being [0, min (2000, maxNode)]|
### <div id="nodeconfigspec">NodeConfigSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceType**|String|True| |Instance Type Family|
|**version**|String|False| |Working Node Version, if not specified, the default version shall be used|
|**password**|String|False| |Virtual Machine password is cluster password by default and for the password specification, refer to: [Specification for Public Parameters](https://docs.jdcloud.com/en/virtual-machines/api/general_parameters)|
|**keyNames**|String[]|False| |Virtual Machine SSH Key Pair Name, only one is supported now Do not delete the SSH key pair in service|
|**systemDisk**|[DiskSpec](createnodegroup#diskspec)|False| |Configuration Information of Virtual Machines System Disk|
|**labels**|[LabelSpec[]](createnodegroup#labelspec)|False| |Tag of Working Node Group, ten tags are supported at most|
### <div id="labelspec">LabelSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|True| |key consists of two parts: prefix and name, name is compulsory while prefix is optional. prefix is separated from name with "/". <br>name can use letters, figures and [-_.]. The length shall be less than 63. prefix: Follow DNS standard (For example: kubernetes.io/) and the length cannot exceed 253 <br>[Reference](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set)    <br>|
|**value**|String|False| |letters, figures, [-_.], and the length cannot exceed 63|
### <div id="diskspec">DiskSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**systemDiskCategory**|String|False| |Disk type, with value of cloud or local, cloud is set by default|
|**systemDiskSize**|Integer|False| |System disk size of cloud disk  unit (GB)|
|**systemDiskType**|String|False| |Cloud Disk System Disk type, supports hdd.std1, ssd.gp1 and ssd.io1|
|**systemDiskIops**|Integer|False| |Cloud Disk iops, only cloud disk of ssd.io1 type is valid|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createnodegroup#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**nodeGroupId**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
