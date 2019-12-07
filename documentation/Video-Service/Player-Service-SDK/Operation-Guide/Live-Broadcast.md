# Live Play

## **1. Get play address**

Login to Live Console to access "Domain Management" page, select a group of domains for viewing play addresses, then click **Management** at the right to access "Basic Information" page of the domain

![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/6%E7%9B%B4%E6%92%AD%E6%8E%A8%E6%B5%81.png)

In the "Playing Information" column, you can view and replicate the play address. The play address is spliced according to certain rules, in which the application name "APPName" and the stream name "StreamName" are defined by users at the time of pushing streaming. The application name (APPName) and the stream name (StreamName) currently can only contain English, numbers, "-", "_" and the length shall be limited between 1-50 characters. Customers need to splice the play address by rules according to the application name and the stream name customized at the time of pushing streaming that they want to watch

![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/8%E7%9B%B4%E6%92%AD%E6%92%AD%E6%94%BE.png)

## **2. Describe play address**

**Original Definition Address**

The play address is composed of domain (Domain), application name (APPName) and stream name (StreamName), in which the domain shall be the play domain added by the customer and the application name and the stream name shall be variables. The application name (APPName) and the stream name (StreamName) currently can only contain English, numbers, "-", "_" and the length shall be limited between 1-50 characters. They are customized by users at the time of pushing streaming. Customers shall splice the play address according to the needs if they want to watch a specific stream.

rtmp:// Play Domain/Application Name/Stream Name

http:// Play Domain/Application Name/Stream Name.flv

http:// Play Domain/Application Name/Stream Name.m3u8

**Examples**

If the play domain is ccc.ddd.com, the name of the application a customer wants to watch is
app1 and the stream name is 1, the play address of the corresponding rtmp, hls and hdl protocols shall be:

rtmp:// ccc.ddd.com/app1/1

http:// ccc.ddd.com/app2/1.flv

http:// ccc.ddd.com/app3/1.m3u8

**the transcode stream play addresses**

When the customer sets a transcode template and enables the transcode feature, different transcode templates with spliced id is related to the transcoded play address because the play address of the transcode stream consists of the original definition address and the transcode template id. The splice rules are as follows

rtmp:// Play Domain/Application Name/Stream Name_Template id

http:// Play Domain/Application Name/Stream Name_Template id.flv

http:// Play Domain/Application Name/Stream Name_Template id.m3u8

**Supported Transcode Template Parameter**

| **Template Name** | **Template ID** | **Resolution** | **Code Rate (kbps)** |
|--------------|-------------|------------|------------------|
| Fluent Definition         | lld         | 640\*360   | 200              |
| Standard Definition         | lsd         | 854\*480   | 400              |
| High Definition         | lhd         | 1280\*720  | 800              |

**Examples**

If the play domain is ccc.ddd.com, the transcode template is set as fluent and the corresponding template id is lld, then the play address of original definition shall be:

rtmp:// ccc.ddd.com/app1/1

http:// ccc.ddd.com/app1/1.flv

http:// ccc.ddd.com/app1/1.m3u8

The transcoded play address of the corresponding rtmp, hls and hdl protocols shall be:

rtmp:// ccc.ddd.com /app1/1_lld

http:// ccc.ddd.com /app1/1_lld.flv

http:// ccc.ddd.com /app1/1_lld.m3u8
