# DRDS DML SQL Syntax

## INSERT
Where the split table is inserted in DRDS, be sure to suffix the table name with the field name, otherwise execution of such SQL will be rejected
```SQL
-- Correct SQL
insert into ddl_demo1 (id,name) values (1,'abc');

--Wrong SQL
insert into ddl_demo1  values (100,'abc');
```

## DELETE，UPDATE，SELECT
It is suggested that a where statement shall contain a split field, so that DRDS can send SQL statement to appropriate database and table shardings as per split field value and SQL efficiency can be improved, e.g.:
```SQL
select id,name from ddl_demo1
where id =100;

update ddl_demo1
set name = 'efg'
where id = 100;

delete ddl_demo1
where id =100;
```


