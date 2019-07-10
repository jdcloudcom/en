# Cloud Physical Server


## Introduction
Cloud Physical Server


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**applyElasticIps**|PUT|Apply for elastic IP<br>|
|**associateElasticIp**|PUT|Associate elastic IP<br>|
|**createInstances**|PUT|Create one or more configured Cloud Physical Server<br/><br>- Region and Availability Zone<br/><br>  \- Call API (describeRegiones) to get Region and Availability Zone supported by Cloud Physical Server<br/><br>- Instance Type Family<br/><br>  \- Call API (describeDeviceTypes) to get physical Instance Type Family list <br/><br>  \- Cannot use Instance Type Family that has been offline or sold out<br/><br>- Operating System<br/><br>  \- Call API (describeOS) to get OS list supported by Cloud Physical Server<br/><br>- Storage<br/><br>  \- Data disk with multiple optional RAIDs, call API (describeDeviceRaids) to get RAID list supported by server<br/><br>- Network<br/><br>  \- Network type supports basic and vpc currently<br/><br>  \- ISP Line only supports bgp currently<br/><br>  \- Disabling Internet is supported; if enabling Internet, the bandwidth range is [1,200] Unit Mbps<br/><br>- Others<br/><br>  \- Purchase Duration, which can be purchased by yearly or monthly package: monthly package value range [1,9], yearly package value range [1,3]<br/><br>  \- See public parameter specifications for password settings<br/><br>|
|**createSubnet**|PUT|Create subnet|
|**createVpc**|PUT|Create VPC|
|**deleteSubnet**|DELETE|Delete subnet|
|**deleteVpc**|DELETE|Delete VPC<br>|
|**describeBasicSubnet**|GET|Search underlying network Subnet|
|**describeDeviceRaids**|GET|Query the RAID types supported by the Cloud Physical Server of a certain instance type family, may query the system disk RAID type and data disk RAID type|
|**describeDeviceTypes**|GET|Query the instance type family of Cloud Physical Server|
|**describeElasticIp**|GET|Search elastic IP detail|
|**describeElasticIps**|GET|Search elastic IP list<br/><br>Support paging search, with 20 entries per page by default<br/><br>|
|**describeInstance**|GET|Query the details of a single Cloud Physical Server|
|**describeInstanceName**|GET|Query the name of Cloud Physical Server|
|**describeInstanceRaid**|GET|Query the installed RAID information of a single Cloud Physical Server, including the system disk RAID information and data disk RAID information|
|**describeInstanceStatus**|GET|Query the hardware monitoring information of a single Cloud Physical Server|
|**describeInstances**|GET|Search Cloud Physical Server detail information in batches<br/><br>Support paging search, with 20 entries per page by default<br/><br>|
|**describeOS**|GET|Query the Operating Systems Supported by the Cloud Physical Server|
|**describeRegiones**|GET|Cloud Physical Server Region List Query|
|**describeSubnet**|GET|Search Subnet detail|
|**describeSubnets**|GET|Query subnet list|
|**describeVpc**|GET|Search VPC detail|
|**describeVpcs**|GET|Query virtual private cloud list|
|**disassociateElasticIp**|PUT|Disassociate elastic IP<br>|
|**modifyBandwidth**|PUT|When upgrading Internet bandwidth of Cloud Physical Servers, only servers with running or stopped status can be operated<br/><br>- Servers without enabling Internet are not supported to upgrade bandwidth<br>- Degrade for Internet bandwidth is not supported<br>|
|**modifyElasticIpBandwidth**|PUT|Modify elastic IP bandwidth<br>|
|**modifyInstance**|POST|Modify some information of Cloud Physical Server, including name, description|
|**modifySubnet**|POST|Modify subnet|
|**modifyVpc**|POST|Modify VPC<br>|
|**reinstallInstance**|PUT|When reinstalling Cloud Physical Servers, only servers with stopped status can be reinstalled<br/></br>- Call API (describeOS) to get OS list supported by Cloud Physical Servers</br>|
|**restartInstance**|PUT|Reboot single Cloud Physical Server, only servers with running status can be rebooted|
|**startInstance**|PUT|Start single Cloud Physical Server, only servers with stopped status can be started|
|**stopInstance**|PUT|Shutdown single Cloud Physical Server, only servers with running status can be stopped|
