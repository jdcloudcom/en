# MongoDB Start Slow Log Analysis


Use the MongoDB profile command to enable, disable, or change query analysis levels to obtain database performance-related data. By default, the analyzer is off, and you can set it on your own according to business situation.

## Precautions

- The database analysis system writes the query to the log, which has a certain impact on performance.


## Operation Steps

1. Query the analyzer status.

   > db.getProfilingStatus()
   
1. Modify the analyzer level.

   > db.setProfilingLevel(level, slowms)

   - evel: 0, closed; 1. Record slow operation; 2. Record all operations.
   - slowms: Time threshold, unit: ms.
	
1. Query the record information.
	
   The Mongo Profile record is stored in the amdin library, and the Collection is named system.profile. The Profile information can be obtained as long as the record of this Collection is queried.

   > use admin   # Executed at Admin Library
   
   > db.system.profile.find()
   
   
## Profile Record Description

Parameter | Description
---|---
ts | When is the command executed.
millis Time | This command execution consumes time in milliseconds.
info | Details of this command.
query | This is a query operation.
ntoreturn | Query the number of records returned by the client. For example, when executing findOne() command, the ntoreturn is 1. When having limit(n) conditions, the ntoreturn is n.
query | Specific query conditions (such as x>3).
nscanned | The number of records for this query scan.
reslen | The size of the returned result set.
nreturned | The actual result set returned by this query.
update | This is an update operation.
fastmod | Quick modification operations, which are usually fairly fast.
fastmodinsert  | Execution of the upsert quick modification operations.
upsert | The upsert parameter of update is true. The function of this parameter is to insert a record with the update condition if the record of update does not exist.
moved | Whether the update has moved the data on the disk. If the new record is shorter than the original, the current record is usually not moved, and if the new record is longer than the original, it may be moved to another location, which will cause the relative index to be updated. More disk operations, combined with index updates, can make such operations slower.
insert | This is an insert operation.
getmore | This is a getmore operation, which often occurs in the query with large result set. The first query returns partial results, and subsequent results are obtained via getmore.
