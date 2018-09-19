# Back-to-source Policy

After adding a domain name, click **Accelerated Domain Name** to enter the basic information of domain name configuration. You can enter the **Back-to-source Configuration** information. The back-to-source modes fall into IP back-to-source, domain name back-to-source, and oss back-to-source.

![image.png](https://img1.jcloudcs.com/cms/cf317c03-b662-4a37-a564-cee61f253fa220180118102313.png)                                               

**IP Back-to-source**

![image.png](https://img1.jcloudcs.com/cms/4b305baa-c773-4922-9cd7-b7afc64cd44d20180118102439.png)

l  The back-to-source IP can support up to 10 IP back-to-sources, and the back-to-source weight is allocated as per equal ratio. The CDN round robin of back-to-source is automatically performed in the order of the IP list to achieve the effect of balancing back-to-source.

l  The IP back-to-source supports the primary/standby back-to-source. When the primary source does not respond, it will automatically return to the standby source to request content.

**Domain Name Back-to-source**

![image.png](https://img1.jcloudcs.com/cms/c9c40a4e-2042-47bd-98f6-4cce01c3284f20180118102533.png)

l  Domain name back-to-source can configure up to 5 domain names. Back-to-source shall be performed according to priority levels. The priority level 1 is the highest, and when the domain name of the priority level 1 cannot be accessed, the domain name of the priority level 2 will be automatically accessed; and so on.

**oss Back-to-source**

![image.png](https://img1.jcloudcs.com/cms/25340540-9284-4691-80b9-3135e01d339020180118102645.png)

- When the "OSS Domain Name" is selected to be the back-to-source mode, the back-to-source address will display all OSS domain name information as a dropdown list (synchronized from the object storage service) for the customer to single-select.

**Back-to-source host**

It refers to the server domain name that the CDN node needs to access during the back-to-source process.

For example, the back-to-source host is www.a.com, the corresponding server after the CDN node requests resolution at www.a.com during the back-to-source process

 ![image.png](https://img1.jcloudcs.com/cms/35c3ff38-b7a9-45c3-8509-c323488936f520180118102722.png)

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

 