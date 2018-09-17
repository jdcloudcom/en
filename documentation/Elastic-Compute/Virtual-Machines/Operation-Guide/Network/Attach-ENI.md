# Bind Elastic Network Interface

Elastic network interface mainly has the following associated information:

* Primary Network Interface: A special type of elastic network Interface that is created with virtual machine and has the same lifetime as virtual machine.
* Secondary Network Interface: It needs to be created independently, deleted and supported for elastic plugging, of which the primary network interface does not support associating and disassociating, and secondary network interface supports associating and disassociating
* Primary Private IP: The first private IP address assigned when elastic network interface is created can be specified by the user or assigned by the system but not supported for release.
* Secondary Private IP: The private IP address assigned by the elastic network interface except the primary IP can be assigned by the user or assigned by the system to support release.
* Elastic IP: Elastic IP is a public IP address that can be independently applied. It can be flexibly associated and disassociated with the private IP.
* Security Group: It is a distributed firewall in the state used for filtering traffic entering and leaving elastic network interface
* MAC Address: The MAC address is a unique identifier for the elastic network interface.

## Precondition

* The instance needs to be in the "Running" or "Stopped" status;
* The number of elastic network interface bound to the instance cannot exceed the upper limit, and the additional elastic network interface cannot be bound;
* Only support the elastic network interface associated with VPC to the instance.

Depending on the configuration of different instance types, the number of elastic network interface that can be bound to instance and the number of private IP that can be assigned to a single elastic network interface are different. The details are as follows.

|vCPU Number|Bind Elastic Network Interface Number|The private IP number that single Network Interface can assign
|:---|:---|:---|
1-core-2-core	|2	|21
4-core-8-core	|4	|21
Over 8-core	|8	|21

## Operation Steps

1. Access [Virtual Machine Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left [Elastic Compute] - [Virtual Machine] to enter the instance list page.
2. Select Regions.
3. In the instance list, select the instance to which you want to bind the elastic network interface. Click the name to enter the details page.
4. Click [Elastic Network Interface] Tab-[Bind Elastic Network Interface].
5. In the pop-up window, select an elastic network interface and click [Confirm].
		
		Please note:
		* It takes a few minutes for the operation to bind, so please wait for the page to refresh.
		* Binding elastic network interface operation requires the instance to be in the running or stopped status.
		* After binding, you need to log in to the instance to perform related routing and IP configuration.
		
For detailed routing and IP configuration, see [Configuring Routing](../../../../Networking/Elastic-Network-Interface/Operation-Guide/VM-Configuration/Linux-Permanent-Configuration.md).

In addition, you can also bind from the elastic network interface console. For details, see [Elastic Network Interface Side Associate Elastic Network Interface](../../../../Networking/Elastic-Network-Interface/Operation- Guide/Elastic-Network-Interface-Management/Associate-Elastic-Network-Interface.md).

## Related Reference

[Configure Routing](../../../../Networking/Elastic-Network-Interface/Operation-Guide/VM-Configuration/Linux-Permanent-Configuration.md)

[Elastic Network Interface Side Bind Elastic Network Interface](../../../../Networking/Elastic-Network-Interface/Operation-Guide/Elastic-Network-Interface-Management/Associate-Elastic-Network-Interface. Md)
