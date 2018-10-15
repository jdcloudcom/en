# JCS for Redis APIs


## Introduction
JCS for Redis Related APIs


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createCacheInstance**|POST|Create JCS for Redis Instance of the Specified Configuration</br>Specification Performance: The specifications for creating the JCS for Redis instance are divided into two versions: principal\-subordinate version and cluster version. Each specification has the maximum number of connections, the internal network bandwidth cap, CPU processing capacity, specification code and other information, please see: <a href='https://www.jdcloud.com/help/detail/411/isCatalog/1'>instance type code</a></br>Availability Zone: Available zone is a physical zone in which the infrastructure such as power and network are independent of each other in the same region. A zone contains one or more availability zones, and multiple availability zones in the same region can be connected to each other. Detailed information on the geographical availability zone can be found: <a href="https://www.jdcloud.com/help/detail/2222/isCatalog/1">Regional availability zone details</a></br>Virtual Private Cloud: referred to as VPC, which means the isolation network space with customized logic and supports for customized network segment, rout policy, etc. Specific information can be found: <a href="https://www.jdcloud.com/help/detail/1509/isCatalog/1">Virtual Private Cloud</a></br>Subnet: The subnet is the IP address block in the range of the VPC IP address, which is subnet for short. The subnet is created under the VPC. The segment in the same VPC cannot overlap and the segments of different VPCs can overlap. Specific information can be found: <a href="https://www.jdcloud.com/help/detail/1510/isCatalog/1">subnet details</a></br>|
|**deleteCacheInstance**|DELETE|Delete a single JCS for Redis instance that is paid by configuration billing or the monthly package has expired and the monthly package that has not expired cannot be deleted</br>Only in the running<b>running</b>or error<b>error</b>status can be deleted, but other status cannot be deleted</br>The user in the White List cannot delete the virtual machine that the monthly package has expired</br>|
|**describeCacheInstance**|GET|Query details of a single JCS for Redis instance|
|**describeCacheInstances**|GET|The query of JCS for Redis instance list and its instance information can be the the paging query, query the specified page number, specify the size of page and the filter conditions|
|**describeInstanceClass**|GET|Query the instance list type under a certain region|
|**describeUserQuota**|GET|Query account quota information|
|**modifyCacheInstanceAttribute**|PATCH|Modify the resource name and description of the JCS for Redis instance, at least one of the two|
|**modifyCacheInstanceClass**|POST|Changing the configuration of the JCS for Redis instance can only change the instance configuration in the running status and the specification of the changed configuration cannot be the same as the previous one</br>Pay\-in\-advance users, from the cluster version to the principal/subordinate version, the memory size of the new specification is larger than the old size of the memory size, from the principal/subordinate version to the cluster version, the memory size of the new specification is no less than the memory size of the old specification</br>|
|**resetCacheInstancePassword**|POST|Reset the password of the JCS for Redis instance to support the password\-free operation|
