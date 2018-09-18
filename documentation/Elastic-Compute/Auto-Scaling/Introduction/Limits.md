
## **Service restrictions**

At present, the region includes cn-north-1. (cn-east-1, cn-east-2 and cn-south-1 are about to be opened)

Applications deployed in a VM instance for Auto Scaling are required to be stateless and replaceable.

Since Auto Scaling will automatically releases the VM instance, the VM instance used for Auto Scaling cannot save the status information (such as session) and related data (such as databases, logs, and so on) for applications. If you need to save status information in your application, it is acceptable to consider saving the state information to a separate state server, a database (such as RDS), and a centralized log storage (such as Log).

There are certain limits to the count of Auto Scaling Groups, launch configurations, scaling VM instances, timed tasks, and alarm tasks that each user can create.

One Auto Scaling Group can only correspond to one launch configuration.

Auto Scaling is currently unable to support "Vertical Expanding" which means that Auto Scaling is temporarily unable to automatically increase and decrease the CPU, memory, and bandwidth of a VM.

Auto Scaling and launch configuration are both based on the concept of region, which can only start/destroy VM instance in the same region.
