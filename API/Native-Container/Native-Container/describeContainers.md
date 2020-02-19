# describeContainers


## Description
Search Native Container details in batches <br>
This API supports paging query with 20 items per page by default.


## Request method
GET

## Request address
https://nativecontainer.jdcloud-api.com/v1/regions/{regionId}/containers

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page; 1 by default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|
|**filters**|[Filter[]](describecontainers#filter)|False| |containerId - instance ID, accuracy matching, supporting multiple <br>privateIpAddress - Primary network interface IP address, fuzzy matching, supporting a single <br>az - Availability zone, accuracy matching, supporting multiple <br>vpcId - VPC ID, accuracy matching, supporting multiple <br>status - Container status, accuracy matching, supporting multiple <br>name -  Instance name, fuzzy matching, supporting a single <br>subnetId -  Image ID, fuzzy matching, supporting a single <br>securityGroups - Security group id, accuracy matching, supporting multiple<br>|
|**tags**|[TagFilter[]](describecontainers#tagfilter)|False| |Tag Screen Requirements|

### <div id="tagfilter">TagFilter</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**key**|String|True| |Tag Key|
|**values**|String[]|False| |Tag Value|
### <div id="filter">Filter</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describecontainers#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**containers**|[Container[]](describecontainers#container)| |
|**totalCount**|Number| |
### <div id="container">Container</div>
|Name|Type|Description|
|---|---|---|
|**containerId**|String|Container ID |
|**status**|String|Container Status |
|**instanceType**|String|Instance Type|
|**az**|String|Availability Zone|
|**name**|String|Container Name|
|**hostAliases**|[HostAlias[]](describecontainers#hostalias)|Domain and IP mapping information|
|**hostname**|String|Machine Name |
|**command**|String[]|Container Execution Command |
|**args**|String[]|Parameters for Command Execution by Container |
|**envs**|[EnvVar[]](describecontainers#envvar)|Environment variable for execution by dynamically-assigned container|
|**image**|String|Image Name|
|**secret**|String|Secrets Name|
|**tty**|Boolean|If a container is assigned with tty |
|**workingDir**|String|Container’s Working Catalog |
|**rootVolume**|[VolumeMount](describecontainers#volumemount)|Root Volume information|
|**dataVolumes**|[VolumeMount[]](describecontainers#volumemount)|Mounted data Volume information|
|**vpcId**|String|ID of the VPC to which the primary network interface belongs|
|**subnetId**|String|ID of the subnet to which the primary network interface belongs|
|**privateIpAddress**|String|Primary IP address of primary network interface|
|**elasticIpId**|String|The ID of the primary IP of primary network interface associating EIP|
|**elasticIpAddress**|String|The address of the primary IP of primary network interface associating EIP|
|**primaryNetworkInterface**|[InstanceNetworkInterfaceAttachment](describecontainers#instancenetworkinterfaceattachment)|Primary network interface information|
|**secondaryNetworkInterfaces**|[InstanceNetworkInterfaceAttachment[]](describecontainers#instancenetworkinterfaceattachment)|Elastic network interface information|
|**logConfiguration**|[LogConfiguration](describecontainers#logconfiguration)|Container log configuration information|
|**tags**|[Tag[]](describecontainers#tag)| |
|**charge**|[Charge](describecontainers#charge)|Billing configuration information|
|**launchTime**|String|Creation Time|
|**reason**|String|Container Termination Reason |
|**description**|String|Container Description|
### <div id="charge">Charge</div>
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
### <div id="tag">Tag</div>
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### <div id="logconfiguration">LogConfiguration</div>
|Name|Type|Description|
|---|---|---|
|**logDriver**|String|Name log configuration information; a 10MB storage space will be assigned to the local by default and is automatically rotated.|
### <div id="instancenetworkinterfaceattachment">InstanceNetworkInterfaceAttachment</div>
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Indicate that if the network interface is deleted when deleting an instance|
|**deviceIndex**|Integer|Device Index|
|**attachStatus**|String|Associating Status|
|**attachTime**|String|Associating Time|
|**networkInterface**|[InstanceNetworkInterface](describecontainers#instancenetworkinterface)|Elastic network interface information|
### <div id="instancenetworkinterface">InstanceNetworkInterface</div>
|Name|Type|Description|
|---|---|---|
|**networkInterfaceId**|String|ENI ID|
|**macAddress**|String|Ethernet Address|
|**vpcId**|String|Virtual Network ID|
|**subnetId**|String|Subnet ID|
|**description**|String|Description|
|**securityGroups**|[SecurityGroupSimple[]](describecontainers#securitygroupsimple)|Security Group List|
|**sanityCheck**|Boolean|Source and target IP address verification, with value 0 or 1|
|**primaryIp**|[NetworkInterfacePrivateIp](describecontainers#networkinterfaceprivateip)|Primary IP of Network Interface|
|**secondaryIps**|[NetworkInterfacePrivateIp[]](describecontainers#networkinterfaceprivateip)| |
### <div id="networkinterfaceprivateip">NetworkInterfacePrivateIp</div>
|Name|Type|Description|
|---|---|---|
|**privateIpAddress**|String|IPV4 Address of Private IP|
|**elasticIpId**|String|Elastic IP instance ID|
|**elasticIpAddress**|String|Elastic IP Instance Address|
### <div id="securitygroupsimple">SecurityGroupSimple</div>
|Name|Type|Description|
|---|---|---|
|**groupId**|String|Security Group ID|
|**groupName**|String|Security Group Name|
### <div id="volumemount">VolumeMount</div>
|Name|Type|Description|
|---|---|---|
|**category**|String|Disk Category|
|**autoDelete**|Boolean|Automatic deletion, the volume is automatically deleted at the time the container is deleted.|
|**mountPath**|String|Catalog Mounted into the Container|
|**readOnly**|Boolean|Read-only, false by default; only valid to data volume; when root volume is false.|
|**cloudDisk**|[InstanceCloudDisk](describecontainers#instanceclouddisk)|Cloud disk specification|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now.|
### <div id="instanceclouddisk">InstanceCloudDisk</div>
|Name|Type|Description|
|---|---|---|
|**diskId**|String|Cloud Disk ID|
|**az**|String|Corresponding AZ|
|**name**|String|Disk Name|
|**description**|String|Disk Description|
|**diskType**|String|Disk Type|
|**diskSize**|Integer|Disk Size (GiB)|
|**iops**|Integer|The iops value to be purchased as designated by the user currently only supports the cloud disk of ssd.io1 type|
|**status**|String|Cloud Disk Service type, value: creating, available, in-use, extending, restoring, deleting, deleted, error_creating, error_deleting, error_restoring or error_extending|
|**createTime**|String|Creation Time|
### <div id="envvar">EnvVar</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Environment Variable Name|
|**value**|String|Value of Environment Variable|
### <div id="hostalias">HostAlias</div>
|Name|Type|Description|
|---|---|---|
|**hostnames**|String[]|Domain List|
|**ip**|String|IP Address|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
