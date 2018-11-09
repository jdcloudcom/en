# **Advanced Configuration**

Click**Domain Name List**--Select Accelerated Domain Name--**Advanced Configuration**

**Filter Parameter**

After being turned on, CDN will ignore the parameters following “?” in the request URL.

![image.png](https://img1.jcloudcs.com/cms/5c01bc8b-7074-4b97-8a70-9bb5009a9df320180118163149.png)

**range Back-to-source**

The range back-to-source means that the content of the request sent by the client to the origin server is a part of the byte range carrying requested content. The range back-to-source can reduce the back-to-source traffic consumption and improve the resource response time.

After being turned on, the origin server is required to support the range request.

![image.png](https://img1.jcloudcs.com/cms/e3069686-236f-45c0-8868-8c199c46983720180118163407.png)