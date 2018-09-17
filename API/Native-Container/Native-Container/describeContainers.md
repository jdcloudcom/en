# describeContainers


## 描述
Search native container details in batches <br>
This interface supports query in pages, with 20 entries per page by default.


## 请求方式
GET

## 请求地址
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||containerId - Instance ID, exact match, support many IDs<br>privateIpAddress - Primary network interface IP address, fuzzy matching and supporting many IP addresses<br>az - Availability zone, exact matching, supporting many availability zones<br>vpcId - Virtual private cloud ID, exact match, support many IDs<br>status - Container status, exact match, support many statuses<br>name - Instance name, fuzzy matching and supporting many names<br>subnetId - Instance ID, fuzzy matching and supporting many IDs<br>|
|**pageNumber**|Integer|False||Page number; 1 by default|
|**pageSize**|Integer|False||Page size; it is 20 by default; value range[10, 100]|

### <a name="Filter">Filter</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**containers**|[Container[]](##Container)||
|**totalCount**|Number||
### <a name="Container">Container</a>
|名称|类型|描述|
|---|---|---|
|**args**|String[]|Parameters for command execution by container|
|**az**|String|Availability zone|
|**charge**|[Charge](##Charge)|Billing configuration information|
|**command**|String[]|Container execution command|
|**containerId**|String|Container ID|
|**dataVolumes**|[VolumeMount[]](##VolumeMount)|Mounted data Volume information|
|**description**|String|Container description|
|**elasticIpAddress**|String|Elastic IP address associated to primary IP of primary network interface|
|**elasticIpId**|String|Elastic IP ID associated to primary IP of primary network interface|
|**envs**|[EnvVar[]](##EnvVar)|Environment variable for execution by dynamically-assigned container|
|**hostAliases**|[HostAlias[]](##HostAlias)|Domain and IP mapping information|
|**hostname**|String|Machine name|
|**image**|String|Image name|
|**instanceType**|String|Instance type family|
|**launchTime**|String|Creation time|
|**logConfiguration**|[LogConfiguration](##LogConfiguration)|Container log configuration information|
|**name**|String|Container name|
|**primaryNetworkInterface**|[InstanceNetworkInterfaceAttachment](##InstanceNetworkInterfaceAttachment)|Primary network interface information|
|**privateIpAddress**|String|Primary IP address of primary network interface|
|**reason**|String|Container termination reason|
|**rootVolume**|[VolumeMount](##VolumeMount)|Root Volume information|
|**secondaryNetworkInterfaces**|[InstanceNetworkInterfaceAttachment[]](##InstanceNetworkInterfaceAttachment)|Elastic network interface information|
|**secret**|String|Name cited by secret|
|**status**|String|Container status|
|**subnetId**|String|ID of primary network interface’s subnet|
|**tty**|Boolean|If a container is assigned with tty|
|**vpcId**|String|ID of primary network interface’s VPC|
|**workingDir**|String|Container’s working catalog|
### <a name="Charge">Charge</a>
|名称|类型|描述|
|---|---|---|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|
### <a name="VolumeMount">VolumeMount</a>
|名称|类型|描述|
|---|---|---|
|**autoDelete**|Boolean|Automatic deletion, the volume is automatically deleted at the time the container is deleted.|
|**category**|String|Environment variable name|
|**cloudDisk**|[InstanceCloudDisk](##InstanceCloudDisk)|Cloud disk service specification|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now.|
|**mountPath**|String|Catalog mounted into the container|
|**readOnly**|Boolean|Read-only, false by default; only valid to data volume; when root volume is false.|
### <a name="InstanceCloudDisk">InstanceCloudDisk</a>
|名称|类型|描述|
|---|---|---|
|**az**|String|Corresponding AZ|
|**createTime**|String|Creation time|
|**description**|String|Disk description|
|**diskId**|String|Cloud disk service ID|
|**diskSize**|Integer|Disk size (GiB)|
|**diskType**|String|Disk type, value ssd or premium-hdd|
|**name**|String|Disk name|
|**status**|String|Cloud disk service type, value: creating, available, in-use, extending, restoring, deleting, deleted, error_creating, error_deleting, error_restoring or error_extending|
### <a name="EnvVar">EnvVar</a>
|名称|类型|描述|
|---|---|---|
|**name**|String|Environment variable name|
|**value**|String|Value of environment variable|
### <a name="HostAlias">HostAlias</a>
|名称|类型|描述|
|---|---|---|
|**hostnames**|String[]|Domain list|
|**ip**|String|IP address|
### <a name="LogConfiguration">LogConfiguration</a>
|名称|类型|描述|
|---|---|---|
|**logDriver**|String|Name log configuration information; a 10MB storage space will be assigned to the local by default and is automatically rotated.|
|**options**|[LogOption](##LogOption)|Configuration options of log Driver|
### <a name="LogOption">LogOption</a>
|名称|类型|描述|
|---|---|---|
|**key**|String||
|**value**|String||
### <a name="InstanceNetworkInterfaceAttachment">InstanceNetworkInterfaceAttachment</a>
|名称|类型|描述|
|---|---|---|
|**attachStatus**|String|Associating status|
|**attachTime**|String|Associating time|
|**autoDelete**|Boolean|Indicate that if the network interface is deleted when deleting an instance|
|**deviceIndex**|Integer|Device Index|
|**networkInterface**|[InstanceNetworkInterface](##InstanceNetworkInterface)|Elastic network interface information|
### <a name="InstanceNetworkInterface">InstanceNetworkInterface</a>
|名称|类型|描述|
|---|---|---|
|**description**|String|Description|
|**macAddress**|String|Ethernet address|
|**networkInterfaceId**|String|Elastic network interface ID|
|**primaryIp**|[NetworkInterfacePrivateIp](##NetworkInterfacePrivateIp)|Primary IP of network interface|
|**sanityCheck**|Boolean|Source and target IP address verification, with value 0 or 1|
|**secondaryIps**|[NetworkInterfacePrivateIp[]](##NetworkInterfacePrivateIp)||
|**securityGroups**|[SecurityGroupSimple[]](##SecurityGroupSimple)|Security group list|
|**vpcId**|String|Virtual network ID|
### <a name="NetworkInterfacePrivateIp">NetworkInterfacePrivateIp</a>
|名称|类型|描述|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP instance address|
|**elasticIpId**|String|IPV4 address of private IP|
|**privateIpAddress**|String|IPV4 address of private IP|
### <a name="SecurityGroupSimple">SecurityGroupSimple</a>
|名称|类型|描述|
|---|---|---|
|**groupId**|String|Security group ID|
|**groupName**|String|Security group name|

## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
