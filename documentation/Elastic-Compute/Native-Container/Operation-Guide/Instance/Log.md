
# Log

**Operation Instructions**

* The Native Container Instance or Native Container Pod in the middle state cannot view the log operation.

* Print the standard container outputs, such as stdout and stderr, of the Native Container Instance or the Native Container Pod and save the historic logs since the current time. The maximum log saving capacity for log is 10M. Upon reaching the maximum log saving capacity, the historical log will be automatically deleted.

* Maximum byte number returned by single query log is 4K

**Operation Guide for Native Container Instance**

1. Open JD Cloud Console and select **Elastic Compute**-**Native Container**-**Instance** to enter into the Containers List page;

2. Select container of which you want to check the log and click **Check log** button in the operation column, then the page will skip to **Check log** of the details page; you can also select **Check log** Tab in the details page of the container directly to check the container log;

3. You may also enter query conditions in **Check log**, and it currently support selecting container log according to number of output rows of log, output time of log and maximum bytes of log.

**Operation Guide for Native Container Pod**

1. Open JD Cloud console, select [Elastic Compute] - [Native Container] - [Pod] - [Pod Name] to enter the Tab of Pod detail log;

2. Select containers whose logs are to be viewed and click **Query** to query logs of specified containers;

3. You may set the query conditions and return corresponding container logs depending on query conditions. At present, the screen of container logs based on log output rows, time interval and maximum byte number are supported.
* Log output rows: The maximum rows of outputted log for single request is 4096;
* Maximum log byte number: The maximum byte number of outputted log for single request is 4KB;
* Time interval: set start time and end time for log query;