## **VPN Image Gateway**

### **Product Summary** 

The VPN gateway provides Internet-based data encryption transmission service, which can realize network connection between different VPCs, connecting enterprise IDC and JD cloud VPC, to realize hybrid cloud deployment. JD cloud users can create VPN gateway by using image with VPN function.

### **Product Features** 

- Provide encrypted data transmission channel

JD Cloud VPN uses IPSEC, IKE, and pre-shared key to encrypt data and provides a secure and reliable communication tunnel based on the public network. 

- Flexible networking mode to support multi-tunnel shared gateway

Supporting the establishment of multiple tunnels under the VPN gateway (requires different peer gateways) to provide a flexible networking mode for different service scenarios.

- Tunnel connectivity detection, automatic repair tunnel function

the VPN provides automatic detection of tunnel connectivity by default, and detects the connectivity of the tunnel periodically. Once the tunnel disconnection is detected, an automatic reconnection will be excuted to ensures tunnel availability.

### **Product Advantages**

- Easy to use 

Create a VPN gateway by creating a VM instance with VPN image to avoid complicated configuration.Making the VPN establishment simple and convenient;

- Safe and reliable 

Using the IPSEC protocol to implement encrypted connection on the public network;

- Flexible and autonomous 

 choose the appropriate VPN image for business demands.

 

### **Application Scenario**

The VPN communication service is based on IPSEC protocol, supports site to site mode, connects enterprise IDC and JD Cloud VPC. The following is a typical application scenario:

Demand: Some resources are deployed in the enterprise IDC, and resources such as application services are deployed in the JD Cloud VPC, and data communication is performed through the VPN tunnel to implement hybrid cloud deployment.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step1.jpg)



### **Operation Guide** 

- Create a VPN Image Gateway 

1. Open the JD Cloud console, enter the VM list page, click Create; 

2. On the VM creation page, select region; for the image type, select **image market**; 

3. Select the VPN image that you need in the image list and click on **View Details** to view the corresponding VPN image information;

4. Configure CPU, memory and system disk for the VM;

5. Configure VPC and subnet;

6. Select a security group and set a security policy as required; 

7. Configure the EIP type, billing method and bandwidth; Note: The VM that serves as a VPN gateway needs to be associate with the EIP address. If the EIP is not associate with VM on this page, it should be operated later.

8. Set the VM Name;

9. Set the password. It is recommended to set a password, otherwise a random login password will be generated;

10. Select the duration of the VM;

11. Confirm the finished configuration on the right side of the page, then click **Buy Now** to complete the payment and create the VPN service VM.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step2.jpg)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step3.jpg)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step4.jpg)

- Configure Routing 

According to the actual network stutas, configure the subnet route and point the next hop to the VM where the VPN gateway resides. Note that the subnet needs to be configured in advance. To deploy the VPN Gateway use case, two subnets each with an independent route table in the same VPC are needed. Client VMs to communicate through the VPN Gateway can be placed in one sunbent, and then the VPN Gateway should be placed in another subnet.

Example: Routing configuration of the subnet where client VMs to communicate through the VPN Gateway reside:

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step5.jpg)

Example: Routing configuration of the subnet where the VPN gateway VM resides:

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step6.jpg)

-  Configure a VPN tunnel 

See the VPN image product instructions for details. 
Instructions location: on the VM creating page, After selecting the corresponding VPN image, click **View Details** on the right to open the product details page, or retrieve the corresponding image product information through the cloud market.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step7.jpg)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step8.jpg)

- Configure the Peer Gateway 

See the VPN image product instructions for details, or consult the image provider.

- Checking network connection by pinging the peer IP.