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

*   After multiple delimiters are set, if the url contains several delimiters, image access will be subject to `- `→ `_ ` → `/` →` ! ` sequence. For specific rules, please see the following example:
Example:

If the image style name set for the bucket is: `imgStyle`. The request contains multiple legal delimiters, and bucket sets these delimiters, such as: `http://downloads.s3.cn-north-1.jcloudcs.com/lena.jpg-imgStyle_imgStyle`. In accordance with the matching sequence `- `→ `_ ` → `/` →` ! `, the system matches `-` as a delimiter. The contents after the delimiter will be the image style name, i.e. `imgStyle_imgStyle`. The contents before the delimiter are the file’s url, i.e. the object key is `lena.jpg`. If the bucket doesn’t set a style named as `imgStyle_imgStyle`, the system will consider the `-` here as not used as a delimiter. The next delimiter `_` set in the bucket will be matched. Also, the image style name is `imgStyle`, and the object key is `lena.jpg-imgStyle`. If the bucket has set a style named as `imgStyle`, the match succeeds and the processing result will be returned.

*   After customized delimiter setting is completed, if the file name contains the customized delimiter you set, priority will be given to the customized delimiter. For details, please see the following examples.

Example 1: testbucket contains a file named as `animal.jpg!imgStyle`, and at the same time testbucket contains the image style named as `imgStyle`.
Access the file URL`testbucket.s3.cn-north-1.jdcloud-oss.com/animal.jpg!imgStyle`. If the file named as animal.jpg exists, the processed image will be returned, and if not, 404 will be returned.

Example 2: testbucket contains a file named as `animal.jpg!imgStyle`, and at the same time testbucket doesn’t contain the image style named as `imgStyle`.
Access the file URL`testbucket.s3.cn-north-1.jdcloud-oss.com/animal.jpg!imgStyle`, and `animal.jpg!imgStyle` file will be returned.



  

## Set delimiter 

1.  In the left bucket list of [OSS Console](https://oss-console.jdcloud.com/space), click the name of the bucket to which you will set a delimiter.

2. Click **Data Processing** Tab, go to **Image Processing** functional region and find **Image Access Setting**.

3.  Click **Image Access Setting** to open the setting window.

    ![](../../../../../image/Object-Storage-Service/OSS-151.png)

    In the setting window, you can conduct the following setting:

    -   Original Image Protection
    
        After opening original image protection, please refer to [Original Image Protection-Original Image Protection Rules](https://docs.jdcloud.com/en/object-storage-service/source-image-protection) for the information you need to know.

    -   Customized Delimiter.
        * You can select one or more delimiters;
        * You can respectively set the delimiter and original image protection.
        
        

4. After setting the option required, click **OK** to complete the setting of delimiter.

**You can complete the setting of customized delimiter through [OPENAPI](http://docs.jdcloud.com/en/media-processing-service/api/setstyledelimiter).**


## Examples

If we create a style for the bucket downloads:


-   Directly access by parameter

    [https://downloads.s3.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/r/60/q/71/p/s/200/300](https://downloads.s3.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/r/60/q/71/p/s/200/300)

    ![](https://downloads.s3.cn-north-1.jcloudcs.com/lena.jpg?x-oss-process=img/r/60/q/71/p/s/200/300)

-   Access by using style through URL parameter

    [https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/imgstyle_demo](https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/imgstyle_demo)

    ![](https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/imgstyle_demo)

-   Access by using style through style delimiter

    [https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg!imgstyle_demo](https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg!imgstyle_demo)

    ![](https://downloads.s3.cn-north-1.jdcloud-oss.com/lena.jpg?x-oss-process=imgalias/imgstyle_demo)


These three methods can achieve the same effect.



