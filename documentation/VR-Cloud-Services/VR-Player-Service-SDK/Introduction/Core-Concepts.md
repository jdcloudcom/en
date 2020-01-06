# Core Concepts  

**RTMP**  
RTMP is a network protocol designed for real-time data communication. The protocol is versatile and can be used for pushing and live broadcast. The core idea is to split large video frames and audio frames, and then transmit them in the form of small data packets over the Internet, and it supports encryption, therefore, its privacy is relatively ideal, but the process of unpacking and packaging is relatively complex, so it is easy to encounter some unexpected stability problems in the case of massive concurrency. 

**HLS**  
The solution put forward by Apple divides video into small slices of videos in 5-10 seconds, and then manages them with M3U8 index table. Since the video downloaded by the client is the complete data of 5-10 seconds, the fluency of video is very good, but it also introduces large delays (the average HLS delay is around 10-30 seconds). Compared with FLV, HLS’ support on the iPhone and most Android mobile browsers is better.

**FLV**  
The FLV (FLASH VIDEO) protocol is what Adobe Company mainly popularizes. Its format is extremely simple, with just a few tag header information added to large video frames and audio video headers. Due to this simplicity at the top, it is mature for both delayed performance and large-scale concurrency. The only downside is that the support on the mobile browser is very limited, but as the live protocol for the mobile terminal App, it is quite appropriate. 

**Encapsulation Format**  
Encapsulation format (Format) is to put the encoded and compressed video stream and audio stream according to a certain format specifications into a file. Common encapsulation formats include MP4, FLV, M3U8, TS, MOV, etc.

**Resolution**  
Resolution refers to the count of pixels in one frame of picture, e.g., 1280x720. Theoretically, the higher the resolution is, the clearer the image will be, but the higher the resolution also means the larger files and longer processing time. Considering the performance difference of different devices on the mobile terminal, it is recommended to set the resolution of 720p and below.

**Code Rate**  
Code rate refers to data traffic that a video file uses per unit of time, which is also called code stream or code stream rate and it is the most important part of picture quality control in video encoding. The unit of measure is "bit per second" (bit/s or bps), which Kbps (the number of thousands of bits per second) or Mbps are often used. Within a certain range, the higher the code rate is, the clearer the video and the larger the file will be. 

**Frame Rate**  
Frame rate refers to the measurement unit for video display frames per unit of time (Frames Per Second, fps for short), i.e., count of images refreshed per second. Generally, the frame rate is 25fps and above. If the frame rate is too low, we can sense that the screen is twinkling and disconnected. Under normal circumstances, the higher the frame rate is, the smoother the image and the larger the file will be.
