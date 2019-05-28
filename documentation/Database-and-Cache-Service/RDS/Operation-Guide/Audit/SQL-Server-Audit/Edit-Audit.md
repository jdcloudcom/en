# Edit Audit Strategy
- The instance audit can be directly edited in the Console
- For database audit, it needs to connect corresponding database and execute SQL to make modification

## Modification of Instance Audit
1. Enter the audit page and click the edit strategy to enter the editing page.
- During edition, if **Use Recommended Configuration** is checked, the system will load the recommended policies in the "Selected" box
- If no audit policy is selected, the audit will be automatically closed.

2. After selection, click **OK** and save audit polices
![编辑审计1](../../../../../../image/RDS/Edit-Audit-1.png)
- For specific meanings of each audit item, please view relevant links in [Audit Introduction](Audit-Introduction.md)
- After edition is completed, the audit interface will display instance audit policy modified


## Modification of Database Audit
To modify database audit, you can delete the existing polices and then create the same again or modify the existing policies. Methods and steps for modification of existing policies are specified as follows:

1. To modify existing audit polices, please Disable this audit policy
```SQL
ALTER DATABASE AUDIT SPECIFICATION  [Audit Name]    --Audit Name refers to the audit name to be modified
WITH (STATE=OFF)
```

2. Modify audit policies and bring them into effect, for example
```SQL
ALTER DATABASE AUDIT SPECIFICATION [Audit Name]    --Audit Name is the audit name to be modified
FOR SERVER AUDIT [RDSAUDIT]
DROP (SELECT ON OBJECT::[DBO].[tb1] BY [USER1]),
DROP (INSERT ON OBJECT::[DBO].[tb2] BY [USER1]),
ADD (DELETE ON OBJECT::[DBO].[tb2] BY [USER1])
WITH (STATE=ON)
```
For specific syntaxes, please refer to the official document of Microsoft [ALTER DATABASE AUDIT SPECIFICATION](https://docs.microsoft.com/zh-cn/sql/t-sql/statements/alter-database-audit-specification-transact-sql?view=sql-server-2017)
