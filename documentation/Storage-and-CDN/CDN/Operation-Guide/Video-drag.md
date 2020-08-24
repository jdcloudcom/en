**Video Drag**

The video dragging function is only supported in the acceleration in China. In the Video on Demand scenario, online users can drag the video contents. When the function is enabled, CDN server will send the video contents of the requested start time or bytes to the requesting client

The dragging is realized by the bytes or the time. For byte dragging, it requires that the origin server can support the range back-to-source. The time dragging url format is https://www.a.com/content.mp4?start=20&end=50 (i.e. the playing starts from the 20s and ends at 50s.)

At present, only the MP4 file format is supported.

Click "[Domain List](https://cdn-console.jdcloud.com/domainlist)"--Select corresponding domain and log in "[Advanced Configuration](https://cdn-console.jdcloud.com/detail/advanced?id=pid-test1.jcloud.com)"--"Video Drag" to set and the change is located here as well.

![image.png](https://img1.jcloudcs.com/cms/381c8249-23ab-49db-b98c-e56537a2676f20180205110128.png) 
