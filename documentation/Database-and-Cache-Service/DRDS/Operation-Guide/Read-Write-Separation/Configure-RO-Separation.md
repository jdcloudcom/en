# DRDS Read-write Separation Settings

**Preconditions**
Before setting DRDS read-write separation, you need to configure the read-only instance and read-only proxy for RDS MySQL in this DRDS backend. For specific method, users can refer to [Read-only Instance Help Documentation](https://docs.jdcloud.com/cn/rds/create-readonly-instance) and [Read-only Proxy Help Documentation](https://docs.jdcloud.com/cn/rds/create-readonlygroup)

## 1. Configure Read-write Separation of Database
1) Log in **Database Information** page of DRDS instance, click **Database Name** to log in the database setting page. 
2) Click **Configure Read-only Proxy** to perform the settings of read-only instance or read-only proxy for current database.

![读写分离配置1](../../../../../image/DRDS/set-ro-sep-1.png)

3) In the popup window, the left list indicates the RDS MySQL of this database backend and the right list indicates the read-only instance or read-only proxy related to the selected RDS MySQL. <br>
For every RDS MySQL in the left list, users can select to associate a read-only instance/proxy with RDS MySQL by clicking **Read-only Instance** or **Read-only Proxy**. <br>
**Giving preference to read-only proxy is recommended so as to obtain high availability of read-only operations.** <br>

![读写分离配置2](../../../../../image/DRDS/set-ro-sep-2.png)

4) Notes Users need to set read-only proxy/instance for every RDS MySQL. Otherwise, the application will show error because it cannot access the read-only instance/proxy of RDS MySQL. Users can check whether all RDS MySQLs are configured through the notification information on left bottom of the window

## 2. Set Read-write Separation Permission to Account
DRDS has added two new account permissions to set operations related to read-write separation. The current account permission is specified as follows:
- rw: It has read-write permission to the database primary node and all SQLs are sent to RDS MySQL primary node.
- ro: It has read permission to the database primary node and all SQLs are sent to RDS MySQL primary node.
- rws: It has read-write permission to the database primary node and read permission to the read-only nodes; in accordance with the [Automatic Read-write Separation Rules] (users may refer to relevant parts in DRDS Read-write Separation Overview), some SQLs are forwarded to the read-only nodes of RDS MySQL and the remaining SQLs will be sent to RDS MySQL primary node.
- ros: It has read permission to the database read-only node and all SQLs are forwarded to the read-only nodes of RDS MySQL. If a RDS MySQL has no read-only node, an error will be reported when SQLs are executed.

rws and ros are related to read-write separation. If a user needs to use read-write separation function, he or she needs to grant permissions to the corresponding database account. 

## 3. Cancel Read-write Separation Settings
On the DRDS database setting page, click **Cancel Read-only Proxy** and then confirm it on the popup window.
