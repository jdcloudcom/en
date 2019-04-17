# Back-to-origin following 302

When the user requests the resource and the CDN node is not cached, the node returns the back-to-origin request and the origin server returns the 302 status code and the redirection address; the CDN node directly requests the resource from the redirection address without returning 302 to the user

![image.png](https://github.com/jdcloudcom/cn/blob/cdn-new/image/CDN/%E5%9B%9E%E6%BA%90%E8%B7%9F%E9%9A%8F302.jpg)    
