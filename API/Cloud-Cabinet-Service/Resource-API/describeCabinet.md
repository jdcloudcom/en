# describeCabinet


## Description
Search cabinet details

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/cabinets/{cabinetId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|
|**cabinetId**|String|True| |Cabinet Instance ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describecabinet#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**cabinet**|[Cabinet](describecabinet#cabinet)| |
### <div id="cabinet">Cabinet</div>
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|
|**cabinetId**|String|Cabinet Id|
|**cabinetNo**|String|Cabinet Code|
|**roomNo**|String|Room Number|
|**cabinetSpace**|Integer|Cabinet space (U)|
|**cabinetPower**|Integer|Rated current (A)|
|**cabinetType**|String|Cabinet type  formal: Formal  cabinet reserved: Reserved cabinet|
|**cabinetOpenStatus**|String|Cabinet subscription status  disabled: disabled  enabling: enabling  enabled: enabled  disabling: disabling|
|**cabinetOpenTime**|String|The subscription time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|
|**expireTime**|String|The expiration time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|
|**reserveStartTime**|String|The reservation start time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|
|**reserveEndTime**|String|The reservation end time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|
|**deviceNum**|Integer|Equipment Number|
|**rackUOccupy**|Integer|Occupied unit count (U)|
|**rackUFree**|Integer|Idle unit count (U)|
|**billingType**|Integer|Billing Type 1: Pay By Configuration 2: Pay By Consumption 3: Monthly Package 4: One-off (at present, only Monthly Package is supported)|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
