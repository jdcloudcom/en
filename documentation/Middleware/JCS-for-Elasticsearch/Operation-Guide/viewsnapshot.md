### View snapshot information

1. Directly launch a GET request to depository of auto_snapshot and snapshot name of snapshot_1 to get single snapshot information:

```
GET _snapshot/auto_snapshot/snapshot_1
```

Returned response contains various information relevant to the snapshot:

```
{
  "snapshots": [
    {
      "snapshot": "snapshot_1",
      "uuid": "AMvUjS9HStmIk5e6BUr2Hw",
      "version_id": 5060999,
      "version": "5.6.9",
      "indices": [
        "customer",
        "index"
      ],
      "state": "SUCCESS",
      "start_time": "2019-02-19T02:53:55.899Z",
      "start_time_in_millis": 1550544835899,
      "end_time": "2019-02-19T02:54:00.327Z",
      "end_time_in_millis": 1550544840327,
      "duration_in_millis": 4428,
      "failures": [],
      "shards": {
        "total": 10,
        "failed": 0,
        "successful": 10
      }
    }
  ]
}
```

2. You can also use _all placeholder to get a complete list of all snapshots in the repository:

```
GET _snapshot/auto_snapshot/_all
```

3. You can also view detailed information of snapshot by dragging _status API data:
```
GET _snapshot/auto_snapshot/snapshot_1/_status
```
It responds general status containing snapshots, but it also contains statistics values drilling down each index and each sharding, with different completed status of shardings being shown as below:</br>

INITIALIZING: The sharding is checking the cluster status to view whether the snapshot can be taken for it.This is typically very quick.</br>

STARTED:Data is being transmitted to the repository.</br>

FINALIZING: Data transmission is completed; the sharding is sending the metadata of the snapshot.</br>

DONE: Snapshot is completed.</br>

FAILED: Error occurred when processing snapshot, the sharding/index/snapshot cannot be completed. View your log to get more information.</br>
