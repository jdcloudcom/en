# Assign Secondary Private IP

The private IP of JD Cloud is an IP address that cannot be accessed through the Internet. JD Cloud supports you to assign multiple private IP addresses to different elastic network interface of the instance, which are the main private IP and auxiliary private IP of the corresponding elastic network interface. Each private IP can be associated to an elastic IP:

Primary private IP address: The first private IP address assigned when elastic network interface is created can be specified by the user or assigned by the system but not supported for release.

Secondary Private IP Address: The private IP address other than the primary IP assigned by the elastic network interface can be assigned by the user or distributed by the system to support release.

## Precondition

The single elastic network interface can have an upper limit of 21 private IP addresses, that is, 20 secondary private IPs can be assigned in addition to the primary private IP. When the number of allocated private IPs has not reached the upper limit, you can operate to assign the secondary private IP.
	
	Note: the actual number of private IPs that can be assigned is also limited by the number of remaining IPs on the subnet where the elastic network interface is located.

## Operation Steps

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select Regions.
3. In the instance list, select the instance that needs to be assigned the secondary private IP and click the name to enter the details page.
4. Click **Elastic Network Interface** Tab, select the elastic network interface that needs to be assigned IP, and click **Assign private IP**.
5. Add private IP to be added to the pop-up window. You can choose the private IP address assigned by the system automatically or the customized private IP address. Note that you need to be within the CIDR scope of the elastic network interface machine and cannot conflict with an occupied address. Support multiple assignments at the same time, click **OK**.
		
		Please note:
		* After the console operation is completed, you need to log in to the instance for configuration to take effect.

In addition, you can also perform the assignment from the elastic network interface console. For details, see [Elastic Network Interface Side Assign Secondary IP](../../../../Networking/Elastic-Network-Interface/Operation-Guide/ Private-IP-Management/Assign-Secondary-IP.md).

## Configure Instance

### Linux System

The Linux system uses CentOS 7.2 as an example and the detailed operation is as follows:

1. Log in to the instance. For details, please refer to [Login Linux Instance](../../Getting-Start-Linux/Connect-To-Instance.md)

2. In the example of the primary network interface, if it is a secondary network interface, the corresponding modifications are eth1, eth2, etc. Excuting command 

		vim /etc/sysconfig/network-scripts/ifcfg-eth0

	Example: If the private IPs queried by the current instance in the console are 192.168.0.4 and 192.168.0.5 respectively, where 192.168.0.4 is the primary IP, the file content is displayed:

	```
	TYPE="ETHERNET"  
	BOOTPROTO="dhcp"
	DEFROUTE="yes"
	PEERDNS="yes"
	PEERROUTES="yes"
	IPV4_FAILURE_FATAL="no"
	IPV6INIT="yes"
	IPV6_AUTOCONF="yes"
	IPV6_DEFROUTE="yes"
	IPV6_PEERDNS="yes"
	IPV6_PEERROUTES="yes"
	IPV6_FAILURE_FATAL="no"
	NAME="eth0"
	UUID="dd73a4ea-8f6b-409b-a271-5f7882a3ae53"
	DEVICE="eth0"
	ONBOOT="yes"</pre>
	```
	Modify to the following and save:

	```
	TYPE="ETHERNET"
	# BOOTPROTO="dhcp"
	DEFROUTE="yes"
	PEERDNS="yes"
	PEERROUTES="yes"
	IPV4_FAILURE_FATAL="no"
	IPV6INIT="yes"
	IPV6_AUTOCONF="yes"
	IPV6_DEFROUTE="yes"
	IPV6_PEERDNS="yes"
	IPV6_PEERROUTES="yes"
	IPV6_FAILURE_FATAL="no"
	NAME="eth0"
	UUID="dd73a4ea-8f6b-409b-a271-5f7882a3ae53"
	DEVICE="eth0"
	ONBOOT="yes"
	IPADDR0="192.168.0.4"
	IPADDR1="192.168.0.5"
	NETMASK1="255.255.255.0"
	NETMASK2="255.255.255.0"
	GATEWAY="192.168.0.1"
	```
	Please note that BOOTPROTO="dhcp" is to be annotated.

3. Reboot the Network Interface

		systemctl restart network```

4. Check if the eth0 network interface has joined the IP address.
		
		ip addr
		
5. Complete the private IP configuration.
	
		Note: Private IP configured in this mode will still take effect after instance is restarted. However, if you create a customized image for this instance, private IP of other instances based on this private image needs to update the configuration on its own according to the above configuration method.

### Windows System

Windows system uses Windows Server 2012 R2 Standard Edition 64-bit Chinese version as an example. The detailed operation is as follows:

1. Log in to the instance. For details, please refer to [Login Windows Instance](../../Getting-Start-Windows/Connect-To-Instance.md).

	Example: If it needs to be configured in IP 192.168.2.43 (secondary IP) in subnet 192.168.2.0/24, the current primary private IP is IP 192.168.2.42.

2. Right click "Start" in the lower-left corner and select network connection. ![](../../../../../image/vm/AssignIP1.png)
3. When the network connection appears, right click and select "Attibute". ![](../../../../../image/vm/AssignIP2.png)
4. After opening the distributes, select "Internet Protocol Version 4 (TCP/IPv4)" and click "Attribute".![](../../../../../image/vm/AssignIP3.png )
5. After opening the attributes, the display is as follows![](../../../../../image/vm/AssignIP4.png)
   Modify the content to the image below, then click "Advanced"![](../../../../../image/vm/AssignIP5.png)
6. Click **Advanced** to display the following image![](../../../../../image/vm/AssignIP6.png)
<br>Click **Add**, fill in as bellow, click **Add** and confirm![](../../../../../image/vm/AssignIP7.png)
Click **OK** to return to the attribute page![](../../../../../image/vm/AssignIP8.png)<br>Fill in the DNS server address and write "103.224.222.222" and "103.224.222.223" and complete after clicking "Confirm"![](../../../../../image/vm/AssignIP9.png)

## Related Reference

[Elastic Network Interface Side Assign Secondary IP](../../../../Networking/Elastic-Network-Interface/Operation-Guide/Private-IP-Management/Assign-Secondary-IP.md)

[Log in to Linux Instance](../../Getting-Start-Linux/Connect-To-Instance.md)

[Log in to Windows instance](../../Getting-Start-Windows/Connect-To-Instance.md)
