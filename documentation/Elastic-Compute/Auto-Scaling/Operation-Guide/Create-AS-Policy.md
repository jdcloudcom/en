# Add Auto Scaling Strategy

When Auto Scaling is enabled, you can configure Auto Scaling strategy, including alarm strategy and timed strategy, on demand.

## Timed Strategy

The timed strategy will increases or decreases the number of instances in the availability group at the specific times and cycle you set, and is suitable for the predictable business loading boding circumstance.

If your load changes are predictable, you can set up timed tasks to plan your equipment expanding activities, and you can use this function to automatically increase or decrease the VM instances on a regular and periodic basis, in order to flexibly respond to the change of the business load, improve the utilization rate of the equipment, and save the cost for the deployment and instances.

On the **Auto Scaling Group** list page, click the **Auto Scaling Group Name** to go to the Auto Scaling Group Management page; 
Select **Timed tasks** tab and click **Add**; 
In the Add page, specify the timed task name, performing time, scaling rules and other information. You can also tick **Repeat Tasks** to define timed tasks to be performed periodically.
![Search 1](https://github.com/jdcloudcom/cn/blob/AutoScaling/image/Elastic-Compute/Autoscaling/%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A86.png)
When the setting is complete, the timed task will appear in the list on the page, as shown in the following example:
![Search 1](https://github.com/jdcloudcom/cn/blob/AutoScaling/image/Elastic-Compute/Autoscaling/%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A87.png)
## Alarm Strategy

Alarm strategy is an alarm strategy configured based on monitoring indicators (such as CPU, memory utilization rate) and the number of instances in the dynamic expanding auto scaling group, which is suitable for use in a circumstance where the business fluctuations are unpredictable.

If you want to adjust your business deployment according to the VM indicators, you can customize the alarm task, which will help you automatically increase or decrease the count of VM instances when the business load makes the indictors reach a threshold, and thus can flexibly respond to the change of the business load, improve the utilization rate of the equipment, and save the costs for the deployment and instances.

On the **Auto Scaling Group** page, click the **Auto Scaling Group Name** to go to the Auto Scaling Group Management page; 
Select **Alarm Task** tab and click **Add**; 
On the Add page, set the alarm task, based on monitoring performance indicators (such as CPU, memory, etc.), automatically increase or decrease the specified number of VM instances for the Auto Scaling Group.
![Search 1](https://github.com/jdcloudcom/cn/blob/AutoScaling/image/Elastic-Compute/Autoscaling/%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A88%20.png)
When the setting is complete, the alarm task will appear in the list on the page, as shown in the following example:
![Search 1](https://github.com/jdcloudcom/cn/blob/AutoScaling/image/Elastic-Compute/Autoscaling/%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A89.png)

When you have completed the above operations, you can edit the notification object by selecting the **Contact Person** tab on the management page.
