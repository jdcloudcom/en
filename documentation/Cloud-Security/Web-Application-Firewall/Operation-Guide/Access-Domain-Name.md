## **Access Domain Name**

Please add CNAME to the DNS service provider to bring Web Application Firewall Protection into effect.

Take JD Cloud DNS as an example:

1. First copy the generated protection domain name in the cloud WAF interface.

![TimLine图片20180515200411.png](http://img1.jcloudcs.com/cms/ab31748e-9fda-4fab-95a9-7de6dd39685f20180515200512.png)

2. Add a CNNAME record of JD Cloud DNS, record and fill in your existing domain name in the machine as aaa shown in the following figure, fill in the protection domain name generated in the WAF interface to the record value column (as ddd.bbb.com shown in the figure below),  fill other options in default. (If the domain name is not added, add the primary domain name first)

![TimLine图片20180515201408.png](http://img1.jcloudcs.com/cms/d94e8a0a-5f36-4f8c-9c3c-44ade00f93fb20180515201413.png)