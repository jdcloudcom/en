# **Add Website Details**

| Parameter         | Parameter Description                                                     | Sample            |
| ------------ | ------------------------------------------------------------ | --------------- |
| Protected Domain Name     | Description for Protected Domain Name: Support completing the extensive domain name, WAF will automatically match the second level domain with the extensive domain name. If you configure both extensive domain name and precise domain name at the same time, WAF limitedly uses the forwarding rules and protection strategies configured with the precise domain name. | www.jdcloud.com |
| Protocol Type     | Client protocol, i.e. protocol used by the client requiring to access the web server, including three protocol types of "HTTP", "HTTPS" and "HTTP & HTTPS". Note: If you select "HTTP& HTTPS" protocol, "Non-standard port" is not supported to configure | HTTP, HTTPS     |
| Server Address   | Source website's server address of the website domain will forward the filtered request to the server address after connected to WAF. Up to 20 source IP addresses are supported, separated by comma. WAF automatically performs health check and load balancer. | 1.1.1.1         |
| Port | HTTP protocol has 80 default ports; HTTPS protocol has 443 default ports.                | 80, 443         |
| Certificate         | After checking HTTPS protocol, you need to upload your certificate. After clicking **OK**, we will verify the certificate. The upload failure prompts you to modify it. If you need to modify it after the upload, you can click Edit button to modify your certificate.  |                 |
| Proxy         | Select according to the actual condition of the website. Check Yes if you do use the proxy, check No if not.  |                 |
| Load Balancer Algorithm | Configure multiple source website IPs, choose the load balancer mode of IPhash or poll, and WAF will implement load balancer according to your choice.  |                 |

 