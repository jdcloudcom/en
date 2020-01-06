## Reading Object
This document is used for development, test and other personnel involved in JD Cloud VR Player SDK. The readers shall have Android programming and development experiences.  

## Running Environment
•	The minimum supported version is Android 5.0 (API level 21)  

## Version Description
* **Iteration**  
The current version is 1.0.0, a basic version.  

## Rapid Integration
This section lists one example of basic functions of rapidly-integrated JD Cloud Player SDK.

* **Get SDK and demo**  
For Android VR Player SDK, please<a href="https://zhanghao274.s3.cn-north-1.jdcloud-oss.com/VR/Android/jdcvrplayer.jar">click to download</a><br/>  

* **Project Directory Structure**  
demo: Example Project and Use Presentation of Main Interface Functions of the SDK   
libs: Library Files Necessary for SDK Integration   
libs/jdcvrplayer.jar: SDK jar Package  
 

* **Configuration Item**    
After the player SDK is configured, import the library file jdcvrplayer.jar under the libs directory to a target project and add dependence.   
The following configuration method can be referred (taking Android Studio as an example):   
1) Import SDK  
Manual Integration:   
copy the libs directory to libs of a target project;   
2) Modify proguard (confusion) files and the addition rules are as follows:
```
-keep class com.jdcloud.vrlib.** {
  *;
}
```   
  3) Apply for corresponding permissions in the file AndroidManifest.xml   
  After the permission required for integration player is added, additional permission will be unnecessary.
