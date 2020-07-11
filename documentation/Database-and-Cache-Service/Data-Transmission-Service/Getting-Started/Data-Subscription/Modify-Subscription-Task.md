# Modify Subscription Task

If you need to modify a subscription task when the subscription task is normally run, the information to be modified include the source database, the target and the subscription object.

## Notes

- After any subscription task is modified, the data subscription service will obtain data from the source database again or update the structure again, without saving original data and progress.

## Operation Steps

1. Log in [DTS Console](http://dts-console.jdcloud.com/subscription/list) and click **Data Subscription** on the left menu.

2. Select a target task on the Data Subscription List Page and click **Modify Subscription Task** among the operation items.

   ![image-20200629121033812](../../../../../image/Data-Transmission-Service/dts-030.png)

   Or, enter the Task Details and click **Operation-Modify Subscription Task**.

   ![image-20200629144329976](../../../../../image/Data-Transmission-Service/dts-034.png)

3. Fill in corresponding information on the "Modify Subscription Task" Page. Please refer to "[Configure Subscription Task](Config-Subscription-Task.md)".

4. After modification is completed, wait until the task is completed, pre-check and normally run such task.
