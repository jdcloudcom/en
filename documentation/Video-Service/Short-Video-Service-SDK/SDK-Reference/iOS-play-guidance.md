## Reading Object
The document is used for development, test and other personnel involved in JD Cloud Live Video SDK. The readers shall have iOS programming and development experiences.
## Running Environment
**Supported Platforms**  
SDK supports iOS 8.0 and above systems
Hardware CPU supports arm64, arm7 and arm7s  
**Development Environment**  
SDK compiling environment is Xcode 8.0 and above version and Xcode running environment is OS X 10.10 and above version  

## Version Description  
**Iteration**  
The current version is V1.0.0    

## Rapid Integration  
This section lists one example of basic functions of rapidly-integrated JD Cloud Player SDK.  
For details, please refer to corresponding files of the demo project.  
**Download Project**   
Please download the iOS pushing streaming SDK & the Player SDK by clicking <a href="https://sdk-publish.oss.cn-north-1.jcloudcs.com/sdk/jdcloud_streamer_ios.zip"></a>  
**Project Directory Structure**   
The project directory of pushing streaming SDK is as follows: including Headers of header files.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%92%AD%E6%94%BE1.png)  
**Configuration Item**  
1. Import SDK manually. Copy JDCloudPlayerFramework.framework from Demo, and import & drag the same into your Xcode project    
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%92%AD%E6%94%BE2.png)      
2. Delete armv7 and armv7s from Building Setting > Valid Architectures and keep arm64 only.    
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%92%AD%E6%94%BE3.png)      
3. Modify as NO in Building Setting > Enable Bitcode.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%92%AD%E6%94%BE4.png)   
4. Add -all_load in Building Setting > Other Linker Flags.  
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%92%AD%E6%94%BE5.png)   
5. Where the newly-created project has the following errors:  
```
dyld: Library not loaded: @rpath/JDCloudPlayerFramework.framework/JDCloudPlayerFramework
  Referenced from: /var/containers/Bundle/Application/5429BB4B-DD9C-4240-9F0F-F64B4EFCE50F/JDCloud_IOS_Player_Test_Demo.app/JDCloud_IOS_Player_Test_Demo
  Reason: image not found
```
Solutions: Set a dynamic repository    
![](https://github.com/jdcloudcom/cn/blob/cn-Live-Video/image/live-video/ios%E6%92%AD%E6%94%BE6.png)   

