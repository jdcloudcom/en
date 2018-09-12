# Restriction Statement
TiDB currently does not support triggers, stored procedures, customized functions and foreign keys. In addition, TiDB supports most syntax of MySQL 5.7.

## Unsupported Features
- Storage Procedure
- View
- Trigger
- Customized Function
- Foreign Key Constraints
- Full-text Index
- Spatial Index
- Non-UTF8 Character Set

## Features different from MySQL
**Auto Increment ID**
TiDB's Auto Increment ID only guarantee the auto increment and unique, and it does not guarantee continuous allocation. TiDB currently adopts batch allocation, therefore if you insert data on multiple TiDBs at the same time, the assigned auto-increment ID will be discontinuous.

**Built-in Function**
TiDB supports common MySQL built-in functions, but not all functions. For details, please refer to [Official Syntax Document](https://pingcap.github.io/sqlgram/#FunctionCallKeyword).

**DDL**
TiDB realizes F1's asynchronous Schema change algorithm. During the execution of DDL, it will not block the DML operations which is online. Currently Supported DDLs Include:
- Create Database
- Drop Database
- Create Table
- Drop Table
- Add Index
- Drop Index
- Add Column
- Drop Column
- Alter Column
- Change Column
- Modify Column
- Truncate Table
- Rename Table
- Create Table Like

## Transaction
TiDB uses the optimistic transaction model. When executing the statement, such as Update, Insert and Delete, etc., write and write conflicts will only be checked during the commit process, instead of using row locks like MySQL to avoid write-write conflicts. Therefore, after executing the SQL statement, the business side needs to pay attention to check the return value of the commit. Even if there is no error during execution, commit can sometimes be wrong.

## Load data
When TiDB executes load data, each 20,000 rows of records will be regarded as a transaction to perform persistent storage by default. If a load data operation inserts more than 20,000 rows of data, it will be split into multiple transactions for commit. If a transaction fails, this transaction will fail to commit, however the transaction before it will still be submitted successfully. In this case, for one operation of load data, partial data will be inserted successfully and partial data will fail. In MySQL, a load data operation is treated as a transaction. If a failure occurs, the entire load data operation failed.