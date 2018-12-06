# Attack Alarm Settings

You can adjust the settings of alarm reception at the Message Center to determine the person and manner in which the message alert needs to be received.

## Precautions
- Alarm settings take effect globally, including **Anti-DDoS Basic**, **Anti-DDoS Protection Package** and **Anti-DDoS Pro**.

## Configure Alarm Notification Method
For the alarm account contact and notification method, please configure it in **Message Center**.
1. If you have logged in to the console, find the ** Message ** on the top right of the console and enter the Message --> Message Setup page.
![Message Center](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/message%2001.png)
Or directly log in the [Message Center](https://uc.jdcloud.com/message/mine).
2. Switch to **Message Settings page**  
![Message Center](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/message%2002.png)
In the security message summary, you can determine the email and phone to send messages, and whether to accept the message alarm. </BR>

##  Configuration Alarm Notification Type

Anti-DDoS Pro supports to configure three alarm types for a single instance, including DDoS attack alarm, error code status alarm and black hole alarm. Please configure at the place shown in the figure under the instance details:

![告警通知](https://github.com/jdcloudcom/cn/blob/Anti-DDoS/image/Advanced%20Anti-DDoS/alarm.png)

Please note that if the SMS and email are disabled in the alarm methods, then the alarm cannot be notified regardless of whether the alarm types are checked.

The alarm types include the following:

- DDoS attack alarm notification: That is, the pushing of alarm of attack taking place, alarm of attack ending, alarm of no ICP filing, alarm of bandwidth being limited and other information.
- Error code status alarm: That is, for the added domain name, the alarm notification triggered when the common error page ratio reaches 5%, 10%, 30%, and 50%. Such as Error 422 (Access Denied), Error 420 (Request Reenter), 522 (Origin Server Unaccessible) and other non-2XX, 3XX error pages.
- Black hole alarm notification: That is, the alarm notification of black hole starting and lifting a ban.

## View Notification of Alarm
1. Log in to [Message Center](https://uc.jdcloud.com/message/mine).
2. In My Message –> Security Message, you can view all alarms of Anti-DDoS Pro.
![Message Center](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/message%2003.png)
