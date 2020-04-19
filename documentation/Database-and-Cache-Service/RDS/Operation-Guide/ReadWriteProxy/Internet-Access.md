# Internet Access
Configure the Internet access for the read-write separation proxy

## Remarks
- For the sake of security, Internet access is not recommended, which is therefore disabled by default.
- Please set the white list before enabling the Internet access.
- As the Internet domain will take effect after a certain period, please wait for 3~5 minutes with patience.
- If the Internet access is disabled, the access address will be changed if it is enabled at the next time**
- It is currently free to enable Internet access function

## I. Enable Internet Access
1. Log in [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance of which the read-only proxy Internet access needs to be enabled, click the name of the target instance and enter the Details of the instance.
3. Select the ***Read-write Proxy*** tag, and open the read-write proxy management page.
4. Upon clicking the **Enable the Read-write Proxy Internet Access** button, a secondary confirmation popup will pop up.
![外网访问1](../../../../../image/RDS/Internet-Access-ReadWriteProxy-default.png)

5. Click the **OK** button in the secondary confirmation popup.
![外网访问2](../../../../../image/RDS/Internet-Access-ReadWriteProxy-open.png)

6. After the Internet Access is enabled, the system will automatically allocate an Internet domain address.

## II. Disable Internet Access
1. Log in [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance of which the read-only proxy Internet access needs to be disabled, click the name of the target instance and enter the Details of the instance.
3. Select the ***Read-write Proxy*** tag, and open the read-write proxy management page.
4. Click the **Disable the Read-write Proxy Internet Access** button, and then click the **OK** button in the confirmation popup, thus disabling the Internet Access by the system.

