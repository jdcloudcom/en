## Reading Object
The document is used for development, test and other personnel involved in JD Cloud Live Video SDK. The readers shall have Android programming and development experiences.  

## Running Environment
•	The minimum supported version is Android 5.0 (API level 21)  
•	CPU architectures supported include: arm64-v8a, armeabi-v7a and x86  
Requirements and relevant restrictions for Android system version by the software and hardware encoding part   
<table>
<tr>
    <td>Function</td>
    <td>Software Encoding</td>
    <td>Hardware Encoding</td>
    <td>Software Encoding Compatible Mode</td>
</tr>
<tr>
    <td>Basic Pushing Streaming</td>
    <td>5.0(21)</td>
    <td>5.0(21)</td>
    <td>5.0(21)</td>
</tr>
<tr>
    <td>Network Self-adaption</td>
    <td>5.0(21)</td>
    <td>5.0(21)</td>
    <td>5.0(21)</td>
</tr>
 <tr>
    <td>Built-in beauty filter</td>
    <td>All</td>
    <td>All</td>
    <td>Denoise Only</td>
</tr> 
</table>  

## Version Description
* **Iteration**  
The current version is V1.0.0  

* **Architecture**  
Following architectures are supported by the current pushing streaming JDCloud_Live Android SDK:
armeabi-v7a
arm64-v8a
x86
To save apk size, please integrate the Version armeabi-v7a only if there is no special reason.   
If the Version armeabi-v7a is integrated only, the ARMv5 ARMv6 device cannot be run. If the two devices are required to be fitted for APP, the Version armebi shall be additional integrated.  
The ARMv5 ARMv6 device has poor computing performance. Therefore, JD Cloud does not guarantee the live video experience of a chip device. It is recommended that the live video APP shall not be equipped with the two chip devices.  

## Fast Integration
This section lists one example of basic functions of rapidly-integrated JD Cloud Pushing Streaming SDK.

* **Get SDK**  
Please download the Android pushing streaming SDK and the Player SDK by clicking <a href="https://zhanghao274.s3.cn-north-1.jdcloud-oss.com/SDK/live/jdcloud_live_android_demo.zip">Here</a><br/>  

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
  -keep class com.jdcloud.media.live.** {
    *;
  } 
  ```

  3) Apply for corresponding permissions in the file AndroidManifest.xml
  ```
  <!-- 使用权限 -->
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
  <!-- 硬件特性 -->
  <uses-feature android:name="android.hardware.camera" />
  <uses-feature android:name="android.hardware.camera.autofocus" />  
  ```

  4) Copy all files under the directory demo assets to the assets directory of the target project.  

