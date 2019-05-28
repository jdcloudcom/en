# Log Management
JCS for  MySQL/Percona/MariaDB service provide slow log statistics, slow log details, and users can optimize the application based on statistics.

## Operation Steps
1. Login [RDS Management Console](https://rds-console.jdcloud.com/database).    
2. Select and click the target instance, and then enter the instance detailed page.  

### View slow logs
3. Click the Tab page of ***Performance Optimization***, select the time range, and query ***Slow Log Statistics*** or ***Slow Log Details***.
    * The list shows the default start time per statistics/execution, in reverse order.

|Query Item|Content|
|---|---|
|Slow Log Statistics|Statistical summary of SQL statements executed in the JCS for MySQL/Percona/MariaDB for more than 1 sec in 7 days, giving an analysis report of slow query logs;|
|Slow Log Details|Records of the SQL statement executed in the cloud database JCS for MySQL/Percona/MariaDB for more than 1 second in 7 days. The last two hours of slow log are not provided in the list. Please query through the slow_log_view table in the Percona service library, if necessary. Slow logs for the last two hours are not available in this list. Please search through the slow_log_view table in the Cloud Database MySQL/Percona/MariaDB if needed|

### Download slow logs
3. Click the Tab page ***Performance Optimization***, select the time range and search ***Slow Log Statistics*** or ***Slow Log Details***.
4. Click ***Download*** on the upper right corner of the list page and the search result on the current page can be downloaded to the local directory in the ***excel*** format.


