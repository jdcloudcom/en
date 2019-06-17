## Product Overview 

The VPC-WAF is the product used for applying visual security analysis to the website or APP service and applying threat protection to the application layer. By improving such functions as WAF, user access audit and business safety visual and compliance check, the steady and sustainable operation of business is ensured, the user experience is improved and the abnormalty or compliance problem resulted from HTTP/HTTPS business being attacked is solved.

By associating [Application Load Balancer](https://docs.jdcloud.com/en/application-load-balancer/product-overview), the Application Security Gateway performs protection for all HTTP/HTTPs (including Websocket) traffic passing through Application Load Balancer.

The logic deployment schematic diagram of VPC-WAF is as shown below:

 ![](../../../../image/AppliAcation-Security-Gateway/01-overview.png)

The VPC-WAF is based on the high-performance cluster of the JD Cloud’s Load Balancer. Once the VPC-WAF protection instances are created in the console and associated to the Load Balancer, any HTTP/HTTPs traffic passing through such Load Balancer can be protected without modifying the website, even if no domain is listed.

The VPC-WAF makes comprehensive uses of rules to protect various security technologies, such as engines, semantics resolution engine, AI analysis platform and threat intelligence, realizing west-east and north-south Web security protection of JD Cloud VPC. It can effectively defense OWASP Top 10 Web security threats, CC attacks and BOT management, meets compliance requirements of laws and regulations, provides convenient deployment, use experience and diversified visual charts, protect Web application or API of JD Cloud users from being subject to security threats at present and in future and guarantee the users’ cloud access security.

#### Common Operations

- Easy Operation
  - [Create Instance](../Operation-Guide/Instance-Management/Create-Application-Security-Gateway.md)
- Package Introduction
  - [Package Introduction](../Introduction/Specifications.md)

## Billing

Application Security Gateway is charged as per the monthly package billing method. For details, please refer to "[Billing Rules](../Pricing/Price-Overview.md)".
