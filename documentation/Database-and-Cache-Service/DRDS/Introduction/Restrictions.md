# Service Restrictions
**1. It does not support cross-database transactions**

DRDS supports single database transactions, but it does not support cross-database transactions

**2. It does not support cross-database join and sub-query**

Now it only supports join and sub-query within the same database and it does not support cross-database joint and sub-query

**3. It does not support mysqldump**

DRDS itself does not support mysqldump. If users want to export data, they can directly login RDS·MySQL and execute mysqldump operation for each database one by one

**4. Support of Unique Index**
- If Unique Index and the split field are consistent with each other, the Unique restriction cannot be affected.
- If Unique Index and the split field are inconsistent with each other, Unique restriction will not come into force, as the data will be split to tables of several databases. 


### Reserved Keywords for Database Name
As data are actually stored in RDS MySQL at DRDS backend, the reserved keywords in DRDS database name are the same as those in MySQL.

```
mysql, information_schema, performance_schema, sys, percona, admin, aurora, replicator, 
xtrabak, root, mysql, test, eagleye, information_schema, guest, add, analyze, asc, between, 
blob, call, change, check, condition, continue, cross, current_timestamp, database, 
day_microsecond, dec, default, desc, distinct, double, each, enclosed, exit, fetch, 
float8, foreign, goto, having, hour_minute, ignore, infile, insensitiv, int1, int4, 
interval, iterate, keys, leading, like, lines, localtimestamp, longblob, low_priority, 
mediumint, minute_microsecond, modifies, no_write_to_binlog, on, optionally, out, precision, 
purge, read, references, rename, require, revoke, schema, select, set, spatial, sqlexception, 
sql_big_result, ssl, table, tinyblob, to, true, unique, update, using, utc_timestamp, varchar,
when, with, xor, all, and, asensitive, bigint, both, cascade, char, collate, connection, 
convert, current_date, current_user, databases, day_minute, decimal, delayed, describe, 
distinctrow, drop, else, escaped, explain, float, for, from, grant, high_priority, 
hour_second, in, inner, insert, int2, int8, into, join, kill, leave, limit, load, lock, 
longtext, match, mediumtext, minute_second, natural, null, optimize, or, outer, primary, 
raid0, reads, regexp, repeat, restrict, right, schemas, sensitive, show, specific, sqlstate, 
sql_calc_found_rows, starting, terminated, tinyint, trailing, undo, unlock, usage, utc_date, 
values, varcharacter, where, write, year_month, alter, as, before, binary, by, case, 
character, column, constraint, create, current_time, cursor, day_hour, day_second, declare, 
delete, deterministic, div, dual, elseif, exists, false, float4, force, fulltext, group, 
hour_microsecond, if, index, inout, int, int3, integer, is, key, label, left, linear, 
localtime, long, loop, mediumblob, middleint, mod, not, numeric, option, order, outfile, 
procedure, range, real, release, replace, return, rlike, second_microsecond, separator, 
smallint, sql, sqlwarning, sql_small_result, straight_join, then, tinytext, trigger, union, 
unsigned, use, utc_time, varbinary, varying, while, x509, zerofill, jcloud_yunding_db_push, 
jcloudv_push_rw, jcloudv_push_ro, jddb_percona
```

