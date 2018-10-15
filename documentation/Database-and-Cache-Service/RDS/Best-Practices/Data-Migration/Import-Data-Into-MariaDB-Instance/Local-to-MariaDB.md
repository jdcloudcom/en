# Migrate from local MariaDB to JCS for MariaDB
We mainly discuss about how to migrate local self-created MariaDB to JCS for MariaDB. Instead of performing daily operation and maintenance, monitoring, backup and other operations by yourself in the case of using self-created local MariaDB, you can only concern use by using JCS for MariaDB.

## Precautions
* If you want to import data from local MariaDB into JCS for MariaDB, you need to take virtual machine as transmission medium.
* New JCS for MariaDB instance and the virtual machine shall be in the same ***virtual private cloud***.
* It shall ensure that the capacity space of new JCS for MariaDB instance is not less than that of local self-created JCS for MariaDB.

## Action Steps
1. Create JCS for MariaDB, the specific steps for creation see [Create Cloud Database RDS instance] (../../../Operation-Guide/Instance/Create-Instance.md).
2. Create the database through the console. It shall ensure that the name of local self-created MariaDB to be exported has been created in JCS for MariaDB as well. The specific creation steps see [Create Database] (../../../Operation-Guide/Database-Management/Create-Database.md).
3. Create database account through the console, which also can be the account used for creating JCS for MariaDB. Then grant ***read/write*** permission for the new database created in the step 2 of operation. Specific creation steps see [Create Account] (../../../Operation-Guide/Account/Create-Account.md).
4. After completion of JCS for MariaDB creation and initialization, it should begin to export data from local self-created MariaDB to local by executing the command

    ```
    mysqldump -u User name -p Password --single-transaction --set-gtid-purged=OFF -B Database name > /Path/Outputted file name.sql

    Parameter Description
        User Name: User name of self-built database.
        Password: Password of self-built database.
        Database Name: Fill in database names to be outputted and separate several database names with spaces.
    ```
    
5. After local self-created MariaDB data have been exported to local, it should begin to create VM instance next.
6. Create VM instance, and for specific creation steps, see [Create VM instance] (https://www.jdcloud.com/help/detail/303/isCatalog/1), when creating VM instance, the following points need to be concerned
    * Please ensure that the virtual machine and the JCS for MariaDB created in step 1 are in the same ***virtual private cloud***.
    * New virtual machine needs a ***Public IP*** to enable public network access, otherwise it cannot upload local data file to the virtual machine.
    * Please ensure that network ***ACL*** of subnet that the virtual machine is located allows local ssh to connect to virtual machine.

7. After completion of virtual machine creation, it can upload the data file of local to the virtual machine by executing the command

    ```
    scp /Path/Outputted file name.sql User name of virtual machine@Virtual machine public IP: /Virtual machine path

    Parameter Description
        User name of virtual machine: User name at the time of creating a virtual machine instance.
        Virtual Machine EIP: EIP address associated with virtual machine.
        Virtual Machine path: Storage path in virtual machine of files uploaded locally.
    ```

8. If there is no error notification, it means that the local file has successfully uploaded on the virtual machine. Then, it can import the data into JCS for MariaDB by executing the command

    ```
    mysql -u User name -p Password -h Cloud database domain name < /Virtual machine path/Outputted file name.sql

    Parameter Description
        User Name: User name in actions of step 3
        Password: Corresponding password of the user in actions of step 3
        Database domain name: the domain name of JCS for MariaDB can be viewed on Instance Details page.
    ```
9. If there is no error notification, it means the import is successful. You can login JCS for MariaDB to view whether the data has been imported actually.
