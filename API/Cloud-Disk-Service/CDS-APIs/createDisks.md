# createDisks


## Description
Create one or more cloud disks according to designated configuration

- The available Cloud Disk Service types include hdd.std1, ssd.gp1 and ssd.io1
- Disk Size
    - hdd.std1: Capacity type hdd, with range [20,16000]GiB, step size of 10GiB and iops obtained by calculation which is directly proportional to the capacity of purchased disk
    - ssd.gp1: General type ssd, with range [20,16000]GiB, step size of 10GiB and iops obtained by calculation which is directly proportional to the capacity of purchased disk.
    - ssd.io1: Performance type ssd, with range [20,16000]GiB, step size of 10GiB, iops obtained by calculating the purchased capacity or designated by the user.
- Others
    - After being created, the cloud disk status is available
    - Available parameter snapshot ID is used for creating new disk from snapshots
    - In the case of being created in batches, cloud disk is named as Disk Name-Number, such as myDisk-1 and myDisk-2
    - maxCount refers to the maximum effort and maxCount is not guaranteed


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
|**diskType**|String|True| |Cloud Disk Service type, with the value of ssd.gp1, ssd.io1 or hdd.std1|
|**diskSizeGB**|Integer|True| |Size of Cloud Disk Service is in GiB; for the ssd.io1 type, the value range is [20,16000]GB and the step size is 10G, for the ssd.gp1 type, the value range is [20,16000]GB, and the step size is 10G; and for the hdd.std1 type, the value range is [20,16000]GB and the step size is 10G|
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
|**autoRenew**|boolean|False|false|true refers to enable automatic renewal, but false refers to disable automatic renewal and is only valid for resources in monthly package. Upon enabling, the purchase duration created at this time will be adopted as the automatic renewal period which can be modified in the Renew Management function.|

## Successful Response

```json
{
    "result": {
        "diskIds": [string]
    },
    "requestId": string
}
```

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
 
