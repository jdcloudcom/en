# PostgreSQL Log Management
JD Cloud JCS for PostgreSQL provides detailed instance log, you can use log information to troubleshoot and optimize your application.

## Note
* The log file will only record Error Logs, Slow Query Logs by default, and if SQL audit is required to enable, it can be done by modifying parameters of the parameter set.
* SQL query records are slow query records controlled by the parameter ***log_min_duration_statement*** of parameter set, which currently is 1 s by default.
* SQL audit is disabled by default and can be enabled by modifying the value of parameter ***pgaudit.log*** of the parameter set.
* At present, JD Cloud does not charge for the bucket service for log files.

## View log files uploaded to Cloud Storage
1. Log in [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance of log file to be view and click the target instance name to enter the instance details.
3. Select the ***Log Management*** tag, then the error log and slow log files uploaded to Cloud Storage can be displayed.

![截图](../../../../../../image/RDS/Log-manager-2.jpg)

