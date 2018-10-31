# Live Broadcast Pushing Streaming

## **1. Acquire Pushing Streaming Address**

Log in live broadcast Console and go to the"Domain Name Management" page; select the group of domain names to be viewed for pushing streaming addresses and click "Management" on the right to go to the domain "Basic Information" page;

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E6%8E%A8%E6%B5%81%E5%9C%B0%E5%9D%80-%E8%8E%B7%E5%8F%96%E6%8E%A8%E6%B5%81%E5%9C%B0%E5%9D%80.png)

The pushing streaming address in "Pushing Streaming Information" bar can be viewed and copied and pushing streaming address is spliced according to certain rules; in streaming address, "APPName" and "StreamName" are customized and currently only supporting English letters, digits, "-", "_" with length between 1-50 characters; the customer should splice the pushing streaming address customized according to rules.

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E6%8E%A8%E6%B5%81%E5%9C%B0%E5%9D%80-%E8%8E%B7%E5%8F%96%E6%8E%A8%E6%B5%81%E5%9C%B0%E5%9D%80-%E5%9F%BA%E6%9C%AC%E4%BF%A1%E6%81%AF%E9%A1%B5%E9%9D%A2.png)

## **2. Pushing Streaming Address Instructions**

The pushing streaming address is consisted by three parts including Domain, APPName, StreamName, among which Domain is the pushing streaming domain name added by customer and APPName, StreamName are variables. APPName and StreamName only support English letters, digits, "-", "_" with length between 1-50 characters and are customized to distinguish different applications and streams;multiple applications can be created under each domain and multiple live broadcast streams can be created under each application.

rtmp://Pushing Streaming DomainName/APPName/StreamName

**Examples**

The pushing streaming domain name is aaa.bbb.com and the name of the application that user wants to use is app1;
different stream names can be defined and multiple live streams can be created under app1 and the pushing streaming address is:

rtmp://aaa.bbb.com/app1/1

rtmp://aaa.bbb.com/app1/2

rtmp://aaa.bbb.com/app1/3

Multiple live streams which are mainly applications can also be created:

rtmp://aaa.bbb.com/app1/1

rtmp://aaa.bbb.com/app2/1

rtmp://aaa.bbb.com/app3/1

-   Note: If Pushing Streaming Authentication function is turned on, authentication information part shall be added behind the address, for example rtmp://aaa.bbb.com/app1/1?auth_key=1520565052-0-0-245681ddfefef6598560af1d2264ec3f

Refer to content of live authentication part for details.
