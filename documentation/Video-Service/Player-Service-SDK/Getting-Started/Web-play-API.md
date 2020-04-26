## Connection Policy
### Step1. Web preparations  
Introduce an initialization script to the page (PC or H5) where a video is to be played.
```
<script src="https://j.jdcloud.com/video/player/1.0.0/libs/jdplayer.min.js"></script>;
```
Note:  
If it cannot be directly debugged with a local web, the Web player is unable to process the cross-origin issue under this circumstance.

### Step2. Place a container in HTML
Add a player container to the location of the page where a video is to be displayed. That is to place a div and name it, e.g. id_video_container, and the video picture will be rendered in the container. You can use the attributes of the div to control the size of the container. The example code is as below:
```
 <div id="id_video_container" style="width:100%; height:auto;">
<video id="my-video" class="jdplayer"></video>

 </div> 
 ```
### Step3. Connect to Video Playing
Write Javascript codes. This is to pull the audio and video streaming in the designated URL address and present the video picture to the added container.
#### 3.1 Easy Playing
One of the URL addresses in live format is as below, which uses the HLS (M3U8) protocol. If the streamer is on live, you can watch it by directly opening this URL with such players as VLC:
```
http://www.live.myjdcloud.com/xxx.m3u8 // m3u8 Play Address
```

If you need to play the video with this URL on the mobile phone browser, the Javascript codes are as below:
```
var player = JDplayer('my_video', {
sources: [
 {
 src: 'http://www.live.myjdcloud.com/xxx.m3u8', // Please replace it to the actually available play address
type: 'application/x-mpegURL' // For the type of video resources, see Table 1.1. When the media resource expanded name is not at the end of the address, this item must be configured; if not, it can be omitted

 }
]
autoplay : true,      // The safari browser under iOS and most of the mobile browsers are not open to video automatic play
poster : 'http://www.test.com/myimage.jpg',
width :  '480', // For video display width, you are advised to use video resolution width. When the video is required to adapt to the width by itself according to the container, you can set the fluid attribute. This item is not set
height :  '320', // For video display height, you are advised to use video resolution height. When the video is required to adapt to the height by itself according to the container, you can set the fluid attribute. This item is not set
fluid :  true // Video size is of self-adaption according to the container
});
```

This code can support playing live video of HLS (M3U8) protocol on PC and Mobile phone browsers. Although HLS (M3U8) protocol is well compatible with video, it is still not supported by some Android mobile phones. There is high delay for about more than 20 seconds.

#### 3.2 Lower Delay on PC
PC browser supports Flash and its Javascript code is as below:
```
var player = JDplayer('my_video', {
sources: [
 {
 src: 'http://www.live.myjdcloud.com/xxx.flv', // Please replace it to the actually available play address
type: 'video/flv' // For the type of video resources, see Table 1.1. When the media resource expanded name is not at the end of the address, this item must be configured; if not, it can be omitted

 }
]
autoplay : true,      // The safari browser under iOS and most of the mobile browsers are not open to video automatic play
poster : 'http://www.test.com/myimage.jpg',
width :  '480', // For video display width, you are advised to use video resolution width. When the video is required to adapt to the width by itself according to the container, you can set the fluid attribute. This item is not set
height :  '320', // For video display height, you are advised to use video resolution height. When the video is required to adapt to the height by itself according to the container, you can set the fluid attribute. This item is not set
fluid :  true // Video size is of self-adaption according to the container
});
```

FLV play address is added in this code. When the live streaming is played with the Player on PC, if output can be implemented via FLV, RTMP and HLS (M3U8), we recommend using FLV or RTMP links to realize lower delay.

Table 1.1 Common Video Types
<table>
<tr>
    <td>Encapsulation Format</td>
    <td>Type</td>
</tr>
<tr>
    <td>MP4</td>
    <td>video/mp4</td>
</tr>
<tr>
    <td>M3U8</td>
    <td>application/x-mpegURL</td>
</tr>
<tr>
    <td>FLV</td>
    <td>video/flv or video/x-flv</td>
</tr>                
</table>

Table 1.2 RTMP Protocol Type
<table>
<tr>
    <td>Encapsulation Format</td>
    <td>Type</td>
</tr>
<tr>
    <td>MP4</td>
    <td>rtmp/mp4</td>
</tr>
<tr>
    <td>FLV</td>
    <td>rtmp/flv</td>
</tr>                
</table>
Note: When the media resource expanded name is at the end of the link address, the type attribute can be omitted.

### Step4. Support Multiple Definitions
#### 4.1 Principle Introduction
The Web player supports multiple definitions as shown in the following figure:
![播放器多清晰度.png](https://github.com/jdcloudcom/cn/blob/cn-Player-Service-SDK/image/Player-Service-SDK/web播放器1.png)

The player itself cannot change the video definition. The video source has only one definition, which is called original definition. There are many coding formats and encapsulation formats for videos of original definition, but not all video formats can be played on Web. For example, for VOD, H.264 is the video code; MP4 and FLV are videos of encapsulation format.

#### 4.2 Code Implementation
The code implementation supported by multiple definitions are as shown below:
```
var player = JDplayer('my_video', {
resolutions: [
 {
 src: 'http://www.vod.myjdcloud.com/xxx-sd.flv', // Please replace it to the actually available play address
type: 'video/flv', // For the type of video resources, see Table 1.1. When the media resource expanded name is not at the end of the address, this item must be configured; if not, it can be omitted

 resolution: 'Standard Definition'
 },
{
 src: 'http://www.vod.myjdcloud.com/xxx-hd.mp4', 
 type: 'video/mp4',  
 resolution: 'High Definition'
 },
{
 src: 'http://www.vod.myjdcloud.com/xxx-fhd.m3u8', 
 type: 'application/x-mpegURL',  
 resolution: 'Super Definition'
 }
]
autoplay : true,      // The safari browser under iOS and most of the mobile browsers are not open to video automatic play
poster : 'http://www.test.com/myimage.jpg',
width :  '480', // For video display width, you are advised to use video resolution width. When the video is required to adapt to the width by itself according to the container, you can set the fluid attribute. This item is not set
height :  '320', // For video display height, you are advised to use video resolution height. When the video is required to adapt to the height by itself according to the container, you can set the fluid attribute. This item is not set
fluid :  true // Video size is of self-adaption according to the container
});
```

#### 4.3 Implementation Case
The setting and switching functions of multiple resolutions are used. The on-line example is as follows. You can right click [View Web Source Code] in the PC browser to view the web code implementation: <a href="https://j.jdcloud.com/video/player/index.html">Resolution Implementation</a>

Under normal circumstances, you will see the effect as follows:
![播放器多分辨率.png](https://github.com/jdcloudcom/cn/blob/cn-Player-Service-SDK/image/Player-Service-SDK/web%E6%92%AD%E6%94%BE%E5%99%A82.png)

Note:
* The PC currently supports the play and switch functions of multiple resolutions but the mobile does not support.  
* The above example link is only used for document presentation. Please don't use it for production environment.
