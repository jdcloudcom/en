# Create Read-only Proxy
The Cloud Database supports users in creating one or more read-only proxy/ proxies. In the application scenarios of having a small number of write requests but a large number of read requests to the Database, you can create one or more read-only instance(s), utilize the read-only instance(s) for the large number of read requests to the Database, and configure a read-only proxy for the read-only instance(s), to improve the load capacity to read the user database, and improve business availability.

## Restrictions
* Applicable to Cloud Database MySQL/Percona/MariaDB
* A RDS Instance allows the creation of 8 read-only proxies at most.

## Operation Steps
1. Log in [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance requiring for a read-only proxy, click the name of  the target instance to enter the Details of the instance.
3. Select the ***Read-only Instance Management*** tag, open the read-only proxy management page, click the ***Add Read-only Proxy*** button and create a read-only proxy.
4. Enter the name of the read-only proxy in the popup of ***Add Read-only Proxy***, click the **OK** button, and submit the request to create a read-only proxy.
    
    ![image2018-3-2 13_58_33.png](https://img1.jcloudcs.com/cms/e13a1926-043c-49e1-a94c-c27f1491f3bc20180302140739.png)

5. Upon successfully creating the read-only proxy, you can check the read-only proxy created by the current RDS Instance on the read-only proxy management page.

    ![image2018-3-2 13_58_33.png](https://img1.jcloudcs.com/cms/e13a1926-043c-49e1-a94c-c27f1491f3bc20180302140739.png)