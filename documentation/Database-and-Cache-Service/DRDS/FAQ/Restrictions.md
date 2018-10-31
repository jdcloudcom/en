**Service Restrictions**

**1. It does not support auto increment field (auto_increment) temporarily**

DRDS temporarily does not support auto increment filed auto_increment, which users need to implement the logic of numerical value auto increment on the application by themselves

**2. It does not support cross-database transactions**

DRDS supports single database transactions, but it does not support cross-database transactions

**3. It does not support cross-database join and sub-query**

Now it only supports join and sub-query within the same database and it does not support cross-database joint and sub-query

**4. It does not support mysqldump**

DRDS itself does not support mysqldump. If users want to export data, they can directly login RDS·MySQL and execute mysqldump operation for each database one by one

**5. Support of Unique Index**
- If Unique Index and the split field are consistent with each other, the Unique restriction cannot be affected.
- If Unique Index and the split field are inconsistent with each other, Unique restriction will not come into force, as the data will be split to tables of several databases. 
