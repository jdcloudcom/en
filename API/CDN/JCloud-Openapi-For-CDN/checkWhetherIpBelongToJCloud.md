# checkWhetherIpBelongToJCloud


## Description
Get all upper node ips

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/ip:whetherBelongToJCloud


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ips**|String[]|False| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**ipList**|[CheckWhetherIpBelongToJCloudItem[]](#checkwhetheripbelongtojclouditem)| |
### <div id="CheckWhetherIpBelongToJCloudItem">CheckWhetherIpBelongToJCloudItem</div>
|Name|Type|Description|
|---|---|---|
|**ip**|String| |
|**belongToJCloud**|Boolean| |
|**country**|String| |
|**province**|String| |
|**city**|String| |
|**isp**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
