# describeAccountPrivilege


## Description
View the permission information for RDS instance account \- Only support MySQL, Percona and MariaDB

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts/{accountName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|
|**accountName**|String|True| |For Account Name, in the same instance, the Account Name cannot be repeated|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeaccountprivilege#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**databasePrivileges**|[DatabasePrivilege[]](describeaccountprivilege#databaseprivilege)|Fine-grained permission content for database|
|**globalPrivileges**|String[]|For global permission information, please refer to [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md) to get details|
### <div id="databaseprivilege">DatabasePrivilege</div>
|Name|Type|Description|
|---|---|---|
|**dbName**|String|Database Name|
|**privileges**|String[]|For fine-grained permission that the account possesses to the database, please refer to [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md) to get details|
|**tablePrivileges**|[TablePrivilege[]](describeaccountprivilege#tableprivilege)|Fine-grained permission content for database table|
### <div id="tableprivilege">TablePrivilege</div>
|Name|Type|Description|
|---|---|---|
|**tableName**|String|Database table name|
|**privileges**|String[]|For fine-grained permission that the account possesses to the database table, please refer to [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md) to get details|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeAccountPrivilege() {
    DescribeAccountPrivilegeRequest request = new DescribeAccountPrivilegeRequest();
    request.setAccountName("dj_ac");
    request.setInstanceId("mysql-wp4e9ztap2");
    request.setRegionId("cn-north-1");
    DescribeAccountPrivilegeResponse response = rdsClient.describeAccountPrivilege(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa077r076iik0m8gf2uaa22ev5f071v", 
    "result": {
        "databasePrivileges": [], 
        "globalPrivileges": [
            "REPLICATION CLIENT", 
            "REPLICATION SLAVE", 
            "PROCESS"
        ]
    }
}
```
