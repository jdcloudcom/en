## Reading Object
The document is used for development, test and other personnel involved in JD Cloud Live Video SDK. The readers shall have iOS programming and development experiences.
## Running Environment
**Supported Platforms**  
SDK supports iOS 8.0 and above systems and hardware CPU supports ARM64  
**Development Environment**  
SDK compiling environment is Xcode 8.0 and above version and Xcode running environment is OS X 10.10 and above version  
## Version Description  
**Iteration**  
The current version is V1.0.0    

## Rapid Integration  

This section lists one example of basic functions of rapidly-integrated JD Cloud Pushing Streaming SDK. For details, please refer to corresponding files of the demo project.  

**Download Project**   
Please download the iOS pushing streaming SDK & the Player SDK by clicking <a href="https://zhanghao274.s3.cn-north-1.jdcloud-oss.com/SDK/live/jdcloud_live_ios_demo.zip">here</a>  

**Project Directory Structure**  
The project directory of pushing streaming SDK is as follows: including Headers of header files.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%8E%A8%E6%B5%811.png)  
**Configuration Item**  
1. Import SDK manually. Copy dcloud_live_sdk_ios.framework from Demo, and import & drag the same into your Xcode project    
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%8E%A8%E6%B5%812.png)      
2. Delete armv7 and armv7s from Building Setting > Valid Architectures and keep arm64 only.    
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%8E%A8%E6%B5%813.png)      
3. Modify as NO in Building Setting > Enable Bitcode.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%8E%A8%E6%B5%814.png)   
4. Add -all_load in Building Setting > Other Linker Flags.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%8E%A8%E6%B5%815.png)   
5. Add microphone and camera permissions in the Info.plist file, including Privacy - Microphone Usage Description and Privacy - Camera Usage Description.    
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%8E%A8%E6%B5%816.png)   
6. Please adopt cocoapods for newly-created projects (please automatically ignore this configuration if cocoapods are not used). In case of the following errors:  
```
Target 'jdcloud_live_demo' (project 'jdcloud_live_demo') has process command with output   '/Users/pengdandan1/Library/Developer/Xcode/DerivedData/jdcloud_live_demo-fudhfrujrnpeaicbkuwkjszgdbsq/Build/Products/Debug-iphoneos/jdcloud_live_demo.app/Info.plist'
```
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%8E%A8%E6%B5%817.png)   
Solutions:  
The following operations can be made: In Xcode menu bar -> File -> Workspace Setting, modify build system as legacy build system, clean and then compile  
Please refer to the website: https://www.jianshu.com/p/8a8444acdca5  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%8E%A8%E6%B5%818.png)   
