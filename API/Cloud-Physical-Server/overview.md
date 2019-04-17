# Cloud Physical Server


## Introduction
Cloud Physical Server


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createInstances**|PUT|Create one or multiple Cloud Physical Server(s) with designated configuration<br/></br>- Region and Availability Zone<br/></br> \- Call interface (describeRegiones) to get Region and Availability Zone supported by Cloud Physical Servers- Instance type<br/></br> \- Call interface (describeDeviceTypes) to get physical instance type list<br/></br> \- offline or sold out instance type cannot be used<br/></br>- Operating software and pre-installed software<br/></br> \- Call interface (describeOS) to get the list of operating systems supported by Cloud Physical Servers- Storage<br/></br> \- Multiple types of RAID for data disk are available, call interface (describeDeviceRaids) to get list of RAID supported by servers<br/></br>- Network<br/></br> \- Network type only supports basic at present<br/></br> \- ISP line
 only supports bgp<br/></br> \- Support to disable Internet, if Internet is enabled, the bandwidth rang is [1,200] with unit of Mbps<br/></br>- Other<br/></br> \- Purchase duration, purchase can be under monthly package: month value range[1,9], year value range [1,3]<br/></br> \- Refer to the common parameter specification for password settings<br/></br>|
|**describeDeviceRaids**|GET|Query the RAID types supported by the Cloud Physical Server of a certain instance type family, may query the system disk RAID type and data disk RAID type|
|**describeDeviceTypes**|GET|Query the instance type family of Cloud Physical Server|
|**describeInstance**|GET|Query the details of a single Cloud Physical Server|
|**describeInstanceName**|GET|Query the name of Cloud Physical Server|
|**describeInstanceRaid**|GET|Query the installed RAID information of a single Cloud Physical Server, including the system disk RAID information and data disk RAID information|
|**describeInstanceStatus**|GET|Query the hardware monitoring information of a single Cloud Physical Server|
|**describeInstances**|GET|Batch query the details of Cloud Physical Server<br/></br>Support query in pages, with 10 entries per page by default<br/></br>|
|**describeOS**|GET|Query the Operating Systems Supported by the Cloud Physical Server|
|**describeRegiones**|GET|Cloud Physical Server Region List Query|
|**describeSubnet**|GET|Query Subnet |
|**modifyBandwidth**|PUT|When upgrading Internet bandwidth of Cloud Physical Servers, only servers with running or stopped status can be operated<br/></br>- Bandwidth upgrade is unavailable to servers without enabling Internet</br>- degradation is not supported to Internet bandwidth</br>|
|**modifyInstance**|POST|Modify some information of Cloud Physical Server, including name, description|
|**reinstallInstance**|PUT|Only servers with stopped status can be re-installed when re-installing Cloud Physical Server</br></br>- Call interface (describeOS) to get list of operating systems supported by Cloud Physical Server</br>|
|**restartInstance**|PUT|To reboot a single Cloud Physical Server, only the running servers can be rebooted|
|**startInstance**|PUT|To execute the startup operation to a single Cloud Physical Server, only the stopped server can be started|
|**stopInstance**|PUT|To execute the shutdown operation to a single Cloud Physical Server, only the running server can be stopped|
