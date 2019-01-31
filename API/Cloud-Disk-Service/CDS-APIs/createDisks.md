# createDisks


## Description
-   Create one or more Cloud Disks that are paid by configuration or by service time.
-   Cloud Disk Service types include Premium Hdd Cloud Disk (premium-hdd), SSD Cloud Disk (ssd), general SSD (ssd.gp1), performance-oriented SSD (ssd.io1) and capacity-oriented HDD (hdd.std1).
-   The billing method defaults to paying by configuration.
-   After creation is completed, the status of the Cloud Disk is available.
-   The optional parameter snapshot ID is used to create a new disk.
-   In batch creation, the name of the Cloud Disk is: hard disk name -number, such as myDisk-1 and myDisk-2.
-   maxCount is the maximum effort, and it is not guaranteed that maxCount can be reached.


## Request method
POST

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**diskSpec**|DiskSpec|True| |Create the specification of the cloud disk|
|**maxCount**|Integer|True| |Purchase number of instances; value range: [1,100]|
|**clientToken**|String|True| |Idempotence Check Parameter|

### DiskSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True| |Availability Zone, to which the cloud disk belongs|
|**name**|String|True| |Name of the cloud disk|
|**description**|String|False| |Description of the cloud disk|
|**diskType**|String|True| |Type of the cloud disk, value ssd, premium-hdd, ssd.gp1, ssd.io1 or hdd.std1|
|**diskSizeGB**|Integer|True| |Size of the cloud disk, unit: GiB; ssd value range of [20,1000]GB and step size of 10G; premium-hdd value range of [20,3000]GB and step size of 10G|
|**snapshotId**|String|False| |Snapshot ID used to create a cloud disk|
|**charge**|ChargeSpec|False| |Billing configuration. If not specified, the default billing type is pay-as-you-go - pay by service time by default.|
|**multiAttachable**|Boolean|False| |Whether the Cloud Disk Service supports the mode that one disk is attached to multiple machines. It is set as false by default (not supported).|
|**encrypt**|Boolean|False| |Whether a Cloud Disk is encrypted, false (does not encrypt) by default|
### ChargeSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Result Set|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**diskIds**|String[]|List of Cloud Disk IDs created|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
