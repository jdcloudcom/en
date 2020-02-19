# describeCluster


## Description
Search details of a single cluster.

## Request Method
GET

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/clusters/{clusterId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**clusterId**|String|True| |Cluster ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describecluster#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**cluster**|[Cluster](describecluster#cluster)| |
### <div id="cluster">Cluster</div>
|Name|Type|Description|
|---|---|---|
|**clusterId**|String|Cluster id|
|**name**|String|Name|
|**description**|String|Description|
|**version**|String|Version of kubernetes|
|**azs**|String[]|az where the cluster is located|
|**nodeGroups**|[NodeGroup[]](describecluster#nodegroup)|List Node Group|
|**clusterCidr**|String|cidr of cluster of k8s|
|**masterAuth**|[MasterAuth](describecluster#masterauth)|Verification Information|
|**clusterState**|String|Status  [pending,running,reconciling (status at the time of upgrade), deleting, deleted, error]|
|**stateMessage**|String|Status Change Reason|
|**updateTime**|String|Update Time|
|**createTime**|String|Creation Time|
|**accessKey**|String|User’s AccessKey, the verification credential when the plug-in calls open-api|
|**basicAuth**|Boolean|Basic Verification Method|
|**clientCertificate**|Boolean|Certificate Verification Method|
|**endpoint**|String|ip accessed by user|
|**endpointPort**|String|port of endpoint|
|**dashboardPort**|String|dashboard port of endpoint|
|**userMetrics**|Boolean|deprecated is preferentially subject to the configuration in addonsConfig <br>Whether the user enables cluster custom metric monitoring, true means enabled and false means not enabled|
|**addonsConfig**|[AddonConfig[]](describecluster#addonconfig)|Cluster Component Configuration Information|
|**autoUpgrade**|Boolean|Whether to Enable Cluster automatically upgrade, true means enabled and false means not enabled|
|**maintenanceWindow**|[MaintenanceWindow](describecluster#maintenancewindow)|Configuration Cluster Maintenance Policy|
|**upgradePlan**|[UpgradePlan](describecluster#upgradeplan)|Cluster Upgrade Schedule Information, only the latest upgrade schedule information is demonstrated|
|**masterProgress**|[MaintenanceWindow](describecluster#maintenancewindow)|Control Node Operation Progress|
### <div id="maintenancewindow">MaintenanceWindow</div>
|Name|Type|Description|
|---|---|---|
|**periodType**|String|daily, weekly and monthly, weekly is set by default|
|**startDay**|Integer|Specific starting date of maintenance operation is only valid for periodType with value of weekly or monthly, the numbers from 1 to 7 are available for periodType with value of weekly, and the numbers from 1 to 28 are available for periodType with value of monthly <br>|
|**startTime**|String|The format of the specific starting date of maintenance operation shall comply with RFC3339, and UTC time shall be used with the accuracy to minute, i.e. 23: 27|
|**duration**|Integer|Maintenance running period: 4-24 hours, the step length is one hour, 4 hours is set by default|
### <div id="upgradeplan">UpgradePlan</div>
|Name|Type|Description|
|---|---|---|
|**mode**|String|Upgrade methods include auto and manual|
|**scope**|String|Upgrade ranges include cluster, master and nodegroup|
|**state**|String|Upgrade schedule statuses include waiting and upgrading|
|**masterExpectedVersion**|String|master  Expected Version|
|**nodeExpectedVersion**|String|node  Expected Version|
|**startTime**|String|Upgrade Starting Time|
|**duration**|Integer|Sustaining Time|
### <div id="addonconfig">AddonConfig</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Component Name|
|**enabled**|Boolean|Whether component is enabled or not|
### <div id="masterauth">MasterAuth</div>
|Name|Type|Description|
|---|---|---|
|**clusterCaCertificate**|String|base64 code, public certificate of cluster root|
|**clientCertificate**|String|base64 code, public certificate of client connection cluster|
|**clientKey**|String|base64 code, private key of client|
|**user**|String|user of basic auth|
|**password**|String|password of basic auth|
### <div id="nodegroup">NodeGroup</div>
|Name|Type|Description|
|---|---|---|
|**clusterId**|String|Cluster id|
|**nodeGroupId**|String|Working Node Group id|
|**name**|String|Working Node Group Name|
|**description**|String|Working Node Group Description|
|**nodeConfig**|[NodeConfig](describecluster#nodeconfig)|Working Node Group Configuration Information|
|**version**|String|Working Node Version|
|**nodeNetwork**|[NodeNetwork](describecluster#nodenetwork)|Network information to which working node belongs|
|**currentCount**|Integer|Current Working Node Quantity|
|**expectCount**|Integer|Expected Working Node Quantity|
|**agId**|String|ag id of working node group, instance under this working node group can be searched by agid|
|**azs**|String[]|az where working node groups reside|
|**instanceTemplateId**|String|Instance templates corresponding to ag of working node group|
|**state**|String|Status  [pending,running,resizing,reconciling,deleting,deleted,error,running_with_error(There are problems in some nodes)]|
|**tags**|[Tag[]](describecluster#tag)| |
|**updateTime**|String|Update Time|
|**stateMessage**|String|Status Change Reason|
|**autoRepair**|Boolean|Whether to enable automatic repair|
|**progress**|[NodeGroupProgress](describecluster#nodegroupprogress)|Control Node Operation Progress|
|**caConfig**|[CAConfig](describecluster#caconfig)|Auto-Scaling Configuration|
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
|**labels**|[LabelSpec[]](describecluster#labelspec)|Tag of Working Node Group|
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
