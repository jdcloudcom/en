# Live-Video


## Introduction
Related APIs of Live Video


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**addCustomLiveStreamRecordTemplate**|Add user customized live recording template<br>|
|**addCustomLiveStreamSnapshotTemplate**|Add live snapshot template|
|**addCustomLiveStreamTranscodeTemplate**|Add custom transcode template<br>- The system has preset the standard transcoding templates. If they cannot meet your requirements of transcoding, you can add your customized transcoding templates through the APIs<br>- System standard transcode template<br>    ld (h.264/640*360/15f)<br>    sd (h.264/960*540/25f)<br>    hd (h.264/1280*720/25f)<br>    shd (h.264/1920*1080/30f)<br>    ld-265 (h.265/640*360/15f)<br>    sd-265 (h.265/960*540/25f)<br>    hd-265 (h.265/1280*720/25f)<br>    shd-265 (h.265/1920*1080/30f)<br>|
|**addCustomLiveStreamWatermarkTemplate**|Add user customized watermark template<br>|
|**addLiveApp**|Add live application name<br>- Application name needs to be created in advance only when it requires to associate functional template at application (app) level ahead of time<br>- New application name is automatically created when pushing streaming<br>|
|**addLiveDomain**|Add live domain<br>- Before creating a live domain, live broadcast service must be enabled first<br>- Live domain must have been completed ICP filing<br>|
|**addLiveRecordTask**|Add recording point print task<br>- You can call this API to accurately extract the part you need in the recorded file<br>|
|**addLiveRestartDomain**|Add Restart Domain<br>|
|**addLiveStreamAppRecord**|Add live recording configuration at application level<br>- Add live recording template configuration at application level<br>|
|**addLiveStreamAppSnapshot**|Add application snapshot configuration<br>- Add snapshot template configuration at application level<br>|
|**addLiveStreamAppTranscode**|Add application transcode configuration<br>- Add transcode template configuration at application level<br>|
|**addLiveStreamAppWatermark**|Add watermark configuration at application level<br>|
|**addLiveStreamDomainRecord**|Add live recording configuration at domain level<br>- Add live recording template configuration at domain level<br>|
|**addLiveStreamDomainSnapshot**|Add domain snapshot configuration<br>- Add snapshot template configuration at domain level<br>|
|**addLiveStreamDomainTranscode**|Add transcode configuration at domain level<br>- Add transcode template configuration at domain level<br>|
|**addLiveStreamDomainWatermark**|Add domain watermark configuration<br>|
|**addLiveStreamRecord**|Add streaming record template configuration<br>|
|**checkDomainIcp**|Verify whether the domain has completed ICP filing|
|**closeLiveRestart**|Close Restart|
|**closeLiveTimeshift**|Close Timeshift|
|**deleteCustomLiveStreamRecordTemplate**|Delete user customized record template<br>- Before deleting the user customized record template, the record settings of the template at each domain name, application and streaming level must be deleted first<br>|
|**deleteCustomLiveStreamSnapshotTemplate**|Delete user customized live snapshot template<br>- Before deleting snapshot template, please delete the snapshot configuration associated with the template first, otherwise on-line business will be affected<br>|
|**deleteCustomLiveStreamTranscodeTemplate**|Delete user customized transcode template<br>- Before deleting the user customized transcode template, the transcode settings of the template at each domain name, application and streaming level must be deleted first<br>|
|**deleteCustomLiveStreamWatermarkTemplate**|Delete user customized watermark template<br>- Before deleting the user customized watermark template, the watermark settings of the template at each domain name, application and streaming level must be deleted first<br>|
|**deleteLiveDomain**|Delete live domain name<br>- Please operate with caution (It is suggested to restore domain A record by the domain resolution service provider prior to domain deletion) to avoid such domain being inaccessible after deletion. <br>  All relevant records of the live domain will be deleted after successful deleteLiveDomain call. If it only needs to suspend the use of the live domain, it is recommended to use the stopLiveDomain APIs<br>|
|**deleteLiveRecordFiles**|Delete recording file<br>|
|**deleteLiveSnapshots**|Delete snapshot<br>|
|**deleteLiveStreamAppRecord**|Delete recording template configuration at application level<br>- Delete recording template configuration at application level, taking effect after pushing streaming again<br>|
|**deleteLiveStreamAppSnapshot**|Delete APP snapshot configuration|
|**deleteLiveStreamAppTranscode**|Delete transcode template configuration at application level<br>- Delete transcode template configuration at application level, taking effect after pushing streaming again<br>|
|**deleteLiveStreamAppWatermark**|Delete watermark template configuration at application level<br>- Delete watermark template configuration at application level, taking effect after pushing streaming again<br>|
|**deleteLiveStreamDomainRecord**|Delete recording template configuration at domain level<br>- Delete recording template configuration at domain level, taking effect after pushing streaming again<br>|
|**deleteLiveStreamDomainSnapshot**|Delete domain snapshot configuration<br>- Delete snapshot template configuration at domain level, taking effect after pushing streaming again<br>|
|**deleteLiveStreamDomainTranscode**|Delete transcode template configuration at domain level<br>- Delete transcode template configuration at domain level, taking effect after pushing streaming again<br>|
|**deleteLiveStreamDomainWatermark**|Delete watermark template configuration at domain level<br>- Delete watermark template configuration at domain level, taking effect after pushing streaming again<br>|
|**deleteLiveStreamNotifyConfig**|Delete callback address of live streaming status|
|**deleteLiveStreamRecord**|Delete record template configuration at streaming level<br>- Delete record template configuration at streaming level, taking effect after pushing streaming again<br>|
|**deleteLiveStreamRecordNotifyConfig**|Delete record callback configuration<br>|
|**deleteLiveStreamSnapshot**|Delete snapshot template configuration at streaming level<br>- Delete snapshot template configuration at streaming level, taking effect after pushing streaming again<br>|
|**deleteLiveStreamSnapshotNotifyConfig**|Delete snapshot callback configuration<br>|
|**deleteLiveStreamTranscode**|Delete transcode template configuration at streaming level<br>- Delete transcode template configuration at streaming level, taking effect after pushing streaming again<br>|
|**deleteLiveStreamWatermark**|Delete watermark template configuration at streaming level<br>- Delete watermark template configuration at streaming level, taking effect after pushing streaming again<br>|
|**describeCustomLiveStreamRecordConfig**|Search live record configuration<br>- Record template configuration is added according to 3-level configurations of domain, application and stream, taking effect with minimal granularity configuration<br>- The granularities of domain, application and stream are in descending order, i.e., domain>application>stream<br>- The search is to search the domain, application, and record template configuration that the stream is finally effective; instead of the template associating status of each level<br>|
|**describeCustomLiveStreamRecordTemplates**|Search user customized live recording template list<br>|
|**describeCustomLiveStreamSnapshotConfig**|Search live snapshot configuration<br>- Snapshot template configuration is added according to 3-level configurations of domain, application and stream, taking effect with minimal granularity configuration<br>- The granularities of domain, application and stream are in descending order, i.e., domain>application>stream<br>- The search is to search the domain, application, and snapshot template configuration that the stream is finally effective; instead of the template associating status of each level<br>|
|**describeCustomLiveStreamSnapshotTemplates**|Search live snapshot template list|
|**describeCustomLiveStreamTranscodeTemplate**|Search user customized transcode template details<br>- Search user customized transcode template details<br>- System standard transcode templates<br>      ld (h.264/640*360/15f)<br>      sd (h.264/960*540/24f)<br>      hd (h.264/1280*720/25f)<br>      shd (h.264/1920*1080/30f)<br>      ld-265 (h.265/640*360/15f)<br>      sd-265 (h.265/960*540/24f)<br>      hd-265 (h.265/1280*720/25f)<br>      shd-265 (h.265/1920*1080/30f)<br>|
|**describeCustomLiveStreamTranscodeTemplates**|Search user customized transcode template list<br>|
|**describeCustomLiveStreamWatermarkConfig**|Search live watermark configuration<br>- Watermark template configuration is added according to 3-level configurations of domain, application and stream, taking effect with minimal granularity configuration<br>- The granularities of domain, application and stream are in descending order, i.e., domain>application>stream<br>- The search is to search the domain, application, and watermark template configuration that the stream is finally effective; instead of the template associating status of each level<br>|
|**describeCustomLiveStreamWatermarkTemplates**|Search user customized watermark template list<br>|
|**describeDomainOnlineStream**|Search Online Stream List|
|**describeDomainsLog**|Log Download|
|**describeLiveApp**|Search APP list under the domain|
|**describeLiveDomainDetail**|Search the relevant information of specified domain|
|**describeLiveDomainRecordConfig**|Search record template configuration under the domain<br>|
|**describeLiveDomainSnapshotConfig**|Search snapshot template configuration under the domain<br>|
|**describeLiveDomainTranscodeConfig**|Search transcode template configuration under the domain<br>|
|**describeLiveDomainWatermarkConfig**|Search watermark template configuration under the domain<br>|
|**describeLiveDomains**|Query Domain List|
|**describeLiveFileStorageData**|Search Bucket Data|
|**describeLivePlayAuthKey**|Search Play Authentication KEY|
|**describeLivePornData**|Search Live Porn Identification Number Data|
|**describeLivePublishStreamNum**|Search Live Pushing Streaming Number|
|**describeLiveRecordData**|Search Live Recording Duration Data|
|**describeLiveRecordFileUrl**|Acquire Recording File Address<br>|
|**describeLiveRecordFiles**|Search Recording File List<br>|
|**describeLiveRestartConfigs**|Search Restart Configuration|
|**describeLiveServiceStatus**|Search Service Enabling Status|
|**describeLiveSnapshotData**|Search Live Snapshot Number Data|
|**describeLiveSnapshotUrl**|Acquire Snapshot Address<br>|
|**describeLiveSnapshots**|Search Snapshot List<br>|
|**describeLiveStatisticGroupByArea**|Search Region Group Statistics Data|
|**describeLiveStatisticGroupByAreaIsp**|Search Region/Operator Group Statistics Data|
|**describeLiveStatisticGroupByStream**|Search Stream Group Statistics Data|
|**describeLiveStreamBandwidthData**|Search bandwidth data<br> Search bandwidth data within a certain period (average bandwidth)<br>- During the search on data with the granularity of 1 minute, the time span cannot be more than 7 days, and the time span cannot be more than 30 days for any other granularity<br>|
|**describeLiveStreamHistoryUserNum**|Search Live Streaming Historic Online Number|
|**describeLiveStreamInfo**|Search Live Real-time Streaming Information<br>|
|**describeLiveStreamList**|Search Live Streaming Information|
|**describeLiveStreamNotifyConfig**|Search callback address of live streaming status|
|**describeLiveStreamOnlineList**|Search Live Streaming Information|
|**describeLiveStreamPlayerRankingData**|Search the ranking of live streaming players|
|**describeLiveStreamPublishBandwidthData**|Search pushing streaming bandwidth<br>- Search pushing streaming uplink bandwidth data within a certain period<br>- During the search on data with the granularity of 1 minute, the time span cannot be more than 7 days, and the time span cannot be more than 30 days for any other granularity<br>|
|**describeLiveStreamPublishList**|View Pushing Streaming History Record|
|**describeLiveStreamPublishTrafficData**|Search pushing streaming uplink traffic data<br>- Search the traffic data within a certain period. <br>- During the search on data with the granularity of 1 minute, the time span cannot be more than 7 days, and the time span cannot be more than 30 days for any other granularity<br>|
|**describeLiveStreamRecordNotifyConfig**|Search record callback configuration<br>|
|**describeLiveStreamSnapshotNotifyConfig**|Search snapshot callback configuration<br>|
|**describeLiveStreamTrafficData**|Search traffic data<br>- Search the traffic data within a certain period. <br>- During the search on data with the granularity of 1 minute, the time span cannot be more than 7 days, and the time span cannot be more than 30 days for any other granularity<br>|
|**describeLiveStreamTranscodeConfig**|Search transcode template configuration<br>- Transcoding template configuration is added according to 3-level configurations of domain, application and stream, taking effect with minimal granularity configuration<br>- The granularities of domain, application and stream are in descending order, i.e., domain>application>stream<br>- The search is to search the domain, application, and transcoding template configuration that the stream is finally effective; instead of the template associating status of each level<br>|
|**describeLiveTimeshiftConfigs**|Search timeshift configuration|
|**describeLiveTranscodeStreamBandwidth**|Search transcode streaming play bandwidth<br>- During the search on data with the granularity of 1 minute, the time span cannot be more than 7 days, and the time span cannot be more than 30 days for any other granularity<br>|
|**describeLiveTranscodeStreamList**|Search Transcode Flow Information|
|**describeLiveTranscodeStreamNum**|Search Transcode Flow Count|
|**describeLiveTranscodeStreamPlayerUserNum**|Search Transcode Flow Viewer Number|
|**describeLiveTranscodingDurationData**|Search Transcode Duration Data|
|**describePlayAuthConfig**|Search Play Authentication Configuration|
|**describePublishAuthConfig**|Search Pushing Streaming Authentication Configuration|
|**describePublishStreamInfoData**|Search Pushing Streaming Monitoring Data|
|**describeRecordBinding**|Search Record Template Association<br>|
|**describeSnapshotBinding**|Search Snapshot Template Association<br>|
|**describeSystemLiveStreamTranscodeTemplates**|Search System Default Transcode Template List<br>|
|**describeTranscodeBinding**|Search Transcode Template Association<br>|
|**describeUrlRanking**|Search Play URL Ranking|
|**describeWatermarkBinding**|Search Watermark Template Association<br>|
|**exportLiveSnapshotData**|Export Live Snapshot Number Data|
|**exportLiveStreamBandwidthData**|Export bandwidth data<br>- Search bandwidth data within a certain period (average bandwidth)<br>- During the search on data with the granularity of 1 minute, the time span cannot be more than 7 days, and the time span cannot be more than 30 days for any other granularity<br>|
|**exportLiveStreamTrafficData**|Export traffic data<br>- Search the traffic data within a certain period. <br>- During the search on data with the granularity of 1 minute, the time span cannot be more than 7 days, and the time span cannot be more than 30 days for any other granularity<br>|
|**exportLiveTranscodingDurationData**|Export Transcode Duration Data|
|**exportPublishStreamInfoData**|Export Pushing Streaming Monitoring Data|
|**forbidLiveStream**|Ban live streaming pushing|
|**interruptLiveStream**|Interrupt live streaming pushing<br>- Pushing streaming can continue after 1 second of operation interruption<br>|
|**openLiveRestart**|Enable restart<br>1. Live review file format only supports m3u8.<br> 2. The user can configure review duration, which supports 7 days to the maximum extent, namely, when the user requests for reviewing contents, living review contents for the latest 7 days can be requested to the maximum extent. <br>3. Domain Name Format: http://{restartDomain}/{appName}/{streamName}/index.m3u8?starttime=1527756680&endtime=1527760280 (unix time stamp)<br>4. For starttime-endtime, the maximum of 24 hours is supported and cross-day is acceptable<br>|
|**openLiveService**|Enable Live Service|
|**openLiveTimeshift**|Enable timeshift<br>A maximum of 4-hour HLS timeshift is supported by live, which can be implemented by increasing timeshift parameters after the domain is played in respect of the use method. The parameter type supports the timeshift with two methods, namely specifying the start time and time offset. After live timeshift is enabled, the repushing streaming takes effect. And it can be played by accessing by using the play domain with corresponding parameters<br>- Domain Name Format: <br>1. http://{playDomain}/{appName}/{streamName}/index.m3u8?timeshift=400 (second, refers to offset when time is moved forward from current time)<br>2. http://{playDomain}/{appName}/{streamName}/index.m3u8?starttime=1529223702 (unix time stamp)<br>|
|**resumeLiveStream**|Recover live streaming pushing|
|**setLivePlayAuthKey**|Set Play Authentication KEY|
|**setLiveStreamNotifyConfig**|Set callback address of live streaming status|
|**setLiveStreamRecordNotifyConfig**|Set Live Recording Callback Notification<br>|
|**setLiveStreamSnapshotNotifyConfig**|Set Live Snapshot Callback Notification Address<br>|
|**setPlayAuthConfig**|Set Play Authentication KEY|
|**setPlayAuthIPConfig**|Set Play Authentication IP Blacklist|
|**setPlayAuthRefererConfig**|Set Play Authentication referer|
|**setPublishAuthConfig**|Set Pushing Streaming Authentication KEY|
|**setPublishAuthIPConfig**|Set Pushing Streaming Authentication IP Blacklist|
|**startLiveApp**|Enable Application<br>- Enable Application in Disabled Status<br>|
|**startLiveDomain**|Enable Domain Name<br>- Enable live domain pair (pushing streaming domain, playing domain) in disabled status change DomainStatus to online<br>|
|**stopLiveApp**|Disable Application in Running Status<br>- Once the application is disabled, pushing streaming with this application name is not allowed anymore<br>|
|**stopLiveDomain**|Disable Domain Name<br>- Disable live domain pair (pushing streaming domain, playing domain) change DomainStatus to offline<br>- After the live domain is disabled, the live domain information will remain, but the user will no longer be able to use the pushing streaming domain to push or use the playing domain to play<br>|
|**updateCustomLiveStreamRecordTemplate**|Modify user customized live recording template<br>|
|**updateCustomLiveStreamSnapshotTemplate**|Modify live snapshot template|
|**updateCustomLiveStreamTranscodeTemplate**|Modify customized transcode template<br>|
|**updateCustomLiveStreamWatermarkTemplate**|Modify user customized watermark template<br>|
