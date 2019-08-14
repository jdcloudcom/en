
# Set Https

Click **Domain** to go to the configuration page and set the "communication protocol" in the "resource information"

**SSL Certificate**

Firstly upload the management certificate to SSL Certificate Service Platform and then you can choose the certificate corresponding to the domain according to the certificate name on CDN Console.

![image.png](https://github.com/jdcloudcom/cn/blob/cdn-new/image/CDN/ssl%E8%AF%81%E4%B9%A6%E7%AE%A1%E7%90%86.png)

**Customized Certificate**

If you do not upload the management certificate to SSL Certificate Service Platform, you can add the certificate content and secret key on CDN Console and also synchronize them to SSL Certificate Service Management Platform. You must set the name of this certificate when synchronizing.

![image.png](https://github.com/jdcloudcom/cn/blob/cdn-new/image/CDN/https.png)

**Jump Type**

1. Indicate by default: If client protocol is HTTP, then the request protocol to CDN node is HTTP, HTTPS in a similar way;

2. Indicate by HTTPS-->HTTP: If client protocol is HTTPS, then the request protocol to CDN node is HTTP;

3. Indicate by HTTP-->HTTPS: If client protocol is HTTP, then the request protocol to CDN node is HTTP;

 


