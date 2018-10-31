# Access rules for image processing

The image service is accessed by GET request of standard HTTP and all processing parameters are also in the QueryString of URL.

## Request for thumbnail through processing parameters

1.Users request for image processing interface

(a) Old API: connect "?img/processing parameters" after the original file address

For example: http://downloads.oss.cn-north-1.jcloudcs.com/lena.jpg?img/s/200/300

(b) New API: connect "?x-oss-process=img/processing parameters" after the original file address

For example: http://downloads.oss.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/s/200/300

2.Request for original image

(a) File direct download mode

For example: http://downloads.oss.cn-north-1.jcloudcs.com/lena.jpg

(b) Image processing parameter mode

For example: http://downloads.oss.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/o

3.Image processing actions support sequential queue

Connect image processing instructions as a processing queue in sequence and segment each task name and ancillary parameter with "/"; then background will execute them in sequence.

For example:

Original image address: http://downloads.oss.cn-north-1.jcloudcs.com/lena.jpg

Processing mode: scale in turn and crop in the center

Resultant address of relative image processing:

http://downloads.oss.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/s/200/300/cc/200/260

4.In the processing queue, sequential execution will affect final results.

5.Upper limit of the maximum number of processing actions of a single request <=100; repetitive operation is accumulated.

For example: http://downloads.oss.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/s/200/300/cc/200/260

Scale s and center crop cc are recorded as two actions.

6.Total length of processing parameters cannot exceed 1024 bytes

For example: http://downloads.oss.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/s/200/300/cc/200/260

The part of processing parameters includes img/s/200/300/cc/200/260

## Request for thumbnail through Style

Image processing can save user's image processing actions and parameters as another name (e.g. Stylename), namely style. After using the style function, a same effect can be archived only with a very short URL to replace the original series of actions.

(a) Old API

http://downloads.oss.cn-north-1.jcloudcs.com/lena.jpg?imgalias/stylename

(b) New API

http://downloads.oss.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=imgalias/stylename

## Specification description of image parameter processing

Image processing includes the following keywords imgalias,img,imginfo,imgexif,x-oss-process=imgalias,x-oss-process=img,x-oss-process=imginfo,x-oss-process=imgexif

* Under circumstances where the parameter image processing parameter is legal, only one of the above keywords can appear
       
     For example:
      
     oss.cn-north-1.jcloudcs/bucket/key.jpg?imgalias/style&img/s/100/200    (illegal)
       
     oss.cn-north-1.jcloudcs/bucket/key.jpg?imgalias/style&x-oss-process=imgalias/style2   (illegal)
       
     oss.cn-north-1.jcloudcs/bucket/key.jpg?imgalias/style   (legal)
       
* imgalias, img, x-oss-process=imgalias, x-oss-process=img parameter must be followed by a specific parameter

    For example:
    
    oss.cn-north-1.jcloudcs/bucket/key.jpg?imgalias/   (illegal)

* KV of RequestQuery has no specified sequence

    For example:
    
    oss.cn-north-1.jcloudcs/bucket/key.jpg?aaa=bb&imgalias/style    (legal)

* RequestQuery case sensitivity (KV has case sensitivity)

    For example:
    
    oss.cn-north-1.jcloudcs/bucket/key.jpg?imgalias/style    (legal)

    oss.cn-north-1.jcloudcs/bucket/key.jpg? Imgalias/style    (access artwork normally)
