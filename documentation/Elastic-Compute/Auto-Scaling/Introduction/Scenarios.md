## **Application Scenarios**

Users can set the Auto Scaling timed task in advance if they know when they need to expand or reducing the capacity. At the appropriate time, the system will automatically add or reduce the instances without the need for manual waiting.

You can set up the Auto Scaling monitoring strategy in advance so that you don't have to worry about the accuracy of demand forecasting and the risk to the system due to sudden business changes. The system will automatically determine whether parallel expansion of the VM is required based on the preset business monitoring indicators. If the monitoring indicator reaches the threshold, the VM instances will be automatically increased or decreased in a real-time manner, and the Load Balancer configuration will be completed automatically, which not only saves the cost, but also eliminate the need for the customer to prepare for manually expanding the capacity all the time.

E-commerce: If you plan to make a 618 promotion or arrange a promotion on a certain holiday, it is possible to achieve auto scaling according to the load as per the timed task in advance.

Live Video: In case of failure to predict the business load, you need to conduct auto scaling automatically based according to CPU utilization rate, bandwidth utilization, and so on.

Games: In the periods of 11:00-13:00 and 19:00-24:00 when the players are active, you need to expand the capacity regularly.

Big Data Compute: If you need to calculate, count, and collect the day’s business at 0:00 a.m. every day, you can use the Auto Scaling for such obviously time-sensitive service.
