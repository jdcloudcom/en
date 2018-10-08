## Image porn identification

Conduct porn identification to images:

|Actions mode|Instruction meaning|Parameter format|Parameter description|Result description|
|-|-|-|-|-|
|Image analysis actions|Analyse|analyse|Required parameters<br>start image analysis actions||
|Image porn identification|Porn|p|Compulsory parameters|Returned results of monitoring json format, description of all parameters of returned results: <br>lable: value range[0,1,2], type of porn identification result:0 porn, 1 sexy, 2 normal<br>review: value range[0 or 1], whether manual review is needed:0 not need, 1 needed<br>confidence: value range[0, 1], Reliability of porn identification result, 1 corresponds to 100% confirmed, 0 corresponds to not confirmed at all|

Example:

Conduct porn identification to image files

Images are as follows:

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg

![识别](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-065.jpg)

Porn identification processing:

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=img/analyse/p

Returned results:

{"label":2,"review":0,"confidence":1.000000}
