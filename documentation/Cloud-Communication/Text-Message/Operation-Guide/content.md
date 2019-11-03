## SMS Template <br>

![短信样例](../../../../image/Text-Message/dx-014.png)<br><br>

The SMS style received by a final user is as follows: <br>
[JD Cloud] You have successfully registered a JD Cloud membership<br><br>

Click **Create Template** on the SMS Template TAB page, as shown in the figure below<br>
![创建模板](../../../../image/Text-Message/dx-015.png)<br><br>

Fill in the template as per notification contents, click **Submit** and wait for signature review by operators<br><br>

Text Messages in China is divided into three types:<br>
* Verification Code SMS<br>
* Notification SMS<br><br>
* 推广短信<br><br>

**Verification Code SMS**<br>
![验证码](../../../../image/Text-Message/dx-016a.png)<br>
Example of Verification Code SMS:<br>
```[JD Cloud] Welcome to register a JD Cloud user, your verification code is ${1} and is valid for 5 minutes. ```<br>
In which:<br>
```[JD Cloud]``` is the SMS signature<br>
```Welcome to register a JD Cloud user, your verification code is ${1} and is valid for 5 minutes. ``` is the SMS template<br>
```${1} ``` is the template variable<br><br>

Verification Code SMS only supports one variable<br>
The template must contain one of the 4 phrases, verification code, registration code, verification codes and dynamic codes<br>
Must contain platform, invalid time or purpose<br><br>

**Notification SMS:**<br>
![通知](../../../../image/Text-Message/dx-016b.png)<br>
Example of Notification SMS:<br>
```[JD Cloud] I am the JD deliveryman${1}, your fresh order${2} is in transit and please prepare for the goods. ```<br>
In which:<br>
```[JD Cloud]``` is the SMS signature<br>
```I am the JD deliveryman${1}, your fresh order${2} is in transit and please prepare for the goods. ``` is the SMS template<br>
```${1} ${2} ${3} ```are template variables<br><br>

The same variable name is not allowed<br>
The format of direct combination of variables and short links and variables are not supported<br><br>

**推广短信:**<br>
![推广](../../../../image/Text-Message/dx-016c.png)<br>
推广短信不支持加变量<br>
不能发送贷款/借款/中奖/抽奖类短信，不支持金融理财/房产通知类短信（验证码除外）<br><br>

After the review is submitted, you can view the review status in the SMS template list page. The approved SMS template is available for sending SMS<br>
![查看状态](../../../../image/Text-Message/dx-017.png)<br><br>

Note: Verification Code SMS and Notification SMS shall be called via API or SDK. <br>
For details, please refer to https://docs.jdcloud.com/cn/?act=3 <br>
Relevant information necessary for API and SDK can be obtained in the Overview Page <br>
![ak](../../../../image/Text-Message/dx-017a.png)<br><br>
