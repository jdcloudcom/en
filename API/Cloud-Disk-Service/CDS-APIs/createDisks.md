# createDisks


## Description
-   Create one or more cloud disk services that are paid by configuration or by service time.
-   Disk type includes Premium Hdd Cloud Disk and SSD Cloud Disk.
-   The billing method defaults to paying by configuration.
-   After creation is completed, the cloud disk service is in available status.
-   The optional parameter snapshot ID is used to create a new disk.
-   When creating in batches, the name of the cloud disk service is: hard disk name -number, such as myDisk-1 and myDisk-2.
-   maxCount is the maximum effort, and it is not guaranteed that maxCount can be reached.


## Request method
POST

## Request address
https://disk.jdcloud-api.com/v1/regions/{regionId}/disks

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**clientToken**|String|True|| Idempotence check parameter|
|**diskSpec**|DiskSpec|True||Create specification of the cloud disk service|
|**maxCount**|Integer|True||Instance purchase quantity; value range: [1,100]|

### <a name="DiskSpec">DiskSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**az**|String|True||Availability zone, to which the cloud disk service belongs|
|**charge**|ChargeSpec|False||Billing configuration. If not specified, the default billing type is pay-as-you-go - pay by service time by default.|
|**description**|String|False||Description of the cloud disk service|
|**diskSizeGB**|Integer|True||Size of the cloud disk service, in GiB; ssd value range of [20,1000]GB and step size of 10G; premium-hdd value range of [20,3000]GB and step size of 10G|
|**diskType**|String|True||Type of the cloud disk service, value ssd or premium-hdd|
|**multiAttachable**|Boolean|False||Whether the cloud disk service supports the mode that one disk is attached to multiple machines. It is set as false by default (not supported).|
|**name**|String|True||Name of the cloud disk service|
|**snapshotId**|String|False||Snapshot ID used to create cloud disk service|
### <a name="ChargeSpec">ChargeSpec</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeDuration**|Integer|False||Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False||Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Result Set|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**diskIds**|String[]|List of cloud disk service IDs created|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
|**200**|OK|
|**404**|Not found|
|**429**|Quota exceeded|
