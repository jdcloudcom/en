## Creating Availability Monitoring
1. Log in JD Cloud Monitoring Console, Click **Management->Cloud Monitor->Site Monitoring** to enter the Dashboard list page. Click **Create Monitoring Task** in the upper left corner.

2. Complete configuration information
- Complete name of the availability monitoring task;
- Select a detection source. At present, at most 50 Virtual Machines can be selected as the detection sources and the Virtual Machine with the Linux system is supported only;
- Enter detection targets. The detection target only supports URL/IP and RDS under the user name. When URL is selected, please fill in the complete HTTP(S), for example https.://www.xxx.com；
- Select detection methods. The detections methods of HTTP(S) and TELNET are supported. When HTTP(S) is selected, the request method can be selected among GET, POST and HEAD, depending on demands, senior settings can be selected based on request method, and configuration can be made;
- Click **Confirm** to complete creation.

## Modification of Availability Monitoring
1. Log in JD Cloud Monitoring Console, Click **Management->Cloud Monitor->Site Monitoring** to enter the Dashboard list page.

2. Select the task that is required to be modified, and click **Modify** in the operation.

3. Enter the modification page to modify corresponding content.
- Modification items supported: Monitoring task name; detection source; senior settings under request mode in HTTP(S).
- Modification items not supported: Detection target; detection method; the request method cannot be modified if HTTP(S) is used as the detection method.

## Delete the monitoring task.
1. Log in JD Cloud Monitoring Console and click **Management->Monitoring->Availability Monitoring** to enter the Dashboard list page.

2. Select the task that is required to be modified, click **More** in the operation, and select **Delete**.

3. When the task is deleted, the relevant alarm rules will be deleted synchronously.

## View the monitoring graph
1. Log in JD Cloud Monitoring Console and click **Management->Monitoring->Availability Monitoring** to enter the Dashboard list page.

2. Select the task that is required to be modified, and click **Monitoring table** in the operation.

3. You can view the response time and availability of the detection target by the detection source by using monitoring graph.

## Set alarm rules
1. Log in JD Cloud Monitoring Console and click **Management->Monitoring->Availability Monitoring** to enter the Dashboard list page.

2. Select monitoring tasks with the alarm rules to be set, and click **More** in the operation, and select **Alarm Rule**.

3. Click **Add alarm rule**. Set contents of alarm rules, add alarm rules and contacts and click **Confirm**;

4. If creation succeeds, you can see the alarm rules of which the setup is completed; If the creation fails, the tooltip will appear, and If creation fails for several times, please contact customer service.



