# I. Functional Limits
In order to ensure the stability and security of instances, JCS for SQL Server has some functional limits as follows:

1. Databases cannot be created or deleted through commands and accounts cannot be created, deleted or modified. Users can perform the related operations through the console if necessary.

2. Following functions are not provided:
- Integration Service
- Reporting Service
- Analysis Service
- Service Broker
- Copy Function

# II. Sub-account Limits

1. JCS for SQL Server Service supports sub-accounts in most functions, and the authority of sub-accounts can be controlled by [Management] --> [Identity and Access Management].

2. However, some functions do not support sub-accounts, for example:
- SQL Server instance cannot be created.
- Renewals are not supported.
- Monitoring pages cannot be viewed.
- Databases cannot be logged in through DMS.

# III. Quantitative Limit
Each account can create **Five** SQL Server instances in each region. Please submit open ticket to apply for more quotas if to create more instances.

# IV. Names and Password Limits

- **Instance Name:** Name supports Chinese, numbers, lowercase letters, and English underline "_" only, with no less than 2 characters and no more than 32 characters;
- **Backup Name:** Name supports Chinese, numbers, capital and lowercase letters, and English underline "_" only, with no more than 64 characters;
- **Database Name:** Name supports numbers, lowercase letters and English underline "_" only, and it must begin with a letter and ends with a letter or a number, with no less than 2 characters or no more than 32 characters;
- **Account Name:** Name supports numbers, capital and lowercase letters and English underline "_" only, and it must begin with a letter and ends with a letter or a number, with no less than 2 characters or no more than 16 characters;
- **Password:** The password cannot be empty. It must contain capital and lowercase letters and numbers, with 8-32 characters, and supports special characters, such as -=;,./~!@#$%^&*()_+-|{}:<>?, which means it supports ASCII characters except `[]'".

# V. Reserved Keywords

Database name and account name cannot use the following keywords:<br>
root, admin, eagleye, master, aurora, sa, sysadmin, administrator, mssqld, public, securityadmin, serveradmin, setupadmin, processadmin, diskadmin, dbcreator, bulkadmin, tempdb, msdb, model, distribution, mssqlsystemresource, guest, add, except, percent, all, exec, plan, alter, execute, precision, and, exists, primary, any, exit, print, as, fetch, proc, asc, file, procedure, authorization, fillfactor, public, backup, for, raiserror, begin, foreign, read, between, freetext, readtext, break, freetexttable, reconfigure, browse, from, references, bulk, full, replication, by, function, restore, cascade, goto, restrict, case, grant, return, check, group, revoke, checkpoint, having, right, close, holdlock, rollback, clustered, identity, rowcount, coalesce, identity_insert, rowguidcol, collate, identitycol, rule, column, if, save, commit, in, schema, compute, index, select, constraint, inner, session_user, contains, insert, set, containstable, intersect, setuser, continue, into, shutdown, convert, is, some, create, join, statistics, cross, key, system_user, current, kill, table, current_date, left, textsize, current_time, like, then, current_timestamp, lineno, to, current_user, load, top, cursor, national, tran, database, nocheck, transaction, dbcc, nonclustered, trigger, deallocate, not, truncate, declare, null, tsequal, default, nullif, union, delete, of, unique, deny, off, update, desc, offsets, updatetext, disk, on, use, distinct, open, user, distributed, opendatasource, values, double, openquery, varying, drop, openrowset, view, dummy, openxml, waitfor, dump, option, when, else, or, where, end, order, while, errlvl, outer, with, escape, over, writetext
