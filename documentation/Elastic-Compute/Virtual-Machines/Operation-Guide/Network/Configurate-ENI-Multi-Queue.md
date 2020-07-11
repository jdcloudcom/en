# Configure Network Interface Multi-Queue

There is bottleneck for a single vCPU when handles the network interruption. You can configure the network interface multi-queue to distribute the network interface interruption in the instance to different vCPUs so as to improve network processing performance.

## Support

### Different Images Support Multi-Queue
Different image versions provide different supports to ENI Multi-Queue. Details are as follows:

#### Public Image:

* CentOS
  * 7.4 and higher version: Supported, enabled by default and configured as per the maximum supported queues
  * 6.6/6.8/6.9/7.1/7.2/7.2 NAT Gateway/7.3: Supported, but without default enabling configuration. Please install scripts according to the configuration method below to realize automatic configuration
  * 6.5 and below version: Not supported
* Ubuntu
  * 18.04: Supported, enabled by default and configured as per the maximum supported queues
  * 14.04/16.04: Supported, but without default enabling configuration. Please install scripts according to the configuration method below to realize automatic configuration
* Windows Server
  * Not supported now

#### Private Image:

* For private images made on the basis of official images, support to ENI Multi-Queue is subject to conditions of original official images and whether the host has realized automatic enabling configuration by virtual of scripts before images are made
* For private images produced via [Import Image](../Image/Import-Private-Image.md), if it is confirmed that the version itself supports such private images and the ENI Multi-Queue is required, the function can be used only after [Open Ticket](https://ticket.jdcloud.com/applyorder/submit) and application.

#### Shared Image:

Shared image is actually shared with other users' private image for use, and the support is the same as private image.

#### Third-party Image:

Is not supported yet.

### Support to ENI Multi-Queue number by different Instance Types

For the current status of various instance types for network interface multi-queues' support, see [Instance Type](../../Introduction/Instance-Type-Family.md).

## Operation Steps

### Temporary Configuration
For images which supports ENI Multi-Queue but with ENI Multi-Queue disabled, the following method is applicable for configuring such multi-queue temporarily. However, the function ENI Multi-Queue will become invalid after rebooting. The method can be used for testing influence to network performance by the multi-queue. If it is confirmed that the ENI Multi-Queue must be enabled, please make permanent configuration through the method below.
Here, CentOS 6.9 is taken as an example to introduce the configuration steps.

1. [Login Instance](../../Getting-Start-Linux/Connect-to-Linux-Instance.md).
2. View if ENI supports multiple queues and maximum queues supported now. Run command:
	
	`ethtool -l eth0`
	
       "Pre-set maximums" and "Combined" in "Current hardware settings" respectively are queues settings supported and queues valid at present
	
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
	
### Permanent Configuration	
1. Download scripts. Download address for intranet of each region is as follows:
* cn-north-1: https://bj-jcs-agent-linux.s3-internal.cn-north-1.jdcloud-oss.com/multi-queue-jd.tgz
* cn-south-1: https://gz-jcs-agent-linux.s3-internal.cn-south-1.jdcloud-oss.com/multi-queue-jd.tgz
* cn-east-1: https://sq-jcs-agent-linux.s3-internal.cn-east-1.jdcloud-oss.com/multi-queue-jd.tgz
* cn-east-2: https://sh-jcs-agent-linux.s3-internal.cn-east-2.jdcloud-oss.com/multi-queue-jd.tgz

2. Decompress and install.
```
tar zxvf multi-queue-jd.tgz
cd multi-queue-jd
bash install.sh <image-type> <version-num>
```

   Please refer to contents below for system type and major version number. If the current image is CentOS 6.9, the installation instruction is `bash install.sh centos 6` correspondingly.

       * image-type: centos|ubuntu 
       * centos vserion-num: 6|7|8
       * ubuntu version-num: 14|16|18

  If the installation information contains `Starting multi-queue-jd: OK`, it means that the ENI Multi-Queue is successfully configured. After configuration, installation scripts can be deleted.
  
## Related Reference

[Login Instance](../../Getting-Start-Linux/Connect-to-Linux-Instance.md)


