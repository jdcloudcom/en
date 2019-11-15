# FAQ

**Q: What are the common pushing streaming methods?**

A: There are four common pushing streaming methods as follows:
* The mobile Android/iOS uses JD Cloud mobile live SDK to collect camera video or the third party software and pushes the video to RTMP pushing streaming address.
* The desktop or laptop uses the camera or workspace recording: use the third party software to collect the camera video or workspace image, push the video or workspace content to RTMP pushing streaming address. The third party pushing streaming software includes: OBS (recommended), XSplit, FMLE, etc.
* Video collection device: If the high definition camera device has HDMI or SDI output interfaces, the encoder can be encoded and the live content can be pushed to the live service in the way of RTMP streaming, you need to configure the live pushing streaming address to the RTMP publish address of the encoder.  
For the network camera device, if it supports RTMP pushing streaming, the live pushing streaming address can be configured to the RTMP release of the camera.
* Converting the video file to the video stream: Read a certain video file, and export in the RTMP stream method as the video source to release the video at the RTMP pushing streaming address of live service. It can be realized by use of ffmpeg command (available for Windows, Linux and Mac).



**Q: Which pushing streaming protocols are supported at present?**

A: The pushing streaming SDK product only supports the RTMP protocol.


**Q: Which playing protocols are supported?**

A: The mobile live SDK supports playing of multiple protocols of RTMP, HLS, and HDL.


