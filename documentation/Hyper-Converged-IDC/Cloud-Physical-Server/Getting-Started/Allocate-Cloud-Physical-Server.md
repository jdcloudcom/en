## Configure Cloud Physical Server

- Configure Region and Availability Zone

![Configuration of Region and Availability Zone](https://github.com/jdcloudcom/en/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/en-Create-1RegionAZ.png)

- Configure Machine Specification
Refer to [product specification](../Introduction/Specifications.md).

- Select Image

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;For example, two image types, i.e. "standard image" is supported currently.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The "Standard Image" supports CentOS6.6, 7.1, 7.2 and 7.5, Ubuntu14.04, 16.04 and 18.04 as well as Windows Server 2016 Standard 64-bit Chinese Edition. For details, please refer to [Operation Guide of Image](../Operation-Guide/Image/Description-Image.md).

![镜像选择](../Image/CPS-create-image.png)


- Configure Storage

Select RAID mode of system disk and data disk.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (Note: The RAID mode of system disk or data disk of some models is fixed, please select based on actual situation. For details, please refer to [Product Specifications](../Introduction/Specifications.md).)

![Configuration Storage](https://github.com/jdcloudcom/en/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/en-Create-4Storage.png)

- Configure Network

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Intranet**: Under the basic network mode, user can only select intranet CIDR address segment when configuring the first network. Cloud Physical Server created later will use the first configured intranet CIDR address segment.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Firewall** : After the operating system is installed, only Port 22 at IN direction is open for the system to extranet. After the operating system is installed successfully, user may log in the operating system and change iptable setting. For details, please refer to [Firewall Setting Operation Guide](../Operation-Guide/Network-And-Security/Steps-Network-And-Security.md).

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Public Network Bandwidth**: Under the basic network mode, user may select 1-200Mbps public network bandwidth speed. EIP is associated with Cloud Physical Server bandwidth.

The user may purchase or not purchase the public IP when creating the Cloud Physical Server. When a basic network instance is purchased, the public IP and the Cloud Physical Server are associated with each other. Public IP is automatically allocated by the system, and users cannot modify such public IP, **and they cannot add public IP after the Cloud Physical Server is created**. When a VPC instance is purchased, if users cannot afford a public IP, they can associate it with the public IP after the instance is created.

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
