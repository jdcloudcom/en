# Scheme Instructions of Advanced Anti-DDoS Combining Web Application Firewall

The Advanced Anti-DDoS + Web application firewall provide three-layer to seven-layer security protection systems, and the application scenarios include games, finance, e-commerce, Internet, government and enterprise, and other types of users outside and within JD Cloud.

# Deployment Architecture
![Deployment Architecture](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/Best-Practice02.png)<Br/>
The excellent deployment architecture for Advanced Anti-DDoS + Web application firewall is as follows:
- Security Dispatching Center of JD Cloud resolves the domain name of the user to Advanced Anti-DDoS CNAME through DNS resolution.
- User's normal access traffic and DDoS attack traffic through Advanced Anti-DDoS cleaning, and the back-to-source is returned to Web application firewall.
- The attacker's malicious request is filtered by the Web application firewall and returned to the user's source station.
- Web application firewall can protect servers of any public network, including but not limited to JD Cloud, other vendors' cloud, IDC, etc.

# Scheme Advantages
1. The source station of the user acts as a hidden source station IP behind the Advanced Anti-DDoS and Web application firewall.
2. CNAME access, simple configuration, reduces works of operation and maintenance personnel.
