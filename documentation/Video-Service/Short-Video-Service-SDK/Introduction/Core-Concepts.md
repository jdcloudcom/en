# Core Concepts  

**Code Rate**  
Code rate refers to data traffic that a video file uses per unit of time, which is also called code stream or code stream rate and it is the most important part of picture quality control in video encoding. The unit of measure is "bit per second" (bit/s or bps), which Kbps (the number of thousands of bits per second) or Mbps are often used. Within a certain range, the higher the code rate is, the clearer the video and the larger the file will be. 

**Resolution**  
Resolution refers to the count of pixels in one frame of picture, e.g., 1280x720. Theoretically, the higher the resolution is, the clearer the image will be, but the higher the resolution also means the larger files and longer processing time. Considering the performance difference of different devices on the mobile terminal, it is recommended to set the resolution of 720p and below.

**Frame Rate**  
Frame rate refers to the measurement unit for video display frames per unit of time (Frames Per Second, fps for short), i.e., count of images refreshed per second. Generally, the frame rate is 25fps and above. If the frame rate is too low, we can sense that the screen is twinkling and disconnected. Under normal circumstances, the higher the frame rate is, the smoother the image and the larger the file will be. 

**Video Rotation**  
Video rotation means that video files are selected in a clockwise direction, and JD Cloud Short Video SDK supports rotating as per 90 degrees. When the proportion changes after rotation, it can be filled according to the rule of proportion transformation.

**Fill Video**  
When there is inconsistency between the length-width ratio of the resolution of a material image or video and the length-width ratio of the resolution of the video exported, the video will be filled. The two commonly used modes for filling video are as follows:  
1. Clipping mode: keep length-width ratio, clip image and display the intermediate region only.  
2. Zoom mode: keep length-width ratio to wholly display image and fill the up and down or left and right with color.

**Video Speed Changing**  
Changing speed refers to the adjustment of video playing speed. The playing speed of the original video is 1 times be default, and the playing speed of the edited video can be adjusted to 1/2, 3/4, 1.5 and 2 times according to demand.
