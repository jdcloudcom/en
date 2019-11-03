## Log Monitoring Configuration Case - Business Application Log Monitoring

The section specifies how to complete configuration of one log monitoring via a true case. It aims to describe the complete configuration process, making users easily understand log field monitoring function.

### I. Monitoring Configuration Target:

1. Conduct field monitoring for a game payment log deployed on the JD Cloud server by the user, so as to know the user’s payment situation.

2. Count of all orders whose payment failed shall be counted per minute. If there are 50 orders whose payment failed in a minute, i.e., the payment system is abnormal, the alarm notification shall be set to inform the related person, Jason. If paymentStatus=failed appears in the log, it means that the payment failed.

### II. Monitoring Scheme Setting

The setting scheme for achieving the above monitoring configuration target is as shown below:

1. Select the log set (gameLog) and log subject (paymentLog) of the business application log, click monitoring configuration behind the paymentLog log subject and enter the monitoring configuration page.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogMonitor/monitorcase01.jpg)

2. Click **Create Monitoring Task** and start configuration.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogMonitor/monitorcase02.jpg)

3. Enter **Payment Failure Times Monitoring** in the monitoring task name**

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogMonitor/monitorcase03.jpg)

4. Select **Screen by Key Value** in the screening setting and enter the condition for screening by key value as **paymentStatus = "failed"**

5. In the monitoring indicator setting, set "**Original Log Text**" as the statistical item, set "Count" as the statistical method, enter monitoring indicator name as **failed_count** and select **count** as the unit.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogMonitor/monitorcase04.jpg)

6. When the log test is started, you can get the latest log data from the existing log subjects, select customized log data and enter two log data manually.
```
{"paymentStatus": "failed"}
{"paymentStatus":"succeed"}
{"paymentStatus": "failed"}
{"paymentStatus":"succeed"}
{"paymentStatus": "failed"}
{"paymentStatus":"succeed"}
```
7. Click **Test** and then you can see the indication in the test data result: Seen from 6 data of the sample logs, the original log text is 3count. Log data in the sample, meeting the requirements, are displayed in the result list. When the expectation is reached, click **OK** and complete configuration.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogMonitor/monitorcase05.jpg)

### III. Alarm Scheme Setting

The alarm target of the above monitoring configuration is that: If there are 50 orders whose payment failed in a minute, i.e., the payment system is abnormal, the alarm notification shall be set to inform the related person, Jason.

1. Select "**Monitoring Graph** "behind" the **Payment Failure Count Monitoring**" and click the **Monitoring Graph** to enter the monitoring graph viewing page.

2. Click **Set Alarm Rule** in "Go to Monitoring and Set Alarm Rule" on the upper right and redirect to the Custom Metric Monitoring page in Monitoring.

3. Set alarms for the indicator in the name of "failed_count" of the log subject (PaymentLog) under the log set (GameLog). When the value is greater than 50 in the indicator statistic period is 1min, the alarm will be triggered. Please set Jason as the alarm contact. Click **Complete** to complete alarm rule setting.



