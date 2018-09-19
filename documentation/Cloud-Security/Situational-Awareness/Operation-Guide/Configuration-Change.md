# Configuration changes

### Asset management

#### Interface 

![](https://github.com/jdcloudcom/cn/blob/cn-csa/image/Situational-Awareness/cc-1.png)

![](https://github.com/jdcloudcom/cn/blob/cn-csa/image/Situational-Awareness/cc-2.png)

![](https://github.com/jdcloudcom/cn/blob/cn-csa/image/Situational-Awareness/cc-3.png)

#### Function description
As the machine-related threat events are introduced at the current stage, the concept of situation awareness asset is expanded to the combination of Internet IP and private IP. The search based on private IP and Internet IP is provided. The network detection engine on/off function is provided as well.

#### Action steps
Disable all network detection engines, click the “Enabling Status” button, and all IPs under the situation awareness monitoring will be disabled.
Disable the network detection engine of a single EIP and click “Network Engine” to operate corresponding EIP.
Disable network detection engines of EIP in batches by using the OpenAPI function provided by the cloud situation awareness.
Click private IP number to display corresponding private IP of the EIP and search installation status of the endpoint security software. At the same time, click the “Install Now” to jump to the machine security and client security page.
Relevant data can be searched via public IP and private IP in the account asset.

### Event alarm
#### Interface
![](https://github.com/jdcloudcom/cn/blob/cn-csa/image/Situational-Awareness/cc-4.png)
![](https://github.com/jdcloudcom/cn/blob/cn-csa/image/Situational-Awareness/cc-5.jpg)

#### Function description
To quickly obtain threat event alarm by the user, the alarm is sent to the user via emails and SMSs.

#### Action steps
By **Configuration Changes**->**Alarm Setting**, the single event, alarm level of oriented attack event, notification method, notification time and notifier can be set. Alarm setting and sending statement: In order to improve user experience, a single virtual machine per day at most sends one SMS and a single account sends five SMSs per day. Email notification: up to 20 emails per day for a single account
