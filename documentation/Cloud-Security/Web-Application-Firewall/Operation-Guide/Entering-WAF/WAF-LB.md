## **Load Balancer of WAF Origin Server**

  If your origin server has several servers, you can configure several IPs of origin server when making the domain access WAF. A maximum of 20 IPs of origin server are supported by WAF.

If you have configured several IPs of origin server, WAF will make the Load Balancer by IP Hash or round robin when making request for back-to-origin for the filtered access. At the same time, WAF will also check the health of several origin servers and detect the access state of all back-to-origin IPs. If any one of the source IPs makes no response, it will not forward the request to this source IP any longer till its access state responses Normal.

Assumed that there are 3 IPs of origin server (1.1.1.1, 2.2.2.2 and 3.3.3.3), you can configure them as per the figure shown as below.

**Description: ** If an agent (services such as CDN, DDoS and the like) has been used before WAF, you must select **Yes** under the item **Whether an agent has been used**.

Or after the addition

![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/WAF%E6%BA%90%E7%AB%99%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1-1.png)

of origin server IPs is configured, you need to designate the algorithm of Load Balancer: IP hash, round robin.
