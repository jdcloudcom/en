# Upgrade JCS for MySQL Version
Here is the descriptions on how to upgrade the JCS for MySQL version to a higher version JCS for MySQL. Take the upgrade of JCS for MySQL 5.7 to MySQL 8.0 for example as below.

## Note
* Please ensure the installation of the client of MySQL 8.0. 
* The new Virtual Machines need to be in the same ***VPC*** as the MySQL 5.7 instance.
* The new MySQL 8.0 instance needs to be in the same ***VPC*** as the MySQL 5.7 instance.
* It shall ensure that the capacity space of the new MySQL 8.0 instance is not less than that of the original MySQL 5.7 instance.

## Operation Steps
1. Create VM instance, and for specific creation steps, see [Create VM instance] (https://www.jdcloud.com/help/detail/303/isCatalog/1), when creating VM instance, the following points need to be concerned
    * Please ensure that the Virtual Machines are in the same ***VPC*** as the JCS for MySQL 5.7 instance requiring version upgrade.
    * New Virtual Machines need an ***EIP*** to enable public network access, otherwise it cannot remotely log in the Virtual Machines.
    * Please ensure that network ***ACL*** of subnet that the Virtual Machines are located at allows local ssh to connect to Virtual Machines.
2. After VM instance creation, remotely log in the Virtual Machines to install the client of MySQL 8.0. For client installation document, see [Download Link](https://dev.mysql.com/downloads/mysql/5.5.html?os=31&version=5.1), for client, see [Installation Tutorial](https://dev.mysql.com/doc/refman/8.0/en/linux-installation-rpm.html)
3. After installing client, begin to export the data from JCS for MySQL 5.7 to local Virtual Machines and execute the command

    ```
    mysqldump -u User name -p Password -R -E --skip-tz-utc --opt --skip-add-drop-table --single-transaction --hex-blob --default-character-set=binary --master-data=2 -B Database name > /Path/Export file name.sql

    Parameter Description
        User Name: User Name of Cloud Database
        Password: Password of Cloud Database
        Database Name: Fill in database names to be outputted and separate several database names with spaces.
    ```

4. After exporting the data of JCS for MySQL 5.7, begin to create JCS for MySQL 8.0. For specific steps for creation, please refer to [Create JCS for MySQL instance](../../../Operation-Guide/Instance/Create-Instance.md).
5. Create the database through the console. It shall ensure that the name of JCS for MySQL 5.7 to be exported has been created in JCS for MySQL 8.0 as well. For specific steps for creation, please refer to [Create Database] (../../../Operation-Guide/Database-Management/Create-Database.md).
6. Create the database account through the console and grant the ***read-write*** permission of the database newly created in Step 5. For specific steps for creation, please refer to [Create Account](../../../Operation-Guide/Account/Create-Account.md).

7. Import the data that is exported in Step 3 to the new JCS for MySQL 8.0 and execute the command

    ```
    mysql -u User name -p Password -h Cloud database domain --default-character-set=binary < /Path/Export file name.sql

    Parameter Description
        User Name: User Name in Actions of Step 6.
        Password: Corresponding Password of the User in Actions of Step 6.
        Database Domain: Please view domain of JCS for MySQL 8.0 in the Details of instance.
    ```
    
6. If there is no error notification, it means the import is successful. You can log in JCS for MySQL 8.0 to view whether the data has been actually imported.
