# Index Operation   
## Create Non-unique Index
```SQL
CREATE INDEX person_num ON person (number);
Or
ALTER TABLE person ADD INDEX person_num (number)；
```

## Create Unique Index
```SQL
CREATE UNIQUE INDEX person_num ON person (number);
Or
ALTER TABLE person ADD UNIQUE person_num  on (number);
```

## View All Indexes in the Table
```SQL
SHOW INDEX from person;
```
 
## Delete Index
```SQL
DROP INDEX person_num ON person;
ALTER TABLE person DROP INDEX person_num;
```