# Billing Overview

## Billing Item Overview

Object Storage Service adopts the quantity-based pay-as-you-go billing mode, which pushes the bill on a daily basis according to the actual consumption of user and collects charge for the previous day as per the bill per day. Currently, the base charging items for JD Cloud Object Storage Service include: storage capacity, access traffic, request times, data retrieval and Cloud data processing.

Storage capacity: means data usage of bucket, standard storage type files are billed according to the actual storage capacity, infrequent access storage and archival storage type files has requirements on minimum storage unit and minimum storage days;

Data retrieval amount: For archival storage type, the billing is based on the size of the read file and the retrieval mode; for infrequent access storage, the billing is based on the size of the read file; without differentiating Intranet and Internet;

Access traffic: refers to the accumulative value of network traffic consumed, including output traffic of Internet, output traffic of Intranet, input traffic of Internet, input traffic of Intranet, CDN back-to-source output traffic and cross-region replication traffic;

Request time: request time for calling Object Storage Service API. User console actions also are implemented by calling API, so when using console to operate on Object Storage Service, number of requests will be generated as well.

Cloud data processing: refers to the data processing fees from using cloud data processing, including the file output duration of audio and video transcoding service and number of snapshots of video snapshot service.

**Description**

See [Billing Item](./Billing-Rules.md) for the details of OSS service charge composition and calculation method

## Free Quota

Users adopting standard storage type of OSS will also enjoy the storage capacity of specified volume for free. Free quota is provided to each availability zone of OSS correspondingly. You are welcome to try and experience the service. For details, please refer to [Free Quota](./Free-Tier-For-Oss.md). 


## Rules about Arrearage

1. When your Object Storage Service failed to deduct your previous day’s bill cost, it will be regarded as arrearage status.

2. The Object Storage Service will automatically stop when the time of arrearage exceeds 24 hours, you can operate nothing by using Object Storage Service. But the resource of Bucket that you occupy will continue to be charged, so the arrearage balance will be accumulated.

3. If you recharge to make up the arrears within 60 days from the begin date of your arrearage, the service will automatically enabled for use; If you do not make up the arrears within that 60 days, you will be regarded as giving up Object Storage Service, your bucket will be withdrawn, the data in the bucket will be cleared and cannot be recovered.
