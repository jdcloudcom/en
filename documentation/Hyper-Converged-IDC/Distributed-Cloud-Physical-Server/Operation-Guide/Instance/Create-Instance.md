## Create Instance

1. Access [Instance Console](https://cps-edge-console.jdcloud.com/instance/list) or access [JD Cloud & AI Console](https://console.jdcloud.com/overview), click **AIDC - Distributed Cloud Physical Server** in the left navigation bar and log in the Instance List Page.<br/>

2. Select the node of the created instance and click **Create** to enter the Instance Purchase page.<br/>

3. Select billing mode: Monthly package and pay by configuration. For monthly package, payment is made for a whole month; for pay by configuration, payment is made on the basis of hour as per duration of actual use (accurate to seconds).<br/>

4. Select node and operator: East China-Taizhou (Telecom 1) is open currently. Please note: Intranet resources of different nodes are not interconnected and cannot be modified upon creation. If the quota of the selected node is used up, you can [Open Ticket](https://ticket.jdcloud.com/applyorder/submit) to increase quota.<br/>

5. Select instance type: The instance type supports user customized selection and Users can select the instance type and corresponding configurations according to different business scenarios.<br/>

6. Select image: Image types include CentOS6.6, 7.1, 7.2 and 7.5, Ubuntu14.04, 16.04 and 18.04.<br/>

7. Select storage: The RAID mode of system disk and data disk is selected.<br/>

8. Network interface count and name: The required network interface count and name are selected, including single and double network interface modes. Single network interface corresponds to primary network interface (bond0); double network interface corresponds to primary network interface (eth0) and secondary network interface (eth1).<br/>

9. Select network interface and bandwidth setting: <br/>

   **Primary Network Interface (eth0)**<br/>
   - VPC and Subnet: You are required to create a VPC and subnet first.<br/>
   - Private IP: If there is no particular requirement for private IP address, the private IP address can be automatically assigned by the system within subnet available segment; if the IP is required to be designated, please enter one within the notified range and the system will verify if the IP is available. Please note that if a customized private IP address is selected, instances cannot be created in batch.
   - Alias IP Range: Alias IP range is selected based on business demands and the default primary network interface configuration is 50.
   - Public IP: Associating with elastic IP is checked by default. Users may choose not to associate it currently and do it manually after instance creation.
   - Mode of billing by bandwidth: It supports 3 billing methods, namely by fixed bandwidth - Monthly Package, by fixed bandwidth - Pay By Configuration and Add to Shared Bandwidth. (Note: Instances billed by configuration do not support association purchase with EIPs paid by fixed bandwidth-Monthly Package).
   - ISP Line: Telecom is supported currently.
   - Bandwidth cap: 1Mbps~10000Mbps. 
   - Additional Uplink Bandwidth Cap: 0Mbps~10000Mbps. 
    
   **Secondary Network Interface (eth1)**<br/>
   - Include VPC and subnet, private IP, alias IP range, public IP, billing by bandwidth mode, ISP line, bandwidth, and additional uplink bandwidth cap.<br/>
   
10. Select security setting: After the operating system is installed, the system will open only Port 22 at IN direction to Internet. After the operating system is installed successfully, users may log in the operating system and change iptable setting.

11. Select basic information:<br/>
   - Instance Name: Distributed Cloud Physical Server name, 2-128 characters, beginning with a uppercase and lowercase letter or a Chinese character, and may contain numbers, ". ", "_", ": " or "-".<br/>
   - Description: Description can be null but its length cannot exceed 256 characters.<br/>
   - Machine Name: The length is between 2-64 characters, allowing using dot (.) to segment characters into several sections. Uppercase and lowercase letters, numbers or hyphens (-) can be used in each section, but the dot (.) or the hyphen (-) cannot be continuously used in each section. It cannot start or end with a dot (.) or a hyphen (-).<br/>
   - User Name: It is automatically set according to the selected operating system and the default name is root in Linux system.<br/>
   - Login Method: The password is both used for remote login and console login. When setting a password, users can select either "Custom Password" or "Automatically Generated Password for Login" (the system will send a default password by SMS and email) or SSH Login Instance. For Linux system, you can select SSH Key Pair for login and conduct safer instance login verification by associating the created SSH Key Pair.</br>
    
12. Automatic renewal:<br/>
   - The automatic renewal function can be enabled for monthly package resources. If automatic renewal is checked, the automatic renewal attribute and period can be modified after resources are created. In case of monthly package, the period to be automatically renewed is 1 month; for yearly package, the period to be automatically renewed is 1 year, and the automatic renewal discount will be provided for yearly automatic renewal.

13. Confirm instance count and duration:<br/>
   - The quantity is limited by the count of IPs remaining in your instance, Elastic IP quota and the selected subnet in this node. If the quota is insufficient, you can [Open Ticket](https://ticket.jdcloud.com/applyorder/submit) to increase quota.</br>

14. Click **Buy Now** to redirect to the Order Confirmation page. After successful payment in accordance with the unified order billing process of JD Cloud & AI, redirect to the Console List Page.
