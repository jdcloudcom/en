# rebuildContainer


## Description
Reset Native Container, and use new image resetting for existing Native Container.
The id of the original container doesn’t change, doesn’t involve billing changes, and doesn’t support modification of instance types for the time being, won’t change the physical node of Native Container, and doesn’t support modification of used system disks, data disks as well as network-related parameters as well.
- Image
    - Determine the container image via the image name
    - nginxImages named as :tag or mysql/mysql-server:tag are the public images of docker hub
    - container-registry/imageImages named as container-registry/image :tag are the images of private registry
    - The private registry must be compatible to the docker registry verification mechanism and save confidential information via secret
- Others
    - Before rebuild, the container must be in closed status
    - After rebuild, the container is still in closed status


## Request Method
POST

## Request Address
https://nativecontainer.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}:rebuild

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**containerId**|String|True| |Container ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**image**|String|False| |Image name </br> 1. Docker Hub public image is specified via names as nginx, mysql/mysql-server </br> </br> repository contains at most 256 characters, tag contains at most 128 characters, and registry contains as most 255 characters </br> the image download overtime is 10min|
|**secret**|String|False| |Name cited by secrete; secret is not required when using images of Docker Hub and JD Cloud CR|
|**command**|String[]|False| |The container will carry out the command. It is ENTRYPOINT of docker image by default if none is specified|
|**args**|String[]|False| |The container will carry out the parameter of the command. It is CMD of docker image by default if none is specified|
|**tty**|Boolean|False| |Whether a container is assigned with tty. It is not assigned by default|
|**workingDir**|String|False| |Container’s working catalog. If not specified, it is root catalog (/) by default; and the working catalog must be the absolute path|
|**envs**|EnvVar[]|False| |Environment variables executed by containers; if the environmental variable Key is the same in the image, values in the image will be replaced; </br> 10 pairs at most|

### EnvVar
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Environment Variable Name|
|**value**|String|False| |Value of Environment Variable|

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
