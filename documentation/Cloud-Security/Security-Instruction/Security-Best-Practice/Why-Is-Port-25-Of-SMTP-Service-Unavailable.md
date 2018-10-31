# Is the outbound of VM public network TCP port 25 limited?

**Precondition**: It has been confirmed through inspection that both Security Group and firewall have no limit on the port.

**Causes for limit**: In order to improve the quality of emails sent from JD Cloud IP, it is the default to limit Virtual Machines to send emails to destination port 25.

**Method for lifting a ban**: When opening a ticket to apply for the White List of Email Business, the following information shall be provided:

1. IPs that require lifting a ban and related domains (three sets at most)

(1) Public IP and domain name (compulsory)

(2) Public IP and domain name (optional)

(3) Public IP and domain name (optional)

2. Type of emails sent, for example: promotional emails (compulsory)

3. Number of emails sent per day, for example: 100,000/day (compulsory)

4. Is subscription is included? Yes/No (compulsory)

5. Description for use: It is more likely to be approved when the description is clear with less than 1,000 words (compulsory).

**Note: If you file an application for lifting a ban, JD Cloud will deem it a default that you have confirmed and undertaken that if violations, such as SMTP sending junk emails, arise from the IP applied by you, JD Cloud will have the right to permanently ban TCP port 25 and no longer provide the service of lifting a ban. In case of any other questions, please open a ticket for consultation.**
