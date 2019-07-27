# Global Self-increase ID
In the single-machine MySQL environment, the self-increase field can help users generate the unique table value increasingly. However, when conditions of DRDS are changed, the original table is actually split to several sub-tables on the backend in terms of table sharding. Therefore, the traditional self-increase fields cannot meet users’ demands. For this reason, DRDS made related improvement, generating unique value for table split.
>Remarks: The global self-increase ID specified in the document is applicable only to table split. For cases other than table split, the MySQL syntax can be directly used,

The global self-increase ID of DRDS can be used for generating self-increase ID as per the three methods below, depending on users’ definitions.
- SIMPLE: When the system applies for self-increase ID per time, the system database will be accessed and the self-increase ID is guaranteed to be purely incremental and unique. But the performance of this method is relatively low.
- GROUP (default): The system takes a section of continuous ID in advance and puts it in the memory of DRDS, assigning one GROUP to each DRDS node. When an application applies for self-increase ID, such ID is obtained from the memory, achieving extremely high performance. However, as the application may apply for IDs from two GROUPs, it can ensure that the self-increase IDs obtained with such method are unique, but they are not continuous and incremental.
- TIME: ID is generated with the approximation snowflake algorithm as per time stamps, time stamps can be accurate to the millisecond level and at least 2^16 self-increase IDs are supported by the same millisecond. 
> Note: For the self-increase ID with the TIME method, the field type must be bigint.

## SQL Syntax
```SQL
CREATE TABLE table_name (
   [column definition]  auto_increment by [SIMPLE| GROUP | TIME ],
   [other column definition],
   ...
) auto_increment=<start value>
[dbpartion options]
```
To cooperate with the global self-increase ID of DRDS, three variables are added to DRDS. The three variables **only supports global level setting rather than the session level, **thus it is suggested that assessment on whether there is any influence to other self-increase IDs shall be made in the case of modification.
- drds_auto_increment_increment: Correspond to auto_increment_increment of MySQL.
- drds_auto_increment_offset: Correspond to auto_increment_offset of MySQL.
- drds_group_size: If self-increase ID is applied with the group method, size of each group is 1000 by default.
> Note: Set auto_increment_increment and auto_increment_offset of original MySQL in DRDS, which can be session level only, because set of global level is ineffective.


drds-related variables can be viewed by using 'show variables'
```
show variables like 'drds%' 
```

## Examples
1. Create a table with the self-increase ID type of group and starting value as 10
```SQL
create table increment_demo1(
id int auto_increment by group,
name varchar(10),
key(id)
) auto_increment=10
dbpartition by int_mod(id);
```

## Operation instructions:
1. For the self-increase ID with the TIME method, the field type must be bigint.
2. The global self-increase ID of DRDS can be circularly used. Errors will be reported if it exceeds the maximum value. Therefore, please set an appropriate int field type.
3. SIMPLE, GROUP and TIME are case insensitive.
4. Where errors are reported to the insert statement, the current ID value will be abandoned, and a new ID will be applied for next insertion.
5. If '0' is inserted for the self-increase ID field, the self-increase ID will be produced. This is the difference to MySQL.
