# Callback of Live Broadcast

Live Video Service supports the function of live broadcast callback, including pushing streaming callback and recording callback; the former can return the real-time status at user pushing streaming and stopping streaming to customer; especially when the host is using open source pushing streaming tools (such as OBS), the customer can learn the host status according to this function; the recording callback shall inform the customer at file recording so that the customer can get real-time recording files.

You are required to add a URL address for receiving callback when using this function and make sure the address is available; the operation shall be finished in the Console.

## 1. Start Callback

Log in the Console and enter the "Domain Name Management" page; select the group of domain names which shall be viewed for broadcast addresses and click "Management" on the right to go to the "Basic Information" page;

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E5%9F%9F%E5%90%8D%E7%AE%A1%E7%90%86-%E7%AE%A1%E7%90%86%E6%8C%89%E9%92%AE.jpg)

Slide the sliding knob in "Live Broadcast Information" bar at the bottom of the page to open pushing streaming or record callback

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E5%9B%9E%E8%B0%83%E5%BC%80%E5%90%AF.png)

Click the "Edit" button after callback of pushing streaming or recording to fill in callback address for receiving information and then click "OK" and finish the setup

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E5%9B%9E%E8%B0%83%E5%9C%B0%E5%9D%80%E7%BC%96%E8%BE%91.png)

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E9%85%8D%E7%BD%AE%E7%A1%AE%E5%AE%9A.png)

## 2. Close Callback

Log in the Console and enter the "Domain Name Management" page; select the group of domain names which shall be viewed for broadcast addresses and click "Management" on the right to go to the "Basic Information" page;

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E5%9F%9F%E5%90%8D%E7%AE%A1%E7%90%86-%E7%AE%A1%E7%90%86%E6%8C%89%E9%92%AE.jpg)

Slide the sliding knob in "Live Broadcast Information" bar at the bottom of the page to open pushing streaming or record callback

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E5%9B%9E%E8%B0%83-%E5%85%B3%E9%97%AD%E5%9B%9E%E8%B0%83.jpg)

## 3. Callback Instructions

**Description**

Callback Interface is JD live platform’s inform mechanism of events, supporting publish pushing streaming, stop pushing streaming, start recording, stop recording, start part record, stop part record and other events; the following callback format is required to be supported if callback function is required by customer.

**Instruction**

1.  Principal: Send POST request to user server through HTTP interface
    and feed back relevant real-time information status to user,the user server
    shall return results through 200 response return interfaces.

2.  The customer is required to open corresponding status and set callback URL correctly, moreover, the URL shall be visited normally.

**Format Instructions**

domain: Customer Pushing Streaming Domain

app: The application that is user-defined

stream: The stream that is user-defined

event: It is the name of event, including following definitions

publish_started: The pushing streaming is published

publish_done: The pushing streaming is done

record_started: The record is started

record_done: The record is done

record_part_started: The part record is started

record_part_done: The part record is done

status: Whether the event is successful (success or fail)

errorMsg: Describe the reason for failure in case of status=fail

url: The location for part record storage, the storage path is as follows: bucket name/record/{Date}/{DomainName}/{AppName}/{StreamName}/StartTime}_{EndTime}.flv, among which bucketname is the location that customer select for Object Storage Service; Date is the current date acquired; APPName is the application name which is user-defined; StreamName is the rated streaming which is user-defined; StartTime is the start time for record and EndTime is the end time for record

duration: Duration for part record

startTime: The start time for part record

stopTime: The end time for part record

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
