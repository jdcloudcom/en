## Configure Cloud Physical Server

- Configure Region and Availability Zone

! [Configuration of Region and Availability Zone] (https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS012.png)

- Configure Machine Specification
Refer to [product specification](../Introduction/Specifications.md).

- Select Image

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;For example, two image types, i.e. "standard image" and "standard image+application", are supported currently.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;wherein, "standards image" supports CentOS6.6, 7.1, 7.2 and 7.5, Ubuntu supports 14.04 and 16.04; "standard image+application" supports Nginx, MySQL and RabbitMQ applications under CentOS6.6 and CentOS7.2. For details, please refer to [Image Use Instructions] (../Operation-Guide/Image/Description-Image.md).

! [Image Selection] (https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS014.png)

- Configure Storage

Select RAID mode of system disk and data disk.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (Note: The RAID mode of system disk or data disk of some models is fixed, please select based on actual situation. For details, please refer to [Product Specifications] (../Introduction/Specifications.md).)

! [Configuration Storage] (https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS015.png)

- Configure Network

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Intranet**: Under the basic network mode, user can only select intranet CIDR address segment when configuring the first network. Cloud Physical Server created later will use the first configured intranet CIDR address segment.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Firewall** : After the operating system is installed, only Port 22 at IN direction is open for the system to extranet. After the operating system is installed successfully, user may log in the operating system and change iptable setting. For details, please refer to [Firewall Setting Operation Guide](../Operation-Guide/Network-And-Security/Steps-Network-And-Security.md).

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Public Network Bandwidth**: Under the basic network mode, user may select 1-200Mbps public network bandwidth speed. EIP is associated with Cloud Physical Server bandwidth.

- Configure Server Basic Information
Configure server name, description and operating system password.

! [Configuration Server] (https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS018.png)

- Configure Purchase Duration
The purchase duration is 1-9 months, 1, 2 and 3 years.

! [Configuration of Purchase Duration] (https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS019.png)

- Click the “Buy Now” button. Jump to the order confirmation page

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;After successful payment in accordance with the unified order billing process of JD Cloud, jump back to the console list page.
