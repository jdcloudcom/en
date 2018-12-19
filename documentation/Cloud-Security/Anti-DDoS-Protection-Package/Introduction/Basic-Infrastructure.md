# Basic Architecture

Anti-DDoS Protection Package is a value-added service for promoting anti-ddos capability of the business in JD Cloud.

After you subscribe the protection package service, obtain the DDoS protection capability corresponding to the package at once, without complicated configuration or replacing Public IP address. It currently supports promotion of anti-D capacity of multiple businesses in JD Cloud, such as virtual machine, load balancer, container, Web application server.

## Product architecture
The Anti-DDoS Protection Package of JD Cloud, as the updated version of Anti-DDoS Basic, has the architecture diagram consistent with the Anti-DDoS Basic, but will provide more powerful DDoS protection capability.

![防护包架构图](https://github.com/jdcloudcom/cn/blob/Anti-DDoS/image/Anti-DDoS-Protection-Package/防护包架构图.png)

As shown in the diagram, at the exit of machine room of JD Cloud, the bypass is deployed with DDoS attack detection and cleaning equipment. The network traffic of Internet is detected in real time. Once there is traffic abnormality found, all traffic is automatically pulled to the cleaning equipment; upon completion of a series of traffic cleaning, clean traffic will be back to the user server.
