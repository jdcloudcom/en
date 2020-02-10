## SMS Template

![短信样例](../../../../image/Text-Message/dx-014.png)  

The SMS style received by a final user is as follows: 
[JD Cloud] You have successfully registered a JD Cloud membership

Click **Create Template** on the SMS Template TAB page, as shown in the figure below
![创建模板](../../../../image/Text-Message/dx-015.png)  

Fill in the template as per notification contents, click **Submit** and wait for signature review by operators  

Text Messages in China is divided into three types: 
* Verification Code SMS  
* Notification SMS  
* Promotion SMS  

**Verification Code SMS**  
![验证码](../../../../image/Text-Message/dx-016a.png)  
Example of Verification Code SMS:  
```[JD Cloud] Welcome to register a JD Cloud user, your verification code is ${NUM_6} and is valid for 5 minutes. ```  
In which:  
```[JD Cloud]``` is the SMS signature  
```Welcome to register a JD Cloud user, your verification code is ${NUM_6} and is valid for 5 minutes. ``` is the SMS template  
```${NUM_6} ``` is the template variable  

Verification Code SMS only supports one variable  
The template must contain one of the 4 phrases, verification code, registration code, verification codes and dynamic codes  
Must contain platform, invalid time or purpose  

**Notification SMS:**  
![通知](../../../../image/Text-Message/dx-016b.png)  
Example of Notification SMS:  
```[JD Cloud] I am the JD deliveryman${TXT_5}, your fresh order${TXT_10} is in transit and please prepare for the goods. ```  
In which:  
```[JD Cloud]``` is the SMS signature  
```I am the JD deliveryman${TXT_5}, your fresh order${TXT_10} is in transit and please prepare for the goods. ``` is the SMS template  
```${TXT_5} ${TXT_10} ```are template variables  

The same variable name is not allowed  
The format of direct combination of variables and short links and variables are not supported  

**Promotion SMS:**  
![推广](../../../../image/Text-Message/dx-016c.png)  
Addition of variable is not supported by promotion SMS  
SMS with contents of loan/borrowing/gambling/lottery cannot be sent and financial service/property notice are not supported (except verification code)  

After the review is submitted, you can view the review status in the SMS template list page. The approved SMS template is available for sending SMS  
![查看状态](../../../../image/Text-Message/dx-017.png)  

Note: 
Verification Code SMS and Notification SMS shall be called via API or SDK.  
Promotion SMS and notification SMS can be sent on line via the "Send SMS" page on the Console and the on-line sending does not support the SMS with variables  
Relevant information necessary for API and SDK can be obtained in the Overview Page  
![ak](../../../../image/Text-Message/dx-017a.png)  
