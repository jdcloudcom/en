# Quickly Use Image Service

You can use Object Storage Service console picture processing style to quickly use the OSS picture service.

## Create Image Style

1. Enter OSS Management Console-Space Management

2. Click bucket to enter the bucket overview page

3. Click Image Processing on the bucket overview page to enter the image processing page

![图片处理](../../../../../image/Object-Storage-Service/OSS-054.png)

4. Click Create Style; on this page, you can create the image style you need just as the figure shown below:

![新建图片样式](../../../../../image/Object-Storage-Service/OSS-056.png)


Rules Description:

(1) Style name: name of the newly created image processing style

(2) Scaling type: select the scaling type; options include uniform scale, center crop within the given width and height, long-side precedence within the given width and height

   * If uniform scale is selected, please enter a zoom percentage

   * If center crop within the given width and height is selected, please enter width/height size

(3) If long-side precedence within the given width and height is selected, please enter width/height size ("long side" means the side with higher ratio of original size to target size)

   * Output format: format consistent with the artwork, jpg, png, gif are optional formats

   * Output quality: the optional image quality range is 1-100%

(4) Watermark: no watermark or image watermark can be selected

   * After selecting the image watermark, you need to assign a watermark image and enter the file name in current space or locally upload the image

(5) Image progressive: provide progressive display function making blurry image clear when network is at low speed

(6) Image rotation: select rotation type of image; you can select to not to enable rotation, rotate at customized angle and rotate based on exif.

   * If rotation at customized angle is selected, you need to enter the rotation angle; the image will be clockwise rotated

5. After editing the image style, click **OK** to save the style.

 

## Use image style

1. Enter OSS console and click bucket to enter the bucket overview page.

2. Click **Image Processing** to view the saved style.

3. The image style named Stylename can be accessed through the following URL:

http://oss.cn-south-1.jcloudcs.com/bucket/object?x-oss-process=imgalias/Stylename

Example:

Use the style with the image processing style name of img-style-example to process the example.jpg image file

img-style-example style: scale 80%, rotate 60°

http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=imgalias/img-style-example

![](../../../../../image/Object-Storage-Service/OSS-057.jpg)
