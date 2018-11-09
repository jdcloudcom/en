# Help Documentation of JD Cloud PLUS Smart SMS

## 1.	Product Introduction
### 1.1 What’s JD Cloud PLUS Smart SMS?  
JD Cloud Smart SMS combines traditional SMS and unique smart SMS to provide customers with a full set of SMS services such as sending, conversion and brand exposure, etc. It supports the three types of SMS: verification code, industry notification, and marketing, with successful sending rate reaching 99%. At present it only supports the domestic SMS service of China.
#### 1.2 Smart SMS Advantages
JD Cloud Smart SMS can transform traditional text messages into diversified forms of smart messages, including identifying merchant brands and configuring SMS menus. Clicking the SMS menu, it can jump to the specified website or dial the specified phone number. JD Cloud Smart SMS currently covers OPPO, VIVO, Gionee, Lenovo, LeTV and other Android phone manufacturers, with daily active users reaching more than 300 million.
#### 1.3 Glossary
##### 1.3.1 SMS Signature
SMS signature is the information contained in each SMS [], representing the sender of each SMS.
##### 1.3.2 SMS Template
The SMS template is also a part of the SMS besides signature, and consists of general SMS template and variable SMS template. The general SMS refers to the type of SMS with the same contents for multiple users, and is commonly used for member notification and member marketing. Variable SMS may be taken as personalized SMS, such as "[XX Express] Your order 12345 has been sent out. Please kindly note to check”. The order number "12345" in this SMS is a variable, which varies for different users. The variable SMS interface is required for this kind of SMS.
##### 1.3.3 SMS Category
SMS falls into three categories: verification code, industry notification, and member marketing. The verification code SMS refers to the SMS sent for user login verification; the industry notification SMS is used to send system service notifications, such as logistics & express, and order status change, etc.; marketing SMS, whose contents are obviously for marketing and promotion, is used for event notification and member marketing.
## 2.	 User Guide
### 2.1 Application Signature
The signature represents the identity of the SMS sender and can be an enterprise abbreviation or an APP name. Applicants need to upload a business license. If the signature does not belong to the SMS sender, the power of attorney from corresponding enterprise is required. Each SMS has only one signature, and the length is limited to 2-6 Chinese characters. Full English signature is not recommended. Characters other than Chinese, English and numbers cannot be used.
### 2.2 Application Template
To apply for a SMS template, you need to fill in the template name and contents. The template name is used by customers to manage their own templates, and can be customized. The template contents have the following restrictions:
The variables in the variable SMS are replaced with {}. For example, your express waybill {} has been sent out, and please kindly note to check.
It shall not contain special symbols such as ^_^&, ☞, √ and ※ etc.
It is forbidden to send messages of stocks, immigration, interview & recruitment, lottery, rebate, loan, dunning, investment & wealth management, gambling, prize winning, One -Yuan Lucky Purpose, One -Yuan Seckill, fake goods, medical, plastic surgery, cosmetology, club, bar, foot bath, violence, intimidation, porn, fur, examination aid, trademark registration, group ID promotion, QQ or WeChat ID promotion, personal information selling, SMS channel promotion, game promotion, conference & exhibition promotion, website promotion, coupon promotion, card promotion, insurance promotion, wine, new user acquisition, user recall, finance, real estate, and education (only the sending of verification codes is supported).
New user development SMSes such as event invitation shall not be sent without users’ permission.
The marketing SMS must contain “Unsubscribe TD" and so on.
### 2.3 Smart SMS Application
To apply for smart SMS, you need to report the relevant signature in advance, and then you can apply for the corresponding smart SMS based on the signature. The smart SMS applicant is required to fill in the identification name, select the signature, upload the LOGO, and configure the menu. After the application is approved, applicant can use the smart SMS.
### 2.4 Mass Texting
The customers can send a SMS in the SMS background by themselves, select the registered signature and template, and fill in the number to complete the task. If you need to speed up the sending, you can contact the customer or the business department to set the contents of the report exempt from review.
### 2.5 Rates
The verification code, industry notification and marketing SMSes have different rates and are all charged after successful sending.
### 2.6 SMS Sending Frequency Limit
SMSes with the same contents can only be sent to the same user for three times within ten minutes.
## 3.	 Development Guide
### 3.1 Instructions for Use
For SMS senders based on business scenario triggers and number contents sensitivity, it is recommended to use the API for SMS sending. Before sending, you need to contact customer service to configure the IP white list, callback address, and uplink address, and refer to the following documents for joint debugging of related interfaces.
## 4.	 FAQs
### 4.1 Reasons of Sending Failures
Common reasons for sending failures are failure in review and abnormal phone status.
If it only fails for some mobile phones, user can query the specific error code in the background or API. Go to background query page: Send SMS - Task Management - View Send Receipt.
As to sending failure of the whole task, the possible reason is that it has not been approved. Please check whether the contents are correct or contact customer service.
As the receipt would be delayed for mobile phones of abnormal status, the system judgment time is 72 hours. In case of timeout, it would stop the task.
### 4.2 Slow Sending
Most SMSes can be sent within half an hour. In case of no status receipt beyond specified time, you can contact the business department or customer service.
