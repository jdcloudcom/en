# describeAuditOptions


## Description
Obtain the audit option of various database version supported by the current system and the relevant options<br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:describeAuditOptions

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**name**|String|True| |Audit option category, **case sensitivity**, currently supports two types: <br>(1) AuditOptions begin: return all the options supported by each version of SQL Server in disabled parameters, the name supported is <br>AuditOptions2008R2<br>AuditOptions2012<br>AuditOptions2014<br>AuditOptions2016<br>For instance, enter the parameter "AuditOptions2016", return all the audit options supported by SQL Server 2016 version in the disabled field<br>(2) Begin with AuditDefault: the default option recommended by JD Cloud, which returns the options recommended to be enabled in enabled parameters and returns the options not to be enabled in disabled parameters, and the supported name is: <br>AuditDefault2008R2<br>AuditDefault2012<br>AuditDefault2014<br>AuditDefault2016<br>For instance, if the entered parameter is "AuditDefault2016", the audit options recommended to be enabled by JD Cloud in SQL Server 2016 version are returned in the enabled field, and the options recommended not to be enabled are returned in the disabled field|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeauditoptions#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**enabled**|String[]| |
|**disabled**|String[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeAuditOptions(){
    DescribeAuditOptionsRequest describeAuditOptionsRequest = new DescribeAuditOptionsRequest();
    describeAuditOptionsRequest.setInstanceId("sqlserver-83uqv7avy4");
    describeAuditOptionsRequest.setName("AuditOptions2016STD");
    describeAuditOptionsRequest.setRegionId("cn-north-1");
    DescribeAuditOptionsResponse describeAuditOptionsResponse = rdsClient.describeAuditOptions(describeAuditOptionsRequest);
    System.out.println(new Gson().toJson(describeAuditOptionsResponse));
}

```

## Return Example
```
{
    "requestId": "bpa2qaq8hkc99jeggm1thwhs2v9c9e7e", 
    "result": {
        "disabled": [
            "APPLICATION_ROLE_CHANGE_PASSWORD_GROUP", 
            "AUDIT_CHANGE_GROUP", 
            "BACKUP_RESTORE_GROUP", 
            "BROKER_LOGIN_GROUP", 
            "DATABASE_CHANGE_GROUP", 
            "DATABASE_LOGOUT_GROUP", 
            "DATABASE_MIRRORING_LOGIN_GROUP", 
            "DATABASE_OBJECT_ACCESS_GROUP", 
            "DATABASE_OBJECT_CHANGE_GROUP", 
            "DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP", 
            "DATABASE_OBJECT_PERMISSION_CHANGE_GROUP", 
            "DATABASE_OPERATION_GROUP", 
            "DATABASE_OWNERSHIP_CHANGE_GROUP", 
            "DATABASE_PERMISSION_CHANGE_GROUP", 
            "DATABASE_PRINCIPAL_CHANGE_GROUP", 
            "DATABASE_PRINCIPAL_IMPERSONATION_GROUP", 
            "DATABASE_ROLE_MEMBER_CHANGE_GROUP", 
            "DBCC_GROUP", 
            "FAILED_DATABASE_AUTHENTICATION_GROUP", 
            "FAILED_LOGIN_GROUP", 
            "FULLTEXT_GROUP", 
            "LOGIN_CHANGE_PASSWORD_GROUP", 
            "LOGOUT_GROUP", 
            "SCHEMA_OBJECT_ACCESS_GROUP", 
            "SCHEMA_OBJECT_CHANGE_GROUP", 
            "SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP", 
            "SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP", 
            "SERVER_OBJECT_CHANGE_GROUP", 
            "SERVER_OBJECT_OWNERSHIP_CHANGE_GROUP", 
            "SERVER_OBJECT_PERMISSION_CHANGE_GROUP", 
            "SERVER_OPERATION_GROUP", 
            "SERVER_PERMISSION_CHANGE_GROUP", 
            "SERVER_PRINCIPAL_CHANGE_GROUP", 
            "SERVER_PRINCIPAL_IMPERSONATION_GROUP", 
            "SERVER_ROLE_MEMBER_CHANGE_GROUP", 
            "SERVER_STATE_CHANGE_GROUP", 
            "SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP", 
            "SUCCESSFUL_LOGIN_GROUP", 
            "TRACE_CHANGE_GROUP", 
            "TRANSACTION_GROUP", 
            "USER_CHANGE_PASSWORD_GROUP", 
            "USER_DEFINED_AUDIT_GROUP"
        ], 
        "enabled": []
    }
}
```
