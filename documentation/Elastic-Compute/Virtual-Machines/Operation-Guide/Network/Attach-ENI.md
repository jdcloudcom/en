# Bind Elastic Network Interface

Elastic network interface mainly has the following associated information:

* Primary Network Interface: A special type of elastic network Interface that is created with VMs and has the same lifetime as VMs.
* Secondary Network Interface: It needs to be created independently, deleted and supported for elastic plugging, of which the primary network interface does not support associating and disassociating, and secondary network interface supports associating and disassociating
* Primary Private IP: The first private IP address assigned when an ENI is created can be specified by the user or assigned by the system but not support for release.
* Secondary Private IP: The private IP address assigned by the ENI except the primary IP can be assigned by the user or assigned by the system and support for release.
* Elastic IP: Elastic IP is a EIP address that can be independently applied. It can be flexibly associated and disassociated with the private IP.
* Security Group: It is a distributed and stateful firewall used for filtering traffic inbound and outbound an ENI
* MAC Address: The MAC address is a unique identifier for the elastic network interface.

## Precondition

* The instance needs to be in the "Running" or "Stopped" status;
* The number of ENIs attached to the instance cannot exceed the upper limit, and the additional ENI cannot be attached;
* Only the ENIs with the same VPCs are supported to attach to the instance.

Depending on the configuration of different instance types, the number of ENIs that can be attached to instance and the number of private IPs that can be assigned to a single ENI are different. The details are as follows.

|vCPU Number|Bind Elastic Network Interface Number|The private IP number that single Network Interface can assign
|:---|:---|:---|
1-core-2-core	|2	|21
4-core-8-core	|4	|21
Over 8-core	|8	|21

## Operation Steps

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. In the instance list, select the instance to which you want to bind the elastic network interface. Click the name to enter the details page.
4. Click **Elastic Network Interface** tab - **Bind Elastic Network Interface**.
5. In the pop-up window, select an elastic network interface and click **OK**.
		
		Please note:
		* It takes a few minutes for the operation to bind, so please wait for the page to refresh.
		* Binding elastic network interface operation requires the instance to be in the running or stopped status.
		* After binding, you need to log in to the instance to perform related routing and IP configuration.
		
For detailed routing and IP configuration, see [Configuring Routing](../../../../Networking/Elastic-Network-Interface/Operation-Guide/VM-Configuration/Linux-Permanent-Configuration.md).

**Elastic Network Interface**(../../../../Networking/Elastic-Network-Interface/Operation- Guide/Elastic-Network-Interface-Management/Associate-Elastic-Network-Interface.md).

## Related Reference

[Configure Routing](../../../../Networking/Elastic-Network-Interface/Operation-Guide/VM-Configuration/Linux-Permanent-Configuration.md)

**Elastic Network Interface**(../../../../Networking/Elastic-Network-Interface/Operation-Guide/Elastic-Network-Interface-Management/Associate-Elastic-Network-Interface. Md)