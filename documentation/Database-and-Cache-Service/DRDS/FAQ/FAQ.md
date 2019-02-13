**1. Q: Which database types does backend storage node of DRDS support?**

A: It supports database types of JCS for MySQL 5.6 and JCS for MySQL 5.7 and it will support more JCS for MySQL versions later.

**2. Q: Which split field types does it support?**

A: It supports field of numerical value and character string types during the close beta test and open beta test. It will add date field and support combination and split for 2 field in the future

**3. Q: Does backend storage node of DRDS have number limit?**

A: The number of backend storage node may be tens of thousands in theory and it is approximately unlimited

**4. Q: Does DRDS support automatic backup?**

A: DRDS stores data on the JCS for MySQL nodes of backend, so that it does not store data needed to be backed up. The backend JCS for MySQL database supports automatic backup, which can be set on the console of “RDS”

**5. Q: Which character sets does DRDS support?**

A: DRDS supports UTF8 character set and it will support more character sets later

**5. Q: What are the reasons for failing to generate the expansion plan in horizontal expansion?**

A: The reasons for failing to generate the expansion plan generally include
  1. It fails because there is not enough new RDS space to migrate any sub-database.
  2. The name of the database in the new RDS is same with that of the sub-database of DRDS in the original RDS, for example, there is a sub-database named testdb_drds_a149_1 in the RDS and there is also a database named testdb_drds_a149_1 in the new RDS, in which case, it fails.
  3. The RDS MySQL version is inconsistent. To guarantee stability, we require a consistent RDS MySQL version.
