# VM Settings
Since the SQL Server service is created in the VPC, it is required to **deploy the database instance and the VM which hosts applications and client on the same VPC**, in the case of no direct connection. The security group shall be linked during VM creation, so the security group of VM shall be set in a reasonable way.
1. If security group is not created by users, all ports of the security group are open in default. In such case, VM can access the database, but with security risks, so it is recommended to create a new special security group, and see specific configuration below.
2. If users select another security group, the security group shall be configured as: **Port 1433 allowed by outbound rules**.

The specific setting method is as follows:
1. Click the link below for security group creation: https://www.jdcloud.com/help/detail/1486/isCateLog/1
2. Add "Outbound Rules" in the security group of the VM that requires the access to SQL Server, select [MSSQL] ** (Attention: Not MYSQL) **, and click ***Accept*** the strategy.
![Connection 1 via VM](../../../image/RDS/Instance-Connection-SQLServer-1.png)


