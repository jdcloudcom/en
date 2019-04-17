# createNodeGroup


## Description
nodeGroup creating k8s
The cluster status is required to be running


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
|**clusterId**|String|True| |cluster of node group|
|**nodeConfig**|NodeConfigSpec|True| |Configuration of Node Group|
|**initialNodeCount**|Integer|True| |Initial Size of nodeGroup|
|**vpcId**|String|True| |vpc run by k8s|
|**nodeCidr**|String|True| |cidr of node of k8s|
|**autoRepair**|Boolean|False| |Whether to enable automatic repair of node group: disabled by default.|

### NodeConfigSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceType**|String|True| |Instance Type Family|
|**version**|String|False| |Image Information|
|**systemDiskSize**|Integer|True| |System disk size of cloud disk  unit (GB)|
|**systemDiskType**|String|True| |System disk size of cloud disk [ssd,premium-hdd]|
|**labels**|LabelSpec[]|False| |Information of Node|
### LabelSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|True| |key consists of two parts: prefix and name, name is compulsory while prefix is optional. prefix is separated from name with "/”. <br>name can use letters, figures and [-_.]. The length shall be less than 63. prefix: Follow DNS standard (For example: kubernetes.io/) and the length cannot exceed 253 <br>[Reference](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set)    <br>|
|**value**|String|False| |letters, figures, [-_.], and the length cannot exceed 63|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
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
