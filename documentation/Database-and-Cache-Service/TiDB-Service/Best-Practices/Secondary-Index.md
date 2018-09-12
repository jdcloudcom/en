# Efficient Usage of Secondary Index
TiDB supports for full secondary indexing and global indexing, and many of queris can be optimized by index. It is important for the business to utilize the secondary index well. Many MySQL experiences are still applicable for TiDB, but TiDB has its own characteristics. Note, this section is mainly discussing the best practice of secondary index used in TiDB.

- Number of Secondary indexes
Secondary index can accelerate queries while there is a side-effect when increasing a new index. In the previous section, we introduced the storage model of index. Every index is added, a new Key-Value is needed. The more indexes, the slower the writes and the lager the space needed. Besides, too many index may affect the optimizers’ runtime, and the improper index may mislead the optimizer. So the index is not as much as possible.

- Which columns are suitable for indexing
As mentioned above, index is important but not as much as possible so that we must create a suitable index according to specific business characteristics. In principle, we need to create an index of the columns needed in the query for improving properties. <br>
Here is an example: suppose the commonly used query is select * from t where c1 = 10 and c2 = 100 and c3 > 10, so we can build a composite index Index cidx (c1, c2, c3) to construct an index prefix for Scan using the query criteria.
	- Index can significantly reduce the number of filtered rows for columns with a large degree of discrimination.
	- When there are multiple query conditions, a composite index could be a good choice. Note that it is needed to put the column of the equivalent condition in front of the combined index.

- The differences between index querying and Table direct scanning
TiDB has implemented a global index so index and data in Table are not necessarily on a certain data slice. You need scan index first to gain the corresponding row ID and then get data through it when querying through index. So it may involve two network requests. There will be some properties overhead. <br>
Scanning index should be carried out concurrently if the query involves a large number of rows. As long as the first batch of results has been returned, the data of Table can be got. So here is a parallel + Pipeline pattern. Although there are two visits overhead, the delay is not too large. <br>
There are two situations where the issue of two visits will not get involved
	- The columns in the index have met the query requirements. For example, column c from Table t has an index and the query is select c from t where c > 10;”. At this time, you can get all the data only accessing the index. This situation we call it Covering Index. So if you are concerned about query performance, you can put some of the columns that do not need to be filtered but need to be returned in the query results in the index and construct as a composite index. For example: select c1, c2 from t where c1 > 10; to optimize this query you can create a composite index Index c12 (c1, c2).

	- Primary Key of the table is an integer type. Under these circumstances, the value of the Primary Key will be treated as the row ID by TiDB. So if the query condition is above PK, we can directly construct the range of the row ID, directly scan the Table data, and get the result.

- Query Concurrency
Data is scattered across many Regions, so TiDB will do it concurrently when doing the query. The default concurrency is conservative, because excessive concurrency consumes a lot of system resources, and for OLTP type queries, it often does not involve a large amount of data, and lower concurrency can meet the demand. For OLAP types of Query, it often requires a higher degree of concurrency. So TiDB supports adjusting query concurrency by System Variable.
	- tidb_distsql_scan_concurrency
Concurrency when scanning data includes scanning Table and index data.

	- tidb_index_lookup_size
A batch of row IDs is used as a request to access Table data each time if you need to access Table data after accessing the index to get the row ID. This parameter can set the sizes of Batch: the bigger Batch will increase the delay while the smaller will cause more queries. The appropriate size of this parameter is related to the amount of data involved in the query, which usually doesn't need to be adjusted.

	- tidb_index_lookup_concurrency
The concurrency data of each time obtained by the row ID is adjusted by this parameter if you need to access Table data after accessing the index to get the row ID.

- Guaranteed Result Order by Index
In addition to being used to filter data, indexes can also be used to sort data. First, get the row ID in the order of the index, and then return the contents of the row according to the return order of the row ID, so that the returned results are ordered according to the index column. Mentioned earlier, there is a parallel + Pipeline pattern between scanning index and getting Row. If you want to return Row in the order of the index, then the concurrency between the two queries, which is set too high, does not reduce the delay, so the default concurrency is conservative. Concurrency adjustment can be achieved by tidb_index_serial_scan_concurrency variables.

- Reverse Index
Currently TiDB supports reverse indexing of indexes, but the speed is about 5 times slower than the sequential Scan so we must try to avoid it.

