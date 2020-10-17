## Elasticsearch Data Migration of Third Party

Users, via snapshots, can migrate ES clusters purchased by other cloud vendors to JD Cloud & AI ES. The method is suitable for:</br>
* Data Migration under Large Data Volume Scenario
* Scenario with higher migration speed requirements

Migration based on snapshot method is carried out by using Snapshot API of ES according to basic principles below: Create index snapshots for ES clusters of other cloud vendors, migrate snapshots to JD Cloud & AI OSS via tools and then recover such snapshots in ES clusters of JD Cloud & AI.</br>

As versions of other cloud vendors are inconsistent with the Elasticsearch version of JD Cloud & AI, you shall select an appropriate version for migration. For version selection details, please refer to [Official Document](https://www.elastic.co/guide/en/elasticsearch/reference/current/snapshot-restore.html).</br>


## Step 1: Create snapshot registries for source ES clusters

In the data migration process, you need to create an OSS registry on ES cluster of another cloud vendor via Kibana.</br>

```
POST _snapshot/test_auto_snapshot
{
    "type": "oss",
    "settings": {
        "endpoint": "***.***.com",  //OSS domains of other cloud vendors
        "bucket": "***-***",  //OSS Bucket name
        "access_key_id": "***",  //API Key Pair AccessKey of Other Vendors
        "secret_access_key": "8N7nu9fu274kn3ispVLQE37Hzwumyd",   //API key pair SecretKey of other cloud vendors
        "base_path": "***_backup" //backup directory
    }
}
```


## Step 2: Create snapshots for source ES clusters

By calling Snapshot API to create snapshot data of relevant index, you can designate to take snapshot to a part of indexes or all indexed. For details, please refer to [Official Document](https://www.elastic.co/guide/en/elasticsearch/reference/6.4/modules-snapshots.html).</br>



Via kibana, relevant indexes in ES clusters of other cloud vendors are backed up under the test_auto_snapshot registry and is named as auto_snapshot_2020081901:</br>

```
PUT /_snapshot/test_auto_snapshot/auto_snapshot_2020081901
{
"indices": ["test_index_01","a", "b"]
}
```
## Step 3: View source ES cluster snapshot status

Vie status of the snapshot auto_snapshot_2020081901 under the registry test_auto_snapshot. When the state field is SUCCESS, it means the snapshot has been successfully backed up.</br>

```
GET /_snapshot/test_auto_snapshot/auto_snapshot_2020081901
```





## Step 4: Use data migration tools
If snapshot data of Aliyun ES are stored in OSS of another cloud vendor and are required to be migrated to JD Cloud OSS, you can refer to JD Cloud & AI OSS's official method for migrating data to JD Cloud from another cloud OSS. For details, please refer to [Instructions for Using OSS Migration Tool of JD Cloud & AI](https://docs.jdcloud.com/en/object-storage-service/migration-tool), the Instructions for Using OSS Migration Tool of JD Cloud.</br>

```
Notes:
1. Install jdk 1.8 at first
2. Download and obtain transfer-tools-java-1.0.0.jar
3. Create configuration file application.yaml of transfer-tools-java-1.0.0.jar
4. Log in the local directory of transfer-tools-java-1.0.0.ja, designate position of application.yml via spring.config.location, carry out the command java -jar transfer-tools-java-1.0.0.jar --Dspring.config.location=application.yml to migrate oss data
```

## Step 5: Recover source cluster data from snapshot
By calling Snapshot API to recover relevant indexes from snapshots, you can designate a part of indexes or all indexed to be recovered. For details, please refer to [Official Document](https://www.elastic.co/guide/en/elasticsearch/reference/6.4/modules-snapshots.html).</br>

### Create a registry in the same name
The snapshot registry on JD Cloud & AI must have the name as the same as that of snapshot registry of other cloud vendor of source cluster. Taking test_auto_snapshot for example, create a snapshot registry in the name of test_auto_snapshot via Kibana

```
POST _snapshot/test_auto_snapshot
{
    "type": "s3",
    "settings": {
        "endpoint": "***.jcloudcs.com",    //JD Cloud & AI OSS Name
        "access_key": "******",  //API AccessKey of JD Cloud & AI
        "secret_key": "******",   //API SecretKey of JD Cloud & AI
        "bucket": "es-auto-backup", //OSS Bucket Name
        "base_path": "**_backup"  //Backup Directory
    }
}
```


### View snapshot data

View snapshot data produced by synchronization of tool, i.e., the snapshot auto_snapshot_2020081901 under test_auto_snapshot.

```
GET /_snapshot/test_auto_snapshot/auto_snapshot_2020081901
```




### Resume index
Via the snapshot auto_snapshot_2020082001 of the snapshot registry, data of the index test_index_01 via Kibana

```
POST /_snapshot/test_auto_snapshot/auto_snapshot_2020082001/_restore
{
  "indices": "test_index_01"
}
```



