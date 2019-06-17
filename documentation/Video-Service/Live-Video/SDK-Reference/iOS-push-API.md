## Use of SDK  

**Basic Usage Process of Pushing Streaming SDK**  
1. Configure pushing streaming parameters.  
2. Create pushing streaming APIs.  
3. Create pushing streaming preview views.  
4. Start pushing streaming.  
5. Set other functions during pushing streaming.  
6. End pushing streaming.    
Specific usage is introduced in the following steps:  

**1. Configure pushing streaming parameters** 

Among pushing streaming parameters of JDLConfig type, each attribute parameter has a corresponding default value. For default values and parameter ranges, please refer to API documents or annotations. Corresponding attribute values can be modified based on the demands. For real-time modification of any parameter during pushing streaming, please refer to attributes and methods provided by the JDLConfig type.  
Usage:  
Import the header file #import <jdcloud_live_sdk_ios/JDLive.h> in ViewController of the pushing streamer to be used, with example codes as follows:   
```
    //Default initialization configuration method  
JDLConfig* config = [JDLConfig defaultConfig];

//**** Default parameters are provided as below, which can be set or reset ***//
//Source type of collected audio and video  Default camera
config.captureSourceType = JDLCaptureSourceType_Camera;
//Collection resolution  default 720*1280
config.captureResolution = JDLPushResolution720P;
//Pushing streaming resolution  Default 540*960
config.pushResolution = JDLPushResolution540P;
    //Performance mode  Default balance
config.videoPerformanceMode = JDLVideoPerformanceMode_Balance;
    //Live video scenario  Default automatic
config.videoLiveScene = JDLVideoLiveScene_Scene0;
    //Frames per second  Default 15fps
config.fps = 15;
    //Maximum frames per second  Default 15fps
config.fpsMin = 15;
    //Minimum frames per second  Default 15fps
config.fpsMax = 15;
    //Code rate, default 800kbps
config.videoBitrate = 800;
    //Maximum code rate, default 1200kbps
config.videoBitrateMax = 1200;
    //Minimum code rate, default 500kbps
config.videoBitrateMin = 500;
    //Video rotation direction  Default vertical
config.videoOrientation = UIInterfaceOrientationPortrait;
    //maximum reconnection times  Default 3 times
config.maxReconnectCount = 3;
    //Reconnection time interval  Default 1 second
config.reconnectInterval = 1.0;
    //Camera type  Default front camera
config.cameraType = JDLPushCameraTypeFront;
    //Video coding mode  Default automatic
config.videoEncoderMode = JDLPushVideoEncoderMode_AUTO;
    //Audio coding mode  Default AAC_LC
config.audioEncoderMode = JDLPushAudioEncoderMode_AAC_LC;
    //Audio code rate  default 32kbps
config.audioBitrate = 32;
    //Audio sampling rate  default 44100
config.audioSampleRate = 44100;
    //Channel  default single channel
config.audioChannel = JDLPushAudioChannel_1;
    //Key frame interval  Default 3 seconds
config.keyIntervalTime = 3;
//Whether images are involved in preview  Default NO
config.previewMirror = NO;
    //Whether images are involved in pushing streaming  Default NO
config.pushMirror = NO;
    //Only audio is available  Default No
config.audioOnly = NO;
    //Background pushing streaming switch  Default YES
config.isBackgroundPush = YES;
```
**2. Create pushing streaming APIs**

The JDLive type is the core type of pushing streaming SDK and provides functions such as camera preview, pushing streaming callback, pushing streaming control and parameter regulation during pushing streaming.  
Import the header file #import <jdcloud_live_sdk_ios/JDLive.h>   
```
@property (nonatomic, strong) JDLive *live;//Live video pushing streaming APIs.
```  

After pushing streaming parameters are well configured, initWithConfig method of pushing streaming SDK can be used for initialization. The example code is as follows:    
```
self.live = [[JDLive alloc] initWithConfig:config]
```  

**3. Create pushing streaming preview view**    

3.1 Initialization    
After the live object is initialized, the preview operation can be started. Display view for camera preview (inherit from its own UIView) shall be uploaded at the time of preview. The example code is as follows:  
Initialization    
```
@property (nonatomic, strong) UIView *previewView;//Preview view
```
3.2 Add preview view for live APIs    
```
//Start preview
[self.live startPreview:self.previewView]
//Stop preview
[self.live stopPreview];
```                                                                                
**4. Start pushing streaming**  

4.1 Fill in pushing streaming address  
    Fill in the pushing streaming address and the pushing streaming SDK supports pushing streaming address of RTMP. When the pushing streaming is started with the correct pulling streaming address, the pushing streaming test can be made with the player (JD Cloud Player, ffplay, VLC and the like).  
```
[self.live setPushStreamUrl:[NSURL URLWithString:self.pushUrl]];
//Start pushing streaming
[self.live startPushStream];
```  
For other pushing streaming controls, example codes of APIs are as follows:  

```
//Get SDK version number
[self.live getSDKVersion];
//Get pushing streaming address
[self.live getPushStreamUrl];
//Start pushing streaming
[self.live startPushStream];
//Stop pushing streaming
[self.live stopPushStream];
//Search whether the pushing streaming is running or not now
[self.live isPushStreaming];
//Get pushing streaming state
JDLPushStreamState *state = [self.live getPushStreamState];
```

4.2 Register pushing streaming callback
   Import <JDLiveDelegate>	 pushing streaming agent
```
[self.live setLiveDelegate:self];
```
There are five pushing streaming callbacks and the registered delegate can receive corresponding callbacks, with codes as follows:   

```
//Stream state is changed
(void)onPushStreamStateChange:(JDLPushStreamState)pushStreamState;
//Pushing streaming error callback
(void)onPushStreamError:(JDLPushStreamErrorCode)errorCode;
//Network health state is changed
(void)onNetworkStatusChange:(JDLNetworkStateCode)networkStateCode;
//Video recording state is changed
(void)onMediaRecordStateChange:(JDLMediaRecordState)mediaRecordState;
//Pushing streaming mode is changed
(void)onPushStreamModeChange:(JDLPushStreamMode)pushStreamMode; 
```
The example code is as follows: 

```
//Pushing streaming state notification
- (void)updateUIWithPushStreamState:(JDLPushStreamState)state
{
        switch (state) {
            // The state is idle at the time of initialization
            case JDLPushStreamState_Idle：
                  break;
            // Connecting
            case JDLPushStreamState_Connecting:
                  break;
            // Connected
            case JDLPushStreamState_Connected:
                  break;
            // Disconnect connection
            case JDLPushStreamState_Disconnecting:
                   break;
            // Pushing streaming error
            case JDLPushStreamState_Error:
                   break;
            default:
                   break;
    }
}

//Video recording state is changed
- (void)updateUIWithMediaRecordState:(
JDLMediaRecordState)state{
    switch (state) {
           // Initialization status
        case JDLMediaRecordState_Idle:
break;
           //Video recording failed
        case JDLMediaRecordState_Record_Error:
break;
           //Video recording
        case JDLMediaRecordState_Recording:
break;
           //Stop video recording
        case JDLMediaRecordState_Record_Stopped:
            break;
        default:
            break;
    }
}

//Pushing streaming mode is changed
- (void)updateUIWithPushStream
{
    //Current mode
    JDLPushStreamMode mode = [self.context.live getPushStreamMode];
    switch (mode) {
            //Normal pushing streaming
        case JDLPushStreamMode_Normal:
            break;
        //Background image pushing streaming
        case JDLPushStreamMode_Audio:
            break;
        //Audio pushing streaming
        case JDLPushStreamMode_Image_Audio:
            break;
        default:
            break;
    }
}
```
**5. End pushing streaming**  

```
//Stop pushing streaming
[self.live stopPushStream];
```
## More APIs    

Functions can be set during the pushing streaming process, descriptions about settings of APIs are specified in JDLive type and details of interpretation and example code are as follows:  
    
* **Front and rear camera switch**  
The front camera is used by default (this default value can be modified by modifying the configuration item cameraType of JDLConfig), the switch is made once switchCamera is called once and please be sure to initialize live objects before switching the camera.  
```
if ([self.live isCaptureRunning]){
[self.live switchCamera];
}
```
* **ON/OFF of flashlight**  
The flashlight can be turned on for the rear camera only (You can confirm the current camera is a front one or a back one via the cameraType member in JDLConfig)  
```
if([self.live isFlashLightSupported]){
[self.live toggleFlashLight];
 }else{
NSLog (@" If the rear camera is used, the flashlight is available. ")
  }
```
* **Beauty Filter**  
The beauty level can be set for the setVideoBeautyWhiteLevel APIs and the beauty levels include level 0-5. The higher the level, the better the beautifying effects.

```
[self.live setVideoBeautyWhiteLevel:level];
```

Different filtering effects can be set to the setVideoFilterEffectIndex APIs. Now, filters of six different styles are supported by us, ranging from 0-5.  

```
[self.live setVideoFilterEffectIndex:level];
```
* **Mute or not**  
Pushing streaming can be set to be mute or not during the pushing streaming process.  
```
[self.live setAudioStreamMute:YES];
```

* **Screen Shot During Pushing Streaming**  
  Snapshot can be made during pushing streaming, but be sure to take measures to guarantee that one pushing streaming frame can be captured during the pushing streaming process.  
```
JDLPushStreamState pushStatus = [self.live getPushStreamState];
if (pushStatus != JDLPushStreamState_Connected) {
NSLog (@"Please enable the pushing streaming first and then the screen can be captured~")
}
else{  //Snapshot can be made during pushing streaming
[self.live snapshotFromStreamWithCompletion:^(UIImage* img){ 
if (img) {
//Display on window
//Saving photo album
}
}];
}
```

* **Recording Video During Pushing Streaming**  
Local recording can be started by using the startMediaRecord APIs, the recording format is MP4 and deposit path of MP4 files can be specified by recordFilePath.  
```
DLPushStreamState pushStatus = [self.live getPushStreamState];
 if (pushStatus ! = JDLPushStreamState_Connected) {  //Recording cannot be made if the object is not involved in pushing streaming
NSLog[@"Please enable the pushing streaming first and then the recording can be made~"];
}
 else{  //Recording can be made during pushing streaming
               
//Start recording or end control
    JDLMediaRecordState state = [self.live getMediaRecordState];
    if(state != JDLMediaRecordState_Recording){
        NSString * dir = [NSHomeDirectory() stringByAppendingString:@"/Documents/"];
self.recordFilePath = [dir stringByAppendingPathComponent:@"video_record.mp4"];
        [self.live startMediaRecord:[NSURL fileURLWithPath:self.recordFilePath]];
     }
else{
     [self.live stopMediaRecord];
     }
}
```

* **Pure Audio Pushing Streaming**  
If your live scenario is the live audio, you need to update the pushing streaming configuration information. Pure audio pushing streaming can be set with the following codes and pushing streaming can be started. Covers can be set for pure audio pushing streaming.  
```
if([self.live getPushStreamMode] ! = JDLPushStreamMode_Normal){ //It is not the normal pushing streaming, i.e. it is the pure audio pushing streaming
return;
}
//Pop up the notification of setting a cover a not
[[[JDActionController alloc]init] showAlertControllerWithTitle:@"Pure audio pushing streaming" message:@"Whether the cover is set or not?" preferredStyle:UIAlertControllerStyleAlert otherButtonTitles:@[@"No Setting",@"Yes"] superViewController:(UIViewController*)self.context actionControllerBlock:^(NSString *buttonTitle) {
if ([buttonTitle isEqualToString:@"Yes"]){
[SharePhotoManager ShowSheetToSelectedMediaWithInFatherVC:(UIViewController*)self.context FinishPickingMediaBlock:^(UIImage *assetImage, NSURL *assetURL) {
        //With cover pushing streaming
[self.live startBGImagePushStream:assetImage];
        }];
}
else if ([buttonTitle isEqualToString:@"No setting"]){
    [self.live startBGImagePushStream:nil];
}
}];

//Resume pure audio pushing streaming
[self.live resumeNormalPushStream];
```

* **Watermark**  
Watermarks can be added to the live video The watermark types support setting such as images, characters, time and others; images can be uploaded from the local pictures or directly shot, as well as fonts and colors can be set for characters and time; transparency setting is supported; and 360 degree rotation and stretch are also supported. Code examples are as follows:
```
//Import #import "WaterMarkEditView.h"
//Import #import "TextWaterMarkEditView.h"
//Import #import "TimestampWaterMarkEditView.h"
//<UIImagePickerControllerDelegate, WaterMarkEditViewDelegate>

//Image type watermark
WaterMarkEditView *waterMarkEditView = [[PictureWaterMarkEditView alloc] initWithFrame:[self getInitPictureEditViewRect]];
waterMarkEditView.delegate = self;
[self.view addSubview:waterMarkEditView];

//Character type watermark
TextWaterMarkEditView *textWaterMarkEditView = [[TextWaterMarkEditView alloc] initWithFrame:[self getInitTextEditViewRect]];
textWaterMarkEditView.delegate = self;
[textWaterMarkEditView setText:@"Have a try"];
 [textWaterMarkEditView setTextFont:[UIFont systemFontOfSize:14.0]];
 [self.view addSubview:textWaterMarkEditView];

//Time type watermark
TimestampWaterMarkEditView *timestampWaterMarkEditView = [[TimestampWaterMarkEditView alloc] initWithFrame:[self getInitTimeEditViewRect]];
timestampWaterMarkEditView.delegate = self;
[timestampWaterMarkEditView setTextFont:[UIFont systemFontOfSize:14.0]];
    [timestampWaterMarkEditView setTextColor:[UIColor whiteColor]];
    [self.view addSubview:timestampWaterMarkEditView];
```

* **Superimposed UIView**  
In addition to watermarks, any UIView can be superimposed in the stream. Such as the brush.  
Take the brush for example:  
```
@property (nonatomic, assign) int brushLayerId;                       //Brush drawing layer number
@property (nonatomic, strong) BrushView* brushView;                     //Brush pushing streaming View


//Create View
self.brushView = [[BrushView alloc] init];
                [self.brushView setBackgroundColor:[UIColor clearColor]];
                [self.brushView setFrame:_context.previewView.frame];
                [self addSubview:self.brushView];
                [self sendSubviewToBack:self.brushView];
 //Drawing layer number added to view
                self.brushLayerId = [self.live addUIViewWithView:self.brushView rect:CGRectMake(0, 0, 1, 1) rotation:0 alpha:1 rotationMode:kJDLNoRotation];
```

* **Audio Call**  
In case of live video, your favorite local music can be set to be played during the live video, and music files can be gotten from the local iOS media library. APIs called by audios are as follows:  
```
//Start playing the playing background music  audioPath Local music file 
-(void)startBGMusic:(NSString*)audioPath;
//Stop the playing background music
-(void)stopBGMusicWithComplete:(void (^)(void))completion;
//Pause the playing background music
-(void)pauseBGMusic;
//Resume the playing background music
-(void)resumeBGMusic;
//Set playing to complete callback
- (void)setBGMusicFinishBlock:(void (^)(void))block;
//Set playing status to change callback
- (void)setBGMusicStateChangeBlock:(void (^)(void))block;
```

Example codes for use are as follows:  
```
//Loop playback
[self.live setBGMusicFinishBlock:^(){
if(self.strMusicUrl && ![ self.strMusicUrl isEqualToString:@""]){
     [self.live startBGMusic:self.strMusicUrl];
   }
}];

//Add background music and the local file path is the url
if(self.strMusicUrl && ![ self.strMusicUrl isEqualToString:@""]){
    [self.live startBGMusic: self.strMusicUrl];
 }else{
    //Stop
 [self.live stopBGMusicWithComplete:^(){
}
```  

* **Audio Tone Rising and Falling**  
setAudioEffectCustomFlag can customize audio tone rising and falling effect types in the live video process and the type is 0-7.
```
[self.live setAudioEffectCustomFlag:level];
```

* **Audio Mixing**  
In the pushing streaming process, background audio mixing is supported, mixing of background music and audio track of microphone is supported and appropriate regulation can be made to the audio mixing at the same time.  
```
// track 1 background music
[self.live setAudioMixEnable:YES withTrackId:1];
 [self.live setAudioMixVolume:translucentValue withTrackId:1];

// track 0: microphone
[self.live setAudioMixEnable:YES withTrackId:0];
[self.live setAudioMixVolume:translucentValue withTrackId:0];
```    
* **Voice Change**  
During live video, voices can be processed. The voice change types include middle-aged man, Lolita, robot, grave and the like, and the voice change function can be disabled.  
```
//Set audio voice change effect type
//type 0 disabled (default) 1 Middle-aged man  2 Lolita  3 Grand  4 Robot
[self.live setAudioEffectType:type];
``` 

* **Pushing Streaming of Image**  
Set images. There are two image-related APIs, including the setPushStreamHFlip pushing streaming image and the setPreviewHFlip preview image. The setPushStreamHFlip setting is only valid for the playing pictures, while the setPreviewHFlip is only valid for the preview pictures. The two APIs do not affect each other
```
//Preview view images
[self.live setPreviewHFlip:isOn];
//Pushing streaming images
[self.live setPushStreamHFlip:isOn];
```

* **Audio Noise Reduction**  
During live video, surrounding noise can be treated to guarantee that the streamer’s voice is clearer. Range of parameter processed: 1-4, default 0: Disable noise reduction.  
```
[self.live setAudioNoiseHandleParam:isOn?3:0];
```

* **Automatic focusing**   
Click the screen and then automatic focusing is made according the focusing coordination where the finger touches.   
```
//Automatic zooming of camera
[self.live setCaptureFocusPoint:point];
//Automatic exposure of camera
[self.live setCaptureExposureAtPoint:point];
```  

* **Pushing streaming of floating window**   
The floating window pushing streaming refers to that the pushing streaming preview size is changed without destroying the former pushing streaming page. The floating window is added on the window and can appear in any ViewController.  
```
self.isNeedFloatPush = isOn;
if(self.isNeedFloatPush){
 FloatPushStreamView* floatView = [[FloatPushStreamView alloc] initWithContext:self.context];
    [floatView showInWindow];
}
```  

* **In-ear monitor**  
It means that when the streamer sings with the earphone in the ear, the streamer’s voice shall be fed back in real time. This is because the streamer’s voice is transmitted to the ear via the head skeleton (the solid), while the voice heard by the audience is finally transmitted to the ear via the air medium. Voices heard via the two methods are very different. Therefore, the streamer needs to hear the audience effect. The example code is as follows:
```
if([self.live isHeadsetPlugIn]){
     [self.live setAudioFoldbackEnable:isOn];
}
else{
     NSLog[@"Please insert your earphone at first." ];
}
``` 

* **Rotation lock**   
During the pushing streaming process, if you do not want to change the live video direction when turning the screen, you can lock the screen rotation. In such case, the live video pushing streaming is vertical in any case.  
```
self.isOrientationLock = isOn;
//Treat screen rotation 
 [self.live setVideoPushStreamOrientation:(UIInterfaceOrientation)deviceOrientation]；
```

