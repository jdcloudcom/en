# Description
 
Configuration of live transcoding is divided in two steps: 1. Create transcoding template; 2. Add transcoding configuration.
The system has preset a standard quality template for you. If it cannot satisfy your transcoding needs, please first create a transcoding template and then add domain transcoding configuration,
Interface name: addCustomLiveStreamTranscodeTemplate

Address rules of access transcoding stream:

Transcoding address rules: Live domain + AppName + StreamName_transcoding template suffix
Transcoding address example:
        rtmp://domain/{AppName}/{StreamName}_hd
        http://domain/{AppName}/{StreamName}_hd.flv
        http://domain/{AppName}/{StreamName}_hd.m3u8

