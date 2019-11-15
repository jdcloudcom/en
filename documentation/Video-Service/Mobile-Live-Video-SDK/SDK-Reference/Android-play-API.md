## Examples of Easy Playing

1. Create a Player:  
The core type of Player SDK is JDCloudPlayer and the core view provided is JDCloudVideoView. JDCloudVideoView can realize functions such as start, pause, replay and seek, meeting demands of basic player functions. The view can also be realized by virtual of JDCloudPlayer. Codes created are as follows:  
```
JDCloudVideoView  mJDCloudVideoView =new JDCloudVideoView(context);
```
2. Listening Setting:  
Listening to which the player is well prepared:
```  
mJDCloudVideoView.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() {
@Override
public void onPrepared(IMediaPlayer iMediaPlayer) {
//do something
}});
```  
Listening to which the video is completely played:
```
mJDCloudVideoView. setOnCompletionListener (new IMediaPlayer. OnCompletionListener () {
@Override
public void onCompletion (IMediaPlayer iMediaPlayer) {
// playback is complete, the player can be released
		if(mJDCloudVideoView!= null) {
			mJDCloudVideoView.pause ();
			mJDCloudVideoView.release(false);
		}
}});
```  
Listening with Information Collected:
```
mJDCloudVideoView.setOnInfoListener(new IMediaPlayer.OnInfoListener(){
@Override
Public Boolean onInfo(IMediaPlayer iMediaPlayer,int i,int infoIndex){
//i is the message type, stored in the constant of the IMediaPlayer class starting with MEDIA_INFO
return true;
}})
```  
Listening with Errors:
```
mJDCloudVideoView.setOnErrorListener(new IMediaPlayer.OnErrorListener(){
@Override
public boolean onError(IMediaPlayer iMediaPlayer,int i,int errorIndex) {
//i is the message type, stored in the constant of the IMediaPlayer class starting with MEDIA_ERROR
 return true;
}});
```  
3. Set video playing addresses and formats such as RMVB, AVI, MKV, MP4, MOV and the like are supported.
```
mJDCloudVideoView.setVideoPath(videoUrl);
mJDCloudVideoView.start();//Play for the first time
jdcVideoView.switchDataSource(videoURL);//Please start to play by calling start and then switch videos.
```  
4. For pause, the paused audio/video can be played again with start().
```
if(mJDCloudVideoView!=null) mJDCloudVideoView.pause();
```  
5. Different to pause, the playing address will be cleared after playing.
```
mJDCloudVideoView.stopPlayback();
```  
6. After playing is completed, the player can be released
```
 if (mJDCloudVideoView!= null) {
            mJDCloudVideoView.release(false);
            mJDCloudVideoView = null;
        }
```  
## More APIs

* **Various Player Controls**  
Control interfaces of the player are provided with basic functions such as play, pause, resume play and Seek. However, the function Seek is invalid for live video.  
```
//Pause playback
mJDCloudVideoView.pause();
// Start playback, resume playback after pause
mJDCloudVideoView.start();
// Jump to the video screen at the specified time, in seconds
mJDCloudVideoView.seekTo(position);
```
* **Zoom Mode**  
The video picture displaying mode can provide effects such as clipping, filling and full screen; the playing mode can be set via setScalingMode and such setting is both effective before or during playing.  
Three playing modes are as follows:  

  IRenderView.SCALING_MODE_ASPECT_FIT   
  Filling: On the premise that all video pictures are displayed, align the video center to the center of mJDCloudVideoView, zoom in or out video pictures in equal proportion until video width and height completely match width and height of mJDCloudVideoView.  
  The effect is the same as that where the value of the scaleType attribute of ImageView is fitCenter.  

  IRenderView.SCALING_MODE_ASPECT_FILL    
  Clipping: To fill in the entire mJDCloudVideoView, please align the video center to the center of mJDCloudVideoView and zoom in the original picture in equal proportion until mJDCloudVideoView is completely filled (mJDCloudVideoView shall be completely filled in the width and height direction). Parts of the video outside the range of mJDCloudVideoView shall be clipped.  
  The effect is the same as that where the value of the scaleType attribute of ImageView is centerCrop.  

  IRenderView.SCALING_MODE_MATCH_PARENT  
  Full screen: In the region where width and height of a video picture completely matches the mJDCloudVideoView setting, pictures may be stretched  

* **Multiple-speed playing**  
Multiple-speed playing can be set after the player is created or during playing. However, such setting is not available for the live video, and 0.5~2 multiple-speed playing is supported.  
```
mJDCloudVideoView.setSpeed(speedLevel); 
```
* **Get playing progress and time**  
Current time and total playing time, as displayed in the player, can be gotten after the playing preparation is well made.  
Example Code:    
```
// Get the current playback time, in milliseconds
int mPosition=mJDCloudVideoView.getCurrentPosition()
// total length, unit: milliseconds
int mDuration=mJDCloudVideoView.getDuration()
```
* **Image Playing**  
With the image function, the playing pictures can be turned over leftward and rightward, with example codes as follows:  
```
mJDCloudVideoView.setMirror(true);
```
* **Background Playing**  
When the background playing is enabled and the user clicks **home**, the player will continuously read data and play audios in the background. After APP returns to the foreground, the audio will be continuously played.  
```
mJDCloudVideoView.enterBackground();
```
* **Pure Audio Playing**  
Pictures output can be set during the playing process. Once this attribute is set, the video will not be rendered anymore in the underlayer. Such setting can be made both before and after playing.  
```
mJDCloudVideoView.setVisibility(View.INVISIBLE)
```
* **Snapshot During Playing**  
Obtain images played at the current time of the played video:   
```
Bitmap bmp=mJDCloudVideoView.takeSnapShot()
```
* **Capture small gif videos**  
Methods necessary for capturing gif motion graphics are encapsulated by the JDCloudVideoTool tool type,  
getSnapShotSequence():Get image sequence in specified time period of specified video,  
recordVideo():Record videos within specified time period,  
recordGif():Output gif motion graphics according to the video and specified time period,  
Note: The specified time period shall be within the total hour of the video.  
The three methods are static. For specific parameters, please refer to sdk instructions.  

* **Playing-and-buffering function**  
The playing-and-buffering function refers to that when a video is successfully played, the file will be buffered in the local file folder, and the local cache file will be directly played when the video is played again, making no network request.   
Create cache:  
JDCloudVideoCache  cache=new JDCloudVideoCache(cachePath);  
During the entire APP period, the cache can be created once only and the single instance mode can be adopted.  
JDCloudVideoCache cache=DemoApplication.getCache(mContext)；  
When the video is playing, the playing address can be obtained in cache:  
String proxyUrl = cache.getProxyUrl(videoURL);  
mJDCloudVideoView.setVideoPath(proxyUrl);  

* **Log**  
Where statuses are changed during playing process, different playing statues and playing information shall be gotten as logs. Once the IMediaPlayer.OnInfoListener listening is set, messages of different types can be gotten, and the setting methods are as follows:  
mJDCloudVideoView.setOnInfoListener();  
