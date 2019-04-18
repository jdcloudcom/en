# Functions and Features 

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

