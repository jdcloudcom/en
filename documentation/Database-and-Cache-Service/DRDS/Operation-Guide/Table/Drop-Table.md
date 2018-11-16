# Delete Table

**Deleting table needs two steps (in the reverse order of creating table)**

1) Login DRDS to execute DROP statement

2) Login console, delete routing information DRDS instance in **Table Management**

**Note: The above operation order must strictly follow the sequence that login DRDS to execute DROP statement first; then login console to perform deletion**

**1. Connect DRDS to execute DROP statement**

Login DRDS (not JCS for MySQL) with client tool, connect corresponding database and execute DROP statement, DRDS will automatically delete the actual data tables in the backend JCS for MySQL database according to the saved routing information of the tables.

**2. Enter **Database Management**->**Table Management** page**

Click the instance name to enter Instance page, select **Table Management** under **Database Management**, click **Delete** link on the right side

! [Table List] (../../../../../image/DRDS/table-list.png)

**3. Confirm to Delete**

Click **OK** to confirm in the dialogue box
