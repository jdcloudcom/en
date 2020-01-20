# Back-to-origin Policy

After a domain is added, click **Accelerated Domain** to enter the basic information of domain configuration. You can enter the [Back-to-origin Configuration] information. The back-to-origin modes fall into IP back-to-origin and domain back-to-origin. Meanwhile, customized ports of ip back-to-origin and domain back-to-origin are supported, such as 1.1.1.1:80.

![选择加速域名](/image/Intelligent-Edge-Security/选择加速域名.png)

## IP Back-to-origin

![IP回源](/image/Intelligent-Edge-Security/IP回源.png)

The back-to-origin IP can support up to 10 IP back-to-origins, and the back-to-origin weight is assigned as per equal ratio. The CDN round robin of back-to-origin is automatically performed in the order of the IP list to achieve the effect of balancing back-to-origin.

The IP back-to-origin supports the primary/standby back-to-origin. When the primary source does not respond, it will automatically return to the standby source to request content.

## Domain Back-to-origin

![域名回源](/image/Intelligent-Edge-Security/域名回源.png)

l  Domain back-to-origin can configure up to 5 domains. Back-to-origin shall be performed according to priority levels. The priority level 1 is the highest, and when the domain of the priority level 1 cannot be accessed, the domain of the priority level 2 will be automatically accessed; and so on.

## Back-to-origin host

It refers to the server domain that the CDN node needs to access during the back-to-origin process.

For example, the back-to-origin host is www.a.com, the corresponding server after the CDN node requests resolution at www.a.com during the back-to-origin process;

When no back-to-origin host is configured, the back-to-origin host is your accelerated domain

Support the customized back-to-origin host of domain back-to-origin. If the back-to-origin domain is test1.com and test2.com, respectively, the back-to-origin host corresponding to test1.com can be set to: origin1.com, while the back-to-origin host corresponding to test2.com is origin2.com

Default back-to-origin host means that in the case of IP back-to-origin or domain back-to-origin, the back-to-origin address corresponds to the same back-to-origin host. If the back-to-origin domain is test1.com and test2.com, the default back-to-origin host is origin.com, that is, the back-to-origin host of both test1.com and test2.com is origin.com

![回源host](/image/Intelligent-Edge-Security/回源host.png)

## Origin Server Monitoring

After the origin server monitoring is enabled, the CDN distribution node will detect the availability of the origin server and the network delay according to the detection cycle. You may go to [Management] - [Cloud Monitoring] to configure and query the exception alarm information of the origin server.

![源站监控](/image/Intelligent-Edge-Security/源站监控.png)

- The configuration content of the "Monitoring Link" is: (either-or)
- Standard monitoring link: Put a specific file under the customer’s accelerated domain root directory
- Custom Metric Monitoring link: Text box input, Custom Metric Monitoring file and monitoring file path
- Detection period: Fall into one minute and five minutes
- Headers: Refer to the identity verification information of the detector, customized by the customer in the form of key-value

##  Protocol Following Back-to-origin

After the protocol following back-to-origin is configured, the protocol used by the back-to-origin server is the same as the protocol of the user request resource. When the user requests the resource with the http protocol, the CDN back-to-origin server uses http protocol to get the resource; and when the user requests the resource with the https protocol, the CDN back-to-origin server uses https protocol to get the resource.

![协议跟随回源](/image/Intelligent-Edge-Security/协议跟随回源.png)