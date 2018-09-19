# Modify Auto-Scaling

After auto-scaling is enabled, if you need to adjust auto-scaling information, you can realize it by modification.

## Preconditions
The Availability Group is currently on auto-scaling, and the current Availability Group is in a “normal” state, i.e. there is no ongoing scaling activity and the cooling is complete. If the current Auto Scaling Group is in scaling or cooling, you will have to wait until it turns to normal.

## Operational Steps

1. Access[High Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**High Availability Groups** to enter the Availability Groups List page. 
2. Find the corresponding Availability Group and click the name to enter the details page.
3. Click on **Auto-Scaling Tab**-**Scaling Information**-**Modification** buttons.
4. The minimum number of instances, the maximum number of instances and the removal strategy of the Availability Group are reformulated in the pop-up window.
		
		The number of instances in the Availability Group will remain between the minimum and maximum number of scaling. If the number of instances in the current Availability Group is less than the minimum number of instances, the Availability Group will automatically add instances to make it equal to the minimum number of instances. It is important to note that the automatically added instances are pay by configuration; if the number of instances in the current Availability Group is greater than the maximum number of instances, the Availability Group will automatically remove the instances according to the removal strategy, making it equal to the maximum number of instances. It should be noted that the automatically removed instances will be deleted directly, unlike you manually remove them, and the monthly-package instances will not be automatically removed.

5. Click **OK** to trigger auto-scaling modification.

