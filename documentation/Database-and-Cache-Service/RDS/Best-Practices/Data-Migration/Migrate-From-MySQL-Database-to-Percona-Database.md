# Data Transferring from JCS for MySQL Service to Percona Service
It mainly explains how to transfer data from JCS for MySQL service to JCS for Percona service. The JCS for Percona service provides some more-advanced functions and characteristics than the JCS for MySQL service does, and see the detailed comparison between JCS for Percona and JCS for MySQL in [Official Manual of JCS for Percuna](https://www.percona.com/software/mysql-database/percona-server/feature-comparison).

## Precautions
* Use the VM as the transmission medium if to import the data from the JCS for MySQL service to the JCS for Percona service.
* Create an instance of the JCS for Percona service, and the VM is required to share one Virtual Private Cloud with the JCS for MySQL service.
* Ensure the capacity space of the new instance of the Percona service not smaller than the JCS for MySQL service.

## Operation Steps
1. See specific steps of VM creation in [Create VM Instance](https://www.jdcloud.com/help/detail/303/isCatalog/1). Pay attention to following matters when creating VM instances.
    * Make sure that the VM shares one ***Virtual Private Cloud*** with the JCS for MySQL service.
    * Make sure that ***Network ACL*** of the subnet where the VM exists, is allowed to access the JCS for MySQL service.
2. Start exporting the data from the JCS for MySQL service to the VM and execute the command after VM instance creation in completed.

    ```
    mysqldump -u User name -p Password --single-transaction  --set-gtid-purged=OFF -B Database name > /Path/Outputted file name.sql

    Parameter Description
        User Name: User Name in JCS for MySQL Service.
        Password: Password in JCS for MySQL Service
        Database Name: Fill in database names to be outputted and separate several database names with spaces.
    ```

3. Create the Percona service after exporting data from the JCS for MySQL service to the VM.
4. See specific steps of the Percona service creation in [Create Cloud Database RDS Instance](to be added).
5. Create a database via the console to ensure that the name of the database to be exported from the JCS for MySQL service is also created in the JCS for Percona service. See specific creation steps in [Create Database](to be added).
6. Create a database account via the console, or use the account that created for the Percona service creation, and then give this account the read-write authorization for the new database created in Step 2. See specific creation steps in [Create Account](to be added).
7. Start importing the data from the VM to the JCS for Percona service and execute the command after completing the creation and initialization of the Percona service.

    ```
    mysql -u User name -p Password -h Cloud database domain < /Virtual machine path/Outputted file name.sql

    Parameter Description
        User name: User name in actions of Step 6.
        Password: Corresponding password of the user in actions of Step 6.
        Database domain: Please view domain of the JCS for Percona Service in the Details page of instance.
    ```

8. Zero error prompt indicates successful import. You can log in the JCS for Percona service to see if the data has been imported.
