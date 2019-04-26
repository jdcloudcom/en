# Migrate from local PostgreSQL to JCS for PostgreSQL
We mainly discuss about how to migrate local self-created PostgreSQL to JCS for PostgreSQL of JD Cloud. Instead of performing daily operation and maintenance, monitoring, backup and other operations by yourself in the case of using self-created local PostgreSQL, you can only concern use by using JCS for PostgreSQL of JD Cloud.

## Note
* If you want to import data from local PostgreSQL into JCS for PostgreSQL, you need to take Virtual Machines as transmission mediums.
* New PostgreSQL instances and Virtual Machines shall be in the same ***VPC***.
* It shall ensure that the capacity space of new PostgreSQL instance is not less than that of local self-created PostgreSQL.

## Operation Steps
1. Create JCS for PostgreSQL, and for specific creation steps, please see [Create Instance](../../../Operation-Guide/Instance/Create-Instance.md).
2. Create a database account via the Console, and for specific steps for creation, please refer to [Create Account](../../../Operation-Guide/Account/Create-Account/PostgreSQL-Create-Account.md).
3. After JCS for PostgreSQL is created and initialized, it shall start to export data from the self-created local PostgreSQL into the local folders by executing commands

    ```
    pg_dump -U User Name -h Database Address -p Database Port Database Name -f /Path/Exported File Name.sql

    Parameter Description
        User name: User name of self-built database.
        Database address: Refer to database host name, and localhost can be used for login of local database host.
        Database port: Refer to the port number of a self-built database.
        Database name: Fill in a database name to be exported.
    ```

4. Virtual Machines can be created after local self-created PostgreSQL data are exported to local.
5. Create VM instances, and for specific creation steps, please refer to [Create VM Instance](https://docs.jdcloud.com/virtual-machines/create-instance). Please attach importance to the following points when creating VM instances
    * Please ensure that the Virtual Machines and JCS for PostgreSQL created in step 1 are in the same ***VPC***.
    * A newly created virtual machine needs a ***Public IP*** to enable public network access, otherwise it cannot upload local data file to the virtual machine.
    * Please ensure that ***Network ACL*** of subnet that the Virtual Machines are located at allows local ssh to connect to Virtual Machines.

6. After completion of VM instance creation, it can upload the data file of local to the Virtual Machines by executing the command

    ```
    scp /Path/Outputted file name.sql User name of Virtual Machines@Virtual Machines public IP: /Virtual Machines path

    Parameter Description
        User name of Virtual Machines: User name at the time of creating a virtual machine instance.
        Virtual Machines EIP: EIP address associated with Virtual Machines.
        Virtual Machines path: Storage path in Virtual Machines of files uploaded locally.
    ```

7. If there is no error notification, it means that the local file has been successfully uploaded on Virtual Machines. Then, data can be imported into JCS for PostgreSQL by executing commands

    ```
    psql -U User Name -h Cloud Database Domain -d Cloud Database Name -p Cloud Database Port -f /Path of Virtual Machines/Name of Exported File.sql

    Parameter Description
        User name: User name in actions of step 2.
        Cloud Database Domain: The domain of JCS for PostgreSQL can be viewed on the Instance Details Page.
        Cloud Database Name: Refer to the name of the target database where data are imported.
        Cloud Database Port: The port number of JCS for PostgreSQL can be viewed on the Instance Details Page.
    ```
8. If there is no error notification, it means the import is successful. You can login JCS for PostgreSQL to view whether the data have been imported actually.
