
# JCS for Redis APIs

In order to make it easier for you to understand the basic concepts and parameters related to the OpenAPI, it is recommended that you check the introduction to the use of Open API first.

- Version: v1

API Name|Request Mehod	|Function Description
---|:--:|---:
createCacheInstance	|POST|	Create a JCS for Redis instance with specified configuration
deleteCacheInstance|	DELETE|	Delete singe JCS for Redis instance
describeCacheInstance|	GET|	Query JCS for Redis instance details
describeCacheInstances|	GET|	Query JCS for Redis Instance List
describeInstanceClass|	GET	|Query the list of instance type for certain region
describeUserQuota|	GET	|Query account quota information
modifyCacheInstanceAttribute|	PATCH|	Modify the resource name and description of JCS for Redis instance, alternatively
modifyCacheInstanceClass|	POST|	Change JCS for Redis instance configuration
resetCacheInstancePassword	|POST|	Reset JCS for Redis instance password
