## Reading Object
This document is used for development, test and other personnel involved in JD Cloud Web/H5 Player SDK. The readers shall have Javascript programming and development experiences.  

## Version Description
* **Iteration**  
The current version is V1.0.0  

## Supported Platform, Protocol and Format
1. Chrome, Firefox, IE11/Edge, Safari and other mainstream browsers are supported;  
2. Multiple encapsulation formats of video are supported, e.g. MP4, FLV, M3U8, etc.;  
3. Multiple play protocols are supported:
<table>
<tr>
    <td>Video Protocol</td>
    <td>Purpose</td>
    <td>URL Address Format</td>
    <td>Web</td>
    <td>H5</td>
</tr>
<tr>
    <td>HLS（M3U8）</td>
    <td>Applicable to Live Video</td>
    <td>http ://xxx.live.myjdcloud.com/xxx.m3u8</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>HLS（M3U8）</td>
    <td>Applicable to VOD</td>
    <td>http ://xxx.vod.myjdcloud.com/xxx.m3u8</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>FLV</td>
    <td>Applicable to Live Video</td>
    <td>http ://xxx.live.myjdcloud.com/xxx.flv</td>
    <td>√</td>
    <td>×</td>
</tr>
<tr>
    <td>FLV</td>
    <td>Applicable to VOD</td>
    <td>http ://xxx.vod.myjdcloud.com/xxx.flv</td>
    <td>√</td>
    <td>×</td>
</tr>
<tr>
    <td>RTMP</td>
    <td>Only applicable to Live Video</td>
    <td>rtmp://xxx.live.myjdcloud.com/live/xxx</td>
    <td>√</td>
    <td>×</td>
</tr>
<tr>
    <td>MP4</td>
    <td>Only applicable to VOD</td>
    <td>http ://xxx.vod.myjdcloud.com/xxx.mp4</td>
    <td>√</td>
    <td>√</td>
</tr>                
</table>

Note:  
1) Videos playing RTMP format must enable Flash. The current browser disables Flash by default, so users need to manually enable it;  
2) When using flv.js + JDplayer.js to execute cross-origin video play, you need to conduct the cross-origin configuration in the cross-origin configuration file under the server root domain and configure Request Header and Respones Header as per the following descriptions;  
Request Header Configuration:
```
Access-Control-Request-Headers: range
Access-Control-Request-Method: GET
```
The play server must allow OPTIONS request and open the Range back-to-origin setting of the play server.    
Video server Response Header Configuration:
```
Access-Control-Allow-Origin: <your-origin> | *
Access-Control-Allow-Methods: GET, OPTIONS
Access-Control-Allow-Headers: range
Access-Control-Expose-Headers: Content-Length
```  
3) In cross-origin resource sharing of HLS(M3U8), you also need to conduct the cross-origin configuration in the cross-origin configuration file under the server root domain and Access-Control-Allow-Origin: *;
4) There are two solutions to play FLV in PC browser:  
A. By the end of December 2020, because current browsers and Adobe which develops Flash controls still use the Flash control which supports plenty of video source formats and has good compatibility, users who need to be compatible with lower versions of IE browsers can use the Flash control to play FLV, which is compatible with Chrome, FireFox, Safari 10, IE8 and above and Edge. When playing flv in this way, you need to manually enable the Flash plug-in in the browser and not to show the play rate menu;  
B. If you don't consider the compatibility with lower versions of IE browsers, you can use flv.js+JDplayer.js to play FLV. With HTML5 technology [Media Source Extensions](https://w3c.github.io/media-source/), even though the Flash control is not supported by the browser, you can also play FLV, which is compatible with Chrome, FireFox, IE11 and Edge. Because H5 technology is used in this way, when playing flv, you can show the play rate menu.

## Initialization Parameter
Two parameters shall be input to initialize the player. The first one is the player container ID (i.e. ID on the video tag; this ID name can be customized, for example:
```
<video id="player-video-id"></video>
```
), the second one is the function parameter object.
```
var player = JDplayer('player-video-id', options);
```
1. options Parameter List
Parameters can be configured by options objects:
<table>
<tr>
    <td>Name</td>
    <td>Type</td>
    <td>Default</td>
    <td>Description</td>
</tr>
<tr>
    <td>width</td>
    <td>String/Number</td>
    <td>None</td>
    <td>Player region width, unit pixel, set by demand, player size can be controlled through CSS.</td>
</tr>
<tr>
    <td>height</td>
    <td>String/Number</td>
    <td>None</td>
    <td>Player region height, unit pixel, set by demand, player size can be controlled through CSS.</td>
</tr>
<tr>
    <td>controls</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display control field of player or not, optional values include "false" and "true".</td>
</tr>
<tr>
    <td>poster</td>
    <td>String</td>
    <td>None</td>
    <td>Set the complete address url for the cover image. Note: The cover function may be invalid under some mobile play environments because the mobile video play environment is relatively complex and the Webview of browsers and Apps can be implemented for H5 video in different ways. If any invalidity, please contact us (contact number: 4006151212).</td>
</tr>
<tr>
    <td>autoplay</td>
    <td>Boolean</td>
    <td>false</td>
    <td>Automatically play or not, optional values include "false" and "true". Because there is a system limit for mobile, for most categories, setting true will be invalid.</td>
</tr>
<tr>
    <td>playbackRates</td>
    <td>Array</td>
    <td>[0.5，1，1.5，2]</td>
    <td>For the multiplier option of setting variable-speed play, only HTML5 play mode will be valid.</td>
</tr>
<tr>
    <td>loop</td>
    <td>Boolean</td>
    <td>false</td>
    <td>Loop Playback or not, optional values include "false" and "true".</td>
</tr>
<tr>
    <td>muted</td>
    <td>Boolean</td>
    <td>false</td>
    <td>Loop Playback or not, optional values include "false" and "true".</td>
</tr>
<tr>
    <td>preload</td>
    <td>String</td>
    <td>auto</td>
    <td>Pre-loading or not, optional values include "auto", "metadata" and "none". Due to system limitation, the setting of auto on the mobile terminal is invalid.</td>
</tr>
<tr>
    <td>bigPlayButton</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display the centered display button or not (the hijacked display button in a browser cannot be removed).</td>
</tr>
<tr>
    <td>controlBar</td>
    <td>Object</td>
    <td>None</td>
    <td>Parameter set for setting the attribute of control field. The details will be introduced in the following.</td>
</tr>
<tr>
    <td>aspectRatio</td>
    <td>String</td>
    <td>None</td>
    <td>Set a player in a smooth patter and use this value when calculating the dynamic size of the player. The value should represent a ratio - two figures divided by a colon (such as "16:9" or "4:3").</td>
</tr>
<tr>
    <td>fluid</td>
    <td>Boolean</td>
    <td>false</td>
    <td>Self-adaption according to the container size.</td>
</tr>
<tr>
    <td>sources</td>
    <td>Array</td>
    <td>None</td>
    <td>        
[
        
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{   

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;type: 'video/mp4', // Many types are supported here: basic video format, live broadcast, streaming media, etc.   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;src: 'http ://xxx.vod.myjdcloud.com/xxx55.mp4' // url address   

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;},

...

{

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;type: 'video/flv',   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;src: 'http ://xxx.vod.myjdcloud.com/xxx66.flv' // url address

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}

]

Configure the media source to be displayed, type - media type src - media source</td>
</tr>
<tr>
    <td>resolutions</td>
    <td>Array</td>
    <td>None</td>
    <td>        
[
        
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{   

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; type: 'video/mp4', // Many types are supported here: basic video format, live broadcast, streaming media, etc.      
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;src: 'http ://xxx.vod.myjdcloud.com/xxx-sd.mp4', // url address   
resolution: 'Standard Definition', //Customized definition name

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;},

...

{

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;type: 'video/mp4',   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;src: 'http ://xxx.vod.myjdcloud.com/xxx-hd.mp4',   
resolution: 'High Definition'

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}

]

Users configure the definition to be displayed and switched based on their needs, type - media type src - media source address resolution - customized definition name</td>
</tr>                
</table>

2. List of controlBar Parameters    
controlBar parameters can configure the features of the control field of a player, and the supported attributes include:
<table>
<tr>
    <td>Name</td>
    <td>Type</td>
    <td>Default</td>
    <td>Description</td>
</tr>
<tr>
    <td>currentTimeDisplay</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display the current time of the video or not, the optional values include "false" and "true".</td>
</tr>
<tr>
    <td>durationDisplay</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display the video duration or not, the optional values include "false" and "true".</td>
</tr>
<tr>
    <td>fullscreenToggle</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display the full-screen button or not, the optional values include "false" and "true".</td>
</tr>
<tr>
    <td>playbackRateMenuButton</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display the play-rate selection button, the optional values include "false" and "true".</td>
</tr>
<tr>
    <td>playToggle</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display the toggle button for play and pause, the optional values include "false" and "true".</td>
</tr>
<tr>
    <td>progressControl</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display the progress bar or not, the optional values include "false" and "true".</td>
</tr>
<tr>
    <td>remainingTimeDisplay</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display the remaining time to be displayed, the optional values include "false" and "true".</td>
</tr>
<tr>
    <td>timeDivider</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display the time divider or not, the optional values include "false" and "true".</td>
</tr>
<tr>
    <td>volumePanel</td>
    <td>Boolean</td>
    <td>true</td>
    <td>Display the volume control or not, the optional values include "false" and "true".</td>
</tr>                
</table>

Note:   
Setting items of ‘currentTimeDisplay’, ‘timeDivider’ and ‘durationDisplay’ related to display progress bar. When ‘progressControl’ is set as true, the setting of true or false to the aforementioned three items may be invalid.

## Object Method
A list of methods for an initialization player to return to its object:
<table>
<tr>
    <td>Name</td>
    <td>Parameter and Type</td>
    <td>Return Value and Type</td>
    <td>Description</td>
</tr>
<tr>
    <td>ready(function)</td>
    <td>(Function)</td>
    <td>None</td>
    <td>Set callback after player initialization is completed.</td>
</tr>
<tr>
    <td>play()</td>
    <td>None</td>
    <td>None</td>
    <td>Play and resume play</td>
</tr>
<tr>
    <td>pause()</td>
    <td>None</td>
    <td>None</td>
    <td>Pause playing.</td>
</tr>
<tr>
    <td>currentTime(seconds)</td>
    <td>(Number)</td>
    <td>(Number)</td>
    <td>Acquire the current play time point, or set the play time point, and the time point cannot exceed the video duration.</td>
</tr>
<tr>
    <td>duration()</td>
    <td>None</td>
    <td>(Number)</td>
    <td>Acquire video duration.</td>
</tr>
<tr>
    <td>volume(percent)</td>
    <td>(Number)[0, 1][Optional]</td>
    <td>(Number)/No return when setting</td>
    <td>Acquire or set player volume.</td>
</tr>
<tr>
    <td>poster(src)</td>
    <td>(String)</td>
    <td>(String)/No return when setting</td>
    <td>Acquire or set player cover.</td>
</tr>
<tr>
    <td>requestFullscreen()</td>
    <td>None</td>
    <td>None</td>
    <td>Enter into full-screen mode.</td>
</tr>
<tr>
    <td>exitFullscreen()</td>
    <td>None</td>
    <td>None</td>
    <td>Exit full-screen mode.</td>
</tr>
<tr>
    <td>isFullscreen()</td>
    <td>None</td>
    <td>Boolean</td>
    <td>Return to full-screen mode or not.</td>
</tr>
<tr>
    <td>on(type，listerner)</td>
    <td>(String, Function)</td>
    <td>None</td>
    <td>Event Listening.</td>
</tr>
<tr>
    <td>one(type，listerner)	</td>
    <td>(String, Function)</td>
    <td>None</td>
    <td>For event listening, incident handling function can be executed once at most.</td>
</tr>
<tr>
    <td>off(type，listerner)</td>
    <td>(String, Function)</td>
    <td>None</td>
    <td>Disassociate event listening.</td>
</tr>
<tr>
    <td>buffered()</td>
    <td>None</td>
    <td>TimeRanges</td>
    <td>Return to video buffering range.</td>
</tr>
<tr>
    <td>bufferedPercent()</td>
    <td>None</td>
    <td>Value range [0, 1]</td>
    <td>The percentage of the return buffering length from the video length.</td>
</tr>
<tr>
    <td>width()</td>
    <td>(Number)[Optional]</td>
    <td>(Number)/No return when setting</td>
    <td>Acquire or set the width of player region, which is invalid if the player size is set through CSS.</td>
</tr>
<tr>
    <td>height()</td>
    <td>(Number)[Optional]</td>
    <td>(Number)/No return when setting</td>
    <td>Acquire or set the height of player region, which is invalid if the player size is set through CSS.</td>
</tr>
<tr>
    <td>videoWidth()</td>
    <td>None</td>
    <td>(Number)</td>
    <td>Acquire the width of video resolution.</td>
</tr>
<tr>
    <td>videoHeight()</td>
    <td>None</td>
    <td>(Number)</td>
    <td>Acquire the height of video resolution.</td>
</tr>
<tr>
    <td>dispose()</td>
    <td>None</td>
    <td>None</td>
    <td>Destroy the player.</td>
</tr>                
</table>

Note:   
Object method cannot be called synchronously. It can be called only after appropriate events (such as loadedmetadata) being triggered, except ready, on, one, and off.

## Event
The player can perform event listening by initializing the object returned, for example:
```
 var player = JDplayer('player-video-id', options);  
  // player.on(type, function(){
  // Processing
 // });
 player.on('error', function(error) {
   // Processing
 });
 ```
 
 Wherein type means event type, and the supported events include:
 <table>
<tr>
    <td>Name</td>
    <td>Introduction</td>
</tr>
<tr>
    <td>play</td>
    <td>After starting playing, either the play() method is called or autuplay is set to true and triggered when it takes effect, the paused attribute shall be set to false.</td>
</tr>
<tr>
    <td>playing</td>
    <td>Triggered when the play is resumed after being paused or stopped due to buffering, the paused attribute shall be set to false. Usually, this event is used to mark the video actually played while the play event is just to start playing and the frame does not start rendering.</td>
</tr>
<tr>
    <td>loadstart</td>
    <td>Triggered when starts loading data.</td>
</tr>
<tr>
    <td>durationchange</td>
    <td>Triggered when the length data of the video changes.</td>
</tr>
<tr>
    <td>loadedmetadata</td>
    <td>Loaded video metadata.</td>
</tr>
<tr>
    <td>loadeddata</td>
    <td>When the data of the current frame is loaded but there is no enough data to play the next frame of the video, the event will be triggered.</td>
</tr>
<tr>
    <td>progress</td>
    <td>Triggered when the media data is acquired.</td>
</tr>
<tr>
    <td>canplay</td>
    <td>Triggered when the player is able to start playing video.</td>
</tr>
<tr>
    <td>canplaythrough</td>
    <td>Triggered when the player is expected to be able to continuously play the specified video without stopping for buffering.</td>
</tr>
<tr>
    <td>error</td>
    <td>Triggered when there is video play error caused.</td>
</tr>
<tr>
    <td>pause</td>
    <td>Triggered upon suspension.</td>
</tr>
<tr>
    <td>ratechange</td>
    <td>Triggered when play rate changes.</td>
</tr>
<tr>
    <td>seeked</td>
    <td>Triggered when the search for the specified video location stops.</td>
</tr>
<tr>
    <td>seeking</td>
    <td>Triggered when the search for the specified video location starts.</td>
</tr>
<tr>
    <td>timeupdate</td>
    <td>The change of the current play location changes can be interpreted as the change of the Location currentTime.</td>
</tr>
<tr>
    <td>volumechange</td>
    <td>Triggered when the volume is set or the muted attribute value changes.</td>
</tr>
<tr>
    <td>waiting</td>
    <td>Triggered when the play stops and the content of the next frame is unavailable.</td>
</tr>
<tr>
    <td>ended</td>
    <td>Triggered when the video has finished playing. Now, the currentTime is equivalent to the maximum value of media resources.</td>
</tr>
<tr>
    <td>fullscreenchange</td>
    <td>Triggered when switching to full-screen status.</td>
</tr>                
</table>

## Error Code
When the player triggers an error event, the listen function returns the error codes, in which the error code with more than 3 digits is the error codes of the media data API. Error Code List:
 <table>
<tr>
    <td>Name</td>
    <td>Description</td>
</tr>
<tr>
    <td>0 - MEDIA_ERR_CUSTOM</td>
    <td>User Error</td>
</tr>
<tr>
    <td>1 - MEDIA_ERR_ABORTED</td>
    <td>You aborted the media playback (Video data is interrupted during loading)             

Possible Reasons:

* Network interruption.   
* Browser interruption for exceptions.  

Solutions:  

* View the network request information of the browser console to ensure the network request is normal or not. 
* Rerun the play process.</td>
</tr>
<tr>
    <td>2 - MEDIA_ERR_NETWORK</td>
    <td>A network error caused the media download to fail part-way (The video failed to load due to a network problem).

Possible Reason: network interruption.

Solutions:
* View the network request information of the browser console to ensure the network request is normal or not.
* Rerun the play process.</td>
</tr>
<tr>
    <td>3 - MEDIA_ERR_DECODE</td>
    <td>The media playback was aborted due to a corruption problem or because the media used features your browser did not support (An error occurred while decoding the video).

Possible Reason: Video data exception or decoder decoding failure.

Solutions:
* Try to retranscode and play again to eliminate problems introduced by transcoding process.
* Verify that the original video is normal.</td>
</tr>
<tr>
    <td>4 - MEDIA_ERR_SRC_NOT_SUPPORTED</td>
    <td>The media could not be loaded, either because the server or network failed or because the format is not supported (The video could not be loaded, either because the format is not supported or the server or network failed).

Possible Reasons:
* The video data cannot be obtained, and the CDN resource is absent or does not return the video data.
* The video format is not supported to be played in the current play environment.

Solutions:
* View the network request information of the browser console to ensure the video data is normal or not.
* Verify that the play script for the corresponding video format is loaded as per the usage document.
* Verify that the current browser and page environment support the video format to be played.</td>
</tr>
<tr>
    <td>5 - MEDIA_ERR_ENCRYPTED</td>
    <td>The media is encrypted and we do not have the keys to decrypt it (An error occurred while decrypting the video).

Possible Reasons:
* The key pair used for decryption is incorrect.
* The request key pair API returns an exception.
* The video decryption function is not supported in the current play environment.

Solutions:
* Verify that the key pair is correct and whether the key pair API returns normally.</td>
</tr>                
</table>
