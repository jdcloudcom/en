# FAQ

**Q: Why floating IPs still cannot be externally accessed after associated by Virtual Machines?**

The Virtual Machines in JDStack platform is externally accessed by way of DNAT. The Virtual Machines can be externally accessed provided that the Subnet of the Virtual Machines associating with a floating IP is connected to a virtual route with external gateway through the gateway.

**Q: Does the hard disk of Virtual Machines support capacity changes?**

Images have been written to system disk configuration of Virtual Machines, so configuration changes are not supported currently on the cloud management platform;

The data disk of Virtual Machines is a cloud disk and its capacity range is 20~500GB when created. To guarantee data integrity, the Cloud Disk Service only supports user in executing expansion operations. Access the navigation bar on the left side and click **Basic Cloud**>**Storage Resource**>**Cloud Disk Service** menu to enter the Cloud Disk Service list page; select the cloud disk to be expanded and click **Expand Capacity** in the operation list; select the expanded capacity in the pop-up, click **OK** and then a succeeded notification will be popped up; then you can view the updated capacity information in the Cloud Disk Service list page.

**Q: What is image? How to use image?**

Image is a template for Virtual Machines software configuration (operating system, pre-installed program, etc.). Users can start VM instances through image. Image can start multiple instances for repeated use by users.

The platform supports official and private images. The two system images, centos7.4 and windows server 2012, are preset officially. Users can create private image based on Virtual Machines but cannot import private image by themselves at the moment. To guarantee data integrity, Virtual Machines cannot execute the image creation operation in running status and need to close Virtual Machines before creating the private image.

**Q: Will shared network take up its own network quota?**

No.

**Q: Can names and descriptions be modified in shared network?**

No. Only users creating this shared network can execute deletion operation of the shared network and the remaining users can view and use this network in the network list page but are not allowed making modification.

**Q: How to use Load Balancer to distribute traffic?**

The platform supports currently Load Balancer in distributing traffic in different Virtual Machines in the Subnet of it. You need to first create a Load Balancer and create a listener in it, and then create a resource pool and select the Virtual Machines to be added. For specific operation guide, refer to [Load Balancer](../Operation-Guide/LBaaS.md).

**Q: How to configure DNS in the network?**

When the network is creating, the cloud management platform does not support currently specifying the default DNS configuration. The system will select 3 addresses in current Subnet as DNS addresses and will get corresponding DNS configuration Information when Linux operating system subsequently gets IP addresses through DHCP. If users need to configure DNS addresses by themselves, they can directly delete all current IP addresses in the domain server and add the DNS addresses to be configured.

**Q: Can be Virtual Machines configuration be adjusted?**

The platform does not support Virtual Machines in modifying configuration currently. Users can select the preset standard configuration when creating VM but cannot customize Virtual Machines configuration type at the moment.

