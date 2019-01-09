# Local Backup of Database

## 1.  Check database recovery mode
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

**Note: The database recovery mode must be Full**
- If the model value is not Full, please carry out the step 2
- If the model value is not Full, please carry out the step 3

The user can use SQL Server Management Studio client tool to make full backup for the database. Please ensure the database recovery mode is "Full"
![本地备份1](../../../../../image/RDS/Backup-Local-Database-1.png)

## 2. Set the database recovery mode to be Full
```commandline
alter database [dbname] set recovery full;
go
```

Repeat the step 1 and confirm if the database recovery mode is modified or not

## 3.  Backup database
Taking the following backup file in the name of testdb.bak for example:
```commandline
use master;
go
backup database [dbname] to disk   ='z:\Backup\testdb.bak' with compression,init,stats=5;
go
```
## 4. Verify backup file integrity
```commandline
use master;
go
restore filelistonly 
from disk = 'z:\backup\testdb.bak';
go
```
- If any result set is returned, the backup file is valid.
- If there is any error, the backup file is wrong. Then, please back up again.



## 5. Restore database recovery mode
- If the database recovery mode is changed, please perform the following commands to restore the database recovery mode;
- If no change is made, please ignore the step.
```commandline
alter database [dbname] set recovery [model];
go
```


## 6.    Create a null database
At last, create a null library in the Cloud Database for importing backup files.
The user can use SQL Server Management Studio client tool to make full backup for the database. Please ensure the database recovery mode is "Full"
