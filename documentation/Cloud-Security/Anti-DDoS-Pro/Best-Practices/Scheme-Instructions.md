# Scheme Instructions of  Anti-DDoS Pro Combining Application Security Gateway

Anti-DDoS Pro + Application Security Gateway provide comprehensive safety protection for JD Cloud users without increasing the extra performance expenses.

# Deployment Architecture
![Deployment Architecture](https://github.com/jdcloudcom/cn/blob/edit/image/%20Anti-DDoSPro/Best-Practice03.png)<Br/>
The excellent deployment architecture of Anti-DDoS Pro + Application Security Gateway is as follows:
- Security Dispatching Center of JD Cloud resolves the domain name of the user to Anti-DDoS Pro CNAME through DNS resolution.
- The normal access flow of the user and the DDoS attack traffic are subjected to Anti-DDoS Pro cleaning, and the back-to-origin is returned to the Virtual Private Cloud Load Balancer cluster of the JD Cloud.
- The Application Security Gateway is deployed on the Load Balancer and is responsible for the security of the Web application layer.
- The Application Security Gateway associating to Load Balancer can prevent attacks from the Internet or to defend against attacks inside the VPC.

# Scheme Advantages
1. Application Security Gateway provides users with exclusive resources, dynamic expansion, regular ALONE I STAND customization, without mutual influence.
2. The Application Security Gateway does not need to rely on DNS dispatch. There is no additional bandwidth resource consumption, and the network delay is less than 1 ms.
3. The HTTPS certificate is stored inside the user's VPC and cannot be monitored and stolen from the Internet.
