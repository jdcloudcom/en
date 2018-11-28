# Which commands are limited by the JCS for MongoDB?

## Problem Description

Which commands are limited by the JCS for JCS for MongoDB?

## Problem Processing
To ensure that the MongoDB replica set is running properly, the JCS for MongoDB limits some commands, and the commands supported and limited are as follows:

|Command	|Support	|Not Support|
|---|---|---|
|Aggregates Commands|aggregate<br />distinct<br />count<br />group<br />mapReduce<br />| |
|Geospatial Commands	|geoNear<br />geoSearch<br />| |
|Query and Write Operation Commands	 |insert<br />update<br />delete<br />findAndModify<br />getLastError<br />getPrevError<br />resetError<br />parallelCollectionScan<br />eval<br />| |
|Query Plan Cache Commands	|planCacheListFilters<br />planCacheSetFilter<br />planCacheClearFilters<br />planCacheListQueryShapes<br />planCacheListPlans<br />planCacheClear<br />| |
|Authentication|	logout<br />authenticate<br />getnonce<br />authSchemaUpgrade<br />copydbgetnonce<br /> | |
|User Management Commands	|createUser<br />updateUser<br />dropUser<br />dropAllUsersFromDatabase<br />grantRolesToUser<br />revokeRolesFromUser<br />usersInfo<br />|
|Role Management Commands	|createRole<br />updateRole<br />dropRole<br />dropAllRolesFromDatabase<br />grantPrivilegesToRole<br />revokePrivilegesFromRole<br />grantRolesToRole<br />revokeRolesFromRole<br />rolesInfo<br />invalidateUserCache<br />| |
|Replication Commands	| isMaster<br /> applyOps<br /> |replSetAbortPrimaryCatchUp <br /> replSetFreeze <br /> replSetGetConfig <br /> replSetGetStatus <br /> replSetInitiate <br /> replSetMaintenance <br /> replSetReconfig <br /> replSetStepDown <br /> replSetSyncFrom <br /> resync <br /> addShard <br /> |
|Sharding Commands	| | addShard <br /> addShardToZone <br /> balancerStart <br /> balancerStatus <br /> balancerStop <br /> checkShardingIndex <br /> cleanupOrphaned <br /> enableSharding <br /> flushRouterConfig <br /> getShardMap <br /> getShardVersion <br /> isdbgrid <br /> listShards <br /> medianKey <br /> moveChunk <br /> movePrimary <br /> mergeChunks <br /> removeShard <br /> removeShardFromZone <br /> setShardVersion <br /> shardCollection <br /> shardingState <br /> split <br /> splitChunk <br /> splitVector <br /> unsetSharding <br /> updateZoneKeyRange <br /> |
|Administration Commands	|renameCollection<br />dropDatabase<br />listCollections<br />drop<br />create<br />cloneCollection<br />cloneCollectionAsCapped<br />convertToCapped<br />filemd5<br />createIndexes<br />listIndexes<br />dropIndexes<br />fsync<br />connectionStatus<br />collMod<br />reIndex<br />touch<br />getParameter<br />compact<br />copydb<br />clone<br />clean<br />shutdown<br />logRotate<br />repairCursor<br />setParameter<br />connPoolSync<br />setReadonly<br />cloneCollection<br />| repairDatabase<br /> killCursors |
|Diagnostic Commands	| explain<br />listDatabases<br />dbHash<br />listCommands<br />availableQueryOptions<br />buildInfo<br />collStats<br />dbStats<br />cursorInfo<br />dataSize<br />ping<br />profile<br />top<br />whatsmyuri<br />serverStatus<br />features<br />isSelf<br />validate<br />| |
| System Events Auditing Commands | | logApplicationMessage |

MongoDB official command table：[http://docs.mongodb.org/master/reference/command/][1]


[1]: http://docs.mongodb.org/master/reference/command/

