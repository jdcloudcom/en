## Create Site Monitoring
1. Log in JD Cloud Monitoring Console, and Click **Management->Cloud Monitor->Site Monitoring** to enter the Dashboard list page. Click **Create Monitoring Task** in the upper left corner.
2. Fill in the basic information:
Name of monitoring task.
Monitoring Types: monitoring protocols, support HTTP(S), Ping and TCP.
Site Address: specify the address of the monitoring task detection. If the selected monitoring type is HTTP(S), when entering the site address, you need to indicate the protocol type of the site address, for example, https://www.xx.com.
3. Monitoring scheme settings
Detection Frequency: i.e., the detection period of the monitoring task, it was set to 5 minutes, so perform detection to the site every 5 minutes.
Detection Point: the starting point at which the detection of the site address is performed. The default detection points and the custom detection points can be selected based on requirements. Currently, up to 5 custom detection points are supported to be selected.

## Modify Site Monitoring
1. Log in JD Cloud Monitoring Console, and Click **Management->Cloud Monitor->Site Monitoring” to enter the Dashboard list page.
2. Select the task that is required to be modified, and click **Modify** in the operation. 
3. Enter the modification page to modify corresponding content. Monitoring type, site address and detection point are not supported to modify for now, and the rest of information can be modified.

## Delete Monitoring Task.
1. Log in JD Cloud Monitoring Console, and Click **Management->Cloud Monitor->Site Monitoring” to enter the Dashboard list page.
2. Select the task that is required to be modified, and click **More** in the operation, and select **Delete**.
3. When the task is deleted, the relevant alarm rules will be deleted synchronously.

## View the monitoring chart
1. Log in JD Cloud Monitoring Console, and Click **Management->Cloud Monitor->Site Monitoring” to enter the Dashboard list page.
2. Select the task that is required to be modified, and click **Monitoring Table** in the operation.
3. You can view the response time and availability of the set detection point to the site address detection by using monitoring chart.


## Set Alarm Rules
1. Log in JD Cloud Monitoring Console, and Click **Management->Cloud Monitor->Site Monitoring” to enter the Dashboard list page.
2. Select the task that is required to be modified, and click **More** in the operation, and select **Alarm Rule**.
3. Click **Add Alarm Rule**. Select region, monitoring item and detection period.
4. Monitoring items (available rate and response time), statistical periods, statistical methods, calculation methods, thresholds, durations, adding alarm rules and contacts, Click **OK**.
5. If creation succeeds, you can see the alarm rules of which the setup is completed; If the creation fails, the tooltip will appear, and if creation fails for several times, please contact customer service.

