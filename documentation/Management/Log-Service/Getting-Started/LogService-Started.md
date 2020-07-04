The log service usage process is as follows:  
- Create log configuration, including log sets, log subjects and log source setting
- Make use of log retrieval, log dump, log monitoring and other functions

**Setting of log set and log subject**

1.	Log in JD Cloud console.

2.	 Click the navigation bar, select **Cloud Service** -> **Monitoring, Operation and Maintenance** -> **Log Service** and enter the Log Overview Page.

![进入日志服务概览](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/GettingStarted/logservice.png)

3.	 Click the button **Create Log Configuration** above the list and enter the Process Creation Page.

![创建日志配置](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/GettingStarted/crtlogconfig.png)

4.	 Enter the name of a created log set or select the existing log set name. Fill in the log set description and the saving time. Click **Next** to set the log subject.

![日志集设置](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/GettingStarted/logset.png)

5.	 If the log set is a new one created by the user, only the log subject can be created; if the existing log set is selected by the user, the log subject is created or selected from the existing ones according to demands and the log subject description can be filled in. Click **Next** to set the log source.

![日志主题设置](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/GettingStarted/logtopic.png)

**Setting of Log Source**
1.	 Select log sources to be collected, cloud products or business application logs. 

2. 	For cloud product logs, please select product of log and type of log to be collected and collect instances.

![云产品日志源设置](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/GettingStarted/logsource.png)

3.	 For business application logs, the collection status shall be selected, the log file path and collection instance information shall be filled in, and senior configuration shall be set according to demands.

![业务应用日志源设置](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/GettingStarted/logsource-custom.png)

4.	 Click **Save** to enter the completion page. The page will automatically redirect to the log retrieval page 5 seconds later. Or, you can click **Log Dump** or **Log Monitoring** to create a dump task and a monitoring task.

![完成页面](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/GettingStarted/completed.png)

**Log Retrieval**
1.	Select the log subject to be viewed from the log subject list and click the **Log Retrieval** sub-menu.

2.	Enter keywords for retrieval in the full text retrieval input box and click the **Retrieval** button. Then, you can search satisfactory log information. 

![全文检索](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogSearch/logsearch01.jpg)

3.	Switch to the **Key Value Retrieval**, set log type Key, retrieval condition and retrieval value and click the **Retrieve** button. Then, you can search satisfactory log information.  

![键值检索](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogSearch/logsearch02.jpg)

**Log Dump**
1. Select a log subject to be dumped from the log subject list, click **Log Dump** on the sub-menu, click **Add** or click **Create Dump Task** on the "Dump Task List" Page.

![日志转储](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogTransfer/createLogTransfer01.jpg)

2. Fill in dump task configuration items according to business demands.

![创建转储任务](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogTransfer/createLogTransfer02.jpg)

**Log Monitoring**
1. Select a log subject to be monitored from a log subject list, click **Log Monitoring** in the menu and click **Add** or click **Create Monitoring Task** on the "Monitoring Task List" Page.

![日志监控](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogMonitor/logmonitor-1.jpg)

2. Fill in monitoring configuration items according to business demands.

![创建监控任务](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogMonitor/logmonitor-2.jpg)




