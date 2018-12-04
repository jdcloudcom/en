# Basic Architecture

Anti-DDoS Pro is the pay-added service that launched when the Internet server is not available after being attacked by large traffic of DDoS attacks.

The user opens the service of  Anti-DDoS Pro, and the configurations lead the IP addresses visited by the user to the IP address provided by the Anti-DDoS Pro. By carrying out real-time detection and cleaning of all abnormal traffic through the Anti-DDoS Pro service, it ensures that only the normal flow can be returned to the user server, thus ensuring the stability and reliability of the source station.

## Anti-DDoS Pro Unaccessed
When the Anti-DDoS Pro is unaccessed, all the normal and abnormal visits will arrive directly to the source station. In case of DDoS attacks, the source station can be easily broken down.

![Anti-DDoS Pro Architecture Diagram](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/ipant%20002.png)

## After Anti-DDoS Pro Access
After access to Anti-DDoS Pro business, all access traffics to the source station will be detected in real time through Anti-DDoS Pro. The Anti-DDoS Pro has strong protection mechanism, and can only re-inject the cleaned traffic to the source station after going through the traffic cleaning at Anti-DDoS Pro machine room and the four-layer and seven-layer attacks are filtered off.
![Anti-DDoS Pro Architecture Diagram](https://github.com/jdcloudcom/cn/blob/edit/image/Advanced%20Anti-DDoS/ipant%20001.png)

