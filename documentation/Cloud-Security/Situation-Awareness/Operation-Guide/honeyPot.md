# Threat Cheat

### Function Module Definition

Build a trap (honeypot) on the only way for hacker invasion, precisely be aware of hacker’s attack behaviors, trace invaders, form alarms and give further incident response by users.

#### Function Description

This threat cheat provides 14 horizontal attack types, as shown in the table below:

|  Attack Type   | Attack Port/Protocol  | Risk Level  |
|  ----  | ----  | ----  |
| ftp Login Try	 | 21/tcp  |  Severe | 
| http Login Try | 80/tcp |  Severe | 
| smb Login Try  | 445/tcp | Severe | 
| mysql Login Try  | 3306/tcp, 3358/tcp | Severe | 
| sip Access Request	 | 5060/udp | Severe | 
| ntp monlist Request  | 123/udp | Severe | 
| tftp Access Request  | 69/udp | Severe | 
| mssql Login Try | 1433/tcp | Severe | 
| vnc Login Try  | 5900/tcp | Severe | 
| mongodb Login Try | 27017/tcp | Severe | 
| elasticsearch Login Try  | 9200/tcp | Severe | 
| oracle Login Try  | 1521/tcp | Severe | 
| redis Login Try  | 6379/tcp | Severe | 
| Port Scan | TCP SYN SCAN/TCP ACK SCAN/TCP FIN SCAN/XMAS SCAN/MAIMON SCAN/NULL SCAN | Severe | 

#### Operation Description

1. Honeypot Deployment   

Log in [Situation Awareness] -> [Threat Cheat] and click VLAN requiring honeypot deployment and click **Deploy

![](../../../../image/Situational-Awareness/honeypot4.png)

2. Horizontal Attack Analysis   

Honeypot deployment coverage: Work out honeypot deployment coverage by obtaining VLAN and related data in VPC, 30%~100% stands for acceptable (green), but 0%~29% stands for unacceptable (red)  
Top10 attack assets: Work out risk assets of Top10 attack honeypots with attack data reported back by honeypot.  
Top10 attack types: Work out Top10 horizontal attack types with attack data reported back by honeypot.  

![](../../../../image/Situational-Awareness/honeypot3.png)

3. Attack Details View   

Click one of the Virtual Machines in the [Top10 Attack Assets] and log in [Attack Details],

![](../../../../image/Situational-Awareness/honeypot2.png)

![](../../../../image/Situational-Awareness/honeypot1.png)


