# Text Watermark

Add watermark of text format on the picture file.

Use method: each wmt triggers actions of adding watermark and then set each parameter value with parameters begun with w in the following list; if the first one is not a control character of parameters in the list or there is no subsequent parameters, actual actions of adding watermark will be triggered; optional parameters not set will use a default value and each parameter will be initialized as the default value after watermarking.

|Actions mode|Instruction meaning|Parameter format|Parameter description|Result description|
|-|-|-|-|-|
|Start text watermark actions|Watermark text|wmt|Required parameters<br>A group of commands is corresponding to a text watermark|Start one text watermark action processing|
|Assign watermark text|Watermark text|wt/str64|Required parameters<br>str64=base64(utf8 format text)|A maximum of 16 Chinese characters|
|Assign watermark text font|Watermark font|wf/str64|Optional parameters<br>str64 watermark text font name<br>default Simsun|only support Simsun temporarily|
|Assign watermark text color|Watermark color|wc/str|Optional parameters<br>Str background filling color, _start with<br>value range[_000000,_FFFFFF], default _FFFFFF|Watermark text color, relative to RRGGBB (also support RGB)|
|Assign watermark position|Watermark position|wp/n|Optional parameters<br>N position of watermark in the image<br>value range[1,9], default 1|Position correspondence, range in turn by row from top left corner to bottom right corner<br>1 2 3<br>4 5 6<br>7 8 9|
|Assign watermark position x offset|Watermark dx|wdx/n|Optional parameters<br>N horizontal pixel offset of watermark relative default position<br>value range[-9999, 9999], default 0|Watermark horizontal pixel offset relative to default position is till image boundary|
|Assign watermark position y offset|Watermark dy|wdy/n|Optional parameters<br>N vertical pixel offset of watermark relative default position<br>value range[-9999, 9999], default 0|Watermark vertical pixel offset relative to default position is till image boundary|
|Watermark text font size|Watermark scale|ws/n|Optional parameters<br>N area ration of watermark image to original image<br>value range[0, 1000], default 30|Area ration of watermark text to original image (0.X%), default 30|
|Rotation angle of watermark text font to bottom left|Watermark Rotate|wr/n|Optional parameters<br>N clockwise rotation angle to bottom left around character<br>value range[0, 360], default 0||

Example:

Add text watermark "JD Cloud" to image file:

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=img/wmt/wt/5Lqs5Lic5LqR

![文字水印](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-063.jpg)
