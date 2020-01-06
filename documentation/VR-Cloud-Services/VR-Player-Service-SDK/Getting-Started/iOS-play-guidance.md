## Reading Object
This document is used for development, test and other personnel involved in JD Cloud VR video player SDK. The readers shall have iOS programming and development experiences.
## Running Environment
**Supported Platforms**  
SDK supports iOS 8.0 and above systems
Hardware CPU supports arm64  
**Development Environment**  
SDK compiling environment Xcode 8.0 and above version   
Xcode running environment OS X 10.10 and above version

## Version Description  
**Iteration**  
The current version is 1.0.0, a basic version.    

## Rapid Integration  
This section lists one example of basic functions of rapidly-integrated JD Cloud VR video player SDK. 
For details, please refer to corresponding files of the demo project.  
**Download Project**   
For iOS VR Player SDK, please<a href="https://zhanghao274.s3.cn-north-1.jdcloud-oss.com/VR/iOS/VR-SDK-1.2.zip">click to download</a>  
**Project Directory Structure**   
The project directory of pushing streaming SDK is as follows: including header files headers and lib.  
![](https://github.com/jdcloudcom/cn/blob/cn-VR-Cloud-Services/image/VR-Cloud-Services/VR%E6%92%AD%E6%94%BE%E5%99%A8SDK-iOS1.png)  
**Configuration Item**  
1. Import SDK manually. Copy VRLibrary from Demo, and import and drag the same into your Xcode project    
![](https://github.com/jdcloudcom/cn/blob/cn-VR-Cloud-Services/image/VR-Cloud-Services/VR%E6%92%AD%E6%94%BE%E5%99%A8SDK-iOS2.png)      
2. Delete armv7 and armv7s from Building Setting > Valid Architectures and keep arm64 only.    
![](https://github.com/jdcloudcom/cn/blob/cn-VR-Cloud-Services/image/VR-Cloud-Services/VR%E6%92%AD%E6%94%BE%E5%99%A8SDK-iOS3.png)      
3. Modify as NO in Building Setting > Enable Bitcode.  
![](https://github.com/jdcloudcom/cn/blob/cn-VR-Cloud-Services/image/VR-Cloud-Services/VR%E6%92%AD%E6%94%BE%E5%99%A8SDK-iOS4.png)   
4. Add -all_load in Building Setting > Other Linker Flags.  
![](https://github.com/jdcloudcom/cn/blob/cn-VR-Cloud-Services/image/VR-Cloud-Services/VR%E6%92%AD%E6%94%BE%E5%99%A8SDK-iOS5.png)   
