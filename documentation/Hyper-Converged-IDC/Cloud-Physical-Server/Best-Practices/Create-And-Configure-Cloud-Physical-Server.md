# Create and Configure Cloud Physical Server

## Create Cloud Physical Server

1. Click the “Buy Now” button on the product page in JD Cloud official website, and jump to the console page of Cloud Physical Server. (Under the condition of real-name verified)

2. Select the region and availability zone, click the “Create” button, and jump to the creation page.

![Creation Page](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS011.png)

## Configure Cloud Physical Server

**1. Configure Region and Availability Zone.**

![Configure Region and Availability Zone](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS012.png)

**2. Configure Machine Specification.**
Refer to [product specification](../Introduction/Specification.md).

![Machine Specification](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS013.png)

**3. Select Image.**

For example, two image types, i.e. “standard image” and “standard image+application”, are supported currently.
Wherein, “standard image” supports CentOS7.2 and 6.6, Ubuntu supports 16.04 and 14.04; “standard image+application” supports Nginx, MySQL and RabbitMQ applications under CentOS7.2 and CentOS6.6.

![Select Image](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS014.png)

**4. Configure Storage.**

Select RAID mode of system disk and data disk.
(Note: The RAID mode of system disk or data disk of some models is fixed, please select based on actual situation.)

![Configure Storage](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS015.png)

**5. Configure Network**

Intranet interface and public network interface are 10-gigabit network interfaces. The bottom data network of JD Cloud data center is 10-gigabit level, to ensure the communication quality of intranet. JD Cloud provides high-quality BGP network, and top-speed bandwidth experience. User may adjust the bandwidth of EIP.

**Public Network**: The machine must and can only be associated to one EIP. EIP is automatically allocated by system. User cannot modify EIP. EIP address is not shown during creation. EIP address is shown in the list page and details after creation. The public network is 1-200Mbps. See detailed action steps in the section of [Adjusting Bandwidth Of Public Network](../Operation-Guide/Adjust-Public-Network-Bandwidth/Description.md).

**Intranet**: Under the basic network mode, user can only select intranet CIDR address segment when configuring the first network. Cloud Physical Server created later will use the first configured intranet CIDR address segment.

**Firewall**: After the operating system is installed, only Port 22 at IN direction is open for the system to extranet. After the operating system is installed successfully, user may log in the operating system and change iptable setting. For details, please refer to [Firewall Setting Operation Guide](../Operation-Guide/Network-And-Security/Steps.md).

![Configure Network](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS016.png)

**Public Network Bandwidth**: Under the basic network mode, user may select 1-200Mbps public network bandwidth speed. EIP is associated with Cloud Physical Server bandwidth.

![Configure Network](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS017.png)

**6. Configure Server Basic Information**:
Configure server name, description and operating system password

![Configure Server](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS018.png)

**7. Configure Purchase Duration**
The purchase duration is 1-9 months, 1, 2 and 3 years. There’s discount for long-term purchase. See details in the purchase page.

![Configure Purchase Duration](https://github.com/jdcloudcom/cn/blob/edit/image/Hyper-Converged-IDC/Cloud-Physical-Server/CPS019.png)

**8. Click the “Buy Now” button.**
Jump to the order confirmation page.

After successful payment in accordance with the unified order billing process of JD Cloud, jump back to the console list page.
