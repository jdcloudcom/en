# Core Concepts  

**Live Broadcast**  
The live broadcast is that the streamer end pushes the video source to the cloud server to generate a live URL play address according to certain rules, the broadcast end plays the video after the broadcast end gets the playing address, the common playing protocols include RTMP, HLS; because the live broadcast is in real time, the live broadcast player does not have the progress bar. 

**Pushing Streaming**  
Pushing streaming means that the streamer end pushes the local audio video source to the cloud server, the pushed domain is required to be configured at the service end.

**RTMP**  
RTMP is a network protocol designed for real-time data communication. The protocol is versatile and can be used for pushing and live broadcast. The core idea is to split large video frames and audio frames, and then transmit them in the form of small data packets over the Internet, and it supports encryption, therefore, its privacy is relatively ideal, but the process of unpacking and packaging is relatively complex, so it is easy to encounter some unexpected stability problems in the case of massive concurrency. 

**HLS**  
The solution put forward by Apple divides video into small slices of videos in 5-10 seconds, and then manages them with m3u8 index table. Since the video downloaded by the client is the complete data of 5-10 seconds, the fluency of video is very good, but it also introduces large delays (the average HLS delay is around 10-30 seconds). Compared with FLV, HLS’ support on the iPhone and most Android mobile browsers is great, so it is often used for URL sharing of QQ and WeChat Moments.
