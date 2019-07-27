# DRDS SQL Use Restrictions
DRDS is compatible with MySQL protocol and syntax. However, as MyDQL still has some architecture difference, the use restrictions are as below:
- User-customized data types and customized functions are not supported temporarily.
- Temporary table, view, storage process, trigger and cursor are not supported temporarily.
- Compound statements such as BEGIN…END, LOOP…END LOOP, REPEAT…UNTIL…END REPEAT and WHILE…DO…END WHILE are not supported temporarily.

## SQL Restriction
- Split field modification type is not supported
- Creation, addition, deletion, modification and search to SQL, like schema.table_name, are not supported
- Insert statements such as insert into ... select, load data and replace into are not supported
- SQLs such as select into outfile/into dumpfile/into <variables> are not supported
- rename table is not supported
- Split fields and auto increment fields in the rename split table are not supported
- A split table does not support CREATE TABLE ... LIKE and CREATE TABLE ... SELECT ... 

## Function Restriction
The following functions are not supported by DRDS temporarily:
- Full text retrieval function.
- XML function.
- GTID function.
- enterprise encryption function.
