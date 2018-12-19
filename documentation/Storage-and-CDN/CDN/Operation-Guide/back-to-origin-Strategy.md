# Back-to-source Policy

After adding a domain name, click **Accelerated Domain Name** to enter the basic information of domain name configuration. You can enter the **Back-to-source Configuration** information. The back-to-source modes fall into IP back-to-source, domain name back-to-source, and oss back-to-source, and it supports for both ip back-to-origin and domain back-to-origin customized ports, such as 1.1.1.1:80。

![image.png](https://img1.jcloudcs.com/cms/cf317c03-b662-4a37-a564-cee61f253fa220180118102313.png)                                               

**IP Back-to-source**

![image.png](https://github.com/jdcloudcom/cn/blob/cdn-new/image/CDN/IP%E5%9B%9E%E6%BA%90.jpg)

The back-to-source IP can support up to 10 IP back-to-sources, and the back-to-source weight is allocated as per equal ratio. The CDN round robin of back-to-source is automatically performed in the order of the IP list to achieve the effect of balancing back-to-source.

The IP back-to-source supports the primary/standby back-to-source. When the primary source does not respond, it will automatically return to the standby source to request content.


**Domain Name Back-to-source**

![image.png](https://github.com/jdcloudcom/cn/blob/cdn-new/image/CDN/%E5%9F%9F%E5%90%8D%E5%9B%9E%E6%BA%90.png)

l  Domain name back-to-source can configure up to 5 domain names. Back-to-source shall be performed according to priority levels. The priority level 1 is the highest, and when the domain name of the priority level 1 cannot be accessed, the domain name of the priority level 2 will be automatically accessed; and so on.

**oss Back-to-source**

![image.png](https://img1.jcloudcs.com/cms/25340540-9284-4691-80b9-3135e01d339020180118102645.png)

- When the "OSS Domain Name" is selected to be the back-to-source mode, the back-to-source address will display all OSS domain name information as a dropdown list (synchronized from the object storage service) for the customer to single-select.

**Back-to-source host**

It refers to the server domain name that the CDN node needs to access during the back-to-source process.

For example, the back-to-source host is www.a.com, the corresponding server after the CDN node requests resolution at www.a.com during the back-to-source process

When no back-to-origin host is configured, the back-to-origin host is your accelerated domain name

Support the customized back-to-origin host of domain back-to-origin. If the back-to-origin domain is test1.com and test2.com, respectively, the back-to-origin host corresponding to test1.com can be set to: origin1.com, while the back-to-origin host corresponding to test2.com is origin2.com

Default back-to-origin host means that in the case of IP back-to-source or domain back-to-origin, the back-to-origin address corresponds to the same back-to-origin host. If the back-to-origin domain is test1.com and test2.com, the default back-to-origin host is origin.com, that is, the back-to-origin host of both test1.com and test2.com is origin.com

 ![image.png](https://github.com/jdcloudcom/cn/blob/cdn-new/image/CDN/%E8%87%AA%E5%AE%9A%E4%B9%89%E5%9B%9E%E6%BA%90host.png)

**Origin Server Monitoring**

After turning on the origin server monitoring, the CDN distribution node will detect the availability of the origin server and the network delay according to the detection cycle. You may go to **Management** - **Cloud Monitoring** to configure and query the exception alarm information of the origin server.

![image.png](https://img1.jcloudcs.com/cms/ce478878-87ee-49a0-a29b-f72e6b61606f20180118102744.png)

-  The configuration content of the “Monitoring Link" is: (either-or)

- Standard monitoring link: Put a specific file under the root directory of the customer accelerated domain name, such as: www.jdcloud.com/monitor.gif
- Customized monitoring link: text box input, customer customized monitoring file and monitoring file path

- Detection period: fall into one minute and five minutes
- Headers: Refers to the identity verification information of the detector, and is customized by the customer in the form of key-value.

The detection content includes:

 ![image.png](https://img1.jcloudcs.com/cms/92dced92-dc84-4027-8f4c-351a0063743820180118101549.png)

 