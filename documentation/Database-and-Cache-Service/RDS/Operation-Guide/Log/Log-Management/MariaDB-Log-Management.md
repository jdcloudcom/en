# MariaDB Log Management
JD Cloud JCS for MariaDB provides original instance logs, facilitating you to make log analysis with existing tools and debug and optimize applications.

JCS for MariaDB instances will automatically synchronize the latest instance log files to Cloud Storage per 5 minutes and output a new log file per hour or per file greater than 128MB.

## Note
* Log management will only display error logs and slow logs.
* At present, JD Cloud does not charge for the bucket service for error logs and slow logs.

## View log files uploaded to Cloud Storage
1. Log in [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance of original error log and slow log files to be view and click the target instance name to enter the instance details.
3. Select the ***Log Management*** tag, then the error log and slow log files uploaded to Cloud Storage can be displayed.

![截图](../../../../../../image/RDS/log-manager.jpg)

