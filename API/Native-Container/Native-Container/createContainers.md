# createContainers


## Description
Create configuration containers for one or more sets
- Real-name verification is required for creating containers
- image
    - Determine the container image via the image name
    - Images named as nginx:tag or mysql/mysql-server:tag are the public images of docker hub
    - Images named as container-registry/image:tag are the images of private registry
    - The private registry must be compatible to the docker registry verification mechanism and save confidential information via secret.
- Hostname Specification
    - Two modes are supported: Write through a tab mode or write through a complete machine name mode.
    - Tag Specification
        - 0-9, a-z (both upper case and lower case are acceptable) and - (minus), others are deemed as invalid character string
        - Neither start with a minus nor end with a minus.
        - At least 1 character and at most 63 characters
    - A complete machine name consists of a series of tabs and dots
        - Tags are connected with “.” (dots)
        - Neither start with a “.” (dot) or end with a “.” (dot).
        - Complete machine name (including tags and dots “.”) with at most 63 ASCII characters
- Network Configuration
    - Specify primary network interface configuration information
        - Be sure to specify one subnet
        - A security group must be specified when creating a virtual machine and at most 5 security groups can be specified.
        - The elastic IP can be restricted by specifying elasticIp specification, with the bandwidth value range of [1-200]Mbps and the stepping of 1Mbps.
        - The primaryIpAddress of network interface can be specified; such IP shall be within the subnet IP range and shall not be occupied; and maxCount can only be 1 when specifying subnet IP.
        - The securityGroup and the Subnet shall be in the same Virtual Private Cloud (VPC).
        - Set deviceIndex of primary network interface to be 1
- Storage
    - The volume can be divided into a root volume and a data volume; the root volume is mounted with the catalog /; and the data volume is mounted with any specified catalog.
    - The bottom storage medium of the volume only supports the cloud type, i.e. the Cloud Disk Service.
    - System Disk
        - The available Cloud Disk Service types include ssd and premium-hdd.
        - Disk Size
            - SSD: Range [10, 100]GB, Step Size: 10G
            - Premium-hdd: Range [20, 1000]GB, Step Size: 10G
        - Auto-delete
            - The cloud disk will be automatically deleted with the container by default. For the data disk or the shared type data disk with the monthly package, the parameter is invalid.
        - The existing Cloud Disk Service can be selected.
    - Data Disk
        - The available Cloud Disk Service types include ssd and premium-hdd.
        - Disk Size
            - ssd: Range[20, 1000] GB, Step Size: 10G
            - premium-hdd: Range[20, 3000] GB, Step Size: 10G
        - Auto-delete
            - Automatic Deletion by Default
        - The existing Cloud Disk Service can be selected.
        - A single container can be mounted with 7 data volumes at most.
- Billing
  - Billing mode of EIP. You may choose pay by consumption separately, and the other billing modes are subject to the machine.
  - The billing mode of the cloud disk is subject to the machine
- Container Log
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
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**containerSpec**|ContainerSpec|False| |Create container specification|
|**maxCount**|Integer|False| |Purchase number of instances; value range: [1,100]|

### ContainerSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**args**|String[]|False| |The container will carry out the parameter of the command. It is CMD of docker image by default if none is specified. |
|**az**|String|True| |Availability Zone of Container |
|**charge**|ChargeSpec|False| |Billing configuration; if no specification is made, the billing type is Pay-As-You-Go - Pay as the service time by default|
|**command**|String[]|False| |The container will carry out the command. It is ENTRYPOINT of docker image by default if none is specified. |
|**dataVolumes**|VolumeMountSpec[]|False| |Mounted Data Volume Information; at most 7 |
|**description**|String|False| |Container Description|
|**elasticIp**|ElasticIpSpec|False| |EIP specification associated with the primary IP of the primary network interface|
|**envs**|EnvVar[]|False| |Environment variables executed by containers; if the environmental variable Key is the same in the image, values in the image will be replaced; </br> 10 pairs at most |
|**hostAliases**|HostAlias[]|False| |Domain and IP Mapping Information; </br> at most 10 alias |
|**hostname**|String|False| |For machine name and specification, please refer to the instruction document; default container ID |
|**image**|String|False| |Image name </br> 1. Docker Hub public image is specified via names as nginx, mysql/mysql-server </br> </br> repository contains at most 256 characters, tag contains at most 128 characters, and registry contains as most 255 characters </br> the image download overtime is 10min|
|**instanceType**|String|True| |Instance Type Family; Refer to [Document](https://www.jdcloud.com/help/detail/1992/isCatalog/1)|
|**logConfiguration**|LogConfiguration|False| |Container log configuration information; 10MB storage space will be assigned to the local by default|
|**name**|String|True| |Container Name|
|**primaryNetworkInterface**|ContainerNetworkInterfaceAttachmentSpec|True| |Primary Network Interface Configuration Information|
|**rootVolume**|VolumeMountSpec|True| |Root Volume Information |
|**secret**|String|False| |Name cited by secrete; secret is not required when using images of Docker Hub and JD Cloud CR |
|**tty**|Boolean|False| |If a container is assigned with tty. It is not assigned by default|
|**workingDir**|String|False| |Container’s Working Catalog. If not specified, it is root catalog (/) by default; and the working catalog must be the absolute path. |
### ChargeSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|
### VolumeMountSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False| |Automatic deletion, the volume is automatically deleted at the time the container is deleted; the value is True by default; and only the scenario of Cloud Disk Service is supported.|
|**category**|String|True| |Disk Classification Cloud: According to Cloud Disk Service volume, root volume can only be the cloud type. |
|**cloudDiskId**|String|False| |Cloud Disk Service ID; if the existing cloud disk is used, be sure to specify partion and fsType. |
|**cloudDiskSpec**|DiskSpec|False| |Cloud Disk Service specification; the Cloud Disk Service automatically created with the container will not divide the disk and will only format the file system. |
|**formatVolume**|Boolean|False| |A new disk automatically created with the container will be automatically formatted to the specified file system type; the existing disk mounted will not be formatted by default and only will be mounted as per specified fsType; and if you intend to format the mounted disk, be sure to set the field as true. |
|**fsType**|String|False| |Specify volume file system type and support [xfs, ext4] now; if the file system type is not specified for the newly-created disk, such disk will be formatted to xfs by default. |
|**mountPath**|String|False| |Catalog mounted into the container; it is not required to specify catalog for the root volume and the mounted catalog is (/); a catalog must be specified for the data volume, which must be the absolute path without any (:). |
|**readOnly**|Boolean|False| |Read-only, false by default; only valid to data volume; when root volume is false, both write and read are available. |
### DiskSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True| |Availability Zone, to which the cloud disk belongs|
|**charge**|ChargeSpec|False| |Billing configuration; if no specification is made, the billing type is Pay-As-You-Go - Pay as the service time by default|
|**description**|String|False| |Description of the cloud disk|
|**diskSizeGB**|Integer|True| |Size of the cloud disk, unit: GiB; ssd value range of [20,1000]GB and step size of 10G; premium-hdd value range of [20,3000]GB and step size of 10G|
|**diskType**|String|True| |Type of the cloud disk, value ssd or premium-hdd|
|**multiAttachable**|Boolean|False| |Whether the Cloud Disk Service supports the mode that one disk is attached to multiple machines. It is set as false by default (not supported).|
|**name**|String|True| |Name of the cloud disk|
|**snapshotId**|String|False| |Snapshot ID used to create Cloud Disk Service|
### ElasticIpSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bandwidthMbps**|Integer|False| |Elastic IP Speed Limit   Unit: MB  |
|**chargeSpec**|ChargeSpec|False| |Billing Configuration|
|**provider**|String|False| |IP Service Provider, value: bgp or no_bg    |
### EnvVar
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Environment Variable Name|
|**value**|String|False| |Value of Environment Variable|
### HostAlias
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**hostnames**|String[]|True| |Domain List|
|**ip**|String|True| |IP Address|
### LogConfiguration
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**logDriver**|String|False| |Name log configuration information; a 10MB storage space will be assigned to the local by default and is automatically rotated.|
|**options**|LogOption|False| |Configuration Options of Log Driver|
### LogOption
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**key**|String|False| | |
|**value**|String|False| | |
### ContainerNetworkInterfaceAttachmentSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False| |Indicate if the network interface is deleted when deleting the container, it is True by default; only True is supported now|
|**deviceIndex**|Integer|False| |Device Index|
|**networkInterface**|NetworkInterfaceSpec|True| |Network Interface Specification|
### NetworkInterfaceSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True| |Availability Zone, User’s Default Availability Zone|
|**description**|String|False| |Description|
|**primaryIpAddress**|String|False| |Network Interface Primary IP|
|**sanityCheck**|Boolean|False| |PortSecurity, the value is 0 or 1, 1 by default|
|**secondaryIpAddresses**|String[]|False| |Secondary IP List|
|**secondaryIpCount**|Integer|False| |Amount of Secondary IP Assigned Automatically|
|**securityGroups**|String[]|False| |Security Group ID List|
|**subnetId**|String|True| |Subnet ID|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**containerIds**|String[]| |

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
|**200**|OK|
|**404**|Not found|
|**429**|Quota exceeded|
