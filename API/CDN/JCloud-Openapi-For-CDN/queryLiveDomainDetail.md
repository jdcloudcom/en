# queryLiveDomainDetail


## Description
Search live domain details

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**domainType**|String|Domain Type|
|**playDomain**|String|Playing Domain|
|**publishDomain**|String|Pushing Streaming Domain|
|**originDomain**|String|Back-to-origin Domain|
|**createdTime**|String|Creation Time|
|**cname**|String|cname|
|**siteType**|String|Site Type Pushing Streaming push, Pulling Streaming pull|
|**status**|String|Domain Status|
|**source**|BackSourceInfo|Back-to-origin Information|
|**sourceType**|String|Domain Back-to-origin Type|
|**backSourceType**|String|Back-to-origin Type Only Can Be rtmp Now|
|**videoType**|String|Video Format H.264|
|**audioType**|String|Audio Format AAC|
|**type**|String|Domain Type|
|**defaultSourceHost**|String|Default back-to-origin host|
|**archiveNo**|String|ICP Filing Number|
|**rtmpDomain**|String|rtmpDomain|
|**rtmpCname**|String|rtmpCname|
|**hdlDomain**|String|hdlDomain|
|**hdlCname**|String|hdlCname|
|**hlsDomain**|String|hlsDomain|
|**hlsCname**|String|hlsCname|
|**forwardCustomVhost**|String|forwardCustomVhost|
|**flvUrls**|String[]|flvUrls|
|**hlsUrls**|String[]|hlsUrls|
|**rtmpUrls**|String[]|rtmpUrls|
|**protocolConverts**|ProtocolConvert[]|Forwarding Protocol|
|**certificate**|String|https Certificate|
|**rsaKey**|String|https Private Key|
|**accesskeyType**|Integer|url Authentication Switch|
|**accesskeyKey**|String|url Authentication key|
|**playAuthLifeTime**|Integer|playAuthLifeTime|
|**authLifeTime**|Integer|authLifeTime|
|**forwardAccessKeyType**|Integer|Forward Pushing Authentication Switch|
|**forwardPrivateKey**|String|Forward Pushing Authentication key|
|**originAccessKeyType**|Integer|Back-to-origin Authentication Switch|
|**originPrivateKey**|String|Back-to-origin Authentication key|
|**allowApps**|String[]|app List|
|**ips**|String[]|ip Blacklist List|
|**blackIpsEnable**|String|Enable ip Blacklist or Not|
|**externId**|String|Externally Associated id|
|**ignoreQueryString**|String|ignoreQueryString|
|**referType**|String|referType|
|**referList**|String[]|referList|
|**allowNoReferHeader**|String|Allow No refer|
|**allowNullReferHeader**|String|Allow Null refer|
|**pushWhiteIps**|Arrary|Pushing Streaming IP White List|
|**publishNormalTimeout**|String|Pushing Streaming Interruption Time-out Period (Unit Second)|
|**notifyCustomUrl**|String|Pushing Streaming Notification Url|
|**notifyCustomAuthKey**|String|Pushing Streaming Notification key|
|**certFrom**|String|There are two types of certificate sources: default, ssl|
|**sslCertId**|String|ssl Certificate id|
|**certName**|String|Certificate Name|
|**certType**|String|Certificate Type|
|**sslCertStartTime**|String| |
|**sslCertEndTime**|String| |
### ProtocolConvert
|Name|Type|Description|
|---|---|---|
|**sourceProtocol**|String|Currently, Source Protocol only can be rtmp|
|**targetProtocol**|String|Target Protocol|
### BackSourceInfo
|Name|Type|Description|
|---|---|---|
|**ips**|IpSourceInfo[]| |
|**domain**|DomainSourceInfo[]| |
|**ossSource**|String| |
### DomainSourceInfo
|Name|Type|Description|
|---|---|---|
|**priority**|Integer| |
|**sourceHost**|String| |
|**domain**|String| |
### IpSourceInfo
|Name|Type|Description|
|---|---|---|
|**master**|Integer| |
|**ip**|String| |
|**ratio**|Double| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
