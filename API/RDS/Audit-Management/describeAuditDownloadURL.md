# describeAuditDownloadURL


## Description
Obtain the download link of a certain audit file, both internal and external links are supported, and the validity time of the link is 24 hours<br>- only support SQL Server

## Request Method
GET

## Request Address
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:describeAuditDownloadURL

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region code, see the value range in [Table of Comparisons of Regions and Availability Zones](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS instance ID, the unique identifier of one RDS instance|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**fileName**|String|True| |Audit File Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeauditdownloadurl#result)| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**publicURL**|String|Public network download link, and if not downloadable currently, it is an empty string|
|**internalURL**|String|Intranet download link, and if not downloadable currently, it is an empty string|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

## Request Example
GET
```
public void testDescribeAuditDownloadURL(){
    DescribeAuditDownloadURLRequest request = new DescribeAuditDownloadURLRequest();
    request.setInstanceId("sqlserver-83uqv7avy4");
    request.setRegionId("cn-north-1");
    request.setFileName("RDSAudit_054F6E2E-01C1-41FD-ABC8-91EE34CD2AF9_0_132228536211390000.sqlaudit");
    DescribeAuditDownloadURLResponse response= rdsClient.describeAuditDownloadURL(request);
    System.out.println(new Gson().toJson(response));
}

```

## Return Example
```
{
    "requestId": "bpa2s5pamdfjjrirv2gwsnkq6v8c8mqf", 
    "result": {
        "internalURL": "http://oss-internal.cn-north-1.jcloudcs.com/jddbsqlserver/6d4ffa92-f497-4373-add9-c7493da70054/audit/RDSAudit_054F6E2E-01C1-41FD-ABC8-91EE34CD2AF9_0_132228536211390000.sqlaudit?Expires=1578467095&AccessKey=E3136A5602E671CD26D5A7B56A05F965&Signature=P7ku/1vTgHeYzdppg/WXt2+gRP8=", 
        "publicURL": "http://oss.cn-north-1.jcloudcs.com/jddbsqlserver/6d4ffa92-f497-4373-add9-c7493da70054/audit/RDSAudit_054F6E2E-01C1-41FD-ABC8-91EE34CD2AF9_0_132228536211390000.sqlaudit?Expires=1578467095&AccessKey=E3136A5602E671CD26D5A7B56A05F965&Signature=P7ku/1vTgHeYzdppg/WXt2+gRP8="
    }
}
```
