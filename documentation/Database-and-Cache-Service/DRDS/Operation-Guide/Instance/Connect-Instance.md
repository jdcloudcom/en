# Connection Instance

Users can use the client of JCS for MySQL 5.6 or 5.7 on the virtual machine to connect to DRDS.

After JCS for MySQL client has been installed on JD Cloud virtual machine, it can enter command mode to connect DRDS.

1. Command format: mysql -h domain name -P port -u user name -p password.

2. Domain Name: the domain name of instance to be accessed, which the domain name is displayed on the details page of the instance.

3. Port: the number of ports is displayed on the details page of the instance.

4. User name: the user name of the instance

5. Password: the password corresponding to the user name.

Because DRDS is the middleware used for database and table sharding, it recommends users that they use JCS for MySQL client to data add, delete, modify, view data and create table, index and execute other basic SQL statements
