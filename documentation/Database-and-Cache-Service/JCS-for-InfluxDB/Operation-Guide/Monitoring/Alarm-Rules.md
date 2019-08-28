# Set alarm rules

In the InfluxDB Console, you can set alarm rules based on monitoring items. When the monitoring item reaches the set threshold, we will send you an alarm message via SMS and email.

## Note

After JCS for InfluxDB instance is successfully created, 2 alarm rules will be automatically set and you can modify them according to your real conditions.

| Monitoring Item     | Statistic Period | Rule         | Monitoring Period | Notification Period |
| :--------- | :------- | :----------- | :------- | :------- |
| CPU Usage  | 5 Minutes    | Average value ≥ 80% | 3      | 24 Hours   |
| Disk Utilization Rate | 5 Minutes    | Average value ≥ 80% | 3      | 24 Hours   |

## Operation Steps

1. Log in [InfluxDB Console](http://tsds-console.jdcloud.com/list).

2. On the "Instance List" page, select the target instance and click ** Instance Name** to go to the "Instance Details" page.

3. On the "Instance Details" page, click **Monitoring** to go to the "Monitoring Information" page.

4. Click ** Set Alarm Rule** on the right side of the page to enter the "Alarm Rules" page.

   ![1564390127127](../../../../../image/JCS-for-InfluxDB/1564390127127.png)

5. Click **Add New Alarm Rules** and customize monitoring items and alarm methods.

   ![1564390177670](../../../../../image/JCS-for-InfluxDB/1564390177670.png)