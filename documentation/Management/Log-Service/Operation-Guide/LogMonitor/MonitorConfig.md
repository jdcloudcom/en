## Log Monitoring Configuration

Main contents of the section include addition, deletion, change and examination of monitoring configuration. Users can understand meanings of configuration items required as well as functions supported by log monitoring with the document.

### I. Create Monitoring Task

Creating a log monitoring task requires confirmation that the corresponding collection configuration has been added under the log subject.

1. Enter a corresponding log set, select the log subject of log monitoring task to be created, directly click the **Add** button behind **Log Monitoring** or click **Log Monitoring**, select **Monitoring Task List** in the draw-down box and click **Create Monitoring Task**.

![](https://github.com/jdcloudcom/cn/blob/zhangwenjie-only/image/LogService/LogMonitor/logmonitor-1.jpg)

2. Complete Monitoring Task Configuration Information

**Monitoring Task Name** The business scope and monitoring contents reflecting the monitoring log shall be completed according to the user requirements. Limitations for monitoring task name: It shall not be null, and only Chinese, numbers, uppercase and lowercase letters, English underlines "_" and line-throughs "-", with at most 32 characters.

**Statistical Period** Statistical period refers to the period for aggregation calculation of monitoring indicators. The current version only support a statistical period of 1min.

**Log Filter** Log filter supports full-text keyword filtering and key-value filtering. Users can filter the logs that need to be counted once based on their needs. After setting the log filter conditions, monitoring statistics will be carried out only for the logs conforming to the filter conditions.
Setting of Monitored Indicator.

- Statistical items refer to the contents that need to be counted. You can select the original log text to count and count the number of log entries. You can also select the KEY in the log to count and aggregate the VALUE in various ways.
- Statistical methods support counting, summation, average value, minimum value and maximum value.
- Name of monitored indicator is the name shown in the monitoring graph. Monitoring indicator name can be automatically generated according to the statistical items and methods selected by the user. Meanwhile, the user can also modify the monitoring indicator name based on their needs. The Naming conventions for the monitoring indicator name are: The name cannot be null; it only supports numbers, uppercase and lowercase letters, English underlines "_" and line-throughs "-", with at most 32 characters.
- The unit is the unit of monitoring indicator. The user can select the default unit options provided by the platform or customize their own unit name. The naming conventions for the unit are: It supports Chinese, uppercase and lowercase letters, English underlines "_" and line-throughs "-", with at most 64 bytes.

**Log Test** Log test is for the user to conveniently and quickly view the log filtering conditions and monitoring indicators set, and ensure that the monitoring tasks set are in line with their expectations. The user can directly use the logs under the current log subject, or customize and paste log data for testing.

![](https://github.com/jdcloudcom/cn/blob/zhangwenjie-only/image/LogService/LogMonitor/logmonitor-2.jpg)

## II. View the Monitoring Graph and Set Alarm Rules

### View the monitoring graph

1. Click the sub-menu **Monitoring Diagram** under **Log Monitoring** and enter the Monitoring Diagram View Page.

2. Select the monitoring task to be viewed and the time range for query and then you can view the Log Monitoring Diagram.

![](https://github.com/jdcloudcom/cn/blob/zhangwenjie-only/image/LogService/LogMonitor/logmonitor-3.jpg)

### Set alarm rules

Click **Set Alarm Rules** in the monitoring graph page to redirect to the Custom Metric Monitoring page in Monitoring, and select the corresponding monitoring task set alarm rules.

