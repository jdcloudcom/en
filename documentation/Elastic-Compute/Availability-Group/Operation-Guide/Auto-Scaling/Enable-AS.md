# Enable Auto-Scaling

After the auto-scaling is enabled, alarm policies configured based on the monitoring metrics (such as CPU, memory utilization) and the fixed-time policies configured with specific time can be set to increase or decrease the number of instances to cope with the fluctuation of business load. For automatic scaling, you need to understand the following concepts.

## Preconditions
The Availability Group does not currently enable auto-scaling.

## Operational Steps

1. Access[Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**Availability Groups** to enter the Availability Groups List page. 
2. Find the name of the corresponding Availability Group.
3. Click **Operation** - **Enable Auto-Scaling**.
4. In the pop-out window, please specify the minimum and maximum instance number as well as the remove policy of the Availability Group.
		
		The number of instances in the Availability Group will remain between the minimum and maximum number of scaling. If the current instance number of Availability Group is lower than the minimum instance number, new instances will be automatically added to meet the minimum limit. Please note that the automatically added Virtual Machines will be Pay By Configuration; if the current instance number of Availability Group is higher than the maximum instance number, instances will be removed to meet the maximum limit（adding manually will not be affected by this rule）. Note: the automatically removed Virtual Machines will be directly deleted (different from those removed manually) and Virtual Machines under monthly package will not be automatically removed.

5. Click **OK** to trigger the Enable Auto-Scaling.

You can also configure alarm policy and fixed-time policy after enabling the auto-scaling.


## Related References

[Create Instance Template](../../../Virtual-Machines/Operation-Guide/Instance-Template/Create-Instance-Template.md)
