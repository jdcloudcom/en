## Delete snapshot
The snapshots only can be deleted with API. As the snapshots is incremental, there are many segments depending on the previous segments, please operate with caution. You can send a HTTP call of DELETE command to delete all old snapshots no longer useful:

```
DELETE _snapshot/auto_snapshot/snapshot_2
```
