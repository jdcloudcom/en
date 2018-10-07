# Connection Instance
You can connect the instance through the JD Cloud DMS function and the local client can access the remote connection instance of the domain name through the internet if you purchased the instance of MySQL/Percona services. However, please provide right access control when the remote connection instance of the domain name is accessed via the internet, to ensure the database security.

## Connection Instances via DMS Function of Console
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the target instance to be connected and click ***Login Database*** in ***Operation*** column.
3. The login box interface of the DMS is as shown in the figure below, and the operating instructions of RDS connection is as follows.
    * Fill in the account number of RDS in the first row of textbox.
    * Fill in the correct password for RDS in the second row of textbox.
    * Click **Execute** to launch a request for RDS connection.
    ![4.png](https://img1.jcloudcs.com/cms/870cf55e-5a95-438e-b3e9-0015eee0bd8120170904172035.png)

## Connection to Database via JD Cloud VM
Users can access the database by entering the command line after the RDS client is installed in JD Cloud Machine.

1. Command Format: mysql-h Domain Name -P Port -u Username -p Password.
2. Domain Name: The domain name of the cloud database to be accessed shall be displayed in the detail page of the cloud database.
3. Port: The default link port number is 3306.
4. Username: Username for database creation.
5. Password: Password of the username.

## Connection Instances via Local Database Management Software
If the local database management software is required to connect to the MySQL/Percona/MariaDB service, the MySQL/Percona/MariaDB service does not support internet access in default. See the specific operation of manual open in [Open Internet Access](../../Operation-Guide/Instance/Internet-Access.md).
There are ways to access MySQL/Percona/MariaDB services, taking Sequel Pro software as an example.

### Operation Steps
1. Open the local database management software, and the specific parameters are as follows:
    * Host: Enter the full access domain name of MySQL/Percona/MariaDB services.
    * Username: Enter the account number of MySQL/Percona/MariaDB service.
    * Password: Enter the password for the account of MySQL/Percona/MariaDB service.
    * Port: Port 3306 in default, changes not required.

    ![Screenshot](https://img1.jcloudcs.com/cms/94be7bf2-3a37-4d1d-9add-cb35d27cc7aa20180803100645.jpeg)


2. Click on the connect button to connect to the cloud database instance. 
