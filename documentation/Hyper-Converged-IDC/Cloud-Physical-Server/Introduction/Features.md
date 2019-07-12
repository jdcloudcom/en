# Features

JD Cloud Physical Server mainly provides the following functions, and for more functions, please visit JD Cloud console for experience:

- **Multiple regions and multiple availability zones:**
It covers four regions of cn-north-1 (Availability Zones A, B and C are open), cn-east-1 (Availability Zone A is open), cn-south-1 (In Preparation) and cn-east-2 (In Preparation), to meet user’s needs of specific application scenarios. To achieve less access delay, you may select the region and availability zone close to where you are located to deploy.
- **Multiple instance types:**
Provide three instance types, including the computing type, the memory type and the GPU type. Now, different specifications and specific specifications are launched to meet different business scenarios of the user. For details, please refer to [Product Specifications](../Introduction/Specifications.md). More instance types are in preparation.
- **Flexible billing method:**
Monthly package billing method is support, and users may purchase based on demands to save the costs. For billing details, please refer to "[Billing Rules](../Pricing/Billing-Rules.md)".
- **Rich image resources:**
Support CentOS (6.6, 7.1, 7.2 and 7.5) and Ubuntu (18.04, 16.04 and 14.04), as well as multiple common application software installation. For details of image system, please refer to [Image Support System](../Operation-Guide/Image/Description-Image.md).
- **3 disk types:**
Three types of disks, i.e. SAS, SATA and SSD, are reasonably combined and integrated in the Cloud Physical Server to provide users with high-speed and reliable storage space.
- **Provide three modes, i.e. NO RAID, RAID0 and RAID1**
Computing and storage system disks are both RAID1 mode. The computing data disk provides three modes, i.e. NO RAID, RAID0 and RAID1, while the storage data disk is in NO RAID mode. For details of corresponding machine models supporting RAID modes, please refer to [Product Specifications](../Introduction/Specifications.md).
- **Two types of IP addresses:**
Support public IP and private IP, intranet interconnection is achievable, and Internet is accessible.
- **High-speed network access:**
Intranet interface and public network interface are 10-gigabit network interfaces. The bottom data network of JD Cloud data center is 10-gigabit level, to ensure the communication quality of intranet. JD Cloud provides high-quality BGP network, and top-speed bandwidth experience. User may adjust the bandwidth of EIP.
- **Firewall setting:**
Set customized instance network access control via iptables firewall to configure different identity and access management rules for different instances. For firewall action steps, please refer to [Firewall Setting Steps](../Operation-Guide/Network-And-Security/Steps-Network-And-Security.md).
- **Isolated network architecture:**
The high-speed network devices of JD Cloud data center are relied on to achieve the intranet interconnection, and provide a high-quality, high-speed, and low-delay intranet environment. The intranet of users is isolated from each other, being secure and reliable.</br>
It supports self-planned network deployment, including preset/non-preset network range (CIDR), subnet segment and intranet CIDR segment that users can choose depending on their preference.</br>
The double upper-link network adopts the bond redundancy policy of IEEE 802.3ad dynamic link aggregation mode, and supports network interface redundancy disaster recovery to guarantee the high availability of network.</br>
Elastic IP can be independently applied for, and the public network bandwidth can be dynamically expanded to a maximum of 200Mbps, supporting association and disassociation.</br>
- **Quick batch deployment:**
Automatically deploy the operating system when creating the Cloud Physical Server, and allow users to reinstall the operating system.
- **All-round security protection service:**
Provide free DDoS infrastructure service.
- **Free Out-of-band Monitoring Function:**
Multiple-dimension monitoring to master instance running status in real time and provide in-place status monitoring for CPU, memory, disk and network interface.


