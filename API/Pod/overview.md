# pod


## Introduction
pod Service


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**associateElasticIp**|POST|The elastic IP associated with pod is the elastic IP corresponding to the primary network interface and primary private IP. <br>One pod only can be associated with one elastic IP (primary network interface). If the primary network interface has the elastic IP, the error will be returned. <br>If the user is in the blacklist, the error will be returned. <br>|
|**attach**|GET|Connect the container to local standard input and output<br>|
|**checkPodName**|POST|Whether podName conforms to the naming convention, and search whether it already exists in the assigned podName region. <br>|
|**createPods**|POST|Create one or more pods<br>- Real-name verification is required for creating pod<br>- hostname Specification<br>    \- Support two methods: Write in the form of tag or in the form of a complete host name<br>    \- Tag Specification<br>        \- 0-9, a-z(case insensitive) and - (minus), and the others are all invalid character strings<br>        \- Neither start with a minus nor end with a minus<br>        \- At least 1 character and at most 63 characters<br>    \- A complete machine name consists of a series of tabs and dots<br>        \- Tags are connected with "."(dot)<br>        \- Neither start with a "."(dot) nor end with a "."(dot)<br>        \- The entire host name (including tag and separation dot ".") shall have at most 63 ASCII characters<br>    - Network Configuration<br>    \- Specify primary network interface configuration information<br>        \- Must specify subnetId<br>        \- Can specify elasticIp specifications to restrict the created elastic IP, with the bandwidth value range [1-100]Mbps and stepping 1Mbps<br>        \- Can specify the primary IP(primaryIpAddress) and secondary IP(secondaryIpAddresses) of the network interface, in such case, maxCount can only be 1<br>        \- Can set the autoDelete attribute of network interface and specify the network interface can be automatically deleted together with the instance<br>        \- securityGroup and Subnet need to be in the same VPC<br>        \- A pod can specify at most 5 security groups when created<br>        \- The primary network interface deviceIndex is set as 1<br>- Storage<br>    \- volume is divided into container system disk and pod data volume, wherein the container system disk is attached to the directory / and the data volume can be attached to any directory appointed<br>    \- container system disk<br>        \- Can only be cloud types<br>        \- The available Cloud Disk Service types include hdd.std1, ssd.gp1 and ssd.io1<br>        \- Disk Size<br>            \- All types: Range [20,100]GB, step length is 10G<br>        \- Auto Delete<br>            \- Auto Delete by Default<br>        \- The existing Cloud Disk Service can be selected<br>    \- data volume<br>        \- Only can select cloud types currently<br>        \- The available Cloud Disk Service types include hdd.std1, ssd.gp1 and ssd.io1<br>        \- Disk Size<br>            \- All types: Range [20,4000]GB, step length is 10G<br>        \- Auto Delete<br>            \- Auto Delete by Default<br>        \- The existing Cloud Disk Service can be selected<br>        \- Can create disk from snapshot<br>- pod container log<br>    \- 10MB bucket is assigned locally by default, automatically rotate <br>- DNS-1123 label specification<br>    \- Length Range: [1-63]<br>       \- Example: my-name, 123-abc<br>- DNS-1123 subdomain specification<br>    \- Length Range: [1-253]<br>        \- Example: example.com, registry.docker-cn.com<br>- Others<br>    \- After being created, the pod status is running<br>    \- maxCountrefers to the best effort and maxCount is not guaranteed<br>|
|**createSecret**|POST|Create a secret for storing relevant confidential information of image registry. <br>|
|**deletePod**|DELETE|The pod must be in status of stopped, running or error. <br>The instance paid by volume will keep running until it is actively deleted. The instance not used anymore can be actively stopped through this API. <br>Only the instance with the billing type by volume can be actively deleted. The pod with monthly package expired can also be deleted. Please report to the ticket system for other situations. The container with billing status exception can’t be deleted. <br>Sensitive operation, <a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA operation protection can be enabled</a>|
|**deleteSecret**|DELETE|Delete a single secret<br>|
|**describeContainer**|GET|Obtain details of a container in pod|
|**describeInstanceTypes**|GET|Search instance type information list<br>|
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
|**modifyPodAttribute**|PATCH|Modify pod description. <br>|
|**rebuildPod**|POST|Reset a container in pod with new images and keep pod in closed status. <br>|
|**resizeTTY**|POST|Set size of TTY|
|**startPod**|POST|Start a single pod in the off status and the pod involved a job can’t be started. <br>When a pod instance or a cloud disk associated to it is defaulting, the container cannot be normally started. <br>|
|**stopPod**|POST|Stop a single instance in the operating status and the pod involved in a job can’t be started. <br>|
