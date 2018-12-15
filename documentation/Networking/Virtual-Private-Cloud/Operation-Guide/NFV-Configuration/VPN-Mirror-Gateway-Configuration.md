# **VPN Image Gateway Configuration**

- Create a VPN Image Gateway

1. Open the console menu - VM, click **Create**;

2. On the VM creation page, select region; for the image type, select **image market**;

3. Select the VPN image that you need in the image list and click on **View Details** to view the corresponding VPN image information;

4. Select CPU, memory and system disk;

5. Select VPC and subnet;

6. Select a security group and set a security policy as required;

7. Set the EIP type, billing type and bandwidth; Note: The machine that serves as the VPN gateway needs to be associate with the EIP address. If not be purchased  on the creation page , the EIP address must be associated separately.

8. Set the Machine Name;

9. Set password. It is recommended to set a password, otherwise a random login password will be generated;

10. Choose the Purchase Duration;

11. Confirm the currently selected information on the right side of the page, click **Buy Now** to complete the payment and create the resource.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step1.png)

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step2.png)

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step3.png)



- Configure Route

According to the actual network resource plan of the connected network, configure the subnet route and point the next hop to the VM as the VPN gateway. Note that the subnet needs to be planned in advance. To deploy the VPN Gateway use case, two subnets each with an independent route table in the same VPC are needed. Client VMs to communicate through the VPN Gateway can be placed in one sunbent, and then the VPN Gateway should be placed in another subnet.

client VMs to communicate through the VPN Gateway reside  (example):

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step4.png)



Route configuration of the subnet where the VPN gateway machine resides (example):

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step5.png)



- Configure a VPN tunnel 

See the VPN image product instructions for details. View Method: on the VM creating page, select the corresponding VPN image, click **View Details** on the right to open the product details page, or retrieve the corresponding VPN image product information through the cloud market.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step6.png)

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step7.png)



- Configure the Peer Gateway 

See the VPN image product instructions for use, or consult the corresponding service provider. 

- Detect network connectivity by means of PING peer IP.