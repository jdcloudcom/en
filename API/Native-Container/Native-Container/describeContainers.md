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
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|
|**name**|String|True| |Name of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**totalCount**|Number| |
|**containers**|Container[]| |
### Container
|Name|Type|Description|
|---|---|---|
|**status**|String|Container Status |
|**tty**|Boolean|If a container is assigned with tty |
|**vpcId**|String|ID of Primary Network Interface’s VPC |
|**description**|String|Container Description|
|**elasticIpId**|String|Elastic IP ID Associated to Primary IP of Primary Network Interface |
|**image**|String|Image Name|
|**args**|String[]|Parameters for Command Execution by Container |
|**command**|String[]|Container Execution Command |
|**logConfiguration**|LogConfiguration|Container Log Configuration Information|
|**reason**|String|Container Termination Reason |
|**elasticIpAddress**|String|Elastic IP Associated to Primary IP of Primary Network Interface |
|**subnetId**|String|ID of Primary Network Interface’s Subnet |
|**primaryNetworkInterface**|InstanceNetworkInterfaceAttachment|Primary Network Interface Information|
|**az**|String|Availability Zone|
|**instanceType**|String|Instance Type|
|**containerId**|String|Container ID |
|**dataVolumes**|VolumeMount[]|Mounted Data Volume Information |
|**name**|String|Container Name|
|**envs**|EnvVar[]|Environment Variable for Execution by Dynamically-assigned Container |
|**hostAliases**|HostAlias[]|Domain and IP Mapping Information|
|**hostname**|String|Machine Name |
|**workingDir**|String|Container’s Working Catalog |
|**secret**|String|Name Cited by Secret |
|**charge**|Charge|Billing Configuration Information |
|**rootVolume**|VolumeMount|Root Volume Information |
|**launchTime**|String|Creation Time|
|**secondaryNetworkInterfaces**|InstanceNetworkInterfaceAttachment[]|Elastic Network Interface Information|
|**privateIpAddress**|String|Primary IP address of primary network interface|
### InstanceNetworkInterfaceAttachment
|Name|Type|Description|
|---|---|---|
|**deviceIndex**|Integer|Device Index|
|**attachStatus**|String|Associating Status|
|**autoDelete**|Boolean|Indicate that if the network interface is deleted when deleting an instance|
|**attachTime**|String|Associating Time|
|**networkInterface**|InstanceNetworkInterface|Elastic Network Interface Information|
### InstanceNetworkInterface
|Name|Type|Description|
|---|---|---|
|**macAddress**|String|Ethernet Address|
|**vpcId**|String|Virtual Network ID|
|**description**|String|Description|
|**networkInterfaceId**|String|ENI ID|
|**secondaryIps**|NetworkInterfacePrivateIp[]| |
|**sanityCheck**|Boolean|Source and target IP address verification, with value 0 or 1|
|**securityGroups**|SecurityGroupSimple[]|Security Group List|
|**primaryIp**|NetworkInterfacePrivateIp|Network Interface Primary IP|
### NetworkInterfacePrivateIp
|Name|Type|Description|
|---|---|---|
|**privateIpAddress**|String|IPV4 Address of Private IP|
|**elasticIpId**|String|IPV4 Address of Private IP|
|**elasticIpAddress**|String|Elastic IP Instance Address|
### SecurityGroupSimple
|Name|Type|Description|
|---|---|---|
|**groupName**|String|Security Group Name|
|**groupId**|String|Security Group ID|
### VolumeMount
|Name|Type|Description|
|---|---|---|
|**category**|String|Environment Variable Name|
|**cloudDisk**|InstanceCloudDisk|Cloud Disk Service Specification|
|**readOnly**|Boolean|Read-only, false by default; only valid to data volume; when root volume is false.|
|**mountPath**|String|Catalog Mounted into the Container|
|**autoDelete**|Boolean|Automatic deletion, the volume is automatically deleted at the time the container is deleted.|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now.|
### InstanceCloudDisk
|Name|Type|Description|
|---|---|---|
|**status**|String|Cloud Disk Service type, value: creating, available, in-use, extending, restoring, deleting, deleted, error_creating, error_deleting, error_restoring or error_extending|
|**name**|String|Disk Name|
|**diskType**|String|Disk Type, Value: ssd or premium-hdd|
|**diskSize**|Integer|Disk Size (GiB)|
|**az**|String|Corresponding AZ|
|**createTime**|String|Creation Time|
|**diskId**|String|Cloud Disk ID|
|**description**|String|Disk Description|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
### HostAlias
|Name|Type|Description|
|---|---|---|
|**ip**|String|IP Address|
|**hostnames**|String[]|Domain List|
### EnvVar
|Name|Type|Description|
|---|---|---|
|**name**|String|Environment Variable Name|
|**value**|String|Value of Environment Variable|
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

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
