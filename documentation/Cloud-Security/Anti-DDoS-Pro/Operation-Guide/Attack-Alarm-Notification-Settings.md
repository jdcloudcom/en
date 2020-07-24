# Attack Alarm Settings

You can adjust the settings of alarm reception at the Message Center to determine the person and manner in which the message alert needs to be received.

## Precautions
- Alarm settings take effect globally, including **Anti-DDoS Basic**, **Anti-DDoS Protection Package** and **Anti-DDoS Pro**.

## Configure Alarm Notification Method
For the alarm account contact and notification method, please configure it in **Message Center** .
1. If you have logged in to the console, find the Message icon on the top right of the console and enter the Message Management--> Message Setup page.
![消息中心](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/message%2004.png)
Or directly log in the [Message Center](https://message-console.jdcloud.com/message/message-list).
2. Click the **Edit** icon to set alarm and notification contacts and please check email notification or SMS notification.
![消息中心](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/message%2005.png)

##  Configuration Alarm Notification Type

Anti-DDoS Pro supports three configuration types for a single instance, including DDoS attack alarm, status code alarm and black hole alarm. Click the point shown in the figure below under Instance Detail to unfold the icon and further configure alarm setting:

![告警通知](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/alarm1.png)

The alarm types as following:

- DDoS attack alarm notification: That is, the pushing of alarm of attack taking place, alarm of attack ending, alarm of no ICP filing, alarm of bandwidth being limited and other information.
- Status alarm: This function is applicable to the added domain and the alarm notification will be triggered when any common exception status code reaches threshold setting. For example, 500/502/504, etc.
- Black hole alarm notification: That is, the alarm notification of black hole starting and lifting a ban.

##  Status Code Alarm Setting

1. Enable the switch, click the **Edit** icon and enter the Status Code Alarm Setting Page.

![告警通知](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/alarm2.png)

2. Select a domain, check a status code, set a threshold value and click **OK**.

![告警通知](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/alarm3.png)

Status code alarm setting fields are interpreted as below:

- Alarm domain: Select a domain to be alarmed and selection of all domains is supported.
- Status code type: 500/502/504 if the return status code of origin server and 590/592/594 refers to return status code of Anti-DDoS Pro node.
- Alarm rules: When the status code reaches the duty threshold within a 5-minute cycle or reaches the threshold for accumulated times within 5 minutes, an alarm will be triggered and at most 6 alarms will be given for one domain per day. The optional proportion thresholds include 5%/10%/30%/50% and the time threshold can be an integer from 1 to 1,000,000. Upon meeting any one of the two threshold values, the alarm can be triggered.

## View Notification of Alarm
1. Log in to [Message Center](https://message-console.jdcloud.com/message/message-list).
2. In My Message –> Security Message, you can view all alarms of Anti-DDoS Pro.
![消息中心](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/message%2006.png)
