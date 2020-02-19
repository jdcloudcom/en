# describePrivilege


## Description
View the permission information for Cloud Database RDS - Only support MySQL, Percona and MariaDB

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/common:describePrivilege

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**engine**|String|True| |Set visible engine types, such as MySQL|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeprivilege#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**globalPrivileges**|String[]|For global permission information, please refer to [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md) to get details|
|**databasePrivileges**|String[]|For database permission information, please refer to [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md) to get details|
|**tablePrivileges**|String[]|For database table permission information, please refer to [Enumeration Parameter Definitions](../Enum-Definitions/Enum-Definitions.md) to get details|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribePrivilege() {
    DescribePrivilegeRequest request = new DescribePrivilegeRequest();
    request.setRegionId("cn-north-1");
    request.setEngine("MySQL");
    DescribePrivilegeResponse response = rdsClient.describePrivilege(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa3kg3q43nwe1f5195f969n4n4rktcc", 
    "result": {
        "databasePrivileges": [
            "DROP", 
            "EVENT", 
            "LOCK TABLES", 
            "REFERENCES", 
            "ALTER", 
            "CREATE VIEW", 
            "CREATE", 
            "DELETE", 
            "INDEX", 
            "INSERT", 
            "SELECT", 
            "SHOW VIEW", 
            "TRIGGER", 
            "UPDATE", 
            "ALTER ROUTINE", 
            "EXECUTE", 
            "CREATE TEMPORARY TABLES", 
            "CREATE ROUTINE"
        ], 
        "globalPrivileges": [
            "PROCESS", 
            "REPLICATION SLAVE", 
            "REPLICATION CLIENT"
        ], 
        "tablePrivileges": [
            "ALTER", 
            "CREATE VIEW", 
            "CREATE", 
            "DELETE", 
            "DROP", 
            "INDEX", 
            "INSERT", 
            "REFERENCES", 
            "SELECT", 
            "SHOW VIEW", 
            "TRIGGER", 
            "UPDATE"
        ]
    }
}
```
