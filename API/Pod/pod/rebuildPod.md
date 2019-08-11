# rebuildPod


## Description
Reset a container in pod with new images and keep pod in closed status.


## Request Method
POST

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}:rebuild

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**podId**|String|True| |Pod ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**containers**|RebuildContainerSpec[]|False| |Reset container-related parameters|

### RebuildContainerSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**containerName**|String|True| |Container Name|
|**command**|String[]|False| |The container will carry out the command. It is ENTRYPOINT of docker image by default if none is specified. The total length is 256 characters.|
|**args**|String[]|False| |The container will carry out the parameter of the command. It is CMD of docker image by default if none is specified. The total length is 2,048 characters.|
|**env**|EnvSpec[]|False| |Environment variables executed by containers; if the environmental variable Key is the same in the image, values in the image will be replaced. Length range: [0-100]|
|**image**|String|True| |Image name </br><br>Docker image name. nginx:latest. Length range: [1-500]<br>1. Docker Hub public image is specified via names as nginx, mysql/mysql-server </br> <br>2. repository contains at most 256 characters, tag contains at most 128 characters, and registry contains as most 255 characters </br> <br>|
|**secret**|String|False| |Registry secret name. If not uploaded currently, dockerHub image is selected by default|
|**tty**|Boolean|False| |Whether a container is assigned with tty. It is not assigned by default|
|**workingDir**|String|False| |Container’s working catalog. If not specified, it is root directory (/) by default; and the working catalog must be the absolute path; length range: [0-1024]|
|**livenessProbe**|ProbeSpec|False| |Container Liveness Probe Configuration|
|**readinessProbe**|ProbeSpec|False| |Container Service Readiness Probe Configuration|
|**volumeMounts**|VolumeMount[]|False| |Container Computing Resource Configuration|
### VolumeMount
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |pod volume name must be used|
|**mountPath**|String|True| |Attach point in the container, with absolute path; repeated attaching and nesting attaching are not allowed; it is not allowed to be attached to the root directory ("/"). Length range: [1-1024]|
|**readOnly**|Boolean|False| |Whether to attach with the method of read-only. Default Read and Write mode|
### ProbeSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**initialDelaySeconds**|Integer|False| |How long after the container starts can trigger the probe. Default value: 10 seconds; range: [0-300]|
|**periodSeconds**|Integer|False| |Time interval for detection. Default value is 10 seconds; range: [1-300]|
|**timeoutSeconds**|Integer|False| |Time-out period of detection. Default value is 1 second; range: [1-300]|
|**failureThreshold**|Integer|False| |The number of consecutive alive detection failure after a successful status, to which extent the alive detection is considered as failed. Default value is 3 times; range 1-10|
|**successThreshold**|Integer|False| |The number of consecutive alive detection success after a successful status, to which extent the alive detection is considered as successful. Default value is 1 time; range 1-10|
|**exec**|Exec|False| |Execute specified command within the container; if the return code is 0 when the command exits, the diagnostic is considered as successful.|
|**httpGet**|Hg|False| |Execute HTTP Get request to the IP address of the container on the specified port and path. <br><br>If the response status code is greater than or equal to 200 and less than 400, the diagnosis is considered as successful. <br>|
|**tcpSocket**|TcpSocketSpec|False| |Conduct TCP inspection to the IP address of the container on the specified port. If the port opens, the diagnosis is considered as successful.|
### TcpSocketSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**port**|Integer|True| |Range: [1-65535]|
### Hg
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**scheme**|String|False| |Default value: http; optional value http, https|
|**host**|String|False| |pod_ip is used by default as hose information connected to pod, to satisfy hostname or ipv4 format|
|**port**|Integer|True| |Range: [1-65535]|
|**path**|String|True| |Path of HTTP. Range: [1-256]|
|**httpHeader**|Hh[]|False| |Execute HTTP Get request to the IP address of the container on the specified port and path. <br><br>If the response status code is greater than or equal to 200 and less than 400, the diagnosis is considered as successful. |
### Hh
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |http header key, http rules shall be followed|
|**value**|String|True| |Container Alive Detection Method|
### Exec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**command**|String[]|True| |The total length of the command executed is 256 characters. s|
### EnvSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Environment Variable Name (ASCII). Range: [1-64]. Must be letters, figures and underline (). The regular is `[a-zA-Z0-9]*$`.|
|**value**|String|False| |Environment Variable Value. Range: [0-1024]|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
