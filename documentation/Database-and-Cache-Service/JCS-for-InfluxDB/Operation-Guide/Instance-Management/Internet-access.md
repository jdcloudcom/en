# Internet Access

For the sake of security, Internet access is not recommended, which is not enabled for InfluxDB instance by default. If Internet access is required by your business indeed, please enable it manually. To guarantee connection security, it is recommended to set a whitelist and enable SSL Encryption.

## Note

- As the Internet domain will take effect after a certain period, please wait for 3~5 minutes with patience.
- If the Internet access is disabled, the access address will be changed if it is enabled at the next time.

## Operation Steps

1. Log in [InfluxDB Console](http://tsds-console.jdcloud.com/list).

2. On the "Instance List" page, select the target instance and click ** Instance Name** to go to the "Instance Details" page.

3. In the connection information module, click **Enable Internet Access** to turn on the confirmation popup.

   ![1564391107320](../../../../../image/JCS-for-InfluxDB/1564391107320.png)

4. Click **OK** in the confirmation popup to enable Internet access.

5. The created Internet domain will be displayed in the connection information module. If not required, please click **Disable Internet Domain**.

   