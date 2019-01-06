## Configure Cloud Physical Server

- Configure Region and Availability Zone

![Configuration of Region and Availability Zone](https://github.com/jdcloudcom/en/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/en-Create-1RegionAZ.png)

- Configure Machine Specification
Refer to [product specification](../Introduction/Specifications.md).

- Select Image

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;For example, two image types, i.e. "standard image" and "standard image+application", are supported currently.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;wherein, "standards image" supports CentOS6.6, 7.1, 7.2 and 7.5, Ubuntu supports 14.04 and 16.04; "standard image+application" supports Nginx, MySQL and RabbitMQ applications under CentOS6.6 and CentOS7.2. For details, please refer to [Image Use Instructions](../Operation-Guide/Image/Description-Image.md).

![Image Selection](https://github.com/jdcloudcom/en/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/en-Create-3Image.png)

- Configure Storage

Select RAID mode of system disk and data disk.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (Note: The RAID mode of system disk or data disk of some models is fixed, please select based on actual situation. For details, please refer to [Product Specifications](../Introduction/Specifications.md).)

![Configuration Storage](https://github.com/jdcloudcom/en/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/en-Create-4Storage.png)

- Configure Network

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Intranet**: Under the basic network mode, user can only select intranet CIDR address segment when configuring the first network. Cloud Physical Server created later will use the first configured intranet CIDR address segment.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Firewall** : After the operating system is installed, only Port 22 at IN direction is open for the system to extranet. After the operating system is installed successfully, user may log in the operating system and change iptable setting. For details, please refer to [Firewall Setting Operation Guide](../Operation-Guide/Network-And-Security/Steps-Network-And-Security.md).

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Public Network Bandwidth**: Under the basic network mode, user may select 1-200Mbps public network bandwidth speed. EIP is associated with Cloud Physical Server bandwidth.

When the basic network is adopted, EIP, the public network bandwidth and the Cloud Physical Server are associated with each other.

The user may purchase or not purchase the EIP when creating the Cloud Physical Server. **However, EIP cannot be added after creating the Cloud Physical Server**. EIP is automatically allocated by the system, and the user cannot modify such EIP. The user may enable the public network IPV6 at the same time or not in the regions supported by IPV6 (at present, the public network IPV6 is supported by the Suqian region only).

The user may select the 1-200Mbps public network bandwidth rate and make the configuration upgrade upon creation.
For specific operation steps, please refer to the section [Public Network Bandwidth Adjustment](../Operation-Guide/Adjust-Public-Network-Bandwidth/Description-Adjust-Public-Network-Bandwidth.md).

- Configure Server Basic Information:
Configure server name, description and operating system password.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Instance Name**: The instance name is the alias of the Cloud Physical Server and it can be defined and set by the user. Upon the setting, the screening can be implemented by using the alias from the list of the Cloud Physical Server. Where several Cloud Physical Servers are purchased at one time, numbers in increasing order will be put after the set name of each Cloud Physical Server by default to indicate the Cloud Physical Servers.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Machine Name**: The machine name is the computer name within the operating system of the Cloud Physical Server and it can be defined and set by the user. Upon the production of the Cloud Physical Server, you can view the name by logging into the Cloud Physical Server. Where several Cloud Physical Servers are purchased at one time, numbers in increasing order will be put after the set name of each Cloud Physical Server by default to indicate the Cloud Physical Servers.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; The machine name is optional. If you do not enter the machine name, it will use "host- Private IPv4 address Section 3-intranet-Private IPv4 address Section 4" by default as the machine name.

![Configuration Server](https://github.com/jdcloudcom/en/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/en-Create-7BasicInformation.png)


- Configure Purchase Duration
The purchase duration is 1-9 months, 1, 2 and 3 years.

![Configuration of Purchase Duration](https://github.com/jdcloudcom/en/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/en-Create-8Quantity.png)

- Click the **Buy Now** button. Jump to the order confirmation page

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;After successful payment in accordance with the unified order billing process of JD Cloud, jump back to the console list page.
