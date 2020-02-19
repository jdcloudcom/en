# describeAccounts


## Description
View all account information in an RDS instance, including the account name, access rights to each database, etc.

## Request method
GET

## Request address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/accounts

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|

## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |The page displaying the data, which is 1 by default, with value range: [-1,∞). When the pageNumber is -1, all data pages are returned; when it exceeds the total pages, the last page is displayed;|
|**pageSize**|Integer|False| |The data entries displayed on each page, which is 100 by default, with the value range: [10,100], which is used for searching interfaces of lists|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeaccounts#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accounts**|[Account[]](describeaccounts#account)| |
|**totalCount**|Integer| |
### <div id="account">Account</div>
|Name|Type|Description|
|---|---|---|
|**accountName**|String|Account Name, see Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules of Account Name|
|**accountStatus**|String|Account status, detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)<br>- **MySQL: Not support, not return this field**<br>- **SQL Server: return this field**|
|**accountType**|String|Account types of normal: Normal and super: Advanced permission<br>- Only support SQL Server|
|**createTime**|String|Account creation time, with the format: YYYY-MM-DD HH:mm:ss<br>- Only support PostgreSQL|
|**updateTime**|String|Account modification time, with the format: YYYY-MM-DD HH:mm:ss<br>- Only support PostgreSQL|
|**notes**|String|Account description content<br>- Only support PostgreSQL|
|**accountPrivileges**|[AccountPrivilege[]](describeaccounts#accountprivilege)|Permission Owned|
### <div id="accountprivilege">AccountPrivilege</div>
|Name|Type|Description|
|---|---|---|
|**dbName**|String|Database Name, see Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md) for specific rules|
|**privilege**|String|Privilege of account to the database with the specific definition detailed in [Enumeration Parameter Definition](../Enum-Definitions/Enum-Definitions.md)|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeAccounts() {
    DescribeAccountsRequest request = new DescribeAccountsRequest();
    request.setRegionId("cn-north-1");
    request.setInstanceId("mysql-wp4e9ztap2");
    DescribeAccountsResponse response = rdsClient.describeAccounts(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa03bvk9sf8qkbri7215avh7k4q2rdv", 
    "result": {
        "accounts": [
            {
                "accountName": "dj_ac", 
                "accountPrivileges": [], 
                "accountStatus": "RUNNING"
            }
        ], 
        "totalCount": 1
    }
}
```
