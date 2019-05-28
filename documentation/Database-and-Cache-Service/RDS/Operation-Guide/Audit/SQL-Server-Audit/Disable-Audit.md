# Disable Audit
- Instance audit: It can be disabled in the Console
- Database audit: If you intend to disable all audits, please directly disable the instance audit. If you intend to disable one database audit, you need to connect to the specific database, execute corresponding SQL and disable the database audit.

## Disabling Instance Audit
1. Enter the instance audit page and click the button on the right.

![Disable Instance 1](../../../../../../image/RDS/Disable-Audit-1.png)

> **Note: If all audit policies are deleted in the audit edition page, audit will be automatically disabled**

2. Confirm disabling in the dialog box. 
> The generated audit record files will not be deleted if audit is disabled.

## Disabling Database Audit
1. View all audit rules in current database
```SQL
SELECT * FROM SYS.DATABASE_AUDIT_SPECIFICATIONS
```
2. View specific contents of audit rules and confirm the specification to be deleted is correct
```SQL
SELECT t1.* FROM SYS.DATABASE_AUDIT_SPECIFICATION_DETAILS t1, SYS.DATABASE_AUDIT_SPECIFICATIONS t2
where t1.database_specification_id = t2.database_specification_id
and t2.name = 'xxxxxx'   -- xxxxxx means the name of audit rule to be deleted
```

3. Delete customized audit rules
```SQL
ALTER DATABASE AUDIT SPECIFICATION [Audit Name]    --Audit Name is the audit name to be modified
WITH (STATE=OFF);

DROP DATABASE AUDIT SPECIFICATION [Audit Name]  -- Audit Name means the name of audit rule to be deleted
```
