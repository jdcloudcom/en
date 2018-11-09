# CC Defense

**Function Description**   

​    The CC defense configuration can evaluate CC attacks by smart threshold detection and backend server status detection in order to process the customized and pre-defined attack IP triggered. Global mode and single IP mode settings are supported currently.

​    **Global Mode**: Count all QPSs of web sites; execute algorithm check for all links exceeding the threshold if the count exceeds the threshold and execute corresponding actions according to the check results;

​    **Single IP Mode**: Count the connection number of source IP; execute algorithm check if the connection number of source IP exceeds the threshold and execute corresponding actions according to the check results;

 **Action Steps**

​    1. Enter the console instance management page, and click protection configuration to enter the configuration page of protection tabs and then click CC defense Setting.

![image.png](https://img1.jcloudcs.com/cms/f5bef0b4-a1a9-4ad7-9a89-d51bbff0b78820180817102425.png)

​    2. You can select the protection mode for CC defense currently and set the threshold for QPS to provide CC defense for all access requests exceeding the threshold.