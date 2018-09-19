# Cloud Physical Server


## Introduction
Cloud Physical Server APIs


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createInstances**|PUT|Create one or more Cloud Physical Servers with specified configuration<br/></br>\- Region and Availability Zone<br/></br>  \- The region and availability zone supported by the Cloud Physical Servers can be obtained by calling APIs (describeRegions)<br/></br>\- Instance Type Family<br/></br>  \- The physical instance type family list can be obtained by calling APIs<br/></br>  \- Instance type family which is off line or sold out is not available for use<br/></br>\- Operating System and Pre\-installed Software<br/></br>  \- The operating system list supported by the Cloud Physical Server can be obtained by calling APIs (describeOS)<br/></br>  \- The APIs (describeSoftware) may be called to obtain the software list supported by the Cloud Physical Server, or the software may not be pre\-installed<br/></br>\- Storage<br/></br>  \- Multiple RAIDs are available for the data disk and the RAID list supported by the server can be obtained by calling APIs (describeDeviceRaids)<br/></br>\- Network<br/></br>  \- Network type currently only supports basic<br/></br>  \-ISP Line only supports bgp currently<br/></br>  \- Disabled Internet is supported. If the Internet is enabled, the bandwidth range is [1,200], in unit Mbps<br/></br>\- Miscellaneous<br/></br>  \- Purchase duration, the annual purchase or monthly purchase is available, with the minimum purchase duration of 1 month and the maximum purchase duration of 36 months (3 years)<br/></br>  \- Refer to the Public Parameter Specification for password setting<br/></br>|
|**describeDeviceRaids**|GET|Query the RAID Types Supported by the Cloud Physical Server of a Certain Instance Type Family, May Query the System Disk RAID Type and Data Disk RAID Type|
|**describeDeviceTypes**|GET|Query the Instance Type Family of Cloud Physical Server|
|**describeInstance**|GET|Query the Details of a Single Cloud Physical Server|
|**describeInstanceName**|GET|Query the Name of Cloud Physical Server|
|**describeInstanceRaid**|GET|Query the Installed RAID Information of a Single Cloud Physical Server, Including the System Disk RAID Information and Data Disk RAID Information|
|**describeInstanceStatus**|GET|Query the Hardware Monitoring Information of a Single Cloud Physical Server|
|**describeInstances**|GET|Batch query the details of Cloud Physical Server<br/></br>Support query in pages, with 10 entries per page by default<br/></br>|
|**describeOS**|GET|Query the Operating Systems Supported by the Cloud Physical Server|
|**describeRegiones**|GET|Cloud Physical Server Region List Query|
|**describeSoftware**|GET|Query the Software List That Can Be Pre\-Installed on the Physical Server<br/></br>The APIs (describeOS) may be called to obtain the operating system list supported by the Cloud Physical Server, and acquire the software list that supports to be pre\-installed by different operating system types<br/></br>|
|**describeSubnet**|GET|Query Subnet |
|**modifyBandwidth**|PUT|To upgrade the Internet bandwidth of Cloud Physical Server, only the running or stopped servers can be operated<br/></br>\- Not support the bandwidth upgrade of the servers not enabling the Internet</br>\- Internet bandwidth does not support degrade</br>|
|**modifyInstance**|POST|Modify Par of the Information of Cloud Physical Server, Including Name, Description|
|**reinstallInstance**|PUT|To reinstall the Cloud Physical Server, only the stopped servers can be reinstalled<br/></br>\- The APIs (describeOS) may be called to obtain the operating system list supported by the Cloud Physical Server</br>\- The APIs (describeSoftware) may be called to obtain the software list supported by the Cloud Physical Server, or the software may not be pre\-installed</br>|
|**restartInstance**|PUT|To reboot a Single Cloud Physical Server, Only the Running Servers Can Be Rebooted|
|**startInstance**|PUT|To Execute the Startup Operation to a Single Cloud Physical Servers, Only the Stopped Server Can Be Started Up|
|**stopInstance**|PUT|To Execute the Shutdown Operation to a Single Cloud Physical Servers, Only the Running Server Can Be Stopped|
