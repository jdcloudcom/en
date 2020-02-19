# describePod


## Description
Search detailed information of one pod


## Request Method
GET

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**podId**|String|True| |Pod ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describepod#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**pod**|[Pod](describepod#pod)| |
### <div id="pod">Pod</div>
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
|**dnsConfig**|[DnsConfig](describepod#dnsconfig)|/etc/resolv.conf configuration of container in pod|
|**logConfig**|[LogConfig](describepod#logconfig)|Container log configuration information; 10MB storage space will be assigned to the local by default|
|**hostAliases**|[HostAlias[]](describepod#hostalias)|/etc/hosts configuration of container in pod|
|**volumes**|[Volume[]](describepod#volume)|A list of volume belonging to pod, which provides attachment to containers.|
|**containers**|[Container[]](describepod#container)|Information of Container in pod|
|**podStatus**|[PodStatus](describepod#podstatus)|Pod Status Information|
|**elasticIp**|[ElasticIp](describepod#elasticip)|Elastic IP specification related to primary IP of primary network interface|
|**primaryNetworkInterface**|[NetworkInterfaceAttachment](describepod#networkinterfaceattachment)|Primary Network Interface Configuration Information|
|**tags**|[Tag[]](describepod#tag)| |
|**charge**|[Charge](describepod#charge)|Billing configuration; if no specification is made, the billing type is Pay-As-You-Go - Pay as the service time by default|
|**createTime**|String|Pod Creation Time|
### <div id="charge">Charge</div>
|Name|Type|Description|
|---|---|---|
|**chargeMode**|String|Payment model, the value shall be: prepaid_by_duration, postpaid_by_usage or postpaid_by_duration. prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and the default is taken as postpaid_by_duration|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time with the format of YYYY-MM-DDTHH:mm:ssZ adopted|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource shall be up to ISO8601, with the UTC time with the format of YYYY-MM-DDTHH:mm:ssZ adopted. Pay-As-You-Go resource field is blank|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, using the UTC time and following the format of YYYY-MM-DDTHH:mm:ssZ|
### <div id="tag">Tag</div>
|Name|Type|Description|
|---|---|---|
|**key**|String|Tag Key|
|**value**|String|Tag Value|
### <div id="networkinterfaceattachment">NetworkInterfaceAttachment</div>
|Name|Type|Description|
|---|---|---|
|**autoDelete**|Boolean|Indicate that if the network interface is deleted when the pod is deleted.|
|**deviceIndex**|Integer|Device Index, currently pod supports one network interface only, so it can be set as 1 only|
|**attachStatus**|String|Associating Status|
|**attachTime**|String|Associating Time|
|**networkInterface**|[InstanceNetworkInterface](describepod#instancenetworkinterface)|Network Interface Specification|
### <div id="instancenetworkinterface">InstanceNetworkInterface</div>
|Name|Type|Description|
|---|---|---|
|**networkInterfaceId**|String|Elastic Network Interface ID|
|**macAddress**|String|Ethernet Address|
|**vpcId**|String|Virtual Network ID|
|**subnetId**|String|Subnet ID|
|**description**|String|Description|
|**securityGroups**|[SecurityGroupSimple[]](describepod#securitygroupsimple)|Security Group List|
|**sanityCheck**|Boolean|Source and Target IP Address Verification, with Value of 0 or 1|
|**primaryIp**|[NetworkInterfacePrivateIp](describepod#networkinterfaceprivateip)|Primary IP of Network Interface|
|**secondaryIps**|[NetworkInterfacePrivateIp[]](describepod#networkinterfaceprivateip)| |
### <div id="networkinterfaceprivateip">NetworkInterfacePrivateIp</div>
|Name|Type|Description|
|---|---|---|
|**privateIpAddress**|String|IPV4 Address of Private IP|
|**elasticIpId**|String|Elastic IP ID|
|**elasticIpAddress**|String|Elastic IP Instance Address|
### <div id="securitygroupsimple">SecurityGroupSimple</div>
|Name|Type|Description|
|---|---|---|
|**groupId**|String|Security Group ID|
|**groupName**|String|Security Group Name|
### <div id="elasticip">ElasticIp</div>
|Name|Type|Description|
|---|---|---|
|**elasticIpId**|String|Elastic ip Id|
|**elasticIpAddress**|String|Elastic ip Address|
### <div id="podstatus">PodStatus</div>
|Name|Type|Description|
|---|---|---|
|**phase**|String|Current Status of pod|
|**reason**|String|(Brief) Reasons why pod is in the current status|
|**message**|String|Detailed information about reasons why pod is in the current status|
|**podIP**|String|IP address assigned to pod. It shall be routable at least in the cluster. It is null if not assigned.|
|**conditions**|[PodCondition[]](describepod#podcondition)|Current pod status.|
|**startTime**|String|Start time of life cycle of Pod.|
### <div id="podcondition">PodCondition</div>
|Name|Type|Description|
|---|---|---|
|**lastProbeTime**|String|Time of Last Detection Status|
|**lastTransitionTime**|String|Time of Last Change Status|
|**reason**|String|Brief Cause of Last Status Change|
|**status**|String|Status is the status of the condition. Can be True, False, Unknown.|
|**message**|String|Information of Last Status Change|
|**conditionType**|String|Conditions for Status. Only limited to Ready currently.|
### <div id="container">Container</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Container Name|
|**command**|String[]|Command Executed by Container.|
|**args**|String[]|Parameters for command execution by container.|
|**env**|[Env[]](describepod#env)|Environment Variable Executed by Container.|
|**image**|String|Docker Image Name.|
|**secret**|String|Container Registry Secrets.|
|**tty**|Boolean|Whether a container is assigned with tty.|
|**workingDir**|String|Container’s Working Catalog.|
|**livenessProbe**|[Probe](describepod#probe)|Container Liveness Probe Configuration|
|**readinessProbe**|[Probe](describepod#probe)|Container Service Readiness Probe Configuration|
|**resources**|[ResourceRequests](describepod#resourcerequests)|Container Computing Resource Configuration|
|**systemDisk**|[CloudDisk](describepod#clouddisk)|Container Computing Resource Configuration|
|**volumeMounts**|[VolumeMount[]](describepod#volumemount)|Container Computing Resource Configuration|
|**containerStatus**|[ContainerStatus](describepod#containerstatus)|Container Status Information|
### <div id="containerstatus">ContainerStatus</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Container Name|
|**restartCount**|Integer|Number of Reboot Times of Container|
|**ready**|Boolean|Whether the container has passed readiness probe detection|
|**state**|[ContainerState](describepod#containerstate)|Detailed Information About Current Status of Container|
|**lastState**|[ContainerState](describepod#containerstate)|Detailed information about last termination of container|
### <div id="containerstate">ContainerState</div>
|Name|Type|Description|
|---|---|---|
|**running**|[ContainerStateRunning](describepod#containerstaterunning)|Detailed Information of Container Running|
|**terminated**|[ContainerStateTerminated](describepod#containerstateterminated)|Detailed Information of Container Termination|
|**waiting**|[ContainerStateWaiting](describepod#containerstatewaiting)|Detailed Information of Container Waiting|
### <div id="containerstatewaiting">ContainerStateWaiting</div>
|Name|Type|Description|
|---|---|---|
|**reason**|String|(Brief) Reason for Non-running of Container. <br><br>eg ContainerCreating     <br>|
|**message**|String|Detailed Information of Non-running of Container|
### <div id="containerstateterminated">ContainerStateTerminated</div>
|Name|Type|Description|
|---|---|---|
|**signal**|Integer|Signal for Container Being Terminated.|
|**exitCode**|Integer|Exit Code for Container Being Terminated.|
|**reason**|String|(Brief) Causes for Container Being Terminated.|
|**message**|String|Detailed Information of Container Being Terminated.|
|**finishedAt**|String|Time of Container Being Terminated.|
|**startedAt**|String|Execution Start Time of Container|
### <div id="containerstaterunning">ContainerStateRunning</div>
|Name|Type|Description|
|---|---|---|
|**startedAt**|String|Last Reboot or Start Time of Container|
### <div id="volumemount">VolumeMount</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Name of Cloud Disk Attached in pod.|
|**mountPath**|String|Attach Point in Container|
|**readOnly**|Boolean|Whether to attach with the method of read-only.|
### <div id="clouddisk">CloudDisk</div>
|Name|Type|Description|
|---|---|---|
|**volumeId**|String|Cloud Disk ID.|
|**snapshotId**|String|Cloud Disk Snapshot ID.|
|**diskType**|String|Cloud Disk Types: hdd.std1,ssd.gp1,ssd.io1.|
|**sizeGB**|Integer|Cloud disk size, unit GB.|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now.|
|**iops**|Integer|Only the ssd.io1 type iops value of cloud disk is valid now.|
|**autoDelete**|Boolean|Whether to delete with pod.|
### <div id="resourcerequests">ResourceRequests</div>
|Name|Type|Description|
|---|---|---|
|**requests**|[Request](describepod#request)|Computing Resource Necessary for Container|
|**limits**|[Request](describepod#request)|Cap of Computing Resource Used by Container|
### <div id="request">Request</div>
|Name|Type|Description|
|---|---|---|
|**cpu**|String|Computing Resource Necessary for Container|
|**memoryMB**|String|Cap of Computing Resource Used by Container|
### <div id="probe">Probe</div>
|Name|Type|Description|
|---|---|---|
|**initialDelaySeconds**|Integer|How long the container does trigger the probe after start.|
|**periodSeconds**|Integer|Time interval for detection.|
|**timeoutSeconds**|Integer|Time-out period of detection.|
|**failureThreshold**|Integer|The number of consecutive alive detection failure after a successful status, to which extent the alive detection is considered as failed.|
|**successThreshold**|Integer|The number of consecutive alive detection success after a successful status, to which extent the alive detection is considered as successful.|
|**exec**|[Exec](describepod#exec)|Execute specified command within the container; if the return code is 0 when the command exits, the diagnostic is considered as successful.|
|**httpGet**|[Hg](describepod#hg)|Execute HTTP Get request to the IP address of the container on the specified port and path. If the response status code is greater than or equal to 200 and less than 400, it shall be considered to be successful diagnostics.|
|**tcpSocket**|[TcpSocket](describepod#tcpsocket)|Conduct TCP inspection to the IP address of the container on the specified port; if the port opens, it shall be considered to be successful diagnostics.|
### <div id="tcpsocket">TcpSocket</div>
|Name|Type|Description|
|---|---|---|
|**port**|Integer|Port number, range: [1-65535]|
### <div id="hg">Hg</div>
|Name|Type|Description|
|---|---|---|
|**scheme**|String|Default value: http.|
|**host**|String|host information connected to pod.|
|**port**|Integer|Port Number.|
|**path**|String|Path of HTTP.|
|**httpHeader**|[Hh[]](describepod#hh)|Customized Http headers|
### <div id="hh">Hh</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|http header Key|
|**value**|String|http header Value|
### <div id="exec">Exec</div>
|Name|Type|Description|
|---|---|---|
|**command**|String[]|Command Executed.|
### <div id="env">Env</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Environment Variable Name (ASCII).|
|**value**|String|Environment Variable Value.|
### <div id="volume">Volume</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|volume name, which is unique in one Pod.|
|**jdcloudDisk**|[JDCloudVolumeSource](describepod#jdcloudvolumesource)|cloud disk provided to Pod.|
### <div id="jdcloudvolumesource">JDCloudVolumeSource</div>
|Name|Type|Description|
|---|---|---|
|**volumeId**|String|Cloud Disk id, use existed Cloud Disk|
|**snapshotId**|String|Cloud Disk snapshot id, creating Cloud Disk according to Cloud Disk snapshot.|
|**diskType**|String|Cloud Disk Types: hdd.std1,ssd.gp1,ssd.io1|
|**sizeGB**|Integer|Cloud Disk size, unit GB, requirement|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now; if the file system type is not specified for the newly-created disk, such disk will be formatted to xfs by default.|
|**formatVolume**|Boolean|A new disk automatically created with the container will be automatically formatted to the specified file system type; the existing disk mounted will not be formatted by default and only will be mounted as per specified fsType; and if you intend to format the mounted disk, be sure to set the field as true.|
|**iops**|Integer|Only the ssd.io1 type iops value of cloud disk is valid now|
|**autoDelete**|Boolean|Whether to delete with pod. Default: true|
### <div id="hostalias">HostAlias</div>
|Name|Type|Description|
|---|---|---|
|**hostnames**|String[]|Domain List. <br>|
|**ip**|String|ipv4 Address.|
### <div id="logconfig">LogConfig</div>
|Name|Type|Description|
|---|---|---|
|**logDriver**|String|Log Driver Name.|
### <div id="dnsconfig">DnsConfig</div>
|Name|Type|Description|
|---|---|---|
|**nameservers**|String[]|IP address list of DNS server. <br>|
|**searches**|String[]|DNS search domain list, used for search of host name. <br>|
|**options**|[PodDnsConfigOption[]](describepod#poddnsconfigoption)|DNS Resolver Option List.|
### <div id="poddnsconfigoption">PodDnsConfigOption</div>
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
