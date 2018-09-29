# describeContainers


## 描述
Search Native Container details in batches <br>
This interface supports query in pages, with 20 entries per page by default.


## 请求方式
GET

## 请求地址
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|Filter[]|False| |containerId - Instance ID, exact match, support many IDs<br>privateIpAddress - Primary network interface IP address, fuzzy matching and supporting many IP addresses<br>az - Availability zone, exact matching, supporting many availability zones<br>vpcId - Virtual Private Cloud ID, exact match, support many IDs<br>status - Container status, exact match, support many statuses<br>name - Instance name, fuzzy matching and supporting many names<br>subnetId - Instance ID, fuzzy matching and supporting many IDs<br>|
|**pageNumber**|Integer|False| |Page number; 1 by default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|

### Filter
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**containers**|Container[]| |
|**totalCount**|Number| |
### Container
|名称|类型|描述|
|---|---|---|
|**args**|String[]|Parameters for Command Execution by Container |
|**az**|String|Availability Zone |
|**charge**|Charge|Billing Configuration Information |
|**command**|String[]|Container Execution Command |
|**containerId**|String|Container ID |
|**dataVolumes**|VolumeMount[]|Mounted Data Volume Information |
|**description**|String|Container Description |
|**elasticIpAddress**|String|Elastic IP Associated to Primary IP of Primary Network Interface |
|**elasticIpId**|String|Elastic IP ID Associated to Primary IP of Primary Network Interface |
|**envs**|EnvVar[]|Environment Variable for Execution by Dynamically-assigned Container |
|**hostAliases**|HostAlias[]|Domain and IP Mapping Information|
|**hostname**|String|Machine Name |
|**image**|String|Image Name |
|**instanceType**|String|Instance Type Family |
|**launchTime**|String|Creation Time|
|**logConfiguration**|LogConfiguration|Container Log Configuration Information|
|**name**|String|Container Name|
|**primaryNetworkInterface**|InstanceNetworkInterfaceAttachment|Primary Network Interface Information |
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
|名称|类型|描述|
|---|---|---|
|**chargeExpiredTime**|String|Expiration Time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment Model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The Expected Release Time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost Payment Status, the value is respectively normal, overdue and arrear.|
### VolumeMount
|名称|类型|描述|
|---|---|---|
|**autoDelete**|Boolean|Automatic deletion, the volume is automatically deleted at the time the container is deleted.|
|**category**|String|Environment Variable Name|
|**cloudDisk**|InstanceCloudDisk|Cloud Disk Service Specification|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now.|
|**mountPath**|String|Catalog Mounted into the Container|
|**readOnly**|Boolean|Read-only, false by default; only valid to data volume; when root volume is false.|
### InstanceCloudDisk
|名称|类型|描述|
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
|名称|类型|描述|
|---|---|---|
|**name**|String|Environment Variable Name|
|**value**|String|Value of Environment Variable|
### HostAlias
|名称|类型|描述|
|---|---|---|
|**hostnames**|String[]|Domain List|
|**ip**|String|IP Address|
### LogConfiguration
|名称|类型|描述|
|---|---|---|
|**logDriver**|String|Name log configuration information; a 10MB storage space will be assigned to the local by default and is automatically rotated.|
|**options**|LogOption|Configuration Options of Log Driver|
### LogOption
|名称|类型|描述|
|---|---|---|
|**key**|String| |
|**value**|String| |
### InstanceNetworkInterfaceAttachment
|名称|类型|描述|
|---|---|---|
|**attachStatus**|String|Associating Status|
|**attachTime**|String|Associating Time|
|**autoDelete**|Boolean|Indicate that if the network interface is deleted when deleting an instance|
|**deviceIndex**|Integer|Device Index|
|**networkInterface**|InstanceNetworkInterface|Elastic Network Interface Information|
### InstanceNetworkInterface
|名称|类型|描述|
|---|---|---|
|**description**|String|Description |
|**macAddress**|String|Ethernet Address|
|**networkInterfaceId**|String|Elastic Network Interface ID|
|**primaryIp**|NetworkInterfacePrivateIp|Primary IP of Network Interface|
|**sanityCheck**|Boolean|Source and Target IP Address Verification, with value 0 or 1|
|**secondaryIps**|NetworkInterfacePrivateIp[]| |
|**securityGroups**|SecurityGroupSimple[]|Security Group List|
|**vpcId**|String|Virtual Network ID|
### NetworkInterfacePrivateIp
|名称|类型|描述|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP Instance Address|
|**elasticIpId**|String|IPV4 Address of Private IP|
|**privateIpAddress**|String|IPV4 Address of Private IP|
### SecurityGroupSimple
|名称|类型|描述|
|---|---|---|
|**groupId**|String|Security Group ID|
|**groupName**|String|Security Group Name|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
