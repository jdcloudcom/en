# PostgreSQL Log Management
JD Cloud JCS for PostgreSQL provides detailed instance log, you can use log information to troubleshoot and optimize your application.

## Note
* The log file will only record Error Logs, Slow Query Logs by default, and if SQL audit is required to enable, it can be done by modifying parameters of the parameter set.
* SQL query records are slow query records controlled by the parameter ***log_min_duration_statement*** of parameter set, which currently is 1 s by default.
* SQL audit is disabled by default and can be enabled by modifying the value of parameter ***pgaudit.log*** of the parameter set.

## Log Download
### Note
* The Intranet address and Internet network address have a valid period. If the expiration date is due, the download button needs to be clicked to generate a download pop-up box to obtain a new address.
* Intranet Address, Internet Address support customized validity, wherein the shortest valid period can be accurate to the second, the longest valid period can be accurate to the hour.

### Operation Steps
1. Login [Cloud Database RD Management Console](https://rds-console.jdcloud.com/database).
2. Select the target instance requiring for Log Download, click target instance name to enter Instance Details.
3. Select the ***Log Management*** tag, select the backup data you want to download, and click **Download** in the column of **Operations**.
4.Description of log download pop-up box parameter
    * Intranet Address: Provide the domain accessed by the Intranet. For example, you can access the address by Virtual Machines in the same VPC or Subnet with the Database Instance, so as to download log files.
    * Internet Address: Provide the domain accessed by the public network. You can download backup data through the Internet. The download speed is limited by the network bandwidth of the public network. Therefore, if your public network bandwidth is too small and the log file is too large, the download time will be longer.
    * Address Validity Time: Support to modify the validity of Intranet Address, Internet Address; after modifying the valid time, and click *** Connection Refresh *** button, new Intranet Address, Internet Address will be generated, and the validity of new address will be the value you specified.
    * Click **Local Download** button to download the log files directly through the browser.
    * Click **Cancel** button to discard the download of log files.

![截图](../../../../../image/RDS/Log-manager-1.jpg)

