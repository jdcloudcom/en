# describeContainer


## Description
Obtain details of a container in pod

## Request Method
GET

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}/containers/{containerName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**podId**|String|True| |Pod ID|
|**containerName**|String|True| |container name|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describecontainer#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**container**|[Container](describecontainer#container)| |
### <div id="container">Container</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Container Name|
|**command**|String[]|Command Executed by Container.|
|**args**|String[]|Parameters for command execution by container.|
|**env**|[Env[]](describecontainer#env)|Environment Variable Executed by Container.|
|**image**|String|Docker Image Name.|
|**secret**|String|Container Registry Secrets.|
|**tty**|Boolean|Whether a container is assigned with tty.|
|**workingDir**|String|Container’s Working Catalog.|
|**livenessProbe**|[Probe](describecontainer#probe)|Container Liveness Probe Configuration|
|**readinessProbe**|[Probe](describecontainer#probe)|Container Service Readiness Probe Configuration|
|**resources**|[ResourceRequests](describecontainer#resourcerequests)|Container Computing Resource Configuration|
|**systemDisk**|[CloudDisk](describecontainer#clouddisk)|Container Computing Resource Configuration|
|**volumeMounts**|[VolumeMount[]](describecontainer#volumemount)|Container Computing Resource Configuration|
|**containerStatus**|[ContainerStatus](describecontainer#containerstatus)|Container Status Information|
### <div id="containerstatus">ContainerStatus</div>
|Name|Type|Description|
|---|---|---|
|**name**|String|Container Name|
|**restartCount**|Integer|Number of Reboot Times of Container|
|**ready**|Boolean|Whether the container has passed readiness probe detection|
|**state**|[ContainerState](describecontainer#containerstate)|Detailed Information About Current Status of Container|
|**lastState**|[ContainerState](describecontainer#containerstate)|Detailed information about last termination of container|
### <div id="containerstate">ContainerState</div>
|Name|Type|Description|
|---|---|---|
|**running**|[ContainerStateRunning](describecontainer#containerstaterunning)|Detailed Information of Container Running|
|**terminated**|[ContainerStateTerminated](describecontainer#containerstateterminated)|Detailed Information of Container Termination|
|**waiting**|[ContainerStateWaiting](describecontainer#containerstatewaiting)|Detailed Information of Container Waiting|
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
|**requests**|[Request](describecontainer#request)|Computing Resource Necessary for Container|
|**limits**|[Request](describecontainer#request)|Cap of Computing Resource Used by Container|
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
|**exec**|[Exec](describecontainer#exec)|Execute specified command within the container; if the return code is 0 when the command exits, the diagnostic is considered as successful.|
|**httpGet**|[Hg](describecontainer#hg)|Execute HTTP Get request to the IP address of the container on the specified port and path. If the response status code is greater than or equal to 200 and less than 400, it shall be considered to be successful diagnostics.|
|**tcpSocket**|[TcpSocket](describecontainer#tcpsocket)|Conduct TCP inspection to the IP address of the container on the specified port; if the port opens, it shall be considered to be successful diagnostics.|
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
|**httpHeader**|[Hh[]](describecontainer#hh)|Customized Http headers|
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

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
