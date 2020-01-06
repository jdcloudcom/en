# Live Transcode

The live transcode provided by JD Cloud will by default enable the transcode in Jingxiang super definition mode, implementing a high-quality and high-performance live transcode mode consuming lower code rate. After transcode configuration is completed and when pushing streaming is started, the transcode operation will be started automatically.   
The customer can view transcoded video streaming with the transcoded play address, and the transcoded playing address is stitched with certain rules, and the stitching rules are as follows:  
rtmp://Domain/{AppName}/{StreamName}_Code Rate Identifier  
http://Domain/{AppName}/{StreamName}_Code Rate Identifier.flv  
http://Domain/{AppName}/{StreamName}_Code Rate Identifier.m3u8.  
The "Code Rate Identifier" is the pull-transcode streaming identifier field filled while creating transcode templates.  

Configuration of live transcode configuration is divided in two steps: 1. Create transcode template; 2. Add transcode configuration.   
The system has preset a standard quality template for you. If it cannot satisfy your transcode needs, please first create a transcode template and then add domain transcode configuration. After transcode configuration is completed, the newly-pushed live streaming will take effect. For transcode configuration, three levels can be associated, including domain, APP and streaming. The configuration will take effect as per minimum granularity. For example, for domain rtmp://abc.com/live/123, the transcode template A can be associated at the APP"live" level; the transcode template B can be associated at the stream "123" level; and then, all other streams under APP"live", except "123", and the template B is only effective for the stream "123".  
  
## Live Transcode Parameter Recommends  

<table>
<tr>
    <td>Resolution<br/>
    <td>Recommended Video Code Rate (bps)</td>
    <td>Recommended Frame Rate (fps)</td>
    <td>Recommended Audio Code Rate (bps)</td>
</tr>
<tr>
    <td>240p(426×240)<br/>
    <td>200,000~300,000</td>
    <td>15</td>
    <td>48,000</td>
</tr>
<tr>
    <td>360p(640×360)<br/>
    <td>300,000~600,000</td>
    <td>15</td>
    <td>48,000</td>
</tr>
<tr>
    <td>480p(854×480)<br/>
    <td>600,000~1000,000</td>
    <td>25</td>
    <td>64,000</td>
<tr>
    <td>720p(1280×720)<br/>
    <td>1000,000~1500,000</td>
    <td>25</td>
    <td>64,000</td>
</tr> 
<tr>
    <td>1080p(1920×1080)<br/>
    <td>1500,000~3000,000</td>
    <td>30</td>
    <td>128,000</td>
</tr>
<tr>
    <td>2k(2560×1440)<br/>
    <td>3000,000~7000,000</td>
    <td>30</td>
    <td>192,000</td>
</tr>
<tr>
    <td>4k(3840×2160)<br/>
    <td>7000,000~15000,000</td>
    <td>30</td>
    <td>256,000</td>
</tr>  
</table>
  
## Step 1: Create a template

Log in the Live Console, access "Template Management"-"Transcode Template Management" page, view "General Transcode Template" and view if the following system prefabricated transcode template conforms to your transcode configuration demands. If yes, you do not need to create any new templates and corresponding templates can be directly called from the transcode configuration.   
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/9%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E6%A8%A1%E6%9D%BF%E9%9C%80%E4%BF%AE%E6%94%B9.png)  
Where prefabricated transcode template cannot meet your transcode requests, please access the "Customized Transcode Template" page to add the customized transcode template.
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/10%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E6%A8%A1%E6%9D%BF.png)
Click **Add Transcode Template**, output demands as per your real transcode, fill in corresponding transcode video and audio parameters and click **Create Now** to successfully create the transcode template. The successfully-created transcode template will be displayed in the transcode template list.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/11%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E6%A8%A1%E6%9D%BF.png) 

## Step 2: Create transcode configuration  

Click **Domain Management** on the left menu bar of the Console, find the live domain group requiring transcode configuration, click **Management** and access the "Transcode Configuration" page.
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/12%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E9%85%8D%E7%BD%AE.png)
Click **Create Transcode Configuration** on the transcode configuration page and access the transcode configuration page:
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/13%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E9%85%8D%E7%BD%AE.png)  
Select "All AppName", then the configuration is effective to all APPs, i.e. the entire domain. If customized AppName is designated, then APP name requiring transcode configuration shall be filled in and then the effective range of "All StreamName" can be continuously selected or customized StreamName can be designated. If customized StreamName is designated, then StreamName name requiring transcode configuration shall be filled in. Then, select corresponding transcode template (s) which is/are applicable independently or multiply. Click **Create Now** to complete transcode configuration. After transcode configuration is created, the created transcode rules can be viewed in the transcode configuration list. The configuration is effective to newly-pushed live streaming.
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/14%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E9%85%8D%E7%BD%AE.png) 
In the transcode configuration list, ALL in the AppName column means that the newly-created transcode configuration is effective to all AppName, i.e. effective to the domain level. ALL in the StreamName column means that the newly-created transcode configuration is effective to all StreamName, i.e. effective to the APP level.
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/15%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E9%85%8D%E7%BD%AE.png) 
