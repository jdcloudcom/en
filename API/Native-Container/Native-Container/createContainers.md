# createContainers


## Description
Create configuration containers for one or more sets
- Real-name verification is required for creating containers
- Image
    - Determine the container image via the image name
    - Images named as nginx:tag or mysql/mysql-server:tag are the public images of docker hub
    - Images named as container-registry/image:tag are the images of private registry
    - The private registry must be compatible to the docker registry verification mechanism and save confidential information via secret.
- hostname specification
    - Two modes are supported: Write through a tab mode or write through a complete machine name mode.
    - Tag specification
        - 0-9, a-z (both upper case and lower case are acceptable) and - (minus), others are deemed as invalid character string
        - Neither start with a minus nor end with a minus.
        - At least 1 character and at most 63 characters
    - A complete machine name consists of a series of tabs and dots
        - Tags are connected with “.” (dots)
        - Neither start with a “.” (dot) or end with a “.” (dot).
        - Complete machine name (including tags and dots “.”) with at most 63 ASCII characters
- Network configuration
    - Specify primary network interface configuration information
        - Be sure to specify one subnet
        - A security group must be specified when creating a virtual machine and at most 5 security groups can be specified.
        - The elastic IP can be restricted by specifying elasticIp specification, with the bandwidth value range of [1-200]Mbps and the stepping of 1Mbps.
        - The primaryIpAddress of network interface can be specified; such IP shall be within the subnet IP range and shall not be occupied; and maxCount can only be 1 when specifying subnet IP.
        - The securityGroup and the Subnet shall be in the same virtual private cloud (VPC).
        - Set deviceIndex of primary network interface to be 1
- Storage
    - The volume can be divided into a root volume and a data volume; the root volume is mounted with the catalog /; and the data volume is mounted with any specified catalog.
    - The bottom storage medium of the volume only supports the cloud type, i.e. the cloud disk service.
    - System Disk
        - The available cloud disk service types include ssd and premium-hdd.
        - Disk size
            - ssd: range [10, 100]GB, step size: 10G
            - premium-hdd: range [20, 1000]GB, step size: 10G
        - Automatic deletion
            - The cloud disk will be automatically deleted with the container by default. For the data disk or the shared type data disk with the monthly package, the parameter is invalid.
        - The existing cloud disk service can be selected.
    - Data Disk
        - The available cloud disk service types include ssd and premium-hdd.
        - Disk size
            - ssd: range [20, 1000]GB, step size: 10G
            - premium-hdd: range [20, 3000]GB, step size: 10G
        - Automatic deletion
            - Automatic deletion by default
        - The existing cloud disk service can be selected.
        - A single container can be mounted with 7 data volumes at most.
- Billing
  - Elastic IP billing mode: If the separate setting of Pay By Consumption is selected, other billing modes shall be subject to the machine.
  - The billing mode of cloud disk service is subject to the machine.
- Container log
    - A 10MB storage space will be distributed to the local by default and is automatically rotated.
- Others
    - After being created, the container is in running status.
    - maxCount refers to the maximum effort and the maxCount is not guaranteed.


## Request method
POST

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**containerSpec**|ContainerSpec|False||Create container specification|
|**maxCount**|Integer|False||Purchase number of instances; value range: [1,100]|

### <a name="ContainerSpec">ContainerSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**args**|String[]|False||The container will carry out the parameter of the command. It is CMD of docker image by default if none is specified.|
|**az**|String|True||Availability zone of container|
|**charge**|ChargeSpec|False||Billing configuration; if no specification is made, the billing type is Pay-As-You-Go - Pay as the service time by default|
|**command**|String[]|False||The container will carry out the command. It is ENTRYPOINT of docker image by default if none is specified.|
|**dataVolumes**|VolumeMountSpec[]|False||Mounted data Volume information; at most 7|
|**description**|String|False||Container description|
|**elasticIp**|ElasticIpSpec|False||Elastic IP specification related to primary IP of primary network interface|
|**envs**|EnvVar[]|False||Environment variables executed by containers; if the environmental variable Key is the same in the image, values in the image will be replaced; </br> 10 pairs at most|
|**hostAliases**|HostAlias[]|False||Domain and IP mapping information; </br> at most 10 alias|
|**hostname**|String|False||For machine name and specification, please refer to the instruction document; default container ID|
|**image**|String|False||Image name </br> 1. Docker Hub public image is specified via names as nginx, mysql/mysql-server </br> </br> repository contains at most 256 characters, tag contains at most 128 characters, and registry contains as most 255 characters </br> the image download overtime is 10min|
|**instanceType**|String|True||Instance type family; refer to [Document](https://www.jdcloud.com/help/detail/1992/isCatalog/1)|
|**logConfiguration**|LogConfiguration|False||Container log configuration information; 10MB storage space will be assigned to the local by default|
|**name**|String|True||Container name|
|**primaryNetworkInterface**|ContainerNetworkInterfaceAttachmentSpec|True||Primary network interface configuration information|
|**rootVolume**|VolumeMountSpec|True||Root Volume information|
|**secret**|String|False||Name cited by secrete; secret is not required when using images of Docker Hub and JD Cloud CR|
|**tty**|Boolean|False||If a container is assigned with tty. It is not assigned by default|
|**workingDir**|String|False||Container’s working catalog. If not specified, it is root catalog (/) by default; and the working catalog must be the absolute path.|
### <a name="ChargeSpec">ChargeSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeDuration**|Integer|False||Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False||Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|
### <a name="VolumeMountSpec">VolumeMountSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False||Automatic deletion, the volume is automatically deleted at the time the container is deleted; the value is True by default; and only the scenario of cloud disk service is supported.|
|**category**|String|True||Disk classification cloud: According to cloud disk service volume, root volume can only be the cloud type. |
|**cloudDiskId**|String|False||Cloud disk service ID; if the existing cloud disk is used, be sure to specify partion and fsType.|
|**cloudDiskSpec**|DiskSpec|False||Cloud disk service specification; the cloud disk service automatically created with the container will not divide the disk and will only format the file system.|
|**formatVolume**|Boolean|False||A new disk automatically created with the container will be automatically formatted to the specified file system type; the existing disk mounted will not be formatted by default and only will be mounted as per specified fsType; and if you intend to format the mounted disk, be sure to set the field as true.|
|**fsType**|String|False||Specify volume file system type and support [xfs, ext4] now; if the file system type is not specified for the newly-created disk, such disk will be formatted to xfs by default.|
|**mountPath**|String|False||Catalog mounted into the container; it is not required to specify catalog for the root volume and the mounted catalog is (/); a catalog must be specified for the data volume, which must be the absolute path without any (:).|
|**readOnly**|Boolean|False||Read-only, false by default; only valid to data volume; when root volume is false, both write and read are available.|
### <a name="DiskSpec">DiskSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True||Availability zone, to which the cloud disk service belongs|
|**charge**|ChargeSpec|False||Billing configuration. If not specified, the default billing type is pay-as-you-go - pay by service time by default.|
|**description**|String|False||Description of the cloud disk service|
|**diskSizeGB**|Integer|True||Size of the cloud disk service, in GiB; ssd value range of [20,1000]GB and step size of 10G; premium-hdd value range of [20,3000]GB and step size of 10G|
|**diskType**|String|True||Type of the cloud disk service, value ssd or premium-hdd|
|**multiAttachable**|Boolean|False||Whether the cloud disk service supports the mode that one disk is attached to multiple machines. It is set as false by default (not supported).|
|**name**|String|True||Name of the cloud disk service|
|**snapshotId**|String|False||Snapshot ID used to create cloud disk service|
### <a name="ElasticIpSpec">ElasticIpSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bandwidthMbps**|Integer|False||Elastic IP speed limit unit: MB|
|**chargeSpec**|ChargeSpec|False||Billing configuration|
|**provider**|String|False||IP service provider, value: bgp or no_bg|
### <a name="EnvVar">EnvVar</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Environment variable name|
|**value**|String|False||Value of environment variable|
### <a name="HostAlias">HostAlias</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**hostnames**|String[]|True||Domain list|
|**ip**|String|True||IP address|
### <a name="LogConfiguration">LogConfiguration</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**logDriver**|String|False||Name log configuration information; a 10MB storage space will be assigned to the local by default and is automatically rotated.|
|**options**|LogOption|False||Configuration options of log Driver|
### <a name="LogOption">LogOption</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**key**|String|False|||
|**value**|String|False|||
### <a name="ContainerNetworkInterfaceAttachmentSpec">ContainerNetworkInterfaceAttachmentSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False||Indicate if the network interface is deleted when deleting the container, it is True by default; only True is supported now|
|**deviceIndex**|Integer|False||Device Index|
|**networkInterface**|NetworkInterfaceSpec|True||Network interface specification|
### <a name="NetworkInterfaceSpec">NetworkInterfaceSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True||Availability zone, user’s default availability zone|
|**description**|String|False||Description|
|**primaryIpAddress**|String|False||Primary IP of network interface|
|**sanityCheck**|Boolean|False||PortSecurity, with value 0 or 1 and default value 1|
|**secondaryIpAddresses**|String[]|False||SecondaryIp list|
|**secondaryIpCount**|Integer|False||Amount of SecondaryIp assigned automatically|
|**securityGroups**|String[]|False||Security group ID list|
|**subnetId**|String|True||Subnet ID|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**containerIds**|String[]||

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
|**200**|OK|
|**404**|Not found|
|**429**|Quota exceeded|
