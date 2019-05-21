## Create Rich Media SMS<br> 

After logging in the Rich Media SMS Service, you need to firstly create the application. <br><br>
![创建应用](../../../../image/Cloud-Communication/Rich-Media-SMS/rms-003.png)<br><br>
After creating the application, click to choose **SMS Content** on the SMS signature TAB page as shown in the following figure<br><br>
![创建应用](../../../../image/Cloud-Communication/Rich-Media-SMS/rms-008.png)<br><br>
Click **Create SMS Content** to enter the page for creating the content of Rich Media SMS.<br><br>
![短信内容创建](../../../../image/Cloud-Communication/Rich-Media-SMS/rms-009.png)<br><br>
SMS Subject: <br>
As for the subject content displayed when the mobile phone user receives Rich Media SMS, the subject must begin with [Signature], for instance:<br>
[JD Cloud] customizes the Short Message Service for you<br><br>
SMS Description: <br>
The SMS description won’t appear on the SMS of a mobile phone user, but are only used as an enterprise memorandum. <br><br>
Signature Qualification:<br>
Filled in based on the notification content. The data certification should be uploaded<br>
![签名资质](../../../../image/Cloud-Communication/Rich-Media-SMS/rms-010.png)<br><br>
Uploading of SMS Content:<br>
![短信内容上传](../../../../image/Cloud-Communication/Rich-Media-SMS/rms-011.png)<br><br>
You can upload images, audios and videos. After download is clicked, the attachment will enter the edit area on the right. The attachment can be uploaded for multiple times, but the total number of uploaded attachments cannot exceed 1.9MB. <br><br>
The requirements for attachments shall be as follows:<br>
Requirement for images:<br>
Format: JPG, PNG, GIF<br>
Suggested Resolution: Horizontal Version 640px * 480px, Vertical Version 405px * 720px<br><br>
Requirement for Audios:<br>
Format: MP3<br>
Suggested audio: Bit rate 32kbs, Duration: 60s<br>
Size: 200K+<br><br>
Requirement for Videos:<br>
Format: MP4<br>
Suggested Videos: Total bit rate of Videos + Audios 410kbps, Duration: 33s, Frame Size 576*240, Frame Rate: 15<br>
Size: About 1.67M<br><br>
Text Content:<br>
Text Content Support Variable, its format is  &#36;{1} &#36;{2}…<br>
If the content contains variables, it can be sent only by calling API or SDK. If it is sent through the Console, the variable content won’t be displayed as usual.<br><br>
Edit SMS content:<br>
 ![短信内容编辑](../../../../image/Cloud-Communication/Rich-Media-SMS/rms-012.png)<br><br>
The uploaded attachments are displayed in the edit area of SMS content. You can conduct type setting by adjusting the upper and lower locations of the attachments.<br> 
Note: The displays of different mobile phone models vary:<br>
- iOS preview is displayed on the left, with the SMS title in bold<br>
- Android preview is displayed on the left, with the SMS title in bold. There is a separating number between every two SMS contents<br>

After SMS edition, click **Save** to return to the list page, and you can view the audit status on the SMS list page after submission for approval. Only the SMS having passed such approval can be sent<br>
![短信内容列表](../../../../image/Cloud-Communication/Rich-Media-SMS/rms-013.png)<br><br>
