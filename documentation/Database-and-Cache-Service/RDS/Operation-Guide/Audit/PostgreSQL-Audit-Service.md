# PostgreSQL Audit Service
After enabling log audit for JCS for PostgreSQL Audit Service, statistics for all DML and DDL operation information will be performed.
SQL audit will not parse the actual parameter values and a few records will be lost when SQL searches are relatively large. So, it may be inaccurate to count accurate incremental data in this way.

## Notes
* SQL audit function is disabled by default, and is required to be enabled actively

## Operation Steps
1. Log in [RDS Management Console](https://rds-console.jdcloud.com/database).  
2. Select the target instances need to query SQL audit. Click the target instance to enter Instance Details, switch to ***SQL Audit*** Tab page, the SQL audit search functions is described as below.  
    * Executive Time: You may choose to move up the time interval by 7 days from the current time as the SQL audit search time bucket.
    * Database: SQL statements that can view specified database.
    * Account: SQL statements that can view specified account.

    ![截图](../../../../../image/RDS/pg-audit.png)

3. Click ***Search***button to view satisfactory SQL list.
