**Video Drag**

In the VOD scenario, the netter can drag the video contents. When enabling the function, the CDN server will send the request start time or video contents of bytes to the request client.

The dragging is realized by the bytes or the time. For byte dragging, it requires that the origin server can support the range back-to-source. The time dragging url format is https://www.a.com/content.mp4?start=20&end=50 (i.e. the playing starts from the 20s and ends at 50s.)

At present, only the MP4 file format is supported.

Click “[Domain List](https://cdn-console.jdcloud.com/domainlist)”--Select corresponding domain and log in “[Advanced Configuration](https://cdn-console.jdcloud.com/detail/advanced?id=pid-test1.jcloud.com)”--“Video Drag” to set and the change is located here as well.

![image.png](https://img1.jcloudcs.com/cms/381c8249-23ab-49db-b98c-e56537a2676f20180205110128.png) 
