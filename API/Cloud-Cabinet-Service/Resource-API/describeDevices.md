# describeDevices


## Description
Search device list

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/devices

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number, xxx by default1|
|**pageSize**|Integer|False|20|Paging size, default value is20|
|**cabinetId**|String|False| |Cabinet ID|
|**filters**|[Filter[]](describedevices#filter)|False| |deviceId - Device Instance ID, exact match, supporting multiple IDs<br>snNo - Device SN No., exact match, supporting multiple IDs<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describedevices#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**devices**|[DescribeDevice[]](describedevices#describedevice)|Device list|
|**pageNumber**|Integer|Page|
|**pageSize**|Integer|Paging Size|
|**totalCount**|Integer|Total Count|
### <div id="describedevice">DescribeDevice</div>
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|
|**deviceId**|String|Device Id|
|**snNo**|String|Device SN No.|
|**cabinetNo**|String|Cabinet Code|
|**rackUIndex**|String|Unit Location|
|**uNum**|Integer|U Number (U)|
|**brand**|String|Brand|
|**model**|String|Model|
|**deviceType**|String|Device type  server: server  network: network device  storage: storage device  other: other device|
|**assetBelong**|String|Asset ownership  own: own  lease: lease|
|**assetStatus**|String|Asset status  launched: launched  opened: opened  canceling: canceling  operating: operating  modifying: modifying|
|**deviceOpenTime**|String|The subscription time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
