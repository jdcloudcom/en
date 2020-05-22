## Confirm Configuration Item

- Billing Mode

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Two billing modes, **Monthly Package** and **Pay By Configuration** are provided. Please refer to [Billing Rules](../Pricing/Billing-Rules.md).

- Node and Operator

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; At present, the edge node **East China-Taizhou (Telecom 1)** is provided. More nodes are still under preparation. Selecting the nearest node may reduce access latency and improve download speed.

- Specification

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Two instance types, **Computing** and **Storage** are provided. You may select the configuration most suitable for your business scenario. Please refer to [Specifications](../Introduction/Specifications.md).

- Image

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; The **Standard Image** is supported currently. The image types include CentOS6.6, 7.1, 7.2 and 7.5, Ubuntu14.04, 16.04 and 18.04. Please refer to [Image Use Description](../Operation-Guide/Image/Description-Image.md).

- Storage

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; The RAID mode of **System Disk** and **Data Disk** is selected. The RAID modes of system disk or data disk of some categories are fixed, please select it based on actual situation. Please refer to [Specifications](../Introduction/Specifications.md).

- Network Interface Count and Name

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; It supports **Single Network Interface** and **Double Network Interface** modes. Single network interface corresponds to primary network interface (bond0); double network interface corresponds to primary network interface (eth0) and secondary network interface (eth1).<br/>

- Network Interface and Bandwidth Setting

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Primary Network Interface** Information:<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; VPC and Subnet: Users need to first plan and create a VPC and subnet.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Private IP: A private IP address of primary network interface is designated for users. The private IP address can be either designated from any available IP addresses of the selected subnet or automatically allocated by the system. The private IP is unchangeable when assigned to the Distributed Cloud Physical Server.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Alias IP Range: If your multiple services are running on the same Distributed Cloud Physical Server and you want to assign a different IP address for each service, you can do so using the function of alias IP range. At most 50 can be added to a single-instance primary network interface. Please refer to [Alias IP Range](../Operation-Guide/Networking/Alisas-IP.md). <br/>       

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Public Network Bandwidth: If an instance needs to access the public network, users can check the association with elastic IP (which is automatically allocated by the system and cannot be modified by users) when creating an instance or purchase it after instance creation. The elastic IP can be associated and disassociated with the instance, (which is an elastic IP of primary network interface after creation)<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Mode of Billing by Bandwidth: It supports 3 billing methods, namely by fixed bandwidth - Monthly Package, by fixed bandwidth - Pay By Configuration and Add to Shared Bandwidth. (Note: Instances billed by configuration do not support association purchase with EIPs paid by fixed bandwidth-Monthly Package).</br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ISP Line: Currently, the edge node supports single line and the launched node supports Telecom.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Bandwidth: Users can choose a public network bandwidth rate of bandwidth ranging from 1Mbps to 10000Mbps. Please reasonably select the maximum bandwidth that may vary depending on different nodes based on the actual node.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Additional Uplink Bandwidth: Users can choose a public network bandwidth rate of additional uplink bandwidth ranging from 0Mbps to 10000Mbp. Please reasonably select the maximum bandwidth that may vary depending on different nodes based on the actual node.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;EIP billing by fixed bandwidth will charge and limit speed according to the "Bandwidth" and "Additional Uplink Bandwidth" set by you. You can adjust the bandwidth cap at any time according to business demand.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Secondary Network Interface** Information:<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; VPC and Subnet: Users need to first plan and create a VPC and subnet.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Private IP: A private IP address of secondary network interface is designated for users. The private IP address can be either designated from any available IP addresses of the selected subnet or automatically allocated by the system. The private IP is unchangeable when assigned to the Distributed Cloud Physical Server.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Alias IP Range: If your multiple services are running on the same Distributed Cloud Physical Server and you want to assign a different IP address for each service, you can do so using the function of alias IP range. At most 50 can be added to a single-instance secondary network interface. Please refer to [Alias IP Range](../Operation-Guide/Networking/Alisas-IP.md). <br/>       

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Public Network Bandwidth: If an instance needs to access the public network, users can check the association with elastic IP (which is automatically allocated by the system and cannot be modified by users) when creating an instance or purchase it after instance creation. The elastic IP can be associated and disassociated with the instance, (which is an elastic IP of secondary network interface after creation)<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Mode of Billing by Bandwidth: It supports 3 billing methods, namely by fixed bandwidth - Monthly Package, by fixed bandwidth - Pay By Configuration and Add to Shared Bandwidth. (Note: Instances billed by configuration do not support association purchase with EIPs paid by fixed bandwidth-Monthly Package).</br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ISP Line: Currently, the edge node supports single line and the launched node supports Telecom.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Bandwidth: Users can choose a public network bandwidth rate of bandwidth ranging from 1Mbps to 10000Mbps. Please reasonably select the maximum bandwidth that may vary depending on different nodes based on the actual node.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Additional Uplink Bandwidth: Users can choose a public network bandwidth rate of additional uplink bandwidth ranging from 0Mbps to 10000Mbp. Please reasonably select the maximum bandwidth that may vary depending on different nodes based on the actual node.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;EIP billing by fixed bandwidth will charge and limit speed according to the "Bandwidth" and "Additional Uplink Bandwidth" set by you. You can adjust the bandwidth cap at any time according to business demand.

- Security Setting

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Firewall**: After the operating system is installed, the system will open only Port 22 at IN direction to Internet. After the operating system is installed successfully, users may log in the operating system and change iptable setting. Please refer to [Firewall Setting Operation Guide](../Operation-Guide/Network-And-Security/Steps-Network-And-Security.md).<br/>

- Basic Information

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Instance Name: Instance name is a Distributed Cloud Physical Server name that can be customized by users and used for search in the Distributed Cloud Physical Server list after setting. If several Distributed Cloud Physical Servers are purchased at one time, numbers in ascending order will be put after the set name by default to indicate each server.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Description: Users can select to add description for instances.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Machine Name: Machine name is a computer name in the operating system of Distributed Cloud Physical Server, which can be customized by users. The Distributed Cloud Physical Server instance can be viewed by logging in the server after produced. If several Distributed Cloud Physical Servers are purchased at one time, numbers in ascending order will be put after the set name by default to indicate each server. (The machine name is optional. If you do not enter the machine name, it will use "host - Private IPv4 Address Section 3 - Private IPv4 Address Section 4" by default as the machine name.)<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; User Name: It is automatically set according to the selected operating system and the default name is **root** in Linux system.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Login Method: The password is both used for remote login and console login.<br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1. Custom Password: It is "Set Password Now", which can be modified after an instance is created;<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2. Automatically Generated Password for Login: Set a password later and the system will send a default password by SMS and email; <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3. Key Pair Login: For Linux system, you can select SSH Key Pair for login. If you apply key pair for login, you must create or import a key pair first. Please refer to [SSH Key Pair](../Operation-Guide/SSH-Key-Pair/Step-SSH-Key-Pair.md). <br/>                                                                      
- Advanced Configuration </br>   

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **User Data**: It is used for configuring instances during start and is executed only when the instance system is started for the first time. Please refer to [User Data](../Operation-Guide/User-Data/User-Data-Overview.md).

- Purchase</br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Automatic Renewal**: The automatic renewal function can be enabled for monthly package resources. If automatic renewal is checked, the automatic renewal attribute and period can be modified after resources are created. In case of monthly package, the period to be automatically renewed is 1 month; for yearly package, the period to be automatically renewed is 1 year, and the automatic renewal discount will be provided for yearly automatic renewal.</br>  

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  After all configurations, you need to confirm the instance purchase. The quantity is limited by IPs remaining in your Distributed Cloud Physical Server, Elastic IP and the selected subnet in this node. If lack of quota, you can [Open Ticket](https://ticket.jdcloud.com/applyorder/submit) to increase quota.


