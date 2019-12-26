# Set Automatic Backup

JCS for InfluxDB supports automatic backup. The default backup start time is 0:00-1:00 every day, You can adjust automatic backup time according to business condition.


## Note
- By default, automatic backup files can be kept for 7 days and do not support manual deletion.
- If automatic backup has been made on the current day and the automatic backup time is modified to be later than the current time, backup will still be created.

## Operation Steps
1. Log in [InfluxDB Console](http://tsds-console.jdcloud.com/list).

2. On the "Instance List" page, select the target instance and click ** Instance Name** to go to the "Instance Details" page.

1. On the "Instance Details" Page, click in turn **Backup Management** >  **Backup Policy** to enter the "Backup Policy" Page.

    ![](../../../../../image/JCS-for-InfluxDB/20191209161602.png)

4. On the **Backup Policy** Page, click **Modify Strategy** to open the **Modify Strategy** popup.

    ![image-20191209162516986](../../../../../image/JCS-for-InfluxDB/20191209162516986.png)

     - Select the expected automatic backup time in the "Policy Modification Popup".
     - Click **OK** to save modification.
     - You can view modification result on the "Backup Strategy" Page.

