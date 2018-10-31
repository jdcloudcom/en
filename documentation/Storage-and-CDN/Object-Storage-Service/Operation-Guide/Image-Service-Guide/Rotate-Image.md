# Image Rotation

Rotate the image as required.

Parameters:
All images are automatically rotated according to EXIF information by default before any process in addition to being returned to the original images

|Actions mode|Instruction meaning|Parameter format|Parameter description|Result description|
|-|-|-|-|-|
|Image’s clockwise rotation angle|Rotation|r/n|r Image’s clockwise rotation angle<br>value range[0,360]|When n=0, automatically rotate according to exif<br>When n=360, no rotation, return to the direction of the original image|

Example: Rotate the image 60° clockwise

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=img/r/60

![旋转](../../../../../image/Object-Storage-Service/OSS-059.jpg)
