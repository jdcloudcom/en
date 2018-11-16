# Associate Elastic IP

## Operation Steps

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. In the instance list, select the instance to which you want to associate elastic IP. Click the name to enter the details page.
4. Click ENI Tab, select the elastic network interface that needs to be associated to the elastic IP, find the private IP to be associated, and click Associate the EIP.
5. In the pop-up window, select the EIP unassociated and click OK.
		
		Please note:
		* The secondary network interface is not allowed to associate the EIP of the single availability zone;
		* Associating EIP on the list page is the primary private IP associated with the primary network interface of Virtual Machines.
		
In addition, you can also:

* Associate elastic IP to the primary private IP of the primary network interface instance on the instance list page. The operation steps are as follows:
	1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
	2. Select a region.
	3. In the instance list, select an instance of the elastic IP to be associated to the primary private IP of the primary network interface. Click Associate EIP.
	5. In the pop-up window, select the EIP unassociated and click OK.
	 
* Associate operation from the elastic network interface console. For details, see [Elastic Network Interface Side Associate EIP](../../../../Networking/Elastic-Network-Interface/Operation-Guide/ Private-IP-Management/Associate-Elastic-IP.md).

## Related Reference

[Elastic Network Interface Side Associate EIP](../../../../Networking/Elastic-Network-Interface/Operation-Guide/Private-IP-Management/Associate-Elastic-IP.md)