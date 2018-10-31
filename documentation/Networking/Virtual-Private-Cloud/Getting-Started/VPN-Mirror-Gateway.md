## **VPN Image Gateway**

### **Product Summary** 

The VPN gateway provides Internet-based data encryption transmission service, which can realize network interconnection of different VPCs, open enterprise IDC and JD cloud intranet to realize hybrid cloud deployment; use VPN with mirror image to create VPN gateway. 

### **Product Features** 

- Provide encrypted data transmission channel

JD Cloud VPN uses IPSEC, IKE, and pre-shared key to encrypt data and provides a secure and reliable communication tunnel based on the public network. 

- Flexible networking mode to support multi-tunnel shared gateway

Support the establishment of multiple tunnels under the VPN gateway (requires different peer gateways) to provide a relatively flexible networking mode to meet the requirements of different service scenarios. 

- Tunnel connectivity detection, automatic repair tunnel function

By default, the VPN provides automatic detection of tunnel connectivity, and periodically detects the connectivity of the tunnel. Once the tunnel connection is found to be disconnected, the automatic reconnection ensures tunnel availability.

### **Product Advantages**

- Easy to use 

Create a VPN gateway through imaging. You can set up a VPN connection without complicated configuration. It is simple and convenient; 

- Safe and reliable 

Use the IPSEC protocol to implement encrypted data communication based on the public network; 

- Flexible and autonomous 

According to the actual business needs, you can choose the appropriate VPN image.

 

### **Application Scenario**

Currently, it provides VPN communication service based on IPSEC protocol, supports site to site mode, and can flexibly open enterprise IDC and JD Cloud intranet. The following is a typical application scenario: 

Demand: Some resources are deployed in the enterprise IDC, and resources such as application services are deployed in the JD Cloud intranet, and data communication is performed through the VPN tunnel to implement hybrid cloud deployment.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step1.jpg)



### **Operation Guide** 

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

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step2.jpg)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step3.jpg)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step4.jpg)

- Configure Routing 

According to the actual network resource planning of the connected network, configure the subnet route and point the next hop to the machine where the VPN gateway resides. Note that the subnet needs to be planned in advance. The machine that needs to communicate through the VPN cannot be in the same subnet as the machine that is the VPN gateway, and the subnet cannot be associated to the same routing table.

Routing configuration of the subnet where the Unicom machine is located (example):

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step5.jpg)

 Routing configuration of the subnet where the VPN gateway machine resides (example):

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step6.jpg)

-  Configure a VPN tunnel 

See the VPN image product instructions for details. View Method: After the machine creates a page, select the corresponding VPN image, click "View Details" on the right to open the product details page, or retrieve the corresponding imageed product information through the cloud market.

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step7.jpg)

![](/image/Networking/Virtual-Private-Cloud/Getting-Started/VPN-Mirror-Gateway/step8.jpg)

- Configure the Peer Gateway 

See the VPN image product instructions for use, or consult the corresponding service provider. 

- Detect network connectivity by means of PING peer IP.