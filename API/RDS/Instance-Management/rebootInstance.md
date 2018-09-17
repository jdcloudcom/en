# rebootInstance


## 描述
Reboot the RDS instance. For example, after modifying some configuration parameters, you need to reboot the instance to take effect. You can combine the failover function to reboot the standby machine to reduce the impact on the service<br>**Note: If the instance is being backed up, rebooting the primary instance will terminate the backup operation. ** You can view the start time of backup in the backup policy to see whether a backup is running. If you need to reboot the primary instance during the instance backup, you are advised to perform a full instance backup manually after rebooting.

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:rebootInstance

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**rebootMaster**|Boolean|False||Whether to reboot the primary node. <br> -Only SQL Server supports this parameter|
|**rebootSlave**|Boolean|False||Whether to reboot the standby node. <br>- Only SQL Server supports this parameter|


## 返回参数
|名称|类型|描述|
|---|---|---|



## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
