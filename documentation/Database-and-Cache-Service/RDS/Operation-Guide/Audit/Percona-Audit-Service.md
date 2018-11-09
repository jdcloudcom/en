# JCS for Percona Audit Service
After the log audit of the JCS for Percona service is started, all operation statistics of DML and DDL will be recorded.
JCS for SQL audit will not analyze the actual parameters, and a small number of records will be lost in case of heavy JCS for SQL queries. Therefore, the incremental data may be inaccurate by such statistics way.

## Precautions
* The JCS for SQL audit will only be displayed when the instance is in high security mode.
* The JCS for SQL statements executed through the console DMS tool will not be covered in the SQL audit. 

## Operation Steps
1. Login [RDS Management Console](https://rds-console.jdcloud.com/database).  
2. Select the instance that requires JCS for SQL audit query, click the target instance, enter the instance detailed page, and switch to the ***SQL Audit*** Tab page. The JCS for SQL audit query function are listed below.  
    * Execution Time: The time period of the JCS for SQL audit query can be one month earlier than the current time.
    * Database: Specified JCS for SQL statements of the database can be viewed.
    * Account: JCS for SQL statement of the specified account can be viewed.
    * Keywords: With specified keywords as the filtering condition, only JCS for SQL statements filtered out through specified keywords can be displayed.

    ! [Snapshot] (../../../../../1109_4.jpg)

3. Click ***Query*** to see a list of JCS for SQL that meets the requirements.
