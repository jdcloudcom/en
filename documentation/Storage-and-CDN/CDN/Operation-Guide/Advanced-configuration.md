# **Advanced Configuration**

Click**Domain Name List**--Select Accelerated Domain Name--**Advanced Configuration**

**Filter Parameter**

After being turned on, CDN will ignore the parameters following "?" in the request URL.

![image.png](https://img1.jcloudcs.com/cms/5c01bc8b-7074-4b97-8a70-9bb5009a9df320180118163149.png)

**range Back-to-source**

The range back-to-origin function is only supported in the acceleration in China. The range back-to-origin refers to the byte range carrying request contents, which is part of the contents, from the client to the origin server. It can reduce back-to-origin traffic consumption and improve resource response time.

After being turned on, the origin server is required to support the range request. When range back-to-origin is just enabled, CDN will request resources from the origin server and cache contents. Then, the back-to-origin bandwidth will be increased and the origin server will withstand high back-to-origin pressure.

![image.png](https://img1.jcloudcs.com/cms/e3069686-236f-45c0-8868-8c199c46983720180118163407.png)

**Http Header setting**

The http header setting function is only supported in the acceleration in China. The http header setting can set the response header or request header. The parameters can be selected or manually entered. More than one value can be added and shall be separated with English comma.
