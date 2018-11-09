# Backup Local Database

## 1. Check Database Restoring Mode
```commandline
use master;
go
select name,   case recovery_model
when 1 then   'Full'
when 2 then ' Bulk_logged   '
when 3 then   'Simple' end model from sys.databases
where name not   in ('master','tempdb','model','msdb');
go
```

**Note: The restoring mode of the database must be Full.**
- Move to step 2 if the model value is not Full.
- Move to step 3 if the model value is Full.

Users can also use the JCS for SQL Server Management Studio client tool to make a full backup of the database, and, at the same time, ensure that the database recovery mode is "Complete".
![Backup Local Database 1](../../../image/RDS/Backup-Local-Database-1.png)

## 2. Set Restoring Mode of Database as Full.
```commandline
alter database [dbname] set recovery full;
go
```

Repeat Step 1 to confirm that the database restoring mode has been successfully modified.

## 3. Backup Database
Taking a backup file named testdb.bak as an example:
```commandline
use master;
go
backup database [dbname] to disk   ='z:\Backup\testdb.bak' with compression,init,stats=5;
go
```
## 4. Verify the Integrity of Backup Files
```commandline
use master;
go
restore filelistonly 
from disk = 'z:\backup\testdb.bak';
go
```
- If a result set is returned, the backup file is valid.
- If the error prompts, the backup file is incorrect. Please back up files again.



## 5. Recover the Restoring Mode of the Database
- If the restoring mode of the database has been modified, please execute the following command to recover the restoring mode of the database;
- If no changes have been made, this step is not required.
```commandline
alter database [dbname] set recovery [model];
go
```


## 6. Create An Empty Database
Finally, create an empty database on the cloud database for importing backup files.
Users can also use the JCS for SQL Server Management Studio client tool to make a full backup of the database, and, at the same time, ensure that the database recovery mode is "Complete".
