# MariaDB Backup Download
When you want to get the backup data of JCS for MariaDB Instance, JD Cloud provides the Intranet address and the Internet address available for users to download.

## Note
* The Intranet address and Internet network address have a valid period. If the expiration date is due, **Download** needs to be clicked to generate a download pop-up box to obtain a new address.

## Operation Steps
1. Login [Cloud Database RDS console](https://rds-console.jdcloud.com/database).
2. Select the target instance which the backup data needs to be downloaded, click target instance name to enter Instance Details page.
3. Select **Backup Management**, select the backup data you want to download, and click **Download** in the bar of **Operations**.
4. Backup download pop-up box parameter description
    * Validity period of address: Intranet address and Internet address support customized validity period. If the validity period setting is due, corresponding addresses will become invalid and download is inaccessible. Such validity period is 1 second minimum and 24h maximum.
    * Intranet address: Provide the domain accessed by the Intranet. For example, you can access the address by Virtual Machines in the same VPC or subnet with the database instance, so as to download backup data.
    * Internet address: Provide the domain for public network access. You can download backup data through the Internet. The download speed is limited by the network bandwidth of the public network. Therefore, if your public network bandwidth is too small and the backup file is too large, the download time will be longer.
    * Click **Local Download** to download the backup data directly through the browser.
    * Click **Cancel** to discard the download of backup data.

![backup](../../../../../../image/RDS/backup_download.jpg)
