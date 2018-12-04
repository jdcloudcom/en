# Scheme Instructions of Anti-DDoS Pro Combining Web Application Firewall

The Anti-DDoS Pro + Web Application Firewall provides three-layer to seven-layer security protection systems, and the application scenarios include games, finance, e-commerce, Internet, government and enterprise, and other types of users outside and within JD Cloud.

# Deployment Architecture
![Deployment Architecture](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/Best-Practice02.png)<Br/>
The excellent deployment architecture for Anti-DDoS Pro + Web Application Firewall is as follows:
- Security Dispatching Center of JD Cloud resolves the domain name of the user to Anti-DDoS Pro CNAME through DNS resolution.
- User's normal access traffic and DDoS attack traffic through Anti-DDoS Pro cleaning, and the back-to-origin is returned to Web Application Firewall.
- The attacker's malicious request is filtered by the Web Application Firewall and returned to the user's Origin Server.
- Web Application Firewall can protect servers of any public network, including but not limited to JD Cloud, other vendors' cloud, IDC, etc.

# Scheme Advantages
1. The Origin Server of the user acts as a hidden Origin Server IP behind the Anti-DDoS Pro and Web Application Firewall.
2. CNAME access, simple configuration, reduces works of operation and maintenance personnel.
