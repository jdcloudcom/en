# Configure SSL

Connection of DRDS supports SSL encryption. SSL is a safety protocol which provides security and data integrity to network communication. With SSL, communication data security and integrity can be improved, but performance will be affected to some extent.

Notes for DRDS SSL are as follows
- By default, SSL function of DRDS is disabled and the user needs to manually disable the function via the Console.
- Connection between DRDS and a client supports SSL; connection between DRDS and backend RDS MySQL does not support SSL.
- The version supported by SSL protocol of DRDS is very low. It is suggested to use the client before mysql5.6.46.

# Enable/Disable SSL
1. Log in the Console, enter the Instance Details and select **Security Management
2. Click **Enable/Disable** to enable or disable SSL
3. Disabling or enabling of SSL on the Console can only take into effect after the SQL Server instance is restarted
Note: After SSL is enabled, database performance and CPU load will be affected to some extent. It is suggested to apply SSL based on test.

## Client Configuration
As DRDS is compatible with MySQL protocol, configuration of the DRDS client can refer to configuration document of RDS MySQL:
https://docs.jdcloud.com/en/rds/configure-ssl
