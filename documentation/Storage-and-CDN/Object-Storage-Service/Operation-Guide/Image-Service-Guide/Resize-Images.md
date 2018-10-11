# Scaling of Images

Generate a thumbnail of the image as required, or make a specific scaling.

Parameters:

|Actions mode|Instruction meaning|Parameter format|Parameter description|Result description|
|-|-|-|-|-|
|Scale in with fixed aspect ratio|Scale|s/w/h|W resultant width after scaling<br>H resultant height after scaling<br>value range[1,9999]|The scaled image is not larger than the assigned width and height, and is the maximum inscribed rectangle of wxh|
|Scale out with fixed aspect ratio|Scale outside|so/w/h|W resultant width after scaling<br>H resultant height after scaling<br>value range[1,9999]|The scaled image is not smaller than the assigned width and height, and is the maximum circumscribed rectangle of wxh|
|Scale with fixed aspect ratio and assigned height|Scale height|sh/h|H resultant height after scaling<br>value range[1,9999]|Resultant height after assigned scaling, the width is self-adapted|
|Scale with fixed aspect ratio and assigned width|Scale width|sw/w|W resultant width after scaling<br>value range[1,9999]|Resultant width after assigned scaling, the height is self-adapted|
|Scale in proportion with fixed aspect ratio|Scale percent|sp/n|N 0.X% of the resultant side length after scaling of that of the original image<br>value range[1,1000]|0.X% of the resultant width and height after assigned scaling are of that of the original image|
|Scale without fixed aspect ratio|Scale force|sf/w/h|W resultant width after scaling<br>value range[1,9999]|Resultant width and height after assigned scaling|
|Scale as per pixel count within the area with fixed aspect ratio|Scale area|sa/n|N resultant total pixel count after scaling<br>value range[1,100000000]|Resultant total pixel count after assigned scaling, wxh=n, there may be the error of 1 pixel in the result|
|Scale with fixed aspect ratio and added white border|Scale border|sb/w/h|W resultant width after scaling<br>H resultant height after scaling<br>value range[1,9999]|The scaled image is not larger than the assigned width and height, and is the maximum inscribed rectangle of wxh; the scaled image scope is not be larger than assigned width and height, the filling background of the non-image part within assigned width and height scope is white|
|Scale with fixed aspect ratio and added color border|Scale border|sb/w/h/str|W resultant width after scaling<br>H resultant height after scaling<br>value range[1,9999]<br>Str background filling color, starting with_<br>value range[_000000,_FFFFFF]|The scaled image is not larger than the assigned width and height, and is the maximum inscribed rectangle of wxh; the scaled image scope is not be larger than assigned width and height, the filling background of the non-image part within assigned width and height scope is the Str assigned color, corresponding to RRGGBB (supporting RGB as well)|
|Scale with fixed aspect ratio and assigned height, and white border added to width|Scale height border|shb/w/h|W resultant width after scaling<br>H resultant height after scaling<br>value range[1,9999]|The assigned height and width are self-adapted, the scaled image is equal to the assigned height and width; if the self-adapted width is not consistent with the assigned height, the filling background is white|
|Scale with fixed aspect ratio and assigned width, and white border added to height|Scale width border|swb/w/h|W resultant width after scaling<br>H resultant height after scaling<br>value range[1,9999]|The assigned width and height are self-adapted, the scaled image is equal to the assigned width and height; if the self-adapted height is not consistent with the assigned height, the filling background is white|
|Scale with fixed aspect ratio and assigned height, and color border added to width|Scale height border|shb/w/h/str|W resultant width after scaling<br>H resultant height after scaling<br>value range[1,9999]<br>Str background filling color, starting with_<br>value range[_000000,_FFFFFF]|The assigned height and width are self-adapted, the scaled image is equal to the assigned width and height; if the self-adapted width is not consistent with the assigned width, the filling background is the Str assigned color, corresponding to RRGGBB (supporting RGB as well)|
|Scale with fixed aspect ratio and assigned height, and color border added to width|Scale width border|swb/w/h/str|W resultant width after scaling<br>H resultant height after scaling<br>value range[1,9999]<br>Str background filling color, starting with_<br>value range[_000000,_FFFFFF]|The assigned width and height are self-adapted, the scaled image is equal to the assigned width and height; if the self-adapted height is not consistent with the assigned height, the filling background is the Str assigned color, corresponding to RRGGBB (supporting RGB as well)| 


Example: Scale the image with fixed aspect ratio; the width and height after scaling is not larger than 200*300

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=img/s/200/300

![图片缩放](../../../../../image/Object-Storage-Service/OSS-058.jpg)
