# describeTde


## Description
View whether the current instance enables TDE

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/tde

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS Instance ID, the Unique Identifier of One RDS Instance|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describetde#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**status**|String|Whether the current instance enables TDE function. If enabled, return to true; if not, return to false; if enabling, return to pending|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeTde() {
    DescribeTdeRequest request = new DescribeTdeRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setRegionId("cn-north-1");
    DescribeTdeResponse response = rdsClient.describeTde(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpaopha7ujj6nn4ikjm4vhuo6oom2ovd", 
    "result": {
        "status": "false"
    }
}
```
