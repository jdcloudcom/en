# Live Pushing Streaming

## **1. Get pushing streaming address**

Login to Live Console to access "Domain Management" page, select a group of domains for viewing pushing streaming addresses, then click **Management** at the right to access "Basic Information" page of the domain

![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/6%E7%9B%B4%E6%92%AD%E6%8E%A8%E6%B5%81.png)

In the "Pushing Streaming Information" column, you can view and replicate the pushing streaming address. The pushing streaming address is spliced according to certain rules, in which the application name "APPName" and the stream name "StreamName" are customized by users. The application name (APPName) and the stream name (StreamName) currently can only contain English, numbers, "-", "_" and the length shall be limited between 1-50 characters. Customers need to splice the pushing streaming address by rules according to their own definitions

![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/7%E7%9B%B4%E6%92%AD%E6%8E%A8%E6%B5%812.png)

## **2. Describe pushing streaming address**

The pushing streaming address is composed of domain (Domain), application name (APPName) and stream name (StreamName), in which the domain shall be the pushing streaming domain added by the customer and the application name and the stream name shall be variables. The application name (APPName) and the stream name (StreamName) currently can only contain English, numbers, "-", "_" and the length shall be limited between 1-50 characters. They are customized by customers to distinguish different applications and streams. More than one application can be created under each domain and more than one live streaming can be created under each application.

rtmp:// Pushing Streaming Domain/Application Name/Stream Name

**Examples**

If the pushing streaming domain is aaa.bbb.com, the name of the application a customer wants to use is app1 and under app1,
multipath live streaming can be customized with different stream names, then the pushing streaming address shall be:

rtmp://aaa.bbb.com/app1/1

rtmp://aaa.bbb.com/app1/2

rtmp://aaa.bbb.com/app1/3

Multiple live streaming mainly relying on applications can also be created:

rtmp://aaa.bbb.com/app1/1

rtmp://aaa.bbb.com/app2/1

rtmp://aaa.bbb.com/app3/1

-   Note: If the pushing streaming authentication function is enabled, the address will be added with a part of authentication information, e.g. rtmp://aaa.bbb.com/app1/1?auth_key=1520565052-0-0-245681ddfefef6598560af1d2264ec3f

Please refer to the contents of live authentication for details.

