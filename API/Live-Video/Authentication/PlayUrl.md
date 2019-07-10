# Live Authentication

## Play Authentication Description

### Composition of Authentication URL

http://DomainName/Path/Filename? Parameter &auth_token=expire-uniqid-rand-signature

signature =md5sum("uri-expire-uniqid-rand-private_key")

### Authentication Field Description

|Field|Description|
|---|---|
|**expire**|Expiration time, 10-bit integers|
|**uniqid**|Integer, random, unique id, set to be 0 when not in use. The field can be used for marking identity or business and the user can set the field on its own|
|**rand**|Integer, random number, set to be 0 in general conditions, using time stamp when producing token as rand|
|**signature**|Character string, check string worked out with the md5 algorithm, mixture of numbers and lowercase English letters 0-9a-z, with fixed length of 32, case insensitive.|
|**uri**|It is the relative address of the user’s request object, excluding parameters.|
|**private_key**|Secrete key customized by the user (8-32 characters).|

### Verification Method

- When the CDN server gets the request, it will judge if expire in the request is before the current time. If yes, it is deemed as expired and the HTTP 403 error will be returned. If expire is later than the current time, a same character string will be constituted (refer to the following signature constitution method). Then, work out the new_signature with the MD5 algorithm and compare the new_signature with the signature in the request. Authentication is passed if the comparison results are consistent and the file will be returned. Otherwise, authentication is failed and the HTTP 403 error will be returned.
- new_signature is worked by computing the following character strings:
origin_signature = "uri-expire-uniqid-rand-private_key " (uri is the relative address of the user’s request object, excluding parameters)
new_signature = md5sum(origin_ signature)

### Example Description

- Allow the request target:
http://cdn.example.com/video/standard/1K.html?fa=121&jd=121
- The key is set to be: jdcloud1234 (set by the user)
- The authentication configuration file is expired on June 18, 2020, 00:00:00, equaling to 1592409600 seconds by computing
- The CDN server will constitute a signature character used for computing signature
/video/standard/1K.html-1592409600-0-0-jdcloud1234
- The CDN server will compute the signature according to character strings of the signature:
signature = md5sum("/video/standard/1K.html-1592409600-0-0-jdcloud1234") =06d97bc9e43ded48d991994006cfa127
- url at the request is:
http://cdn.example.com/video/standard/1K.html?fa=121&jd=121&auth_token=1592409600-0-0-06d97bc9e43ded48d991994006cfa127
The signature worked out is consistent with the value of signature =06d97bc9e43ded48d991994006cfa127 in the user’s request, thus the authentication is passed.
