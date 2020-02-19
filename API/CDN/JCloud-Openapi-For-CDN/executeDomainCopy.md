# executeDomainCopy


## Description
One-click Domain Replication and Configuration

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/executeDomainCopy


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |Source Domain|
|**copyDomains**|String|True| |Domain lists to be replicated shall be separated with "," in most cases and shall not be more than 20|
|**configKeys**|String|True| |The name of configuration item to be configured is uppercase and lowercase sensitive. Meanings of configuration items are as follows: originConfig: back-to-origin configuration information; refererConfig: referer Anti-Leech; urlAuthConfig: URL Authentication; userAgentConfig: UA IAM; ipBlackListConfig: IP black list; cacheConfig: cache configuration; schemeFollowOriConfig: protocol follow back-to-origin; oriFollowRedirectConfig: back-to-origin follow 302; filterParamsConfig: filtering parameter; rangeConfig: range back-to-origin; videoDraftConfig: video drafting; httpsConfig: Https configuration; httpHeaderConfig: HttpHeader setting; otherConfig: other configuration|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**errorResult**|[ErrorEntity[]](#errorentity)|Error Information of Domain with Configuration Error|
### <div id="ErrorEntity">ErrorEntity</div>
|Name|Type|Description|
|---|---|---|
|**domain**|String|Domain with Configuration Error|
|**msg**|String[]|Configuration Error Reason|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
