# Attach ENI

JD Cloud supports attaching an independently created secondary ENI to any VM with the same virtual private cloud attribute.

## Procedures

Step 1: Log in to the console of JD Cloud and enter the Console Navigation Page.

Step 2: Select network - virtual private cloud - ENI at the navigation bar on the left side of the console to enter the ENI list page.

Step 3: If the ENI is unassociated on the ENI list page, Associate Resource is displayed.

Step 4: Click Resource Association to enter the ENI association resource popup.

	Description
	Currently, ENI only support binding with VM resource. On the ENI Details, the shortcut operation menu at the upper right corner is also provided with the Associate Resource, and the function is consistent with the key on the List Page.

Step 5: In the resource association popup, select the subnet where the ENI needs to be associated to the VM and select the VM that needs to be associated in the VM list.

	Description
	Currently, ENI can only be bound with VM with the same virtual private cloud attribute. The number of ENI that can be associated to each VM is restricted by the instance type of the VM. When the quota of ENI of the VM reaches the upper limit, an error will occur if the ENI association is performed.

Step 6: Click OK in the resource binding popup to complete the ENI binding.

Step 7: Return to the ENI list page. Since it takes 3 to 5 seconds to associate the ENI with the VM, refresh the ENI list page after completing the association for 3 to 5 seconds to see the association of the ENI.

## Related References

- [Use Restrictions](../../Introduction/Restrictions.md)
