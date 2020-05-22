# Global Configuration
Global configuration comprises two parts, snapshot setting and callback setting.

## Snapshot Setting
The main information of the snapshot template page is as follows:
![](https://github.com/jdcloudcom/cn/blob/cn-Media-Processing-Service/image/Media-Processing-Service/mps-%E6%88%AA%E5%9B%BE%E6%A8%A1%E6%9D%BF-1.png)      
1. [Snapshot Template List], exhibit key information in a snapshot template, with existing transcoding templates able to be edited and deleted;     
2. [Create Snapshot Template] Create a snapshot template entrance and click it to enter the Template Creation Page:   
**Setting of snapshot templates:**        
![](https://github.com/jdcloudcom/cn/blob/cn-Media-Processing-Service/image/Media-Processing-Service/mps-%E6%88%AA%E5%9B%BE%E6%A8%A1%E6%9D%BF-2.png)    
1) [Template Name], the name of snapshot template customized by the user, without ", ', < and > and with length limit of 25 characters;    
2) [Snapshot Method], select multiple snapshots;    
3) [Snapshot File Format], support jpg and png and select as per demands;     
4) [Start Time], it is not a required item, starting from 0s by default and supporting customization by users;    
5) [Snapshot Count], the snapshot count value range is [1,3600]; the default value is 1; average snapshots are taken as per the user-defined count; if the video duration is short and the snapshotted image count is less than the setting value, the maximum snapshotting count shall be followed;    
6) [Time Interval], it is not a required item; if it is not filled in, the average snapshots are taken as per the snapshot count; if it is filled in, the average snapshots are taken as per time interval and snapshot count, with rules as follows:    
    Take snapshots as per time interval; if the total count for snapshotting is less than the snapshot count setting, the total count for snapshotting shall be followed;     
    Take snapshots as per time interval; if the total count for snapshotting is greater than the snapshot count setting, the snapshot count setting shall be followed;       
7) [Image Width and Height], rules for image width and height are as follows:    
   When width and height are not filled in, the resolution is homologous;    
   If the width is null, but the height is not null, please zoom out the width as per the proportion;    
   If the width is not null, but the height is null, please zoom out the height as per the proportion;    
   When width and height are not null, the resolution shall correspond to the snapshot designated by the user, with filling rules as follows: (left black by default).    
   a. Stretch, if each frame is stretched to fill the entire picture, the transcoded videos will be "flattened" or "drawn out";    
   b. Left black, keep video crown proportion unchanged and fill the remaining margins with the black color;    
   c. Left blank, keep video crown proportion unchanged and fill the remaining margins with the white color;    
   d. Gaussian blur, keep video crown proportion unchanged and apply Gaussian blur treatment to the remaining margins.    
8) [Key Frame or Not], if the snapshot customized by the user is a key frame snapshot. By default, it is the key frame snapshot.     

**CSS Sprite template setting:**     
Application scenario: Images of multiple snapshots can make up a large picture output with the method of CSS Sprite. Multiple images can be obtained via one request, thus reducing image requests and improving client performance.          
![](https://github.com/jdcloudcom/cn/blob/cn-Media-Processing-Service/image/Media-Processing-Service/mps-%E6%88%AA%E5%9B%BE%E6%A8%A1%E6%9D%BF-3.png)     
1) [Template Name], the name of snapshot template customized by the user, without ", ', < and > and with length limit of 25 characters;     
2) [Snapshot Method], select CSS Sprite;      
3) [Snapshot File Format], support jpg and png and select as per demands;     
4) [Start Time], it is not a required item, starting from 0s by default and supporting customization by users;      
5) [Time Interval], it is not a required item; if it is not filled in, the average snapshots are taken as per the snapshot count (snapshot count = thumbnail rows * thumbnail columns); if it is filled in, the average snapshots are taken as per time interval and snapshot count, with rules as follows:    
    Take snapshots as per time interval; if the total count for snapshotting is less than the snapshot count setting, the total count for snapshotting shall be followed;     
    Take snapshots as per time interval; if the total count for snapshotting is greater than the snapshot count setting, the snapshot count setting shall be followed;       
6) [Thumbnail Rows], rows × columns ≤100, i.e., the maximum snapshot count of CSS Sprite is 100; if the video duration is short and the total snapshot count is less than rows × columns, please arrange the snapshots according to the rules of from top to bottom and from left to right.     
7) [Width and Height of Thumbnail], image width and height rules are as follows (to guarantee loading speed of CSS Sprite, it is suggested that the width and height settings of thumbnail shall not be too high):    
   When width and height are not filled in, the resolution is homologous;    
   If the width is null, but the height is not null, please zoom out the width as per the proportion;    
   If the width is not null, but the height is null, please zoom out the height as per the proportion;    
   When width and height are not null, the resolution shall correspond to the snapshot designated by the user, with filling rules as follows (left black by default):    
   a. Stretch, if each frame is stretched to fill the entire picture, the transcoded videos will be "flattened" or "drawn out";    
   b. Left black, keep video crown proportion unchanged and fill the remaining margins with the black color;    
   c. Left blank, keep video crown proportion unchanged and fill the remaining margins with the white color;    
   d. Gaussian blur, keep video crown proportion unchanged and apply Gaussian blur treatment to the remaining margins.    
8) [Key Frame or Not], if the snapshot customized by the user is a key frame snapshot. By default, it is the key frame snapshot. 

## Callback Configuration
Media Processing Service supports message subscription completed by a task. If the user needs to obtain the message notification of task implementation result, callback URL can be set in the callback setting and the task execution result will be sent to the user via the URL completed by the user.    
Note: Whether callback is enabled/disabled, only the saved setting can take effect.  
![](https://github.com/jdcloudcom/cn/blob/cn-Media-Processing-Service/image/Media-Processing-Service/mps-%E5%9B%9E%E8%B0%83%E9%85%8D%E7%BD%AE-1.png)
![](https://github.com/jdcloudcom/cn/blob/cn-Media-Processing-Service/image/Media-Processing-Service/mps-%E5%9B%9E%E8%B0%83%E9%85%8D%E7%BD%AE-2.png)
