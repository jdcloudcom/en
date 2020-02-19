# describeUpgradableNodeVersions


## Description
Search upgradable node versions

## Request Method
GET

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/clusters/{clusterId}/upgradableNodeVersions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**clusterId**|String|True| |Cluster ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**nodeGroupIds**|String[]|False| |Node Group id|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeupgradablenodeversions#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**ndoeVersions**|[NodeVersion[]](describeupgradablenodeversions#nodeversion)| |
### <div id="nodeversion">NodeVersion</div>
|Name|Type|Description|
|---|---|---|
|**version**|String|Node Version Number|
|**imageOs**|String|Image Operating System|
|**versionStatus**|String|Version Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
