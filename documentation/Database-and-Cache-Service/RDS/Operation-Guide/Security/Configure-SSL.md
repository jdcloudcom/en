# Configure SSL Certificate 
JCS for MySQL, MariaDB, Percona connection methods can be either plain-text or encrypted, and encrypted, and you need to configure SSL certificates in the connection parameters if it supports the encrypted method.
When the encrypted connection method is adopted, even if you access the JCS for MySQL, MariaDB and Percona through the public network, even if the data transmission is intercepted, the transmission is encrypted and cannot be recognized.

## Note
* The old instance does not have SSL feature enabled. If you want to enable it, you need to manually enable it
* The SSL feature of newly purchased instance is enabled by default, which is not allowed to be disabled

## Operation Steps
1. Click to download [SSL Certificate](https://jddb-common-public.s3.cn-north-1.jdcloud-oss.com/jdcloud-rds-ca.pem)
2. After downloading the SSL certificate, you can access JCS for MySQL using an encrypted connection

> Take MySQL 5.7 as an example, connect to the database by the method of the command line

```
# SSL certificate is the path of the certificate file downloaded in the previous step

mysql -h [Domain] -P [Port] -u [User Name] -p [Password] --ssl-ca [SSL Certificate]
```

When the JCS for MySQL is successfully connected, the encrypted connection has been successfully established

