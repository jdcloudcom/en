# Original image protection of the image

For image files, to avoid the risk of stolen images in the business, it is required to limit the image URL that are exposed outwards so as to make anonymous visitors only get images that have been shortened or watermarked. This scenario can be implemented by turning on the original image protection.

## Rules of original image protection

After enabling original image protection, the following two access methods are unavailable:

* Direct access through external link address: http://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg

* Access by processing parameters: http://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=img/s/200/300

The image can only be accessed by style method: http://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/stylename

Description:

a. The rules are valid only for non-owner users. After the original image protection is configured, the owner users can obtain the original image through the signature access method.

b. The original image protection is mainly for image files, and the suffixes of the protected images must be configured. For example, if the configuration limits the .png suffix files, the original images with the .jpg suffixes can still be accessed. Image formats supporting configuration include png, jpg, jpeg, gif, bmp, webp, svg, jp2 (jpeg 2000), tiff, jbig

c. The original image protection supports the old and new interfaces for image processing, and also supports OSS domain names and compatible S3 domain names, we recommend to use [New Version Service Domain](https://docs.jdcloud.com/en/object-storage-service/regions-and-endpoints)

## Configuration rules

1.Go to the Object Storage Service console Bucket management page and click on the Bucket to be set the original image protection to enter the settings page.

2.Enter the image processing page, on which the image style of the current Bucket can be viewed and set.

![原图1](../../../../../image/Object-Storage-Service/OSS-152.png)

3. Click **Image Access Setting** to enter the settings page, you can choose to enable the original image protection and set the suffixes to be protected.

![原图2](../../../../../image/Object-Storage-Service/OSS-153.png)

**Description**
  Customized Delimiter.
  * You can select one or more delimiters;
  * You can respectively set the delimiter and original image protection;
  * For details, see [Customized Delimiter](./Delimiter-Guidance.md).

4.After setting the options you need, click OK to complete the current Bucket original image protection settings.
