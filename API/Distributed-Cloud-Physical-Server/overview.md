# Distributed Cloud Physical Server


## Introduction
Distributed Cloud Physical Server APIs


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**applyElasticIps**|PUT|Apply for elastic IP<br>|
|**associateElasticIp**|PUT|Associate elastic IP<br>|
|**createAliasIp**|PUT|Add alias IP|
|**createInstances**|PUT|Create one or more Cloud Physical Servers with designed configuration<br/><br>- Region and Availability Zone <br/><br>  \- Call API (queryEdCPSRegions) to get Region and Availability Zone supported by Distributed Cloud Physical Server<br/><br>- Instance Type Family <br/><br>  \- Call API (describeDeviceTypes) to get physical Instance Type Family list<br/><br>  \- Do use Instance Type Family that has been offline or sold out<br/><br>- Operating System<br/><br>  \- Call API (describeOS) to get OS list supported by Distributed Cloud Physical Server<br/><br>- Storage<br/><br>  \- There are many RAIDs available for data disks. RAID lists supported by servers can be obtained by calling API (describeDeviceRaids)<br/><br>- Network<br/><br>  \- Network type supports vpc currently<br/><br>  \- The ISP Line now supports China Unicom (un), China Telecom (ct) and China Mobile (cm)<br/><br>  \- Disabling the Internet is supported. If the Internet is not enabled, the bandwidth range is [1,200] in unit of Mbps<br/><br>- Others<br/><br>  \- Purchase duration, can be based on year or month: monthly package value range is [1,9], year value range is [1,3]<br/><br>  \- See Public Parameter Specification for password setting<br/><br>|
|**createKeypairs**|PUT|Create key pair|
|**createSecondaryCidr**|PUT|Add secondary CIDR|
|**createSubnet**|PUT|Create subnet|
|**createVpc**|PUT|Create VPC|
|**deleteAliasIp**|DELETE|Delete alias IP|
|**deleteInstance**|DELETE|To delete a single Cloud Physical Server, only the one in running, stopped and error status can be deleted<br/><br>Do not delete servers without any billing information<br/><br>|
|**deleteKeypairs**|DELETE|Delete key pair|
|**deleteSecondaryCidr**|DELETE|Delete secondary CIDR|
|**deleteSubnet**|DELETE|Delete subnet|
|**deleteVpc**|DELETE|Delete VPC<br>|
|**deleteelasticIp**|DELETE|Delete Elastic IP<br>|
|**describeAliasIps**|GET|Search alias IP list|
|**describeAvailablePrivateIp**|GET|Search available private IP list|
|**describeDeviceRaids**|GET|Search the RAID types supported by the Distributed Cloud Physical Server of a certain instance type family, with RAID types of system disk and data disk available for search|
|**describeDeviceStock**|GET|Search inventory of Distributed Cloud Physical Server|
|**describeDeviceTypes**|GET|Search type of Distributed Cloud Physical Server Instance Type Family|
|**describeEdCPSRegions**|GET|Search region list of Distributed Cloud Physical Server|
|**describeElasticIp**|GET|Search elastic IP details|
|**describeElasticIpStock**|GET|Search Elastic IP inventory|
|**describeElasticIps**|GET|Search elastic IP list<br/><br>Support paging search, with 20 entries per page by default<br/><br>|
|**describeInstance**|GET|Search details of a single Distributed Cloud Physical Server|
|**describeInstanceName**|GET|Search name of Distributed Cloud Physical Server|
|**describeInstanceRaid**|GET|Search installed RAID information of a single Distributed Cloud Physical Server, including RAID information of system disk and data disk|
|**describeInstanceStatus**|GET|Search hardware monitoring information of a single Distributed Cloud Physical Server|
|**describeInstances**|GET|Search details of Distributed Cloud Physical Server in batches<br/><br>Support search by pages, with 20 entries per page by default<br/><br>|
|**describeKeypair**|GET|Search key pair details|
|**describeKeypairs**|GET|Search key pair list|
|**describeLineTypes**|GET|Search link type list|
|**describeOS**|GET|Search operating system supported by Distributed Cloud Physical Server|
|**describeSecondaryCidrs**|GET|Search secondary CIDR list|
|**describeSubnet**|GET|Search Subnet detail|
|**describeSubnets**|GET|Query Subnet List|
|**describeVpc**|GET|Search VPC detail|
|**describeVpcs**|GET|Search Virtual Private Cloud List|
|**disassociateElasticIp**|PUT|Disassociate elastic IP<br>|
|**importKeypairs**|PUT|Import key pair|
|**modifyElasticIpBandwidth**|PUT|modify elastic IP bandwidth<br>|
|**modifyInstance**|POST|Modify partial information of Distributed Cloud Physical Server, including name and description|
|**modifySubnet**|POST|Modify subnet|
|**modifyVpc**|POST|Modify VPC<br>|
|**reinstallInstance**|PUT|When reinstalling Distributed Cloud Physical Servers, only servers in the stopped status can be reinstalled<br/><br>- Call API (describeOS) to get OS list supported by Cloud Physical Servers<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>|
|**resetPassword**|PUT|Reset Distributed Cloud Physical Server password<br>|
|**restartInstance**|PUT|Restart a single Distributed Cloud Physical Server, and only servers in the running status can be restarted<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>|
|**startInstance**|PUT|Start a single Distributed Cloud Physical Server, only servers in the stopped status can be started|
|**stopInstance**|PUT|Shut down a single Distributed Cloud Physical Server and only servers in the running status can be stopped<br>Sensitive operation can be enabled<a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection</a>|
