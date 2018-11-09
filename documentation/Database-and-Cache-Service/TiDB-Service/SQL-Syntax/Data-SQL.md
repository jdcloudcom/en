# Data Operation
## Insert Data
```
INSERT INTO person VALUES("1","tom","20170912");
```

## Search Data

```
SELECT * FROM person;
+--------+------+------------+
| number | name | birthday   |
+--------+------+------------+
|  1 | tom  | 2017-09-12 |
+--------+------+------------+
```

## Change Data
```
UPDATE person SET birthday='20171010' WHERE name='tom';
SELECT * FROM person;
+--------+------+------------+
| number | name | birthday   |
+--------+------+------------+
|  1 | tom  | 2017-10-10 |
+--------+------+------------+
```

## Delete Data
```
DELETE FROM person WHERE number=1;
SELECT * FROM person;
Empty set (0.00 sec)
```