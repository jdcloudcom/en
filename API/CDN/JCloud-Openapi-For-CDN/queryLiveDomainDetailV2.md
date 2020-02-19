# queryLiveDomainDetailV2


## Description
Search live streaming domain details v2

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomains/{domain}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**id**|Integer|Domain name id|
|**domain**|String|Domain|
|**domainType**|String|Domain type, (publish refers to pushing streaming domain; play means play domain)|
|**playDomainId**|Integer|Playing Domain Id|
|**publishDomain**|String|Pushing Streaming Domain|
|**createTime**|String|Creation Time|
|**cname**|String|cname corresponding to domain|
|**siteType**|String|Domain mode: 1, pushing streaming: push, 2, pulling streaming: pull, 3, mixing streaming: mix|
|**playProtocol**|String[]|Domain Protocol (rtmp, hls, hdl)|
|**status**|String|Domain Status|
|**source**|[SnowLeopardBackSourceInfo](#snowleopardbacksourceinfo)|Back-to-origin Information|
|**sourceType**|String|Domain Back-to-origin Type|
|**backSourceType**|String|Back-to-origin protocol: rtmp, http-flv, https-flv, http-hls, https-hls|
|**videoType**|String|Video Format H.264|
|**audioType**|String|Audio Format AAC|
|**type**|String|Domain Type (live)|
|**defaultSourceHost**|String|Default back-to-origin host|
|**archiveNo**|String|ICP Filing No.|
|**forwardCustomVhost**|String|Forward Pushing Address|
|**flvUrls**|String[]|flv Format Path|
|**hlsUrls**|String[]|hls Format Path|
|**rtmpUrls**|String[]|rtmp Format Path|
|**protocolConverts**|[ProtocolConvert[]](#protocolconvert)|Protocol Conversion Information|
|**certificate**|String|https Certificate|
|**rsaKey**|String|https Private Key|
|**accesskeyType**|Integer|url Authentication Switch (1: on; 2: off)|
|**accesskeyKey**|String|url Authentication key|
|**playAuthLifeTime**|Integer|playAuthLifeTime, 0 by default|
|**authLifeTime**|Integer|authLifeTime, 0 by default|
|**forwardAccessKeyType**|Integer|Forward Pushing Authentication Switch (1: on; 0: off)|
|**forwardPrivateKey**|String|Forward Pushing Authentication key|
|**originAccessKeyType**|Integer|Back-to-origin Authentication Switch (1: on; 0: off)|
|**originPrivateKey**|String|Back-to-origin Authentication key|
|**allowApps**|String[]|Allowable app List|
|**ips**|String[]|ip Black List List|
|**blackIpsEnable**|String|Enable ip black list or not (on; off)|
|**ignoreQueryString**|String|Ignore parameters or not (on, off)|
|**referType**|String|refer type|
|**referList**|String[]|refer list|
|**allowNoReferHeader**|String|It is allowed that refer contains irregular contents|
|**allowNullReferHeader**|String|Access to url resources without the referer header is allowed|
|**pushWhiteIps**|Arrary|Pushing Streaming IP White List|
|**publishNormalTimeout**|Integer|Pushing Streaming Interruption Time-out Period (Unit Second)|
|**notifyCustomUrl**|String|Pushing Streaming Notification Url|
|**notifyCustomAuthKey**|String|Pushing Streaming Notification key|
|**certFrom**|String|There are two types of certificate sources: default, ssl|
|**sslCertId**|String|ssl Certificate id|
|**certName**|String|Certificate Name|
|**certType**|String|Certificate Type|
|**sslCertStartTime**|String|Start Time|
|**sslCertEndTime**|String|End Time|
|**digest**|String|Abstract information of private key file calculated with sha256 algorithm|
|**accelerateRegion**|String|Acceleration Region|
### <div id="ProtocolConvert">ProtocolConvert</div>
|Name|Type|Description|
|---|---|---|
|**sourceProtocol**|String|Currently, Source Protocol only can be rtmp|
|**targetProtocol**|String|Target Protocol|
### <div id="SnowLeopardBackSourceInfo">SnowLeopardBackSourceInfo</div>
|Name|Type|Description|
|---|---|---|
|**ips**|[SnowLeopardIpSourceInfo[]](#snowleopardipsourceinfo)| |
|**domain**|[SnowLeopardDomainSourceInfo[]](#snowleoparddomainsourceinfo)| |
|**ossSource**|String| |
### <div id="SnowLeopardDomainSourceInfo">SnowLeopardDomainSourceInfo</div>
|Name|Type|Description|
|---|---|---|
|**priority**|Integer|Priority Level (1-10)|
|**sourceHost**|String|Back-to-origin host|
|**domain**|String|Back-to-origin Domain|
### <div id="SnowLeopardIpSourceInfo">SnowLeopardIpSourceInfo</div>
|Name|Type|Description|
|---|---|---|
|**master**|Integer|1: Host; 2: Backup|
|**ip**|String|Back-to-origin IP|
|**ratio**|Double|Proportion|
|**isp**|String|Operator|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
