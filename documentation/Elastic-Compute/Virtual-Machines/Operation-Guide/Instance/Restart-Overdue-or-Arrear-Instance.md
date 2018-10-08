# Rerunning Expiration/Arrear Instance


After the monthly package instance expires or the billing instance paid by configuration is in arrears, JD Cloud will stop the service of the instance and set it to the "Stopped" status, and the instance data will remain for 7 days. During this period you can do the following to recover the instance service:

## Monthly Package Instance

Within 7 day after the expiration of the monthly package instance, you need the renewal operation. After the renewal is completed, your instance will be automatically started. After the start is completed, the instance will enter the "Running" status.

## Pay by Configuration Instance

Within 7 days after the billing paid by configuration instance arrears, you need to recharge the account. When the balance is automatically settled with the balance left, your instance will be automatically started. After the start is completed, the instance will enter the "Running" status.

**Note:**

If the instance fails to start automatically, please manually [Start Instance](Start-Instance.md).

The expiration/arrears of instance will affect your business continuity, so please renew/recharge in advance. You can also set the automatic renewal for the monthly package resources. Please refer to [Renew Management](http://docs.jdcloud.com/cn/online-buying/renew-management) for details.

In addition, it is recommended to set the relevant software to automatically start up at boot to ensure the continuity of the service. If there is a database to which the application service is connected, it needs to be set to an automatic reconnection mechanism in the program.

# Related Documents

[Start Instance](Start-Instance.md)

[Renew Management](http://docs.jdcloud.com/cn/online-buying/renew-management)