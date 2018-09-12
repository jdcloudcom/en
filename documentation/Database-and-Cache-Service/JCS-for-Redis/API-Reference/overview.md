
# Interfaces for Redis

In order to make it easier for you to understand the basic concepts and parameters related to the OpenAPI, it is recommended that you check the introduction to the use of Open API first.

- Revision: v1

Interface name|Request mehod	|Function description
---|:--:|---:
createCacheInstance	|POST|	Create a Redis instance with specified configuration
deleteCacheInstance|	DELETE|	: delete singe Redis instance
describeCacheInstance|	GET|	Query Redis instance details
describeCacheInstances|	GET|	Query Redis Instance List
describeInstanceClass|	GET	|Query the list of instance type for certain region
describeUserQuota|	GET	|Query account quota information
modifyCacheInstanceAttribute|	PATCH|	Modify the resource name and description of Redis instance, alternatively
modifyCacheInstanceClass|	POST|	Change Redis instance configuration
resetCacheInstancePassword	|POST|	Reset Redis instance password
