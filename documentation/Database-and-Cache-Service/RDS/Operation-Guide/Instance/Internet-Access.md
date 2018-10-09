# Internet Access
Internet access configured with database instances

## Remarks
- Internet access is disabled by default for the sake of security.
- Set up a White List before enabling the internet access.
- Please wait for 3~5 minutes since it takes time for the domain name of the internet coming into effect.
- If the internet access is disabled, the access address will change the next time the internet access is enabled.**
- Access to the internet is temporarily free.

## 1. Enable Internet Access
1. Login the RDS console.
2. Select the instance that requires enabled internet access, click the target instance, and enter the instance detailed page.
3. Select the tag of ***Resource Information***. In the domain names section, click ***Enable Internet Access*** and a secondary confirmation pop-up window will display.

![Internet Access1](../../../image/RDS/Internet-Access-1.png)
4. Click ***OK*** in the secondary confirmation pop-up window.

![Internet Access 2](../../../image/RDS/Internet-Access-2.png)
5. After the internet access is enabled, the system will automatically allocate an internet domain name address.

![Internet Access 3](../../../image/RDS/Internet-Access-3.png)

## 2. Disable Internet Access
1. Login the RDS console.
2. Select the instance that requires disabled the internet access, click the target instance, and enter the instance detailed page.
3. Select ***Resource Information***. In the domain names section, click ***Disable Internet Access***.

![Internet Access 3](../../../image/RDS/Internet-Access-3.png)
4. In the confirmation pop-up window, click ***OK*** and the internet access of the system will be disabled.

![Internet Access 4](../../../image/RDS/Internet-Access-4.png)
