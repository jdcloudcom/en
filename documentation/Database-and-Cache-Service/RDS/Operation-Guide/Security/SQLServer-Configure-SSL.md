# SQL Server SSL Configuration Method

Connection of JCS for SQL Server supports SSL encryption. SSL is a safety protocol which provides security and data integrity to network communication. With SSL, communication data security and integrity can be improved, but performance will be affected to some extent.

## Enable and disable SSL encryption
1. Log in the Console, enter the Instance Details and select **Security Management
2. Click **Enable/Disable** to enable or disable SSL
3. Disabling or enabling of SSL on the Console can only take into effect after the SQL Server instance is restarted

Note: After SSL is enabled, database performance and CPU load will be affected to some extent. It is suggested to apply SSL based on test.

## Client Configuration
For application of SSL in connection of SQL Server, please refer to official documents of SQL Server:

https://docs.microsoft.com/zh-cn/sql/connect/jdbc/connecting-with-ssl-encryption?view=sql-server-ver15

