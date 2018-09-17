# failoverInstance


## 描述
Perform a RDS Instance Failover. <br>Note: If the instance is being backed up, the failover will terminate the backup operation. You can view the start time of backup in the backup policy to see whether a backup is running. If you need to perform the failover during the instance backup, you are advised to perform a full instance backup manually<br>for SQL Server, within 30 minutes of failover, restore/create by time point is not supported. For example, the user performs the failover at 10:05, then the time period from 10:05 to 10:35 cannot be restored/created. <br>- Support SQL Server Only

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:failoverInstance

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
