# Automatic Scaling Overview

After the auto-scaling is enabled by the Availability Group, the alarm strategy configured based on the monitoring indicators (such as CPU, memory utilization) and the timing can be set, the number of instances are increased or decreased with the timing strategy of auto-scaling when it comes to the default time to cope with the fluctuation of business load. For automatic scaling, you need to understand the following concepts.

## Remove Strategy

When the alarm strategy/timing strategy triggers the removal of instances in the Availability Group, the removal strategy of the automatic scaling configuration will determine which ones are removed. You can choose from the following three kinds of removal strategy:

* Default Strategy: According to the principle of uniform deployment, the fault domain instances corresponding to the Availability Zone with the largest number of instances will be removed. If more than one instance meets the requirements, they will be selected randomly.
* Remove First Instance: Remove the instance first created.
* Remove Last Instance: Remove the instance last created, that is, the latest instance.

		Please note that the removal strategy is only valid for automatic removal. For automatic removal, only pay by configuration billing instances will be removed, that is, if the monthly package instances meet the conditions, then it is necessary to continue to find the instances that meet the requirements until the pay by configuration instances are satisfied. In addition, while the instance is removed automatically, it will be deleted automatically.

## Cooling Time

The Availability Group auto-scaling features have two concepts of cooling time, one is the cooling time set by each alarm strategy, and the other is the auto-scaling default cooling time (valid for timing scaling strategy, default value is 300s, and it does not support modification for the time being).You can ensure that automatic scaling does not add or remove other instances before the last scaling actually takes effect. Manually adding or removing instances in Availability Group is not limited by cooling time.

With new instances are added to the Availability Group, it takes time to create instances and apply self-launch configuration to share the business load after completion. If there is no cooling time, and the configuration values of alarm scaling strategy monitoring cycle or repeated cycle are small, new instances will be automatically added before load reduction. When the first new instance takes over the business, it will trigger the volume reduction because the load is too low.

For example, traffic peaks occur, leading to alarm triggering for alarm strategies. When the alert is triggered, the Availability Group auto-scaling will be added with an instance to help handle the increased business. But there is a problem: It takes a few minutes to create the instance, and it takes time to configure the service and gradually receive requests from Load Balancer after it is started. During this period, the alarm strategy may continue to trigger, leading to addition of new instances. But if you have set the cooling time, after a new instance is added, the auto-scaling of the Availability Group is created in the cooling, and all auto-scaling activities are paused until the corresponding time (assumed to be 300 seconds) passes. In this way, the newly created instance has time to start processing the application traffic. After the cooling time, if the alarm strategy is triggered again, the Availability Group will automatically add an instance, and the cooling time will take effect again.