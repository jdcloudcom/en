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

**Retrieval Log**
1. 	Select the log subject to be viewed in the log subject list, click **Retrieve**, or switch to **Log Retrieval** module in the left menu to select the log collection and log subject to be queried.  

![检索-1](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/js-1.png)
2. 	Enter the query content in the full-text input box and click **Retrieve** to query the log information that meets the conditions.  

![检索-2](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/js-2.jpg)
3. 	Switch to the key value index, set the log type Key, retrieval conditions and retrieval values, click the Retrieve button to query the log information that meets the conditions.  

![检索-3](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/js-3.png)

