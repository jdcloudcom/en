# describeDevice


## Description
Search device details

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/devices/{deviceId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|
|**deviceId**|String|True| |Device Instance ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describedevice#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**device**|[Device](describedevice#device)| |
### <div id="device">Device</div>
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
|**sysIp**|String|System IP|
|**manageIp**|String|Management IP|
|**deviceType**|String|Device type  server: server  network: network device  storage: storage device  other: other device|
|**assetBelong**|String|Asset ownership  own: own  lease: lease|
|**assetStatus**|String|Asset status  launched: launched  opened: opened  canceling: canceling  operating: operating  modifying: modifying|
|**deviceOpenTime**|String|The subscription time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|
|**cpuCore**|String|CPU|
|**memory**|String|Memory|
|**disk**|String|Disk|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
