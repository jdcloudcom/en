# Scheme Instructions of Local Protection + Advanced Protection

In order to solve the problem of security protection of a local node of users, a local basic protection system is built for the users. Meanwhile, because the bandwidth resource of the local node is limited, the massive DDoS attacks cannot be coped with, and a cloud linkage protection function is provided for the users. The local protection system is monitored by real-time flow, when the attack traffic reaches the local protection threshold, the traffic is automatically lead to the advanced anti-DDoS, so that the user can realize the emergency cloud uploading.

# Deployment Architecture
![Deployment Architecture](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/Best-Practice01.png)<Br/>
The best practice that meets both requirements of user local business protection and one-click upload-to-cloud linkage protection:
- Secure Dispatching Center of JD Cloud employs unified dispatching of global traffic through DNS resolution.
- The traffic is cleaned at the user's source station entry when the attack traffic is within the local protection threshold.
- When the attack exceeds the local protection threshold, the traffic is lead to advanced anti-DDoS, cleaned and returned to the user's source station.
- The local security components are integrated into console and can not only manage the configuration of local protection resources, but also connect to the advanced-protection cloud account to view the cloud linkage.
- Local security components support the deployment method of series or bypass.

Note: If the associated instance of advanced protection expires or is deleted, the linkage policy will not come into effect. Elastic protection will not come into effect if advanced prevention instances are underpaid. Please renew or recharge in time to ensure normal business.

# Scheme Advantages
1. The local component provides attack detection and protection. When the attack traffic exceeds the threshold value, it is moved to the cloud advanced anti-DDoS, and the cooperative defense mode can meet the regulatory requirements for independent and controllable data control of the government and the financial industry.
2. CNAME access, one-click automatic cloud uploading, simple configuration, reduces works of operation and maintenance personnel.
