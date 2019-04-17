# pod


## Introduction
pod service</br>The product currently supports access control products for user identity management and resource access control. For details, see: https://docs.jdcloud.com/cn/iam/support-services


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**associateElasticIp**|POST|The elastic IP associated with pod is the elastic IP corresponding to the primary network interface and primary private IP. <br></br>One pod only can be associated with one elastic IP (primary network interface). If the primary network interface has the elastic IP, the error will be returned. <br></br>If the user is in the blacklist, the error will be returned. </br>|
|**attach**|GET|Search the log of a single container</br>|
|**checkPodName**|POST|Whether podName conforms to the naming convention, and search whether it already exists in the assigned podName region. </br>|
|**createPods**|POST|- Real-name verification is required for creating pod</br>- hostname specification</br>    \- supports two methods: Write in the form of tag or in the form of a complete host name</br>    \- Tag specification</br>        \- 0-9, a-z(case insensitive) and - (minus), and the others are all invalid character string</br>        \- Neither start with a minus nor end with a minus</br>        \- At least 1 character and at most 63 characters</br>    \- A complete machine name consists of a series of tabs and dots</br>        \- Tags are connected with “.” (dot)</br>        \- Neither start with a “.” (dot) nor end with a “.” (dot)</br>        \- There shall be at most 63 ASCII characters in the entire host name (including tags and separation dot “.”)</br>    \- Regular: `^([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9])(.([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]))*$`</br>- Network configuration</br>    \- Specify primary network interface configuration information</br>        \- Be sure to specify the subnetId</br>        \- The elastic IP can be restricted by specifying elasticIp specification, with the bandwidth value range of [1-100]Mbps and the stepping of 1Mbps</br>        \- The primary IP (primaryIpAddress) and secondary IP (secondaryIpAddresses) of network interface can be specified; at such time, maxCount can only be 1</br>        \- Automatic deletion (autoDelete) attribute of network interface can be specified to indicate that if the network interface is deleted automatically when deleting an instance</br>        \- The security group (securityGroup) needs to be within the same Virtual Private Cloud (VPC) as the Subnet</br>        \- A security group A security group must be specified when creating a pod and at most 5 security groups can be specified</br>        \- Set primary network interface deviceIndex as 1</br>- Store</br>    \- volume is divided into root volume and data volume; the attaching directory of root volume is /, while the attaching directory of data volume can be specified at will</br>    \- volume's underlayer storage media currently only supports cloud category, i.e. Cloud Disk Service</br>    \- root volume</br>        \- root volume can only be cloud category</br>        \- ssd, premium-hddCloud can be selected as Disk Service type</br>        \- Disk size</br>            \- ssd: range [10,100]GB; step size is 10G</br>            \- premium-hdd: range [10,100]GB; step size is 10G</br>        \- Automatic deletion</br>            \- Delete automatically by default</br>        \- Existing Cloud Disk Service can be selected</br>    \- data volume</br>        \- data volume currently can select cloud category only</br>        \- ssd, premium-hdd can be selected as Cloud Disk Service type </br>        \- Disk size</br>            \- ssd: range [20,1000]GB; step size is 10G</br>            \- premium-hdd: range [20,3000]GB; step size is 10G</br>        \- Automatic deletion</br>            \- Delete automatically by default</br>        \- Existing Cloud Disk Service can be selected</br>        \- Disk can be created from the Snapshot</br>- pod container log</br>    \- default: A 10MB bucket will be distributed to the local by default and is automatically rotated</br>- Others</br>    \- After being created, the pod is in running status</br>    \- maxCount refers to the maximum effort and the maxCount is not guaranteed</br>|
|**createSecret**|POST|Create a secret for storing relevant confidential information of image registry. </br>|
|**decribeContainer**|GET|Obtain details of a container in pod|
|**deletePod**|DELETE|The pod must be in status of stopped, running or error. <br></br>The instance paid by volume will keep running until it is deleted. The instance not used anymore can be passively stopped through this interface. <br></br>Only the instance with the type of billing by volume can be passively deleted. The pod with monthly package expired can also be deleted. Please report to the ticket system for other situations. The container with billing status exception can’t be deleted. </br>|
|**deleteSecret**|DELETE|Delete a single secret</br>|
|**describePod**|GET|Search detailed information of one pod</br>|
|**describePods**|GET|Search detailed information of pod in batches<br></br>This interface supports query in pages, with 20 entries per page by default. </br>|
|**describeQuota**|GET|Search resource quota and support native container pod and secret.</br>|
|**describeSecret**|GET|Search details of a single secrete</br>|
|**describeSecrets**|GET|Search secret lists. <br> </br>This interface supports searching in pages, with 20 entries per page by default. </br>|
|**disassociateElasticIp**|POST|The EIP disassociated with the pod is the elastic IP corresponding to the primary network interface and primary private IP.</br>|
|**execCreate**|POST|Create exec</br>|
|**execGetExitCode**|GET|Obtain exec exit code|
|**execStart**|GET|Execute exec. This interface requires upgrading Http protocol to WebSocket|
|**getContainerLogs**|GET|Search the log of a single container</br>|
|**modifyPodAttribute**|PATCH|Modify name and description of pod. </br>|
|**resizeTTY**|POST|Set size of TTY|
|**startPod**|POST|Start a single pod in the off status and the pod involved a job can’t be started. <br></br>pod When container instance or a cloud disk associated is defaulting, the container will not be normally started. <br></br>|
|**stopPod**|POST|Stop a single instance in the operating status and the pod involved in a job can’t be started. </br>|
