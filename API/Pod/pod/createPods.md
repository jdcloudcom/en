# createPods


## Description
Create one or more pods
- Real-name verification is required for creating pod
- hostname Specification
    - Two modes are supported: Write through a tab mode or write through a complete machine name mode
    - Tag Specification
        - 0-9, a-z (both upper case and lower case are acceptable) and - (minus), others are deemed as invalid character string
        - Neither start with a minus nor end with a minus
        - At least 1 character and at most 63 characters
    - A complete machine name consists of a series of tabs and dots
        - Tags are connected with "." (dot)
        - Neither start with a "." (dot) or end with a "." (dot).
        - Complete machine name (including tags and dots ".") with at most 63 ASCII characters
- Network Configuration
    - Specify primary network interface configuration information
        - Must specify the subnetId
        - The elastic IP can be restricted by specifying elasticIp specification, with the bandwidth value range of [1-100]Mbps and the stepping of 1Mbps
        - The primary IP (primaryIpAddress) and secondary IP (secondaryIpAddresses) of network interface can be specified; at such time, maxCount can only be 1
        - Automatic deletion (autoDelete) attribute of network interface can be specified to indicate that if the network interface is deleted automatically when deleting an instance
        - The securityGroup and the Subnet shall be in the same virtual private cloud (VPC).
        - A pod can specify at most 5 security groups when created
        - Set deviceIndex of primary network interface to be 1
- Storage
    - volume can be divided into container system disk and pod data volume, wherein the container system disk is attached to the directory / and the data volume can be attached to any directory appointed
    - container system disk
        - Only can be cloud types
        - The available Cloud Disk Service types include hdd.std1, ssd.gp1 and ssd.io1
        - Disk Size
            - All types: Range [20,100]GB, step length is 10G
        - Automatic Deletion
            - Delete automatically by default
        - The existing cloud disk service can be selected.
    - data volume
        - Can only select cloud types currently
        - The available Cloud Disk Service types include hdd.std1, ssd.gp1 and ssd.io1
        - Disk Size
            - All types: Range [20,4000]GB, step length is 10G
        - Automatic Deletion
            - Delete automatically by default
        - The existing cloud disk service can be selected.
        - Disk can be created from snapshot
- pod Container Log
    - default: A 10MB bucket will be distributed to the local by default and is automatically rotated
- DNS-1123 label specification
    - Length Range: [1-63]
    - Example: my-name, 123-abc
- DNS-1123 subdomain specification
    - Length Range: [1-253]
    - Example: example.com, registry.docker-cn.com
- Others
    - After being created, the pod is in running status
    - maxCount refers to the maximum effort and the maxCount is not guaranteed.


## Request Method
POST

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**podSpec**|PodSpec|True| |Creation Parameter of pod|
|**maxCount**|Integer|True| |Purchase number of instances; value range: [1,100]|
|**clientToken**|String|False| |Guarantee the character string of request idempotence; the maximum length is 64 ASCII characters|

### PodSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Pod Name|
|**description**|String|False| |Description information is null by default; all characters are allowed to enter under UTF-8 coding, not exceeding 256 characters.|
|**hostname**|String|False| |Host name: range: [1-63] ASCII characters; default value is podId|
|**restartPolicy**|String|False| |Container reboot policy in pod; Always, OnFailure, Never; default: Always|
|**terminationGracePeriodSeconds**|Integer|False| |Elegant shutdown grace period, in case of time-out, forced shutdown will be triggered. Default: 30s; the value cannot be negative; range: [0-300]|
|**instanceType**|String|True| |Instance type family; refer to [Document](https://www.jdcloud.com/help/detail/1992/isCatalog/1)|
|**az**|String|True| |Availability Zone of Container|
|**dnsConfig**|DnsConfigSpec|False| |/etc/resolv.conf configuration of container in pod|
|**logConfig**|LogConfigSpec|False| |Container log configuration information; 10MB storage space will be assigned to the local by default|
|**hostAliases**|HostAliasSpec[]|False| |Domain and IP mapping information; </br> at most 10 alias|
|**volumes**|VolumeSpec[]|False| |The volume list of Pod can be attached to container. Length Range: [0,7]|
|**containers**|ContainerSpec[]|True| |The container list of Pod shall have at least one container. Length Range [1,8]|
|**charge**|ChargeSpec|False| |Billing mode: Prepaid by duration (prepaid_by_duration), postpaid by duration (postpaid_by_duration). Default: Pay-As-You-Go by Configuration|
|**elasticIp**|ElasticIpSpec|False| |Elastic IP specification related to primary IP of primary network interface|
|**primaryNetworkInterface**|NetworkInterfaceAttachmentSpec|True| |Primary Network Interface Configuration Information|
### NetworkInterfaceAttachmentSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**autoDelete**|Boolean|False| |Indicate if the network interface is deleted when deleting the pod, it is True by default; only True is supported now|
|**deviceIndex**|Integer|False| |Device Index, currently pod supports one network interface only, so it can be set as 1 only|
|**networkInterface**|NetworkInterfaceSpec|True| |Network Interface Specification|
### NetworkInterfaceSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**subnetId**|String|True| |Subnet ID|
|**az**|String|False| |Availability zone refers to the user’s default availability zone, which is an invalid parameter and shall not be used|
|**networkInterfaceName**|String|False| |Network interface name, only allowed to enter Chinese, numbers, capital and lowercase letters, English underline "_" and line-through "-", must provide a name which cannot exceed 32 characters.|
|**primaryIpAddress**|String|False| |Network interface primary IP, if it has not been assigned, it will be allocated automatically from the subnet|
|**secondaryIpAddresses**|String[]|False| |SecondaryIp List|
|**secondaryIpCount**|Integer|False| |Amount of SecondaryIp allocated automatically|
|**securityGroups**|String[]|False| |Security group ID list to be associated, a maximum of 5 security groups can be done|
|**sanityCheck**|Integer|False| |Source and target IP address verification, with value 0 or 1, default value is 1|
|**description**|String|False| |Description, all characters allowed to enter under UTF-8 coding, which is not more than 256 characters|
### ElasticIpSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**bandwidthMbps**|Integer|True| |Elastic IP Speed Limit (Unit: MB)|
|**provider**|String|False| |IP service provider, values include bgp or no_bgp, default: bgp|
|**chargeSpec**|ChargeSpec|False| |Pay-In-Advance (prepaid_by_duration), Pay-As-You-Go by Configuration (postpaid_by_duration). Default: Pay-As-You-Go by Configuration|
### ChargeSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, while postpaid_by_usage means Pay-As-You-Go By Consumption; and postpaid_by_duration means pay by configuration and is the default value. Please refer to the help documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, which is valid only when chargeMode is prepaid_by_duration, with the values of month and year and the default value of month|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing hours, the Pay-In-Advance is compulsory and is valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be: 1~9; when chargeUnit is year, the value shall be 1, 2 and 3|
### ContainerSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Container name, comply with DNS-1123 label specification, cannot be repeated in a Pod.|
|**command**|String[]|False| |The container will carry out the command. It is ENTRYPOINT of docker image by default if none is specified. The total length is 256 characters.|
|**args**|String[]|False| |The container will carry out the parameter of the command. It is CMD of docker image by default if none is specified. The total length is 2,048 characters.|
|**env**|EnvSpec[]|False| |Environment variables executed by containers; if the environmental variable Key is the same in the image, values in the image will be replaced. Array Range: [0-100]|
|**image**|String|True| |Image name </br><br>Docker image name. nginx:latest. Length range: [1-639]<br>1. Docker Hub public image is specified via names as nginx, mysql/mysql-server </br> <br>2. The length of repository contains at most 256 characters, tag contains at most 128 characters and registry contains at most 255 characters </br> <br>|
|**secret**|String|False| |Secrets. If not uploaded currently, dockerHub image is selected by default|
|**tty**|Boolean|False| |Whether a container is assigned with tty. It is not assigned by default|
|**workingDir**|String|False| |Container’s Working Catalog. If not specified, it is root directory (/) by default; and the working catalog must be the absolute path; length range: [0-1024]|
|**livenessProbe**|ProbeSpec|False| |Container Liveness Probe Configuration|
|**readinessProbe**|ProbeSpec|False| |Container Service Readiness Probe Configuration|
|**resources**|ResourceRequestsSpec|False| |Container Computing Resource Configuration|
|**systemDisk**|CloudDiskSpec|True| |Container Computing Resource Configuration|
|**volumeMounts**|VolumeMountSpec[]|False| |Cloud Disk Attach Information|
### VolumeMountSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Cloud disks to be attached must use the pod volumeSpec.name.|
|**mountPath**|String|True| |Attach point in the container, with absolute path; repeated attaching and nesting attaching are not allowed; it is not allowed to be attached to the root directory ("/"). Length range: [1-1024]|
|**readOnly**|Boolean|False| |Whether to attach with the method of read-only. Default Read and Write mode|
### CloudDiskSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**volumeId**|String|False| |Cloud disk ID, specified use of the existing cloud disk|
|**name**|String|False| |Cloud Disk Name|
|**snapshotId**|String|False| |Cloud disk snapshot ID, create cloud disk based on cloud disk snapshot.|
|**diskType**|String|False| |Cloud Disk Types: hdd.std1,ssd.gp1,ssd.io1|
|**sizeGB**|Integer|False| |Cloud Disk size, unit GB, requirement|
|**fsType**|String|False| |Specify volume file system type and support [xfs, ext4] now; if the file system type is not specified for the newly-created disk, such disk will be formatted to xfs by default.|
|**iops**|Integer|False| |Only the ssd.io1 type iops value of cloud disk is valid now|
|**autoDelete**|Boolean|False| |Whether to delete with pod. Default: true|
### ResourceRequestsSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**requests**|RequestSpec|False| |Computing Resource Necessary for Container|
|**limits**|RequestSpec|False| |Cap of Computing Resource Used by Container|
### RequestSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cpu**|String|False| |Computing Resource Necessary for Container|
|**memoryMB**|String|False| |Cap of Computing Resource Used by Container|
### ProbeSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**initialDelaySeconds**|Integer|False| |How long after the container starts can trigger the probe. Default value: 10 seconds; range: [0-300]|
|**periodSeconds**|Integer|False| |Time interval for detection. Default value is 10 seconds; range: [1-300]|
|**timeoutSeconds**|Integer|False| |Time-out period of detection. Default value is 1 second; range: [1-300]|
|**failureThreshold**|Integer|False| |The number of consecutive alive detection failure after a successful status, to which extent the alive detection is considered as failed. Default value is 3 times; range:[1-10]|
|**successThreshold**|Integer|False| |The number of consecutive alive detection success after a successful status, to which extent the alive detection is considered as successful. Default value is 1 time; range:[1-10]|
|**exec**|ExecSpec|False| |Execute specified command within the container; if the return code is 0 when the command exits, the diagnostic is considered as successful.|
|**httpGet**|HgSpec|False| |Execute HTTP Get request to the IP address of the container on the specified port and path. <br><br>If the response status code is greater than or equal to 200 and less than 400, the diagnosis is considered as successful. <br>|
|**tcpSocket**|TcpSocketSpec|False| |Conduct TCP inspection to the IP address of the container on the specified port. If the port opens, the diagnosis is considered as successful.|
### TcpSocketSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**port**|Integer|True| |Port number, range: [1-65535]|
### HgSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**scheme**|String|False| |Default value: http; optional values include http, https, HTTP, HTTPS.|
|**host**|String|False| |pod_ip is used by default as hose information connected to pod, to satisfy hostname or ipv4 format. Length range:[0-253]|
|**port**|Integer|True| |Port Number. Range: [1-65535]|
|**path**|String|True| |Path of HTTP Range: [1-256]|
|**httpHeader**|HhSpec[]|False| |Customized Http headers|
### HhSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |http header key, http rules shall be followed. Length Range:[1-64]|
|**value**|String|True| |http header Value|
### ExecSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**command**|String[]|True| |The total length of the command executed is 256 characters.|
### EnvSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Environment Variable Name (ASCII). Range: [1-64]. Must be letters, numbers and underline (_). The regular is `[a-zA-Z0-9]*$`.|
|**value**|String|False| |Environment Variable Value. Range: [0-1024]|
### VolumeSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |volume name, comply with DNS-1123 label specification, which is unique in a Pod.|
|**jdcloudDisk**|JDCloudVolumeSourceSpec|True| |cloud disk provided to Pod.|
### JDCloudVolumeSourceSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**volumeId**|String|False| |Cloud Disk id, use existed Cloud Disk|
|**name**|String|False| |Cloud Disk Name|
|**snapshotId**|String|False| |Cloud Disk snapshot id, creating Cloud Disk according to Cloud Disk snapshot.|
|**diskType**|String|False| |Cloud Disk Types: hdd.std1,ssd.gp1,ssd.io1|
|**sizeGB**|Integer|False| |Cloud disk size, unit GB|
|**fsType**|String|True| |Specify volume file system type and support [xfs, ext4] now; if the file system type is not specified for the newly-created disk, such disk will be formatted to xfs by default.|
|**formatVolume**|Boolean|False| |A new disk automatically created with the container will be automatically formatted to the specified file system type; the existing disk mounted will not be formatted by default and only will be mounted as per specified fsType; and if you intend to format the mounted disk, be sure to set the field as true.|
|**iops**|Integer|False| |Only the ssd.io1 type iops value of cloud disk is valid now.|
|**autoDelete**|Boolean|False| |Whether to delete with pod. Default: true|
### HostAliasSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**hostnames**|String[]|True| |Domain List. <br><br>eg  ["foo.local", "bar.local"]. Length range is 1-10; elements conform to hostname naming convention. <br>|
|**ip**|String|True| |ipv4 address; eg "127.0.0.1"|
### LogConfigSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**logDriver**|String|False| |Name log configuration information; currently it only supports that a 10MB bucket is assigned to each container to the local by default and is automatically rotated. Only support default currently. Default value: default.|
### DnsConfigSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**nameservers**|String[]|False| |IP address list of DNS server; the repeated ones will be removed. <br><br>eg ["8.8.8.8", "4.2.2.2"]. List length: [0-20]; elements in the list conform to IPv4 format. <br>|
|**searches**|String[]|False| |DNS search domain list, used for search of host name. <br><br>eg ["ns1.svc.cluster.local", "my.dns.search.suffix"]. List length: [0-6]; the total length of all characters in the list cannot exceed 256. <br>|
|**options**|PodDnsConfigOptionSpec[]|False| |DNS解析器选项列表。<br><br>eg ["ndots":"2", "edns0":""]. List length: [0-10]|
### PodDnsConfigOptionSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Length range: [1-63]; linux resolver restriction shall be followed|
|**value**|String|False| |Length range: [0-100]; limited to timeout, attempts, ndots only|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**podIds**|String[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
