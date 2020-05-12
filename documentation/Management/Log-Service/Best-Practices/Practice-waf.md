### Application Security Gateway Log
#### Application Scenarios 
Collect logs of Application Security Gateway through the Log Service, and perform query analysis on the collected Web security logs.
#### Precondition Description
- The Application Security Gateway Service has been enabled, and instance has been created

#### Configuration Process
1. Log in to the Console, and click **Cloud Service** -> **Monitoring, Operation and Maintenance** -> **Log Service** to enter the Log Overview Page. Click **Create Log Configuration**.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/bestpractice/BPwaf.png)

2. Select the existing log set log subject as required, or create a new log set log subject.

3. Select the product "Application Security Gateway", log type "security log", the Application Security Gateway instance to be collected as the collected instance, and click the **OK** button.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/bestpractice/BPwaf1.png)

#### Retrieval Log
1. 	Click **Query Log Now** after creation, or switch to the "Log Retrieval" page, select to collect the log sets and subjects of Application Security Gateway logs, and select the time frame to be queried, e.g. the last 1 hour;

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/bestpractice/BPwaf2.png)

2. 	Switch to "Key Value Retrieval" to use retrieval, select the KEY to be retrieved, and enter the value. A combination of multiple KEYs is supported, and the relation of these KEYs is and. 

3. 	Click the **Search** button to find out all log data meeting the retrieval conditions in the last 1 hour.
