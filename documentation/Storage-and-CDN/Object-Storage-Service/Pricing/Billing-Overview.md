# Billing Overview

## Charging Items

JD Cloud object storage service adopts the quantity-based pay-as-you-go billing mode, which pushes the bill on a daily basis according to the actual consumption of user and collects charge for the previous day as per the bill per day. Currently, the base charging items for JD Cloud object storage service include: bucket capacity, access traffic and request times.

Bucket capacity: refers to the data occupancy amount of the bucket, including the actual bucket occupancy amount and data retrieval amount; the data retrieval amount mainly refers to the access to low-redundancy storage type files, which will calculate the amount of data retrieval according to the reading size of the file, without distinguishing the Intranet from the Internet.

Access traffic: refers to the accumulative value of network traffic consumed, including output traffic of Internet, output traffic of Intranet, input traffic of Internet, input traffic of Intranet, CDN back-to-source output traffic and cross-region replication traffic.

Request time: request time for calling JD Cloud object storage service  API. User console actions also are implemented by calling  API, so when using user console to operate on object storage service, number of requests will be generated as well.

Description: JD Cloud object storage service is at the stage of profit concession promotion now, only bucket usage, Internet output traffic and CDN back-to-source output traffic are charged while data getting back amount, intranet input traffic/output traffic, Internet input traffic and cross-region replication traffic are all free at present.

## Rules about arrearage

1. When your object storage service failed to deduct your previous day’s bill cost, it will be regarded as arrearage status.

2. The object storage service will automatically stop when the time of arrearage exceeds 24 hours, you can operate nothing by using object storage service. But the resource of storage space that you occupy will continue to be charged, so the arrearage balance will be accumulated.

3. If you recharge to make up the arrears within 60 days from the begin date of your arrearage, the service will automatically enabled for use; If you do not make up the arrears within that 60 days, you will be regarded as giving up object storage service, your bucket will be withdrawn, the data in the bucket will be cleared and cannot be recovered.
