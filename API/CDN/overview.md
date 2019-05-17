# JDCLOUD CDN Operation And Query API


## Introduction
API related to CDN instances


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**batchCreate**|POST|Create VOD acceleration domain|
|**batchDeleteDomainGroup**|POST|Delete domain groups in batches|
|**createCacheRule**|POST|Add cache rules|
|**createDomain**|POST|Create VOD acceleration domain|
|**createDomainGroup**|POST|Create domain group|
|**createLiveDomain**|POST|Create live domain|
|**deleteCacheRule**|DELETE|Delete cache rules|
|**deleteDomain**|DELETE|Delete accelerated domain|
|**deleteHttpHeader**|DELETE|Delete httpHeader|
|**getDomainDetail**|GET|Search details of accelerated domain|
|**getDomainList**|GET|Search accelerated domain APIs|
|**operateIpBlackList**|PUT|Set ip blacklist status|
|**operateLiveDomainIpBlackList**|POST|Enable or disable ip blacklist|
|**operateShareCache**|POST|Extensive Domain Cache Sharing|
|**previewCertificate**|POST|Preview certificate|
|**queryAccesskeyConfig**|GET|Search url authentication|
|**queryDefaultHttpHeaderKey**|GET|Search default http header parameter list|
|**queryDomainConfig**|GET|Search domain configuration information|
|**queryDomainGroupDetail**|GET|Search details of domain groups|
|**queryDomainGroupList**|GET|Search domain group APIs|
|**queryDomainsNotInGroup**|GET|Search un-grouped domain|
|**queryHttpHeader**|GET|Search http header|
|**queryIpBlackList**|GET|Search ip blacklist|
|**queryLiveDomainDetail**|GET|Search live domain details|
|**queryMonitor**|GET|Search monitoring information of origin server|
|**queryOssBuckets**|GET|Search oss storage domain|
|**queryStatisticsData**|POST|Search statistical data|
|**queryStatisticsDataGroupByArea**|POST|Search and count data by regions and operators|
|**queryStatisticsDataGroupSum**|POST|Search and count data and summarize as well as sum the same|
|**queryStatisticsTopIp**|POST|Query TOP IP|
|**queryStatisticsTopUrl**|POST|Search TOP Url|
|**queryUserAgent**|GET|Set userAgent information|
|**setAccesskeyConfig**|POST|Set url authentication|
|**setHttpHeader**|POST|Add httpHeader|
|**setHttpType**|POST|Set http protocol|
|**setIgnoreQueryString**|POST|Set Ignoring Parameter|
|**setIpBlackList**|POST|Set ip blacklist|
|**setLiveDomainAccessKey**|POST|Set URL authentication|
|**setLiveDomainBackSource**|POST|Set back-to-origin information of live domain|
|**setLiveDomainBackSourceHost**|POST|Set back-to-origin host of live domain|
|**setLiveDomainIpBlackList**|POST|Set ip blacklist of live domain|
|**setLiveDomainRefer**|POST|Set domain refer Anti-Leech|
|**setMonitor**|POST|Set monitoring information of origin server|
|**setProtocolConvert**|POST|Set forwarding protocol|
|**setRange**|POST|Set range parameter|
|**setRefer**|POST|Set domain refer|
|**setSource**|POST|Source origin server information|
|**setUserAgentConfig**|POST|Set userAgent information|
|**setVideoDraft**|POST|Set video drag|
|**startDomain**|POST|Start accelerated domain|
|**stopDomain**|POST|Stop accelerated domain|
|**stopMonitor**|POST|Stop origin server monitoring|
|**updateCacheRule**|PUT|Modify cache rule|
|**updateDomainGroup**|POST|Update domain group|
