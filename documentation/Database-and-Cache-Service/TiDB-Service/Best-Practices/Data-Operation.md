# Massive Data Volume Processing
## Import Data
If there is an Unique Key and the business side can guarantee that there is no conflict in the data, you can turn on the switch within Session:
```
SET @@session.tidb_skip_constraint_check=1;
```

In addition, in order to improve the write performance, you can tune the parameters of TiKV.
Please pay special attention to this parameter:
```
[raftstore]
# True by default, meaning to copy the data to the disk compulsorily. For the business scenarios of non-finance security level, it is recommended to set as false,
# To obtain higher performance.
sync-log = true
```

## Write Data
The TiDB mentioned above limits the size of a single transaction at the KV level. If the limit is reflected at the SQL level, simply speaking, a row of data is mapped to a KV entry, and each additional index adds a KV entry, so this limit is reflected at the SQL level as:

- The data of each single row is not greater than 6MB
- Total number of rows * (1 + index number) < 30w
- All data submitted at a time is less than 100MB

Also note that, regardless of whether it is limit of size or number of rows, we have to consider the overhead of TiDB encoding and extra Key of transaction. When used, it is recommended that the number of rows per transaction should not exceed 1w, otherwise the limit may be exceeded or the performance may become poor.

It is recommended that, regardless of Insert, Update and Delete statements, all should be restricted by Batch or by adding Limit.

To delete a large amount of data, it is recommended to use “Delete * from t where xx limit 5000”, which is a solution to achieve the deletion through a loop, with “Affected Rows, = 0” as the end condition of the loop to avoid the limit of transaction size.

If the amount of data deleted at a time is very large, this loop will be slower and slower, because each deletion is traversed from front to back, and after the previous deletion, there will be a lot of deletion marks left in a short time (later will be collected by gc), affecting the subsequent Delete statements. If possible, it is recommended to refine the Where conditions. For example, suppose that you want to delete all the data of May 26, 2017, you can operate as follows:
```
for i from 0 to 23:
    while affected_rows > 0:
	delete * from t where insert_time >= i:00:00 and insert_time < (i+1):00:00 limit 5000;
	affected_rows = select affected_rows()
```

The above is a pseudo-code, meaning to split large chunks of data into small chunks and then delete, to avoid the previous Delete statements affecting the subsequent Delete statements during the deletion process.