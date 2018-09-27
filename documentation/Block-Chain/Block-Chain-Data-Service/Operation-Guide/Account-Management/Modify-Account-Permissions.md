# Modify Account Access
You can modify database account access during using the database. 

## Precautions
* Database created by starting synchronization service can only set read permission.

## Action Steps
1. Log in [Block Chain Data Service Console](https://bds-console.jdcloud.com/block/list). 
2. Select the target instance needs to modify account access and click the target instance to enter the Details of the instance.
3. Click **Account Management** tab to select the target account; click **Modify Access** in the actions to delete the authorized database of this account or modify the read-write permission of this database; parameters in the popup of modifying account access are described as below:
    * Authorize database: database authorized by this account.
        * Add authorized database, click the database name in the authorizable database list and click the middle button “>”, then the selected database name will be removed from the authorizable database list and added to the end of the authorized database list. **Read Only** permission is selected by default.
        * Remove authorized database, click the database name in the authorized database list and click the middle button “<”, then the selected database name will be removed from the authorized database list and added to the end of the authorizable database list.
        * Modify in batches the permission of authorized database, move the mouse to **Full Read/Write Access** to select an option in the dropdown menu, then the database permission in the authorized database list will all be modified to corresponding options.
    ![Modify Account Access](Pic/Modify account access.png)

4. Click ***OK*** button to complete the modification of account access.

