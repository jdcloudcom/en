### Application Security Gateway Log
#### Application Scenarios 
Collect logs of Application Security Gateway through the Log Service, and perform query analysis on the collected Web security logs.
#### Precondition Description
- The Application Security Gateway Service has been enabled, and instance has been created
- The log collection and log subject have been created

#### Configuration Process
1. 	Enter the log collection management page, select the created log collection, click **View**, enter the log details page, select the collection configuration "unconfigured" status log subject, click **Collection Configuration** to enter the collection configuration page.
2. 	Click **Add Collection Configuration** to enter the adding collection configuration page.
3. 	Select the product "Application Security Gateway", log type "Web Security Log", select **All** for the collection instance, and click **OK**.

#### Retrieval Log
1. 	Switch to the "Log Retrieval" page, select the log collection and log subject of the Application Security Gateway Log, and select the query period of the past 6 hours;
2. 	Switch to **Key Value Index** and use quick retrieval; the key value shall be configured as follows, 
remote_addr = 10.253.253.6
request_method = Get
3. 	Click **Search** to find all the log record information with the source address "10.253.253.6" and the request mode as "Get".
