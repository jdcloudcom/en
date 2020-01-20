## Use of SDK  

**Basic Usage Process of Short Video SDK**   

Access steps for using SDK:  
1. Create short video APIs.  
2. Initialize short video default parameters.  
3. Set a preview window.  
4. Add videos or images to the timeline.  
5. Register a short video agent and receive the preview status.  
6. Playing preview.  
Specific usage is introduced in the following steps:    

**1. Create Short Video APIs** 

JDMediaEdit is the core class of Short Video SDK, providing functions such as edit, preview, and synthesis for all videos.
```
Import the header file #import <jdcloud_shortvideo_ios/JDMediaEdit.h>

@property (nonatomic,strong)JDMediaEdit* mediaEdit;                 
```

Initialize the underlayer short video APIs. The example code is as follows:
Set default parameters and agent before initializing. For details, please see Step 2 and 6.
```
self.mediaEdit = [[JDMediaEdit alloc] initWithPreviewConfig:previewConfig withDelegate:self];
```

**2. Initialize Short Video Default Parameters**    

Among default parameters of JDMEPreviewConfig short video type, each attribute parameter has a corresponding default value. For default values and parameter ranges, please refer to attributes and methods of JDMEPreviewConfig type.
Initialize default system parameters
```
JDMEPreviewConfig *previewConfig = [[JDMEPreviewConfig alloc] init];
```
Other preview parameters can be set both before and after playing and the interface example codes are as follows:
```
//Preview resolution
 previewConfig.resolution = CGSizeMake(960, 540);
//Preview frame rate
previewConfig.frameRate = 30;
```

**3. Set a Preview Window**    
```
@property (nonatomic,strong)UIView* playerView;

self.playerView = [[UIView alloc] initWithFrame:CGRectMake(50, 88, 200, 300)];
 _playerView.backgroundColor = [UIColor grayColor];
 [self.view addSubview:_playerView];

[_mediaEdit startPreview:_playerView];
```

**4. Add Videos or Images to the Timeline**   

Fill in the playing addresses and the Player SDK supports formats such as RMVB, AVI, MKV, MP4 and MOV.
```
//Modify the documents in a project or the mobile native video
NSURL *url1 = [NSURL fileURLWithPath:[[NSBundle mainBundle] pathForResource:@"yds01" ofType:@"mp4"]];
    AVURLAsset *asset1 = [AVURLAsset assetWithURL:url1];
    JDSMovieTimeLineItem* item = [[JDSMovieTimeLineItem alloc] initWithAsset:asset1];
   //Add
   [self.mediaEdit appendMovieTimeLineItem:item];
```

**5. Register a Short Video Agent Incident**   

Import <JDMediaEditDelegate>	 player callback agent
There are two player callbacks and the registered delegate can receive corresponding callbacks, with codes as follows:
```
//Playing status changed
- (void)onPreviewStateChange:(JDMEPreviewState)statet；

//Preview status changed
- (void)onPreviewCurrentTimeChanged:(CMTime)time; 

//Synthesis progress
- (void)onExportProgressChanged:(float)progress;

//Thumbnail updated
- (void)onThumbnailChanged:(JDSMovieTimeLineItem*)item thumbnail:(JDSThumbnail*)thumbnail;
```

**6. Prepare to preview and play**   

Control APIs of the short video preview are provided with basic functions such as play, stop, pause and Seek.
```
//Pause
[self.mediaEdit pausePreview];
//Stop, call after playing
[self.mediaEdit stopPreview];
//Play
[self.mediaEdit playPreview];
//Current preview status
[self.mediaEdit getCurrentPreviewState];
//Preview time point
[self.mediaEdit seekToTime:CMTimeMake(600, 600)];
```

**7. Edit Module**   

Functions can be set by editing short videos, descriptions about settings of APIs are specified in JDMediaEdit type and details of interpretation and example code are as follows:    
7.1 Add  
1. Insert before an item  
```
/*!
 @abstract   Insert a timeline item before an item
 @param      item  item to be inserted
 @param      referenceItem  item for reference
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)insertMovieTimeLineItem:(JDSMovieTimeLineItem*)item beforeItem:(JDSMovieTimeLineItem*)referenceItem;
```

2. Insert after an item  
```
/*!
 @abstract   Insert a timeline item after an item
 @param      item  item to be inserted
 @param      referenceItem  item for reference
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)insertMovieTimeLineItem:(JDSMovieTimeLineItem*)item afterItem:(JDSMovieTimeLineItem*)referenceItem;
```

3. Append to the end  
```
/*!
 @abstract   Add timeline item at the end
 @param      item  item to be added
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)appendMovieTimeLineItem:(JDSMovieTimeLineItem*)item;
```

7.2 Cropping  
```
/*!
 @abstract   The start time and end time of video cropping set
 @param      item  Timeline item
 @param      startTime start time after changing speed
 @param      endTime start time after changing speed
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)clipMovieTimeLineItem:(JDSMovieTimeLineItem*)item withStartTime:(CMTime)startTime endTime:(CMTime)endTime
```

7.3 Division  
```
/*!
 @abstract   Divide a movie item
 @param      time  Divide time points
 */
- (BOOL)splitMovieItemAtTime:(CMTime)time   
```

7.4 Replication  
```
/*!
 @abstract   Replicate a movie item and put in behind
 @param      item  Timeline item
 */
- (BOOL)copyMovieTimeLineItem:(JDSMovieTimeLineItem*)item;
```

7.5 Speed Changing  
```
/*!
 @abstract   Set the playback rate
 @param      rate  Playback rate
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)setMovieTimeLineItem:(JDSMovieTimeLineItem*)item withRate:(double)rate
```

7.6 Rotation  
```
/*!
 @abstract   Set a filtering name
 @param      item  Timeline item
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)setMovieTimeLineItem:(JDSMovieTimeLineItem*)item withRotationMode:(GPUImageRotationMode)rotationMode
```

7.7 Deletion  
```
/*!
 @abstract   Delete a timeline item
 @param      item  item to be deleted
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)removeMovieTimeLineItem:(JDSMovieTimeLineItem *)item
```

**8. Filter**

Different filtering effects can be set and distinguished by filternName. Now, filters of six different styles are supported by us.
```
/*!
 @abstract   Set a filtering name
 @param      item  Timeline item
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)setMovieTimeLineItem:(JDSMovieTimeLineItem*)item withVideoFilterName:(NSString*)filterName

//Echo whether there is a value of the attribute of filternName based on the item
item.filternName
```
**9. Caption and Sticker**

Dynamic and static stickers can be added, and 10 types of material are caption support zoom, dragging, deletion and other at the moment.
```
/*!
 @abstract   Obtain Item array of all watermark and caption timeline
 @result     Return Item array of all watermark and caption timeline
 */
- (NSArray *)getLayerTimeLineItemArray;
/*!
 @abstract   Obtain Item array of the watermark and caption timeline at some point in time
 @param      time  Time point
 @result     Return Item array of the watermark and caption timeline at some point in time
 */
- (NSArray *)getLayerTimeLineItemArrayAtTime:(CMTime)time;
/*!
 @abstract   Add Item of watermark and caption timeline
 @param      timeLineItem  Timeline timeLineItem
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)addLayerTimeLineItem:(JDSLayerTimeLineItem *)timeLineItem;
/*!
 @abstract   Remove Item of watermark and caption timeline
 @param      timeLineItem  Timeline timeLineItem
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)removeLayerTimeLineItem:(JDSLayerTimeLineItem *)timeLineItem;
/*!
 @abstract   Modify the time range of Item of watermark and caption timeline at timeline
 @param      timeLineItem  Timeline timeLineItem
 @param      timeRangeInWhole  The time range of Item of watermark and caption timeline at timeline
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)setLayerTimeLineItem:(JDSLayerTimeLineItem *)timeLineItem
        withTimeRangeInWhole:(CMTimeRange)timeRangeInWhole;

/*!
 @abstract   Modify whether watermarks and captions can be edited
 @param      timeLineItem  Timeline timeLineItem
 @param      canEdit  Does the timeline timeLineItem can be edited
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)setLayerTimeLineItem:(JDSLayerTimeLineItem *)timeLineItem
                 withCanEdit:(BOOL)canEdit;

/*!
 @abstract   Start editing watermarks and captions
 @param      timeLineItem  Timeline timeLineItem starts to be edited
 */
- (void)beginEditTimeLineItem:(JDSLayerTimeLineItem *)timeLineItem;
/*!
 @abstract   Stop editing watermarks and captions
 @param      timeLineItem  Timeline timeLineItem stops to be edited
 */
- (void)endEditTimeLineItem:(JDSLayerTimeLineItem *)timeLineItem;
```

**10. Background Music**

The volume of original sound and background music can be set by music, and different musics are provided for selection. It is supported to select music into a range in which pieces of music are supported to be added.
```
/*!
 @abstract   Obtain all background music array
 @result     Return all background music array
 */
- (NSArray *)getBGMTimeLineItemArray;
/*!
 @abstract   Obtain the background music array at a point in time
 @param      time  Time point
 @result     Return the background music array at a point in time
 */
- (NSArray *)getBGMTimeLineItemArrayAtTime:(CMTime)time;
/*!
 @abstract   Add background music
 @param      timeLineItem  Timeline timeLineItem
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)addBGMTimeLineItem:(JDSBGMTimeLineItem *)timeLineItem;
/*!
 @abstract   Remove background music
 @param      timeLineItem  Timeline timeLineItem
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)removeBGMTimeLineItem:(JDSBGMTimeLineItem *)timeLineItem;
/*!
 @abstract   Modify the time range of background music on the timeline and the start and playing duration of the background music relative to itself
 @param      timeLineItem  Timeline timeLineItem
 @param      timeRangeInWhole  The time range of background music on the timeline
 @param      timeRangeInAsset  The start and playing duration of the background music relative to itself
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)setBGMTimeLineItem:(JDSBGMTimeLineItem *)timeLineItem
      withTimeRangeInWhole:(CMTimeRange)timeRangeInWhole
      withTimeRangeInAsset:(CMTimeRange)timeRangeInAsset;

/*!
 @abstract   Set the playback rate of background music
 @param      item  Timeline item
 @param      rate  The playback rate of background music
 @result     YES will be returned if succeeded and NO will be returned if failed
 */
- (BOOL)setBGMTimeLineItem:(JDSBGMTimeLineItem*)item withRate:(double)rate;

/*!
 @abstract   Set background music to mute or not
 @param      timeLineItem  Timeline item
 @param      mute  To be mute or not. YES is mute; NO is normal volume for playing
 */
- (void)setBGMTimeLineItem:(JDSBGMTimeLineItem *)timeLineItem
                  WithMute:(BOOL)mute;

/*!
 @abstract   Set background music volume
 @param      timeLineItem  Timeline item
 @param      volume  Background music volume
 */
- (void)setBGMTimeLineItem:(JDSBGMTimeLineItem *)timeLineItem
                WithVolume:(double)volume;
```
**11. Synthesis**

Configure the parameters to be synthesized before synthesis, and then call APIs. The synthesis progress can be viewed in callbacks.
```
/*!
 @abstract  Start synthesizing
 @param config Synthesize and output the configuration objects
 */
-(void)startExportWithConfig:(JDMEOutputConfig*)config;

/*!
 @abstract  Media edits callbacks for synthesis progress changes
 @param progress Current progress
 */
- (void)onExportProgressChanged:(float)progress;

/*!
 @abstract  Media edits callbacks for synthesis completed
 */
- (void)onExportFinish;

/*!
 @abstract  Media edits synthesis canceled
 */
- (void)onExportCancel;
```
