# Data Transferring from Local Percona to JCS for Percona Service
It mainly explains how to transfer data from the local self-built Percona to the JCS for Percona service. The self-built Percona requires operations such as daily maintenance, monitoring and backup, while the JCS for Percona service spares these operations and only requires user's attention on the use.

## Precautions
* Use a VM as the transmission medium, if to import the data in local Percona to the JCS for Percona service.
* New JCS for Percona instance is required to share one ***Virtual Private Cloud*** with the VM.
* Ensure the capacity space of new Percona instance is not smaller than the local self-built Percona.

## Operation Steps
1. See specific steps of the JCS for Percona service creation in [Create Cloud Database RDS Instance](to be added).
2. Create a database via the console to ensure that the name of the database to be exported from the local self-built Percona is also created in the JCS for Percona service. See specific creation steps in [Create Database](to be added).
3. Create a database account via the console, or use the account that created for the Percona service creation, and then give this account the ***read/write*** authorization for the new database created in step 2. See specific creation steps in [Create Account](to be added).
4. Start exporting the data from the local self-built Percona to the local and execute the command after completing the creation and initialization of the JCS for Percona service.

    ```
    mysqldump -u User name -p Password --single-transaction --set-gtid-purged=OFF -B Database name > /Path/Outputted file name.sql

    Parameter Description
        User Name: User name of self-built database.
        Password: Password of self-built database.
        Database Name: Fill in database names to be outputted and separate several database names with spaces.
    ```
    
5. Start creating VM after exporting the local self-built Percona data to the local.
6. See specific steps of VM creation in [Create VM Instance](https://www.jdcloud.com/help/detail/303/isCatalog/1). Pay attention to following matters when creating VM instances.
    * Make sure that VM shares one ***Virtual Private Cloud*** with the JCS for Percona service created in step 1.
    * A new VM needs a **Public IP*** for public network access, otherwise local data files cannot be uploaded to the VM.
    * Make sure that ***Network ACL*** of the subnet where the VM exists, allows the local SSH to connect to the VM.

7. Upload the local data to the VM and execute the command after VM instance creation.

    ```
    scp /Path/Outputted file name.sql User name of virtual machine@Virtual Machine EIP: /Virtual Machine Path

    Parameter Description
        User name of virtual machine: User name at the time of creating a virtual machine instance.
        Virtual Machine EIP: EIP address associated with virtual machine.
        Virtual Machine path: Storage path in virtual machine of files uploaded locally.
    ```

8. Zero error prompt indicates that local files are successfully uploaded to the VM, and then users can import the data into the JCS for Percona service and execute the command.

    ```
    mysql -u User name -p Password -h Cloud database domain < /Virtual machine path/Outputted file name.sql

    Parameter Description
        User Name: User name in actions of Step 3
        Password: Corresponding password of the user in actions of Step 3
        Database domain: Please view domain of the JCS for Percona Service in the Details page of instance.
    ```
9. Zero error prompt indicates successful import. You can log in the Percona service to see if the data has been imported.
