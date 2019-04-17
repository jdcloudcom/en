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
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**cluster**|Cluster| |
### Cluster
|Name|Type|Description|
|---|---|---|
|**clusterId**|String|Cluster id|
|**name**|String|Name|
|**description**|String|Description|
|**version**|String|Version of kubernetes|
|**azs**|String[]|az where the cluster is located|
|**nodeGroups**|NodeGroup[]|List Node Group|
|**clusterCidr**|String|cidr of cluster of k8s|
|**masterAuth**|MasterAuth|Verification Information|
|**clusterState**|String|Status  [pending,running,reconciling (status at the time of upgrade), deleting, deleted, error]|
|**stateMessage**|String|Status Change Reason|
|**updateTime**|String|Update Time|
|**createTime**|String|Creation Time|
|**accessKey**|String|User’s AccessKey, the verification credential when the plug-in calls open-api|
|**basicAuth**|Boolean| |
|**clientCertificate**|Boolean| |
|**endpoint**|String|ip accessed by user|
|**endpointPort**|String|port of endpoint|
|**dashboardPort**|String|dashboard port of endpoint|
|**userMetrics**|Boolean|Whether the user enables cluster Custom Metric Monitoring|
### MasterAuth
|Name|Type|Description|
|---|---|---|
|**clusterCaCertificate**|String|base64 code, public certificate of cluster root|
|**clientCertificate**|String|base64 code, public certificate of client connection cluster|
|**clientKey**|String|base64 code, private key of client|
|**user**|String|user of basic auth|
|**password**|String|password of basic auth|
### NodeGroup
|Name|Type|Description|
|---|---|---|
|**clusterId**|String|Cluster id|
|**nodeGroupId**|String|node group id|
|**name**|String|Name|
|**description**|String|Description|
|**nodeConfig**|NodeConfig|Information of Node|
|**version**|String|Version of node in k8s|
|**nodeNetwork**|NodeNetwork|Network Information of node|
|**currentCount**|Integer|Current Count of node(s)|
|**expectCount**|Integer|Expected Count of node(s)|
|**agId**|String|ag id of node group; instance under this node group can be searched by agid|
|**instanceTemplateId**|String|Instance Template Corresponding to ag id of node group|
|**state**|String|Status  [pending,running,resizing,reconciling,deleting,deleted,error,running_with_error(There are problems in some nodes)]|
|**updateTime**|String|Update Time|
|**stateMessage**|String|Status Change Reason|
|**autoRepair**|String|Whether to enable automatic repair|
|**createdTime**|String|Creation Time|
### NodeNetwork
|Name|Type|Description|
|---|---|---|
|**podSubnetId**|String|id of Pod Subnet|
|**nodeSubnetId**|String|id of node Subnet|
|**serviceSubnetId**|String|id of service Subnet|
|**servicePublicSubnetId**|String|Subnet id with public network access capacity for service associated LB|
|**nodeNetworkCidr**|String|cidr of node|
|**vpcId**|String|vpc id|
### NodeConfig
|Name|Type|Description|
|---|---|---|
|**instanceType**|String|Instance Type Family|
|**imageId**|String|Image Information|
|**systemDiskSize**|Integer|System disk size of cloud disk  unit (GB)|
|**systemDiskType**|String|System disk size of cloud disk [ssd,premium-hdd]|
|**labels**|LabelSpec[]|Information of Node|
### LabelSpec
|Name|Type|Description|
|---|---|---|
|**key**|String|key consists of two parts: prefix and name, name is compulsory while prefix is optional. prefix is separated from name with "/”. <br>name can use letters, figures and [-_.]. The length shall be less than 63. prefix: Follow DNS standard (For example: kubernetes.io/) and the length cannot exceed 253 <br>[Reference](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set)    <br>|
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
