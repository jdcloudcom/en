# decribeContainer


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

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
