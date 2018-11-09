# Introduction of the Latest Features of Small Version of JCS for Redis

This document describes the features and functions that are available in the small version of JCS for Redis.

- Version Number

The user can view the version number of the instance in the Details of the instance. The current revision number of the Redis is 2.8 and the Revision number of the small version is 3.0. The JCS for Redis instance purchased by the user is the latest version 2.8-3.0.

- Functions of the Latest Version
1.   Support Multiple DBs.

Users can use the select command to select the database. JCS for Redis 2.8-3.0 supports DB 0-DB 255 for a total of 256 databases. Written to the 0th DB by default.


2.   Support FLUSHALL Command

The FLUSHALL command is not available in revisions prior to 3.0. After upgrading to Version 3.0, users can use the FLUSHALL command.



 3.   Support Scan Command Set

Version 3.0 supports the scan, hscan, sscan, and zscan command sets.
