# Global Settings

## 1. Transcoding Settings
Log in VOD console, click **VOD**-**Global Configuration**-**Transcoding Settings** on the menu bar at the left to access Transcoding Configuration page. You can click **Add Transcoding Template** to add new transcoding template(s). For existed transcoding templates, you can click **Edit** in the template list to access Template Edit page for modifying video and audio parameters in the templates.

![](https://github.com/jdcloudcom/cn/blob/6095a336fd4c1d5c1e448a37e933d569414fe918/image/Video-on-Demand/%E8%BD%AC%E7%A0%81%E8%AE%BE%E7%BD%AE1.png)

The template editing interface is as shown below:
![](https://github.com/jdcloudcom/cn/blob/cn-Video-on-Demand/image/Video-on-Demand/%E6%A8%A1%E6%9D%BF%E7%BC%96%E7%A0%81%E5%8F%82%E6%95%B0%E8%AE%BE%E7%BD%AE.png)

## 2. Watermark Settings
Login VOD console, click **VOD**-**Global Configuration**-**Watermark Settings** on the menu bar at the left to access "Watermark Settings" page. You can click **Add Watermark Template** to add new watermark template(s). For existed watermark templates, you can click **Edit** in the template list to access Template Edit page for modifying watermark parameters in the templates.

![](https://github.com/jdcloudcom/cn/blob/6095a336fd4c1d5c1e448a37e933d569414fe918/image/Video-on-Demand/%E6%B0%B4%E5%8D%B0%E8%AE%BE%E7%BD%AE1.png)

![](https://github.com/jdcloudcom/cn/blob/6095a336fd4c1d5c1e448a37e933d569414fe918/image/Video-on-Demand/%E6%B0%B4%E5%8D%B0%E6%A8%A1%E6%9D%BF3.png)

## 3. Category Settings
Login VOD console, click **VOD**-**Global Configuration**-**Category Settings** on the menu bar at the left to access "Category Configuration" page. You can add categories and sub-categories.

![](https://github.com/jdcloudcom/cn/blob/6095a336fd4c1d5c1e448a37e933d569414fe918/image/Video-on-Demand/%E5%88%86%E7%B1%BB%E6%A8%A1%E6%9D%BF1.png)

## 4. Domain Settings
### 4.1 Domain Addition
JD Cloud provides customer with one default domain by default. If you need to modify it, you can add your domains with ICP filing through Domain Setting and set them as default. You can also carry out operations of start, stop and deletion. You cannot delete your domain in starting until you stop it.

![](https://github.com/jdcloudcom/cn/blob/6095a336fd4c1d5c1e448a37e933d569414fe918/image/Video-on-Demand/%E5%9F%9F%E5%90%8D%E8%AE%BE%E7%BD%AE1.png)

![](https://github.com/jdcloudcom/cn/blob/6095a336fd4c1d5c1e448a37e933d569414fe918/image/Video-on-Demand/%E5%9F%9F%E5%90%8D%E8%AE%BE%E7%BD%AE2.png)

After adding the customized domain, the domain can be normally resolved and used only when the customer makes the cname association operation with the domain service provider. For specific operation steps, please refer to the Operation Guide of each domain service provider.
   
### 4.2 Identity and Access Management

VOD products support configuration in respect of playing domain security. Click the domain to be configured in the domain setting interface to go to the domain "access setting" page.


![域名设置-访问设置页面.png](../../../../image/Video-on-Demand/域名设置-访问设置页面.png)

**A. Referer Anti-Leech**

Conduct visitor identification and filter by the configured access blacklist and whitelist to limit the situation where resources are accessed. Click the Modify Configuration option after Referer Anti-Leech, and configure rules in the pop-up window.

![访问设置-referer防盗链设置.png](../../../../image/Video-on-Demand/访问设置-referer防盗链设置.png)

**B. URL Authentication**

Senior anti-leech function, encrypting URL by setting authentication KEY to fully protect resources on the origin server. Click the Modify Configuration option after URL Authentication, and configure in the pop-up dialog box based on demand. For the authentication details, please refer to contents in 4.3. In addition, after the authentication function is enabled, the following two points shall be noted:

1. After key Anti-Leech is enabled, the origin URL will not be able to be used for playing. Please generate URL with authentication for playing in accordance with the detailed content introduction in Section 4.3

2. After URL Authentication is enabled, the playing in hls format cannot be previewed at the Console temporarily

![访问设置-URL鉴权.png](../../../../image/Video-on-Demand/访问设置-URL鉴权.png)
![访问设置-URL鉴权生成器.png](../../../../image/Video-on-Demand/访问设置-URL鉴权生成器.png)

**C. IP Blacklist**

Visitor’s identity is identified and filtered through blacklist, and the IPs added to the blacklist will not be able to access the current accelerated domain.

![访问设置-IP黑名单.png](../../../../image/Video-on-Demand/访问设置-IP黑名单.png)

### 4.3 URL Authentication Description

URL Authentication supports parameter and path authentication. The user can select appropriate authentication method depending on its own business situation to provide valid protection to origin server resources.

**A. Parameter Authentication Method**

1 Encrypted URL Composition

http://DomainName/Path/Filename?parameter&auth_token=expire-uniqid-rand-signature

signature =md5sum("uri-expire-uniqid-rand-private_key")

2 Authentication Field Description

|Field|Description|
|-|-|
|expire|Expiration time, 10-bit integers|
|uniqid|Integer, random, unique id, set to be 0 when not in use. The field can be used for marking identity or business and the user can set the field on its own|
|rand|Integer, random number, set to be 0 in general conditions, using time stamp when producing token as rand|
|signature|Character string, check string worked out with the md5 algorithm, mixture of numbers and lowercase English letters 0-9a-z, with fixed length of 32, case insensitive|
|uri|It is the relative address of the user’s request object, excluding parameters|
|private_key|Secrete key customized by the user (8-32 characters)|

3 Principle Description

When the CDN server gets the request, it will judge if expire in the request is before the current time. If yes, it is deemed as expired and the HTTP 403 error will be returned. If expire is later than the current time, a same character string will be constituted (refer to the following signature constitution method). Then, work out the new_signature with the MD5 algorithm and compare the new_signature with the signature in the request. Authentication is passed if the comparison results are consistent and the file will be returned. Otherwise, authentication is failed and the HTTP 403 error will be returned.

new_signature is worked by computing the following character strings:

origin_signature = "uri-expire-uniqid-rand-private_key " (uri is the relative address of the user’s request object, excluding parameters)

new_signature = md5sum(origin_ signature)

4. Example Description

Allow the request target:
http://cdn.example.com/video/standard/1K.html?fa=121&jd=121

The key is set to be: jdcloud1234 (set by the user)

The authentication configuration file is expired on June 18, 2020, 00:00:00, equaling to 1592409600 seconds by computing

The CDN server will constitute a signature character used for computing signature

/video/standard/1K.html-1592409600-0-0-jdcloud1234

The CDN server will compute the signature according to character strings of the signature:
signature = md5sum("/video/standard/1K.html-1592409600-0-0-jdcloud1234") =06d97bc9e43ded48d991994006cfa127

url at the request is:
http://cdn.example.com/video/standard/1K.html ?fa=121&jd=121&auth_token=1592409600-0-0-06d97bc9e43ded48d991994006cfa127

The signature worked out is consistent with the value of signature =06d97bc9e43ded48d991994006cfa127 in the user’s request, thus the authentication is passed.

**B. Path Authentication Method**

1 Encrypted URL Composition

http://DomainName/deadline/ md5sum("uri-deadline-password")/Path/Filename?parameter

2 Authentication Field Description

|Field|Description|
|-|-|
|deadline|Expiration time, 10-bit integers|
|uri|It is the relative address of the user’s request object, excluding parameters|
|password|Secrete key customized by the user (8-32 characters|
|md5hash|Check string worked out with the md5 algorithm, mixture of numbers and lowercase English letters 0-9a-z, with fixed length of 32, case insensitive|

3 Principle Description

When the CDN server gets the request, it will judge if deadline in the request is before the current time. If yes, it is deemed as expired and the HTTP 403 error will be returned. If deadline is later than the current time, a same character string will be constituted (refer to the following sstring constitution method). Then, work out the HashValue with the MD5 algorithm and compare it with the md5hash in the request. Authentication is passed if the comparison results are consistent and the file will be returned. Otherwise, authentication is failed and the HTTP 403 error will be returned.

HashValue is worked by computing the following character strings:

sstring = "uri-deadline-Password" (uri is the relative address of the user’s request object, excluding parameters)

HashValue = md5sum(sstring)

4. Example Description

Allow the request target:
http://cdn.example.com/video/standard/1K.html ?fa=121&cc=121

The key is set to be: jcloud1234 (set by the user)

The authentication configuration file is expired on June 18, 2020, 00:00:00, equaling to 1592409600 seconds by computing

The CDN server will constitute a signature character used for computing Hashvalue

/video/standard/1K.html-1592409600-jcloud1234"

The CDN server will compute the HashValue according to character strings of the signature:
HashValue = md5sum("/video/standard/1K.html-1592409600-jcloud1234") = 8afb0900782e14c35214ccda534a3679

url at the request is:
http://cdn.example.com/1592409600/8afb0900782e14c35214ccda534a3679/video/standard/1K.html? fa=121&cc=121

The authentication is passed if the HashValue worked out is consistent with the value of md5hash = 8afb0900782e14c35214ccda534a3679 in the user’s request.

## 5. Callback Settings
VOD supports message subscription of task completion. If customers need to obtain message notifications of upload completion, transcoding completion, they can set callback URL and callback events in the Callback Settings, which relevant events will be timely notified to customers through URL they entered.
![](https://github.com/jdcloudcom/cn/blob/cn-Video-on-Demand/image/Video-on-Demand/%E5%9B%9E%E8%B0%83%E8%AE%BE%E7%BD%AE1.png)




