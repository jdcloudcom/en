
# JDW Audit Service
Data Warehouse JDW Audit Service will make statistics on all DML and DDL operations after the log audit is enabled.
SQL audit will not parse actual parameters and a few records may be lost when the SQL query quantity is large. Therefore, statistics on accurate incremental data with this method may be inaccurate.

## Notes
* The SQL audit function is disabled by default and shall be enabled;


## Operation Steps
1. Log in to [JDW Console](https://jdw-console.jdcloud.com/list).  
2. Select the target instance for SQL audit query, click the target instance to enter the instance details, and switch to ***SQL Audit*** Tab page. SQL audit query function is described as follows.  
    * Audit start time: You can select a timeframe 7 days before the current time as the time to start the query on SQL audit.
    * Database: You can view the SQL sentences of the specified database.
    * Account: You can view the SQL sentences of the specified account.

    ![9](../../../image/RDS/JDW-SQL-Audit.png)

3. Click the ***Query*** button to view the SQL lists meeting requirements.
