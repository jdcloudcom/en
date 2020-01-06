## Use of SDK  
The basic use process of VR video player SDK is as below:  
1. Configure VR video play configuration management object.  
2. Initialize VR video play manager by setting the configuration management object.   
3. Switch videos and enable fisheye mode or not by VR video play manager.  
 
**Configure VR video play management object** 

For configuring VR video play of JDCloudVRConfiguration type, each function parameter has a corresponding default value. For default values and parameter ranges, please refer to API documents or annotations. Corresponding functions can be called based on the demands to modify the corresponding functions. Objects of JDCloudVRConfiguration type provide types of initialized VR video play management. After VR video play management type is initialized, calling again corresponding functions of JDCloudVRConfiguration objects are not supported.

Usage:   
Import the header file #import"JDCloudVRLibrary.h" in ViewController requiring VR play video, with example codes as follows:    
```
//Generate JDCloudVRConfiguration instance object
JDCloudVRConfiguration *config = [[JDCloudVRConfiguration alloc] init];

//** Default values are provided for the following setting of interactive mode, play mode and whether to accept gesture, so the setting can be ignored **//
//If the player is an instance object of JDCloudPlayer, call asVideoWithIJKSDLGLView: the function shall be set the playerView of JDCloudPlayer player object as video source,
//If the player is an instance object of AVPlayer, call asVideo: the function shall take corresponding playerItem as parameter.

[config asVideoWithIJKSDLGLView:self.jdCloudPlayer.playerView];

//Set ViewController and View under playerView of the player object
[config setContainer:self.mySuperController view:self.mySuperView];

//Set VR video play mode as display mode, and ordinary mode by default
[config displayMode:JDCloudModeDisplayGlass];

//Set VR video interactive mode as simultaneous gesture and mobile interaction, and simultaneous gesture interaction
[config interactiveMode:JDCloudModeInteractiveMotionWithTouch];

//Set VR video supporting gesture, and not support gesture by default
[config pinchEnabled:true];  
```

**Initialize VR video play manager by setting the configuration management object.**  

As JDCloudVRLibrary type belongs to VR video play management type, enable and disable the fisheye functions by switching VR videos.  
Import the header file #import"JDCloudVRLibrary.h" 
```
@property (nonatomic, strong) JDCloudVRLibrary *vrLibrary;//vr video play management API type.
```
After VR video play configuration object is configured, users can use initWithConfiguration of JDCloudVRLibrary type in VR video player SDK for initialization. The example code is as follows:
```
self.vrLibrary = [[JDCloudVRLibrary alloc] initWithConfiguration:config];
```  
**Switch videos and enable fisheye mode or not by VR video play manager**   

When enabling or disabling fisheye play by clicking corresponding switch, users can use setAntiDistortionEnabled of JDCloudVRLibrary type for enabling or disabling. The example code is as follows:
```
[self.vrLibrary setAntiDistortionEnabled:isAntiDistortion];
```                                                                                
