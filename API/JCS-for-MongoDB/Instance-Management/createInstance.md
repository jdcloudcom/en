# createInstance


## 描述
Create Instance

## 请求方式
POST

## 请求地址
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**chargeSpec**|[ChargeSpec](##ChargeSpec)|False||Payment Method|
|**instanceSpec**|[DBInstanceSpec](##DBInstanceSpec)|True||Instance Type|

### <a name="DBInstanceSpec">DBInstanceSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**azId**|String[]|True||AZ ID, required, the first ID is AZ ID of primary, the second is that of secondary, and the third is that of hidden. If Yes is chosen for multiAZ, then AZ IDs of primary and secondary shall be the same and different from that of hidden; if No is chosen for multiAZ, AZ IDs of the three nodes shall be the same.|
|**backupId**|String|False||Create specific backup ID for use according to backup|
|**engine**|String|False||Database Type, MongoDB|
|**engineVersion**|String|False||Database Version, 3.2|
|**instanceClass**|String|True||Instance type code. Mongo.s1.small: 1-core 2G; mongo.s1.medium: 2-core 4G; mongo.s1.large: 4-core 8G; mongo.s1.xlarge: 8-core 16G; mongo.s2.2xlarge: 8-core 32G; Mongo.s2.4xlarge: 16-core 64G;|
|**instanceName**|String|False||The instance name only supports numbers, letters, underlines, Chinese, with length no less than 2 characters and no more than 32 characters.|
|**instanceStorageGB**|Integer|True||Storage space, in GB, value within 10-1000, a multiple of 10.|
|**multiAZ**|Boolean|True||Whether to Select Multiple Availability Zone Deployment|
|**originDBInstanceId**|String|False||Create new instance based on backup of an instance. If you fill in, restoreTime also needs to be filled.|
|**password**|String|False||The password must contain and only support letters and numbers with length no less than 8 characters and no more than 16 characters.|
|**restoreTime**|String|False||The user specifies any time point in the backup retention period, such as 2011-06-11T16:00:00Z. It is not required and is mutually exclusive with backupId.|
|**subnetId**|String|True||Subnet ID|
|**vpcId**|String|True||VPCID|
### <a name="ChargeSpec">ChargeSpec</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**chargeDuration**|Integer|False||Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False||Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**instanceId**|String||
|**orderId**|String||

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
