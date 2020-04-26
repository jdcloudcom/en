# Introduction of the Latest Features of Small Version of Redis

This document describes the features and functions that are available in the small version of JCS for Redis.

- Version Number

The user can view the version number of the instance in the Details of the instance. The current version of JCS for Redis is Redis 2.8 and 4.0 and the version number of JD Cloud's internal small version is 3.0. The Redis instance purchased by the user is the latest version 2.8-3.0.

- Functions of the Latest Version

1. Support Multiple DBs.

Users can use the select command to select the database. Redis 2.8-3.0 supports DB 0-DB 255 for a total of 256 databases. Written to the 0th DB by default

2. Support Transaction

Disabling a command cannot be executed in a transaction

3. Open scan Command

Users can use scan command

4. Redis 4.0 Cluster Version can customize multipart

Users can set count and capacity of multipart

