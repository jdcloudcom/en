## Pushing Streaming Examples    

1. Add preview View in a layout file and GLSurfaceView and TextureView are supported now:  
```
<android.opengl.GLSurfaceView
            android:id="@+id/gl_live_push"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_alignParentBottom="true"
            android:layout_alignParentTop="true" />
```

2. Initialize the preview view by using ButterKnife:  
```
    @BindView(R.id.gl_live_push)
GLSurfaceView mGLSurface;
``` 

3. Create JDCloudLive instances and configure related pushing streaming parameters:
```
JDCloudLive mStreamer = new JDCloudLive(this);
// Set the push url
mStreamer.setUrl("rtmp://pu.jdcloud.com/android/ {streamName}");
// Set the push stream resolution
mStreamer.setPreviewResolution(BaseConstants.VIDEO_RESOLUTION_360P);
mStreamer.setTargetResolution(BaseConstants.VIDEO_RESOLUTION_360P);
// Set the encoding method (hard, soft)
mStreamer.setEncodeMethod(BaseConstants.ENCODE_METHOD_HARDWARE);
mStreamer.setVideoEncodeProfile(VideoEncodeFormat.ENCODE_PROFILE_HIGH_PERFORMANCE);
// Set the push video rate, the three parameters are the initial code rate, the highest code rate, the lowest bit rate
int videoBitrate = 800;
mStreamer.setVideoKBitrate(videoBitrate * 3 / 4, videoBitrate, videoBitrate / 4);
// Set the rotation angle of the screen
mStreamer.setRotateDegrees(0);
// Set the start preview to use the front or rear camera
mStreamer.setCameraFacing(CameraCapture.FACING_FRONT);
// Set the preview view
mStreamer.setDisplayPreview(mGLSurface);
```
4. Create pushing streaming event listening:  
Note: All callbacks are run in the creation threads of JDCloudLive and are suggested to be run in the main thread. The developer can run relevant APIs in JDCloudLive, but shall not conduct any time-consuming operation in these callbacks.  
```
// Set the Info callback, you can receive notification information
mStreamer.setOnInfoListener(new JDCloudLive.OnInfoListener() {
            @Override
            public void onInfo(int i, int i1, int i2) {
                
            }
        });
// Set the error callback, after receiving the callback, there is usually a serious error, such as network disconnection, etc.
// The SDK will stop pushing the stream internally, and the APP can add retry logic here based on the callback type and requirements.
mStreamer.setOnErrorListener(new JDCloudLive.OnErrorListener() {

            @Override
            public void onError(int i, int i1, int i2) {
                
            }
        });
```
5. Start pushing streaming:  
Note: For the first preview initiation, the call is valid only when the event BaseConstants.LIVE_CAMERA_INIT_DONE is received in the callback OnInfoListener.  
```
mStreamer.startPush();
```
6. Common methods available for dynamic setting before and during pushing streaming:
```
// Set the rotation angle of the screen, support 0, 90, 180, 270
mStreamer.setRotateDegrees(0);
// Set the start preview to use the front or rear camera
mStreamer.setCameraFacing(CameraCapture.FACING_FRONT);
// Switch the flash, true is on, false is off
mStreamer.toggleTorch(true);
// Set the beauty filter, please refer to the topic for specific instructions on the beauty filter.
ImgFilterBase beautyFilter = new ImgBeautyProFilter(mStreamer.getGLRender(), PushActivity.this, 3);
beautyFilter.setGrindRatio(beautyVal);
beautyFilter.setWhitenRatio(beautyVal);
beautyFilter.setRuddyRatio(2 * beautyVal - 1);
mStreamer.getImgTexFilterMgt().setFilter(filter);
```
7. Stop Pushing Streaming:
```
mStreamer.stopPush();
```
8. Callback treatment for Activity Life Cycle:
```
public class PushActivity extends Activity {
    @Override
    public void onResume() {
        super.onResume();
mStreamer.onResume();
        mStreamer.stopImageCapture();
// Normally open the camera preview in onResume
        mStreamer.startCameraPreview();
//If the DummyAudio module is cut in onPause, you can restore it here.
        mStreamer.setUseDummyAudioCapture(false);
        }

    @Override
    public void onPause() {
        super.onPause();
        mStreamer.onPause();
        // Generally stop camera capture here
        mStreamer.stopCameraPreview();
// If you want the app to cut the background and stop recording the sound of the anchor, you can switch to
// DummyAudio acquisition, the module will replace the mic acquisition module to generate mute data, while releasing the occupied mic resources
        mStreamer.setUseDummyAudioCapture(true);
mStreamer.startImageCapture(mBgImagePath);
    }

    @Override
    public void onDestroy() {
        // Clean up related resources
        mStreamer.release();
super.onDestroy();
    }
```
## More APIs

* **Mute Setting**  
```
mStreamer.setMuteAudio(true);//Set the mute mode and false refers to the non-mute mode  
```
* **Screen Shot During Pushing Streaming**
 ```
mStreamer.requestScreenShot(new GLRender.ScreenShotListener() {
    @Override
    public void onBitmapAvailable(Bitmap bitmap) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss",
                Locale.getDefault());
        String path = Environment.getExternalStorageDirectory().getPath() +
                "/jdc_live_" + dateFormat.format(date) + ".jpg";
        CommonUtils.saveBitmap(bitmap, path);
        mUIHandler.obtainMessage(MSG_SHOW_IMAGE_TOAST, path).sendToTarget();
    }
});
```
* **Recording Video During Pushing Streaming**  
During live video, once **Local Recording** is clicked, the screen can be recorded to the local in the recording format MP4  
```
mStreamer.startRecord(Environment.getExternalStorageDirectory().getPath()+"/jdc_live_record.mp4");//The parameter refers to the output path
```
* **Pure Audio Pushing Streaming**  
If the live audio is the live video scenario, the pure audio pushing streaming can be started by calling methods below.  
```
mStreamer.setAudioOnly(true);
```
* **Watermark**  
Watermarks can be added to the live video and the principles are that the watermark and images are added before video coding in SDK. Watermark type setting supports the image, the character, the time and the like.
```
mStreamer.showWaterMarkLogo(bitmap, x, y, w, h, alphaVal);//Image
mStreamer.showWaterMarkLogo(path, x, y, w, h, alphaVal);//Location of Specified Image
mStreamer.showWaterMarkTime(x, y, w,colorVal, alphaVal);//Time
mStreamer.showWaterMarkText(text, y, w, mWaterMarkColorVal, mWaterMarkAlphaVal);//Character
```
* **Audio Call**  
In case of live video, your favorite local music can be set to be played during the live video
```
mStreamer.getAudioPlayerCapture().setVolume(0.4f);//Set volume
mStreamer.setEnableAudioMix(true);
String audioPath = "file://" + Environment.getExternalStorageDirectory().getPath() + "/jdc_audio/" + titleView.getText().toString() + ".mp3";
mStreamer.startBgm(audioPath, true);// audioPath refers to the local music url
```
* **Audio Tone Rising and Falling**  
The ton rising and falling is a special accompaniment treatment when the streamer sings a song, i.e. the process from low-deep voice to high-pitched voice. It is more suitable for professional live singing and supports 7 grades [-3~3]. The minus number refers to the falling tone, the positive number refers to the rising tone, and 0 refers to the original tone.
```
AudioEffectFilter audioEffect = new AudioEffectFilter(
                        AudioEffectFilter.AUDIO_EFFECT_TYPE_PITCH);
audioEffect.setPitchLevel(mVoiceRiseFallLevel);
               mStreamer.getAudioPlayerCapture().getAudioFilterMgt().setFilter(audioEffect);
```
* **In-ear monitor**  
It means that when the streamer sings with the earphone in the ear, the streamer’s voice shall be fed back in real time. This is because the streamer’s voice is transmitted to the ear via the head skeleton (the solid), while the voice heard by the audience is finally transmitted to the ear via the air medium. Voices heard via the two methods are very different. Therefore, the streamer needs to hear the audience effect.
The in-ear monitor can be turned on as follows:   
```
mStreamer.setEnableAudioPreview(true);
```
* **Rotation lock**  
If the screen is unlocked, the live video picture will be rotated when the cellphone is rotated, but the pushing streaming can be rotated for corresponding angels only by calling the methods below.
```
mStreamer.setRotateDegrees(rotation);
```
* **Automatic focusing**  
Click the screen and then automatic focusing is made according the focusing coordination where the finger touches.
```
CameraTouchHelper cameraTouchHelper = new CameraTouchHelper();
cameraTouchHelper.setCameraCapture(mStreamer.getCameraCapture());
mGLSurface.setOnTouchListener(cameraTouchHelper);
cameraTouchHelper.setCameraHintView(mCameraHintView);// mCameraHintView refers to the view displayed on the focus
```
* **Audio Noise Reduction**  
During live video, surrounding noise can be treated to guarantee that the streamer’s voice is clearer.
```
mStreamer.setEnableAudioNS(true);//Enable audio noise reduction function
```
* **Pushing Streaming of Image**  
Actually, images on the live video end are always frontal. In case of switch, the camera of the live video end remains unchanged, but the audience’s camera is reversed. The enabling method is as follows:
```
mStreamer.setFrontCameraMirror(on);
```
* **Voice Change**  
The voice change refers to the special treatment of changing the streamer’s voice to a funny voice, to highlight interaction interests. The voice change supports effects such as the middle-aged man, Lolita, serious and robot. The four voice change effects are respectively used for:
```
AudioEffectFilter.AUDIO_EFFECT_TYPE_MALE
AudioEffectFilter.AUDIO_EFFECT_TYPE_FEMALE
AudioEffectFilter.AUDIO_EFFECT_TYPE_HEROIC
AudioEffectFilter.AUDIO_EFFECT_TYPE_ROBOT
Four parameter controls are as follows and the setting methods are as follows:
List<AudioFilterBase> filters = new LinkedList<>();
AudioEffectFilter audioEffect = new AudioEffectFilter(
                        AudioEffectFilter.AUDIO_EFFECT_TYPE_HEROIC);
filters.add(audioEffect);
mStreamer.getAudioFilterMgt().setFilter(filters);
```
* **Beauty**  
The beauty levels include level 0-5. The higher the level, the better the beautifying effects. Setting methods are as follows:
```
ImgFilterBase beautyFilter = new ImgBeautyProFilter(mStreamer.getGLRender(), PushActivity.this, 3);
beautyFilter.setGrindRatio(beautyVal);// beautyVal Value [o,1]
beautyFilter.setWhitenRatio(beautyVal);
beautyFilter.setRuddyRatio(2 * beautyVal - 1);
mStreamer.getImgTexFilterMgt().setFilter(filter);  
```
* **Filter**  
Filter modes include: clean, daylight, landscape, portrait, Japanese style and HDR.
```
Through ImgFilterBase filter = new ImgBeautySpecialEffectsFilter(mStreamer.getGLRender(),
                        PushActivity.this, filterIndex - 15);
mStreamer.getImgTexFilterMgt().setFilter(filter);
```
* **Audio Mixing**  
In the pushing streaming process, background audio mixing is supported, mixing of background music and audio track of microphone is supported and appropriate regulation can be made to the audio mixing at the same time.
```
// Set the background volume input ratio
mStreamer.getMixerFilter().setInputVolume(0, volumeF); //volumeF value is [0,1] and is the floating-point type data.
// Set the microphone volume input ratio
mStreamer.getMixerFilter().setInputVolume(1, volumeF); //volumeF value is [0,1] and is the floating-point type data.
```
* **Picture in Picture Pushing Streaming**   
Underlayer Picture + Video Picture + Customized Location
The Picture in Picture is a video displaying method, supporting underlayer image superimposed with the video picture and supporting customized locations. When a video is played in full screen, another video can be played at the same time in a small region on the picture.
Examples of building 3 superimposed layers:
The bottom layer is the background image
The middle layer is the local video playing picture
The uppermost picture is the picture shot by the camera
The instantiated JDCloudPIPLive type can display the Picture in Picture pushing streaming:
```
JDCloudPIPLive  mStreamer = new JDCloudPIPLive(this);
((JDCloudPIPLive) mStreamer).showBgPicture(this, mPIPPicPath);//Set playing background figure
((JDCloudPIPLive) mStreamer).showBgVideo(mPIPVideoPath);//Set video playing
((JDCloudPIPLive)mStreamer).getMediaPlayerCapture().getMediaPlayer().setVolume(0.4f, 0.4f);
((JDCloudPIPLive) mStreamer).setCameraPreviewRect(0.65f, 0.f, 0.35f, 0.3f);//Set pushing streaming video location
```
Start pushing streaming  
```
((JDCloudPIPLive) mStreamer).getMediaPlayerCapture().getMediaPlayer().start();
((JDCloudPIPLive) mStreamer).getPictureCapture().start(this, mPIPPicPath);
```
Pause pushing streaming
```
mStreamer.onPause();
((JDCloudPIPLive) mStreamer).getMediaPlayerCapture().getMediaPlayer().pause();
((JDCloudPIPLive) mStreamer).getPictureCapture().stop();
```
Pushing streaming stop codes are as follows  
```
mStreamer.stopPush();
mStreamer.hideBgPicture();//Hide background picture(s)
mStreamer.hideBgVideo();//Hide video(s)
mStreamer.setCameraPreviewRect(0.f, 0.f, 1.f, 1.f);
```
* **Brush pushing streaming**  
In the live video process, the streamer can draw any characters and figures with the brush. Such characters and figures can be composited with the camera pictures and then pushed to the audience. The graffiti drawn by the streamer on the page is the picture provided to the audience. The graffiti has been superimposed in the streamer’s picture, requiring no other transmission channels. The graffiti shown is completely the same, regardless of the mobile end, flash and other players.  

To display brush pushing streaming by ViewCapture, please conduct initialization at first:  
```
ViewCapture mPaintViewCapture = new ViewCapture(mStreamer.getGLRender());//Instantiate ViewCapture by using GLRender.

// Connect the image mixer

mPaintViewCapture.getSrcPin().connect(mStreamer.getImgTexMixer().getSinkPin(PAINT_VIEW_IDX));//

// Set the parameter display PaintView, detailed parameter description refer to the API documentation

mStreamer.showPaintView(PAINT_VIEW_IDX, 0, 0, 1, 1, 1);
```
Start brush pushing streaming:    
```
mPaintViewCapture.setTargetResolution(mStreamer.getTargetWidth(),mStreamer.getTargetHeight());//Set resolution

mPaintViewCapture.setUpdateFps(mStreamer.getTargetFps());//Set frames per second

mPaintViewCapture.start(mPaintView);//Set view for ViewCapture
```
End brush pushing streaming:  
```
mPaintViewCapture.stop();7.2. Brush Pushing Streaming
```  
