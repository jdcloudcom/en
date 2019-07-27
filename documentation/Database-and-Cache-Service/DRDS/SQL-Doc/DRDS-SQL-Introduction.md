# DRDS SQL Introduction

JD Cloud DRDS is highly compatible with MySQL protocols and syntaxes and most SQLs can run normally on DRDS. However, due to DRDS distribution feature and difference on architecture and concrete implementation of MySQL, there are some restrictions to the use of some SQLs. Please pay attention to such restrictions.


## Split Field Type Supported
DRDS split fields support the following types:
- Value types: int, smallint, bigint, tinyint and mediumint
- Character type: char and varchar
- Time type: timestamp, date and datetime

## Split Function Supported by Time Type
For time type field, DRDS supports the following split functions currently, with the function name being case-insensitive.
- YYYYMM(): For split by month, data per n month(s) are stored in one table sharding, with n to be defined.
- YYYY(): For split by year, data per n year(s) are stored in one table sharding, with n to be defined.

>**Note:**
Each table sharding can store data of a time period and cannot be circulated. When table shardings are used up, users need to expand table shardings by hand.
For example, if there are 16 database shardings in a DRDS database of a user, the table tab1 is split by year and month and one table sharding is provided per month, then the data of 16 months in total can be stored. Where a user needs to store data of more time periods, he/she needs to add database shardings by hand and expand tables.

## Global Self-increase ID
DRDS supports global self-increase ID which can be defined by users and generated as per the three methods below
- SIMPLE: When the system applies for self-increase ID per time, the system database will be accessed and **the self-increase ID is guaranteed to be purely incremental and unique**. But performance of this method is relatively low.
- GROUP: The system takes a section of continuous ID in advance and puts it in the memory of DRDS, assigning one GROUP to each DRDS node. When an application applies for self-increase ID, such ID is obtained from the memory, achieving extremely-high performance. However, as the application may apply for IDs from two GROUPs, **it can ensure that the self-increase IDs obtained with such method are unique, but they are not continuous and incremental**.
- TIME: ID is produced with the approximation snowflake algorithm as per time stamps. Time stamps can be accurate to the millisecond level and at least 2^16 self-increase IDs are supported by the same millisecond. **Please note that for the self-increase ID with the TIME method, the field type must be bigint**



