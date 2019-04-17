# Threat Overview

### Interface

  ![](../../../../image/Situational-Awareness/to-2.png)

### Glossary

#### Incident

Cover incidents found during network invasion detection, Anti-DDoS Basic detection and Endpoint Security detection and the high-value incidents found during adding threat intelligence, dynamic behavior analysis and machine learning.

#### Threat Incident
The new attack incidents provided by JD Cloud and associated on the basis of big data of security threat model comprise real-time analysis incidents and off-line analysis incidents.

#### Engine Coverage Rate
It consists of starting coverage of the network invasion detection engine, the Anti-DDoS Basic detection engine, the endpoint security detection engine. The network invasion detection engine start coverage=EIP amount of enabled DIDS monitor/total amount of EIP under current use, Endpoint Security detection engine starting coverage = amount of cloud servers installed with Endpoint Security software/total amount of cloud servers under current user. The starting coverage of Basic Anti-DDoS protection is 100% by default, which can’t be adjusted manually. The weight is 1:1:1. The greater the coverage of engine starting monitor, the better the security incident capture capacity. Therefore, the security engine coverage is used for quantifying and balancing the starting rate. The best practice is 100%.

#### Weaknesses incidents
##### Host Vulnerability

Self-check vulnerability of Virtual Machines from the perspective of the defender. Each vulnerability is called as a host weakness incident.
##### Website Vulnerability
Periodically scan the host and the website according to the user’s asset configuration, help the user check the website health state, including opening of a high risk port, information leakage detection, weak password, general vulnerability of web and dedicated vulnerability of web.

### Function description
Provide the lessee with the quantitative indicators about the service security status as well as incidents and threat incidents from the attacker’s perspective, and indicator changes of engine coverage rate, host vulnerability incidents and website vulnerability incidents from the defender’s perspective. At the same time, provide the 7/30d development trends of security incidents, Top10 risk assets summarized and counted as for incidents and threat incidents and Top10 threat forms summarized and counted as for incident types and threat models.

The enterprise version upgrade entrance will be provided at the same time.

### Action steps
Log in the threat overview page by default, click the incident number of the attacker’s perspective and jump to the page of [Incident Details]. Click the threat incident number of the attacker’s perspective to jump to the page of the [Threat Incident Details]; click the engine coverage rate of the defender's perspective to jump to [Configuration Changes] -> [Asset Management]; click the host of the defender’s perspective to jump to the [Weakness Incident] -> [Host Vulnerability]; and click the host of the defender’s perspective to jump to the [Weakness Incident] -> [Website Vulnerability].
 *[Attack Incident Development Trend] Click 7d or 30d to provide the incident, threat incident, engine coverage rate, host incident, and website vulnerability number trend within 7 days or 30 days. The percentage is shown by the right-side coordinate, which is displayed as per the safety engine starting coverage rate. Move the mouse to "Everyday" and the incident, threat incident, engine coverage rate, host incident and website vulnerability number will be displayed. 
 
  *Click one of the Top10 attacked assets and the system will carry IP filtration conditions of corresponding assets and jump to the page of [Incident Details]. The statistic time period is 7d or 30d or is the time status selected actually.
  
  *Click one of the Top10 threat categories and the system will carry corresponding category filtration conditions and jump to the page of [Incident Details]. The statistic time period is 7d or 30d or is the time status selected actually. 
