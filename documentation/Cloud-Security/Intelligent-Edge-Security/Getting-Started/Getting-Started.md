# Getting Started

To help you to subscribe, configure and enable Intelligent Edge Security Service, description of service subscription and configuration is as follows:

**Step 1: Subscribe Intelligent Edge Security Service**

You may subscribe Intelligent Edge Security Service by any of the following methods:

1. Dial the number: 4006151212 and the customer service personnel will subscribe Intelligent Edge Security Service for you.

2. Enter [Intelligent Edge Security Ticket System](https://ticket.jdcloud.com/applyorder/form?cateId=4&questionId=843), fill in the [User Permission Application] ticket, and the customer service personnel will contact you to handle the enabling affairs about Intelligent Edge Security Service.

**Step 2: Add accelerated domain of Intelligent Edge Security**

1. Enter the [Domain List] page on the Intelligent Edge Security Customer Console;

2. Click **Add Domain**;

![添加域名](/image/Intelligent-Edge-Security/添加域名.png)

3. Fill in or select the following information in the "Add Accelerated Domain" page that opens, and then click the **OK** button.

1. Accelerated domain: Fill in the information of the domain, of which the content needs to be distributed and accelerated.

- Please complete the ICP filing of the domain with the communications administration and then conduct this domain adding configuration;
- Domain filling characters only support 26 English letters, 10 Arabic numerals and the horizontal bar "-"'*’;
- Support extensive domains, up to level 4 extensive domains, such as "*.*.jdcloud.com";
- Support addition of up to 100 accelerated domains. If there are more domain acceleration demands, please open online tickets.

1. Back-to-origin mode: Please select IP back-to-origin and domain back-to-origin according to actual needs, fill in the origin server IP address and origin server domain. JD Cloud Intelligent Edge Security supports multi-IP Load Balancer back-to-origin, and multi-IP and multi-domain backup back-to-origin. Please fill in the back-to-origin configuration according to actual needs.

![域名基本信息配置](/image/Intelligent-Edge-Security/域名基本信息配置.png)

**Step 3: Associate CNAME**

1. Enter the [Domain List] page on the Intelligent Edge Security customer console, and replicate the CNAME of the approved domain;

![查看CNAME记录](/image/Intelligent-Edge-Security/查看CNAME记录.png)

2. Log in to the domain DNS service provider console to complete the CNAME configuration.

Take your JD Cloud DNS domain as an example, the CNAME association method is as follows:

1) Log in to [JD Cloud Console](https://www.jdcloud.com/index) and enter the [[Domain Service - JD Cloud DNS]](https://dns-console.jdcloud.com/list) page, click the domain to be associated

![CNAME绑定](/image/Intelligent-Edge-Security/CNAME绑定.png)

2) Select the domain to be associated, click **Resolution**, enter the domain resolution interface, click **Add Resolution**, select the record type as "CNAME", and fill in the CNAME information assigned by JD Cloud Customer Console for the domain in the record value. The format shall be "*.*.*.jcloud-Intelligent Edge Security.com", set the ISP Line type to be "default", and then save them.

![域名解析](/image/Intelligent-Edge-Security/域名解析.png)

3. Modifying the DNS server requires 0-72 hours of global effective time; if you find that some local records have not taken effect, and the time since modifying DNS is less than 72 hours, please be patient and wait.

**Step 4: Enable Intelligent Edge Security Service**

After the domain is approved, the acceleration service configuration will take effect in 15 minutes and network layer protection & application layer rules can be configured at the same time, achieving the target of taking both security and acceleration into account.