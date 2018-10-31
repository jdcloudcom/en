# Live Broadcasting

## **1. Acquire Broadcast Address**

Log in the Live Broadcast Console and go to the "Domain Name Management" page; select the group of domain names to be viewed for broadcast address and click "Management" on the right to go to the "Basic Information" page

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E6%8E%A8%E6%B5%81%E5%9C%B0%E5%9D%80-%E8%8E%B7%E5%8F%96%E6%8E%A8%E6%B5%81%E5%9C%B0%E5%9D%80.png)

The broadcast address can be viewed and copied in the "Broadcast Information" bar and broadcast address is spliced according to certain rules; among which, broadcast address, "APPName" and "StreamName" are customized at user pushing streaming and currently only supporting English letters, digits, "-", "_" with length between 1-50 characters; the customer should splice the broadcast address according to the APPName and StreamName defined at the time watching pushing streaming

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E5%9F%9F%E5%90%8D%E7%AE%A1%E7%90%86-%E8%8E%B7%E5%8F%96%E6%92%AD%E6%94%BE%E5%9C%B0%E5%9D%80.png)

## **2. Description of Broadcast Address**

** Address of Original Picture**

The broadcast address is consisted by three parts including Domain, APPName, StreamName, among which Domain is the broadcast domain name added by customer and APPName, StreamName are variables, APPName and StreamName only support English letters, digits, "-", "_" with length between 1-50 characters and are customized at pushing streaming; customer can splice the broadcast address as required if he/she wants to watch corresponding streams.

rtmp://Domain/APPName/StreamName

http://Domain/APPName/StreamName.flv

http://Domain/APPName/StreamName.m3u8

**Examples**

Domain is ccc.ddd.com and the APPName that the customer wants to watch is
app1; StreamName is 1 and broadcast addresses corresponding to three protocols including rtmp, hls and hdl are:

rtmp:// ccc.ddd.com/app1/1

http:// ccc.ddd.com/app2/1.flv

http:// ccc.ddd.com/app3/1.m3u8

**Broadcast Address of Transcoding Streaming**

When the transcoding template has been set by customer and the transcoding function has been turned on, the broadcast address of transcoding streaming shall be the original picture address + id of the transcoding template; after id splicing, different transcoding templates are corresponding to broadcast address after transcoding and the splice rules are as follows:

rtmp://Domain/APPName/StreamName_template id

http://Domain/APPName/StreamName_template id.flv

[http://Domain/APPName/StreamName_template id.m3u8](http://Domain/APPName/StreamName_template id.m3u8)

**Transcoding Template Parameters Supported**

| **Template Name** | **Template ID** | **Resolution** | **Code Rate (kbps)** |
|--------------|-------------|------------|------------------|
| Laser Disc       | lld         | 640\*360   | 200              |
| Standard Definition         | lsd         | 854\*480   | 400              |
| High Definition         | lhd         | 1280\*720  | 800              |

**Examples**

Domain is ccc.ddd.com and set laser disc to the transcoding template, lld to corresponding template id; the broadcast address of original picture is:

rtmp:// ccc.ddd.com/app1/1

http:// ccc.ddd.com/app1/1.flv

http:// ccc.ddd.com/app1/1.m3u8

Broadcast addresses after transcoding corresponding to three protocols including rtmp, hls and hdl are:

rtmp://ccc.ddd.com /app1/1_lld

http://ccc.ddd.com /app1/1_lld.flv

http://ccc.ddd.com /app1/1_lld.m3u8
