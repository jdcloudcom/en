# pod


## Introduction
pod Service


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**associateElasticIp**|POST|The elastic IP associated with pod is the elastic IP corresponding to the primary network interface and primary private IP. <br>One pod only can be associated with one elastic IP (primary network interface). If the primary network interface has the elastic IP, the error will be returned. <br>If the user is in the blacklist, the error will be returned. <br>|
|**attach**|GET|Search a single container log<br>|
|**checkPodName**|POST|Whether podName conforms to the naming convention, and search whether it already exists in the assigned podName region. <br>|
|**createPods**|POST|- Real-name verification is required for creating pod<br>- hostname specification    \- Support two methods: write with the method of tag or complete names of Virtual Machines<br>    \- Tag specification<br>        \- 0-9, a-z (uppercase and lowercase insensitive) and - (minus), other character strings are invalid<br>        \- Do not start or end with a minus sign<br>        \- Contain at least 1 character and at most 63 characters<br>    \- The complete names of Virtual Machines are composed of a series of tags and dots<br>        \-Connect tags with "." (dot)<br>        \- Do not start or end with "." (dot)<br>        \- the entire names of Virtual Machines (including tag and splitting point ".") contain at most 63 ASCII characters<br>    \- Regularization: `^([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9])(.([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]))*$`<br>- Network configuration<br>    \- Appoint primary network interface configuration information<br>        \- Be sure to appoint subnetId<br>        \- Created elastic IP can be restricted by appoint elasticIp specification, with the bandwidth value range of [1-100]Mbps and step of 1Mbps<br>        \- Primary IP (primaryIpAddress) and secondary IP (secondaryIpAddresses) of the network interface can be appointed and in such case, maxCount can only be 1<br>        \- The autoDelete attribute of network interface can be set and the network interface to be deleted automatically with the instance can be specified<br>        \- securityGroup and the Subnet shall be in the same VPC<br>        \- One security group must be appointed when one pod is created and at most 5 security groups can be appointed<br>        \- deviceIndex of the primary network interface is set to be 1<br>- Storage<br>    \- volume is divided into root volume and data volume, wherein root volume is attached to the director / and the data volume can be attached to any directory appointed<br>    \- The underlayer storage medium of volume currently only supports the cloud type, i.e., the Cloud Disk Service<br>    \- root volume<br>        \- root volume must only be the cloud type<br>        \- Cloud Disk Service type can be set as ssd or premium-hdd<br>        \- Disk size<br>            \-  ssd: the range is [10,100]GB and the step is 10G<br>            \- premium-hdd: the range is [10,100]GB and the step is 10G<br>        \- Automatic deletion<br>            \- Automatic deletion is the default value<br>        \- Existing Cloud Disk Service can be selected<br>    \- data volume<br>        \- data volume type only can be set as cloud currently<br>        \- Cloud Disk Service type can be set as ssd or premium-hdd<br>        \- Disk size<br>            \- ssd: the range is [20,1000]GB and the step is 10G<br>            \- premium-hdd: the range is [20,3000]GB and the step is 10G<br>        \- Automatic deletion<br>            \- Automatic deletion is the default value<br>        \- Existing Cloud Disk Service can be selected<br>        \- Disks can be created from snapshots<br>- pod container log<br>    \- default: the 10MB bucket is assigned locally by default, which automatically rotate<br>- Others<br>    \- After being created, pod is in the running status<br>    \- maxCount refers to the best effort and is not guaranteed<br>|
|**createSecret**|POST|Create a secret for storing relevant confidential information of image registry. <br>|
|**decribeContainer**|GET|Obtain details of a container in pod|
|**deletePod**|DELETE|The pod must be in status of stopped, running or error. <br>The instance paid by volume will keep running until it is actively deleted. The instance not used anymore can be actively stopped through this API. <br>Only the instance with the billing type by volume can be actively deleted. The pod with monthly package expired can also be deleted. Please report to the ticket system for other situations. The container with billing status exception can’t be deleted. <br>Sensitive operation, <a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA operation protection can be enabled</a>|
|**deleteSecret**|DELETE|Delete a single secret<br>|
|**describePod**|GET|Search detailed information of one pod<br>|
|**describePods**|GET|Search detailed information of pod in batches<br>This API supports query in pages, with 20 entries per page by default. <br>|
|**describeQuota**|GET|Search resource quota and support: Native container pod and secret.<br>|
|**describeSecret**|GET|Search details of a single secret<br>|
|**describeSecrets**|GET|Search secret lists. <br><br>This API supports search in pages, with 20 entries per page by default. <br>|
|**disassociateElasticIp**|POST|The Public IP disassociated with the pod is the elastic IP corresponding to the primary network interface and primary private IP.<br>|
|**execCreate**|POST|Create exec<br>|
|**execGetExitCode**|GET|Obtain exec exit code|
|**execStart**|GET|Execute exec. This interface requires upgrading Http protocol to WebSocket|
|**getContainerLogs**|GET|Search a single container log<br>|
|**modifyPodAttribute**|PATCH|Modify name and description of pod. <br>|
|**rebuildPod**|POST|Reset a container in pod with new images and keep pod in closed status. <br>|
|**resizeTTY**|POST|Set size of TTY|
|**startPod**|POST|Start a single pod in the off status and the pod involved a job can’t be started. <br>When a pod instance or a cloud disk associated to it is defaulting, the container cannot be normally started. <br>|
|**stopPod**|POST|Stop a single instance in the operating status and the pod involved in a job can’t be started. <br>|
