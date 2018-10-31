# Threat overview

### Interface

  ![](https://github.com/jdcloudcom/cn/blob/cn-csa/image/Situational-Awareness/to-1.png)

### Glossary

#### Single attack event
Cover alarm events found by network invasion detection, Basic Anti-DDoS detection and endpoint security detection. As there is a single event type with clear meaning, such event is named as the single attack event.

#### Targeted attack event
The new attack event provided by JD Cloud and associated in real time based on big data of security threat model is called as the target attack event.

#### Safety engine starting coverage
It consists of starting coverage of the network invasion detection engine, the Basic Anti-DDoS detection engine, the endpoint security detection engine. The network invasion detection engine start coverage=EIP amount of enabled DIDS monitor/total amount of EIP under current use, machine security detection engine starting coverage = amount of cloud servers installed with machine security software/total amount of cloud servers under current user. The starting coverage of Basic Anti-DDoS protection is 100% by default, which can’t be adjusted manually. The weight is 1:1:1. The greater the coverage of engine starting monitor, the better the security incident capture capacity. Therefore, the security engine coverage is used for quantifying and balancing the starting rate. The best practice is 100%.

#### Weaknesses events
Self-check vulnerability of virtual machine from the view of the defender. Each vulnerability is called as a weakness event.

### Function description
Provide quantitative indicators to the lessee’s basic security threat status, single attack event exhibited from the attacker’s view and index and change of target attack event, security engine starting coverage exhibited from the defender’s view and index and change of weakness event. At the same time the Top10 attacked assets and Top10 threat categories are provided.

### Action steps
Log in the threat overview page by default, click the number of the single attack event of the attacker’s view and jump to the page of **Single Attack Event Details**. Click the number of the target attack event from the attacker’s view to jump to the page of **Targeted Attack Event Details** and click the security engine start coverage rate from the defender’s view to jump to the **Configuration Changes**->**Asset Management**. 
  - **Attack Event Development Trend** Click 7d or 30d to provide single attack events, targeted attack event, security engine starting coverage, weakness event number trend with 7 days or 30 days. The percentage is shown by the right-side coordinate, which is displayed as per the safety engine starting coverage. Move the mouse to “Everyday” and the single attack event, target attack event, security engine starting coverage and weakness event number will be displayed. 
  - Click one of the Top10 attacked assets and the system will carry IP filtration conditions of corresponding assets and jump to the page of **Singe Attack Event Details**. The statistic time period is 7d or 30d or is the time status selected actually. 
  - Click one of the Top10 threat categories and the system will carry corresponding category filtration conditions and jump to the page of **Singe Attack Event Details**. The statistic time period is 7d or 30d or is the time status selected actually. 
