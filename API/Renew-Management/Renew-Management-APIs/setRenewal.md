# setRenewal


## Description
Set automatic renewal services for one or more instances.

## Request Method
PUT

## Request Address
https://renewal.jdcloud-api.com/v2/regions/{regionId}/instances:autoRenewStatus

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**setRenewalParam**|SetRenewalParam|True| | |

### SetRenewalParam
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appCode**|String|True| |Business Line|
|**serviceCode**|String|True| |Product Line|
|**timeSpan**|Integer|False| |Renewal Duration (When timeUnit=MONTH, only 1, 2, 3, 4, 5, 6, 7, 8 and 9 can be uploaded, when timeUnit=YEAR, only 1, 2 and 3 can be uploaded)|
|**timeUnit**|String|False| |Time Unit (MONTH-Month, YEAR-Year)|
|**instanceIds**|String|True| |Resource ID lists, separate by English comma|
|**autoRenewStatus**|String|True| |Automatic renewal status (OPEN- Open automatic renewal, CLOSE- Close automatic renewal, MODIFY- Modify automatic renewal)|
|**allAutoPay**|String|False| |Associate with relevant resource and enable automatic renewal or not (UNBIND: No, BIND: Yes)|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**stringResult**|String|Entries of Setting Succeeded|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
|**500**|Internal server error|
