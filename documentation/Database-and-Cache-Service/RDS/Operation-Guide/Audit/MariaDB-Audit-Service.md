# JCS for MariaDB Audit Service
After enabling log audit for JCS for MariaDB, statistics for all DML and DDL operation information will be performed.
SQL audit will not parse the actual parameter values and a few records will be lost when SQL queries are relatively large. So, it may be inaccurate to count accurate incremental data in this way.

## Precautions
* Only enabled with high security mode, the instance will display SQL audit function.
* The SQL statements executed by DMS tool of the console will not be contained in SQL audit. 

## Action Steps
1. Login [Cloud Database RD Management Console] (https://rds-console.jdcloud.com/database).  
2. Select the target instances need to query SQL audit. Click the target instance to enter Instance Details page, switch to ***SQL audit*** page, the SQL audit query functions is described as below.  
    * Execution time: You may choose to move up the time interval by one month from the current time as the SQL audit query time bucket.
    * Database: SQL statements that can view specified database.
    * Accounts: SQL statements that can view specified account.
    * Keyword: You may specify keywords as the filter condition of SQL statements that only display matched keywords.

    ! [Snapshot] (https://img1.jcloudcs.com/cms/0fb72d45-8e54-4ef9-a4c1-a1af3b66421020180319113956.png)

3. Click ***Query*** to view satisfactory SQL list.
