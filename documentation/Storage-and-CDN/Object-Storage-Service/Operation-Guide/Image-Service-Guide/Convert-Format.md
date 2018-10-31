# Format Conversion

Convert format of image as required; one can designate progressive display and image quality.

|Actions mode|Instruction meaning|Parameter format|Parameter description|Result description|
|-|-|-|-|-|
|Convert image format|Format|fmt/str|Str resultant image format<br>value range[jpg, png, webp, bmp, gif]|jpg save artwork as jpg format. If the artwork is png, webp, bmp with transparent channel, transparency will be filled with white by default|
|Assigned image of jpg format supports progressive display or not|Progressive|p|Optional parameters<br>p relatively support Progressive mode<br>not assign p to relate to non-Progressive mode|Image of jpg format provide progressive display function making blurry image clear when network is at low speed, which relates to Progressive mode<br>while file size of most scenario will be decreased slightly and image processing time will be increased slightly|
|Assign image quality of jpg, webp format|Quality|q/n|N upper limit of resultant image quality<br>value range[0,100]|Resultant image quality=MIN(original quality, assigned quality)<br>Webp original quality is fixed as 85|
|Forcibly assign image quality of jpg, webp format|Quality force|qf/n|N resultant image quality<br>value range[0,100]|Resultant image quality is forced to be assigned quality|
|Obtain original image|Original|o|Optional parameters<br>o Relatively return to original image|Ignore other processing parameters|

For example: Convert image format of example.jpg to png format

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=img/fmt/png

![格式转换](../../../../../image/Object-Storage-Service/OSS-061.png)
