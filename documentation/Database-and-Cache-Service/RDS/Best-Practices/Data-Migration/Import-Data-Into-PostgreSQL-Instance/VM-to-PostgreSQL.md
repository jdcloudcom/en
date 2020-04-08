# Migrate from Virtual Machines PostgreSQL to JCS for PostgreSQL
We mainly discuss about how to migrate from Virtual Machines self-created PostgreSQL to JCS for PostgreSQL of JD Cloud & AI. Instead of performing daily operation and maintenance, monitoring, backup and other operations by yourself in the case of using self-created PostgreSQL, you can only concern about the use by using JCS for PostgreSQL of JD Cloud & AI.

## Note
* New PostgreSQL instances and the Virtual Machines shall be in the same ***VPC***.
* It shall ensure that the capacity space of new PostgreSQL instance is not less than that of the self-created PostgreSQL in Virtual Machines.

## Operation Steps
1. Create JCS for PostgreSQL, and for specific creation steps, please see [Create Instance](../../../Operation-Guide/Instance/Create-Instance.md).
2. Create a database account via the Console, and for specific steps for creation, please refer to [Create Account](../../../Operation-Guide/Account/Create-Account/PostgreSQL-Create-Account.md).
3. After JCS for PostgreSQL is created and initialized, it shall start to export data from the self-created PostgreSQL in Virtual Machines into the local folders of Virtual Machines by executing commands

    ```
    pg_dump -U User Name -h Database Address -p Database Port Database Name -f /Path/Exported File Name.sql

    Parameter Description
        User name: User name of self-built database.
        Database address: Refer to database host name, and localhost can be used for login of local database host.
        Database port: Refer to the port number of a self-built database.
        Database name: Fill in a database name to be exported.
    ```

4. After being exported to the local from the self-created PostgreSQL in Virtual Machines, these data can be imported into JCS for PostgreSQL by executing commands

    ```
    psql -U User Name -h Cloud Database Domain -d Cloud Database Name -p Cloud Database Port -f /Path of Virtual Machines/Name of Exported File.sql

    Parameter Description
        User name: User name in actions of step 2.
        Cloud Database Domain: The domain of JCS for PostgreSQL can be viewed on the Instance Details Page.
        Cloud Database Name: Refer to the name of the target database where data are imported into.
        Cloud Database Port: The port number of JCS for PostgreSQL can be viewed on the Instance Details Page.
    ```
5. If there is no error notification, it means the import is successful. You can login JCS for PostgreSQL to view whether the data have been imported actually.
