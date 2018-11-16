# Data Transferring from VM Percona to the JCS for Percona Service 
It mainly explains how to transfer data from the self-built VM Percona to the JCS for Percona service. The self-built Percona requires operations such as daily maintenance, monitoring and backup, while the JCS for Percona service spares these operations and only requires user's attention on the use.

## Precautions
* New JCS for Percona instance is required to share one ***Virtual Private Cloud*** with the VM.
* Ensure the capacity space of the new Percona instance not smaller than the JCS for Percona self-built in VM.

## Operation Steps
1. See specific steps of the JCS for Percona service creation in [Create Cloud Database RDS Instance](to be added).
2. Create a database via the console to ensure that the name of the database to be exported from the self-built VM Percona is also created in the JCS for Percona service. See specific creation steps in [Create Database](to be added).
3. Create a database account via the console, or use the account that created for the Percona service creation, and then give this account the ***read/write*** authorization for the new database created in step 2. See specific creation steps in [Create Account](to be added).
4. Export the data from the self-built Percona of the VM to the local of the VM and execute the command after completing the creation and initialization of the JCS for Percona service.

    ```
    mysqldump -u User name -p Password --single-transaction --set-gtid-purged=OFF -B Database name > /Path/Outputted file name.sql

    Parameter Description
        User Name: User name of self-built database.
        Password: Password of self-built database.
        Database Name: Fill in database names to be outputted and separate several database names with spaces.
    ```

5. Import the data into the JCS for Percona service and execute the command after exporting self-built Percona data from the VM to the local.

    ```
    mysql -u User name -p Password -h Cloud database domain < /Path/Outputted file name.sql

    Parameter Description
        User Name: User name in actions of Step 3
        Password: Corresponding password of the user in actions of Step 3
        Database domain: Please view domain of the JCS for Percona Service in the Details page of instance.
    ```
    
6. Zero error prompt indicates successful import. You can log in the JCS for Percona service to see if the data has been imported.
