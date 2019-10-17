## Application Management<br>

Before SMS is sent with JD Cloud Short Message Service, the application needs to be created, and after that you can obtain the unique identification code AppID (application ID) of the application and the legal password AccessKey used to verify validity of the request sent by SMS.<br><br>

**Create application:**<br>
After logging in the JD Cloud account, enter into SMS Cloud Service, select **Application Management** in the menu on the left<br>
![创建应用](../../../../image/Text-Message/dx-002.png)<br><br>

After filling the application name and description in the pop-up application creation interface, and clicking **OK** after completing information filling, you will be redirected to the application list, and you will see the application you just successfully added into the application list.<br>
![创建应用](../../../../image/Text-Message/dx-003.png)<br><br>

**Management Application:**<br>
On the application list page, you can view the SMS usage of the application, disable, enable, edit or delete the application.<br>
![管理应用](../../../../image/Text-Message/dx-004.png)<br><br>
The created application is in the enabled status. In this case, you can disable such application, and the application status in the list will be changed into ‘disabled’. After the application is disabled, JD Cloud will stop the Short Message Service of the application.<br>
If you want to reuse the application, you can click **Enable** and then use the Short Message Service normally<br><br>

**Application Setting**<br>
Enter into the setting page of the application after clicking the application name<br>
![应用设置](../../../../image/Text-Message/dx-005.png)<br><br>

Sending Frequency Setting:<br>
To guarantee business and channel security and reduce economic loss caused by business brush, the default SMS frequency restriction policy is as follows:<br>
1. For	 the same mobile phone number, no more than 10 SMS entries shall be sent in 1 natural day <br>
2. 	One SMS cannot be sent twice to the same mobile phone number within 30 seconds<br><br>

Sending Quota Reminder:<br>
After "Give a reminder when the SMS request count exceeds X pieces per natural day in China", the system will send an SMS reminder to your associated mobile phone number as per your threshold<br><br>

Whitelist: <br>
![白名单](../../../../image/Text-Message/dx-006.png)<br>
The mobile phone numbers in the whitelist are not influenced by the SMS sending frequency restriction policy and can be normally sent. At most 300 whitelist numbers can be added.<br><br>

Blacklist:<br>
![黑名单](../../../../image/Text-Message/dx-007.png)<br>
The Short Message Service platforms and operators have their blacklist mechanism. If required, please apply for removing any numbers from the blacklist. Please search if a mobile phone number is in the blacklist or not, and then click **Apply for Remove** and wait to be audited.<br><br>

Shield List:<br>
![屏蔽名单](../../../../image/Text-Message/dx-008.png)<br><br>

The numbers in the shield list will not receive any type of SMS.
