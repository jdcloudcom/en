# Configuring Network Interface Multi-Queue

There is bottleneck for a single vCPU when handles the network interruption. You can configure the network interface multi-queue to distribute the network interface interruption in the instance to different vCPUs so as to improve network processing performance.

## Support

### Different Images Support Multi-Queue
Currently, different images have different support for network interface multi-queue. The details are as follows:

#### Public Image:

* CentOS 6.6/6.8/6.9/7.1/7.2/7.2 NAT Gateway/7.3/7.4 is supported, but 6.5 is not supported;
* Ubuntu 14.04/16.04 is supported;
* Windows Server is not support yet.

#### Private Image:

* If source image of instance supports multiple queues of network interface, private image created based on this instance also supports multi-queue of network interface;
* If source image instance does not support multiple queues of network interface, private image created based on this instance also does not support multi-queue of network interface.

#### Shared Image:

Shared image is actually shared with other users' private image for use, and the support is the same as private image.

#### Third-party Image:

Is not supported yet.

### Different Instance Types Support Multi-Queue
For the current status of various instance types for network interface multi-queues' support, see [Instance Type](../../Introduction/Instance-Type-Family.md).

## Operation Steps

For the CentOS 6 and Ubuntu systems, if you need to use multi-queue of network interface, you need to log in to instance for configuration after instance is created. The  default CentOS 7 system configuration is the maximum number of queues supported by the current instance type.
Here, CentOS 6.9 is taken as an example to introduce the configuration steps.

1. [Login Instance](../../Getting-Start-Linux/Connect-To-Instance.md).
2. Check if the network interface supports multi-queues. Run the Command:
	
	`ethtool -l eth0`
	
3. Set the network interface to use multi-queue. Run the Command:

	`ethtool -L eth0 combined x`
	
	x is the number of queues set.
	
4. For users with multiple network interface, you can set multiple network interface respectively, just replace eth0 of the above commands with other network interface device name.

	```
	[root@test ~]# ethtool -l eth0
	Channel parameters for eth0:
	Pre-set maximums:
	RX:		0
	TX:		0
	Other:		0
	Combined:	4      # This row stands for 4 queues to be supported at most
	Current hardware settings:
	RX:		0
	TX:		0
	Other:		0
	Combined:	1      # This row stands for 1 queue which is currently in effect
	[root@test ~]# ethtool -L eth0 combined 4
	```
	
3. It is recommended to open the irqbalance service to allow the system to automatically adjust the allocation of network interface interruptions on multiple vCPU cores. CentOS 7 is open by default. Run the Command:
	
	`systemctl start irqbalance `
	
	




## Related Reference

[Login Instance](../../Getting-Start-Linux/Connect-To-Instance.md)


