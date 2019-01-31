# Statistics & Analysis

Click **VOD**-**Statistics & Analysis** to search traffic bandwidth, storage usage, number of files by specifying domain, time slot, display transcoding duration, number of transcoding files by coding methods and resolutions.




Live Video Service supports live callback functions, including pushing streaming callback and recording callback, wherein the former can return real-time status of user pushing streaming and breaking streaming to customers. Particularly, if the streamer adopts open source pushing streaming tools (e.g., OBS), customers can understand the streamer status through this function, so that when re-recording files of recording callback generated, customers will be notified and get the recording files in real time.

You need to add a URL address for receiving callback and keep its availability to use the function, which the operation can be completed on the console.

## 1. Enable Callback

Login Live Video console to access "Domain Management" page, select a group of domains for viewing play addresses, then click **Management** at the right to access "Basic Information" page

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E5%9F%9F%E5%90%8D%E7%AE%A1%E7%90%86-%E7%AE%A1%E7%90%86%E6%8C%89%E9%92%AE.jpg)

Move the slider on the "Live Video Information" bar at the end of the page to enable pushing streaming or recording callback

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E5%9B%9E%E8%B0%83%E5%BC%80%E5%90%AF.png)

Click **Edit** button behind the Pushing Streaming or Recording Callback Address to enter callback address of receiving information, click **OK** to complete setting

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E5%9B%9E%E8%B0%83%E5%9C%B0%E5%9D%80%E7%BC%96%E8%BE%91.png)

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E9%85%8D%E7%BD%AE%E7%A1%AE%E5%AE%9A.png)

## 2. Disable Callback

Login Live Video console to access "Domain Management" page, select a group of domains for viewing play addresses, then click **Management** at the right to access "Basic Information" page

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E5%9F%9F%E5%90%8D%E7%AE%A1%E7%90%86-%E7%AE%A1%E7%90%86%E6%8C%89%E9%92%AE.jpg)

Move the slider on the "Live Video Information" bar at the end of the page to disable pushing streaming or recording callback

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E5%85%B3%E9%97%AD%E5%9B%9E%E8%B0%83.jpg)

## 3. Callback Description

**Description**

Callback interface is the notification mechanism of event on JD Live Video platform, which currently supports start pushing streaming, end pushing streaming, start record, end record, start record multipart, end record multipart and other events; if the customers need callback function, then the following callback formats shall be supported.

**Description**

1.  Principle: Send POST
    request to the user server through HTTP interface to feed relevant information status back to users in real time, and user server responds
    returning interface to return results through 200.

2.  The customers need to enable corresponding status and correctly set callback URL and ensure the normal access of the URL.

**Format Description**

domain: Customer Pushing Streaming Domain

app: Customized Application Name

stream: Stream name customized by the customer

event: Name of event, including the following definitions

publish_started: Start pushing streaming

publish_done: End pushing streaming

record_started: Start record

record_done: End record

record_part_started: Start multipart record

record_part_done: End multipart record

status: Whether the event succeeds or not, success presents succeeded, fail presents failed

errorMsg: Describe failure reason in the case status = fail

url: location of storing recording multipart, with the storage path as below: bucket name/record/{Date}/{DomainName}/{AppName}/{StreamName}/StartTime}_{EndTime}.flv, wherein bucketname is the Object Storage Service space location selected by the customer, Date is the current obtained date, AppName is the application name customized by the customer, StreamName is the streaming name customized by the customer, StartTime is the start time of record, EndTime is the end time of record

duration: Duration of recording multipart

startTime: Start time of the multipart

stopTime: End time of the multipart

**Return Example**

{

 "domain": " push.test.com",

 "app": "appname",

 "stream": "streamname",

 "event": " RECORD_PART_DONE ",

 "status": "sucess",

 "url": "
bucketname/record/20180423/push.test.com/app/live/20180423174942_20180423180942.flv
",

"duration": "32",

"startTime": " 1524476982 ",

"stopTime": " 1524477014 ",

}
