## Create Snapshot
Your first snapshot will be a complete copy of data, but all subsequent snapshots only reserve the differences between saved snapshots and new data.As you take snapshots for the data at times, your backups are added or deleted in an increment way.It means that the subsequent backups will be quite quick because only a little amount of data transmission is required.</br>
### Automatic Snapshot
After you log in JDS for Elasticsearch console, you can enable to automatically create snapshot when creating cluster. Alternatively, you can enter the Cluster Management interface by clicking the instance name on the Instance List page, then select the cluster snapshot or click **Operation**-**More**-**Backup and Restore** to enter the Snapshot page.   Backup is carried out every day by default, and the start time of backup can be modified.</br>

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/snapshot1.png)
 
### Manually Snapshot
Manually Create Snapshot can be enabled on the Cluster Snapshot page.  You can define the prefix and index of the snapshot when you manually create the snapshot, and it will create snapshots for all cluster indexes when indexes are not set. If you intend to back up designated indexes, please designate specific index names, such as 'index1, index2 or index3'. They are separated by commas, with their length not be greater than 64.</br>

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/snapshot2.png)

### List information of snapshots
After executing operation of creating snapshots, the snapshot list will show the snapshot information of automatic snapshot and manual snapshot, as well as the current snapshot status.
