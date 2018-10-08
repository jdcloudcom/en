# Obtaining image information

Obtain basic image information and exif information

Parameters:

|Actions mode|Instruction meaning|Parameter format|Parameter description|Result description|
|-|-|-|-|-|
|Retain meta information of jpg, webp and tiff images|Not strip|ns|Remove the meta information of images of all formats by default<br>retain after assigning ns||
|Obtain basic image information|Image information|imginfo|Selectable parameters|Returned results of json format, including: <br>format format<br>width width<br>height height<br>fileSize file bytes number<br>imgType file type, value range[0 UndefinedType,<br>1 BilevelType,<br>2 GrayscaleType,<br>3 GrayscaleMatteType,<br>4 PaletteType,<br>5 PaletteMatteType,<br>6 TrueColorType,<br>7 TrueColorMatteType,<br>8 ColorSeparationType,<br>9 ColorSeparationMatteType,<br>10 OptimizeType]<br>orientation original EXIF orientation, value range[<br>0 UndefinedOrientation,<br>1 TopLeftOrientation,<br>2 TopRightOrientation,<br>3  BottomRightOrientation,<br>4 BottomLeftOrientation,<br>5 LeftTopOrientation,<br>6 RightTopOrientation,<br>7 RightBottomOrientation,<br>8 LeftBottomOrientation]|
|Obtain image EXIF information|Image EXIF|Imgexif|Selectable parameters|Support jpg and tiff format images| 

Example:

Obtain basic image information:

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=imginfo/ns

Returned results:

{"format":"JPEG","width":350,"height":236,"fileSize":38539,"imgType":6,"orientation":1}

Obtain image EXIF information:

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=imgexif

Returned results:
```
{"FileType":"JPEG","FileSize":"38539","ImageWidth":"350","ImageHeight":"236","Make":"Canon","Model":"Canon EOS 1100D","Software":"www.meitu.com","ExposureTime":"1/200","ExifOffset":"118","ExposureTime":"1/200","FNumber":"5/1","ISOSpeedRatings":"160, 0","DateTimeOriginal":"2013:05:17 16:21:36","Flash":"16, 0","FocalLength":"140/1","LensModel":"EF75-300mm f/4-5.6"}
```
