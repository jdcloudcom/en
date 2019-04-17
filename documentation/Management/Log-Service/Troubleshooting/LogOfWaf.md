# Application Security Gateway Log
## Application Scenarios 
&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Collect logs of Application Security Gateway through the Log Service, and perform query analysis on the collected Web security logs.
## Precondition Description
- The Application Security Gateway Service has been enabled, and instance has been created
- The log collection and log subject have been created

## Configuration Process
1. 	Enter the log collection management page, select the created log collection, click **View**, enter the log details page, and select the collection configuration "unconfigured" status log subject.  
![日志集详情](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/rzjxq-3.png)
2. Click **Management**->**Collection Configuration** under the operation column to enter the collection configuration page.  
![采集配置页](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/cjpz-1.png)
3. 	Click **Add Collection Configuration** to enter the adding collection configuration page.  
![添加采集配置](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/tjcjpz.png)
3. 	Select the product "Application Security Gateway", log type "Web Security Log", select **All** for the collection instance, and click **OK**.

## Retrieval Log
1. 	Switch to the "Log Retrieval" page, select the log collection and log subject of the Application Security Gateway Log, and select the query period;  
![检索-0](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/js-0.png)
2. 	Switch to **Key Value Index** and use quick retrieval; the key value shall be configured as follows, 
server_addr = 10.253.253.6  
server_protocol = https  
![检索-0](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/js-4.png)

3. Click **Search** to find all the log record information with the server_addr "10.253.253.6" and the server_protocol as "https".
