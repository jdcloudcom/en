# Set Alarm Rules

In JCS for Redis console, you can set alarm rules based on monitoring items. When the monitoring item reaches the set threshold, we will send you an alarm message via SMS and email.

## Precautions

- After the JCS for Redis instance is created successfully, an alarm rule is automatically set: "Statistical Period 2 Minutes Disk Average Utilization Rate >= 75 %, Lasts 5 Cycles", you can modify it based on the actual situation.


## Action Steps

1. Log in to [JCS for Redis console](https://Redis-console.jdcloud.com/Redis).
1. On the "Instance List" page, select the target instance and click **Instance Name** to go to the "Instance Details" page.
1. On the "Instance Details" page, click **Monitoring** to go to the "Monitoring Information" page.
1. Click **Set Alarm Rule** on the right side of the page to enter the "Alarm Rules" page.

   ![](https://github.com/jdcloudcom/cn/blob/JCS-for-Redis/image/Redis/set-rule.png)
   
   
1. On the "Alarm Rules" page, click **Add Alarm Rule** to enter the "Set Alarm Rule" page and add new rules according to the notification.
 
   ![](https://github.com/jdcloudcom/cn/blob/JCS-for-Redis/image/Redis/addrule.png)

## Relevant References

- [View Monitoring Information](Monitoring.md)
