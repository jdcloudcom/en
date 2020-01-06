## Simple Integration Example

1. UI layout:  
```
<android.opengl.GLSurfaceView
   android:id="@+id/gl_view"
   android:layout_width="match_parent"
   android:layout_height="match_parent"
   android:background="@color/transparent"
   app:layout_constraintBottom_toBottomOf="parent"
   app:layout_constraintLeft_toLeftOf="parent"
   app:layout_constraintRight_toRightOf="parent"
   app:layout_constraintTop_toTopOf="parent" />
```
2. Add integration code:  
```  
JDVRLibrary vrLibrary=JDVRLibrary.with(this)
                .displayMode(JDVRLibrary.DISPLAY_MODE_GLASS)
//Set display mode
                .interactiveMode(JDVRLibrary.INTERACTIVE_MODE_MOTION)
//Set interactive mode
                .asVideo(new JDVRLibrary.IOnSurfaceReadyCallback() {
//Set video playing (also support bitmap preview)
                    @Override
                    public void onSurfaceReady(Surface surface) {
				//Take JD Cloud player for example, set the surface rendered to player
                        jdCloudPlayer.setSurface(surface);
                    }
                })
                .ifNotSupport(new JDVRLibrary.INotSupportCallback() {
                    @Override
                    public void onNotSupport(int mode) {
//Not support callback of a certain display mode
                    }
                })
                .build((GLSurfaceView) findViewById(R.id.gl_view));
//Set SurfaceView in UI
```  

## Use of SDK

* **Initialize JDVRLibrary**  
```
JDVRLibrary vrLibrary=JDVRLibrary.with(this)
                .displayMode(JDVRLibrary.DISPLAY_MODE_GLASS)
//Set display mode, JDVRLibrary.DISPLAY_MODE_NORMAL is displayed in normal mode.
                .interactiveMode(JDVRLibrary.INTERACTIVE_MODE_MOTION)
//Set interactive mode
                .asVideo(new JDVRLibrary.IOnSurfaceReadyCallback() {
//Set video
                    @Override
                    public void onSurfaceReady(Surface surface) {
                        mMediaPlayerWrapper.setSurface(surface);
                    }
                })
                .ifNotSupport(new JDVRLibrary.INotSupportCallback() {
                    @Override
                    public void onNotSupport(int mode) {
//Not support callback of a certain mode
                    }
                })
                .build((GLSurfaceView) findViewById(R.id.gl_view));
//Set SurfaceView in UI
```
* **Set JDVRLibrary**  
JDVRLibrary is a core type of VR Player SDK. Users can implement multiple effects in playing VR videos and directly set JDVRLibrary by setting the Build objects when creating JDVRLibrary:
1. Set zooming of lens with PinchConfig, and the bigger the setDefaultValue pass parameter, the closer the lens 
```
JDVRLibrary.with(this)
.pinchConfig(new PinchConfig().setMin(1.0f).setMax(8.0f).setDefaultValue(0.1f))
.pinchEnabled(true)
.build((GLSurfaceView) findViewById(R.id.gl_view));
```
2. Set initial direction of VR video:   
```
JDVRLibrary.with(this)
.directorFactory(new BaseDirectorFactory() {
                    @Override
                    public BaseDirector createDirector(int index) {
                        return BaseDirector.builder().setPitch(90).build();
                    }
                })
.build((GLSurfaceView) findViewById(R.id.gl_view));
```
3. Set cutting scale, the smaller the setScale pass parameter, the more the video to be cut, the less the video: 
```
JDVRLibrary.with(this)
                .barrelDistortionConfig(new BarrelDistortionConfig().setDefaultEnabled(false).setScale(0.95f))
.build((GLSurfaceView) findViewById(R.id.gl_view));
```
4. Fisheye mode switch:
When the background playing is enabled and the user clicks **home**, the player will continuously read data and play audios in the background. After APP returns to the foreground, the audio will be continuously played.  
```
if (vrLibrary.isAntiDistortionEnabled()) {
     vrLibrary.setAntiDistortionEnabled(false);
 } else { 
vrLibrary.setAntiDistortionEnabled(true);
 }
```
5. Video mode switch:  
```
if(mVRLibrary.getDisplayMode()==JDVRLibrary.DISPLAY_MODE_GLASS){
mVRLibrary.switchDisplayMode(this, JDVRLibrary.DISPLAY_MODE_NORMAL)
}
```
6. Interactive mode switch, the example is switch with touch interact: 
```
if(mVRLibrary.getInteractiveMode()==JDVRLibrary.INTERACTIVE_MODE_MOTION){
mVRLibrary.switchInteractiveMode (this, JDVRLibrary. INTERACTIVE_MODE_TOUCH)
}
```

* **Calling in Activity Life Cycle**  
During the activity life cycle, calling of vrLibrary corresponding methods shall also be added so as to release resources. The example code is as follows:  
```
    @Override
    protected void onResume() {
        super.onResume();
        mVRLibrary.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mVRLibrary.onPause(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mVRLibrary.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mVRLibrary.onOrientationChanged(this);
    }
```
