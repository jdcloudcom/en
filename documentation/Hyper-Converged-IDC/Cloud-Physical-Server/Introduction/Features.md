# Features

JD Cloud Physical Server mainly provides the following functions, and for more functions, please visit JD Cloud console for experience:

- **Multiple regions and multiple availability zones:**
It covers four regions of cn-north-1 (Availability Zone B and In Preparation A and C), cn-east-1 (Open), cn-south-1 (In Preparation)and cn-east-2 (In Preparation), to meet user’s needs of specific application scenarios. To achieve less access delay, you may select the region and availability zone close to where you are located to deploy.
- **Multiple instance types:**
Provide three instance types, including the computing type, the memory type and the GPU type. Now, different specifications and specific specifications are launched to meet different business scenarios of the user. For details, please refer to [Product Specifications] (../Introduction/Specifications.md). More instance types are in preparation.
- **Flexible billing method:**
Monthly package billing method is support, and users may purchase based on demands to save the costs. For billing details, please refer to “[Billing Rules] (../Pricing/Billing-Overview.md)”.
- **Rich image resources:**
Support CentOS (7.2 and 6.6) and Ubuntu (16.04 and 14.04), as well as multiple common application software installation. For details of image system, please refer to [Image Support System] (../Operation-Guide/Image/Description-Image.md).
- **3 disk types:**
Three types of disks, i.e. SAS, SATA and SSD, are reasonably combined and integrated in the Cloud Physical Server to provide users with high-speed and reliable storage space.
- **Provide three modes, i.e. NO RAID, RAID0 and RAID1**
Computing and storage system disks are both RAID1 mode. The computing data disk provides three modes, i.e. NO RAID, RAID0 and RAID1, while the storage data disk is in NO RAID mode. For details of corresponding machine models supporting RAID modes, please refer to [Product Specifications] (../Introduction/Specifications.md).
- **Two types of IP addresses:**
Support public IP and private IP, intranet interconnection is achievable, and Internet is accessible.
- **High-speed network access:**
Intranet interface and public network interface are 10-gigabit network interfaces. The bottom data network of JD Cloud data center is 10-gigabit level, to ensure the communication quality of intranet. JD Cloud provides high-quality BGP network, and top-speed bandwidth experience. User may adjust the bandwidth of EIP.
- **Firewall setting:**
Set customized instance network access control via iptables firewall to configure different identity and access management rules for different instances. For firewall action steps, please refer to [Firewall Setting Steps] (../Operation-Guide/Network-And-Security/Steps-Network-And-Security.md).
- **Isolated network architecture:**
Intranets are isolated from each other between users, similar to the traditional network you build in data center, and the virtual private cloud space is completely controlled by the user, supporting customized intranet CIDR segment partitioning.
- **Quick batch deployment:**
Automatically deploy the operating system when creating the Cloud Physical Server, and allow users to reinstall the operating system.
- **All-round security protection service:**
Provide free DDoS infrastructure service.
- **Free Out-of-band Monitoring Function:**
Multiple-dimension monitoring to master instance running status in real time and provide in-place status monitoring for CPU, memory, disk and network interface.
