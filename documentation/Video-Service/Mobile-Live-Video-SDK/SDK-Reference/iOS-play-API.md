## Use of SDK  

**Basic Usage Process of Pushing Streaming SDK**   

1. Create a player APIs  
2. Initialize player default parameters  
3. Add the player view on an intended interface  
4. Set video playing URL  
5. Prepare to play  
6. Register a player agent and receiving the playing status   
Specific usage is introduced in the following steps:  

**1. Create a player APIs** 

The JDCloudPlayer type is the core type of Player SDK and provides player functions such as start, pause, replay, seek and the like.
Import the header file #import < JDCloudPlayerFramework
/JDCloudPlayer.h >      
```
  @property (nonatomic, strong) JDCloudPlayer *jdCloudPlayer;    
```
Initialize an underlayer player. The example code is as follows:
```
self.jdCloudPlayer = [[JDCloudPlayer alloc]init];
```  
**2. Initialize player default parameters**  
Among default parameters of JDCloudOptionModel player type, each attribute parameter has a corresponding default value. For default values and parameter ranges, please refer to attributes and methods of JDCloudOptionModel type.
Initialize default system parameters and set the same before playing.  
```
JDCloudOptionModel *model = [[JDCloudOptionModel alloc] init];
```
Other playing parameters can be set both before and after playing and the interface example codes are as follows:  
```
// Whether to open multi-rate network adaptive
 self.jdCloudPlayer.adaptivePlayback = YES;
// Whether pure audio playback
self.jdCloudPlayer.isOnlyAudio = YES;
// Whether to mirror
self.jdCloudPlayer.isMirrorPlay = YES;
// Whether to play in the background
self.jdCloudPlayer.isPlayOnBackGroud = YES;
//Zoom mode Default padding
self.jdCloudPlayer.scalingMode = JDCloudScalingModeAspectFit;
```  
**3. Add current View in the video playing page**    
```
[self insertSubview:self.jdCloudPlayer.playerView atIndex:0];
```                                                                                
**4. Set video playing URL**  
Fill in the playing addresses and the Player SDK supports formats such as RMVB, AVI, MKV, MP4 and MOV.
```
// The first time you are ready to play, set the URL
[self.jdCloudPlayer setVideoWithURL:url withPlayerOption:model];
// Reset the URL
[self.jdCloudPlayer resetWithUrl:url withPlayerOption:model];
```  
**5. Prepare to play**  
```
 [self.jdCloudPlayer prepareToPlay];
 ```  
**6. Register a player agent event**  
Import <JDCloudPlayerDelegate> player callback agent
```
 self.jdCloudPlayer.delegate = self;
 ```         
 There are two player callbacks and the registered delegate can receive corresponding callbacks, with codes as follows:
```
//The status changes during playback
- (void)vodPlayer:(JDCloudPlayer *)vodPlayer onEventCallback:(JDCloudPlayerEvent)event；

//An error callback message occurred during playback
- (void)vodPlayer:(JDCloudPlayer *)vodPlayer playBackErrorModel:(JDCloudPlayerVideoErrorModel *)errorModel; 
```  

The example code is as follows:
```
//The status changes during playback
- (void)updateVodPlayViewDataWithEvent:
(JDCloudPlayerEvent)event vodPlayer:(JDCloudPlayer *)vodPlayer{
    switch (event) {
/*! Get ready*/
    case  JDCloudPlayerEventPrepareDone = 0,
    /*! Start playing*/
    case  JDCloudPlayerEventPlay,
    /*! Video forward*/
    case  JDCloudSeekVideoStart,
    /*! Audio forward*/
    case  JDCloudSeekAudioStart,
    /*! The first frame loaded*/
    case  JDCloudPlayerEventFirstFrame,
    /*! Pause playing*/
    case  JDCloudPlayerEventPause,
    /*! Stop playing*/
    case  JDCloudPlayerEventStop,
    /*! End of playing*/
    case  JDCloudPlayerEventFinish,
    /*! Start to load video data*/
    case  JDCloudPlayerEventBeginLoading,
    /*! Video resources loaded*/
    case  JDCloudPlayerEventEndLoading,
    /*! Redirected*/
    case  JDCloudPlayerEventSeekDone,
    /*! Playing interrupted*/
    case  JDCloudPlayerEventInterrupted,
    /*! Redirect forward*/
    case  JDCloudPlayerEventSeekingForward,
    /*! Redirect backward*/
    case  JDCloudPlayerEventSeekingBackward
    }
}

// According to the error message, show the popLayer interface
- (void)showPopLayerWithErrorModel:
(JDCloudPlayerVideoErrorModel *)errorModel{
switch (errorModel.errorCode) {
// unknown issue
      case 0:
// When the network times out to remind (the copy can be defined), the user can click to replay. The current network is not good, please click replay later.
      case 4008:
      // Reminder when the video loads incorrectly, click to reload. Video loading error, please click to replay
      case 4005:
       // The server returns an error condition
        default:
            break;
    }
}
```  
**7. End of playing**  
After end of playing, it only needs to change playing status of the player as stop  
```
//Stop play
[self.jdCloudPlayer stop];
```  

## More APIs    

Functions can be set during the playing process, descriptions about settings of APIs are specified in JDCloudPlayer type and details of interpretation and example code are as follows: 
    
* **Various Player Controls**  
Control interfaces of the player are provided with basic functions such as play, stop, pause, resume play, replay and Seek. However, the function Seek is only valid for VOD.  
```
//play
[self.jdCloudPlayer play];
// Stop, call after starting playback
[self.jdCloudPlayer stop];
//time out
[self.jdCloudPlayer pause];
// resume playback after pause
[self.jdCloudPlayer resume];
// Replay the last url address video
[self.jdCloudPlayer replay];
// Jump to the video screen at the specified time point, seconds
[self.aliPlayer seekToTime:1.5];
```  
* **Zoom Mode**    
The video picture filling mode can provide effects such as clipping, filling and full screen; the current mode can be set/obtained via the scalingMode attribute, and settings made before or during playing are both effective  
```
typedef NS_ENUM(NSInteger, JDCloudScalingMode) {
    /*! Scale remains unchanged*/
    JDCloudScalingModeNone,
    /*! Filling  Unifying the scale until matching a width and height condition*/
    JDCloudScalingModeAspectFit,
    /*! Clipping  Unifying the scale until the space within borders is completely filled with pictures. Contents within width or height range can be clipped*/
    JDCloudScalingModeAspectFill,
    /*! Full screen  The scale is not unified and the pictures in the regions with the matched width and height may be stretched*/
    JDCloudScalingModeFill
};
```  

Code examples:
```
switch (button.tag) {
        case 300:{   //Filling
            self.jdCloudPlayer.scalingMode = JDCloudScalingModeAspectFit;
        }
            break;
        case 301:{ //Clipping 
            self.jdCloudPlayer.scalingMode = JDCloudScalingModeAspectFill;
        }
            break;
        case 302: {   //Full screen 
            self.jdCloudPlayer.scalingMode = JDCloudScalingModeFill;
        }
            break;
```  

* **Multiple-speed playing**  
Multiple-speed playing can be set after the player is created or during playing. However, such setting is available for the VOD, and 0.5~2 multiple-speed playing is supported.  
```
self.jdCloudPlayer.playRate = 0.5;    
 ```     
* **Definition Switch**  
Definition can be set after the player is created or during playing. Definition set is available for VOD only, and high definition, super definition and standard definition are supported.  
```
typedef NS_ENUM(NSInteger, JDCloudPlayerClaritType) {
    /*! Smooth*/
    JDCloudMPMovieClaritTypeSD,
    /*! Standard definition*/
    JDCloudMPMovieClaritTypeCIF,
    /*! High definition*/
    JDCloudMPMovieClaritTypeHD,
};
```  
Code examples:
```  
switch (button.tag) {
        case 300:{   //Super definition
            self.infoModel.claritType = JDCloudMPMovieClaritTypeHD
        }
            break;
        case 301:{ //High definition 
            self.context.infoModel.claritType = JDCloudMPMovieClaritTypeCIF;
        }
            break;
        case 302: {   //Standard definition
            self.context.infoModel.claritType = JDCloudMPMovieClaritTypeSD;
        }
            break;
```  
* **Playing progress and time**  
Current time and total playing time, as displayed in the player, can be gotten after quasi waves are successfully played.   
Example Code:  
```
//current play time
NSTimeInterval currentTime = self.jdCloudPlayer.currentPlayerTime
// total length
NSTimeInterval durationTime = self.jdCloudPlayer.duration
 // Calculate the current playback progress
 Float progress = currentTime / durationTime;
```  
* **Image Playing**  
With the image function, the playing pictures can be turned over leftward and rightward. Example Code:  
```
self.jdCloudPlayer.isMirrorPlay = YES;
```  
* **Background Playing**  
When the user clicks **home**, the player will continuously read data and play audios in the background. After APP returns to the foreground, the audio will be continuously played.  
Setting can be made by referring to the picture below: Turn on Target-Capabilities-Background Modes and select Audio, AirPlay and Picture in Picture.   
![ios播放7.png](../../../../image/live-video/ios播放7.png)
* **Pure Audio Playing**  
Pictures output can be set during the playing process. Once this attribute is set as YES, the video will not be rendered anymore in the underlayer. Such setting can be made both before and after playing.  
```
self.jdCloudPlayer.isOnlyAudio = YES;
```  
* **Snapshot pictures playing now**  
Obtain images played at the current time of the player.  
```
UIImage *image = [self.jdCloudPlayer thumbnailImageAtCurrentTime];
```  
* **Volume and brightness control (system) during playing process of the player**   
```
// Initialize the system volume space Set the volume
self.volumeView = [[MPVolumeView alloc] init];
self.systemVolume = self.volumeSlider.value;
// brightness control
[UIScreen mainScreen].brightness += 0.01;
```  
* **URL playing video**  
Reset the player URL.  
```
if (self.jdCloudPlayer && self.jdCloudPlayer.playerView) {
        [self resetPlayWithUrl:self.playUrl];
 }
```  
* **Capture gif and small videos**  
When capturing gif and small videos, please download videos to the local file folder first and then select start time and end time of the video to be captured.  
```
/* 
* Capture small videos
* videoPath  Local download destination of videos
  destPath   Local destination address of small video
  width       Width of short video
  start       Start time
  end         End time
  recordVideoFinished  Callback finished
/
+ (void) recordVideo: (NSString*)videoPath
            destPath: (NSString*)destPath
          imageWidth: (NSInteger)width
           startTime: (NSInteger)start
             endTime: (NSInteger)end
            progress: (JDCloudProgressBlock)blockrecordVideoFinished:(JDCloudRecordVideoFinishedBlock)recordVideoFinished

// intercept the generated gif
+ (void) recordGif: (NSString*)videoPath
          destPath: (NSString*)destPath
             width: (NSInteger)width
               fps: (CGFloat)frames
          duration: (NSInteger)duration
         startTime: (NSInteger)startTime
          progress: (JDCloudProgressBlock)block
 recordGifFinished:(JDCloudRecordGifFinishedBlock)recordGifFinished
```  
* **Playing-and-buffering function**  
The playing-and-buffering function refers to that when a video is successfully played, the file will be buffered in the local file folder, and the local cache file will be directly played when the video is played again, making no network request.  
```
// Take the current play video URL
NSString *playUrl = [self.cacheSingleton getProxyUrl:self.playUrl.absoluteString];
//Pre-download
[self.cacheSingleton preDownload:playerUrlStr];
```  
* **Log**   
Where statuses are changed during playing process, different playing statues and playing information shall be gotten as logs.  
```
//The status changes during playback
- (void)updateVodPlayViewDataWithEvent:(JDCloudPlayerEvent)event vodPlayer:(JDCloudPlayer *)vodPlayer 
```  

