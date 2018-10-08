# Include signature in URL

Except for using Authorization Head, the user also can add signature information in URL, then the user can forward such URL to the third party to implement authorized access.

Implementation Method:

URL Signature Example:

```
http://s.jcloud.com/mybucket/public/index.html?Expires=1369191796&AccessKey=9c379f079214447fad2959c4621cd6feVb797oH1&Sigature=tzEQUA%2Bj%2BUHcEp%2FBUMKeMd5bqGc%3D
```
The verification request based on query character string do not require any special HTTP Header, which assigns verification information through the query character string.

The URL signature must at least include three parameters of Signature, Expires, AccessKey.

1.The value of the parameter Expires is a UNIX time (seconds started from UTC time 00:00 January 1, 1970), which is used to identify timeout time of such URL. The request exceeding that time will be denied. For example: the current time is 1141889060, the developer wishes to create a URL automatically invalid after 60 seconds, the Expires time can be set as 1141889120.

2.AccessKey, namely, is AccessKey in key.

3.Signature represents signature information. The algorithm for all requests supported by JD Cloud and various Header parameters making signature in URL is basically same as the algorithm including signature in Header.
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

1.It is required to encode the calculated signature in URL-Encode

2.Exchange Date in StringToSign to Expires

3.Simultaneous inclusion of signature in URL and Head is not supported.

Example code:

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

Detailed Analysis:

1.When using a signature method in URL, it will expose your authorized data to the Internet within the expiration time, please evaluate use risks in advance.

2.When adding signature in URL, the order of Signature, Expires and AccessKey can be exchanged. But if one or more of Signature and AccessKey is/are missing, return 400 error. Error code: InvalidURI.

3.If the current time of access is later than the Expires time set in the request, return 400 Forbidden. Error code: ExpiredToken.

When generating the signature character string, except that Date is replaced to Expires parameter, it still includes Headers such as Content-Type, Content-MD5.
