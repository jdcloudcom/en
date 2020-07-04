## An Example of Log Monitoring Configuration - Business Application Log Monitoring

This section is going to complete log monitoring configuration by an actual example. It aims to make users understand the function of log field monitoring more easily by describing the entire configuration process.

### I. Targets of Monitoring Configuration:

1. Perform field monitoring on the payment log of a game deployed by a user on JD Cloud server, to understand the payment status of the user.

2. Count the number of all failed payment order per minute. When the failed payment order count per minute reaches 50, the payment system will be abnormal, and an alarm needs to be set to notify the relevant personnel Jason. When paymentStatus=failed occurs in the log, the payment fails.

### II. Settings of Monitoring Scheme:

The setting scheme for the above targets of monitoring configuration is as follows:

1. Select the log set in which the business application log is located to enter the log topic list.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/bestpractice/bestmonitor01.jpg)

2. Click the **Log Monitoring** sub-menu under the log topic, and then click **Add** behind "Log Monitoring", or enter the Monitoring Task List page, and click **Create Monitoring Task**.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/bestpractice/bestmonitor02.jpg)

3. Enter the name of monitoring task

4. In the filter settings, select key-value filter, and enter the key-value filter condition as **paymentStatus = "failed"**

5. In the monitoring indicator settings, select "**Log Original Text**" as the statistical item, select "Count" as the statistical method, enter the name of monitoring indicator **failed_count**, and select the unit **count**.

6. Turning the Log Test on, you can obtain the latest log data from the current log topic, or can choose to customize the log data and enter two log data manually

```
{"paymentStatus": "failed"}
{"paymentStatus":"succeed"}
{"paymentStatus": "failed"}
{"paymentStatus":"succeed"}
{"paymentStatus": "failed"}
{"paymentStatus":"succeed"}
```
7. Click **Test**, you can see the test data results that: From the 6 pieces of data in the sample logs, the count of the log original text is 3count. The log data in the sample logs that meet the conditions are displayed in the results list. As expected, please click **OK** to complete the configuration.

### III. Settings of Alarm Scheme

The alarm target in the above monitoring configuration is: When the failed payment order count per minute reaches 50, the payment system will be abnormal, and an alarm needs to be set to notify relevant personnel Jason.

1. Select "**Monitoring Graph**" behind the monitoring task "**Monitoring of Payment Failure Count**", click **Monitoring Graph** to enter and view the Monitoring Graph page.

2. Click **Set Alarm Rules** in the "Go to the Monitoring to Set Alarm Rules" on the upper right, and redirect to the Custom Metric Monitoring page in the Monitoring.

3. Set an alarm for the indicator named "failed_count" in the log topic under the log set. When the statistical period is 1 min and the value is greater than 50, the alarm will be triggered. For alarm contacts, please select Jason. Click **Finish** to complete the settings of alarm rules.



