# **VPN Image Gateway Configuration**

- Create a VPN Image Gateway

1. Open the console menu - VM, click Create;

2. On the VM creation page, select region; for the image type, select "image market";

3. Select the VPN image that you need in the image list and click on "View Details" to view the corresponding VPN image information;

4. Select CPU, memory and system disk;

5. Select VPC and subnet;

6. Select a security group and set a security policy as required;

7. Set the EIP type, billing method and bandwidth; Note: The machine that serves as the VPN gateway needs to be associate with the EIP address. If the creation page is not purchased, the EIP address must be associated separately.

8. Set the Machine Name;

9. Set password. It is recommended to set a password, otherwise a random login password will be generated;

10. Choose the Purchase Duration;

11. Confirm the currently selected information on the right side of the page, click "Buy Now" to complete the payment and create the resource.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step1.jpg)

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step2.jpg)

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step3.jpg)



- Configure Routing

According to the actual network resource planning of the connected network, configure the subnet route and point the next hop to the machine where the VPN gateway resides. Note that the subnet needs to be planned in advance. The machine that needs to communicate through the VPN cannot be in the same subnet as the machine that is the VPN gateway, and the subnet cannot be associated to the same routing table.

Routing configuration of the subnet where the Unicom machine is located (example):

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step4.jpg)



Routing configuration of the subnet where the VPN gateway machine resides (example):

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step5.jpg)



- Configure a VPN tunnel 

See the VPN image product instructions for details. View Method: After the machine creates a page, select the corresponding VPN image, click "View Details" on the right to open the product details page, or retrieve the corresponding imageed product information through the cloud market.

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step6.jpg)

![](/image/Networking/Virtual-Private-Cloud/Operation-Guide/NFV-Configuration/VPN-Mirror-Gateway-Configuration/Step7.jpg)



- Configure the Peer Gateway 

See the VPN image product instructions for use, or consult the corresponding service provider. 

- Detect network connectivity by means of PING peer IP.