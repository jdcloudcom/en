# Core Concept

**Code Rate**  
Code rate refers to data traffic that a video file uses per unit of time, which is also called code stream or code stream rate and it is the most important part of picture quality control in video encoding. The unit of measure is "bit per second" (bit/s or bps), which Kbps (the number of thousands of bits per second) or Mbps are often used.

**Resolution**  
Resolution refers to the count of pixels in one frame of picture, e.g., 1280x720, which determines the fine extent of video picture details. In general, the higher the resolution of video, the more pixels it contains and the clearer the picture will be.

**Frame Rate**  
Frame rate refers to the measurement unit for video display frames per unit of time (Frames Per Second, fps for short), i.e., count of images refreshed per second. Generally, the frame rate is 25fps and above. If the frame rate is too low, we can sense that the screen is twinkling and disconnected.

**Transcode**  
Video transcode refers to converting source video stream into several video streams with different resolutions, code rates and frame rates to adapt different network bandwidths, terminal handling abilities and requirements of users.

**Forwarding Protocol**  
Generally, the live video source input protocol, commonly used in the market, is rtmp, while the output protocols mostly adopt rtmp, http-hls and http-flv. To facilitate coverage of different terminals, it needs to make forwarding protocol output to the input source.


**CNAME Record**

It is a Canonical Name record; when DNS system is inquiring names on the left of CNAME,
it shall turn to names on the right of CNAME for inquiry again, until the final name of PTR or A is tracked;
it shall respond if the inquiry is successful or it is a failure.

**CNAME Domain Name**

To accelerate domain name, the CNAME record shall be used; after setting pushing and pulling streaming domain names in console of JD Cloud live broadcast, the user shall get an accelerated CNAME domain name and the user shall set a record according to the domain name service provider,
CNAME
taking his/her domain name as CNAME to point to the domain name and then all the requests of this domain name shall be redirected to nodes of JD Cloud CND.

