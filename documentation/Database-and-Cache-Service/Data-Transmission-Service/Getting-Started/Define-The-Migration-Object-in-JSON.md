# Define Migration Object with JSON Method

Where the source database has many tables, migration objects and is defined with the JSON method.

```JSON
[
    {
        "dbName":"Name 1 of Database to Be Migrated",
        "schemaName":"Name 1 of Schema to Be Migrated",
        "tableIncludes":[
            {
                "tableName":"Name 1 of Data Table to Be Migrated"
            },
            {
                "tableName":"Name 2 of Data Table to Be Migrated"
            }            
        ]
    },
    {
        "dbName":"Name 2 of Database to Be Migrated",
        "schemaName":"Name 2 of Schema to Be Migrated",
        "tableIncludes":[
            {
                "tableName":"Name of Data Table to Be Migrated"
            }
        ]
    }
]
```

Description:

- Fill in dbName, schemaName and tableName for SQL Server.
- Fill in schemaName and tableName for MySQL and dbName is not required.
- Fill in dbName and tableName for MongoDB and schemaName is not required.
- When all DBs are migrated, please fill in tableName as "*".