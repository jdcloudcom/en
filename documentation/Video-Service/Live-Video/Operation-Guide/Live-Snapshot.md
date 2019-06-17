# Live Snapshot

The Live Video Service supports the live snapshot and video streaming is snapshotted as per the time interval setting and stored in Object Storage Service in formats of jpg and png. To have the function, please subscribe Object Storage Service of JD Cloud and create corresponding Bucket space in North China (now, Live Video is supported in North China only). After Live Video is started, snapshot function will be automatically started. After images are produced, customers can view and download image files from the storage path.
```
Storage path of snapshot file:  
Coverage mode: snapshot/{Date}/{SourceID}/{AppName}/{StreamName}.{Format}
Sequence mode: snapshot/{Date}/{SourceID}/{AppName}/{StreamName}/{SnapshotTime}.{Format}
{Date} is the snapshot date
{SourceID} Source ID is the unique task ID associated with one domain group. For pushing streaming and play domain in the same group, SourceId is generated at random and is unique and unchangeable.
ID number of one domain group can be searched in "Domain Management"-"Basic Information" of the Console.
{AppName} is the live application name
{StreamName} is the live streaming name
{SnapshotTime} is the generation time of snapshot
{Format} is the image format
```  

Configuration of live snapshot is divided in two steps: 1. Create snapshot template; 2. Add snapshot configuration.   
Please first create a snapshot template and then add domain snapshot configuration. After snapshot configuration is completed, the newly-pushed live streaming will take effect. For snapshot configuration, three levels can be associated, including domain, APP and streaming. The configuration will take effect as per minimum granularity. For example, for domain rtmp://abc.com/live/123, the snapshot template A can be associated at the APP "live" level; the snapshot template B can be associated at the stream "123" level; and then, all other streams under APP "live", except "123", and the template B is only effective for the stream "123".

## Step 1: Create a snapshot template

Log in the Live Console, access the "Template Management" - "Snapshot Template Management" page and click **Add Snapshot Template  
Fill in corresponding snapshot file parameters as per your actual snapshot demands and click **Create Now** to successfully create the snapshot template. The successfully-created snapshot template will be displayed in the snapshot template list.    
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/35%E6%88%AA%E5%9B%BE%E7%AE%A1%E7%90%86.png) 
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/36%E6%88%AA%E5%9B%BE%E7%AE%A1%E7%90%86.png) 
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/37%E6%88%AA%E5%9B%BE%E7%AE%A1%E7%90%86.png) 

## Step 2: Create snapshot configuration  

Click **Domain Management** on the left menu bar of the Console, find the live domain group requiring snapshot configuration, click **Management** and access the "Snapshot Configuration" page.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/12%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E9%85%8D%E7%BD%AE.png)
Click **Create Snapshot Configuration** on the snapshot configuration page and access the snapshot configuration page:  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/38%E6%88%AA%E5%9B%BE%E7%AE%A1%E7%90%86.png) 
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/39%E6%88%AA%E5%9B%BE%E7%AE%A1%E7%90%86.png)
Select **All AppName**, then the configuration is effective to all APPs, i.e. the entire domain. If customized AppName is designated, then APP name requiring snapshot configuration shall be filled in and then the effective range of "All StreamName" can be continuously selected or customized StreamName can be designated. If customized StreamName is designated, then StreamName name requiring snapshot configuration shall be filled in. Then, select corresponding snapshot templates. Click **Create Now** to complete snapshot configuration. After snapshot configuration is created, the created snapshot configuration rules can be viewed in the snapshot configuration list. The configuration is effective to newly-pushed live streaming.    

In the snapshot configuration list, ALL in the AppName column means that the newly-created snapshot configuration is effective to all AppName, i.e. effective to the domain level. ALL in the StreamName column means that the newly-created snapshot configuration is effective to all StreamName, i.e. effective to the APP level.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/40%E6%88%AA%E5%9B%BE%E7%AE%A1%E7%90%86.png)   


