# Face Recognition

Identify face information in the image

Parameters:

|Actions mode|Instruction meaning|Parameter format|Parameter description|Result description|
|-|-|-|-|-|
|Image analysis actions|Analyse|analyse|Required parameters<br>start image analysis actions||
|Face detection|Face|f/1|Required parameters|Return json format of each detected face rectangular coordinate; the image top left corner is the origin|
|Face detection|Face|f/2|Required parameters|Return biggest crop image of face; the image format is same as that of input image|
|Face detection|Face|f/3/str|3 required parameters<br>Str optional parameters, face frame color, _start with<br>value range[_000000,_FFFFFF], default_FFFFFF|Return all detected face image in which identified with rectangle of customized color _RRGGBB (or RGB)|

Example:

Detect the face in the image file and return the largest crop image of the face:

http://oss.cn-north-1.jcloudcs.com/downloads/face.jpg?x-oss-process=img/analyse/f/2

![人脸识别](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-064.jpg)
