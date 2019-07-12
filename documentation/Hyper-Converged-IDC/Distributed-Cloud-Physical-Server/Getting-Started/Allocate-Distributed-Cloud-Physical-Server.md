## Configure Distributed Cloud Physical Server

- Configure Node and Operator

![配置地域与可用区](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-003.png)

- Configure Machine Specifications:
Refer to [Specifications](../Introduction/Specifications.md).

- Select Image

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; e.g. the image type of "standard image" is supported currently.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; in which, the "standard image" supports CentOS6.6, 7.1, 7.2 and 7.5, Ubuntu14.04, 16.04 and 18.04. For details, please refer to [Image Use Instructions](../Operation-Guide/Image/Description-Image.md).

![镜像选择](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-028.png)

- Configure Storage:

Select RAID mode of system disk and data disk.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (Description: RAID modes of system disk or data disk of some categories are fixed, please select based on actual situation. For details, refer to [Specifications](../Introduction/Specifications.md).)

![配置存储](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-029.png)

- Configure Network

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Intranet** : Users can only select intranet CIDR address segment when configuring the network for the first network. The Distributed Cloud Physical Server created later will use the first configured intranet CIDR address segment.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Firewall** : After the operating system is installed, the system will open only Port 22 at IN direction to Internet. After the operating system is installed successfully, user may log in the operating system and change iptable setting. For details, please refer to [Operation Guide for Firewall Settings](../Operation-Guide/Network-And-Security/Steps-Network-And-Security.md).

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Public Network Bandwidth** :

Elastic IP can be associated with Distributed Cloud Physical Server.

Users may purchase or not purchase the Elastic IP when creating the Distributed Cloud Physical Server. When the Elastic IP is selected in the purchase, it will be automatically allocated by the system, and the user cannot modify this Elastic IP.

The user may select the 1-200Mbps public network bandwidth rate and make the configuration upgrade upon creation.
For specific operation steps, please refer to the section of [Modify Public Network Bandwidth](../Operation-Guide/Adjust-Public-Network-Bandwidth/Description-Adjust-Public-Network-Bandwidth.md).

- Configure Server Basic Information:
Configure server name, description and operating system password

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Instance Name** : The instance name is the alias of the Distributed Cloud Physical Server and the user can achieve customized setting. Upon the setting, the screening can be implemented by using the alias from the list of the Distributed Cloud Physical Server. Where several Distributed Cloud Physical Servers are purchased at one time, numbers in increasing order will be put after the set name of each Distributed Cloud Physical Server by default to indicate the Distributed Cloud Physical Servers.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Machine Name** : The machine name is the computer name within the operating system of the Distributed Cloud Physical Server and the user can achieve customized setting. Upon the production of the Distributed Cloud Physical Server, you can view the name by logging into the Distributed Cloud Physical Server. Where several Distributed Cloud Physical Servers are purchased at one time, numbers in increasing order will be put after the set name of each Distributed Cloud Physical Server by default to indicate the Distributed Cloud Physical Servers.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; The machine name is optional. If you do not enter the machine name, it will use "host- Private IPv4 address Section 3-intranet-Private IPv4 address Section 4" by default as the machine name.

![配置服务器](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-030.png)


- Configure Purchase Duration:
The purchase duration is 1-9 months, 1, 2 and 3 years.

![配置购买时长](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-031.png)

- Click **Buy Now** to redirect to the Order Confirmation page

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; After successful payment in accordance with the unified order billing process of JD Cloud, redirect to the Console List page.
