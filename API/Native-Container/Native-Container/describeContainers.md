# describeContainers


## Description
Search Native Container details in batches <br>
This API supports paging query with 20 items per page by default.


## Request method
GET

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page; 1 by default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|
|**filters**|Filter[]|False| |containerId - Instance ID, exact match, support many IDs<br>privateIpAddress - Primary network interface IP address, fuzzy matching and supporting many IP addresses<br>az-Availability Zone, exact match, multiple supported<br>vpcId-VPC ID, exact match, multiple supported<br>status - Container status, exact match, support many statuses<br>name - Instance name, fuzzy matching and supporting many names<br>subnetId - Instance ID, fuzzy matching and supporting many IDs<br>|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**containers**|Container[]| |
|**totalCount**|Number| |
### Container
|Name|Type|Description|
|---|---|---|
|**containerId**|String|Container ID |
|**status**|String|Container Status |
|**instanceType**|String|Instance Type|
|**az**|String|Availability Zone|
|**name**|String|Container Name|
|**hostAliases**|HostAlias[]|Domain and IP Mapping Information|
|**hostname**|String|Machine Name |
|**command**|String[]|Container Execution Command |
|**args**|String[]|Parameters for Command Execution by Container |
|**envs**|EnvVar[]|Environment Variable for Execution by Dynamically-assigned Container |
|**image**|String|Image Name|
|**secret**|String|Name Cited by Secret |
|**tty**|Boolean|If a container is assigned with tty |
|**workingDir**|String|Container’s Working Catalog |
|**rootVolume**|VolumeMount|Root Volume Information |
|**dataVolumes**|VolumeMount[]|Mounted Data Volume Information |
|**vpcId**|String|ID of the VPC to which the primary network interface belongs|
|**subnetId**|String|ID of the subnet to which the primary network interface belongs|
|**privateIpAddress**|String|Primary IP address of primary network interface|
|**elasticIpId**|String|The ID of the primary IP of primary network interface associating EIP|
|**elasticIpAddress**|String|The address of the primary IP of primary network interface associating EIP|
|**primaryNetworkInterface**|InstanceNetworkInterfaceAttachment|Primary Network Interface Information|
|**secondaryNetworkInterfaces**|InstanceNetworkInterfaceAttachment[]|Elastic Network Interface Information|
|**logConfiguration**|LogConfiguration|Container Log Configuration Information|
|**charge**|Charge|Billing Configuration Information |
|**launchTime**|String|Creation Time|
|**reason**|String|Container Termination Reason |
|**description**|String|Container Description|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
### LogConfiguration
|Name|Type|Description|
|---|---|---|
|**logDriver**|String|Name log configuration information; a 10MB storage space will be assigned to the local by default and is automatically rotated.|
|**options**|LogOption|Configuration Options of Log Driver|
### LogOption
|Name|Type|Description|
|---|---|---|
|**key**|String| |
|**value**|String| |
### InstanceNetworkInterfaceAttachment
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Indicate that if the network interface is deleted when deleting an instance|
|**deviceIndex**|Integer|Device Index|
|**attachStatus**|String|Associating Status|
|**attachTime**|String|Associating Time|
|**networkInterface**|InstanceNetworkInterface|Elastic Network Interface Information|
### InstanceNetworkInterface
|Name|Type|Description|
|---|---|---|
|**networkInterfaceId**|String|ENI ID|
|**macAddress**|String|Ethernet Address|
|**vpcId**|String|Virtual Network ID|
|**description**|String|Description|
|**securityGroups**|SecurityGroupSimple[]|Security Group List|
|**sanityCheck**|Boolean|Source and target IP address verification, with value 0 or 1|
|**primaryIp**|NetworkInterfacePrivateIp|Network Interface Primary IP|
|**secondaryIps**|NetworkInterfacePrivateIp[]| |
### NetworkInterfacePrivateIp
|Name|Type|Description|
|---|---|---|
|**privateIpAddress**|String|IPV4 Address of Private IP|
|**elasticIpId**|String|IPV4 Address of Private IP|
|**elasticIpAddress**|String|Elastic IP Instance Address|
### SecurityGroupSimple
|Name|Type|Description|
|---|---|---|
|**groupId**|String|Security Group ID|
|**groupName**|String|Security Group Name|
### VolumeMount
|Name|Type|Description|
|---|---|---|
|**category**|String|Environment Variable Name|
|**autoDelete**|Boolean|Automatic deletion, the volume is automatically deleted at the time the container is deleted.|
|**mountPath**|String|Catalog Mounted into the Container|
|**readOnly**|Boolean|Read-only, false by default; only valid to data volume; when root volume is false.|
|**cloudDisk**|InstanceCloudDisk|Cloud Disk Service Specification|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now.|
### InstanceCloudDisk
|Name|Type|Description|
|---|---|---|
|**diskId**|String|Cloud Disk ID|
|**az**|String|Corresponding AZ|
|**name**|String|Disk Name|
|**description**|String|Disk Description|
|**diskType**|String|Disk Type, Value: ssd or premium-hdd|
|**diskSize**|Integer|Disk Size (GiB)|
|**status**|String|Cloud Disk Service type, value: creating, available, in-use, extending, restoring, deleting, deleted, error_creating, error_deleting, error_restoring or error_extending|
|**createTime**|String|Creation Time|
### EnvVar
|Name|Type|Description|
|---|---|---|
|**name**|String|Environment Variable Name|
|**value**|String|Value of Environment Variable|
### HostAlias
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
