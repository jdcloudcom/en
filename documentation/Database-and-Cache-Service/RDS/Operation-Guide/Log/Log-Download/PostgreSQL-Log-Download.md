# PostgreSQL Log Download
When you want to get the log file of JCS for PostgreSQL instance, JD Cloud provides the Intranet address and the Internet address available for users to download.

## Note
* Intranet Address and Internet Address support customized validity. Wherein the shortest valid period can be accurate to seconds and the longest valid period can be accurate to hours.
* The Intranet address and Internet network address have a valid period. If the expiration date is due, the address will become invalid.

### Operation Steps
1. Login [RDS Management Console](https://rds-console.jdcloud.com/database).
2. Select the target instance requiring for Log Download, click target instance name to enter Instance Details.
3. Select the ***Log Management*** tag, select the backup data you want to download, and click **Download** in the column of **Operations**.
4. Description of log download pop-up box parameters
    * Intranet Address: Provide the domain accessed by the Intranet. For example, you can access the address by Virtual Machines in the same VPC or Subnet with the Database Instance, so as to download log files.
    * Internet Address: Provide the domain accessed by the public network. You can download backup data through the Internet. The download speed is limited by the network bandwidth of the public network. Therefore, if your public network bandwidth is too small and the log file is too large, the download time will be longer.
    * Address Validity Time: Support to modify the validity of Intranet Address, Internet Address; after modifying the valid time, and click ***Connection Refresh*** button, new Intranet Address, Internet Address will be generated, and the validity of new address will be the value you specified.
    * Click **Local Download** button to download the log files directly through the browser.
    * Click **Cancel** button to discard the download of log files.

![截图](../../../../../../image/RDS/Log-manager-1.jpg)

