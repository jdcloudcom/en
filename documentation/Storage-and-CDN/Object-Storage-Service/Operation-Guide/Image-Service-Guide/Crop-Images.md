# Image Cropping

Crop the image as required; one can crop in the center and crop into designated rectangle.

Parameters:

|Actions mode|Instruction meaning|Parameter format|Parameter description|Result description|
|-|-|-|-|-|
|Center crop|crop center|cc/w/h|W resultant crop width<br>H resultant crop height<br>value range[1,9999]|Center crop with artwork range, resultant aspect ratio is the maximum inscribed rectangle|
|Crop into designated rectangle|crop rect|cr/w/h/x/y|W resultant crop width<br>H resultant crop height<br>value range[1,9999]<br>X resultant crop X coordinate at top left corner<br>Y resultant crop Y coordinate at top left corner<br>value range[0,9999]|Crop top left corner is within the rectangle zone constituted by x, y and width and height w and h; if exceeding the artwork range, it is end till the artwork edge|

For example: crop the image in the center with aspect ratio: 300*200

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=img/cc/300/200

![居中裁剪](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-060.jpg)
