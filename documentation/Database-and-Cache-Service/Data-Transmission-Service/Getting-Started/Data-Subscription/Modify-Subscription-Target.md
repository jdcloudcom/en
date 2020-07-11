# Modify Subscription Target

When a subscription task is normally run, the subscription target can be modified on the Console, if required.

## Notes

- After any subscription task is modified, the data subscription service will obtain data from the source database again or update the structure again, without saving original data and progress.

## Operation Steps

1. Log in [DTS Console](http://dts-console.jdcloud.com/subscription/list) and click **Data Subscription** on the left menu.

2. Select a target task on the Data Subscription List Page and click **Modify Subscription Target** among the operation items.

   ![image-20200629143705495](../../../../../image/Data-Transmission-Service/dts-031.png)

   Or, enter the Task Details and click **Operation-Modify Subscription Target** on the upper right corner.

   ![image-20200629143852856](../../../../../image/Data-Transmission-Service/dts-032.png)

3. Select a Kafka instance or Topic on the "Modify Target" page.

   ![image-20200629144029647](../../../../../image/Data-Transmission-Service/dts-033.png)

4. After modification is completed, wait until the task is completed, pre-check and normally run such task.
