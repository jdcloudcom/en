# Inventory Setting

Inventory is a function used for helping users manage the bucket object. Produce a list document of special format for (all or part of) objects in Bucket in the (daily/weekly) cycle (now, files in the format of CSV are supported), store the file in the assigned Bucket and replace the Object Storage Service in a planned way to conduct the List API synchronization operation.

Based on the object inventory, users can finish some business statistics or batch operation; You can configure several inventory tasks in one Bucket to meet business demands at different dimensions.

The inventory file is used for listing stored objects and its corresponding metadata and recording object attribute information required by users according to users' configuration information. During performance of any inventory task, object contents will not be directly read, but attribute information of the metadata object will be scanned.

Inventories will be produced by day or by week. Since configuration and creation of inventories, the inventory list document will be produced in the specified production period. In inventories are produced by week, one report will be produced per seven days since the initial report.

## How to configure the inventory?

This part specifies how to set inventories, including details about inventory source bucket and target bucket.

### Inventory Source Bucket and Target Bucket 

The bucket whose objects are listed via an inventory is referred to as the *Source Bucket*. The bucket where inventory list documents are stored is referred to as the *Target Bucket*. Before configuring inventories, we need to know two concepts:

**Source Bucket**

The bucket where the inventory function is desired to be enabled. The inventory lists objects stored in the source bucket. Thus, you can obtain the inventory lists of the whole bucket or those selected by (object key name) prefixes.

Source bucket:

- Include objects listed in an inventory.
- Include inventory configuration.

**Target Bucket**

Bucket used for storing inventories. Where the inventory list documents is to be written in the target bucket, all inventory list documents at the public position in the target bucket shall be grouped and you can designate target (object key name) prefix in the inventory configuration.

Target bucket:

- Include inventory file lists.
- Include Manifest files, with all file inventory lists stored in the target bucket.
- Must have bucket policies for permissions of writing documents in a bucket.
- Must be in the same Region of the source bucket, both of which can be the same bucket.
- Can be identical as the source bucket.
- Can be owned by a JD Cloud & AI account different to the account possessing the source bucket.

### Configuration Inventory

The inventory will help you to create object lists in the bucket as per the prescribed plan for storage management. You can configure several inventory lists for the bucket. Inventory lists will be issued in CSV files in the target bucket

**1. Specify object information to be analyzed in the source bucket**

Determine which object information needs to be analyzed. Therefore, when the inventory function is configured, you need to configure the following information in the source bucket:

- Configure object attribute to be analyzed: You need to define which object attribute information to be recorded in the inventory report. At present, the supported object attributes include account ID, source bucket name, object file name, object size, last modified date of object, ETag and object storage type.

**2. Configure storage information in inventory report**

Specify bucket policy of the target bucket as whether inventory report lists are produced once per day or once per week and which bucket is used for storing the inventory reports. The configuration information is as follows:

- Select inventory output frequency: Produce lists once per day or once per week. You can select desired frequency to perform the inventory function via this configuration.
- Configure inventory output position: You need to specify the bucket where the inventory report is to be stored.

## Which parameters are contained in the inventory?

The inventory list file comprises object lists in the source bucket and metadata of each object. Inventory lists will be stored in the target bucket in the form of CSV file compressed via GZIP.

Inventory lists contain object lists in the bucket as well the following metadata of each object listed:

- Bucket name - name of bucket corresponding to the inventory.
- Key name - Name of object file in the bucket and the object key name (or key) of object in the unique identification bucket. When the CSV file format is used, the object file name shall adopt the URL coding form and the file can be used only after being decompressed.
- Size - object size (unit: byte).
- Last modified date - Object creation date or last modified date (whichever is later).
- ETag - the entity tag is the object hash. ETag only reflects object content modification rather than change of object metadata. ETag may or may not be the MD5 abstract of object data, depending on object creation method and encryption method.
- Storage class - Storage type used for storage object. For more details, please refer to [Storage Type](https://docs.jdcloud.com/object-storage-service/storageclass-overview).

## Application Method

### Configure inventories via the Console

Please refer to the [Operation Guide of Console] below for enabling of the inventory function and understanding how to configure the inventory function via the Console.

### Configure inventory via API

You can refer to the following API documents below to understand how to configure the inventory function via API:

- [DELETE Bucket Inventory](../../API-Reference-S3-Compatible/Compatibility-API/Operations-On-Bucket/Delete-Bucket-InventoryConfiguration.md)
- [GET Bucket Inventory](../../API-Reference-S3-Compatible/Compatibility-API/Operations-On-Bucket/Get-Bucket-InventoryConfiguration.md)
- [List Bucket Inventory](../../API-Reference-S3-Compatible/Compatibility-API/Operations-On-Bucket/List-Bucket-InventoryConfigurations.md)
- [PUT Bucket Inventory](../../API-Reference-S3-Compatible/Compatibility-API/Operations-On-Bucket/Put-Bucket-InventoryConfiguration.md)

## Inventory Report Storage Path

Inventory reports and related Manifest documents will be releases in the target bucket, and the inventory report will be released via the path below:

```
destination-prefix/source-bucket/config-ID/
```

Manifes-related files will be released to the target bucket at the following position:

```
destination-prefix/source-bucket/config-ID/YYYY-MM-DDTHH-MMZ/manifest.json
destination-prefix/source-bucket/config-ID/YYYY-MM-DDTHH-MMZ/manifest.checksum
destination-prefix/source-bucket/config-ID/hive/dt=YYYY-MM-DD-HH-MM/symlink.txt
```

Inventory lists will be released per day or per week to the following position of target bucket:

```
destination-prefix/source-bucket/config-ID/data/example-file-name.csv.gz
```

Meanings contained in the path are as follows:

- **destination-prefix**: Refer to the "Target Prefix" set while configuring an inventory, which can be used for grouping all inventory list documents at public position of target bucket.
- **source-bucket: ** Refer to the source bucket name corresponding to an inventory report, which is added for the purpose of avoiding possible conflict caused by the inventory report of each source bucket sent to the same target bucket.
- **config-ID: **Refer to the "Inventory Name" set by the user while configuring an inventory, which is added to avoid conflicts when several inventory reports are sent from the same source bucket to the same target bucket. config-ID can be used for distinguishing different inventory reports.
- **YYYY-MM-DDTHH-MMZ: ** Time stamp, including start time and date when the bucket is scanned while producing an inventory report; for example, 2020-04-28T00-32Z.
- **manifest.json: ** is the Manifest file.
- **manifest.checksum: ** is MD5 of the manifest.json file.
- **symlink.txt: ** is the Manifest file compatible with Apache Hive.
- **example-file-name.csv.gz: ** is one of CSV inventory files.

Related Manifest files totally comprise two files, manifest.json and symlink.txt.

Introduction of the Manifest file is as follows:

<table border="1">
  <tr>
    <td>
What is the inventory Manifest?<br><P>
The Manifest files, manifest.json and symlink.txt, describe the location of inventory report. When a new inventory report is delivered, a group of new Manifest files will be accompanied.<br>
Once been written in the manifest.json file, it will be attached with one manifest.checksum file (serving as the content MD5 of the file manifest.json).<br>
Each Manifest contained in the manifest.json file provides inventory-related metadata and other basic information. Such information comprises:<br>
   ● Name of source bucket.<br>
   ● Name of target bucket.<br>
   ● Inventory version.<br>
   ● Time stamp, including start time and date when the bucket is scanned while producing an inventory report.<br>
   ● Format and architecture of inventory file.<br>
   ● Actual list, size and md5Checksum of inventory reports in the target bucket.
     </td>
  </tr>
</table>

The Manifest example in the manifest.json file composed of inventories in CSV format is shown as below:

```
{
 "sourceBucket": "example-source-bucket",
 "destinationBucket": "example-inventory-destination-bucket",
 "fileFormat": "CSV",
 //"version": "2016-11-30",
 "creationTimestamp": "1514944800000",
 "fileSchema": "Bucket, Key, VersionId, Size, LastModifiedDate, ETag, StorageClass, IsMultipartUploaded, ReplicationStatus",
 "files": [
  {
   "key": "Inventory/example-source-bucket/2016-11-06T21-32Z/files/04d73d9debc73d9f0bf85af461abde6c.csv.gz",
   "size": 21999232,
   "MD5checksum": "7d40288a09c25b302ad6cb5fced54f35"
  }
 ]
}
```

## Inventory Consistency

The inventory report provides final consistence between new objects and PUT covered and provides final consistence of DELETE. The inventory list is the scrolling snapshot of bucket items which must be consistent at last (i.e., lists may not contain any objects added or deleted recently). For example, when inventory tasks configured by users are performed and object upload or deletion is performed by users, results of these operations may not be reflected in the inventory report.

If you need to verify object status before object execution, it is suggested that you shall execute the HEAD Object API request to retrieve object metadata or check object attribute in the Object Storage Service Console.

# Operation Guide of Console

## Inventory Function

OSS inventory can provide you with flat file lists of objects and metadata. These lists can replace List API synchronization via OSS in a planned way. OSS inventory can provide comma-separated values (CSV), used for listing your objects and its corresponding metadata, by day or by week for bucket or objects with shared prefixes (i.e., the objects with names starting with the same character strings).

### Inventory Configuration Steps

*It requires at least 48 hours to deliver the first report.

1. Log in [Object Storage Service Console](https://oss-console.jdcloud.com/space);
2. In the [Space Management] list, select a bucket (source bucket) where the desired inventory function is selected and click **Login**;
3. Click the tab **Space Setting** and select the **Inventory Setting** option;
4. Click **Add Inventory**;
5. You can make the configuration on the [Add Inventory] Page through the method below:
   - Inventory name: Enter your output inventory name.
   - Filter condition: (Optional) By adding prefixes to filter conditions, objects whose names start with the same character string can be searched. If no prefixes are entered, filtering without any conditions will be conducted by default.
   - Target bucket: Select the target bucket where reports are saved. The initial default target bucket is the source bucket which must be located in the same region of the target bucket. The same target bucket is available for different JDCloud accounts.
   - Target prefix (optional): (Optional) You may select a prefix for a target bucket and group inventory documents at the public position.
   - Frequency: Please select the inventory producing frequency. Output is conducted by day/week. If no option is selected, the default value is by day.
   - Status: You can select to enable/disable the list.
   - [Advanced Configuration]: You can configure more inventory information in advanced configuration. If not, the default setting shall prevail.
   - Output format: By default, the CSV format output is adopted.
   - Inventory information: Select corresponding object information to be included in an inventory report from options such as object size, storage type, ETag and last modified time. If no option is selected, all of them will be selected by default.
   - Encryption: Select server encryption for inventory or not. Now, the inventory report is not encrypted.
6. After confirm the configuration information is correct, click the **Save** button to complete addition.

### Policy of Target Bucket

Create bucket permission policies for a target bucket to which the OSS write permission is granted. In this way, OSS can write data of inventory reports in the bucket.

If you have chosen the target bucket in another account, but do not have any permission to read and write in the bucket policy, you may see the message below: 'Failed to save or create any Bucket policy at the target Bucket. Please contact the target Bucket owner to add relevant Bucket policies and data of this account are allowed to be stored in Bucket'. In such case, the target bucket owner must add the bucket policy displayed to the target bucket. If the policy is not added to the target bucket, you will not obtain any inventory report, because the source bucket owner has no right to write in the target bucket.