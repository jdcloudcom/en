# describeContainer


## Description
Search details of one native container


## Request method
GET

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**containerId**|String|True||Container ID|
|**regionId**|String|True||Region ID|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**container**|Container||
### <a name="Container">Container</a>
|Name|Type|Description|
|---|---|---|
|**args**|String[]|Parameters for command execution by container|
|**az**|String|Availability zone|
|**charge**|Charge|Billing configuration information|
|**command**|String[]|Container execution command|
|**containerId**|String|Container ID|
|**dataVolumes**|VolumeMount[]|Mounted data Volume information|
|**description**|String|Container description|
|**elasticIpAddress**|String|Elastic IP address associated to primary IP of primary network interface|
|**elasticIpId**|String|Elastic IP ID associated to primary IP of primary network interface|
|**envs**|EnvVar[]|Environment variable for execution by dynamically-assigned container|
|**hostAliases**|HostAlias[]|Domain and IP mapping information|
|**hostname**|String|Machine name|
|**image**|String|Image name|
|**instanceType**|String|Instance type family|
|**launchTime**|String|Creation time|
|**logConfiguration**|LogConfiguration|Container log configuration information|
|**name**|String|Container name|
|**primaryNetworkInterface**|InstanceNetworkInterfaceAttachment|Primary network interface information|
|**privateIpAddress**|String|Primary IP address of primary network interface|
|**reason**|String|Container termination reason|
|**rootVolume**|VolumeMount|Root Volume information|
|**secondaryNetworkInterfaces**|InstanceNetworkInterfaceAttachment[]|Elastic network interface information|
|**secret**|String|Name cited by secret|
|**status**|String|Container status|
|**subnetId**|String|ID of primary network interface’s subnet|
|**tty**|Boolean|If a container is assigned with tty|
|**vpcId**|String|ID of primary network interface’s VPC|
|**workingDir**|String|Container’s working catalog|
### <a name="Charge">Charge</a>
|Name|Type|Description|
|---|---|---|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|
### <a name="VolumeMount">VolumeMount</a>
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Automatic deletion, the volume is automatically deleted at the time the container is deleted.|
|**category**|String|Environment variable name|
|**cloudDisk**|InstanceCloudDisk|Cloud disk service specification|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now.|
|**mountPath**|String|Catalog mounted into the container|
|**readOnly**|Boolean|Read-only, false by default; only valid to data volume; when root volume is false.|
### <a name="InstanceCloudDisk">InstanceCloudDisk</a>
|Name|Type|Description|
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
|Name|Type|Description|
|---|---|---|
|**name**|String|Environment variable name|
|**value**|String|Value of environment variable|
### <a name="HostAlias">HostAlias</a>
|Name|Type|Description|
|---|---|---|
|**hostnames**|String[]|Domain list|
|**ip**|String|IP address|
### <a name="LogConfiguration">LogConfiguration</a>
|Name|Type|Description|
|---|---|---|
|**logDriver**|String|Name log configuration information; a 10MB storage space will be assigned to the local by default and is automatically rotated.|
|**options**|LogOption|Configuration options of log Driver|
### <a name="LogOption">LogOption</a>
|Name|Type|Description|
|---|---|---|
|**key**|String||
|**value**|String||
### <a name="InstanceNetworkInterfaceAttachment">InstanceNetworkInterfaceAttachment</a>
|Name|Type|Description|
|---|---|---|
|**attachStatus**|String|Associating status|
|**attachTime**|String|Associating time|
|**autoDelete**|Boolean|Indicate that if the network interface is deleted when deleting an instance|
|**deviceIndex**|Integer|Device Index|
|**networkInterface**|InstanceNetworkInterface|Elastic network interface information|
### <a name="InstanceNetworkInterface">InstanceNetworkInterface</a>
|Name|Type|Description|
|---|---|---|
|**description**|String|Description|
|**macAddress**|String|Ethernet address|
|**networkInterfaceId**|String|Elastic network interface ID|
|**primaryIp**|NetworkInterfacePrivateIp|Primary IP of network interface|
|**sanityCheck**|Boolean|Source and target IP address verification, with value 0 or 1|
|**secondaryIps**|NetworkInterfacePrivateIp[]||
|**securityGroups**|SecurityGroupSimple[]|Security group list|
|**vpcId**|String|Virtual network ID|
### <a name="NetworkInterfacePrivateIp">NetworkInterfacePrivateIp</a>
|Name|Type|Description|
|---|---|---|
|**elasticIpAddress**|String|Elastic IP instance address|
|**elasticIpId**|String|IPV4 address of private IP|
|**privateIpAddress**|String|IPV4 address of private IP|
### <a name="SecurityGroupSimple">SecurityGroupSimple</a>
|Name|Type|Description|
|---|---|---|
|**groupId**|String|Security group ID|
|**groupName**|String|Security group name|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
