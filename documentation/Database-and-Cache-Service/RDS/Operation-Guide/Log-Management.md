# Log Management
JD Cloud MySQL/Percona/MariaDB service provide slow log statistics, slow log details, and users can optimize the application based on statistics.

## Operation Steps
1. Login [RDS Management Console](https://rds-console.jdcloud.com/database).    
2. Select and click the target instance, and then enter the instance detailed page.  
3. Click the Tab page of ***Performance Optimization***, select the time range, and query ***Slow Log Statistics*** or ***Slow Log Details***.
    * The list shows the default start time per statistics/execution, in reverse order.

|Query Item|Content|
|---|---|
|Slow Log Statistics|Statistical summary of SQL statements executed in the MySQL/Percona/MariaDB for more than 1 sec in 1 month, giving an analysis report of slow query logs|
|Slow Log Details|Records of the SQL statement executed in the cloud database MySQL/Percona/MariaDB for more than 1 second in 1 month. The last two hours of slow log are not provided in the list. Please query through the slow_log_view table in the Percona service library, if necessary.|
