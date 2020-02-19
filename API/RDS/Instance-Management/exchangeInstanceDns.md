# exchangeInstanceDns


## Description
Exchange the domains of two instances, including intranet and internet ones. No exchange is allowed, when one instance has an internet domain while the other doesn’t. <br>- Only Support SQL Server

## Request Method
POST

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:exchangeInstanceDns

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [*Table of Comparisons of Regions and Availability Zones*](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**targetInstanceId**|String|True| |Instance ID to be exchanged|


## Response parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
POST
```
public void testExchangeInstanceDns() {
    ExchangeInstanceDnsRequest request = new ExchangeInstanceDnsRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setTargetInstanceId("sqlserver-0nyjcvjxls");
    request.setRegionId("cn-north-1");
    ExchangeInstanceDnsResponse response = rdsClient.exchangeInstanceDns(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa61wag1qsn1pcvq86ksr053pfpnt75"
}
```
