# **Log Download**

**1. Console--Log Download Description**

Log in to [**CDN Console**](https://cdn-console.jdcloud.com/logmanage), select **Log Download**on the left menu bar, select the time and domain name of the log to be obtained, and click **Download**, you can obtain the log download content.

![image.png](https://img1.jcloudcs.com/cms/233c0daa-5be2-4045-8203-47d1c7da692320180109182340.png)

**2. Log Content**

01/Dec/2017:04:13:10 +0800 117.71.34.139 - 0.175 - GET HTTP/1.1 https://www.jdcloud.com/index 200 242 1014 MISS Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; .NET CLR 1.1.4322) -

**3. Field Meaning**

| Time                           | 01/Dec/2017:04:13:10 +0800                                   |
| ------------------------------ | ------------------------------------------------------------ |
| Access IP                         | 117.71.34.139                                                |
| Agent IP                         | -                                                            |
| Response Time (Unit: s)             | 0.175                                                        |
| referer Information                    | -                                                            |
| method                         | GET                                                          |
| HTTP Protocol Identifier                   | HTTP/1.1                                                     |
| Access url                        | https://www.jdcloud.com/index                                |
| httpscode                      | 200                                                          |
| The size of byte number accessed this time (Unit: byte) | 242                                                          |
| Response Size (Unit: byte)           | 1014                                                         |
| cache Hit Status                  | MISS                                                         |
| UA Header                           | Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; .NET CLR 1.1.4322) |
| File Type                       | -                                                            |

**4. Log Description**

- File naming: Domain name_date_starting time

- Save time: Log files can be saved for up to 2 weeks

- Log latency: The log file has 1 hour latency; the log file 1 hour ago can be queried in the log management module.

- File interval: A list of logs displayed in hourly granularity, with a single file having 1 hour interval;

  A list of logs displayed in daily granularity, with a single file having 1 day interval (where the log of the day is less than 1 day, select the time period from the earliest started log of the day to the latest ended log).

- Query scope: Query by hour can only query the logs within the previous 3 days till the current time. For example, the current time is January 5 10:35:35, and query by hour can only query the logs from January 2 0:00 to January 5 10 o’clock (hour log can be queried after each XX:30);

  Query by day can query the logs within the previous 30 days till the current day.