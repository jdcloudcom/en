# Description

A maximum of 4-hour HLS timeshift is supported by live, which can be implemented by increasing timeshift parameters after the domain is played in respect of the use method,
Designating start time and time offset can be done by parameter type for timeshift. After live timeshift is opened, it will take effect by accessing by using the play domain with corresponding parameters.

Domain Format:
1、http://{domainName}/live/{streamName}/index.m3u8?timeshift=400 (second, refers to offset when time is moved forward from current time)
2、http://{domainName}/live/{streamName}/index.m3u8?starttime=1529223702 (unix time stamp)

