## **What is Auto Scaling (AS)?**

AS (Auto Scaling) is a Web service that can automatically adjust the VM computing resources according to your business needs and policies, helping to ensure that you have a proper number of VM instances to handle your application load. With AS for adjustment to capacity, you only need to set the conditions for expanding capacity and reducing capacity in advance, and then, As will automatically increase/decrease the count of servers used when the conditions are met, in order to maintain the performance:

It is possible to add Machine instances seamlessly as business demands grow.

It is possible to reduce automatically the Machine instance as business demand drops in order to save costs.

![AS Overview 1.png](https://github.com/jdcloudcom/cn/blob/AutoScaling/image/Elastic-Compute/Autoscaling/AS%E6%A6%82%E8%BF%B01.png)

You can create a set of VM instances, that is, an *Auto Scaling Group, *you can specify the minimum count of the instances in each Auto Scaling Group, and Auto Scaling will ensure that the number of the instances in your group will never fall below such a number; you can specify the maximum number of the instances in each Auto Scaling Group, and Auto Scaling will ensure that the number of the instances in your group will never become higher than such a number. If you specify the required capacity at the time when a group is created or at any time after the group is created, Auto Scaling will ensure that your group will always has such a count of instances. If you have specified an expanding strategy, Auto Scaling can start or stop an instance as the demand of your application increases or decreases

For example, the following Auto Scaling Group has a minimum capacity of 1 instance, with a required capacity of 3 instances and a maximum capacity of 5 instances. The expanding strategy you set up is to adjust the count of instances within the maximum and minimum number of instances according to the conditions you have specified.

![Figure AS Overview 2.png](https://github.com/jdcloudcom/cn/blob/AutoScaling/image/Elastic-Compute/Autoscaling/AS%E6%A6%82%E8%BF%B02.png)

## **Basic Concepts of AS**

Auto Scaling have been based the following basic concepts:

Auto Scaling Group

Launch Configuration

Scaling Strategy

Cooling Time

### 1. Auto Scaling Group

Auto Scaling Group is a set of VM instances that follow the same rule and are oriented to the same scenario. Auto Scaling Group defines attributes such as the maximum and minimum value of VM instances within the group and their associated Load Balancer instances.

### 2. Launch Configuration

Launch configuration is the template for automatic creation of a Cloud Server, including image, Cloud Server instance type, type and capacity of system disk and data disks, key pair, and so on.

You must specify a launch configuration when you create an Auto Scaling Group, and it will be impossible to edit the attributes of the launch configuration once it has been created.

### 3. Scaling Strategy

That is, the condition for performing a scaling action. The trigger condition can be the alarm or time of monitoring, and the action can be removed from or add into a VM.
There are two types of scaling strategies:

Timed Scaling Strategy
When a fixed point in time is reached, VM instances will be automatically increased or decreased and periodic repetition is supported.

Alarm Scaling
Automatically increasing or decreasing VM instances based on monitoring indicators (such as CPU, memory, network traffic, and so on).

### 4. Scaling Activity

When the scaling strategy is successfully triggered, a scaling activity will occur. Scaling activity is mainly used to describe the changes of VM instances within a scaling group.

### 5. Cooling Time

Cool time refers to a period of locking time after an alarm scaling activity (add or remove a VM instance) has completely performed within the same Auto Scaling Group. During such a period of time, Auto Scaling Group does not perform such an alarm scaling activity. The cooling time can be specified in the range of 0-86400 (seconds).
