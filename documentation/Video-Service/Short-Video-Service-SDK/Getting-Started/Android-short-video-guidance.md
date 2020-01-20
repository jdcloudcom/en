## Reading Object
This document is used for development, test and other personnel involved in JD Cloud Short Video SDK. The readers shall have Android programming and development experiences, and it would be better if readers have the ability of reading wiki.  

## Running Environment
•	The minimum supported version is Android 5.0 (API level 21)
•	CPU architectures supported include: arm64-v8a, armeabi-v7a and x86

## Version Description
* **Iteration**  
The current version is 1.0.0, a basic version.  

* **Architecture**  
Following architectures are supported by the current Short Video SDK:
armeabi-v7a
arm64-v8a
x86
To save apk size, please integrate the Version armeabi-v7a only if there is no special reason.
If the Version armeabi-v7a is integrated only, the ARMv5 ARMv6 device cannot be run. If the two devices are required to be fitted for APP, the Version armebi shall be additional integrated. 

## Rapid Integration
This section lists one example of basic functions of rapidly-integrated JD Cloud Short Video SDK.

* **Get SDK and DEMO**  
For Android Short Video SDK, please <a href="https://zhanghao274.s3.cn-north-1.jdcloud-oss.com/shortvideo/lib.zip">click to download</a><br/>  

* **Project Directory Structure**  
demo: Example Project and Use Presentation of Main Interface Functions of the SDK
libs: All Repository Files Necessary for SDK Integration
jniLibs/[armeabi-v7a|arm64-v8a|x86]: so Repository of Each Platform
libs/jdc_live.jar，libs/jdcloudplayerjar，libs/jdc_sv.jar: SDK jar Package 

* **Configuration Item**    
Import to a target repository, importing repository files under the libs directory to a target project and add dependence.
The following configuration method can be referred (taking Android Studio as an example):
1) Import SDK
Manual Integration:
copy the libs directory to libs of a target project;
copy the jniLibs directory to src\main\jniLibs of a target project;

2) Modify proguard (confusion) files and the addition rules are as follows:
```
-keep class com.jdcloud.media.** {
  *;
}
```

3) Apply for corresponding permissions in the file AndroidManifest.xml
```
<!-- Usage rights -->
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
<uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.READ_PHONE_SINTERNETWIFI_STATE" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.CAMERA" />
<uses-permission android:name="android.permission.RECORD_AUDIO" />
<uses-permission android:name="android.permission.FLASHLIGHT" />
<uses-permission android:name="android.permission.VIBRATE" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.MODIFY_AUDIO_SETTINGS" />
<uses-permission android:name="android.permission.WAKE_LOCK" />
<!-- Hardware feature-->
<uses-feature android:name="android.hardware.camera" />
<uses-feature android:name="android.hardware.camera.autofocus" />
```

4) copy all folders under the directory demo assets to the assets directory of the target project.
