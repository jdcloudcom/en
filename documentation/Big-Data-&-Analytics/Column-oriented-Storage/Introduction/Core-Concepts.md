# Core Concepts
See the following for the concepts and their interpretations used in the Column-oriented Storage Help Documentation.

- **Row Key**: Row key is the same as nosql database, row key is the primary key used to represent a single row of records, data of HBase is globally ordered according to lexicographic order of RowKey, and all queries only can depend on this order dimension.
- **Columns**: Family column family column cluster: HBASE represents each column in the table, all of them belong to certain column family. Column family is part of schema of table (but column is not), which must be defined before use of the table. Column name use the column family as the prefix. For example, courses: history, courses: math belongs to the courses column family.
- **Cell**: Unit uniquely identified by {row key, columnFamily, version}. Data in cell has no class, and all of them are stored in bytecode format.
keyword: no class, bytecode
- **TimeStamp**: one storage unit identified through rowkey and columns in time stamp HBASE is called cell. Each cell saves multiple versions of the same data. The version is indexed through time stamp. The class of time stamp is 64-bit integer-class. The value to the time stamp can be granted by HBASE (automatic when data is written in), the time stamp is accurate to millisecond of the current system time at this moment. The value to the time stamp can be granted by the customer. If the application wants to avoid data version conflict, it must generate its own unique time stamp. In each cell, data in different versions is sorted in reverse chronological order, namely, the latest data is ranked on the top.

