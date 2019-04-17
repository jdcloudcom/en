# Description

A maximum of 7-day HLS content restart is supported by live but live restart cannot use the same domain with live play, so it is necessary to create a restart domain when live restart function is used. After creating domain, you can enable or disable live restart function. For adding new live restart domain interface, see “addLiveRestartDomain”. After live restart is opened, it will take effect by accessing by using the restart domain with corresponding parameters.

Restart Domain Format: DomainName/{AppName}/{StreamName}.m3u8?startTime=2019-03-12T10:10:00&endTime=2019-03-13T10:10:00; startTime-endTime A maximum of 24 hours is supported and cross-day is acceptable.
