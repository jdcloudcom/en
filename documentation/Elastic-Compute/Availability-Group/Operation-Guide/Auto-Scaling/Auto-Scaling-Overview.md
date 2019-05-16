# Automatic Scaling Overview

After the auto-scaling is enabled, alarm policies configured based on the monitoring metrics (such as CPU, memory utilization) and the fixed-time policies configured with specific time can be set to increase or decrease the number of instances to cope with the fluctuation of business load. For automatic scaling, you need to understand the following concepts.

## Remove policy

When the alarm policy/fixed-time policy triggers the removal of instances in the Availability Group, the removal policy of the automatic scaling configuration will determine which ones are to be removed. You can choose from the following three kinds of removal policy:

* Default policy: According to the principle of uniform deployment, the fault domain instances corresponding to the Availability Zone with the largest number of instances will be removed. If more than one instance meets the requirements, they will be selected randomly.
* Remove First Instance: Remove the instance first created.
* Remove Last Instance: Remove the instance last created, that is, the latest instance.

		Please note that the removal policy is only valid for automatic removal. For automatic removal, only pay by configuration billing instances will be removed, that is, if the monthly package instances meet the conditions, then it is necessary to continue to find the instances that meet the requirements until the pay by configuration instances are satisfied. In addition, while the instance is removed automatically, it will be deleted automatically.

## Cooldown Time

The Availability Group auto-scaling features have two concepts of cooldown time, one is the cooldown time set by each alarm policy, and the other is the auto-scaling default cooldown time (valid for fixed-time scaling policy, default value is 300s, and it does not support modification for the time being).You can ensure that automatic scaling does not add or remove other instances before the last scaling actually takes effect. Manually adding or removing instances in Availability Group is not limited by cooldown time.

With new instances are added to the Availability Group, it takes time to create instances and apply self-starting configuration to share the business load. If there is no cooldown time, and the configuration values of alarm scaling policy monitoring cycle or repeated cycle are small, new instances will be automatically added before load reduction. When the first new instance takes over the business, it will trigger to scale dowm due to the load is too low.

For example, traffic peaks occur, leading to alarm triggering for alarm policies. When the alarm is triggered, the Availability Group auto-scaling will add an instance to help handling the increased business. But there is a problem: It takes a few minutes to create the instance, and it takes time to configure the service and gradually receive requests from Load Balancer after it is running. During this period, the alarm policy may continue to trigger, leading to add new instances. But if you have set the cooldown time, after a new instance is added, the auto-scaling of the Availability Group is cooling down, and all auto-scaling activities are paused until the cooldown time (assumed to be 300 seconds) passes. In this way, the newly created instance has time to start processing the application traffic. After the cooldown time, if the alarm policy is triggered again, the Availability Group will automatically add an instance, and the cooldown time will take effect again.