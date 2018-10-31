#  Post object
PostObject uses an HTML form to upload files to a specified bucket.

Based on the browser's use of HTTP POST to directly upload files to the Bucket of Object Storage Service, the latency can be reduced. The Post Object's message entity is encoded by multipart/form-data. In the Put Object operations
, parameters are passed through the HTTP request header. In the Post operations, the parameters are passed as form fields in the message entity. This interface is compatible with S3, and only support the compatible S3 service domain name of OSS
, [refer to the server domain name](../../API-Reference-S3-Compatible/Regions-And-Endpoints.md).

Request Syntax

```
POST / HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com
Content-Length: length
Content-Type: multipart/form-data; boundary=your_boundary
 
--your_boundary
Content-Disposition: form-data; name="key"
 
object_key
--your_boundary
Content-Disposition: form-data; name="X-Amz-Credential"
 
<your accessKey>/<date>/<region>/s3/aws4_request
--your_boundary
Content-Disposition: form-data; name="X-Amz-Algorithm"
 
AWS4-HMAC-SHA256
--your_boundary
Content-Disposition: form-data; name="X-Amz-Date"
 
date
--your_boundary 
Content-Disposition: form-data; name="Policy"
 
base64Encoded_policy
--your_boundary
Content-Disposition: form-data; name="X-Amz-Signature"
 
signature
--your_boundary
Content-Disposition: form-data; name="file"; filename=<filename>
Content-Type: content_type
 
file_content
--your_boundary
Content-Disposition: form-data; name="submit"
Upload to OSS
--your_boundary--
```
Special Tips for Header:

|Name|Description|Required|
|-|-|-|
|Content-Type|Standard http header; but the type must be multipart/form-data, and specify the boundary<br>For example: Content-Type: multipart/form-data; boundary=your_boundary|Yes|
#### Form Field
|Name|Type|Description|Required|
|-|-|-|-|
|Cache-Control|String|Refer to PutObject for standard http header and it is recorded as the object metadata information,<br>Default Value: None|No|
|Content-Type|String|Refer to PutObject for standard http header and it is recorded as the object metadata information,<br>Default Value: None|No|
|Content-Disposition|String|Refer to PutObject for standard http header and it is recorded as the object metadata information,<br>Default Value: None|No|
|Content-Encoding|String|Refer to PutObject for standard http header and it is recorded as the object metadata information,<br>Default Value: None|No|
|Expires|String|Refer to PutObject for standard http header and it is recorded as the object metadata information,<br>Default Value: None|No|
|key|String|Uploaded Object Name.Support variable ${filename} (only support variable ${filename}); for example, specify the key as bucket/${filename}, at this moment you upload an image named test.jpg, then the key saved by oss is bucket/test.jpg<br>Default Value: None|Yes|
|policy|String|Used to limit this request.t is JSON encoded by UTF-8 and Base64<br>Default Value: None|Required for requests requiring signatures|
|success_action_redirect|String|Client jump address when upload succeedsIf the success_action_redirect is not specified, or it is specified but OSS does not resolve successfully, then OSS will return according to the success_action_status settings (return 204 by default)If the file upload fails, then OSS will return the error without jumping<br>Default Value: None|No|
|success_action_status|String|The status code returned when the file upload succeeds is specified, provided that success_action_redirect is not specified.If the value is 200 or 204, the content that OSS returns will be blank.If the value is 201, the status code returned will be 201, and http body content will be relevant object information in xml format<br>Default Value: 204<br>Valid Value: 200, 201, 204 (by default)|No|
|x-amz-algorithm|String|Signature algorithm, the value is AWS4-HMAC-SHA256<br>Default Value: None|Required for requests requiring signatures|
|x-amz-credential|String|If S3 API is used, then the format is <your-access-key-id>/<date>/<region>/s3/aws4_request<br>Example:AKIAIOSFODNN7EXAMPLEYYYYYYYYYYYY/20180601/cn-north-1/s3/aws4_request<br>Default Value: None|Required for requests requiring signatures|
|x-amz-date|String|ISO8601 time format, such as: 20180601T000000Z.The value of x-amz-date attribute in the policy should be the same as it<br>Note that the time of computing signature at this moment is 20180601<br>Default Value: None|Required for requests requiring signatures|
|x-amz-signature|String|String to signature <br>Default Value: None|Required for requests requiring signatures|
|x-amz-storage-class|String|Object Storage Type<br> Default Value: STANDARD (Standard Storage)<br>Valid Value: STANDARD (Standard Storage) and REDUCED_REDUNDANCY Reduced Redundancy Storage)|No|
|file|String|File or Text Content .The attribute must be placed at the end of the form, otherwise the attributes after the file will be ignored. Don't support multiple files to be uploaded at the same time<br>Default Value: None|Yes|
 
#### Response
 
#### Response Elements
 
 When and only when the return code is 201, the following will be returned.
 
|Name|Type|Description|
|-|-|-|
|PostResponse|Container|Bucket name stored by the object <br>Child Node: Bucket, Key, Etag|
|+Bucket|String|Bucket name stored by the object <br>Parent Node: PostResponse|
|+Key|String|object name <br>Parent Node: PostResponse|
|+Etag|String|Created when each Object is generated, the Object created by the Post request can be used to check whether the Object content has changed <br>Parent Node: PostResponse|
|+Location|String|Newly created Object URL, note: The key in the location will conduct urlencode <br>Parent Node: PostResponse|

#### Detail Analysis:
1.Performing a Post operation requires write permission to the bucket. If the bucket is public-read-write, the signature information may not be uploaded. Otherwise, signature verification is required to be performed on the operation. If the post form does not provide sufficient attributes required by the signature request, then this request will be deemed as an anonymous request.

2.If the POST request includes Header signature information or URL signature information, OSS will not check them. (Namely, the PostObject in the Form will prevail).

3.The form lacks of necessary attributes. For instance, lack of key, return 400 InvalidArgument; lack of file, return 400 IncorrectNumberOfFilesInPostRequest.

4.Capital and lowercase letters not distinguished for form attributes, e.g.: x-amz-signature and X-Amz-Signature are of equal value, but the value of form field has case sensitivity.

5.The form size limit is 20K (excluding file size), if not, return 400, MaxPostPreDataLengthExceeded.

6.The total length of the body requested by Post is not allowed to exceed 5G. If the file length is too large, it will return an error code: EntityTooLarge.

7.If the key value specifies a variable (only support variable ${filename}), the uploaded file name now includes a path, namely "/" or "\", then ${filename} will be replaced by the part behind the last one "/" or "\". E.g.: If the uploaded file name is C:\Program Files\directory1\file.txt, then the ${filename} in the key attribute will be replaced to file.txt

8.Attributes cannot be identified by OSS will be neglected, but attributes in the form are also required to be limited in the policy, if not, it will return 403 AccessDenied.

9.If Content-MD5 is specified in user form field (MD5 in request header will not be verified), OSS will compute the Content-MD5 of the body and check the consistency; if there is inconsistency, it will return BadDigest error code.

10.If the form includes success_action_redirect, the jumped target address is url + ?bucket=<yourBucket>&key=<yourKey>&ETag=etag. This query part will conduct urlencode.

11.The form and policy must use UTF-8 to encode. The policy is a piece of JSON encoded by using UTF-8 and Base-64.

12.Since there is no version management currently, if a user uploads a file with the same name, it will be replaced.
#### Example:
#### Request:

```
POST / HTTP/1.1
Host: testBucket.s3. cn-north-1.jcloudcs.com
Content-Length: length
Content-Type: multipart/form-data; boundary=123456789000
--123456789000
Content-Disposition: form-data; name="key"
test.txt
--123456789000
Content-Disposition: form-data; name="X-Amz-Credential"
AKIAIOSFODNN7EXAMPLEYYYYYYYYYYYY/20180601/cn-north-1/s3/aws4_request
--123456789000
Content-Disposition: form-data; name="X-Amz-Algorithm"
AWS4-HMAC-SHA256
--123456789000
Content-Disposition: form-data; name="X-Amz-Date"
20180601T000000Z
--123456789000
Content-Disposition: form-data; name="Policy"
eyJjb25kaXRpb25zIjpbeyJidWNrZXQiOiJ5b3VoZS10ZXN0In0sWyJzdGFydHMtd2l0aCIsIiRrZXkiLCJwb3N0LyJdLHsic3VjY2Vzc19hY3Rpb25fc3RhdHVzIjoiMjAxIn0seyJ4LWFtei1jcmVkZW50aWFsIjoiQUtJQUkyTUtVS0ZFUjRMNEJaNFEvMjAxODA3MTUvdXMtd2VzdC0xL3MzL2F3czRfcmVxdWVzdCJ9LHsieC1hbXotYWxnb3JpdGhtIjoiQVdTNC1ITUFDLVNIQTI1NiJ9LHsieC1hbXotZGF0ZSI6IjIwMTgwNzE1VDAzNTcyN1oifSxbImNvbnRlbnQtbGVuZ3RoLXJhbmdlIiwiMCIsIjkiXV0sImV4cGlyYXRpb24iOiIyMDE4LTA3LTMwVDEyOjAwOjAwLjAwMFoifQ==
--123456789000
Content-Disposition: form-data; name="X-Amz-Signature"
1b336b54bb3c7800f2137ee5b2d5d7ee676376800d388a17004ec2bee607897a
--123456789000
Content-Disposition: form-data; name="file"; filename=”d:/ test.txt”
Content-Type: text/plain
wrwe
--123456789000
Content-Disposition: form-data; name="submit"
Upload to OSS
--123456789000--

```

#### Response:
```
<?xml version="1.0" encoding="utf-8"?>
<PostResponse>
  <Bucket>testBucket</Bucket>
  <Key>test.txt</Key>
  <ETag>"1b6be8aac90401fe1cd5e4dd1c4b138f"</ETag>
  <Location>http://s3.cn-north-1.jcloudcs.com/testBucket/test.txt</Location>
</PostResponse>
```

#### Post Policy
The Policy form field of the Post request is used to verify the validity of the request, which may control the post request permission. The policy is a piece of JSON format text encoded by using UTF-8 and Base-64, stating the conditions that Post request must meet. Although the post form field is an option when the public-read-write bucket is uploaded, it is strongly recommended that you should use this field to limit the Post request.
Policy Example:

```
{ "expiration": "2018-12-01T12:00:00.000Z",
  "conditions":
    {"bucket": "myBucketName" },
    ["starts-with", "$key", "user/yuyu/"],
  ]
}

```

Post policy must include expiration and conditions.

##### expiration
The expiration time of policy requested by post, the time format is ISO8601 GMT. For example: “2018-06-01T12:00:00.000Z”, means the specified Post request must occur before June 1, 2018 12:00.

##### Conditions
Conditions are a list, which can be used to specify the legal value of form field of the specified Post request. See the following form for the conditions supported in the Policy:

|Name|Description|
|-|-|
|bucket|Bucket Names Uploaded by the Object<br>Support the matching types of exact matching|
|content-length-range|The maximum length and minimum length limits of the uploaded content<br>Support the matching types of content-length-range|
|Cache-Control<br>Content-Type<br>Content-Disposition<br>Content-Encoding<br>Expires|Standard http header, refer to the PutObject.<br>Support the matching types of exact matching and starts-with|
|key|Name of the Uploaded Object<br>Support the matching types of exact matching and starts-with|
|success_action_redirect|Url jump address when upload succeeds<br>Support the matching types of exact matching and starts-with|
|success_action_status|The status code returned when the file upload succeeds but the success_action_redirect is not specified<br>Support the matching types of exact matching|
|x-amz-algorithm|Signature algorithm, the value is AWS4-HMAC-SHA256 code<br>Support the matching types of exact matching|
|x-amz-credential|If S3 API is used, then the format is <your-access-key-id>/<date>/<region>/s3/aws4_requestExample: AKIAIOSFODNN7EXAMPLEYYYYYYYYYYYY/20180601/cn-north-1/s3/aws4_request<br>Support the matching types of exact matching|
|x-amz-date|ISO8601 time format, such as: 20180601T000000Z<br>Note that the time of computing signature at this moment is 20180601,<br>Support the matching types of exact matching|
|x-amz-storage-class|The storage type of Object, the default value is “STANDARD” (standard storage). Support two storage types, "STANDARD" (standard storage) and "REDUCED_REDUNDANCY" (reduced redundancy storage)<br>Support the matching types of exact matching|
 
 ###### Conditions Matching Method
 
|Matching Method|Description|
|-|-|
|Exact Matching|The form attribute must exactly match the value<br>For example, {"bucket":   "example-bucket”}, then it is required that the files can only be uploaded to the bucket named "example-bucket”.<br>Another writing way: [ "eq", "$bucket",   "example-bucket" ]|
|Starts With|The prefix of the form attribute must be the specified value <br>e.g. ["starts-with",   "$key", "OSS/"] specifies that the name of the uploaded file must have the OSS/ prefix
|Match An Arbitrary Value|Used to allow to specify the value of form attribute to be any content, use Starts With and assign it as empty ("")<br>For example: ["starts-with",   "$success_action_redirect", ""] allows the success_action_redirect in the form to be any value|
|Specified File Size|Only support content-length, the maximum and minimum values can be separated by commas<br>For example, ["content-length-range",   1048579, 10485760], limits the uploaded content size to be 1M~10M|

###### Escape Character
Because $ represents variable in the Post policy, the escape character \$ needs to be used when describing $. Besides, JSON will escape some characters. The following form describes the characters that need to be escaped in the Post policy.

|Escape Character|Description|
|:---|:-|
|\\/|Slash|
|\\|Backslash|
|\\$|USD Sign|
|\\b|Space|
|\\f|Form Feed|
|\\n|Line Feed|
|\\r|Carriage Return|
|\\t|Horizontal Tab|
|\\uxxxx|Unicode Character|

##### Detailed Analysis of Post Policy
1. The expiration and condition elements in the policy are required. Otherwise, the policy verification will fail and be deemed as an anonymous request.

2. In addition to x-amz-signature, file, policy and x-ignore-*, other attributes in the uploaded form must be limited in the policy. Otherwise it will be deemed as anonymous access.

3. If the policy format does not conform to the specification, such as entering an invalid Condition Match Type, it will be processed as an anonymous request.

4. Policy conditions (except content-length-range) verification failing or the corresponding attributes not found in the form will be both deemed as anonymous access; and EntityTooLarge, EntityTooSmall will return if the content-length-range verification fails.

###  Calculate Signature
For Post requests that require verification, the HTML form must contain the policy and signature (X-Amz-Signature) information. The values in the policy control request are allowed. The specific processes of calculating signature:

1. Create a policy encoded by UTF-8.

2. Encode the policy with base64, and use the value as the StringToSign field of signature calculation.

3. Use the HMAC-SHA256 algorithm to conduct signature calculation to the character strings and other signature-required information acquired in step 2, such as AccessKeySecret.

4. Encode the final result in hexadecimal.

#### Form Upload Example:
The following example provides how to use POST policy and the form to complete uploading a file to OSS.

##### Policy Example
```
{
	"expiration": "<expiration> example:2018-08-30T12:00:00.000Z",
	"conditions": [
		{"bucket": "<your bucket>"},
		["starts-with", "$key", "<your objectKey prefix>"], 
		{"Content-Type": "<type> example:image/jpeg"}, 
		{"X-Amz-Credential": "<your accessKey>/<date> example:20180709/<region>/s3/aws4_request"}, 
		{"X-Amz-Algorithm": "AWS4-HMAC-SHA256"}, 
		{"X-Amz-Date": "<date> example:20180709T053727Z"}
	]
}

```
##### Form Example

```
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>

  <form action="http://<your bucket>.s3.<region>.jcloudcs.com/" method="post" enctype="multipart/form-data">
    // Key to upload: 
    <input type="input"  name="key" value="<your objectKey>" />
    Content-Type: 
	<input type="input"  name="Content-Type" value="<type> example:image/jpeg" />
    <input type="text"   name="X-Amz-Credential" value="<your accessKey>/<date> example:20180709/<region>/s3/aws4_request" />
    <input type="text"   name="X-Amz-Algorithm" value="AWS4-HMAC-SHA256" />
    <input type="text"   name="X-Amz-Date" value="<date> example:20180709T053727Z" />
	<input type="hidden" name="Policy" value='<base64 policy>' />
    <input type="hidden" name="X-Amz-Signature" value="<signature>" />
    // File: 
    <input type="file"   name="file" /> 
    <!-- The elements after this will be ignored -->
    <input type="submit" name="submit" value="Upload to Amazon S3" />
  </form>
  
</html>

``` 

Note: You need to replace the valid bucket names; dates, credential, policy, and signature can successfully upload files to OSS.
