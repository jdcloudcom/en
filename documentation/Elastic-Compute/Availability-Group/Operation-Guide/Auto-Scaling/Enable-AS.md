# Enable Auto-Scaling

After starting the auto-scaling mode of the Availability Group, you can set up an alarm strategy based on monitoring index (such as CPU, memory utility efficiency) and pre-set time. The timing strategy of the auto-scaling will help to add or delete the quantity of VMs upon pre-set time and handle the load fluctuation condition.

## Preconditions
The Availability Group does not currently enable auto-scaling.

## Operational Steps

1. Access[High Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**High Availability Groups** to enter the Availability Groups List page. 
2. Find the name of the corresponding Availability Group.
3. Click **Operation**-**Enable Auto-Scaling**.
4. In the pop-out window, please specify the minimum and maximum instance number as well as the remove strategy of the Availability Group.
		
		The number of instances in the Availability Group will remain between the minimum and maximum number of scaling. If the number of instances in the current Availability Group is less than the minimum number of instances, the Availability Group will automatically add instances to make it equal to the minimum number of instances. It is important to note that the automatically added instances are pay by configuration; if the number of instances in the current Availability Group is greater than the maximum number of instances, the Availability Group will automatically remove the instances according to the removal strategy, making it equal to the maximum number of instances. It should be noted that the automatically removed instances will be deleted directly, unlike you manually remove them, and the monthly-package instances will not be automatically removed.

5. Click **OK** to trigger the Enable Auto-Scaling.

You can also configure alarm strategy and timing strategy after enabling the auto-scaling.


## Related References

[Create Instance Template](../../Virtual-Machine/Operation-Guide/Instance-Template/Create-Instance-Template.md)