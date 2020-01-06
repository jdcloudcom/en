# Core Concepts  

**ROI Encoding**  
ROI coding, namely region-of-interest coding, refers to a situation where the high-quality video coding that meets picture quality requirements for watching and network transmission or space storage requirements can be provided by setting a region of interest (generally, the human face) when the network bandwidth or bucket is limited.

**Video Stitching**  
Video stitching refers to a situation where the main direction of a film is adjusted to the subject to be expressed by stitching and processing videos shot by a number of lenses of a VR camera according to time and space.

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

It is an alias record (Canonical Name); when the DNS system queries the name on the left side of CNAME,
it will go to the name on the right side of CNAME and then query it until the last PTR or A name,
and will respond after successful query; otherwise it fails.

**CNAME Domain**

The CDN domain acceleration requires the CNAME record. After the pushing and pulling streaming domains are configured in JD Cloud Live Console, users will get an accelerated CNAME domain. Users need to configure a record at the domain service provider
CNAME
and point their own domain to this domain as CNAME, so that all requests for this domain will be redirected to the node of JD Cloud CDN.

