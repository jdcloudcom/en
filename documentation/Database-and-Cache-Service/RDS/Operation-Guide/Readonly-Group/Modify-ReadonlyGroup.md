# Modify the read-only proxy associated to the read-only instance
You can modify the association relationship between the read-only instance and the read-only proxy depending on operational requirements. To re-balance the load, the database request connected to the read-only instance will be transiently disconnected once. Please make sure the application can be reconnected to the database.

## Operation Steps
1. Log in [Cloud Database RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance whose association relationship between the read-only instance and the read-only proxy needs to be modified, click the name of the target instance, and enter the Details of the instance.
3. Select the ***Read-only Instance Management*** tag, open the read-only instance management page, select the read-only page to be modified, and click the ***Modify*** button.
4. In the ***Modify Read-only Proxy*** popup, the selections provided to you are as follows:
    * Reselect a read-only proxy;
    * Delete the read-only proxy associated to the current read-only instance;
    
    ![image2018-3-2 13_58_33.png](https://img1.jcloudcs.com/cms/e13a1926-043c-49e1-a94c-c27f1491f3bc20180302140739.png)

5. Click the ***OK*** button and submit the request of modifying the read-only proxy.