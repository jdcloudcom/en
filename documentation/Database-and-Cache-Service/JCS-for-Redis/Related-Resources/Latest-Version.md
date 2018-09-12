# Introduction of the Latest Features of Small Revision of Redis

This document describes the features and functions that are available in the small revision of Redis.

- Version number

The user can view the Revision number of the instance in the Details of the instance. The current revision number of the Redis is 2.8 and the Revision number of the small Revision is 3.0. The Redis instance purchased by the user is the latest revision 2.8-3.0.

- Functions of the Latest Revision
1.   Support Multiple DBs.

Users can use the select command to select the database. Redis 2.8-3.0 supports DB 0-DB 255 for a total of 256 databases. Written to the 0th DB by default.


2.   Support FLUSHALL Command

The FLUSHALL command is not available in revisions prior to 3.0. After upgrading to revision 3.0, users can use the FLUSHALL command.



 3.  Support Scan Command Set

Revision 3.0 supports the scan, hscan, sscan, and zscan command sets.
