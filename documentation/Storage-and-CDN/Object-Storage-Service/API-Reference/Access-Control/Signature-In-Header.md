# Include signature in Header

User can add Header of Authorization in HTTP request to contain information on Signature, to state that this message has been authorized.

## Methods of Authorization field calculation
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

Notes:

1. When Content-Type and Content-MD5 is absent, it shall be replaced by null character string.

2. You can login the console of JD Cloud with AccessKey and AccessKeySecret to view it in **AccessKey Management**. AccessKeySecret represents secret key needed for signature.

3. HTTP-Verb represents Method of HTTP request, mainly including PUT, GET, POST, HEAD, DELETE, and so on.

4. \n represents line separator

5. Content-MD5 represents MD5 value of the content data requested, and the message content (not including the header) is calculated for MD5 value to obtain a 128-bit number, and content-MD5 is obtained by encoding base64. The request header can be used for the examination of message legality (whether a message is consistent with the sent content), such as "3fe8ebd7f5996651fa46c4aefe24b6af", and it can also be null.

6. Content-Type represents the type of request, such as "text/plain", and it can also be null.

7. Date represents the time of this operation, and it much be GMT format, such as "Sun, 09 Jul 2017 06:08:40 GMT".

8. CanonicalizedHeaders represents the arrangement in the dictionary order of HTTP headers with prefix x-jss-.

9. CanonicalizedResource represents OSS resource that users want to access, of which Date and CanonicalizedResource can’t be null; if the Date time in the request is more than 15 minutes apart from the OSS server, OSS server will reject this service, and return an HTTP 403 error.

## Methods of Constructing CanonicalizedHeaders

All HTTP Headers prefixed x-jss- are called CanonicalizedHeaders. Its construction methods are as follows:

1. Convert all names of HTTP request headers prefixed x-jss- in the form of lowercase.

2. Arrange all HTTP request headers from the last step in ascending order according to the dictionary order of the names.

3. Delete any spaces that appear at either end of the delimiter between the request header and the content.

for example, convert x-jss-server-side-encryption:  false into x-jss-server-side-encryption:false

1. Separate each header and content with the \n delimiter and splice the final CanonicalizedHeaders.

2. If there is no HTTP request header prefixed x-jss-, CanonicalizedHeaders shall be null character string "".

Note:

1. CanonicalizedHeaders can be null, and it’s not necessary to add the last \n.

2. If there is only one, such as x-jss-server-side-encryption:false\n, pay attention to \n at the end.

3. If there are more than one, pay attention to "\n" at the end.

## Methods of Constructing CanonicalizedHeaders

Users send request to access OSS target resource, which is called CanonicalizedResource. Its construction methods are as follows:

1. Set CanonicalizedResource to a null character string "".

2. Put in the OSS resource they want to access /BucketName/ObjectName (if there is no ObjectName, then CanonicalizedResource will be "/BucketName", and if there is no BucketName at the same time, it shall be "/").

Example:

Regarding API of ListParts in MultipartUpload operation, the CanonicalizedResource at this time is: /BucketName/ObjectName?uploadId=UploadId.

Description:

Multiple query will be spliced with & and spliced after path? For example: PUT   /ObjectName?uploadId=UploadId&partNumber=PartNumber

The query signature field supported is as follows:
```
SUB_RESOURCES："lifecycle", "location", "logging", "partNumber", "policy", "uploadId", "uploads", "versionId", "versioning", "versions", "website", "acl"

RESPONSE_HEARDES："contentType", "contentLanguage", "cacheControl","contentDisposition", "contentEncoding"
```
 
## Rules for calculating the signature header
The signature character string must be in UTF-8 format. The signature character string containing Chinese characters must be encoded UTF-8 before calculating the final signature with the AccessKeySecret.

1. The signature method uses HMAC-SHA1 method defined in RFC 2104, in which Key is AccessKeySecret.

2.Content-Type and Content-MD5 are not required in the request, but if the request requires signature verification, the null value shall be replaced by a null character string.

Signature sample

If:

AccessKey is "qbS5QXpLORrvdrmb",

AccessKeySecret is "1MYaiNh3NeN9SuxaqFjSrc7I49rWKkQCxpl9eLNZ"

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
Signature character string calculation formula
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
The following methods can be used to calculate signature (Signature):

JAVA sample code:
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

Authorization ="jingdong” + AccessKey + ":" + Signature. Therefore, Authorization is “jingdong qbS5QXpLORrvdrmb: xvj2Iv7WcSwnN26XYnTq/c2YBQs=", and add Authorization header to compose the final message that needs to be sent:
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

2.The time of incoming request must be within 15 minutes after the current time of Object Storage Service, otherwise it will return 403 Forbidden. Error code: RequestTimeTooSkewed.

3. If the format of the Authorization value in the user request header is incorrect, return 400 Bad Request. Error code: InvalidToken.

All requests in Object Storage Service must use the GMT format specified in the HTTP 1.1 Protocol. The date format is: Wed, 22 May 2017 05:29:49 GMT
