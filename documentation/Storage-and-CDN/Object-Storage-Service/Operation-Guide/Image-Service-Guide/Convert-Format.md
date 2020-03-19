# Format Conversion

Convert format of image as required; one can designate progressive display, image quality and conduct gif format optimization.

|Actions mode|Instruction meaning|Parameter format|Parameter description|Result description|
|-|-|-|-|-|
|Convert image format|Format|fmt/str|Str resultant image format<br>value range[jpg, png, webp, bmp, gif]|jpg save artwork as jpg format. If the artwork is png, webp, bmp with transparent channel, transparency will be filled with white by default|
|Assigned image of jpg format supports progressive display or not|Progressive|p|Optional parameters<br>p relatively support Progressive mode<br>not assign p to relate to non-Progressive mode|Image of jpg format provide progressive display function making blurry image clear when network is at low speed, which relates to Progressive mode<br>while file size of most scenario will be decreased slightly and image processing time will be increased slightly|
|Assign image quality of jpg, webp format|Quality|q/n|N upper limit of resultant image quality<br>value range[0,100]|Resultant image quality=MIN(original quality, assigned quality)<br>Webp original quality is fixed as 85|
|Forcibly assign image quality of jpg, webp format|Quality force|qf/n|N resultant image quality<br>value range[0,100]|Resultant image quality is forced to be assigned quality|
|Obtain original image|Original|o|Optional parameters<br>o Relatively return to original image|Ignore other processing parameters|
|gif Format Optimization|Curtail Gif|cgif/n|If n=1, the gif image will be compressed to 30 frames by default; if the original image is greater than 30 frames, only the first 30 frames will be retained. <br>n value range [2,100], compress the image to the designated number of frames and retain frames at intervals. |Only support gif format of original images. <br>If n=2, and the original image have 4 frames, retain the 1st and 3rd frames. <br>If n is greater than the frames of the original image, output the number of frames of the original image.|

For example: Convert image format of example.jpg to png format

http://s3.cn-north-1.jdcloud-oss.com/downloads/example.jpg?x-oss-process=img/fmt/png

![格式转换](../../../../../image/Object-Storage-Service/OSS-061.png)
