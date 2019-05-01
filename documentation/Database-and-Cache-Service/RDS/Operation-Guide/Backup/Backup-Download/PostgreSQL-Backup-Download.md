# Backup download
When you want to get the backup data of Cloud Database PostgreSQL Instance, JD Cloud makes the Intranet address and the Internet address available for users to download.

## Note
* The Intranet address and Internet network address have a valid period. If the expiration date is due, the download button needs to be clicked to generate a download pop-up box to obtain a new address.

## Operation Steps
1. Login [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance of which the backup data needs to be downloaded, click target instance name to enter Instance Details page.
3. Select the ***Backup Management*** tag, select the backup data you want to download, and click ***Download*** in the bar of ***Operations***.
4. Backup download pop-up box parameter description
    * Intranet address: Provides the domain accessed by the Intranet. For example, you can access the address by Virtual Machines in the same VPC or subnet with the database instance, so as to download backup data.
    * Internet address: Provides the domain for public network access. You can download backup data through the Internet. The download speed is limited by the network bandwidth of the public network. Therefore, if your public network bandwidth is too small and the backup file is too large, the download time will be longer.
    * Click **Local Download** to download the backup data directly through the browser.
    * Click **Cancel** to discard the download of backup data.

![image2018-3-8 14_14_29.png](https://img1.jcloudcs.com/cms/9de5deac-1a4d-4bea-b6ad-3121e317935b20180308142747.png)
