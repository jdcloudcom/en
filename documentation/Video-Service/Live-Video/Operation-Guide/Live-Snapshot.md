# Live Snapshot

Live Video service supports Live Snapshot, the pictures of video stream can be grabbed according to interval that has been set and then shall be stored in the Object Storage Service with a jpg picture format; the Object Storage Service of JD Cloud shall be turned on to use this function and the corresponding Bucket space shall be created in cn-north (at present, Live Video is supported only in cn-north); the snapshot shall be started automatically after live broadcast has begun and after the picture has been generated, the customer can view and download the image files according to storage path.

Live snapshot templates are distinguished by AppName and all streams under the same AppName shall be screenshot according to parameters of current template settings

If the AppName is filled in with test when configuring the template, then all the streams under test shall execute snapshot operation and video files shall be generated according to parameters of test template settings at the same time.

## 1. New Template

Log in the live broadcast Console and go to the "Domain Name Management" page; select the group of domain names to be viewed for broadcast addresses and click "Management" on the right to go to the Domain Name Setting page; click the "Snapshot Configuration" to switch to the management page of the snapshot template

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E6%88%AA%E5%9B%BE-%E9%A1%B5%E9%9D%A2%E5%88%87%E6%8D%A2.png)

Click "New Template" in the Snapshot Setting page and fill in corresponding parameter information in the pop-up window and then click "OK" to complete the adding of snapshot template.

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E6%88%AA%E5%9B%BE-%E6%96%B0%E7%89%88%E6%A8%A1%E6%9D%BF%E6%8C%89%E9%92%AE.png)

Template parameters instructions are as follows:

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E6%96%B0%E5%BB%BA%E6%88%AA%E5%9B%BE%E6%A8%A1%E6%9D%BF%E6%9B%B4%E6%96%B0.png)

**App
Name**: The application name for live snapshot, which currently only supports English text, digits, "-", "_" with length between 1-50 characters

**Storage Location**: The storage location for snapshot files, click "New Storage" and create Bucket space in the redirected page if it is empty

**Snapshot Frequency**: The time interval for live snapshot, with second as unit

**Snapshot Mode**: Include two modes including replace and not replace, and newly generated pictures in covering mode shall replace the old pictures, all snapshot files shall be reserved according to No. ({
Sequence}) in uncovering mode.

**Storage Path**: The detailed directory to store snapshot files, the system shall generate corresponding directory to store files automatically according to the Bucket that customer has set

Replace: snapshot/{Date}/{DomainName}/{AppName}/{StreamName}.jpg

Not replace: snapshot/{Date}/{DomainName}/{AppName}/{StreamName}/{Sequence}.jpg

-   {Date} Divide the record files into folders according to date and the default format is "year-month-day".

-   {DomainName} The pushing streaming name that customer has set

-   {APPName} can get AppName of your pushing streaming as storage path automatically; if it is required to be changed, then change {APPName};
    it is currently only supporting English letters, digits, "-", "_" with length between 1-50 characters

-   {StreamName} can get StreamName of your pushing streaming as storage path automatically;
    if it is required to be changed, then change {StreamName}
    it is currently only supporting English letters, digits, "-", "_" with length between 1-50 characters

-   { Sequence} is the sequence no. which shall increment in N+1 order.

## 2. Delete Template

Log in the live broadcast Console and enter "Snapshot Configuration" page; click "Delete" on the right of the record template you want to delete and click "OK" in pop-up window to complete the delete.

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E6%88%AA%E5%9B%BE-%E6%A8%A1%E6%9D%BF%E5%88%A0%E9%99%A4.png)
