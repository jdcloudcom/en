# Table DDL Syntax

When the original DRDS creates table, it is required to define the split information for the table through the Console, and then create the table through SQL. This method is relatively cumbersome, requiring users to operate through the Console and SQL, respectively. Therefore, the new version of DRDS improves on this by creating split tables directly from SQL statements.


## SQL Syntax for Creating Table
```SQL
CREATE TABLE table_name
 (create_definition,...)
 [DRDS partition options]
 
 DRDS partition options:
 dbpartition by
     INT_MOD([column_name])    -- Split of integer field
     | STRING_HASH([column_name])    -- Split of character field,
     | YYYYMM([column_name]) | YYYY([column_name]) START([start_date]) period [num]  -- Split of time field, split by year or month, start from start_date, one split table every [num] month(s)     
```
   
## Split Function
Currently DRDS supports the following split functions, whose names are case-insensitive
- INT_MOD(): Split integer field
- STRING_HASH(): Split character and field
- YYYYMM(): Split of time, date field by month
- YYYYMM(): Split of time, date field by year
