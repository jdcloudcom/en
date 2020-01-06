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
    <thead>
    <tr>
        <td>Message Type<br>
        <td>Message Body Example</td>
        <td>Message Body Example Description</td>
        <td>Message Body Field Description</td>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td rowspan="2">Pushing Streaming Callback (Streaming Status Notification)</td>
        <td>
            {<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"version": "v1.1",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"publishDomain": "push.yourdomain.com",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"appName": "live",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"streamName": "350802",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"event": "publish_started",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"status": "success",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"clientIp": "12.11.112.34",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"eventTime": 1566370626345,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"pushParams": {<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"a": "aaa",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"b": "bbb",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"c": "ccc"<br>
            &nbsp;&nbsp;&nbsp;&nbsp;}<br>
            }<br>
        </td>
        <td>
            Pushing Streaming Start Message Body<br>
            For example:<br>
            If the pushing streaming address is:rtmp://push.yourdomain.com/live/350802?a=aaa&b=bbb&c=ccc<br>
            You will receive the message as shown in the example when you push streaming to JD Cloud platform
        </td>
        <td rowspan="2">
            version: Message Body Version Number (Current v1.1)<br>
            publishDomain: Pushing Streaming Domain<br>
            appName: Application name<br>
            streamName: Stream Name<br>
            event: Event  Value: [publish_started (pushing streaming starts),publish_done (pushing streaming ends)]<br>
            status: Status [success]<br>
            clientIp: Pushing Streaming Client IP<br>
            eventTime: Pushing Streaming Time (Millisecond Time Stamp)<br>
            pushParams: Pushing Streaming Parameter (original pushing streaming parameter is presented in json format)<br>
        </td>
    </tr>
    <tr>
        <td>
            {<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"version": "v1.1",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"publishDomain": "push.yourdomain.com",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"appName": "live",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"streamName": "350802",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"event": "publish_done",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"status": "success",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"eventTime": 1566377826235<br>
            }<br>
        </td>
        <td>
            Pushing Streaming End Message Body<br>
            For example:<br>
            Your pushing streaming address is:rtmp://push.yourdomain.com/live/350802?a=aaa&b=bbb&c=ccc<br>
            You will receive the message as shown in the example when you stop pushing streaming to JD Cloud platform<br>
        </td>
    </tr>
    <tr>
        <td rowspan="2">Record Callback (Record Result Notification)</td>
        <td>
            {<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"version": "v1.1",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"publishDomain": "push.yourdomain.com",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"appName": "live",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"streamName": "350802",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"format": "flv",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"duration": 18439,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"fileSize": 6007851133,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"beginTime": 1553741853968,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"endTime": 1553741935867,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"event": "record_done",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"downloadUrl":
            "http://s3.cn-north-1.jcloudcs.com/video-formal/record/20190319/57/live/62caee8d6c595e9441be/20190319175419_20190319175422.flv",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"status": "success"<br>
            }<br>
        </td>
        <td>
            Automatic Record Completion Message Body<br>
            For example:<br>
            If you configure a 1-hour record template in flv to the streaming pushed by you, you will receive the message as shown in the example after the record file in flv is generated 1 hour later<br>
        </td>
        <td rowspan="2">
            version: Message Body Version Number (Current v1.1)<br>
            publishDomain: Pushing Streaming Domain<br>
            appName: Application name<br>
            streamName: Stream Name<br>
            event: Event [record_done]<br>
            status: Status [success]<br>
            format: Recording Format<br>
            duration: Record File Duration (Millisecond)<br>
            fileSize: File Size (byte)<br>
            beginTime: Record Start Time (Millisecond Time Stamp)<br>
            endTime: Record End Time (Millisecond Time Stamp)<br>
            downloadUrl: Available Download Link<br>
            group: Point Print Record Time Slot Array (Specific for Point Print Record Message Body)<br>
            taskExternalId: Point Print Record Task External id (Specific for Point Print Record Message Body)<br>
        </td>
    </tr>
    <tr>
        <td>
            {<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"version": "v1.1",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"publishDomain": "push.yourdomain.com",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"appName": "live",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"streamName": "350802",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"duration": "18439",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"event": "record_done",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"fileSize": "6007851133",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"format": "flv",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"status": "success",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"group": [<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"beginTime": 1553228747000,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"endTime": 1553228747100<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;},<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"beginTime": 1553228747200,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"endTime": 1553228747300<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br>
            &nbsp;&nbsp;&nbsp;&nbsp;],<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"downloadUrl":
            "http://s3.cn-north-1.jcloudcs.com/video-formal/record/20190319/57/live/62caee8d6c595e9441be/20190319175419_20190319175422.flv",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"taskExternalId": "163594946396839936"<br>
            }<br>
        </td>
        <td>
            Point Print Record Completion Message Body<br>
            For example:<br>
            When you call APIs of openapi <a
                href="https://docs.jdcloud.com/en/live-video/api/addliverecordtask?content=API"> to add a point print record task,</a>
            You will receive the message as shown in the example after the record task is completed<br>
        </td>
    </tr>
    <tr>
        <td>Snapshot Callback (Snapshot Result Notification)</td>
        <td>
            {<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"version": "v1.1",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"publishDomain": "push.yourdomain.com",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"appName": "jw",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"streamName": "210235T85E3188001452",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"snapshotTime": 1553826618026,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"downloadUrl":"http://s3.cn-north-1.jcloudcs.com/jd-video-formal/snapshot/20190328/43/jw/210235T85E3188001452.jpg",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"status": "success",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"imgId": "8f5c8be9016ab658b98e3355336e3635"<br>
            }<br>
        </td>
        <td>
            Snapshot Result Message Body<br>
            For example:<br>
            If you configure a 10s snapshot template to the streaming pushed by you, you will receive the message as shown in the example after the snapshot is generated<br>
        </td>
        <td>
            version: Message Body Version Number (Current v1.1)<br>
            publishDomain: Pushing Streaming Domain<br>
            appName: Application name<br>
            streamName: Stream Name<br>
            snapshotTime: Snapshot File Generation Time (Millisecond Time Stamp)<br>
            downloadUrl: Available Download Link<br>
            status: Status [success]<br>
            imgId: Image id<br>
        </td>
    </tr>
    <tr>
        <td>Quality Detection Callback (Detection Result Notification)</td>
        <td>
            {
            &nbsp;&nbsp;&nbsp;&nbsp;"publishDomain": "push1-test-yjh.jd.com",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"appName": "mqd-app-test",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"module": "Brightness",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"startTime": 1571301677664,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"endTime": 1571301684919,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"type": "video",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"version": "v1.0",<br>
            &nbsp;&nbsp;&nbsp;&nbsp;"streamName": "mqd-stream-test-1"<br>
            }<br>
        </td>
        <td>
            Quality Detection Message Body<br>
            For example:<br>
            If you configure (you can only configure through openapi currently) a quality detection template to the streaming pushed by you, you will receive the message as shown in the example when any exception is found in the detection items configured by you<br>
        </td>
        <td>
            version: Message Body Version Number (Current v1.1)<br>
            publishDomain: Pushing Streaming Domain<br>
            appName: Application name<br>
            streamName: Stream Name<br>
            module: Quality Assurance Item<br>
            You can only detect the following detection items currently:<br>
            - BlackScreen<br>
            - PureColor<br>
            - ColorCast<br>
            - FrozenFrame<br>
            - Brightness<br>
            - Contrast<br>
            type: Type [video]<br>
            startTime: Exception Start Time (Millisecond Time Stamp)<br>
            endTime: Exception End time (Millisecond Time Stamp)<br>
        </td>
    </tr>
    </tbody>
</table>
