# Modify Privilege

## Operation Steps
1. Enter the instance list page, click the instance name, enter the instance page, select [Account Management] page, and click ***Modify Privilege***.

![Modify Privilege 1](../../../../../image/RDS/Modify-Privilege-1.png)

2. In the Modify Permission pop-up dialog box, modify the permission of the designated user
* Global Permission: You can customize the global permission supported by the selected instance by owning all permissions of all databases under the instance.
* Database and Table Permission: You can define the fine-grained permission for databases and tables by configuring the permission of the designated database and table under the instance

![修改权限2](../../../../../image/RDS/Modify-Privilege-2.png)

The information on database and table permission supported by the instance is as follows:

|Type|Permission|
|-|-|
|  Database  |ALL, EVENT, EXECUTE, GRANT OPTION, LOCK TABLES, REFERENCES, ALTER, CREATE VIEW, CREATE, DELETE, DROP, INDEX, INSERT, SELECT, SHOW VIEW, TRIGGER, PDATE, ALTER ROUTINE, CREATE TEMPORARY TABLES, CREATE ROUTINE, PROCESS, SHOW DATABASES, REPLICATION SLAVE, REPLICATION CLIENT|
|  Table  |ALL, ALTER, CREATE VIEW, CREATE, DELETE, DROP, INDEX, INSERT, REFERENCES, SELECT, SHOW VIEW, TRIGGER, UPDATE|




