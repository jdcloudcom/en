# describeNodeGroup


## Description
Search details of a single working node group

## Request Method
GET

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/nodeGroups/{nodeGroupId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**nodeGroupId**|String|True| |Working Node Group ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describenodegroup#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**nodeGroup**|[NodeGroup](describenodegroup#nodegroup)| |
### <div id="nodegroup">NodeGroup</div>
|Name|Type|Description|
|---|---|---|
|**clusterId**|String|Cluster id|
|**nodeGroupId**|String|Working Node Group id|
|**name**|String|Working Node Group Name|
|**description**|String|Working Node Group Description|
|**nodeConfig**|[NodeConfig](describenodegroup#nodeconfig)|Working Node Group Configuration Information|
|**version**|String|Working Node Version|
|**nodeNetwork**|[NodeNetwork](describenodegroup#nodenetwork)|Network information to which working node belongs|
|**currentCount**|Integer|Current Working Node Quantity|
|**expectCount**|Integer|Expected Working Node Quantity|
|**agId**|String|ag id of working node group, instance under this working node group can be searched by agid|
|**azs**|String[]|az where working node groups reside|
|**instanceTemplateId**|String|Instance templates corresponding to ag of working node group|
|**state**|String|Status  [pending,running,resizing,reconciling,deleting,deleted,error,running_with_error(There are problems in some nodes)]|
|**tags**|[Tag[]](describenodegroup#tag)| |
|**updateTime**|String|Update Time|
|**stateMessage**|String|Status Change Reason|
|**autoRepair**|Boolean|Whether to enable automatic repair|
|**progress**|[NodeGroupProgress](describenodegroup#nodegroupprogress)|Control Node Operation Progress|
|**caConfig**|[CAConfig](describenodegroup#caconfig)|Auto-Scaling Configuration|
|**createdTime**|String|Creation Time|
### <div id="caconfig">CAConfig</div>
|Name|Type|Description|
|---|---|---|
|**enable**|Boolean|Whether auto scaling is enabled or not<br>|
|**maxNode**|Integer|Maximum working node quantity is automatically expanded|
|**minNode**|Integer|Minimum working node quantity is automatically expanded|
### <div id="nodegroupprogress">NodeGroupProgress</div>
|Name|Type|Description|
|---|---|---|
|**nodeGroupId**|String|Working Node Group id|
|**action**|String|Operation types include upgrade, downgrade and rollback|
|**totalCount**|Integer|Total Working Node Quantity|
|**updatedCount**|Integer|Upgrade-completed Working Node Quantity|
### <div id="tag">Tag</div>
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### <div id="nodenetwork">NodeNetwork</div>
|Name|Type|Description|
|---|---|---|
|**podSubnetId**|String|id of Pod Subnet|
|**nodeSubnetId**|String|id of node Subnet|
|**serviceSubnetId**|String|id of service Subnet|
|**servicePublicSubnetId**|String|Subnet id with public network access capacity for service associated LB|
|**nodeNetworkCidr**|String|cidr of node|
|**vpcId**|String|vpc id|
### <div id="nodeconfig">NodeConfig</div>
|Name|Type|Description|
|---|---|---|
|**instanceType**|String|Instance Type Family|
|**imageId**|String|Image Information|
|**keyNames**|String[]|Virtual Machine SSH Key Pair Name|
|**systemDiskCategory**|String|Virtual Machine Disk Type|
|**systemDiskSize**|Integer|Size of Virtual Machine Cloud Disk System Disk with Unit (GB)|
|**systemDiskType**|String|Virtual Machine Cloud Disk System Disk Type|
|**systemDiskIops**|Integer|Virtual Machine Cloud Disk iops, only cloud disk of ssd type is valid|
|**labels**|[LabelSpec[]](describenodegroup#labelspec)|Tag of Working Node Group|
### <div id="labelspec">LabelSpec</div>
|Name|Type|Description|
|---|---|---|
|**key**|String|key consists of two parts: prefix and name, name is compulsory while prefix is optional. prefix is separated from name with "/". <br>name can use letters, figures and [-_.]. The length shall be less than 63. prefix: Follow DNS standard (For example: kubernetes.io/) and the length cannot exceed 253 <br>[Reference](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set)    <br>|
|**value**|String|letters, figures, [-_.], and the length cannot exceed 63|

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
