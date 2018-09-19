# Manually Remove VMs

For Availability Groups, you can control new instances and remove instances. Corresponding to the new instances, there are two ways to remove instances: manual and automatic. If you need to manually remove instances, you need to follow these steps:


## Operational Steps

1. Access[High Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**High Availability Groups** to enter the Availability Groups List page.
2. Choose region.
3. Find the Availability Group and click the name to enter the details page.
4. Click **Instance Tab** to find the VM that needs to be removed, and click the **Remove** button.
5. The window for secondary confirmation will pop up, and click **OK** to trigger the removal operation.

		Please note that:
		* When you manually remove the instance of pay by configuration billing, you can choose whether to delete the instances.
		* When an instance is removed from a Availability Group, it will not have Availability Group attributes, and cannot re-join the Availability Group. Please be careful. In addition, the monthly-package instances can be removed manually, while the auto-scaling function cannot automatically remove the monthly-package instances.
