# FAQ

**Q: Is the outbound of VM public network TCP 25 port limited?**

Precondition: It has been confirmed that both Security Group and firewall have no limit on the port.

Causes for limit: In order to improve the quality of emails sent from JD Cloud & AI IP, it is default to limit Virtual Machine to send emails to destination port 25.



Method for lifting a ban: When creating case to apply for the White List of Email Business, the following information shall be provided:

1. IPs that require lifting a ban and related domains (three sets at most)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(1) Public IP and domain (compulsory)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(2) Public IP and domain (optional)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(3) Public IP and domain (optional)

2. Type of emails sent, for example: promotional emails (compulsory)

3. Number of emails sent per day, for example: 100,000/day (compulsory)

4. Is subscription is included? Yes/No (compulsory)

5. Description for use: It is more likely to be approved when the description is clear with less than 1,000 words (compulsory).

 

Note: If the users file an application for lifting a ban, JD Cloud & AI will deem that the users have confirmed and undertaken that if violations, such as SMTP sending junk mails, arise from the IP applied by the users, JD Cloud & AI will have the right to permanently ban TCP 25 port and no longer provide the service of lifting a ban. In case of any other questions, please create case for consultation.

**Q: What is the peak-value of EIP bandwidth?**

Currently JD Cloud & AI leverages the cutting-edge technology of active-active vRouter which provides high availability ability for users. users can benefit from features of link redundancy and high availability in scenarios of massive concurrent connections, extra-large traffic loads, and burst traffic compared to classic active-standby mode. Based on this technology, JD Cloud & AI’s EIP address’s maximum bandwidth can reach up to 150% of the bandwidth users actually purchase, which provides business continuity guarantee.

Normally, an Elastic IP address’s maximum bandwidth equals 150% of the bandwidth users actually purchase according to the traffic-sharing model of active-active vRouter. In rare specific situations, like downloading files through a single FTP connection, an Elastic IP address’s maximum bandwidth might reduce to 75% of user’s actual bandwidth.

**Q: What is the inbound bandwidth of the Elastic IP?**

The rules for the assignment of Elastic IP inbound (from public network to JD Cloud & AI) bandwidth of JD Cloud & AI are described as follows:

1. If the IP outbound bandwidth purchased by a user is 100 Mbps or below, and the inbound bandwidth of 100 Mbps will be assigned to the IP.

2. If the IP outbound bandwidth purchased by a user is 100 Mbps or above, and the inbound bandwidth equal to the outbound bandwidth will be assigned to the IP.

**Q: How to create edge EIPs?**

1. If you are going to create an edge EIP through the Console, please refer to [Create EIP](https://docs.jdcloud.com/en/elastic-ip/create-elastic-ip). JD Cloud & AI now supports the creation of edge EIPs in **cn-south-1**, and the line information is as follows:
|Region|Area|Line|Line Access Area|Resource Association Area|Service Type|Availability Zone|
|----|---|---|---|---|---|---|
| cn-south-1|Foshan| cn-s1-fsnh1.ez.telecom  |Nanhai district in Foshan city|Edge availability zone|Telecom|Nanhai district in Foshan city|

2. As for the creation of an edge EIP via SDK, the specific line naming rules are as follows:

| Line Naming Rules        |Field Description              |
| ---------------| ---------------|
|[Line Access Area+Serial Number].[Resource Association Area].[Service Type]  |Line access area: Provides the specific location information of the line access area (ez definition, both Chinese and English are 20 bytes in length); <br>Resource association range: Divided into ez (edge availability zone) and az (central edge availability zone, compatibility design); <br> Service type: Mainly includes bgp, unicom, telecom, chinamobile, etc.; <br>Availability zone: Divided into full availability zone and edge availability zone ID ([Region]-[Line Access Area+Serial Number]). For example, cn-n1-sqxx1 is consistent with the edge availability zone ID definition selected by the virtual machine created by edge computing|
