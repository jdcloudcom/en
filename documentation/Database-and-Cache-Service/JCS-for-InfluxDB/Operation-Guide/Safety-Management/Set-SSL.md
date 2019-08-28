# Set SSL Encryption

By default, SSL Encryption is not enabled for InfluxDB instance. If your business has higher requirements for data transmission, please manually enable SSL Encryption.

## Note

- After SSL Encryption is enabled, the database performance will be affected to some extent. If the database is connected through an Intranet only, it is suggested that the SSL Encryption shall not be enabled.
- The SSL certificate is provided by JD Cloud, which is valid for 1 year generally. During certificate renewal, service will be interrupted for a short period and can be recovered in seconds generally.
- When businesses are normally enabled, please do not modify SSL enabling status.

## Operation Steps

1. Log in [InfluxDB Console](http://tsds-console.jdcloud.com/list).

2. On the "Instance List" page, select the target instance and click ** Instance Name** to go to the "Instance Details" page.

3. On the "Instance Details" page, click **Security Management** and **SSL Encryption** in turn to enter the "SSL Setting" page.

4. SSL Encryption and demand certificate can be enabled or disabled on the "SSL Setting" page.

   - Enable SSL Encryption

     Click **Enable** to enable SSL Encryption confirmation popup.

     ![154389185894](../../../../../image/JCS-for-InfluxDB/1564389185894.png)

     Click **OK** in the confirmation popup to enable SSL Encryption.

     ![156438914324](../../../../../image/JCS-for-InfluxDB/1564389214324.png)

   - Disable SSL Encryption

     Click **Disable** to turn on the confirmation popup for disabling SSL Encryption.

     ![1564389392203](../../../../../image/JCS-for-InfluxDB/1564389392203.png)

     Click **OK** in the confirmation popup to disable SSL Encryption.

     ![1564389367142](../../../../../image/JCS-for-InfluxDB/1564389367142.png)

   - Renewal SSL Certificate

     The SSL certificate is provided by JD Cloud and is valid for 1 year generally. Before expiration, you need to manually execute certificate demands.

     During renewal, service will be interrupted. Please do not renew the service at the business peak period.

     ![1564389549391](../../../../../image/JCS-for-InfluxDB/1564389549391.png)

     You can click the **Renew Certificate** button 1 month before the expiration period of the certificate and carry out certificate renew operation.

