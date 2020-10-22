# Product Overview

DTS is a real time data stream service provided by JD Cloud, which supports data migration and data subscription service and can meet business scenarios of JD Cloud Onboarding of data, asynchronous business decoupling, etc. in a simple and convenient manner.

## Database Migration

It can realize data migration between databases in a simple and convenient manner and suits for scenarios such as JD Cloud Onboarding of data and data migration between Cloud Database instances.

Support migration of multiple databases, including SQL, MariaDB, Percona, SQL Server, PostgreSQL, MongoDB, etc. Local self-built databases can be simply and quickly migrated to JD Cloud, with source databases normally running during migration and shutdown time of applications reduced to the greatest extent.

## Data Subscription

Incremental data of database can be obtained in real time, freely consumed according to business demands and can be used for scenarios such as caching update policy and asynchronous business decoupling.

Subscription of incremental data from Cloud Database MySQL and self-built MySQL is supported. The subscription target is a Kafka instance. By virtual of Kafka Client, you can directly consume data in the data subscription channel.
