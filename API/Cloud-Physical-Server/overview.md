# Cloud Physical Server


## Introduction
Cloud Physical Server


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**addServers**|PUT|Add backend server|
|**applyElasticIps**|PUT|Apply for elastic IP<br>|
|**associateElasticIp**|PUT|Associate elastic IP<br>|
|**associateElasticIpLB**|PUT|Associate the EIP|
|**createInstances**|PUT|Create one or more configured Cloud Physical Server<br/><br>- Region and Availability Zone<br/><br>  \- Call API (describeRegiones) to get Region and Availability Zone supported by Cloud Physical Server<br/><br>- Instance Type Family<br/><br>  \- Call API (describeDeviceTypes) to get physical Instance Type Family list <br/><br>  \- Cannot use Instance Type Family that has been offline or sold out<br/><br>- Operating System<br/><br>  \- Call API (describeOS) to get OS list supported by Cloud Physical Server<br/><br>- Storage<br/><br>  \- Data disk with multiple optional RAIDs, call API (describeDeviceRaids) to get RAID list supported by server<br/><br>- Network<br/><br>  \- Network type supports basic and vpc currently<br/><br>  \- ISP Line only supports bgp currently<br/><br>  \- Disabling Internet is supported; if enabling Internet, the bandwidth range is [1,200] Unit Mbps<br/><br>- Others<br/><br>  \- Purchase Duration, which can be purchased by yearly or monthly package: monthly package value range [1,9], yearly package value range [1,3]<br/><br>  \- See public parameter specifications for password settings<br/><br>|
|**createKeypairs**|PUT|Create key pair|
|**createListener**|PUT|Create a listener|
|**createLoadBalancer**|PUT|Create a Load Balancer instance|
|**createServerGroup**|PUT|Create virtual server group|
|**createSubnet**|PUT|Create subnet|
|**createVpc**|PUT|Create VPC|
|**deleteKeypairs**|DELETE|Delete key pair|
|**deleteListener**|DELETE|Delete the listener|
|**deleteServerGroup**|DELETE|Delete virtual server group|
|**deleteSubnet**|DELETE|Delete subnet|
|**deleteVpc**|DELETE|Delete VPC<br>|
|**describeBasicSubnet**|GET|Search underlying network Subnet|
|**describeDeviceRaids**|GET|Query the RAID types supported by the Cloud Physical Server of a certain instance type family, may query the system disk RAID type and data disk RAID type|
|**describeDeviceTypes**|GET|Query the instance type family of Cloud Physical Server|
|**describeElasticIp**|GET|Search elastic IP detail|
|**describeElasticIps**|GET|Search elastic IP list<br/><br>Support paging search, with 20 entries per page by default<br/><br>|
|**describeInstance**|GET|Query the details of a single Cloud Physical Server|
|**describeInstanceMonitorInfo**|GET|Search Cloud Physical Server monitoring information|
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
|**disassociateElasticIpLB**|PUT|Disassociate the EIP|
|**importKeypairs**|PUT|Import key pair|
|**modifyBandwidth**|PUT|When upgrading Internet bandwidth of Cloud Physical Servers, only servers with running or stopped status can be operated<br/><br>- Servers without enabling Internet are not supported to upgrade bandwidth<br>- Degrade for Internet bandwidth is not supported<br>|
|**modifyElasticIpBandwidth**|PUT|Modify elastic IP bandwidth<br>|
|**modifyInstance**|POST|Modify some information of Cloud Physical Server, including name, description|
|**modifyListener**|POST|Modify listener|
|**modifyLoadBalancer**|POST|Modify Load Balancer instance|
|**modifyServer**|POST|Modify backend server|
|**modifyServerGroup**|POST|Modify virtual server group|
|**modifySubnet**|POST|Modify subnet|
|**modifyVpc**|POST|Modify VPC<br>|
|**queryCPSLBRegions**|GET|Search Load Balancer region list|
|**queryKeypair**|GET|Search key pair details|
|**queryKeypairs**|GET|Search key pair list|
|**queryListener**|GET|Search listener details|
|**queryListeners**|GET|Search Listener|
|**queryLoadBalancer**|GET|Search Load Balancer instance details|
|**queryLoadBalancers**|GET|Search Load Balancer instance list|
|**queryRouteTable**|GET|Search route table details|
|**queryRouteTables**|GET|Query route table list|
|**queryServerGroup**|GET|Search Virtual Server Group|
|**queryServerGroups**|GET|Search Virtual Server Group list|
|**queryServers**|GET|Search backend server list|
|**reinstallInstance**|PUT|When reinstalling Cloud Physical Servers, only servers in the stopped status can be reinstalled<br/><br>- Call API (describeOS) to get OS list supported by Cloud Physical Servers<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>|
|**removeServer**|DELETE|Remove backend server|
|**resetPassword**|PUT|Reset Cloud Physical Server password<br>|
|**restartInstance**|PUT|Reboot a single Cloud Physical Server, and only servers in the running status can be rebooted<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>|
|**startInstance**|PUT|Start single Cloud Physical Server, only servers with stopped status can be started|
|**startListener**|PUT|Enable listener|
|**startLoadBalancer**|PUT|Enable Load Balancer instance|
|**stopInstance**|PUT|Shut down a single Cloud Physical Server and only servers in the running status can be stopped<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>|
|**stopListener**|PUT|Disable listener|
|**stopLoadBalancer**|PUT|Disable Load Balancer Instance|
