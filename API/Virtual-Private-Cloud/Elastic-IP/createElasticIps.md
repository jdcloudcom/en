# createElasticIps


## Description
Create One or More Elastic IPs

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/elasticIps/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**maxCount**|Integer|True| |Number of Purchased Elastic IPs; Value Range: [1,100]|
|**elasticIpAddress**|String|False| |Create by assigning Elastic IP address, when multiple Elastic IPs are applied for creation, it must be blank|
|**elasticIpSpec**|[ElasticIpSpec](createelasticips#elasticipspec)|True| |Elastic ip specification|
|**userTags**|[Tag[]](createelasticips#tag)|False| |User tag|

### <div id="tag">Tag</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**key**|String|True| |Tag Key|
|**value**|String|True| |Tag Value|
### <div id="elasticipspec">ElasticIpSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bandwidthMbps**|Integer|True| |Elastic IP speed limit (unit: Mbps), value range is [1-200]|
|**provider**|String|True| |IP service provider, values include bgp or no_bgp, cn-north-1: bgp; cn-south-1: bgp; cn-east-1: [bgp，no_bgp]; cn-east-2: bgp|
|**chargeSpec**|[ChargeSpec](createelasticips#chargespec)|False| |Billing Configuration|
### <div id="chargespec">ChargeSpec</div>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**chargeMode**|String|False|postpaid_by_duration|Billing model value is prepaid_by_duration, postpaid_by_usage or postpaid_by_duration; prepaid_by_duration means Pay-In-Advance, postpaid_by_usage means Pay-As-You-Go By Consumption and postpaid_by_duration means pay by configuration; is postpaid_by_duration by default. Please refer to the Help Documentation of specific product line to confirm the billing type supported by the production line|
|**chargeUnit**|String|False| |Billing unit of Pay-In-Advance, the Pay-In-Advance is compulsory, and valid only when chargeMode is prepaid_by_duration, and the value is month or year and month by default|
|**chargeDuration**|Integer|False| |Pay-In-Advance billing duration, the Pay-In-Advance is compulsory and valid only when the value of chargeMode is prepaid_by_duration. When chargeUnit is month, the value shall be 1~9; when chargeUnit is year, the value shall be 1, 2 or 3|
|**autoRenew**|Boolean|False| |True=: OPEN——Enable automatic renewal, False=CLOSE—— Disable automatic renewal, with default value of CLOSE|
|**buyScenario**|String|False| |The unified activity credential, JSON character string, for the product line needs the BASE64 code. Now, the format required before coding is {"activity":{"activityType": required field, "activityIdentifier": required field}}|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createelasticips#result)|Returned Results|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**elasticIpIds**|String[]|Elastic IP ID List|
|**requestId**|String|Request ID|

## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Invalid param 'xxx'|
|**401**|Unauthenticated user pin 'xxx'|
|**500**|Unknown server error|
|**503**|Service unavailable|
