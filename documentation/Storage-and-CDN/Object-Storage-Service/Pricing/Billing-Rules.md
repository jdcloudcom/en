# Billing Instructions

This paper mainly introduces the components and billing methods of OSS service charge of JD Cloud object storage, and you can learn more about OSS service charge collection through this paper.

* [Billing Method](Billing-Rules#user-content-1)
* [Cost Composition](Billing-Rules#user-content-2)
    * [Storage Cost](Billing-Rules#user-content-3)
    * [Traffic Cost](Billing-Rules#user-content-4)
    * [Request Cost](Billing-Rules#user-content-5)
    * [Data Retrieval Cost](Billing-Rules#user-content-6)
    * [Cloud Data Processing Cost](Billing-Rules#user-content-7)

## Billing Method

<div id="user-content-1"></div>

All regions of JD Cloud object storage service adopt the quantity-based pay-as-you-go billing mode, which pushes the bill on a daily basis according to the actual consumption of user and collects charge for the previous day as per the bill per day.

**Description **:
Standard storage type gives you free tier across all regions, please see [Free Tier](https://docs.jdcloud.com/en/object-storage-service/free-tier-for-oss).

## Cost Composition

<div id="user-content-2"></div>

OSS service charge is composed of storage cost, traffic cost, request cost, data retrieval cost, Cloud processing cost:

![计费组成](../../../../image/Object-Storage-Service/OSS-156.png)

**Description**
All charging items of OSS are charged separately. For example: You store data of 100GB in OSS bucket, which will incur storage costs every day; if your data is accessed through Internet every day, you will also incur Internet outflow traffic costs.


###  Storage Cost
<div id="user-content-3"></div>

OSS service provides multiple storage types: standard storage type, archival storage type, reduced redundancy storage type. See [Storage Type Introduction](../Introduction/StorageClass-Overview.md) for details.

Storage cost is charged according to the actual storage capacity. Storage charges incurred by different storage types are described below:

**Description:** In [Product Pricing](./Price-Overview.md), the storage cost is settled per GB per day.

|Storage Type |Measurement Item| Billing Method|
|:---|:--|:---|
|Standard Storage|Storage Amount: Calculate according to actual storage. <br>  Storage Time: Calculate by actual storage time. |Settle the storage cost for standard storage type files in the bucket once a day. <br>Storage cost: storage amount per region≤10: Free<br>(storage amount (GB)-10(GB))\* Unit price per day for standard storage.|
|Infrequent Access Storage|Storage Capacity:<br>  If the stored single file is less than 64KB, it is calculated according to 64KB. For example, if 10 files of 30KB are stored, 10 files of 64KB are calculated for storage capacity.<br>   If the stored single file is more than or equal to 64KB, it is calculated according to the actual size.<br>  Storage time:<br>   Less than 30 days, calculate as per 30 days.<br>  More than or equal to 30 days, calculated according to the actual storage time. |Settle the storage cost for infrequent access storage files in the bucket once a day.<br>Storage Cost: Storage Capacity (GB) \* Unit price per hour for infrequent access storage.<br>**Description: ** Uploading or copying a file of the same name to OSS will cause the OSS original file to be deleted, or simply delete infrequent access storage type files that have not been stored for 30 days, the system will add the storage cost for the remaining days when the next cost is settled. For example: example (old) is the infrequent access storage type file, and it will be overwritten as example (new) after 10 days of storage. The system will add the storage cost of example (old) for the remaining 20 days in the next cost settlement and calculate the storage cost of example (new) normally.|
|Archival Storage|Storage Amount: <br>  Size of stored single file is less than 48KB, calculated according to 48KB. For example, 10 files of 30KB are stored, and 10 files of 48KB are calculated for storage amount. <br>   Size of stored single file is more than or equal to 48KB, calculated according to the actual size. <br>  Storage time:<br>   Less than 60 days, calculate as per 60 days. <br>  More than or equal to 60 days, calculated according to the actual storage time. |Settle the storage cost for archival storage type files in the bucket once a day. <br>Storage cost: storage amount (GB)\* Unit price per day for archival storage. <br>**Description: ** Uploading or replication of a file of the same name to OSS will cause the OSS original file to be deleted, or simply delete archival storage type files that have not been archived for 60 days, the system will add the storage cost for the remaining days when the next cost is settled. For example: example (old) is the archival storage type file, and it will be overwritten as example (new) after 10 days of storage. The system will add the storage cost of example (old) for the remaining 50 days in the next cost settlement and calculate the storage cost of example (new) normally.|
|Reduced Redundancy Storage| Storage Amount: Calculate according to actual storage amount. <br>  Storage Time: Calculate by actual storage time. |Settle the storage cost for reduced redundancy storage type files in the bucket once a day. Storage cost: storage amount (GB)\*Unit price per day for reduced redundancy storage.|

### Traffic Cost 
<div id="user-content-4"></div>

Traffic means the cumulative value of network bandwidth traffic you use. Specific measurement items include output traffic of Internet, output traffic of Intranet, input traffic of Internet, input traffic of Intranet, CDN back-to-origin outflow traffic and cross-region replication traffic. See [Pricing](./Price-Overview.md) for detailed price.

|Measurement Item|Measurement Method|Billing Method|
|---|----|----|
|Input Traffic of Intranet|Uplink traffic generated by uploading data from internal service such as Virtual Machines to object storage service via JD Cloud Intranet. |Free|
|Intranet Outflow Traffic|Downlink traffic generated by downloading data from object storage service to internal service such as Virtual Machines via JD Cloud Intranet. |Free|
|Input Traffic of Internet|Uplink traffic generated by uploading data from local end to JD Cloud Object Storage Service via public network |Free|
|Outflow Traffic of Internet|Downlink traffic generated by downloading data from JD Cloud Object Storage Service to local end via public network |The traffic cost will be charged per day, accumulatively. <br>Every day’s accumulative Internet outflow traffic (GB)\*Unit price per GB. For example, in certain Bucket in Beijing Region, the outflow flow of Internet has generated 100GB accumulatively, so the Internet outflow traffic cost is 0.5\*100 (GB) = RMB 50|
|CDN Back-to-origin Outflow Traffic|Back-to-origin downlink traffic generated by downloading OSS data via CDN service layer. |CDN back-to-origin outflow traffic (GB) accumulated everyday\*Unit price per GB|
|Cross-region Replication Traffic|Outflow traffic generated by synchronizing and replicating data from source Bucket to target Bucket via cross-region replication function. |Every day’s accumulative cross-region replication traffic (GB) \* Unit price per GB|


## Cost of Number of Requests
<div id="user-content-5"></div>

All your OSS operations are ultimately calls to the OSS API, whether through the Console or other tools. APIs call cost will be billed by the times you call OSS APIs. See [Pricing](./Price-Overview.md) for cost of times of write operations and read operations.

|Measurement Item|Measurement Method|Billing Method|
|---|----|----|
|Times of Call OSS APIs|Request Times of Call OSS APIs |The cost of calling OSS APIs is settled per hour. Formula for calculating the cost of request times: Unit price per 10,000 calls \* Actual times of calls per hour /10000.**Description:** The billing item is temporarily free|

### Data Retrieval Cost 

<div id="user-content-6"></div>

If you access a file of infrequent access storage type or archival storage type, there will be an additional data retrieval cost. See [Pricing](./Price-Overview.md) for detailed price.

|Storage Type |Measurement Item| Billing Method|
|----|---|----|
|Archival Storage|Archival storage files need to be restored before being accessed, resulting in a file retrieval cost. |Settle the data retrieval cost once a day: Restore file size (GB) \*For archival storage, correspond to the retrieval unit price per GB of data in retrieval mode.|
|Infrequent Access Storage|There will be retrieval cost for infrequent access storage files, which is calculated according to the actual read size. |Settle the data retrieval cost once a day: Actual read file size (GB) \*Retrieval unit price for per GB data in infrequent access storage.|

### Cloud Data Processing Cost 

<div id="user-content-7"></div>

If you use the video transcoding, snapshots and image processing functions of OSS, there will be cloud data processing cost, see [Pricing](./Price-Overview.md) for detailed prices.

|Storage Type |Measurement Item| Billing Method|
|----|---|----|
|Transcoding Duration of Audio and Video|File output duration by audio and video transcoding service. |Every day’s accumulative file output duration\* Unit price for transcoding per minute.|
|Number of Video Snapshots|Number of snapshots by video snapshot service. |Every day’s accumulative number of snapshots/1,000\* unit price for each 1,000 snapshots.|
|Image Processing|OSS calculates the amount of data processing according to the actual size of the original file. |Size of Image File * The unit price of image processing per GB is free at present|



