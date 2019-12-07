# Live Callback

Live Video Service supports the live callback function, including pushing streaming callback, record callback and snapshot callback, wherein pushing streaming callback can return real-time status of user’s pushing streaming and breaking streaming to customers. Particularly, if the streamer adopts open source pushing streaming tools (e.g., OBS), customers can understand the streamer status through this function, so that when re-recording files of record callback generated, customers will be notified and get the image files in real time.

You need to add a URL address for receiving callback and keep its availability to use the function, which the operation can be completed on the console.

## 1. Enable Callback

Log in the Live Console, access the "Domain Management" page, select a group of domains for viewing play addresses, click **Management** at the right, and access "Callback Configuration" page

![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/12%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E9%85%8D%E7%BD%AE.png)

On the callback configuration page, slide the slide knob on demand to enable pushing streaming, record or snapshot callback

![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/17%E5%9B%9E%E8%B0%83%E9%85%8D%E7%BD%AE.png)

Click **Edit** button behind the Pushing Streaming or Recording Callback Address to enter callback address of receiving information, click **OK** to complete setting

![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/18%E5%9B%9E%E8%B0%83%E9%85%8D%E7%BD%AE.png)

## 2. Disable Callback

Login Live Video Console to access "Domain Management" page, select a group of domains for viewing play addresses, then click **Management** at the right to access "Basic Information" page

![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/12%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E9%85%8D%E7%BD%AE.png)

On the callback configuration page, slide the slide knob on demand to disable pushing streaming, record or snapshot callback

![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/19%E5%9B%9E%E8%B0%83%E9%85%8D%E7%BD%AE.png)



## Notification Callback Information Sample

<table>
<tr>
    <td>Type<br/>
    <td>Message Body</td>
    <td>Message Field Description</td>
</tr>
<tr>
    <td>Callback of starting pushing streaming<br/>
    <td> {<br>  
        "version": "v1.1",<br>  
        "publishDomain": "push.yourdomain.com",<br>   
        "appName": "live",<br> "streamName": "350802", <br>"event": "publish_started",<br> "status": "success", <br>"clientIp": "12.11.112.34", <br>"eventTime": 12312312312, <br>"pushParams": { <br>"a": "aaa",<br> "b": "bbb",<br> "c": "ccc"<br> }<br> }<br> 
</td>
    <td>version: Message Body Version Number<br>  
publishDomain: Pushing Streaming Domain<br>  
appName: Application name<br>  
streamName: Stream Name<br>  
event:Event [publish_started,publish_ ]done, record_done<br>  
status: Status [success]<br>  
eventTime: Triggering time, millisecond<br>  
pushParams: Pushing Streaming Parameter<br></td>
</tr>
<tr>
    <td>Callback of ending pushing streaming<br/>
    <td> 
	{<br/>
	"version": "v1.1",<br/> 
	"publishDomain": "push.yourdomain.com",<br/>
	"appName": "live",<br/>
	"streamName": "350802",<br/>
	"event": "publish_done",<br/>
	"status": "success",<br/>
	"eventTime": 12312312312<br/>
	}<br/>
</td>
    <td>version: Message Body Version Number<br>  
publishDomain: Pushing Streaming Domain<br>  
appName: Application name<br>  
streamName: Stream Name<br>  
event:Event [publish_started,publish_ ]done, record_done<br>  
status: Status [success]<br>  
</td>
</tr>
<tr>
    <td>Automatic record callback<br/>
    <td> {<br/>
	"version": "v1.1",<br/>
	"publishDomain": "push.yourdomain.com",<br/>
	"appName": "live",<br/>
	"streamName": "350802",<br/>
	"format": "flv",<br/>
	"duration": "18439.0",<br/>
	"fileSize": "6007851133",<br/>
	"beginTime": 1553741853968,<br/>
	"endTime": 1553741935867,<br/>
	"event": "record_done",<br/>
	"downloadUrl": "http://s3.cn-north-1.jcloudcs.com/jd-video-formal/record/20190319/57/live/<br>
	    62caee8d6c595e9441be/20190319175419_20190319175422.flv "<br/>
	"status": "success"<br/>
	}<br/>
</td>
    <td>version: Message Body Version Number<br>  
publishDomain: Pushing Streaming Domain<br>  
appName: Application name<br>  
streamName: Stream Name<br>  
event:Event [publish_started,publish_ ]done, record_done<br>  
status: Status [success]<br>
format: Recording Format<br>
startTime: Recording Start Time<br>
stopTime: Record End Time<br>
downloadUrl: Available Download Link<br>  
</td>
</tr>
<tr>
    <td>Point Print Record Callback<br/>
    <td>{<br>
	"version": "v1.1",<br>
	"publishDomain": "push.yourdomain.com",<br>
	"appName": "live",<br>
	"streamName": "350802",<br>
	"duration": "18439.0",<br>
	"event": "record_done",<br>
	"fileSize": "6007851133",<br>
	"format": "flv",<br>
	"status": "success",<br>
	"group": [<br>
	{<br>
	"beginTime": "1553228747000",<br>
	"endTime": "1553228747100"<br>
	},<br>
	{<br>
	"beginTime": "1553228747200",<br>
	"endTime": "1553228747300"<br>
	}<br>
	],<br>
	"downloadUrl": "http://s3.cn-north-1.jcloudcs.com/ngwcloud1oss/record/20190322/jdpush.jd.com<br>
	    /live/347031/20190322122547_20190322173152.mp4",<br>
	"taskExternalId": "163594946396839936"<br>
	}<br>
</td>
    <td>version: Message Body Version Number<br>  
publishDomain: Pushing Streaming Domain<br>  
appName: Application name<br>  
streamName: Stream Name<br>  
event:Event [publish_started,publish_ ]done, record_done<br>  
status: Status [success]<br>
duration: Record File Duration (Millisecond)<br>
fileSize: File Size (kb)<br>
group: Recording Time Period<br>
downloadUrl: Available Download Link<br>
vodTaskId: Recording External ID<br>  
</td>
</tr>
<tr>
    <td>Snapshot Callback<br/>
    <td>{<br>
	"version": "v1.1",<br>
	"publishDomain": "push.yourdomain.com",<br>
	"appName": "jw",<br>
	"streamName": "210235T85E3188001452",<br>
	"snapshotTime": 1553826618026,<br>
	"downloadUrl": "http://s3.cn-north-1.jcloudcs.com/jd-video-formal/<br>
	    snapshot/20190328/43/jw/210235T85E3188001452.jpg",<br>
	"status": "success"<br>
	}<br>
</td>
    <td>version: Message Body Version Number<br>  
publishDomain: Pushing Streaming Domain<br>  
appName: Application name<br>  
streamName: Stream Name<br>  
snapshotTime: Snapshot File Generating Time<br>  
downloadUrl: Available Download Link<br>
status: Status [success]<br>
</td>
</tr>
</table>
