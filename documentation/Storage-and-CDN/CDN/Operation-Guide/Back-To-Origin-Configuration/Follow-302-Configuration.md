# Back-to-origin following 302

The back-to-origin follow 302 setting function is only supported in the acceleration in China. When the user requests resources not cached by CDN node, the node forwards the back-to-origin request and the origin server returns the 302 status code and redirection address. Then the CDN node directly request the resources to the redirection address without returning 302 to the user

![image.png](https://github.com/jdcloudcom/cn/blob/cdn-new/image/CDN/%E5%9B%9E%E6%BA%90%E8%B7%9F%E9%9A%8F302.jpg)    
