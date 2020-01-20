## Simple Video Edit Example

1. Add preview Video View in a layout file and GLSurfaceView is supported now:
```
<RelativeLayout
            android:id="@+id/preview_layout"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="@color/white">
            <android.opengl.GLSurfaceView
                android:id="@+id/edit_preview"
                android:layout_width="match_parent"
                android:layout_height="match_parent" />
            <com.jdcloud.media.shortvideo.sticker.StickerView
                android:id="@+id/sticker_panel"
                android:layout_width="fill_parent"
                android:layout_height="fill_parent"
                android:layout_gravity="center"
                android:visibility="gone" />
        </RelativeLayout>
``` 
Note: StickerView is the view of sticker.  
2. Initialize the preview view by using ButterKnife:
```
    @BindView(R.id.edit_preview)
GLSurfaceView mEditPreviewView; 
```

3. Create JDCloudVideoEdit instance of video edit type, configure related parameters, and add videos to the timeline:
```
 JDVideoEditParam param = new JDVideoEditParam.Build().build();
 param.setRatio(Constants.SCALE_TYPE_9_16);//Set the ratio of video
 mVideoEdit = new JDCloudVideoEdit(this, param); //Instantiation mVideoEdit

JDTimeLine  mMainTimeLine =mVideoEdit.createTimeLine();//Establish timeline
AudioTrack audioTrack = mMainTimeLine.getAudioTrackByIndex(1);//Add audio
audioTrack.appendClip(audioClip);
audioTrack.setVolume(audioVolume, audioVolume);

VideoTrack videoTrack = mMainTimeLine.initVideoTrack();//Add video
VideoClip videoClip = new VideoClip.Builder()；
videoTrack.appendClip(videoClip);
videoTrack.setVolume(videoVolume, videoVolume);

mVideoEdit.initVideoClip();//Initialize all video information;

mVideoEdit.setDisplayView(mEditPreviewView); // Set preview view
```

4. Add preview listen and start preview:
```
Preview listen can be added at the time of starting preview
        mVideoEdit.startPreview(new EditorPlayerListener(){
            @Override
            public void onVideoSizeChanged(int width, int height) {
                //Callback where video size changes
            }

            @Override
            public void onStateChanged(int var1) {//Player status change callback, //EditorPlayerStatus enumeration class saves all status, var1 is status.ordinal(), for example, //EditorPlayerStatus. Playing.ordinal();
            }

            @Override
            public void onProgress(long var1, long var4) {
//Playing progress callback
            }

            @Override
            public void onCompleted() {
//Callback completed by displaying
            }
        }); 
```

5. Preview playing, pause, seek:
```
mVideoEdit.pause(); //Pause preview
mVideoEdit.seekTimeLine(TimeLineUtil.getMainTimeLine(), 0);//seek assigns the video on timeline//to a certain time, unit: millisecond
mVideoEdit.play();//Replaying after pause
```

6. Callback treatment for Activity Life Cycle:
```
public class VideoEditActivity extends Activity {
    @Override
    public void onResume() {
        super.onResume();
        if (mVideoEdit != null) {
            mVideoEdit.onResume();
        }
        }
    @Override
public void onPause() {
    if (mVideoEdit != null) {
      mVideoEdit.pause();
    }
        super.onPause();
    }

    @Override
    public void onDestroy() {
        if (mVideoEdit != null) {
            mVideoEdit.stopPreview();
            mVideoEdit.onDestroy();
        }
super.onDestroy();
    }
}
```

## More APIs

* **Video Edit**
```
mVideoEdit.updateSource(index,currentClip,oldDration);//Update the video specified. currentClip is the new video information, while oldDration is the video duration at index before updating.

mMainEdit.addSource(index,videoClip);//Add video at the specified position

mMainEdit.deleteSource(index,deleteDuration);//Delete the video at the specified position, and deleteDuration is the video duration to be deleted

mVideoEdit.setSpeed(speed);//Set speed changing, and parameters for speed are: 0.5, 0.75, 1, 1.5 and 2

mVideoEdit.setRotation(mRotateDegrees);//Set rotation and the angle of rotation are: 0, 90, 180 and 270;
```

* **Filter**  
```
ImgFilterBase filter = new ImgBeautySpecialEffectsFilter(mVideoEdit.getGLRender(),
                        context, mEffectFilterIndex);
// mEffectFilterIndex is filter index. All available filters are in ImgBeautySpecialEffectsFilter.
mVideoEdit.applyFilter(filter);//Add a filter

mVideoEdit.replaceFilter(lastFilter, null, false);//Remove the filter
mVideoEdit.queueLastFrame();//In the status of suspension, the filter will be effective in the preview region immediately
```

* **Caption and Sticker**  

1. To lay out StickerView in xml, see: 5.4. The first step of simple video edit example instance And instantiate StickerView
@BindView(R.id.sticker_panel)
StickerView mTickerView;  //Sticker preview region (image sticker and caption sticker for public use)

2. Initialize the appearance of the caption sticker region:
```
StickerBox  mStickerBox = new StickerBox();
mStickerBox.setDelete(mStickerDeleteBitmap);//Set the bitmap to delete the sticker
mStickerBox.setRotate(mStickerRotateBitmap);//;//Set the bitmap to rotate the sticker
Paint helpBoxPaint = new Paint();
helpBoxPaint.setColor(Color.BLACK);
helpBoxPaint.setStyle(Paint.Style.STROKE);
helpBoxPaint.setAntiAlias(true);
helpBoxPaint.setStrokeWidth(4);
mStickerBox.setHelpBoxPaint(helpBoxPaint);//Set the brush to draw the sticker region
```

3. Add Sticker 
```
StickerConfig info = new StickerConfig();
// Set dynamic sticker
info.setAnimateUrl("assets://AnimateSticker/1.gif");
info.setStickerType(StickerConfig.STICKER_TYPE.ANIMATE_IMAGE);
// Set static sticker
info.setBitmap(getImageFromAssetsFile(path));
info.setStickerType(StickerConfig.STICKER_TYPE.IMAGE);

// Caption sticker text related information
StickerText textParams = new StickerText();
textParams.setTextPaint(new TextPaint());//Set the brush fonts
textParams.getTextPaint().setTextSize(2 * Constants.DEFAULT_TEXT_SIZE);
textParams.getTextPaint().setColor(mTickerView.getCurrentTextColor());
textParams.getTextPaint().setTextAlign(Paint.Align.LEFT);
textParams.getTextPaint().setStyle(Paint.Style.FILL);
textParams.getTextPaint().setAntiAlias(true);
textParams.getTextPaint().setTypeface(typeface);//Set font type
textParams.setText(getResources().getString(R.string.subtitle_text));
textParams.setAutoNewLine(true);//Set auto linefeed
info.setTextParams(textParams);

//Add a sticker to the video (only one sticker can be added at a time)
info.setStartTime(0);//Set the start time of the sticker displaying in the video
info.setDuration(3000);//Set the duration for displaying the sticker
stickerId = mTickerView.addSticker(info, mStickerBox);//Return the id of the sticker to access the sticker.
```

4. Other Operations
```
mTickerView.removeTextStickers();//Remove all captions
mTickerView.removeBitmapStickers();//Remove all static stickers
mTickerView.removeAnimateStickers();//Remove all dynamic stickers
mTickerView.removeSticker(stickerId);//Remove the sticker according to stickerId

//Add the callback for sticker operation
mTickerView.setOnStickerSelected(new StickerView.OnStickerStateChanged() {
@Override
public void selected(int index, String text) {
}//For a sticker selected, if text is not null, the sticker is a caption sticker
@Override
public void deleted(List<Integer> list, String text) {
}//For a callback where a sticker is deleted, if text is not null, the sticker is a caption sticker
        });
```

* **Background Music**  
```
mVideoEdit.setMusicRange(0, newDur, true);//Set the start time and end time of background music at the entire timeline
mVideoEdit.applyMusic(new AudioClip(audioPath, duration));//Set background music
mVideoEdit.setMusicVolume(0.3f);//Set the volume of background music

mVideoEdit.removeMusic(new AudioClip(null, 0));//Remove background music
```

* **Synthesis** 

1. Synthesize Parameter Configuration
```
JDVideoEditParam mComposeConfig = new JDVideoEditParam.Build().build();
mComposeConfig.setResolutionMode(BaseConstants.VIDEO_RESOLUTION_360P);//Set the resolution of the video produced
mComposeConfig.setFrameRate(25);//Set frames per second [10-60]
mComposeConfig.setVideoBitrate(10000);// Set code rate [128-10000]
```

2. Start Synthesizing
```
mVideoEdit.compose(mComposeConfig,videoPath, new IComposeCallback() {
            @Override
            public void onProgress(final float progress) {
//Synthesis progress. When the progress is 1, synthesis is completed
                        }
                    }
                });
            }
            @Override
            public void onErrors(int errorCode, String errorMsg) {
//Synthesize a callback with error
                          }

            @Override
            public void onFinish() {//Synthesis completed
            }
        });
//videoPath is the path to export the video
```

3. Set up a listener to receive callbacks in the process of synthesis
```
    private BaseListener mBaseListener = new BaseListener() {
        @Override
        public void onMessage(int what, String msg) {
            switch (what) {
                 case Constants.VIDEO_COMPOSE_START: {//Start Synthesizing
                    mVideoEdit.pausePreview();
                    if (mComposeProgressRl != null) {
                        mComposeProgressRl.setVisibility(View.VISIBLE);
                    }
                    break;
                }
                case Constants.VIDEO_COMPOSE_FINISHED{//Synthesis completed
                    LogUtil.d(TAG, "compose finished");
                    if (mComposeProgressRl != null) {
                        mComposeProgressRl.setVisibility(View.GONE);
                    }
                    isComposing = false;
                    break;
                }
                case Constants.VIDEO_COMPOSE_ABORTED{//Synthesis canceled
                    LogUtil.d(TAG, "compose aborted by user");
                    isComposing = false;
                    break;
                default:
                    break;
            }
        }

        @Override
        public void onError(int errorCode, String errorMsg) {
            isComposing = false;
            switch (errorCode) {
                case Constants.ERROR_COMPOSE_FAILED_UNKNOWN:
                case Constants.ERROR_COMPOSE_FILE_CLOSE_FAILED:
                case Constants.ERROR_COMPOSE_FILE_FORMAT_NOT_SUPPORTED:
                case Constants.ERROR_COMPOSE_FILE_OPEN_FAILED:
                case Constants.ERROR_COMPOSE_FILE_WRITE_FAILED:
                    LogUtil.d(TAG, "compose failed:" + errorCode);
                default:
                    break;
            }
        }
    };
mVideoEdit.setBaseListener(mBaseListener);
```
