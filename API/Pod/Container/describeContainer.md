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
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**container**|Container| |
### Container
|Name|Type|Description|
|---|---|---|
|**name**|String|Container Name|
|**command**|String[]|Command Executed by Container.|
|**args**|String[]|Parameters for command execution by container.|
|**env**|Env[]|Environment Variable Executed by Container.|
|**image**|String|Docker Image Name.|
|**secret**|String|Container Registry Secrets.|
|**tty**|Boolean|Whether a container is assigned with tty.|
|**workingDir**|String|Container’s Working Catalog.|
|**livenessProbe**|Probe|Container Liveness Probe Configuration|
|**readinessProbe**|Probe|Container Service Readiness Probe Configuration|
|**resources**|ResourceRequests|Container Computing Resource Configuration|
|**systemDisk**|CloudDisk|Container Computing Resource Configuration|
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
|**terminated**|ContainerStateTerminated|Detailed Information of Container Termination|
|**waiting**|ContainerStateWaiting|Detailed Information of Container Waiting|
### ContainerStateWaiting
|Name|Type|Description|
|---|---|---|
|**reason**|String|(Brief) Reason for Non-running of Container. <br><br>eg ContainerCreating     <br>|
|**message**|String|Detailed Information of Non-running of Container|
### ContainerStateTerminated
|Name|Type|Description|
|---|---|---|
|**signal**|Integer|Signal for Container Being Terminated.|
|**exitCode**|Integer|Exit Code for Container Being Terminated.|
|**reason**|String|(Brief) Causes for Container Being Terminated.|
|**message**|String|Detailed Information of Container Being Terminated.|
|**finishedAt**|String|Time of Container Being Terminated.|
|**startedAt**|String|Execution Start Time of Container|
### ContainerStateRunning
|Name|Type|Description|
|---|---|---|
|**startedAt**|String|Last Reboot or Start Time of Container|
### VolumeMount
|Name|Type|Description|
|---|---|---|
|**name**|String|Name of Cloud Disk Attached in pod.|
|**mountPath**|String|Attach Point in Container|
|**readOnly**|Boolean|Whether to attach with the method of read-only.|
### CloudDisk
|Name|Type|Description|
|---|---|---|
|**volumeId**|String|Cloud Disk ID.|
|**snapshotId**|String|Cloud Disk Snapshot ID.|
|**diskType**|String|Cloud Disk Types: hdd.std1,ssd.gp1,ssd.io1.|
|**sizeGB**|Integer|Cloud disk size, unit GB.|
|**fsType**|String|Specify volume file system type and support [xfs, ext4] now.|
|**iops**|Integer|Only the ssd.io1 type iops value of cloud disk is valid now.|
|**autoDelete**|Boolean|Whether to delete with pod.|
### ResourceRequests
|Name|Type|Description|
|---|---|---|
|**requests**|Request|Computing Resource Necessary for Container|
|**limits**|Request|Cap of Computing Resource Used by Container|
### Request
|Name|Type|Description|
|---|---|---|
|**cpu**|String|Computing Resource Necessary for Container|
|**memoryMB**|String|Cap of Computing Resource Used by Container|
### Probe
|Name|Type|Description|
|---|---|---|
|**initialDelaySeconds**|Integer|How long the container does trigger the probe after start.|
|**periodSeconds**|Integer|Time interval for detection.|
|**timeoutSeconds**|Integer|Time-out period of detection.|
|**failureThreshold**|Integer|The number of consecutive alive detection failure after a successful status, to which extent the alive detection is considered as failed.|
|**successThreshold**|Integer|The number of consecutive alive detection success after a successful status, to which extent the alive detection is considered as successful.|
|**exec**|Exec|Execute specified command within the container; if the return code is 0 when the command exits, the diagnostic is considered as successful.|
|**httpGet**|Hg|Execute HTTP Get request to the IP address of the container on the specified port and path. If the response status code is greater than or equal to 200 and less than 400, it shall be considered to be successful diagnostics.|
|**tcpSocket**|TcpSocket|Conduct TCP inspection to the IP address of the container on the specified port; if the port opens, it shall be considered to be successful diagnostics.|
### TcpSocket
|Name|Type|Description|
|---|---|---|
|**port**|Integer|Port number, range: [1-65535]|
### Hg
|Name|Type|Description|
|---|---|---|
|**scheme**|String|Default value: http.|
|**host**|String|host information connected to pod.|
|**port**|Integer|Port Number.|
|**path**|String|Path of HTTP.|
|**httpHeader**|Hh[]|Customized Http headers|
### Hh
|Name|Type|Description|
|---|---|---|
|**name**|String|http header Key|
|**value**|String|http header Value|
### Exec
|Name|Type|Description|
|---|---|---|
|**command**|String[]|Command Executed.|
### Env
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
