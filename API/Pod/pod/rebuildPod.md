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
|**containers**|[RebuildContainerSpec[]](rebuildpod#rebuildcontainerspec)|True| |Reset container-related parameters|

### <div id="rebuildcontainerspec">RebuildContainerSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Container Name|
|**command**|String[]|False| |The container will carry out the command. It is ENTRYPOINT of docker image by default if none is specified. The total length is 256 characters.|
|**args**|String[]|False| |The container will carry out the parameter of the command. It is CMD of docker image by default if none is specified. The total length is 2,048 characters.|
|**env**|[EnvSpec[]](rebuildpod#envspec)|False| |Environment variables executed by containers; if the environmental variable Key is the same in the image, values in the image will be replaced. Length range: [0-100]|
|**image**|String|True| |Image name </br><br>Docker image name. nginx:latest. Length range: [1-639]<br>1. Docker Hub public image is specified via names as nginx, mysql/mysql-server </br> <br>2. The length of repository contains at most 256 characters, tag contains at most 128 characters and registry contains at most 255 characters </br> <br>|
|**secret**|String|False| |Secrets. If not uploaded currently, dockerHub image is selected by default|
|**tty**|Boolean|False| |Whether a container is assigned with tty. It is not assigned by default|
|**workingDir**|String|False| |Container’s working catalog. If not specified, it is root directory (/) by default; and the working catalog must be the absolute path; length range: [0-1024]|
|**livenessProbe**|[ProbeSpec](rebuildpod#probespec)|False| |Container Liveness Probe Configuration|
|**readinessProbe**|[ProbeSpec](rebuildpod#probespec)|False| |Container Service Readiness Probe Configuration|
|**volumeMounts**|[VolumeMountSpec[]](rebuildpod#volumemountspec)|False| |Cloud Disk Attach Information|
### <div id="volumemountspec">VolumeMountSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Cloud disks to be attached must use the pod volumeSpec.name.|
|**mountPath**|String|True| |Attach point in the container, with absolute path; repeated attaching and nesting attaching are not allowed; it is not allowed to be attached to the root directory ("/"). Length range: [1-1024]|
|**readOnly**|Boolean|False| |Whether to attach with the method of read-only. Default Read and Write mode|
### <div id="probespec">ProbeSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**initialDelaySeconds**|Integer|False| |How long after the container starts can trigger the probe. Default value: 10 seconds; range: [0-300]|
|**periodSeconds**|Integer|False| |Time interval for detection. Default value is 10 seconds; range: [1-300]|
|**timeoutSeconds**|Integer|False| |Time-out period of detection. Default value is 1 second; range: [1-300]|
|**failureThreshold**|Integer|False| |The number of consecutive alive detection failure after a successful status, to which extent the alive detection is considered as failed. Default value is 3 times; range:[1-10]|
|**successThreshold**|Integer|False| |The number of consecutive alive detection success after a successful status, to which extent the alive detection is considered as successful. Default value is 1 time; range:[1-10]|
|**exec**|[ExecSpec](rebuildpod#execspec)|False| |Execute specified command within the container; if the return code is 0 when the command exits, the diagnostic is considered as successful.|
|**httpGet**|[HgSpec](rebuildpod#hgspec)|False| |Execute HTTP Get request to the IP address of the container on the specified port and path. <br><br>If the response status code is greater than or equal to 200 and less than 400, the diagnosis is considered as successful. <br>|
|**tcpSocket**|[TcpSocketSpec](rebuildpod#tcpsocketspec)|False| |Conduct TCP inspection to the IP address of the container on the specified port. If the port opens, the diagnosis is considered as successful.|
### <div id="tcpsocketspec">TcpSocketSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**port**|Integer|True| |Port number, range: [1-65535]|
### <div id="hgspec">HgSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**scheme**|String|False| |Default value: http; optional values include http, https, HTTP, HTTPS.|
|**host**|String|False| |pod_ip is used by default as hose information connected to pod, to satisfy hostname or ipv4 format. Length range:[0-253]|
|**port**|Integer|True| |Port Number. Range: [1-65535]|
|**path**|String|True| |Path of HTTP. Range: [1-256]|
|**httpHeader**|[HhSpec[]](rebuildpod#hhspec)|False| |Customized Http headers|
### <div id="hhspec">HhSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |http header key, http rules shall be followed. Length Range:[1-64]|
|**value**|String|True| |http header Value|
### <div id="execspec">ExecSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**command**|String[]|True| |The total length of the command executed is 256 characters.|
### <div id="envspec">EnvSpec</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Environment Variable Name (ASCII). Range: [1-64]. Must be letters, figures and underline (). The regular is `^[a-zA-Z0-9]*$`.|
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
