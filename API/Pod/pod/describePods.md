# describePods


## Description
Search detailed information of pod in batches<br>
This interface supports query in pages, with 20 entries per page by default.


## Request Method
GET

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number; 1 by Default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|
|**filters**|Filter[]|False| |podId - pod ID, accuracy matching, supporting multiple <br>privateIpAddress -Primary network interface IP address, fuzzy matching, supporting a single <br>az - Availability zone, accuracy matching, supporting multiple <br>vpcId - VPC ID, accuracy matching, supporting multiple <br>phase - pod status, accuracy matching, supporting multiple <br>name - Instance name, fuzzy matching, supporting a single <br>subnetId - Image ID, fuzzy matching, supporting a single <br>|
|**tags**|TagFilter[]|False| |Tag Screen Requirements|

### TagFilter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|False| |Tag Key|
|**values**|String[]|False| |Tag Value|
### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**pods**|Pod[]| |
|**totalCount**|Number| |
### Pod
|Name|Type|Description|
|---|---|---|
|**podId**|String|pod ID|
|**name**|String|pod Name|
|**description**|String|Description information is blank by default.|
|**az**|String|Availability Zone|
|**hostname**|String|Machine Name|
|**instanceType**|String|Computing Resource Specification Required for pod|
|**restartPolicy**|String|Reboot Policy of pod|
|**terminationGracePeriodSeconds**|Integer|Time of Grace Shutdown|
|**vpcId**|String|vpcId of the Primary Network Interface|
|**subnetId**|String|ID of Primary Network Interface’s Subnet|
|**privateIpAddress**|String|Primary IP address of primary network interface|
|**dnsConfig**|DnsConfig|/etc/resolv.conf configuration [DnsConfig](DnsConfig.md) of a container in pod      /etc/resolv.conf configuration of a container in pod|
|**logConfig**|LogConfig|Container log configuration information; 10MB storage space will be assigned to the local by default|
|**hostAliases**|HostAlias[]|/etc/hosts configuration of container in pod|
|**volumes**|Volume[]|A list of volume belonging to pod, which provides attachment to containers.|
|**containers**|Container[]|Information of Container in pod|
|**podStatus**|PodStatus|Pod Status Information|
|**elasticIp**|ElasticIp|Elastic IP specification related to primary IP of primary network interface|
|**primaryNetworkInterface**|NetworkInterfaceAttachment|Primary Network Interface Configuration Information|
|**tags**|Tag[]| |
|**charge**|Charge|Billing configuration; if no specification is made, the billing type is Pay-As-You-Go - Pay as the service time by default|
|**createTime**|String|Pod Creation Time|
### Charge
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment model, the value shall be: prepaid_by_duration, postpaid_by_usage or postpaid_by_duration. prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and the default is taken as postpaid_by_duration|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time with the format of YYYY-MM-DDTHH:mm:ssZ adopted|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource shall be up to ISO8601, with the UTC time with the format of YYYY-MM-DDTHH:mm:ssZ adopted. Pay-As-You-Go resource field is blank|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, using the UTC time and following the format of YYYY-MM-DDTHH:mm:ssZ|
### Tag
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### NetworkInterfaceAttachment
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Indicate if the network interface is deleted when deleting the pod, it is True by default; only True is supported now|
|**deviceIndex**|Integer|Device Index, currently pod supports one network interface only, so it can be set as 1 only|
|**attachStatus**|String|Associating Status|
|**attachTime**|String|Associating Time|
|**networkInterface**|InstanceNetworkInterface|Network Interface Specification|
### InstanceNetworkInterface
|Name|Type|Description|
|---|---|---|
|**networkInterfaceId**|String|Elastic Network Interface ID|
|**macAddress**|String|Ethernet Address|
|**vpcId**|String|Virtual Network ID|
|**description**|String|Description|
|**securityGroups**|SecurityGroupSimple[]|Security Group List|
|**sanityCheck**|Boolean|Source and Target IP Address Verification, with Value of 0 or 1|
|**primaryIp**|NetworkInterfacePrivateIp|Primary IP of Network Interface|
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
### ElasticIp
|Name|Type|Description|
|---|---|---|
|**elasticIpId**|String|Elastic ip Id|
|**elasticIpAddress**|String|Elastic ip Address|
### PodStatus
|Name|Type|Description|
|---|---|---|
|**phase**|String|Current Status of pod|
|**reason**|String|(Brief) Reasons why pod is in the current status|
|**message**|String|Detailed information about reasons why pod is in the current status|
|**podIP**|String|IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.|
|**conditions**|PodCondition[]|Current service state of pod.|
|**startTime**|String|Start time of life cycle of Pod.|
### PodCondition
|Name|Type|Description|
|---|---|---|
|**lastProbeTime**|String|Last time we probed the condition.|
|**lastTransitionTime**|String|Last time the condition transitioned from one status to another.|
|**reason**|String|Unique, one-word, CamelCase reason for the condition's last transition.|
|**status**|String|Status is the status of the condition. Can be True, False, Unknown.|
|**message**|String|Human-readable message indicating details about last transition.|
|**conditionType**|String|Type is the type of the condition. Currently only Ready.|
### Container
|Name|Type|Description|
|---|---|---|
|**name**|String|Container Name|
|**command**|String[]|The container will carry out the command. It is ENTRYPOINT of docker image by default if none is specified. The total length is 256 characters.|
|**args**|String[]|The container will carry out the parameter of the command. It is CMD of docker image by default if none is specified. The total length is 2,048 characters.|
|**env**|EnvSpec[]|Environment variables executed by containers; if the environmental variable Key is the same in the image, values in the image will be replaced. Length range: [0-100]|
|**image**|String|Image name </br>Docker image name. nginx:latest. Length range: [1-500] 1. Docker Hub public image is specified via names as nginx, mysql/mysql-server </br> 2. repository contains at most 256 characters, tag contains at most 128 characters, and registry contains as most 255 characters </br>|
|**secret**|String|Registry secret name. If not uploaded currently, dockerHub image is selected by default|
|**tty**|Boolean|Whether a container is assigned with tty. It is not assigned by default|
|**workingDir**|String|Container’s Working Catalog. If not specified, it is root directory (/) by default; and the working catalog must be the absolute path; length range: [0-1024]|
|**livenessProbe**|ProbeSpec|Container Liveness Probe Configuration|
|**readinessProbe**|ProbeSpec|Container Service Readiness Probe Configuration|
|**resources**|ResourceRequestsSpec|Container Computing Resource Configuration|
|**systemDisk**|CloudDiskSpec|Container Computing Resource Configuration|
|**volumeMounts**|VolumeMount[]|Container Computing Resource Configuration|
|**containerStatus**|ContainerStatus|Container Status Information|
### ContainerStatus
|Name|Type|Description|
|---|---|---|
|**name**|String|Container Name|
|**restartCount**|Integer|Number of Reboot Times of Container|
|**ready**|Boolean|Whether the container has passed readiness probe detection|
|**state**|ContainerState|Detailed Information About Current Status of Container|
|**lastState**|ContainerState|Detailed Information About Last Termination of Container|
### ContainerState
|Name|Type|Description|
|---|---|---|
|**running**|ContainerStateRunning|Detailed Information of Container Running|
|**terminated**|ContainerStateTerminated|Detailed Information of Container Terminated|
|**waiting**|ContainerStateWaiting|Detailed Information of Container Waiting|
### ContainerStateWaiting
|Name|Type|Description|
|---|---|---|
|**reason**|String|(Brief) Reason for Non-running of Container. <br><br>eg ContainerCreating     <br>|
|**message**|String|Detailed Information of Non-running of Container|
### ContainerStateTerminated
|Name|Type|Description|
|---|---|---|
|**signal**|Integer|Signal for Container Being Subject to Termination|
|**exitCode**|Integer|Exit Code for Container Being Subject to Ttermination|
|**reason**|String|(Brief) Causes for Container Being Subject to Ttermination|
|**message**|String|Detailed information of Container Being Subject to Ttermination|
|**finishedAt**|String|Time for Container Being Subject to Ttermination|
|**startedAt**|String|Execution Start Time of Container|
### ContainerStateRunning
|Name|Type|Description|
|---|---|---|
|**startedAt**|String|Last Reboot or Start Time of Container|
### VolumeMount
|Name|Type|Description|
|---|---|---|
|**name**|String|pod volume name must be used|
|**mountPath**|String|Attach point in the container, with absolute path; repeated attaching and nesting attaching are not allowed; it is not allowed to be attached to the root directory ("/"). Length range: [1-1024]|
|**readOnly**|Boolean|Whether to attach with the method of read-only. Default Read and Write mode|
### CloudDiskSpec
|Name|Type|Description|
|---|---|---|
|**volumeId**|String|Cloud Disk id, use existed Cloud Disk|
|**name**|String|Cloud Disk Name|
|**snapshot**|String|Cloud Disk snapshot id, creating Cloud Disk according to Cloud Disk snapshot.|
|**diskType**|String|Cloud Disk type: ssd,premium-hdd,hdd.std1,ssd.gp1,ssd.io1|
|**sizeGB**|Integer|Cloud Disk size, unit GB, requirement|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now; if the file system type is not specified for the newly-created disk, such disk will be formatted to xfs by default.|
|**iops**|Integer|Only the ssd.io1 type iops value of cloud disk is valid now|
|**autoDelete**|Boolean|Whether to delete with pod. Default: true|
### ResourceRequestsSpec
|Name|Type|Description|
|---|---|---|
|**requests**|RequestSpec|Computing Resource Necessary for Container|
|**limits**|RequestSpec|Cap of Computing Resource Used by Container|
### RequestSpec
|Name|Type|Description|
|---|---|---|
|**cpu**|String|Computing Resource Necessary for Container|
|**memoryMB**|String|Cap of Computing Resource Used by Container|
### ProbeSpec
|Name|Type|Description|
|---|---|---|
|**initialDelaySeconds**|Integer|How long after the container starts can trigger the probe. Default value: 10 seconds; range: [0-300]|
|**periodSeconds**|Integer|Time interval for detection. Default value is 10 seconds; range: [1-300]|
|**timeoutSeconds**|Integer|Time-out period of detection. Default value is 1 second; range: [1-300]|
|**failureThreshold**|Integer|The number of consecutive alive detection failure after a successful status, to which extent the alive detection is considered as failed. Default value is 3 times; range 1-10|
|**successThreshold**|Integer|The number of consecutive alive detection success after a successful status, to which extent the alive detection is considered as successful. Default value is 1 time; range 1-10|
|**exec**|Exec|Execute specified command within the container; if the return code is 0 when the command exits, the diagnostic is considered as successful.|
|**httpGet**|Hg|Execute HTTP Get request to the IP address of the container on the specified port and path. <br><br>If the response status code is greater than or equal to 200 and less than 400, the diagnosis is considered as successful. <br>|
|**tcpSocket**|TcpSocketSpec|Conduct TCP inspection to the IP address of the container on the specified port. If the port opens, the diagnosis is considered as successful.|
### TcpSocketSpec
|Name|Type|Description|
|---|---|---|
|**port**|Integer|Range: [1-65535]|
### Hg
|Name|Type|Description|
|---|---|---|
|**scheme**|String|Default value: http; optional value http, https|
|**host**|String|pod_ip is used by default as hose information connected to pod, to satisfy hostname or ipv4 format|
|**port**|Integer|Range: [1-65535]|
|**path**|String|Path of HTTP Range: [1-256]|
|**httpHeader**|Hh[]|Execute HTTP Get request to the IP address of the container on the specified port and path. <br><br>If the response status code is greater than or equal to 200 and less than 400, the diagnosis is considered as successful. |
### Hh
|Name|Type|Description|
|---|---|---|
|**name**|String|http header key, http rules shall be followed|
|**value**|String|Container Alive Detection Method|
### Exec
|Name|Type|Description|
|---|---|---|
|**command**|String[]|The total length of the command executed is 256 characters. s|
### EnvSpec
|Name|Type|Description|
|---|---|---|
|**name**|String|Environment Variable Name (ASCII). Range: [1-64]. Must be letters, figures and underline (). The regular is `[a-zA-Z0-9]*$`.|
|**value**|String|Environment Variable Value. Range: [0-1024]|
### Volume
|Name|Type|Description|
|---|---|---|
|**name**|String|Name of volume must be DNS_LABEL, which is unique in one Pod.|
|**jdcloudDisk**|JDCloudVolumeSource|cloud disk provided to Pod.|
### JDCloudVolumeSource
|Name|Type|Description|
|---|---|---|
|**volumeId**|String|Cloud Disk id, use existed Cloud Disk|
|**name**|String|Cloud Disk Name|
|**snapshot**|String|Cloud Disk snapshot id, creating Cloud Disk according to Cloud Disk snapshot.|
|**diskType**|String|Cloud Disk type: ssd,premium-hdd,hdd.std1,ssd.gp1,ssd.io1|
|**sizeGB**|Integer|Cloud Disk size, unit GB, requirement|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now; if the file system type is not specified for the newly-created disk, such disk will be formatted to xfs by default.|
|**formatVolume**|Boolean|A new disk automatically created with the container will be automatically formatted to the specified file system type; the existing disk mounted will not be formatted by default and only will be mounted as per specified fsType; and if you intend to format the mounted disk, be sure to set the field as true.|
|**iops**|Integer|Only the ssd.io1 type iops value of cloud disk is valid now|
|**autoDelete**|Boolean|Whether to delete with pod. Default: true|
### HostAlias
|Name|Type|Description|
|---|---|---|
|**hostnames**|String[]|Domain List. <br><br>eg  ["foo.local", "bar.local"]. Length range is 1-10; elements conform to hostname naming convention. <br>|
|**ip**|String|ipv4 information; eg "127.0.0.1"|
### LogConfig
|Name|Type|Description|
|---|---|---|
|**logDriver**|String|Name log configuration information; currently it only supports that a 10MB bucket is assigned to each container to the local by default and is automatically rotated. Default value: default.|
### DnsConfig
|Name|Type|Description|
|---|---|---|
|**nameservers**|String[]|IP address list of DNS server; the repeated ones will be removed. <br><br>eg ["8.8.8.8", "4.2.2.2"]. List length: [0-20]; elements conform to IPv4 format. <br>|
|**searches**|String[]|DNS search domain list, used for search of host name. <br><br>eg ["ns1.svc.cluster.local", "my.dns.search.suffix"]. List length: [0-6]; the total length of all characters in the list cannot exceed 256. <br>|
|**options**|PodDnsConfigOption[]|DNS parser options list. <br><br>eg  ["ndots":"2", "edns0":""]. List length: [0-10]|
### PodDnsConfigOption
|Name|Type|Description|
|---|---|---|
|**name**|String|Length range: [1-63]; linux resolver restriction shall be followed|
|**value**|String|Length range: [0-100]; limited to timeout, attempts, ndots only|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
