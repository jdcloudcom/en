# Business Application Log Source Setting

## 1. Overview
Business application logs refer to the logs generated from business applications deployed on JD Cloud & AI by the user. The content and format are customized by the user.

The user is only required to select the Virtual Machines to be collected in log source settings, rather than manually install any log collection agent. The log collection agent will be automatically installed. It supports one-line and multi-line business application logs as log sources.

Business application log supports being delivered to multiple types of destinations. By default, it is collected to the log topic in Log Service. Besides, the log can be delivered to cloud ES or cloud Kafka of the Console, or to the self-created ES or self-created Kafka.

## 2. Operation Steps
### Business Application Collection Configuration
1. Log in to the Log Service Console, click **Create Log Configuration** or enter a designated log set and click **Create Subject** on the left navigation bar.
2. Complete the setting of log set and log subject.
3. Click **Next** to enter the [Log Source Setting] page.
4. Select business application in [Log Source].
5. The [Collection Status] is open by default; the user can also close it. The log is no longer collected after it is closed.
6. In [Log Path], fill in the log path and file name of the business application needing to be collected. The path supports wildcards of "/* /" or "/* /abd/* /", but not wildcards of "/** /". The file name supports wildcard of * The file path of Linux shall start with /. The code of log text is UTF8.
7. In [Collection Instance], it selects instances or corresponding availability group and tag based on the user's requirements.
8. If the business application log of a user is a multi-row log, it needs to set the first-row regular matching rules; If not, it's not necessary to set. It is not a multi-row log by default.


<img src="https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/operationguide/multi-line.jpg" width=80% height=80% />

### Business Application Advanced Configuration
1. The [Advanced Configuration] is closed by default. After the advanced configuration is open, the log can be delivered directly from the agent to the specified ES or Kafka.
2. If the user only requires to deliver the log to ES or Kafka, it can close [deliver to the log topic], then the corresponding log data will not be stored in the Log Service. Log monitoring function, etc. cannot be used, either.
3. If the destination of the business application log is Kafka, it needs to set brokers, topic, and the selection on whether to adopt compressed delivery or not. Compressed delivery supports snappy format and gzip format. Cloud Kafka will obtain brokers automatically.
4. If the destination of the business application log is ES, it needs to set ES access domain and search prefix. Cloud ES will obtain access domain automatically.

<img src="https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/operationguide/advanceconfig.jpg" width=80% height=80% />

## 3. Notes
- The current version supports collection of logs of Linux Virtual Machines.
- When an instance collecting user selects the instance dimension, selection of at most 30 Virtual Machines is supported and cross-region selection is also supported.
- When an instance collection user selects the availability group dimension, there is no quantity restriction. The collection quantity is equal to the number of Virtual Machines in the availability group. Logs of Virtual Machines added in the availability group subsequently will also be collected, with cross-region multiple choices supported.
- When an instance collection user selects the tag dimension, there is no quantity restriction. The collection quantity is equal to the number of Virtual Machines in the tag. There is no region restriction. Logs of Virtual Machines added in the tag subsequently will also be collected.
- If the destination of setting in advanced configuration is self-created ES or self-created Kafka, the regions in front of destination ES or destination Kafka will have no practical significance.

