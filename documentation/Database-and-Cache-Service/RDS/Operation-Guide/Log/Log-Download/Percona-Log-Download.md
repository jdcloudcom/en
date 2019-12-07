# Percona Error Log and Slow Log Download
When you want to get original error log and slow log files of JCS for Percona instance, JD Cloud provides the Intranet address and the Internet address available for users to download.

## Note
* Intranet Address and Internet Address support customized validity. Wherein the shortest valid period can be accurate to seconds and the longest valid period can be accurate to hours.
* The Intranet address and Internet network address have a valid period. If the expiration date is due, the address will become invalid.

### Operation Steps
1. Login [RDS Management Console](https://rds-console.jdcloud.com/database).
2. Select the target instance requiring for Log Download, click target instance name to enter Instance Details.
3. Select the ***Log Management*** tag, select the log file you want to download, and click **Download** in the column of **Operations**.
4. Description of log download pop-up box parameters
    * Validity period of address: Intranet address and Internet address support customized validity period. If the validity period setting is due, corresponding addresses will become invalid and download is inaccessible. Such validity period is 1 second minimum and 24h maximum.
    * Intranet Address: Provide the domain accessed by the Intranet. For example, you can access the address by Virtual Machines in the same VPC or Subnet with the Database Instance, so as to download log files.
    * Internet Address: Provide the domain accessed by the public network. You can download backup data through the Internet. The download speed is limited by the network bandwidth of the public network. Therefore, if your public network bandwidth is too small and the log file is too large, the download time will be longer.
    * Click **Local Download** button to download the log files directly through the browser.
    * Click **Cancel** button to discard the download of log files.

![截图](../../../../../../image/RDS/log-download.jpg)

