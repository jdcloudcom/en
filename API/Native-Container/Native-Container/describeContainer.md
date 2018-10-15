# describeContainer


## Description
Search details of one Native Container


## Request method
GET

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**containerId**|String|True| |Container ID|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**container**|Container| |
### Container
|Name|Type|Description|
|---|---|---|
|**args**|String[]|Parameters for Command Execution by Container |
|**az**|String|Availability Zone |
|**charge**|Charge|Billing Configuration Information |
|**command**|String[]|Container Execution Command |
|**containerId**|String|Container ID |
|**dataVolumes**|VolumeMount[]|Mounted Data Volume Information |
|**description**|String|Container Description|
|**elasticIpAddress**|String|Elastic IP Associated to Primary IP of Primary Network Interface |
|**elasticIpId**|String|Elastic IP ID Associated to Primary IP of Primary Network Interface |
|**envs**|EnvVar[]|Environment Variable for Execution by Dynamically-assigned Container |
|**hostAliases**|HostAlias[]|Domain and IP Mapping Information|
|**hostname**|String|Machine Name |
|**image**|String|Image Name|
|**instanceType**|String|Instance Type Family |
|**launchTime**|String|Creation Time|
|**logConfiguration**|LogConfiguration|Container Log Configuration Information|
|**name**|String|Container Name|
|**primaryNetworkInterface**|InstanceNetworkInterfaceAttachment|Primary Network Interface Information|
|**privateIpAddress**|String|Primary IP Address of Primary Network Interface |
|**reason**|String|Container Termination Reason |
|**rootVolume**|VolumeMount|Root Volume Information |
|**secondaryNetworkInterfaces**|InstanceNetworkInterfaceAttachment[]|Elastic Network Interface Information|
|**secret**|String|Name Cited by Secret |
|**status**|String|Container Status |
|**subnetId**|String|ID of Primary Network Interface’s Subnet |
|**tty**|Boolean|If a container is assigned with tty |
|**vpcId**|String|ID of Primary Network Interface’s VPC |
|**workingDir**|String|Container’s Working Catalog |
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
### VolumeMount
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Automatic deletion, the volume is automatically deleted at the time the container is deleted.|
|**category**|String|Environment Variable Name|
|**cloudDisk**|InstanceCloudDisk|Cloud Disk Service Specification|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now.|
|**mountPath**|String|Catalog Mounted into the Container|
|**readOnly**|Boolean|Read-only, false by default; only valid to data volume; when root volume is false.|
### InstanceCloudDisk
|Name|Type|Description|
|---|---|---|
|**az**|String|Corresponding AZ|
|**createTime**|String|Creation Time|
|**description**|String|Disk Description|
|**diskId**|String|Cloud Disk Service ID|
|**diskSize**|Integer|Disk Size (GiB)|
|**diskType**|String|Disk Type, Value: ssd or premium-hdd|
|**name**|String|Disk Name|
|**status**|String|Cloud Disk Service type, value: creating, available, in-use, extending, restoring, deleting, deleted, error_creating, error_deleting, error_restoring or error_extending|
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
|**attachStatus**|String|Associating Status|
|**attachTime**|String|Associating Time|
|**autoDelete**|Boolean|Indicate that if the network interface is deleted when deleting an instance|
|**deviceIndex**|Integer|Device Index|
|**networkInterface**|InstanceNetworkInterface|Elastic Network Interface Information|
### InstanceNetworkInterface
|Name|Type|Description|
|---|---|---|
|**description**|String|Description|
|**macAddress**|String|Ethernet Address|
|**networkInterfaceId**|String|Elastic Network Interface ID|
|**primaryIp**|NetworkInterfacePrivateIp|Primary IP of Network Interface|
|**sanityCheck**|Boolean|Source and target IP address verification, with value 0 or 1|
|**secondaryIps**|NetworkInterfacePrivateIp[]| |
|**securityGroups**|SecurityGroupSimple[]|Security Group List|
|**vpcId**|String|Virtual Network ID|
### NetworkInterfacePrivateIp
|Name|Type|Description|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP Instance Address|
|**elasticIpId**|String|IPV4 Address of Private IP|
|**privateIpAddress**|String|IPV4 Address of Private IP|
### SecurityGroupSimple
|Name|Type|Description|
|---|---|---|
|**groupId**|String|Security Group ID|
|**groupName**|String|Security Group Name|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
