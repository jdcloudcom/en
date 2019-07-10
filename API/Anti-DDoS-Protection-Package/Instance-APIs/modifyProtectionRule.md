# modifyProtectionRule


## Description
Modify protection package instance or IP protection rule

## Request Method
POST

## Request Address
https://antipro.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:modifyProtectionRule

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Code|
|**instanceId**|String|True| |Protection package instance Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**protectionRuleSpec**|ProtectionRuleSpec|True| |Modify protection rule request parameter|

### ProtectionRuleSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ip**|String|False| |Protected IP, modify protection package instance protection rule if it is the default|
|**type**|Integer|False| |Protection rule type, required while modifying ip protection rules, 0: Set protection package rule for use of ip, 1: set customized rule for use of IP|
|**cleanThresholdBps**|Long|False| |Cleaning trigger value bps, required while modifying instance protection rule or customizing IP protection rule|
|**cleanThresholdPps**|Long|False| |Cleaning trigger value pps, required while modifying instance protection rule or customizing IP protection rule|
|**spoofIpEnable**|Integer|False| |IP address spoofing, 0: Disable, 1: Enable, be sure to transmit it while modifying instance protection rule or customizing IP protection rule|
|**srcNewConnLimitEnable**|Integer|False| |Source creation connection speed limit, 0: Disable, 1: Enable, required while modifying instance protection rule or customizing IP protection rule|
|**srcNewConnLimitValue**|Long|False| |Source creation connection speed limit, required while modifying instance protection rule or customizing IP protection rule|
|**dstNewConnLimitEnable**|Integer|False| |Target creation connection, 0: Disable, 1: Enable, required while modifying instance protection rule or customizing IP protection rule|
|**dstNewConnLimitValue**|Long|False| |Target creation connection speed limit, required while modifying instance protection rule or customizing IP protection rule|
|**datagramRangeMin**|Long|False| |Minimum packet length, value range [1, datagramRangeMax)|
|**datagramRangeMax**|Long|False| |Maximum packet length, value range (datagramRangeMin, 1518]|
|**geoBlackList**|String[]|False| |geo interception region code list. Search <a href="http://docs.jdcloud.com/anti-ddos-protection-package/api/describegeoareas">describeGeoAreas</a> API to get settable region code list|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Protection rule modification results, 0: Modification failed, 1: Modification succeeded|
|**message**|String|Please specify the reasons for modification failure|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
