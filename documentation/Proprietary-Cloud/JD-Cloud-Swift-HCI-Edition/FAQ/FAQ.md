# FAQ

**Q: Why floating IPs still cannot be externally accessed after associated by Virtual Machines?**

Virtual Machines in the JD Cloud Swift Platform are externally accessed by way of DNAT. The Virtual Machines can be externally accessed provided that the Subnet of the Virtual Machines associating with a floating IP is connected to a virtual route with external gateway through the gateway.

**Q: Does the hard disk of Virtual Machines support capacity changes?**

Images have been written to system disk configuration of Virtual Machines, so configuration changes are not supported currently on the cloud management platform;

The data disk of Virtual Machines is the Cloud Disk Service with minimum capacity of 20GB upon creation and maximum capacity set by the operation and maintenance role or system administrator in [Cloud Disk Service Specification]. To guarantee data integrity, the Cloud Disk Service only supports user in executing expansion operations. Access the navigation bar on the left side and click **Basic Cloud**>**Storage Resource**>**Cloud Disk Service** menu to enter the Cloud Disk Service list page; select the cloud disk to be expanded and click **Expand Capacity** in the operation list; select the expanded capacity in the pop-up, click **OK** button and then a succeeded notification will be popped up; then you can view the updated capacity information in the Cloud Disk Service list page.

**Q: What is image? How to use image?**

Image is a template for Virtual Machines software configuration (operating system, pre-installed program, etc.). Users can start VM instances through image. Image can start multiple instances for repeated use by users.

The platform supports official and private images. The two system images, centos7.4 and windows server 2012, are preset officially. Users can create private image based on Virtual Machines but cannot import private image by themselves at the moment. To guarantee data integrity, Virtual Machines cannot execute the image creation operation in running status and need to close Virtual Machines before creating the private image.

**Q: How to use Load Balancer to distribute traffic?**

The platform supports currently Load Balancer in distributing traffic in different Virtual Machines in the Subnet of it. You need to first create a Load Balancer and create a listener in it, and then create a resource pool and select the Virtual Machines to be added.

**Q: How to configure DNS in the network?**

When the subnet is created, the cloud management platform supports DNS configuration of appointed subnet. Please click menus **Basic Cloud**>**Network Resource**>**Network** to enter the network list page, select one network, click **Add Subnet** on the operation bar and enter DNS address to be configured in the popped-up page.

**Q: Can be Virtual Machines configuration be adjusted?**

The platform supports adjustment on configuration of Virtual Machines. Click the menus **Basic Cloud**>**Computing Resource**>**Virtual Machines** to log in the Virtual Machines List Page, select the Virtual Machines requiring configuration change, click **Resize** on the operation bar and select the changed configuration on the popped-up page. Now, the system disks of Virtual Machines do not support configuration downgrade.

