# Backup Download
You can download the backup data of the JCS for MySQL instance service from the addresses of the intranet and internet provided by JD Cloud.

## Precautions
* The addresses of the intranet and internet have a valid period. If the expiration date is exceeded, the addresses will be invalid. Users can click the download button to generate the download pop-up box to get the new downloading address.

## Operation Steps
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the instance where the backup data download is required, click the name of the target instance, and enter the instance detailed page.
3. Select the tab of ***Backup Management***, select the backup data to be downloaded, and click ***Download*** in the column of ***Operation***.
4. Parameters of Backup Download Pop-up Box
    * Intranet Address: The domain name shall be provided to access the intranet, such as the access instance, can accessed from a VM on the same VPC or subnet as the database instance, for the downloading of backup data.
    * Internet Address: The domain name of public network shall be provided and users can download backup data through the internet. The download speed is limited by the network bandwidth of the public network. Therefore, if the public network bandwidth is too small and the backup file is too large, the download time will be comparatively long.
    * Click ***Local Download*** to download backup data directly from the browser.
    * Click ***Cancel*** to cancel the download of backup data.

![image2018-3-8 14_14_29.png](https://img1.jcloudcs.com/cms/9de5deac-1a4d-4bea-b6ad-3121e317935b20180308142747.png)
