# Features

**1. Pushing Streaming SDK**  
<table>
<tr>
    <td>Functions</td>
    <td>Description</td>
    <td>iOS</td>
    <td>Android</td>
</tr>
<tr>
    <td>Support Software and Hardware Encoding</td>
    <td>Software encoding, hardware encoding and software encoding compatible mode are supported. Automatic switch between software encoding and hardware encoding is achievable </td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Network Self-adaption</td>
    <td>Automatic real-time computing of actual network condition is supported, and network self-adaption is realized. The target code rate can be dynamically adjusted based on the actual network condition to ensure the video smoothness while providing higher video quality.</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Audio AAC</td>
    <td>AAC is supported for audio encoding (LOW, HE and HE_V2 are supported)</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Video H.264/H.265</td>
    <td>H.264 / H.265 are supported for video encoding</td>
    <td>√</td>
    <td>Support H.264</td>
</tr> 
<tr>
    <td>RTMP Pushing Streaming</td>
    <td>RTMP protocol is supported for pushing streaming protocol</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Customized Preview and Pushing Streaming Resolution</td>
    <td>Preview and pushing streaming resolution can be set freely and respectively</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Preview with Multiple Methods</td>
    <td>Preview is supported through GLSurfaceView or TextureView</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Customized Target Code Rate</td>
    <td>Audio and video target code rate can be set freely and respectively, the audio code rate is suggested to be 32-128, and the video code rate is suggested to be 400-1000.</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Mute Pushing Streaming</td>
    <td>Mute pushing streaming is available for setting, in which case only the video is pushed without collecting the streamer’s voice.</td>
    <td>√</td>
    <td>√</td>
</tr>     
<tr>
    <td>Pushing Streaming Screen Shot</td>
    <td>One-click screen shot is allowed during pushing streaming and saved to local photo album</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Pushing Streaming Recording</td>
    <td>Video clips of pushing streaming can be recorded during pushing streaming and saved to local photo album.</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Dynamic Switch of Pushing Streaming between Portrait and Landscape Orientation</td>
    <td>The pushing streaming orientation can be adjusted dynamically based on the mobile phone orientation of pushing streaming terminal during pushing streaming so as to ensure the consistency of picture orientation of the view terminal.</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Background Pushing Streaming</td>
    <td>During live streaming, when the streamer switch to another app or other operation causing the live pushing streaming APP entering into the background, normal pushing streaming is supported for background audio and video</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Front and Rear Camera Dynamic Switch</td>
    <td>Front and rear camera dynamic switch is supported during pushing streaming</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Pushing Streaming of Image</td>
    <td>Image function of front camera with which the preview picture of the streamer terminal is consistent with the playing terminal picture after the image function is enabled</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Enable and Disable Flashlight</td>
    <td>Enabling and disabling flashlight is supported under the rear camera mode</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Automatic and Manual Focusing</td>
    <td>Automatic focusing, single-finger touch focusing (manual focusing) and photometry</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Beauty Filter</td>
    <td>Six levels of beauty and six kinds of filter templates are supported</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Audio Effects</td>
    <td>Middle-aged man, Lolita, robot, grave and other audio effects are supported</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Background Music</td>
    <td>Calling built-in background music and local music is supported</td>
    <td>Built-in is supported rather than local</td>
    <td>√</td>
</tr> 
<tr>
    <td>Mix</td>
    <td>The volume of background music and the streamer’s voice can be adjusted respectively to form mix</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>In-ear Monitor</td>
    <td>In-ear monitor is supported, and streamers can hear their own voices from the earphone</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Pure Audio Pushing Streaming</td>
    <td>Pure audio pushing streaming is supported, and during pushing streaming, audio & video pushing streaming and pure audio pushing streaming may be switched to each other</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Audio Tone Rising and Falling</td>
    <td>Audio tone adjustment of 7 levels is supported</td>
    <td>√</td>
    <td>√</td>
</tr>     
<tr>
    <td>Support Addition of Watermark</td>
    <td>Image, character and time stamp watermarks are supported, with the watermark location, size, direction and transparency adjustable</td>
    <td>√</td>
    <td>√</td>
</tr>    
<tr>
    <td>Background Image Pushing Streaming</td>
    <td>In case of pure audio pushing streaming or when the streamer leaves temporarily, a picture may be selected as the pushing streaming picture to beautify the live room</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Screen Recording</td>
    <td>Taking the mobile phone screen as the live source pushing streaming is supported</td>
    <td>√</td>
    <td>√</td>
</tr>    
<tr>
    <td>Picture in Picture Pushing Streaming</td>
    <td>Inserting another video in the picture for pushing streaming is supported during pushing streaming</td>
    <td>√</td>
    <td>√</td>
</tr>    
<tr>
    <td>Pushing Streaming of Floating Window</td>
    <td>Previewing the window is supported at the top layer in the form of floating window after page switch in APP, and manual movement of floating window location is allowed</td>
    <td>√</td>
    <td>√</td>
</tr>     
<tr>
    <td>Audio Noise Reduction</td>
    <td>Filtering and reducing the background noise is allowed to make the streamer’s voice more clear</td>
    <td>√</td>
    <td>√</td>
</tr>    
<tr>
    <td>Brush Pushing Streaming</td>
    <td>Painting and erasing on the screen is allowed with brush tools during pushing streaming</td>
    <td>√</td>
    <td>√</td>
</tr>              
</table>

**2. Playing SDK** 
<table>
<tr>
    <td>Functions</td>
    <td>Description</td>
    <td>iOS</td>
    <td>Android</td>
</tr>
<tr>
    <td>Second-level Display of the First Screen</td>
    <td>The second-level display of the first screen is supported and playing is quickly made </td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Live Video Catch</td>
    <td>The live video catch for protocols such as RTMP and HTTP-FLV is supported, guarantee synchronization of audios and videos</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Support to Multi-protocol Live Video</td>
    <td>Playing of live videos adopting protocols such as RTMP, HTTP-FLV and HLS is supported</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Snapshot</td>
    <td>Live video about software decoding and playing of snapshot is supported</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Support to Multi-Format Video on Demand</td>
    <td>Playing of local files is supported and supported formats include FLV, TS, MPEG, MOV, M4V, MP3, GIF, AVI, ASF, MKV, WAV, WEBM, RM and others</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Software Decoding and Hardware Decoding</td>
    <td>Software decoding and hardware decoding are supported</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Video Rotation</td>
    <td>Rotation angles of playing pictures can be set in such a way the ration is made anticlockwise and the rotation angles include 0, 90, 180 and 270 degrees.</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Video Picture Zoom Mode</td>
    <td>Three video picture zoom modes are supported, including filling, clipping and full screen</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Image Playing</td>
    <td>When playing images, the pushing streaming pictures and the preview pictures are the same</td>
    <td>√</td>
    <td>√</td>
</tr>     
<tr>
    <td>Obtaining Local File and Video Information</td>
    <td>The audio and video information description of files can be obtained without starting playing, such as file encapsulation format, video coding format, video width and height, video coding format, sampling rate, sound track and others
Obtain local thumbnails, set width and height of output thumbnails and set thumbnails necessary for specific time</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Obtaining Original Video and Audio Data</td>
    <td>Obtaining decoded video yuv/rgb and audio PCM is supported</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Brightness Regulation</td>
    <td>Brightness of player can be adjusted according to demands</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Volume Regulation</td>
    <td>Support to Volume Regulation and Mute Playing</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Volume Up</td>
    <td>Volume of original video can be increased by two times at most</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Background Playing</td>
    <td>Background playing can be configured, which is disabled by default, and supports audio only</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Pure Audio Playing</td>
    <td>Video can be turned off and pure audio can be played</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>H.264\H.265</td>
    <td>H.264 and H.265 playing is supported</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Support to seek</td>
    <td>Support to seek search is supported</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Multiple-speed Playing</td>
    <td>Multiple-speed playing, 0.5-2 times real-time variable speed enabling, switch and disabling are supported</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Encrypted Playing</td>
    <td>Encrypted playing is supported and cloud cooperation and support is required</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>URL Playing</td>
    <td>The network video can be played by entering URL or scanning QR code</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Player Screen Lock</td>
    <td>The screen lock of player is supported, to avoid misoperation. If the screen lock is enabled, all function keys of the player are out of function, such as the brightness regulation, voice and so on, and such function keys can be resumed when the screen lock is disabled</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Playing-and-buffering</td>
    <td>Parts of the video can be automatically buffered in playing process and cache size parameters can be set</td>
    <td>√</td>
    <td>√</td>
</tr> 
<tr>
    <td>Dynamic Reconnection</td>
    <td>SDK dynamic reconnection of live video is supported</td>
    <td>√</td>
    <td>√</td>
</tr>     
<tr>
    <td>seek in cache</td>
    <td>Buffered video contents cannot be cleared and are suitable for quick seek</td>
    <td>√</td>
    <td>√</td>
</tr>    
<tr>
    <td>Pre-loading Play</td>
    <td>A next video will be pre-loaded when the current one is playing and this function is suitable for playing of short video</td>
    <td>√</td>
    <td>√</td>
</tr>
<tr>
    <td>Gif Snapshot</td>
    <td>Video or GIF motion graphic snapshot is allowed at a customized location during video playing</td>
    <td>√</td>
    <td>√</td>
</tr>    
<tr>
    <td>Definition Switch</td>
    <td>Multi-resolution manual and automatic switch of streaming is supported for VOD</td>
    <td>√</td>
    <td>√</td>
</tr>    
<tr>
    <td>Multi-instance</td>
    <td>Replaying with one instance is supported without creating a new instance for each playing</td>
    <td>√</td>
    <td>√</td
</tr>     
<tr>
    <td>View in Floating Window</td>
    <td>After switch among pages in APP, the player is displayed on the new page in the form of floating window, and during switch, seamless connection is achievable without destroy and recreation. The floating window may be manually moved to any location on the screen</td>
    <td>√</td>
    <td>√</td>
</tr>                
</table>

