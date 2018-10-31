# Live Transcoding

Live Video service supports transcoding and can transform the video stream to different code rates and resolutions real-timely according to template that is set, when pushing streaming is started, the transcoding is started automatically and customer can watch the video streams after transcoding according to the broadcast address after transcoding, transcoding broadcast address is spliced according to certain rules and refer to Live Broadcast - Broadcast Address chapter for details.

Live transcoding templates are distinguished by AppName and all streams under the same AppName shall be transcoded according to parameters of current template settings.

If the AppName is filled with test when configuring the template, then all the streams under test shall execute tanscoding operation and transcode the streams according to parameters of test template settings at the same time.

## 1. New Template

Log in the live broadcast Console and go to the "Domain Name Management" page, select the group of domains to be viewed for broadcast addresses and click "Management" on the right to enter domain configuration page, click "Transcoding Configuration" to switch to the management page for template recording

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E8%BD%AC%E7%A0%81-%E8%BD%AC%E7%A0%81%E9%A1%B5%E5%88%87%E6%8D%A2.png)

Click "New Template" in the Transcoding Configuration page and fill in corresponding parameter information in the pop-up window, then click "OK" to complete the adding of transcoding template.

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E8%BD%AC%E7%A0%81-%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E6%A8%A1%E6%9D%BF%E6%8C%89%E9%92%AE.png)

Template parameters instructions are as follows:

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E8%BD%AC%E7%A0%81-%E6%96%B0%E5%BB%BA%E6%A8%A1%E6%9D%BF.png)

**App
Name**: Application name for live transcoding, which at present only supports English text, digits, "-", "_" with length between 1-50 characters

**Transcoding Template**: Optional prefabricated transcoding template types, which at present supports laser disc, standard definition and high definition, one of which shall be checked when creating a template.

Parameter instructions for prefabricated template:

| **Template Name** | **Template ID** | **Resolution** | **Code Rate (kbps)** |
|--------------|-------------|------------|------------------|
| Laser Disc         | lld         | 640x360    | 200              |
| Standard Definition         | lsd         | 854x480    | 400              |
| High Definition         | lhd         | 1280x720   | 800              |

## 2. Delete Template

Log in the live broadcast Console and go to the "Transcoding Setting" page; click "Delete" on the right of the transcoding template you want to delete and click "OK" in the pop-up window to complete.

![](https://github.com/jdcloudcom/cn/blob/cn-live-video/image/live-video/%E7%9B%B4%E6%92%AD%E8%BD%AC%E7%A0%81-%E6%A8%A1%E6%9D%BF%E5%88%A0%E9%99%A4.png)
