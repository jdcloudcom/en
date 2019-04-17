# The document contains Header and URL with signatures
# 1. Contain Signatures in Header

Users can add Header of Authorization in HTTP request to contain information on Signature, indicating that this message has been authorized.

## Methods of Calculating Authorization Field
```
Authorization ="jingdong" + " " + AccessKey + ":" + Signature;
Signature =base64(HMAC-SHA1(AccessKeySecret, UTF-8-Encoding-Of( StringToSign ) ) )
StringToSign =HTTP-Verb + "\n"
                       + Content-MD5 + "\n"
                       + Content-Type + "\n"
                       + Date + "\n"
                      + CanonicalizedHeaders
                      + CanonicalizedResource;
```

Note:

1. When Content-Type or Content-MD5 is absent, it shall be replaced by null character string.

2. You can log in to the console of JD Cloud with AccessKey and AccessKeySecret to view it in **AccessKey Management**. AccessKeySecret represents secret key needed for signature

3. HTTP-Verb represents Method requested by HTTP, mainly including PUT, GET, POST, HEAD, and DELETE.

4. \n represents line separator

5. Content-MD5 represents MD5 value of the requested content, and the message content (not including the header) is calculated for MD5 value to obtain a 128-bit number, and content-MD5 is obtained by encoding base64. The request header is available for the examination of message legality (whether a message is consistent with the sent content), such as “3fe8ebd7f5996651fa46c4aefe24b6af”, and it can also be null.

6. Content-Type represents the class of request, such as “text/plain”, and it can also be null

7. Date represents the time of this operation, and it must be GMT format, such as “Sun, 09 Jul 2017 06:08:40 GMT”

8. CanonicalizedHeaders represents the arrangement in the dictionary order of HTTP headers with prefix x-jss-.

9. CanonicalizedResource represents OSS resource that the user wants to access, of which Date and CanonicalizedResource can’t be null; if the Date time in the request is more than 15 minutes apart from the OSS server, OSS server will deny this service, and return an HTTP 403 Error.

## Methods of Constructing CanonicalizedHeaders

All HTTP Headers prefixed x-jss- are called CanonicalizedHeaders. Its building methods are as follows:

1. Convert all names of HTTP request headers prefixed x-jss- to lowercase.

2. Arrange all HTTP request headers from the last step in ascending order according to the dictionary order of the names.

3. Delete any space at either end of the delimiter between the request header and the content.

For example, convert x-jss-server-side-encryption:  false into x-jss-server-side-encryption:false

1. Separate each header and content with \n delimiter and splice CanonicalizedHeaders.

2. If there is no HTTP request header prefixed x-jss-, CanonicalizedHeaders shall be null character string "".

Note:

1. CanonicalizedHeaders can be null, and it’s not necessary to add the last \n.

2. If there is only one request header, such as x-jss-server-side-encryption:false\n, pay attention to \n at the end.

3. If there are more than one request headers, pay attention to “\n” at the end.

## Methods of Constructing CanonicalizedResource

The OSS target resource to be accessed in the request sent by the user is called CanonicalizedResource. Its building methods are as follows:

1. Set CanonicalizedResource to a null character string "".

2. Put in the OSS resource to be accessed /BucketName/ObjectName(if there is no ObjectName, then CanonicalizedResource will be “/BucketName”, and if there is no BucketName at the same time, it shall be “/”).

Example:

Regarding API of ListParts in MultipartUpload, the CanonicalizedResource at this time: /BucketName/ObjectName?uploadId=UploadId.

Description:

Multiple query will be spliced with & and spliced after path?. For example: PUT   /ObjectName?uploadId=UploadId&partNumber=PartNumber

The query signature field supported is as follows:
```
SUB_RESOURCES："lifecycle", "location", "logging", "partNumber", "policy", "uploadId", "uploads", "versionId", "versioning", "versions", "website", "acl"

RESPONSE_HEARDES："contentType", "contentLanguage", "cacheControl","contentDisposition", "contentEncoding"
```
 
## Rules of Calculating Signature Header
The signature character string must be in UTF-8 format. The signature character string containing Chinese character must be UTF-8 encoded before calculating the final signature with the AccessKeySecret.

1. The signature method uses HMAC-SHA1 method defined in RFC 2104, in which Key is AccessKeySecret.

2. Content-Type and Content-MD5 are not required in the request, but if the request requires signature verification, the null value shall be replaced by a null character string.

Signature Example

If:

AccessKey is “qbS5QXpLORrvdrmb”,

AccessKeySecret is “1MYaiNh3NeN9SuxaqFjSrc7I49rWKkQCxpl9eLNZ”

Request
```
PUT /sign.txt   HTTP/1.1
  Content-Type: text/plain
  Content-MD5: 0c791a8c18017c7ad1675936d12bae5d
  x-jss-server-side-encryption: false
  Date: Thu, 13 Jul 2017 02:37:31 GMT
  Authorization: jingdong qbS5QXpLORrvdrmb: xvj2Iv7WcSwnN26XYnTq/c2YBQs=
  Content-Length: 20
  Host: oss.cn-north-1.jcloudcs.com
```
Signature Character String Calculation Formula
```
Signature =   base64(hmac-sha1(AccessKeySecret,
  HTTP-Verb + “\n” 
  + Content-MD5 + “\n”
  + Content-Type + “\n” 
  + Date + “\n”

+ CanonicalizedHeaders
  + CanonicalizedResource))
```
Signature Character String
```
PUT\n

0c791a8c18017c7ad1675936d12bae5d\n

text/plain\n

Thu, 13 Jul 2017 02:37:31   GMT\n

x-jss-server-side-encryption:false\n

/oss-test/sign.txt
```
The following method is available for calculating signature (Signature):

JAVA Example Code:
```
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
 
String secretKey = "1MYaiNh3NeN9SuxaqFjSrc7I49rWKkQCxpl9eLNZ";
String signString = "PUT\n0c791a8c18017c7ad1675936d12bae5d\ntext/plain\nThu, 13 Jul 2017 02:37:31 GMT\n 
                     x-jss-server-side-encryption:false\n/oss-test/sign.txt";
SecretKeySpec signingKey = new SecretKeySpec(secretKey.getBytes("UTF-8"),"HmacSHA1");
Mac mac = Mac.getInstance("HmacSHA1");
mac.init(signingKey);
byte[] rawHmac = mac.doFinal(signString.getBytes("UTF-8"));
String signature =  new String(Base64.encodeBase64(rawHmac), "UTF-8");
```
The Signature calculation result shall be xvj2Iv7WcSwnN26XYnTq/c2YBQs=, because

Authorization = “jingdong “ + AccessKey + “:” + Signature, so the final Authorization is "jingdong qbS5QXpLORrvdrmb: xvj2Iv7WcSwnN26XYnTq/c2YBQs=", then plus Authorization header to compose the message to be sent finally:
```
PUT /sign.txt   HTTP/1.1
  Content-Type: text/plain
  Content-MD5: 0c791a8c18017c7ad1675936d12bae5d
  x-jss-server-side-encryption: false
  Date: Thu, 13 Jul 2017 02:37:31 GMT
  Authorization: jingdong qbS5QXpLORrvdrmb: xvj2Iv7WcSwnN26XYnTq/c2YBQs=
  Content-Length: 20
  Host: oss.cn-north-1.jcloudcs.com
```
Detailed Analysis:

1. If the incoming AccessKey is absent or inactive, return 403 Forbidden. Error code: InvalidAccessKey.

2. The time of incoming request must be within 15 minutes after the current time of JD Cloud Object Storage Server, otherwise it will return 403 Forbidden. Error code: RequestTimeTooSkewed.

3. If the format of the Authorization value in the user request header is incorrect, return 400 Bad Request. Error code: InvalidToken.

All requests of JD Cloud Object Storage Service shall adopt GMT time format specified by HTTP 1.1 protocol. The date format: Wed, 22 May 2017 05:29:49 GMT


# 2. Contain Signatures in URL

Except for using Authorization Head, the user also can add signature information in URL, then the user can forward such URL to the third party to implement authorized access.

Implementation Method:

URL Signature Example:

```
http://s.jcloud.com/mybucket/public/index.html?Expires=1369191796&AccessKey=9c379f079214447fad2959c4621cd6feVb797oH1&Sigature=tzEQUA%2Bj%2BUHcEp%2FBUMKeMd5bqGc%3D
```
The verification request based on query character string does not require any special HTTP Header, which assigns verification information through the query character string.

The URL signature must at least include three parameters of Signature, Expires, AccessKey.

1. The value of the parameter Expires is a UNIX time (seconds started from UTC time 00:00 January 1, 1970), which is used to identify timeout time of such URL. The request exceeding that time will be denied. For example, the current time is 1141889060, the developer wishes to create a URL automatically invalid after 60 seconds, the Expires time can be set as 1141889120.

2. AccessKey, namely, is AccessKey in key.

3. Signature represents signature information. The algorithm for all requests supported by JD Cloud and various Header parameters making signature in URL is basically the same as the algorithm including signature in Header.
```
Signature=URL-Encode(Base64(HMAC-SHA1(UTF-8-Encoding-Of(SecretKey,StringToSign))));

StringToSign =HTTP-Verb + "\n"

                        +Content-MD5 +"\n"

                        +Content-Type +"\n"

                        +Expires +"\n"

                        + CanonicalizedHeaders

                        +CanonicalizedResource;
```

In which, compared with the algorithm including signature in the header, the main differences are as follows:

1. It is required to encode the calculated signature in URL-Encode

2. Exchange Date in StringToSign to Expires

3. Simultaneous inclusion of signature in URL and Head is not supported.

Example Code:

Add JAVA example code of signature in URL:

AccessKey:9c379f079214447fad2959c4621cd6feVb797oH1

AccessKeySecret:41oUzT1opT69jpedWVg1vFTb31FvrewWSXnnZ7i1

```
import javax.crypto.Mac;

import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;


String secretKey =   "41oUzT1opT69jpedWVg1vFTb31FvrewWSXnnZ7i1";

String signString = "GET\n\n\n1369191796\n/mybucket/index.html";

SecretKeySpec signingKey = new SecretKeySpec(secretKey.getBytes("UTF-8"),   "HmacSHA1");

Mac mac = Mac.getInstance("HmacSHA1");

mac.init(signingKey);

byte[] rawHmac =   mac.doFinal(signString.getBytes("UTF-8"));

String signature =  new   String(Base64.encodeBase64(rawHmac), "UTF-8");
```

The final URL shall be:
```
http://mybucket.s.jcloud.com/index.html?Expires=1369191796&AccessKey=9c379f079214447fad2959c4621cd6feVb797oH1&Signature=mBb1uuC3y2GeyeqlW5+gN/tla6s=Host: s.jcloud.com
```

Detail Analysis:

1. When using a signature method in URL, it will expose your authorized data to the Internet within the expiration time, please evaluate use risks in advance.

2. When adding signature in URL, the order of Signature, Expires and AccessKey can be exchanged. But if one or more of Signature and AccessKey is/are missing, return 400 error. Error code: InvalidURI.

3. If the current time of access is later than the Expires time set in the request, return 400 Forbidden. Error code: ExpiredToken.

When generating the signature character string, except that Date is replaced to Expires parameter, it still includes Headers such as Content-Type and Content-MD5.
