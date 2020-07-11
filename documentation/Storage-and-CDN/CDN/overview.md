# JDCLOUD CDN Operation And Query API


## Introduction
API related to CDN instances


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**batchCreate**|POST|Create VOD acceleration domain|
|**batchCreateLiveDomain**|POST|Create live domain|
|**batchDeleteDomainGroup**|POST|Delete domain groups in batches|
|**createCacheRule**|POST|Add cache rules|
|**createDomain**|POST|Create VOD acceleration domain|
|**createDomainGroup**|POST|Create domain groups|
|**createLiveDomainPrefecthTask**|POST|Create live prewarm task|
|**createRefreshTask**|POST|Create refresh and prewarm task|
|**createRefreshTaskForCallback**|POST|Create refresh and prewarm callback task|
|**createRefreshTaskForCallbackV2**|POST|Create refresh and prewarm callback task|
|**deleteCacheRule**|DELETE|Delete cache rules|
|**deleteDomain**|DELETE|Delete accelerated domain|
|**deleteForbiddenStream**|POST|Delete forbidden stream|
|**deleteHttpHeader**|PUT|Delete httpHeader|
|**getAllUpperNodeIpList**|GET|Get all upper node ips|
|**getDomainDetail**|GET|Search details of accelerated domain|
|**getDomainList**|GET|Search accelerated domain APIs|
|**getDomainListByFilter**|POST|Search accelerated domain APIs by tag|
|**getSslCertDetail**|GET|View certificate details|
|**getSslCertList**|GET|View certificate list|
|**operateIpBlackList**|PUT|Set ip blacklist status|
|**operateLiveDomainIpBlackList**|POST|Enable or disable ip blacklist|
|**operateShareCache**|POST|Extensive Domain Cache Sharing|
|**previewCertificate**|POST|Preview certificate|
|**queryAccesskeyConfig**|GET|Search url authentication|
|**queryAreaIspList**|GET|Search region operator list|
|**queryDefaultHttpHeaderKey**|GET|Search default http header parameter list|
|**queryDomainConfig**|GET|Search domain configuration information|
|**queryDomainGroupDetail**|GET|Search details of domain groups|
|**queryDomainGroupList**|GET|Search domain group APIs|
|**queryDomainLog**|GET|Search log|
|**queryDomainsLog**|POST|Batch search domain log|
|**queryDomainsNotInGroup**|GET|Search un-grouped domain|
|**queryFollowRedirect**|GET|Search back-to-origin 302 redirect information|
|**queryFollowSourceProtocol**|GET|Search protocol following back-to-origin|
|**queryHttpHeader**|GET|Search http header|
|**queryIpBlackList**|GET|Search ip blacklist|
|**queryLiveDomainApps**|GET|Search live domain app List|
|**queryLiveDomainDetail**|GET|Search live domain details|
|**queryLivePrefetchTask**|POST|Search live prewarm Task|
|**queryLiveStatisticsAreaDataGroupBy**|POST|Search and count data by regions and operators|
|**queryLiveStatisticsData**|POST|Search statistical data|
|**queryLiveTrafficGroupSum**|POST|Search and count data and summarize as well as sum the same|
|**queryMixStatisticsData**|POST|Search statistical data|
|**queryMixStatisticsWithAreaData**|POST|Search and count data by regions and operators|
|**queryMixTrafficGroupSum**|POST|Search and count data and summarize as well as sum the same|
|**queryMonitor**|GET|Search monitoring information of origin server|
|**queryOnlineBillingType**|GET|Set on-line billing method|
|**queryOssBuckets**|GET|Search oss storage domain|
|**queryPushDomainORAppOrStream**|GET|Search user pushing streaming domain app name/stream name|
|**queryRefreshTask**|GET|Search refresh and prewarm task|
|**queryRefreshTaskById**|GET|Search refresh and prewarm task according to taskId|
|**queryRefreshTaskByIds**|POST|Search refresh and prewarm task according to taskIds|
|**queryStatisticsData**|POST|Search statistical data|
|**queryStatisticsDataGroupByArea**|POST|Search and count data by regions and operators|
|**queryStatisticsDataGroupSum**|POST|Search and count data and summarize as well as sum the same|
|**queryStatisticsTopIp**|POST|Query TOP IP|
|**queryStatisticsTopUrl**|POST|Search TOP Url|
|**queryUserAgent**|GET|Set userAgent information|
|**setAccesskeyConfig**|POST|Set url authentication|
|**setFollowRedirect**|POST|Set back-to-origin 302 redirect|
|**setFollowSourceProtocol**|POST|Set protocol following back-to-origin|
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
|**setOnlineBillingType**|POST|Set on-line billing method|
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
|**setExtraCacheTime**|POST|Set Status Code Cache|
|**updateDomainGroup**|POST|Update domain group|
|**queryDailyRefreshTaskCount**|GET|Query Refresh and Prewarm Task Quota|
|**queryCdnUserQuota**|GET|Query User Refresh and Prewarm Block Quota|
|**uploadCert**|POST|Upload certificate|
|**setAuthConfig**|POST|dash Authentication Parameter Setting|
|**setSourceAuthConfig**|POST|Back-to-origin Authentication Parameter Setting|
