# Configure online release

Release the compiled program packages to Virtual Machine.

**Notes**

Compilation construction relates to online release via module group. Only by associating them, program package revision compiled by belonged module can be selected when online

**Operation steps**

1.Basic Settings

Select one application in the Service Tree at the left side, select “Continuous Delivery-Online Release” from the menu to enter “Online” page. Click “Basic Settings” subpage to set executive account and associate the application with belonged module(s)

2.Group Settings
Click “Configuration” on the “Group Settings” page to set configuration files and environmental variables for each group. 

![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Getting-Started3.png) 

3.Online

Select the group(s) to be online on the “online” page and set online concurrence and time-out period. Select package revision to be online for online release. On the “Online Dynamic” page, you can view online details and perform rollback operation.

![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Getting-Started4.png)

Then, the basic online release is completed.

4. It supports Instance Management, including start, stop, restart program packages; expand and contract capacity; log service, etc.
