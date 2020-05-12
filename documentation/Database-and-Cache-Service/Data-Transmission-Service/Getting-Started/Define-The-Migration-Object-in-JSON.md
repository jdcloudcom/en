# Define Migration Object with JSON Method

Where the source database has many tables, migration objects and is defined with the JSON method.

The examples are as follows:

```JSON
[
    {
        "dbName":"Name of Database to Be Migrated",
        "schemaName":"Name of Schema to Be Migrated",
        "tableIncludes":[
               {
                "tableName":"*"
            }
        ],
        "tableExcludes":[
            {
                "tableName":"Name of Table Not to Be Migrated"
            } 
        ]
    },
    {
        "dbName":"Name of Database to Be Migrated",
        "schemaName":"Name of Schema to Be Migrated",
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
        "dbName":"123*",
        "schemaName":"*",
        "tableIncludes":[
            {
                "tableName":"*"
            }       
        ]
    }
]
```

Description:

- Fill in dbName, schemaName and tableName for SQL Server.
- Fill in schemaName and tableName for MySQL and dbName is not required.
- Fill in dbName and tableName for MongoDB and schemaName is not required.
- dbName, schemaName and tableName support "*" wildcard, such as: * hello, he * o and hello * (if the database type is PostgreSQL, only * is supported). 
- Using TableExcludes to choose the table not to be migrated is supported, and if TableExcludes is used, TableIncludes shall define table name as *.
- If wildcard is used for dbName, schemaName and tableName shall be *; if wildcard is used for schemaName, tableName shall be *.
