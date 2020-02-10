# Product Overview

Data transmission DTS is the database migration service provided by JD Cloud, supporting migration of databases such as MySQL, MariaDB, Percona, SQL Server and MongoDB and simply and quickly migrating local self-built database to JD Cloud. The source database can be continuously run in the migration process, reducing application service suspension time to the largest extent.

**Main Features**

- Easy to use: Data migration can be started just by creating a migration task on JD Cloud Console without installing any application program. 
- Support a variety of databases: Support isomorphic migration of various relational databases, such as MySQL, Percona, MariaDB, SQL Server and MongoDB, as well as non-relational databases, with supported range expanded continuously. 
- Reduce service suspension time: Support data migration without service suspension. In the migration process, incremental data of source database will be continuously obtained and updated to the target database. During data migration period, service of source database to the external will not be affected, reducing business influence by JD Cloud Onboarding process to the largest extent. 
- Service high-availability: High-availability architecture is used. When the migration service node fails, the automatic disaster recovery can be switched, making sure that the migration task is normally executed. 

**Supported Database Type and Version**

- MySQL: 5.5, 5.6, 5.7, 5.8
- Percona：5.7
- MariaDB：10.2
- SQL Server：2008R2、2012、2014、2016、2017
- MongoDB：3.2、3.4、3.6

**Supported Region**

Now, only two regions are supported, i.e., "cn-north-1" and "cn-east-2". Later, more regions will be covered.
