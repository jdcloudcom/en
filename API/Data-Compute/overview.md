# Data Compute API


## Introduction
Data Compute APIs


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**cancelPySparkJob**|POST|Terminate a user's PySpark script task|
|**cancelRasQuery**|POST|Terminate the search on the user's Spark SQL script|
|**createDatabase**|POST|Create a user instance database|
|**createTable**|POST|Create a user instance datasheet|
|**deleteDatabase**|DELETE|Delete a specified database of user instance|
|**deleteTable**|DELETE|Delete a specified datasheet of user instance|
|**executePySparkQuery**|POST|Execute the PySpark script written by the user|
|**executeRasQuery**|POST|Execute the Spark SQL script written by the user|
|**getDatabaseInfo**|GET|Search the specified database information of user instance|
|**getPySparkExecuteResult**|GET|Obtain the execution result of the user's PySpark script|
|**getPySparkExecuteState**|GET|Obtain the execution status of the user’s PySpark script|
|**getRasQueryLog**|GET|Obtain a search log of the user’s Spark SQL script|
|**getRasQueryResult**|GET|Obtain the search result of the user’s Spark SQL script|
|**getRasQueryState**|GET|Obtain the search status of the user’s Spark SQL script|
|**getTableInfo**|GET|Search the specified datasheet information of user instance|
|**listDatabaseInfo**|GET|Search all the database information of user instance|
|**listInstanceInfo**|GET|Search the instance information of the user|
|**listTableInfo**|GET|Search all the datasheet information under the specified database of user instance|
