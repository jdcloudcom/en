# Supported Databases



## Database Migration

The data migration service can realize data migration between databases in a simple and convenient manner, which suits for scenarios such as JD Cloud Onboarding of data and data migration between Cloud Database instances.

Supported databases and versions are as follows:

| Database Type | Connection Method of Source Database                                        | Target Database          | Supported Version                                                     | Migration Type                             |
| ---------- | ------------------------------------------------------- | ------------------- | ------------------------------------------------------------ | ------------------------------------ |
| MySQL      | Self-built Database with Public IP<br />Self-built Database Connected via Direct Connection/Intranet | JCS for MySQL      | 5.5 → 5.5 and Higher Version<br />5.6 → 5.6 and Higher Version<br />5.7 → 5.7 and Higher Version<br />8.0 → 8.0 | Structural Migration<br />Full Data Migration<br />Incremental Migration |
| Percona    | Self-built Database with Public IP<br />Self-built Database Connected via Direct Connection/Intranet | JCS for Percona    | 5.7 → 5.7                                                    | Structural Migration<br />Full Data Migration<br />Incremental Migration |
| MariaDB    | Self-built Database with Public IP<br />Self-built Database Connected via Direct Connection/Intranet | JCS for MariaDB    | 10.2 → 10.2                                                  | Structural Migration<br />Full Data Migration<br />Incremental Migration |
| SQL Server | Self-built Database with Public IP<br />Self-built Database Connected via Direct Connection/Intranet | JCS for SQL Server | SQL Server Enterprise Version:<br />2008R2 → 2008R2 and Higher Version<br />2012 → 2012 and Higher Version <br />2014 → 2014 and Higher Version <br />2016 → 2016 and Higher Version  <br />2017 → 2017 | Structural Migration<br />Full Data Migration<br />Incremental Migration |
| PostgreSQL | Self-built Database with Public IP<br />Self-built Database Connected via Direct Connection/Intranet | JCS for PostgreSQL | 9.4, 9.6<br/>10.5, 10.6, 10.7, 10.8 and 10.9,<br/>11.2, 11.3 and 11.4<br />The target shall be of the same version or higher version and the 12.x version is not supported now| Structural Migration<br />Full Data Migration<br />Incremental Migration |
| MongoDB    | Self-built Database with Public IP                                    | JCS for MongoDB    | 3.2 → 3.2 and Higher Version<br />3.4 → 3.4 and Higher Version <br />3.6 → 3.6 | Full Data Migration<br />Incremental Migration               |

## Data Subscription

By virtual of Data Subscription Service, incremental data of database can be obtained in real time, freely consumed according to business demands and can be used for scenarios such as caching update policy and asynchronous business decoupling.

Supported database types and versions are as follows:

| Database Type | Connection Method of Source Database                                             | Database Version          | Target            | Data Type                     |
| ---------- | ------------------------------------------------------------ | ------------------- | ----------------- | ---------------------------- |
| MySQL      | JCS for MySQL<br />Self-built Database with Public IP<br />Self-built Database Connected via Direct Connection/Intranet | 5.5, 5.6, 5.7 and 8.0 | JCS for MySQL | Structure Update<br />Data Migration<br /> |