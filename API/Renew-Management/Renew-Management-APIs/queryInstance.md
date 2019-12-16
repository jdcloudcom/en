# queryInstance


## Description
Provide renewable instance information query.

## Request Method
POST

## Request Address
https://renewal.jdcloud-api.com/v2/regions/{regionId}/instances

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**queryInstanceParam**|QueryInstanceParam|True| | |

### QueryInstanceParam
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appCode**|String|True| |Business Line|
|**serviceCode**|String|True| |Product Line|
|**instanceName**|String|False| |Resource Name|
|**instanceId**|String|False| |Resource ID|
|**renewStatus**|String|True| |The resource renew status (AUTO - Enable automatic renewal resource, MANUAL - Disable automatic renewal resource, ALL - All resources) is ALL by default|
|**billingType**|String|False| |Resource Billing Type (CONFIG - Pay By Configuration, FLOW - Pay By Consumption, MONTHLY - Monthly Package), display resources of all billing types if no transmission is made|
|**expireType**|String|False| |The resource expiration type (EXPIRED - Expired, UNEXPIRED - Not expired, ONE - Expired within 1 day, THREE - Expired within 3 days, SEVEN - Expired within 7 day, ALL_TIME - All) is ALL by default|
|**ipAddress**|String|False| |Private IP Address Associated with Endpoint|
|**pageNumber**|Integer|False| |Current Page Number, 1 by default when not uploaded|
|**pageSize**|Integer|False| |Entry Counts Per Page, 10 by default when not uploaded|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**listQueries**|ListQuery[]|List Details|
|**totalCount**|Integer|Search Total Amount|
### ListQuery
|Name|Type|Description|
|---|---|---|
|**appCode**|String|Business Line|
|**serviceCode**|String|Product Line|
|**resourceId**|String|Resource ID|
|**resourceName**|String|Resource Name|
|**region**|String|Region|
|**billingType**|String|Resource Billing Type (CONFIG - Pay By Configuration, FLOW - Pay By Consumption, MONTHLY - Monthly Package)|
|**expireTime**|String|Resource Expiration Time|
|**lastTime**|Integer|Countdown|
|**autoRenewStatus**|String|Automatic Renewal Status (UNOPENED-Unopened, OPENED-Opened)|
|**autoRenewPeriod**|String|Automatic renewal cycle, unit: month|
|**associateResource**|String|Associate with relevant resource and enable automatic renewal or not (AUTO_RENEW: associate resources in the monthly package and enable automatic renewal, UN_AUTO_RENEW: associate resources in the monthly package and disable automatic renewal)|
|**extendField**|String|Expansion fields, including database types, special description of resources, and so on|
|**relationList**|RelationResource[]|Associate Resource List|
### RelationResource
|Name|Type|Description|
|---|---|---|
|**appCode**|String|Business Line|
|**serviceCode**|String|Product Line|
|**resourceId**|String|Resource ID|
|**resourceName**|String|Resource Name|
|**region**|String|Region|
|**billingType**|String|Resource Billing Type (CONFIG - Pay By Configuration, FLOW - Pay By Consumption, MONTHLY - Monthly Package)|
|**expireTime**|String|Resource Expiration Time|
|**lastTime**|Integer|Countdown|
|**autoRenewStatus**|String|Automatic Renewal Status (UNOPENED-Unopened, OPENED-Opened)|
|**extendField**|String|Expansion fields, including database types, special description of resources, and so on|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|
|**500**|Internal server error|
