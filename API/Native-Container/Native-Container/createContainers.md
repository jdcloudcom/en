# createContainers


## Description
Create configuration containers for one or more sets
- Real-name verification is required for creating containers
- image
  - Determine the container image via the image name
  - nginx: Images named as tag or mysql/mysql-server:tag are the public images of docker hub
  - container-registry/imageImages named as container-registry/image :tag are the images of private registry
  - The private registry must be compatible to the docker registry verification mechanism and save confidential information via secret
- hostname Specification
  - Two modes are supported: Write through a tab mode or write through a complete machine name mode.
  - Tag Specification
    - 0-9, a-z (both upper case and lower case are acceptable) and - (minus), others are deemed as invalid character string
    - Neither start with a minus nor end with a minus.
    - At least 1 character and at most 63 characters
  - A complete machine name consists of a series of tabs and dots
    - Tags are connected with "." (dots)
    - Neither start with a "." (dot) or end with a "." (dot).
    - Complete machine name (including tags and dots ".") with at most 63 ASCII characters
  - Regular Expression
    - ^([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9])(\.([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]))*$
- Network Instance Type
  - Specify primary network interface configuration information
    - Must specify vpcId, subnetId and securityGroupIds
    - The elastic IP can be restricted by specifying elasticIp specification, with the bandwidth value range of [1-200]Mbps and the stepping of 1Mbps
    - The primary IP (primaryIpAddress) and secondary IP (secondaryIpAddresses) of network interface can be specified; at such time, maxCount can only be 1
    - The excepted secondary IP count (secondaryIpAddressCount) can be specified to make the system automatically create the Private IP
    - Automatic deletion (autoDelete) attribute of network interface can be specified to indicate that if the network interface is deleted automatically when deleting an instance
    - The securityGroup and the Subnet shall be in the same virtual private cloud (VPC)
    - Every container can specify at most 5 security groups
    - Set deviceIndex of primary network interface to be 0
- Storage
  - The volume can be divided into a root volume and a data volume; the root volume is mounted with the catalog /; and the data volume is mounted with any specified catalog
  - The bottom storage medium of the volume only supports the cloud type, i.e. the cloud disk service
  - When the cloud disk type is ssd.io1, users can specify iops which is invalid for other types of cloud disks and the already existing cloud disks. The specific rules are as follows
    - Step Length 10
    - Range [200, min(32000, size*50)]
    - Default Value size*30
  - root volume
  - root volume can only be the cloud category
    - The available Cloud Disk Service types include hdd.std1, ssd.gp1 and ssd.io1
    - Disk Size
      - All types: Range [10,100]GB, step length is 10G
    - Auto-delete
      - Automatic Deletion by Default
    - The existing Cloud Disk Service can be selected.
  - data volume
    - cloud category can be selected only for data volume currently
    - The available Cloud Disk Service types include hdd.std1, ssd.gp1 and ssd.io1
    - Disk Size
      - All types: Range [20,4000]GB, step length is 10G
    - Auto-delete
      - Automatic Deletion by Default
    - The existing Cloud Disk Service can be selected.
    - Disk can be created from snapshot
    - A single container can attach 7 data volumes
- Container Log
  - default: A 10MB bucket will be distributed to the local by default and is automatically rotated
- Others
  - After being created, the container is in running status.
  - maxCount refers to the maximum effort and the maxCount is not guaranteed


## Request method
POST

## Request address
https://nativecontainer.jdcloud-api.com/v1/regions/{regionId}/containers

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**containerSpec**|[ContainerSpec](createcontainers#containerspec)|True| |Create container specification|
|**maxCount**|Integer|True| |Purchase number of instances; value range: [1,100]|
|**clientToken**|String|False| |Guarantee request idempotence|

### <div id="containerspec">ContainerSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceType**|String|True| |Instance Type Family; Refer to [Document](https://www.jdcloud.com/help/detail/1992/isCatalog/1)|
|**az**|String|True| |Availability Zone of Container |
|**name**|String|True| |Container Name|
|**hostAliases**|[HostAliasSpec[]](createcontainers#hostaliasspec)|False| |Domain and IP mapping information; </br> at most 10 alias|
|**hostname**|String|False| |For machine name and specification, please refer to the instruction document; default container ID |
|**command**|String[]|False| |The container will carry out the command. It is ENTRYPOINT of docker image by default if none is specified. |
|**args**|String[]|False| |The container will carry out the parameter of the command. It is CMD of docker image by default if none is specified. |
|**envs**|[EnvVar[]](createcontainers#envvar)|False| |Environment variables executed by containers; if the environmental variable Key is the same in the image, values in the image will be replaced; </br> 100 pairs at most|
|**image**|String|True| |Image Name </br> 1. Docker Hub public image is specified via names such as nginx, mysql/mysql-server </br> </br> The length of repository contains at most 256 characters, tag contains at most 128 characters and registry contains at most 255 characters|
|**secret**|String|False| |Secrets; secret is not required when using images of Docker Hub and JD Cloud CR|
|**tty**|Boolean|False| |If a container is assigned with tty. It is not assigned by default|
|**workingDir**|String|False| |Container’s Working Catalog. If not specified, it is root catalog (/) by default; and the working catalog must be the absolute path. |
|**rootVolume**|[VolumeMountSpec](createcontainers#volumemountspec)|True| |Root Volume information|
|**dataVolumes**|[VolumeMountSpec[]](createcontainers#volumemountspec)|False| |Mounted data Volume information; at most 7|
|**elasticIp**|[ElasticIpSpec](createcontainers#elasticipspec)|False| |Elastic IP specification related to primary IP of primary network interface|
|**primaryNetworkInterface**|[ContainerNetworkInterfaceAttachmentSpec](createcontainers#containernetworkinterfaceattachmentspec)|True| |Primary Network Interface Configuration Information|
|**logConfiguration**|[LogConfiguration](createcontainers#logconfiguration)|False| |Container log configuration information; 10MB storage space will be assigned to the local by default|
|**description**|String|False| |Container Description|
|**charge**|[ChargeSpec](createcontainers#chargespec)|False| |Billing configuration; if no specification is made, the billing type is Pay-As-You-Go - Pay as the service time by default|
### <div id="chargespec">ChargeSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**autoRenew**|Boolean|False| |True=: OPEN——Enable automatic renewal, False=CLOSE—— Disable automatic renewal, with default value of CLOSE|
|**buyScenario**|String|False| |The unified activity credential, JSON character string, for the product line needs the BASE64 code. Now, the format required before coding is {"activity":{"activityType": required field, "activityIdentifier": required field}}|
### <div id="logconfiguration">LogConfiguration</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**logDriver**|String|False| |Name log configuration information; a 10MB storage space will be assigned to the local by default and is automatically rotated.|
### <div id="containernetworkinterfaceattachmentspec">ContainerNetworkInterfaceAttachmentSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False| |Indicate if the network interface is deleted when deleting the container, it is True by default; only True is supported now|
|**deviceIndex**|Integer|False| |Device Index|
|**networkInterface**|[NetworkInterfaceSpec](createcontainers#networkinterfacespec)|True| |Network Interface Specification|
### <div id="networkinterfacespec">NetworkInterfaceSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**subnetId**|String|True| |Subnet ID|
|**az**|String|True| |Availability Zone, user’s default availability zone, not support currently|
|**primaryIpAddress**|String|False| |Primary IP of Network Interface|
|**secondaryIpAddresses**|String[]|False| |Secondary IP List|
|**secondaryIpCount**|Integer|False| |Amount of Secondary IP Assigned Automatically|
|**securityGroups**|String[]|False| |Security group ID list to be associated, a maximum of 5 security groups can be done|
|**sanityCheck**|Boolean|False| |Source and target IP address verification, with value 0 or 1, default value is 1, not support this function currently|
|**description**|String|False| |Description|
### <div id="elasticipspec">ElasticIpSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bandwidthMbps**|Integer|True| |Elastic IP Speed Limit Unit: MB|
|**provider**|String|False| |IP service provider, values include bgp or no_bgp|
|**chargeSpec**|[ChargeSpec](createcontainers#chargespec)|False| |Billing Configuration|
### <div id="volumemountspec">VolumeMountSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**category**|String|True| |Disk classification cloud: Volume based on Cloud Disk Service  Only support cloud type|
|**autoDelete**|Boolean|False| |Automatic deletion, the volume is automatically deleted at the time the container is deleted; the value is True by default; and only the scenario of Cloud Disk Service is supported.|
|**mountPath**|String|False| |Catalog mounted into the container; it is not required to specify catalog for the root volume and the mounted catalog is (/); a catalog must be specified for the data volume, which must be the absolute path without any (:). |
|**readOnly**|Boolean|False| |Read-only, false by default; only valid to data volume; when root volume is false, both write and read are available. |
|**cloudDiskSpec**|[DiskSpec](createcontainers#diskspec)|False| |Cloud disk service specification; the cloud disk service automatically created with the container will not divide the disk and will only format the file system|
|**cloudDiskId**|String|False| |Cloud Disk Service ID, if the existing cloud disk is used, the fsType must be specified at the same time|
|**fsType**|String|False| |Specify volume file system type and support [xfs, ext4] now; if the file system type is not specified for the newly-created disk, such disk will be formatted to xfs by default. |
|**formatVolume**|Boolean|False| |A new disk automatically created with the container will be automatically formatted to the specified file system type; the existing disk mounted will not be formatted by default and only will be mounted as per specified fsType; and if you intend to format the mounted disk, be sure to set the field as true. |
### <div id="diskspec">DiskSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True| |Availability Zone, to which the cloud disk belongs|
|**name**|String|True| |Name of the cloud disk|
|**description**|String|False| |Description of the cloud disk|
|**diskType**|String|True| |Type of the cloud disk, value ssd, premium-hdd, ssd.gp1, ssd.io1 or hdd.std1|
|**diskSizeGB**|Integer|True| |Size of Cloud Disk Service is in GiB, for ssd type, the value range is [20,1000]GB and the step size is 10G, for premium-hdd type, the value range is [20,3000]GB, and the step size is 10G, for ssd.gp1, ssd.io1 and hdd.std1 types, the value range is [20,16000]GB, and the step size is 10G|
|**iops**|Integer|False| |The size of Cloud Disk Service IOPS is effective only when the cloud disk type is ssd.io1, and the step size is 10.|
|**snapshotId**|String|False| |Snapshot ID used to create a cloud disk|
|**charge**|[ChargeSpec](createcontainers#chargespec)|False| |Billing configuration; if no specification is made, the billing type is Pay-As-You-Go - Pay as the service time by default|
|**multiAttachable**|Boolean|False| |Whether the Cloud Disk Service supports the mode that one disk is attached to multiple machines. It is set as false by default (not supported).|
|**encrypt**|Boolean|False| |Whether a Cloud Disk is encrypted, false (does not encrypt) by default|
### <div id="envvar">EnvVar</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Environment Variable Name|
|**value**|String|False| |Value of Environment Variable|
### <div id="hostaliasspec">HostAliasSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**hostnames**|String[]|True| |Domain List|
|**ip**|String|True| |IP Address|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createcontainers#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**containerIds**|String[]| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
