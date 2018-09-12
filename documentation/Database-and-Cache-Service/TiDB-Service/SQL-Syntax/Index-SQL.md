# Index Operation   
## Create Non-unique Index
```
CREATE INDEX person_num ON person (number);
或者
ALTER TABLE person ADD INDEX person_num (number)；
```

## Create Unique Index
```
CREATE UNIQUE INDEX person_num ON person (number);
或者
ALTER TABLE person ADD UNIQUE person_num  on (number);
```

## View All Indexes in the Table
```
SHOW INDEX from person;
```
 
## Delete Index
```
DROP INDEX person_num ON person;
ALTER TABLE person DROP INDEX person_num;
```