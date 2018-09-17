# Solution for Failure to Obtain Private IP After Creation of Virtual Machines Using centos Private Image.



Sometimes, after creating a Virtual Machines using the previously created centos private image, it is found that the Virtual Machines does not obtain the private IP. Ifconfig -a checks the network information and finds that the network card interface name is changed into eth1 and there is no private IP information, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E4%BD%BF%E7%94%A8centos%E7%A7%81%E6%9C%89%E9%95%9C%E5%83%8F%E5%88%9B%E5%BB%BA%E4%BA%91%E4%B8%BB%E6%9C%BA%E5%90%8E%E6%97%A0%E6%B3%95%E8%8E%B7%E5%8F%96%E5%86%85%E7%BD%91IP%E8%A7%A3%E5%86%B3%E5%8A%9E%E6%B3%9501.png)

This is because the UUID information of the network card interface was retained when the private image was created. When the Virtual Machines was created using the private image, the system automatically assigned the network card interface to eth1, and there is no ifcfg-eth1 configuration file under /etc/sysconfig/network-scripts (but only original ifcfg-eth0 file). As a results, there was eth0 configuration file in the system but the eth0 device could not be found and there was eth1 device but no eth0 configuration file, so the private IP could not be obtained and accessed.

Solution:

Execute
*vi /etc/udev/rules.d/70-persistent-net.rules*

As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E4%BD%BF%E7%94%A8centos%E7%A7%81%E6%9C%89%E9%95%9C%E5%83%8F%E5%88%9B%E5%BB%BA%E4%BA%91%E4%B8%BB%E6%9C%BA%E5%90%8E%E6%97%A0%E6%B3%95%E8%8E%B7%E5%8F%96%E5%86%85%E7%BD%91IP%E8%A7%A3%E5%86%B3%E5%8A%9E%E6%B3%9502.png)

You can see that the system automatically generates the content of eth1 (yellow box) under the content of the original eth0 network card interface (red box).

Modify the file, comment out the content of eth0, and change the device name in the eth1 content into eth0. As shown in the two red boxes below, wq saves the file and exits.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E4%BD%BF%E7%94%A8centos%E7%A7%81%E6%9C%89%E9%95%9C%E5%83%8F%E5%88%9B%E5%BB%BA%E4%BA%91%E4%B8%BB%E6%9C%BA%E5%90%8E%E6%97%A0%E6%B3%95%E8%8E%B7%E5%8F%96%E5%86%85%E7%BD%91IP%E8%A7%A3%E5%86%B3%E5%8A%9E%E6%B3%9503.png)

Reboot the Virtual Machines. After rebooting, execute ifconfig -a and find that the previous eth1 device name retored to eth0 and the private IP can be obtained and can be accessed normally after binding the public IP.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E4%BD%BF%E7%94%A8centos%E7%A7%81%E6%9C%89%E9%95%9C%E5%83%8F%E5%88%9B%E5%BB%BA%E4%BA%91%E4%B8%BB%E6%9C%BA%E5%90%8E%E6%97%A0%E6%B3%95%E8%8E%B7%E5%8F%96%E5%86%85%E7%BD%91IP%E8%A7%A3%E5%86%B3%E5%8A%9E%E6%B3%9504.png)

If your problem still can not solved, please submit open ticket to us.
