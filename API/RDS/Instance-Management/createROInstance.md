# createROInstance


## Description
Create read-only instances of MySQL<br> - Only support MySQL<br> - The created read-only instances are in the same subnet under the same VPC of the main instance<br> * The read-only instance only support Pay by Configuration

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:createROInstance

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceName**|String|True| |Instance Name, see Help Center Document [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules|
|**instanceClass**|String|True| |Read-only Instance Type FlavorId|
|**instanceStorageType**|String|False| |Storage Type, see [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md), the default value is: LOCAL_SSD|
|**instanceStorageGB**|Integer|True| |Disk Space|
|**azId**|String|True| |ID of Availability Zone|
|**vpcId**|String|False| |VPC ID, if it is not filled in, just remain the same VPC as the Regular Instance|
|**subnetId**|String|False| |Subnet ID, if it is not filled in, just remain the same subnet as the Regular Instance|
|**parameterGroup**|String|False| |Parameter Set ID, the same Parameter Set as the Regular Instance is adopted by default|
|**storageEncrypted**|Boolean|False| |Instance Data Encryption (data encryption will be supported only when the storage type is Cloud Disk Service). false: no encryption, true: encryption. The default is false.|
|**count**|Integer|False| |Number of Created Read-only Instances, 1 by Default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createROInstance#Result)| |

### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**roInstanceId**|String[]|List of Newly Created Read-only Instance IDs|
|**orderId**|String|Order ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
