# Migrate from virtual machine MariaDB to JCS for MariaDB 
We mainly discuss about how to migrate self-created MariaDB Service from virtual machine to JCS for MariaDB. Instead of performing daily operation and maintenance, monitoring, backup and other operations by yourself in the case of using self-created local MariaDB, you can only concern use by using JCS for MariaDB.

## Precautions
* New JCS for MariaDB instance and the virtual machine shall be in the same ***virtual private cloud***.
* It shall ensure that the capacity space of new JCS for MariaDB instance is not less than that of virtual machine self-created JCS for MariaDB.

## Action Steps
1. Create JCS for MariaDB, the specific steps for creation see [Create Cloud Database RDS instance] (../../../Operation-Guide/Instance/Create-Instance.md).
2. Create the database through the console. It shall ensure that the name of virtual machine self-created MariaDB to be exported has been created in JCS for MariaDB as well. For specific creation steps, see [Create Database] (../../../Operation-Guide/Database-Management/Create-Database.md).
3. Create database account through the console, which also can be the account used for creating JCS for MariaDB. Then grant ***read/write*** permission for the new database created in the step 2 of operation. Specific creation steps see [Create Account] (../../../Operation-Guide/Account/Create-Account.md).
4. After completion of JCS for MariaDB creation and initialization, it should begin to export data from virtual machine self-created MariaDB to local by executing the command

    ```
    mysqldump -u User name -p Password --single-transaction --set-gtid-purged=OFF -B Database name > /Path/Outputted file name.sql

    Parameter Description
        User name: User name of self-built database.
        Password: Password of self-built database.
        Database name: Fill in database names to be outputted and separate several database names with spaces
    ```

5. After self-created MariaDB has been exported from virtual machine to local, it can import the data into JCS for MariaDB by executing the command

    ```
    mysql -u User name -p Password -h Cloud database domain name < /Path/Outputted file name.sql

    Parameter Description
        User name: User name in actions of step 3
        Password: Corresponding password of the user in actions of step 3
        Database domain name: the domain name of JCS for MariaDB can be viewed on Instance Details page.
    ```
    
6. If there is no error notification, it means the import is successful. You can login JCS for MariaDB to view whether the data has been imported actually.
