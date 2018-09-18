# Set Alarm Rules

In the MongoDB console, you can set alarm rules based on monitoring items. When the monitoring item reaches the set threshold, we will send you an alarm message via SMS and email.

## Precautions

- After the MongoDB instance is created successfully, an alarm rule will be automatically set: "Statistical period 2min Disk utilization rate average >= 75 %, lasting for 5 cycles", you can modify it according to the actual situation.


## Operation Steps

1. Log into [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
1. On the "Instance List" page, select the **target instance**, then click **Instance Name** to enter the "Instance Details" page.
1. On the "Instance Details" page, click **Monitor** to enter the "Monitoring Information" page.
1. Click **Set Alarm Rules** on the right side of the page to enter the "Alarm Rules" page.

   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-025.png)

1. On the "Alarm Rules" page, click **Add Alarm Rules** to enter the "Set Alarm Rules" page and add new rules as prompted.
 
   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-026.png)

## Related Reference

- [View Monitoring Information](Monitoring.md)
