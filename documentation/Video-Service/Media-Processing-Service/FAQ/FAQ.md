# FAQ

**Q: Which video file formats are supported by Media Processing Service?**

A: Files with almost all common file formats are supported to be uploaded as source files (video formats supported to be uploaded include 3GP, ASF, AVI, DAT, DV, FLV, F4V, GIF, M2T, M4V, MJ2, MJPEG, MKV, MOV, MP4, MPE, MPG, MPEG, MTS, OGG, QT, RM, RMVB, SWF, TS, VOB, WMV, WEBM, etc. while that of audio formats include aac, ac3, acm, amr, ape, caf, mp3, ra, wav and wma)


**Q: Does one media processing task support creating multiple outputs?**

A: Each transcoding task can correspond to one input file, a number of transcoding templates and a number of transcoding output files.    
Each snapshot task corresponds to one input file, one snapshot template and snapshot files of actual snapshotting count.


**Q: How long does a transcode task take?**

A: There are a variety of factors affecting the transcoding speed, such as source file duration, resolution, code rate and transcoding template setting. Generally, the transcoding duration is 0.5 to 2 times of source file duration.
If you submit a quantity of transcoding tasks, Media Processing Service will process the tasks as per their queues in order.
