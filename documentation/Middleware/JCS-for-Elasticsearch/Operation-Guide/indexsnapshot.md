## Designate index for Snapshot
Snap operation will back up all opened indexes by default. If you do not want to back up all indexes, you can only back up designated indexes when creating cluster snapshots. E.g., when executing the following commands in snapshot_2 of auto_snapshot depository, only customer and index will be backed up:</br>

```
PUT _snapshot/auto_snapshot/snapshot_2
{
 "indices":"customer,index"
}
```
