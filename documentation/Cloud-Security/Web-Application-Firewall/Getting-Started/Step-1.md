# Add Website Configuration

After enabling Cloud WAF to login JD Cloud, you need to login Web Application Firewall Console and click **Add Network** to add website information to be protected on the Website Configuration page to enable protection for it.

The following figures introduce the adding process, see instructions for specific operations:

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/WAF-tianjiawangzhan.png)

 

The Description Table of Filling in Protection Information

| Parameters                                               | Descriptions                                                         | Remarks                                                         |
| -------------------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Domain name                                               | Domain name to be protected                                               | Fill in extensive domain name is supported * (WAF will automatically match the secondary domain name of the domain name)             |
| Protocol types                                           | Protocol types of the website Please Check http, https as Required. After https is checked, the Certificate needs to be uploaded. | When check https protocol, it can check Forced to Jump and https Back-to-origin.                   |
| Server Address                                         | IP: addresses of origin servers, which will forward traffic to origin server IP after configuration completion,         | Up to 20 origin server IP are supported. If multiple back-to-origin IPs have been configured, WAF will automatically perform health check and load balancer. |
| Others addresses: back-to-origin domain name, after configuration completion, traffic will be forwarded to the domain name | the back-to-origin domain name of servers shall not be the same of that of website domain name to be protected                   |                                                              |
| Server port                                         | origin server port of website domain name                                         | the port of HTTP protocol is 80 by default; the port of HTTPS is 443 by default.               |
| Use agent                                           | Select according to the actual business conditions                                         | if agent services of other 7 layers are configured at the frontend of the website, check Yes, otherwise check None        |        |
| Load Balancer algorithm                                       | IP hash and round robin                                                | check the applicable load algorithm                                           |

 
