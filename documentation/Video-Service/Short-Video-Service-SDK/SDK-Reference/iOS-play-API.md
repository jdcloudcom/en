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
//Whether to enable the multi-rate network self-adaption or not
 self.jdCloudPlayer.adaptivePlayback = YES;
//Whether the pure audio is playing or not
self.jdCloudPlayer.isOnlyAudio = YES;
//Whether it is an image or not
self.jdCloudPlayer.isMirrorPlay = YES;
//Whether it is played at background or not
self.jdCloudPlayer.isPlayOnBackGroud = YES;
//Zoom Mode  Default Filling
self.jdCloudPlayer.scalingMode = JDCloudScalingModeAspectFit;
```  
**3. Add current View in the video playing page**    
```
[self insertSubview:self.jdCloudPlayer.playerView atIndex:0];
```                                                                                
**4. Set video playing URL**  
Fill in the playing addresses and the Player SDK supports formats such as RMVB, AVI, MKV, MP4 and MOV.
```
//Prepare to play and set URL for the first time
[self.jdCloudPlayer setVideoWithURL:url withPlayerOption:model];
//Reset URL
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
//Status is changed during playing process
- (void)vodPlayer:(JDCloudPlayer *)vodPlayer onEventCallback:(JDCloudPlayerEvent)event；

//Callback information with errors during playing
- (void)vodPlayer:(JDCloudPlayer *)vodPlayer playBackErrorModel:(JDCloudPlayerVideoErrorModel *)errorModel; 
```  

The example code is as follows:
```
//Status is changed during playing process
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

//Display the popLayer interface according to error information
- (void)showPopLayerWithErrorModel:
(JDCloudPlayerVideoErrorModel *)errorModel{
switch (errorModel.errorCode) {
// Unknown Error
      case 0:
// Where the network timeout reminder (to be defined in the file) is given, the user can click **Replay** for replaying.      The network is poor now. Please wait for a second and click **Replay
      case 4008:
      // Where there is any video loading error reminder, please click **Replay**.   If there is any video loading error, please click **Replay
      case 4005:
       // Server return error
        default:
            break;
    }
}
```  
**7. End of Playing**  
After end of playing, it only needs to change playing status of the player as stop  
```
//Stop playing
[self.jdCloudPlayer stop];
```  

## More APIs    

Functions can be set during the playing process, descriptions about settings of APIs are specified in JDCloudPlayer type and details of interpretation and example code are as follows: 
    
* **Various Player Controls**  
Control interfaces of the player are provided with basic functions such as play, stop, pause, resume play, replay and Seek. However, the function Seek is only valid for VOD.  
```
//Play
[self.jdCloudPlayer play];
//Stop, call after playing
[self.jdCloudPlayer stop];
//Pause
[self.jdCloudPlayer pause];
//Resume playing after pause
[self.jdCloudPlayer resume];
//Replay videos from the last url address
[self.jdCloudPlayer replay];
//Redirect to the video picture of specified time, in second
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
        case 302: {   //Full Screen 
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
    /*! High Definition*/
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
        case 301:{ //High Definition 
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
//Current playing time
NSTimeInterval currentTime = self.jdCloudPlayer.currentPlayerTime
//Total Time
NSTimeInterval durationTime = self.jdCloudPlayer.duration
 //Compute current playing progress
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
//Volume space of initialization system  Volume setting
self.volumeView = [[MPVolumeView alloc] init];
self.systemVolume = self.volumeSlider.value;
//Brightness Control
[UIScreen mainScreen].brightness += 0.01;
```  
* **URL Playing Video**  
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

//Capture and output gif
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
//Take URL of current playing video
NSString *playUrl = [self.cacheSingleton getProxyUrl:self.playUrl.absoluteString];
//Pre-download
[self.cacheSingleton preDownload:playerUrlStr];
```  
* **Log**   
Where statuses are changed during playing process, different playing statues and playing information shall be gotten as logs.  
```
//Status is changed during playing process
- (void)updateVodPlayViewDataWithEvent:(JDCloudPlayerEvent)event vodPlayer:(JDCloudPlayer *)vodPlayer 
```  

