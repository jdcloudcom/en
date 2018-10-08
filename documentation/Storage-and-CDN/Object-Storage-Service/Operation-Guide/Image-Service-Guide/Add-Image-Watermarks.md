# Add Image Watermark

Add watermark of image format on the picture file.

Use Method: each wmi triggers actions of adding watermark and then set each parameter value with parameters begun with w in the following list; if the first one is not a control character of parameters in the list or there is no subsequent parameters, actual actions of adding watermark will be triggered; optional parameters not set will use a default value and each parameter will be initialized as the default value after watermarking.

|Actions mode|Instruction meaning|Parameter format|Parameter description|Result description|
|-|-|-|-|-|
|Start image watermark actions|Watermark image|wmi|Required parameters<br>A group of commands is corresponding to a watermark image|Start to add one watermark image action processing|
|Assign watermark image file key|Watermark key|wk/str64|Required parameters<br>str64=base64(bucket:object)|Watermark image local key; read watermark image uploaded to public cloud|
|Assign watermark position|Watermark position|wp/n|Optional parameters<br>N position of watermark in the image<br>value range[1,9], default 1|Position correspondence, range in turn by row from top left corner to bottom right corner<br>1 2 3<br>4 5 6<br>7 8 9|
|Assign watermark position x offset|Watermark<br>dx|wdx/n|Optional parameters<br>N horizontal pixel offset of watermark relative default position<br>value range[-9999, 9999], default 0|Watermark horizontal pixel offset relative to default position is till image boundary|
|Assign watermark position y offset|Watermark<br>dy|wdy/n|Optional parameters<br>N vertical pixel offset of watermark relative default position<br>value range[-9999, 9999], default 0|Watermark vertical pixel offset relative to default position is till image boundary|
|Watermark image transparency|Watermark<br>dissolve|wd/n|Optional parameters<br>N watermark image transparency<br>value range[0, 100], default 100|0 is fully transparent watermark, meaning no watermark|
|Watermark image zooming scale|Watermark<br>scale|ws/n|Optional parameters<br>N area ration of watermark image to original image<br>value range[0, 1000], default 30|Area ration of watermark image to original image (0.X%)|

Example:

Add logo.png as an image watermark file to example.png and set the zooming scale of watermark image as 100:

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=img/wmi/wk/ZG93bmxvYWRzOmxvZ28ucG5n/ws/100

![图片水印](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-062.jpg)
