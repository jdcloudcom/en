# Live Broadcast Record

Live Video service supports record function and the video stream can be recorded as files which are stored in the  Object Storage Service; the Object Storage Service of JD Cloud shall be turned on to use this function and the corresponding Bucket space shall be created in cn-north (at present, the Live Video is supported only in cn-north); the files shall be created automatically after live broadcast has begun and the customer can view and download the video files according to storage path.

The live broadcast record template shall be distinguished by AppName and all streams under the same AppName shall be recorded according to parameters of the current template settings.

If the AppName is filled with test when setting the template, then all the streams under test shall execute record operation and video files shall be generated according to parameters of test template settings at the same time.

## 1. New Template

Log in the live broadcast Console and go to the "Domain Name Management" page; select the group of domain names to be viewed for broadcast addresses and click "Management" on the right to go to the  "Basic Information" page; click "Record Settings" to switch to the "Management" page for template recording

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E7%9B%B4%E6%92%AD%E5%BD%95%E5%88%B6-%E9%A1%B5%E9%9D%A2%E5%88%87%E6%8D%A2.png)

Click "New Template" in the Record Configuration page and fill in corresponding parameters information in the pop-up window, then click "OK" to complete the adding of record template.

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E7%9B%B4%E6%92%AD%E5%BD%95%E5%88%B6-%E6%96%B0%E5%BB%BA%E6%A8%A1%E6%9D%BF%E6%8C%89%E9%92%AE.png)

Template parameters instructions are as follows:

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E7%9B%B4%E6%92%AD%E5%BD%95%E5%88%B6-%E6%96%B0%E5%BB%BA%E6%A8%A1%E6%9D%BF.png)

**App
Name**: The application name for live recording is currently only supporting English letters, digits, "-", "_" with length between 1-50 characters

**Storage Location**: The location for video files recorded storage, click "New Storage" and create Bucket space in the redirected page if it is empty

**Cycle Length**: The time length for video file recording, with a range from 15-360 minutes, if it exceeds 6 hours, the system shall generate a new video file automatically

**Record Format**: File format for video generated supports only flv at present

**Storage Path**: The detailed directory to store recorded files, the system shall generate corresponding directory to store files according to the Bucket that customer has set up automatically

record/{Date}/{DomainName}/{AppName}/{StreamName}/{StartTime}_{EndTime}.flv

-   {Date} Divide the record files into folders according to date and the default format is "year-month-day".

-   {DomainName} The pushing streaming name that customer has set

-   {APPName} can get AppName of your pushing streaming as storage path automatically; if it is required to be changed, then change {APPName};
    it is currently only supporting English letters, digits, "-", "_" with length between 1-50 characters

-   {StreamName} can get StreamName of your pushing streaming as storage path automatically;
    if it is required to be changed, then change {StreamName}
    it is currently only supporting English letters, digits, "-", "_" with length between 1-50 characters

-   {StartTime} is the start time to record and {EndTime} is the end time to end recording

## 2. Delete Template

Log in the live broadcast Console and go to the "Record Configuration" page, click "Delete" on the right of the record template you want to delete and click "OK" in the pop-up window to finish deleting.

![](https://github.com/jdcloudcom/cn/blob/edit/image/live-video/%E7%9B%B4%E6%92%AD%E5%BD%95%E5%88%B6-%E6%A8%A1%E6%9D%BF%E5%88%A0%E9%99%A4.png)
