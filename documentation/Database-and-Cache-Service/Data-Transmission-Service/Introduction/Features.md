# Features

## Database Migration

### Support isomorphic migration of multiple databases

- Database type: Support isomorphic migration of multiple relational databases and non-relational databases, including MySQL, Percona, MariaDB, SQLserver, PostgreSQL, MongoDB, etc.
- Source database and target database: The source database supports association of public IP or the self-built database connected via Direct Connection/Intranet and the target database supports the Cloud Database.
- Data migration granularity: Migration by selected database is supported. You can select data to be migrated according to you demands and migration of the whole instance selected, or specified database or tables is supported.

### Support hot migration and reduce shutdown time

- Migration type: Options of structural migration, full data migration and incremental migration are supported, which can be selected for use according to business scenarios.
- Hot migration: Incremental migration is supported. All data changes of the source database, incurred during migration, shall be continuously duplicated to a target database, with service suspended for a short period while switching the database.

## Data Subscription

- Database type: Support real-time subscription of JCS for MySQL and incremental data of self-built MySQL.
- Flexible use: The data subscription target is a Kafka instance, supporting Kafka ecology. Via the Kafka Client, subscription data can be directly consumed.

