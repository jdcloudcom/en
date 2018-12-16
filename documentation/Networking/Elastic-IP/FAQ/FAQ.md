# FAQ

**Q: Is the outbound of VM public network TCP 25 port limited?**

Precondition: It has been confirmed that both Security Group and firewall have no limit on the port.

Causes for limit: In order to improve the quality of emails sent from JD Cloud IP, it is default to limit Virtual Machine to send emails to destination port 25.



Method for lifting a ban: When creating case to apply for the White List of Email Business, the following information shall be provided:

1. IPs that require lifting a ban and related domains (three sets at most)

(1) Public IP and domain (compulsory)

(2) Public IP and domain (optional)

(3) Public IP and domain (optional)

2. Type of emails sent, for example: promotional emails (compulsory)

3. Number of emails sent per day, for example: 100,000/day (compulsory)

4. Is subscription is included? Yes/No (compulsory)

5. Description for use: It is more likely to be approved when the description is clear with less than 1,000 words (compulsory).

 

Note: If the users file an application for lifting a ban, JD Cloud will deem that the users have confirmed and undertaken that if violations, such as SMTP sending junk mails, arise from the IP applied by the users, JD Cloud will have the right to permanently ban TCP 25 port and no longer provide the service of lifting a ban. In case of any other questions, please create case for consultation.

**Q: What is the peak-value of EIP bandwidth?**

Currently JD Cloud leverages the cutting-edge technology of active-active vRouter which provides high availability ability for users. users can benefit from features of link redundancy and high availability in scenarios of massive concurrent connections, extra-large traffic loads, and burst traffic compared to classic active-standby mode. Based on this technology, JD Cloud’s EIP address’s maximum bandwidth can reach up to 150% of the bandwidth users actually purchase, which provides business continuity guarantee.

Normally, an Elastic IP address’s maximum bandwidth equals 150% of the bandwidth users actually purchase according to the traffic-sharing model of active-active vRouter. In rare specific situations, like downloading files through a single FTP connection, an Elastic IP address’s maximum bandwidth might reduce to 75% of user’s actual bandwidth.

**Q: What is the inbound bandwidth of the Elastic IP?**

The rules for the assignment of Elastic IP inbound (from public network to JD Cloud) bandwidth of JD Cloud are described as follows:

1. If the IP outbound bandwidth purchased by a user is 100 Mbps or below, and the inbound bandwidth of 100 Mbps will be assigned to the IP.

2. If the IP outbound bandwidth purchased by a user is 100 Mbps or above, and the inbound bandwidth equal to the outbound bandwidth will be assigned to the IP.
