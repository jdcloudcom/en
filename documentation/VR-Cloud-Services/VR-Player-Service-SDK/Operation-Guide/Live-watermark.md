# Live Watermark  
The Live Video Service supports the function of adding watermarks to live streaming. You can upload watermark images to be added to the watermark template, configure the intended transcode streaming and then the watermark is added.  
```
Notification: Watermark configuration can be enabled in the condition that transcode configuration is enabled. Once pushing streaming is made to the live streaming with transcode configuration again, watermark configuration will come into effect,  
     For live streaming without transcode, the watermark configuration will not take effect.  
```  

Configuration of live watermark is divided in two steps: 1. Create watermark template; 2. Add watermark configuration.   
Please first create a watermark template and then add domain watermark configuration. After watermark configuration is completed, the newly-pushed live streaming will take effect. For watermark configuration, three levels can be associated, including domain, APP and streaming. The configuration will take effect as per minimum granularity. For example, for domain rtmp://abc.com/live/123, the watermark template A can be associated at the APP"live" level; the watermark template B can be associated at the stream "123" level; and then, all other streams under APP"live", except "123", and the template B is only effective for the stream "123".

## Step 1: Create a watermark template

Log in the Live Console, access the "Template Management"-"Watermark Template Management" page and click **Add Watermark Template  
Fill in corresponding watermark file parameters as per your actual watermark demands and click **Create Now** to successfully create the watermark template. The successfully-created watermark template will be displayed in the watermark template list.    
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/42%E6%B7%BB%E5%8A%A0%E6%B0%B4%E5%8D%B0%E6%A8%A1%E6%9D%BF.png) 
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/43%E6%B7%BB%E5%8A%A0%E6%B0%B4%E5%8D%B0%E6%A8%A1%E6%9D%BF.png) 
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/44%E6%B7%BB%E5%8A%A0%E6%B0%B4%E5%8D%B0%E6%A8%A1%E6%9D%BF.png) 
## Step 2: Create watermark configuration  

Click **Domain Management** on the left menu bar of the Console, find the live domain group requiring watermark configuration, click **Management** and access the "Watermark Configuration" page.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/12%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E9%85%8D%E7%BD%AE.png)
Click **Create Watermark Configuration** on the watermark configuration page and access the watermark configuration page:  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/45%E6%96%B0%E5%BB%BA%E6%B0%B4%E5%8D%B0%E9%85%8D%E7%BD%AE.png) 
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/46%E6%96%B0%E5%BB%BA%E6%B0%B4%E5%8D%B0%E9%85%8D%E7%BD%AE.png)
Select "All AppName", then the configuration is effective to all APPs, i.e. the entire domain. If customized AppName is designated, then APP name requiring watermark configuration shall be filled in and then the effective range of "All StreamName" can be continuously selected or customized StreamName can be designated. If customized StreamName is designated, then StreamName name requiring watermark configuration shall be filled in. Then, select corresponding watermark templates. Click **Create Now** to complete watermark configuration. After watermark configuration is created, the created watermark configuration rules can be viewed in the watermark configuration list. The configuration is effective to newly-pushed live streaming.    

In the watermark configuration list, ALL in the AppName column means that the newly-created watermark configuration is effective to all AppName, i.e. effective to the domain level. ALL in the StreamName column means that the newly-created watermark configuration is effective to all StreamName, i.e. effective to the APP level.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/47%E6%96%B0%E5%BB%BA%E6%B0%B4%E5%8D%B0%E9%85%8D%E7%BD%AE.png)
