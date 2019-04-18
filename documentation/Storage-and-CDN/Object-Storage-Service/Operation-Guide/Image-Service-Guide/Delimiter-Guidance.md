# Customized Delimiter

# Image Style 

All operation parameters for transforming images will be added behind URL, so this will make the URL of images long and inconvenient for reading. The JD Cloud OSS Image Service provides a function of image style, so you can save the common used image operation as an alias, i.e. image style (IMGStyle). Even for a complex operation, after using the image style function, you can achieve the same effect with a very short URL.

**There are multiple styles under one Bucket while the effect of the styles will only be taken under one Bucket.**

##  Access Rules of Image Style 

*  **Access via URL Parameter**
 ```
   <URL of file>?x-oss-process=imgalias/<StyleName>
 ```

Example:
```
bucket.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/stylename

```

 **This method is the default method of style access in image processing, which can be used when you only need to create a new image style on the Console**

* **Access via Delimiter**

```
<URL of file><Delimiter><StyleName>

```

Example:
   
 ```
 bucket.s3.cn-north-1.jdcloud-oss.com/lena.jpg{delimiter}stylename 
 
 ```
 
 **If the URL of the image is provided with a delimiter, OSS Image Service will take the content behind this delimiter as the style name. ** The delimiter will only take effect when it is configured on the Console. Support
  ` -, _, /, !` style delimiters. Access via Delimiter is an alternative use method for image processing.

       
**Description**

*  StyleName means the name of image style.
*   Create style, delete style and modify style can be operated either on the Console or through OPENAPI.
*   The accessed image style must be in the bucket where the image file locates, otherwise it will report an error.
  

## Set delimiter 

1.  In the left bucket list of [OSS Console](https://oss-console.jdcloud.com/space), click the name of the bucket to which you will set a delimiter.

2.  Click **Image Processing** tab to find the **Image Access Setting** button.

    ![](../../../../../image/Object-Storage-Service/OSS-152.png)

3.  Click **Image Access Setting** to open the setting window.

    ![](../../../../../image/Object-Storage-Service/OSS-151.png)

    In the setting window, you can conduct the following setting:

    -   Original Image Protection
    
        After opening original image protection, please refer to [Original Image Protection-Original Image Protection Rules](https://docs.jdcloud.com/cn/object-storage-service/source-image-protection) for the information you need to know.

        
    -   Customized Delimiter.
        * You can select one or more delimiters;
        * You can respectively set the delimiter and original image protection.
        
        
4. After setting the option required, click **OK** to complete the setting of delimiter.


## Examples

If we create a style for the bucket downloads:


-   Directly access by parameter

    [https://downloads.s3.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/r/60/q/71/p/s/200/300](https://downloads.s3.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/s/200/300/cc/200/260)

    ![](https://downloads.s3.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/r/60/q/71/p/s/200/300)

-   Access by using style through URL parameter

    [https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/imgstyle_demo](https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/imgstyle_demo)

    ![](https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/imgstyle_demo)

-   Access by using style through style delimiter

    [https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg!imgstyle_demo](https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/imgstyle_demo)

    ![](https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/imgstyle_demo)


These three methods can achieve the same effect.



