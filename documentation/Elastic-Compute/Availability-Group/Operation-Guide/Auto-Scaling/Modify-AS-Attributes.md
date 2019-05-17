# Modify Auto-Scaling

After auto-scaling is enabled, if you need to adjust auto-scaling information, you can realize it by modification.

## Preconditions
The Availability Group is currently on auto-scaling, and the current Availability Group is in a “normal” state, i.e. there is no ongoing scaling activity and the cooling is complete. If the current Auto Scaling Group is in scaling or cooling, you will have to wait until it turns to normal.

## Operational Steps

1. Access[Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**Availability Groups** to enter the Availability Groups List page. 
2. Find the corresponding Availability Group and click the name to enter the details page.
3. Click on **Auto-Scaling Tab**-**Scaling Information**-**Modify**.
4. The minimum number of instances, the maximum number of instances and the removal strategy of the Availability Group are reformulated in the pop-up window.
		
		The number of instances in the Availability Group will remain between the minimum and maximum number of scaling. If the current instance number of Availability Group is lower than the minimum instance number, new instances will be automatically added to meet the minimum limit. Please note that the automatically added Virtual Machines will be Pay By Configuration; if the current instance number of Availability Group is higher than the maximum instance number, instances will be removed to meet the maximum limit（adding manually will not be affected by this rule）. Note: the automatically removed Virtual Machines will be directly deleted (different from those removed manually) and Virtual Machines under monthly package will not be automatically removed.

5. Click **OK** to trigger auto-scaling modification.

