# Live Record


The Live Video Service supports the record function that the live streaming is recorded to files and then saved in Object Storage Service. To have the function, please enable Object Storage Service of JD Cloud and create corresponding Bucket space in North China (now, Live Video is supported in North China only). After Live Video is ended, files will be automatically produced and customers can view and download video files from the storage path.  
```
File Record and Storage Path:  
record/{Date}/{SourceId}/{AppName}/{StreamName}/{StartTime}_{EndTime}。
{Date} is the recording date of live streaming

{SourceID} Source ID is the unique task ID associated with one domain group. For pushing streaming and play domain in the same group, SourceId is generated at random and is unique and unchangeable.
ID number of one domain group can be searched in "Domain Management"-"Basic Information" of the Console.

{AppName} is the live application name

{StreamName} is the live streaming name

{StartTime} is the recording start time

{EndTime} is the recording end time
```  
Configuration of live record is divided in two steps: 1. Create a record template; 2. Add watermark configuration.   
Please first create a record template and then add domain record configuration. After record configuration is completed, the newly-pushed live streaming will take effect. For record configuration, three levels can be associated, including domain, APP and streaming. The configuration will take effect as per minimum granularity. For example, for domain rtmp://abc.com/live/123, the record template A can be associated at the APP"live" level; the record template B can be associated at the stream "123" level; and then, all other streams under APP"live", except "123", and the template B is only effective for the stream "123".

## Step 1: Create a record template

Log in the Live Console, access the "Template Management"-"Record Template Management" page and click **Add Record Template  
Fill in corresponding record file parameters as per your actual record demands and click **Create Now** to successfully create the record template. The successfully-created record template will be displayed in the record template list.    
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/29%E5%BD%95%E5%88%B6%E7%AE%A1%E7%90%86.png) 
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/30%E5%BD%95%E5%88%B6%E7%AE%A1%E7%90%86.png) 
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/31%E5%BD%95%E5%88%B6%E7%AE%A1%E7%90%86.png) 
## Step 2: Create record configuration  

Click **Domain Management** on the left menu bar of the Console, find the live domain group requiring record configuration, click **Management** and access the "Record Configuration" page.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/12%E6%96%B0%E5%BB%BA%E8%BD%AC%E7%A0%81%E9%85%8D%E7%BD%AE.png)
Click **Create Record Configuration** on the record configuration page and access the record configuration page:  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/32%E5%BD%95%E5%88%B6%E7%AE%A1%E7%90%86.png) 
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/33%E5%BD%95%E5%88%B6%E7%AE%A1%E7%90%86.png)
Select "All AppName", then the configuration is effective to all APPs, i.e. the entire domain. If customized AppName is designated, then APP name requiring record configuration shall be filled in and then the effective range of "All StreamName" can be continuously selected or customized StreamName can be designated. If customized StreamName is designated, then StreamName name requiring record configuration shall be filled in. Then, select corresponding record templates. Click **Create Now** to complete record configuration. After record configuration is created, the created record configuration rules can be viewed in the record configuration list. The configuration is effective to newly-pushed live streaming.    

In the record configuration list, ALL in the AppName column means that the newly-created record configuration is effective to all AppName, i.e. effective to the domain level. ALL in the StreamName column means that the newly-created record configuration is effective to all StreamName, i.e. effective to the APP level.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/34%E5%BD%95%E5%88%B6%E7%AE%A1%E7%90%86.png)   
