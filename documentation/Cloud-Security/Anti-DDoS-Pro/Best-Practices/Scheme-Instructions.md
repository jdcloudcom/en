# Scheme Instructions of Advanced Anti-DDoS Combining Application Security Gateway

Advanced Anti-DDoS + application security gateway provide comprehensive safety protection for JD Cloud users without increasing the extra performance expenses.

# Deployment Architecture
![Deployment Architecture](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/Best-Practice03.png)<Br/>
The excellent deployment architecture of Advanced Anti-DDoS + application security gateway is as follows:
- Security Dispatching Center of JD Cloud resolves the domain name of the user to Advanced Anti-DDoS CNAME through DNS resolution.
- The normal access flow of the user and the DDoS attack traffic are subjected to Advanced Anti-DDoS cleaning, and the back-to-source is returned to the private network load balancer cluster of the JD Cloud.
- The application security gateway is deployed on the load balancer and is responsible for the security of the Web application layer.
- The application security gateway associating to load balancer can prevent attacks from the Internet or to defend against attacks inside the VPC.

# Scheme Advantages
1. Application security gateway provides users with exclusive resources, dynamic expansion, regular ALONE I STAND customization, without mutual influence.
2. The application security gateway does not need to rely on DNS dispatch. There is no additional bandwidth resource consumption, and the network delay is less than 1 ms.
3. The HTTPS certificate is stored inside the user's VPC and cannot be monitored and stolen from the Internet.
