# Release the Secondary Private IP

## Operation Steps

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. In the instance list, select the instance that needs to release the secondary private IP and click the name to enter the details page.
4. Click **Elastic Network Interface** tab, select the elastic network interface that needs to release IP, find the secondary private IP that needs to be released, and click **Release**.
5. In the second confirmation window that pops up, click **OK**.

		Note: Note: The primary private IP does not support for release. When the secondary private IP is released, the elastic IP shall be disassociated automatically. If you need to delete the elastic IP, please go to the elastic IP list page.

In addition, you can also release from the elastic network interface console. For details, see [Elastic Network Interface Side Release Secondary IP](../../../../Networking/Elastic-Network-Interface/Operation-Guide/ Private-IP-Management/Unassign-Secondary-IP.md).


## Related Reference

[Elastic Network Interface Side release Secondary IP](../../../../Networking/Elastic-Network-Interface/Operation-Guide/Private-IP-Management/Unassign-Secondary-IP.md)

[Delete Elastic IP](../../../../Networking/Elastic-IP/Operation-Guide/Elastic-IP-Management/Delete-Elastic-IP.md)