# describeInstances


## 描述
Query Instance Information

## 请求方式
GET

## 请求地址
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||instanceId - Instance ID, Accurate Matching<br>instanceName - Instance Name, Fuzzy Matching<br>instanceStatus - mongodb status, accurate matching, support multiple RUNNING: Running, ERROR: Error, BUILDING: Creating, DELETING: Deleting, RESTORING: Restoring, RESIZING: under Configuration Change<br>chargeMode - Billing Type, Accurate Matching<br>|
|**pageNumber**|Integer|False||Page number; default: 1; value range: [1, ∞)|
|**pageSize**|Integer|False||Page size; default: 10; value range: [10,100]|
|**sorts**|[Sort[]](##Sort)|False||createTime - Creation Time, asc (Positive Order), desc (Reverse Order)<br>|

### <a name="Filter">Filter</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|
### <a name="Sort">Sort</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**direction**|String|False||Direction of sorting requirements|
|**name**|String|False||Name of sorting requirements|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**dbInstances**|[DBInstance[]](##DBInstance)||
|**pageNumber**|Integer||
|**totalCount**|Integer||
### <a name="DBInstance">DBInstance</a>
|名称|类型|描述|
|---|---|---|
|**accountName**|String|Default User Name|
|**azId**|String[]|AZ ID, AZs at primary, secondary and hidden nodes in turn.|
|**backupRetentionPeriod**|Integer|Automatic Backup Retention Time|
|**charge**|[Charge](##Charge)|Billing Information|
|**createTime**|String|Creation Time|
|**dBName**|String|Default Database Name|
|**engine**|String|Database Type|
|**engineVersion**|String|Database Version|
|**instanceCPU**|Integer|Number of CPU Cores|
|**instanceClass**|String|Instance Type Code|
|**instanceDomain**|String|Domain Name|
|**instanceId**|String|Instance ID|
|**instanceMemoryGB**|Integer|Memory, in GB|
|**instanceName**|String|Instance Name|
|**instancePort**|String|Application Access Port|
|**instanceStatus**|String|Instance Status. RUNNING: Running, ERROR: Error, BUILDING: Creating, DELETING: Deleting, RESTORING: Restoring, RESIZING: under Configuration Change|
|**instanceStorageGB**|Integer|Storage Space|
|**isSetSecurityIps**|Boolean|Whether to Set Whitelist, true: set, false: not set|
|**preferredBackupWindow**|String|Automatic backup time, for example: 00:00-02:00, indicating automatic backup of the database from 0 to 2|
|**preferredmaintenanceWindow**|String|System maintenance time, for example: 00:00-02:00, indicating system maintenance from 0 to 2|
|**replicaSetName**|String|Name of Replica Set|
|**subnetId**|String|Subnet ID|
|**vpcId**|String|VPCID|
### <a name="Charge">Charge</a>
|名称|类型|描述|
|---|---|---|
|**chargeExpiredTime**|String|Expiration time, i.e. the expiration time of Pay-In-Advance resource, which shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ. Pay-As-You-Go resource field is blank.|
|**chargeMode**|String|Payment model, the value shall be prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration refers to Pay-In-Advance; postpaid_by_usage refers to Pay By Consumption and Pay-As-You-Go; postpaid_by_duration refers to Pay By Configuration and Pay-As-You-Go, and is postpaid_by_duration by default|
|**chargeRetireTime**|String|The expected release time refers to the expected release time of resources. This value is both available for the Pay-In-Advance/Pay-As-You-Go resources, conforming to the ISO8601 standard, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStartTime**|String|The start time of the billing shall be subject to ISO8601, with the UTC time used in the format of YYYY-MM-DDTHH:mm:ssZ|
|**chargeStatus**|String|Cost payment status, the value is respectively normal, overdue and arrear.|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
