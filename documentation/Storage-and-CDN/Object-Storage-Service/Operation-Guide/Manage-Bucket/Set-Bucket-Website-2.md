# Static Website Hosting Setting

After uploading resources such as pictures, videos, static pages and client scripts to Bucket of Object Storage Service, the Bucket can be set to be the static hosting mode, and the user can assign the space as the default home page, error return page and redirect address upon access error. By virtue of this function, user can use a Bucket as a static website. However, dynamic websites rely on server-side processing, including server-side scripts such as PHP, JSP or ASP.NET, and Object Storage Service cannot support contents that require server-side script processing.

## Rules Description of Static Website Hosting

1.Static website hosting rules are Bucket level. The default Bucket does not enable static website hosting rules. Static web hosting rules will affect the three actions of Get Object, Get Bucket (List Objects) and Head Object after it is enabled. The access behavior of these three actions will be changed.

2.Object Storage Service supports accessing and operating to Bucket and Object through standard service domain name (such as oss.cn-north-1.jcloudcs.com), compatible S3 service domain name (s3.cn-north-1.jcloudcs.com) and user customization. When the user does not enable and configure the static website hosting rules, it is equivalent to use the above three methods to access the Object under the Bucket; after the static website hosting rules are enabled, when accessing the resources under the Bucket with the static website hosting rules enabled, only the compatible S3 service domain name and customized domain name access supports the business logic of static website hosting; when accessing and operating the resources under the Bucket by standard service domain name, the behavior is the same as before the static website hosting is not started; the future standard service domain name will also support the business logic of static website hosting.

3.After enabling the static website hosting rules, users can configure the customized index pages, customized error pages, and error redirect addresses:

* An index file is a web page that is returned when a request is made to the root or any subdirectory of a website, usually named index.html (it can also be named as other names). The static website hosting of Object Storage Service provides customized Index index files; when accessing a directory of any level under the Bucket through the compatible S3 service domain name or customized domain name without the file direction (i.e. the URL addresses ending with /), matching under the current directory will be conducted preferentially according to the customized index file names to see whether there are the customized index files (such as Index.html) set under the directory, and if the files do not exist, the default error page provided by Object Storage Service will be returned.

* The error page is the error page Object Storage Service returns to the user when the user encounters HTTP 4XX (400, 403, 404, etc.) errors (404 “NOT FOUND” is the most typical error) when accessing the static website. The static website hosting function of Object Storage Service provides setting customized error files; when 4XX errors occur when accessing any files in the Bucket through the compatible S3 service domain name or customized domain name, matching will be conducted according to the file paths and file names assigned in the customized error files (such as error.html, img\error.html, the customized error page does not need to be error.html but can be named by any file name supported by Object Storage Service), and if the file is found under the corresponding path, then the customized error file will be returned; if the configured customized error file is not matched, then the default error page provided by Object Storage Service will be returned.

* In addition, when encountering HTTP 4XX errors, the user can also set to send the request of accessing the origin server assigned by the user by the means of 302 redirection; once the user configures the error redirection function, the page will preferentially jump to the redirected address instead of showing the configured customized error page when encountering corresponding errors.

4.Before Bucket enables the static website hosting rules, when accessing the folders under the Bucket (i.e. with the format of http://bucketname.s3.cn-north-1.jcloudcs.com/test/), the downloading action will be performed on the access target, that is, downloading test/ as an object to the local; when the static website hosting rules are enabled and when the folders are accessed by compatible S3 service domain name or customized domain name, the downloading action will not be performed, and processing will be performed according to the processing logic of the static website hosting; if files need to be downloaded after enabling the static website hosting rules, ?x-oss-process=download  must be added at the end of URL of S3 service domain name or customized domain name to perform mandatory downloading (e.g. http://bucketname.s3.cn-north-1.jcloudcs.com/test/?x-oss-process=download)

## Relevant console actions:

1.Login to the Console->Object Storage Service->Space Management->Enter a Bucket->Space Settings, click **Static Website Hosting**:

![静态网站托管](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-040.png)

2.After clicking **Static Website Hosting**, the following are relevant configuration items. The description of all configuration items is as follows:

a. Customized INDEX page: Index files customized by the user, the Index page that is jumped to when the user accesses the root directory or a folder of the Bucket without assigning specific files:

* It is blank by default. If it is empty, it means that the configuration of the Index page is not currently enabled.

* It is allowed to enter any file format (if the browser cannot identify and open the file format, then the browser will perform downloading action on the files failed to be identified, and this behavior is browser behavior), and it is not allowed to enter /.

* The maximum enter length shall not exceed 1022 bytes.

When a Bucket is set to static website hosting mode, the customized Index file must be an Object in the Bucket, and case status must match perfectly. If the setting condition is index.html, but there is only Index.html under the Bucket without index.html, it will be not able to return to the customized page.

b. Customized error page: An error file customized by the user; an error page jumped to which when the user encounters a 4XX error while accessing the Bucket:

* The default value is null, which means that there is currently no configuration to enable error pages.

* It allows to input any file format (if the file format browser fails to be recognized or opened, the configuration is considered invalid), expect /.

* The maximum enter length shall not exceed 1022 bytes.

* When a Bucket is set to static website hosting mode, the customized Index file must be an Object in the Bucket, and case status must match perfectly. It can be a file in the root directory or a file in a folder, such as error.html or testFolder\error.html.

c. Access redirection configuration: The redirected user origin server configured by the user when the user encounters a 4XX error while accessing the Bucket:

* The priority is higher than the “customized error page”, it may specify a redirect address for error 400, 403 or 404; after the redirected address is configured, if the corresponding error is encountered, it is redirected to the configured corresponding address; while the redirected address is not configured, it will return to the customized error page when it encounters the 4XX error; if the customized error page is not configured, either, it will return to the default error page provided by the Object Storage Service.

* The default value is null, which means that there is currently no configuration to redirection.

* The maximum input length does not exceed 1022 bytes in theory (that is, it must conform to the file naming specification for Object Storage Service).

* It allows to input only the full domain name or IP format (input format check is required), such as https://www.test.com or http://192.168.1.10:8080; port number may be allowed (but not a must); wildcard character * is not supported.

* In addition to the standard domain name format, it also supports pointing to a subdirectory under the domain name, such as http://www.test.com/img/ or http://www.test.com/img

* If the URL contains the Query request parameter, the content of Query will be redirected to the origin server along with the URL when it redirected to the user source station; but if the user source station cannot recognize or parse the content of Query, the incidental function in the previous Query will not be effective in the user source station. For example: http://oss.cn-north-1.jcloudcs.com/downloads/example.jpg?x-oss-process=img/s/200/300, it 404 error encountered while accessing, the image style followed by the example.jpg will be redirected back to the user origin server along with the URL, but if the user source station is unable to recognize the picture style, the return content will be determined by the user source station's behavior.


3.After you have modified the configuration in static website hosting and click **Save Setting**, if one of the submitted change contents is not empty, it is deemed to have enabled the static site hosting; if the submitted change contents change from non-empty to complete-empty, the function of static website hosting is deemed to change from start using to stop using; if no modification is made, **Save Settings** is not clickable.

Detail Specification:

a. Configuration of customized Index pages in static website hosting logic is only valid for Buckets with “Public Read" privileges (Bucket of Public Read can be understood as “Public Read and Private Write”, “Public Readand Public Write” Buckets as well as Buckets with GetObject permissions for all users configured in “Customized Permissions”);

b. The configuration of a customized Index page will not take effect if a static website hosting rule is configured for a Bucket without “Public Read” permission; the handling rules are the same with those of a Bucket with “Public Read” permission when a 4XX error is encountered while accessing the Bucket (if 403 is encountered due to access authority), that is: if the redirected address is configured, if the corresponding error is encountered, it is redirected to the configured corresponding address; while the redirected address is not configured, it will return to the customized error page when it encounters the 4XX error; if the customized error page is not configured, either, it will return to the default error page provided by the Object Storage Service.
