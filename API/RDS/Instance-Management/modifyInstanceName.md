# modifyInstanceName


## Description
Modify Instance Name, which may support Chinese, and the specific rules of Instance Name may refer to the Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyInstanceName

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**instanceName**|String|True| |Instance Name, which supports Chinese, and the specific rules of Instance Name may refer to the Help Center Document: [Name and Password Restrictions](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testModifyInstanceName() {
    ModifyInstanceNameRequest request = new ModifyInstanceNameRequest();
    request.setRegionId("cn-north-1");
    request.setInstanceId("mysql-wp4e9ztap2");
    request.setInstanceName("hdj_test2");
    ModifyInstanceNameResponse response = rdsClient.modifyInstanceName(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa4ua83cwmp7se0m4i7a85a51ht16pp"
}
```
