# Practices for Peripheral Vision Detection

At present, IP camera device service and object detection application provided by IoT Edge can be used to quickly establish edge intelligent vision business.

## Preconditions

- JD Cloud account registration is done and real-name verification is completed. If you have no accounts, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud%26ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), or make [Real-name Verification](https://uc.jdcloud.com/account/certify).
- IoT Core service instance has been created to create a network camera product and register the camera device under the product.
- The edge node has been created and activated, and the IP camera device service and object detection application have been deployed.
- Please ensure your edge node has enough space for local storage. **Note: The one-way camera produces video files of about 2.2GB per hour at 1280x720 resolutions. Please ensure your local hard disk has enough space. The system clears it up at 2am every day.**

## IP Webcam Device Access

1. The camera and edge node shall be kept in the same LAN.
2. Enter the current edge node details page, and click **Child Device Management** -> add a child device The camera shall be added to the edge node.
3. Click **Message Router** -> add message router. Create a message router, and take the newly added camera as the message source and the object detection application as the target end.

## Enable the camera and run the object detection application

1. Click child device management tab to update the camera device shadow.

   ![边缘节点详情-更新影子](../../../../image/IoT/IoT-Edge/UpdateSubDeviceShadow.png)

   streaming shall be set to on (open the camera)

   Other initial values can be maintained.

2. Click the update shadow of the object detection application. According to the actual demand, fill in the relevant parameter value, and then update the shadow.

   ![边缘节点详情-应用影子配置](../../../../image/IoT/IoT-Edge/UpdateAppShadow.png)
   
| Parameter              | Description                 | Enter Description                                                     |
| ----------------- | -------------------- | ------------------------------------------------------------ |
| detectHardware    | Detect hardware             | When default value of the hardware resource that the current application depends on for detection is: 0:CPU. <br>0:CPU only uses CPU for calculation<br>2:HDDL only uses HDDL for calculation<br>20:HDDLCPU preferentially uses HDDL for calculation and CPU for auxiliary calculation.|
| targetLabels      | Detection Target             | Fill in the name of the expected detection target. The maximum number of Labels is 10. Please fill in [] if it is set to null. In the case of null, the corresponding detection results will be outputted according to the maximum detection number and the confidence coefficient set. The fill-in method is ["label1","label2","label3"] Reference example ["person","cup","Bicycle"]. For the default target name of the object detection application, please refer to [Label File](../../../../image/IoT/IoT-Edge/objectLabel.txt).|
| recordVideoSwitch | Detect the target, and record a video | ON/OFF. Default value is ON. The video is saved both in the local storage and the cloud OSS. **Note: The one-way camera produces video files of about 2.2GB per hour at 1280x720 resolutions. Please ensure your local hard disk has enough space. The system clears it up at 2am every day. ** |
| duration          | The video duration recorded         | Unit: second, type: integral, input range: 5~30, and the step size is 1. Default value is: 10 |
| modelName         | Detection model name         | Fill in the file name of AI model used by the object detection application, and no file extension is allowed. The maximum length of names inputted is: 256 characters. The built-in model file of object detection application is: vgg_coco_ssd_300x300_openvino_FP16 |
| maxResults        | Maximum number of objects detected     | Type: integral, input range: 1~10, step size: 1. Single frame image corresponds with the number of target results of multiple detections. Default value is 3. |
| threshold         | Threshold value of confidence coefficient           | Type: floating-point, input range: 0.01~0.99, step size: 0.01. When the object detection application detects that the confidence coefficient of the target is greater than or equal to the set value, the detection result will be outputted. Default value is: 0.9. |

3. Click the edge application tab to enable the object detection application.

## View object detection results

1. Log in [JD Cloud Console](https://console.jdcloud.com/overview).

2. You can view the detection results of the current application under the OSS Bucket directory created for storing edge computing results.

   Result files include:

   ​		Image file: the corresponding image file pic_20191105140035.jpg of the target is detected

   ​		Text file: Information of detection results includes the detected object label, confidence coefficient and coordinate position in the image, for example: pic_20191105140035.txt. File format is as follows:
```
{"lable":"mouse","score":0.56487995,"left":227,"right":347,"top":289,"bottom":411}
```
   ​		Video file: if the setting of enabling video is set in the object detection application shadow, the video will be continuously recorded for a period of time (the time shall be configured according to the application shadow parameter duration, and the video is 10 seconds by default) after the target is detected. For example: video_20191105140045.mp4 

   
    
## Related References

- [Manage Edge Application](../Operation-Guide/Edge-App.md)
- [Manage Child Device](../Operation-Guide/SubDevice.md)
- [Manage Message Router](../Operation-Guide/MsgRouter.md)

