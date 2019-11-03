# JSON方式定义迁移对象

源数据库的库表内容较多时，可通过JSON方式定义迁移对象。

```JSON
[
    {
        "dbName":"待迁移库名1",
        "schemaName":"待迁移 Schema名1",
        "tableIncludes":[
            {
                "tableName":"待迁移表名1",
            },
            {
                "tableName":"待迁移表名2",
            }            
        ],
    }
    {
        "dbName":"待迁移库名2",
        "schemaName":"待迁移 Schema名2",
        "tableIncludes":[
            {
                "tableName":"待迁移表名",
            }
        ],
    }
]
```

说明：

- SQL Server 填写 dbName、schemaName、tableName。
- MySQL 填写 schemaName、tableName，不需要填写dbName。
- MongoDB 填写 dbName、tableName，不需要填写schemaName。
- 迁移全部DB时，tableName填写"*"。