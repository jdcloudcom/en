## Reading Object
The document is used for development, test and other personnel involved in JD Cloud Live Video SDK. The readers shall have Android programming and development experiences.  

## Running Environment
•	The minimum supported version is Android 5.0 (API level 21)  
•	CPU architectures supported include: arm64-v8a, armeabi-v7a and x86

## Version Description
* **Iteration**  
The current version is V1.0.0  

* **Architecture**  
Following architectures are supported by the current player SDK:
armeabi-v7a
arm64-v8a
x86
To save apk size, please integrate the Version armeabi-v7a only if there is no special reason.
If the Version armeabi-v7a is integrated only, the ARMv5 ARMv6 device cannot be run. If the two devices are required to be fitted for APP, the Version armebi shall be additional integrated. 

## Rapid Integration
This section lists one example of basic functions of rapidly-integrated JD Cloud Player SDK.

* **Get SDK**  
Please download the Android pushing streaming SDK and the Player SDK by clicking <a href="https://sdk-publish.oss.cn-north-1.jcloudcs.com/sdk/jdcloud_streamer_android.zip"></a><br/>  

* **Project Directory Structure**  
demo: Example Project and Use Presentation of Main Interface Functions of the SDK    
libs: All Library Files Necessary for SDK Integration    
jniLibs/[armeabi-v7a|arm64-v8a|x86]: so Library of Each Platform    
libs/jdc_live.jar: SDK jar Package    

* **Configuration Item**    
Import to a target library, importing library files under the libs directory to a target project and add dependence.
The following configuration method can be referred (taking Android Studio as an example):  
1) Import SDK
Manual Integration:
copy the libs directory to libs of a target project;
copy the jniLibs directory to src\main\jniLibs of a target project;

2) Modify proguard (confusion) files and the addition rules are as follows:
```
-keep class com.jdcloud.media.player.** {
  *;
}
```

3) Apply for corresponding permissions in the file AndroidManifest.xml
```
<!-- permission -->
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.WAKE_LOCK" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
```
