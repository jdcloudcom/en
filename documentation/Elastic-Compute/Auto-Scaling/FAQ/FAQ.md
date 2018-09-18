# **FAQ**

## 1. What is Cooling Time?

Cooling Time refers to a period of locking time after a scaling activity (add or remove VM instances) has been completely performed within the same Auto Scaling Group. During such a period of time, Auto Scaling Group does not perform any scaling activities. The cooling time can be specified in the range of

0-86400
(seconds).

## 2. Does the manually added VM require a Cooling Time?

The manually added VM does not require a Cooling Time.

## 3. Is there any charge for Auto Scaling?

The Auto Scaling function is completely free of charge, please feel free to use.
A VM instances that is automatically created or manually added through Auto Scaling will be charged at the normal Pay-By-Consumption VM price.

## 4. How to increase the maximum number of Cloud Servers for an Auto Scaling Group?

Currently, each user can create 20 VM instances in each region; if you need to create more instances, you can apply for increasing the limit through an Open Ticket

## 5. What kind of machine is suitable for using Auto Scaling?

Applications deployed in a Cloud Server instance in an Auto Scaling Group are required to be stateless and replaceable. Because it is possible for instances in an Auto Scaling Group to be recovered during reducing capacity, the VM instance used for Auto Scaling cannot save the status information (such as sessions) and related data (such as databases, logs, and so on) for the application. If you need to save state information in your application, it is acceptable to consider saving the status information to a separate Cloud Server outside the Auto Scaling Group.

## 6. What is the requirement for the VM manually added into an Auto Scaling Group?

The Cloud Server manually added into an Auto Scaling Group shall meet the following requirements:

Within the same region with the Auto Scaling Group;
* 
The network environment (VPC) where it is located shall be consistent with the Auto Scaling Group;
* 
In a running status.

## 7. What are the requirements for a Load Balancer instance associated with an Auto Scaling Group?

The Load Balancer instance associated with an Auto Scaling Group must be in the same network environment (VPC) as the Auto Scaling Group.

## 8. Is Auto Scaling capable of automatically increasing or decreasing the configuration of a VM?

Auto Scaling automatically adjusts the management services of its elastic computing resources according to the business demands and policies of its users. It can automatically increase the VM instances as the business grows and automatically reduce the VM instances as the business drops. Auto Scaling is currently unable to support "Vertical Expanding" which means that Auto Scaling is temporarily unable to automatically increase and decrease the CPU, memory, and bandwidth of a VM.

## 9. Auto Scaling have to be used with a Load Balancer and Monitoring?

Auto Scaling allows you to expand and shrink VM instances individually, with or without Load Balancer for deployment.

## 10. If you need to expand a batch of VMs over a period of time, how to set them up?

The user can set a pair of timed tasks: One timed task defines a capacity-expanding operation that sets the expected number of instances to the count you want to expand; another timed task defines the shrinking operation that sets the expected number of instances to the number of volumes to be shrink.

## 11. What are the specific rules for removal strategies of Auto Scaling Group?

JD Cloud’s Auto Scaling provides two removal strategies:

Remove the VM that was first created: Delete the machine that was automatically added latest (After the automatically added machine is deleted, delete the machine that was manually added first. To be supported)
* 
Remove the VM that was created latest: Delete machine that was automatically added latest. (After the automatically added machine is deleted, delete the machine that was manually added latest. To be supported)

## 12. What operations will be paused after the Auto Scaling Group is disabled?

When disabling Auto Scaling Group is set, the auto-triggered activity will not take place, but the restrictions for the scaling group will still be in effect.
When the disabling Auto Scaling Group is set, the automatic operation will not take place:


Alarm task;

Timed task;

Manually causing the desired number of instances not to match.
However, in order to ensure that the business is normal, the basic limitation of the Auto Scaling Group will continue to exist:


If manual removal is less than the min, no removal will be allowed;
 
If the manual addition is more than the max, no addition will be allowed;
 
Manually increasing the min or max will not trigger scaling activity.

## 13. Rules for removing sub-machines


Manually added sub-machines will be removed: The removed sub-machine is no longer in the management scope of the Auto Scaling Group, and AS will not delete it or disassociate with LB
* 
The sub-machines that were added in by automatically expanding capacity will be removed: The sub-machine will be destroyed and will also be disassociated with LB
