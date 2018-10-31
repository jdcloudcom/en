# Associate EIP

Each private IP (including primary IP and secondary IP) assigned by ENI of JD Cloud (including primary network interface and secondary network interface) can be connected with one elastic IP.

## Procedures
Step 1: Log in to the console of JD Cloud and enter the Console Navigation Page.

Step 2: Select network - virtual private cloud - ENI at the navigation bar on the left side of the console to enter the ENI list page.

Step 3: Locate the ENI that needs to be associated with public IP, and click the ID of the ENI to enter the details of ENI.

Step 4: Select the private IP management tag and enter the private IP management page.

Step 5: Locate the private IP that needs to be associated to the public network IP, and if the private IP is not associated to the public network IP, Associate EIP will be displayed.

Step 6: Click Associate EIP to enter the Associate EIP popup.

	Description
	Currently, only the primary network interface of VM of Availability Zone A can be associated with elastic IP with the attribute of Availability Zone A. Elastic IP with the attribute of all AZs can be adopted for VM of Availability Zone B or any secondary network interface.

Step 7: In the Associate EIP popup, select elastic IP to be associated.

Step 8: Click OK to complete the association of elastic IP and return to the private IP management page to view the association of elastic IP.

## Related References

- [Use Restrictions](../../Introduction/Restrictions.md)
