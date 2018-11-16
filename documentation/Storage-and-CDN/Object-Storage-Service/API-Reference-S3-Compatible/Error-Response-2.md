# Error Response 

When an error and a message body in the application/xml format occur to the user’s access to OSS; OSS will return a proper 3xx, 4xx or 5xx HTTP Status Code to the user.


The following is a message body example of error response:
```
<Error>
    <statusCode>404</statusCode>
    <Code>NoSuchBucket</Code>
    <Message>The specified bucket does not exist.</Message>
    <Resource>/henry-dev-test-bucket123123123123</Resource>
    <RequestId>956F69119AE3958B</RequestId>
</Error>

```
For the explanation of elements included in the error message body in the example, please see the following table:

| Name | Description | Type|
| ------ | ------ |  ------ | 
| statusCode | Status Code | Numeric Value   |
| code | Error Code is the only identifier for error, which is used to identify error scenarios | Character String|
| Message | Detailed error information given by OSS | Character String|
| Resource | Resource Address: Bucket address or Object address. |Character String|
| RequestId | When the request is sent, the server will automatically generate a unique ID for the request. In case of any problem on use, the request-id can assist with OSS location problem faster. |Character String|


## Error Code List

3XX Type Error
<table>
<thead>
<tr>
<th>Error Code</th>
<th>Description</th>
<th>HTTP Status Code</th>
</tr>
</thead>
<tbody>
<tr>
<td>PermanentRedirect</td>
<td>The location of the resource has been permanently changed, please use HTTP Location to redirect to the correct new location</td>
<td>301</td>
</tr>
<tr>
<td>TemporaryRedirect</td>
<td>The location of the resource has been temporarily changed, please use HTTP Location to redirect to the correct new location</td>
<td>302 </td>
</tr>
<tr>
<td>Redirect</td>
<td>Temporary Redirection</td>
<td>307</td>
</tr>
<tr>
<td>TemporaryRedirect</td>
<td>You are redirected temporarily during DNS update period</td>
<td>307</td>
</tr>
</tbody>
</table>

4XX Type Error

<table>
<thead>
<tr>
<th>Error Code</th>
<th>Description</th>
<th>HTTP Status Code</th>
</tr>
</thead>
<tbody>
<tr>
<td>POLICYError</td>
<td>The bucket policy is null</td>
<td>400</td>
</tr>
<tr>
<td>RequestTimeOut</td>
<td>Reading data is time-out. Check whether the network is too slow or the number of concurrent uploads is too large</td>
<td>400 </td>
</tr>
<tr>
<td>SlowDown</td>
<td>Please reduce access frequency</td>
<td>400</td>
</tr>
</tbody>
<tr>
<td>RequestTimeTooSkewed</td>
<td>The request time exceeds the valid time of the permission</td>
<td>400</td>
</tr>
<tr>
<td>InvalidCompressError</td>
<td>Compress need bucket acl public-read-write.</td>
<td>400</td>
</tr>
<tr>
<td>TooManyBuckets</td>
<td>The number of buckets created by you exceeds the limit</td>
<td>400</td>
</tr>
<tr>
<td>CompressOjectsNumError</td>
<td>The number of packed files is wrong, and your range of packing shall be 1-100</td>
<td>400</td>
</tr>
<tr>
<td>TooManyMultipartUploads</td>
<td>The number of initialized multipart uploads exceeds the limit</td>
<td>400</td>
</tr>
<td>InvalidParamError</td>
<td>Request Parameter Error</td>
<td>400</td>
</tr>
<tr>
<td>EFFECT</td>
<td>referer can not apply effect</td>
<td>400</td>
</tr>
<tr>
<td>UserAlreadyHasKeys</td>
<td>the user already has keys</td>
<td>400</td>
</tr>
<tr>
<td>ConnectionLost</td>
<td>The connection is missing</td>
<td>400</td>
</tr>
<tr>
<td>InvalidParamError</td>
<td>Request Parameter Error</td>
<td>400</td>
</tr>
<tr>
<td>SignatureDoesNotMatch</td>
<td>The signature provided does not comply with the rule</td>
<td>403</td>
</tr>
<tr>
<td>SignatureDoesNotMatchV2</td>
<td>The signature version is wrong; the signature provided by you is not supported, and we support signature Version 4.</td>
<td>403</td>
</tr>
<tr>
<td>MethodNotAllowed</td>
<td>The specified method is not allowed against this resource</td>
<td>405 </td>
</tr>
<tr>
<td>InvalidPayer</td>
<td>The access to the object is denied</td>
<td>403</td>
</tr>
<tr>
<td>InvalidAccessKeyId</td>
<td>AccessKey does not exist</td>
<td>403 </td>
</tr>
<tr>
<td>SignatureDoesNotMatch</td>
<td>The signature provided does not comply with the rule</td>
<td>403 </td>
</tr>
<tr>
<td>AccessForbidden</td>
<td>The signature or permission is wrong, and access is denied</td>
<td>403 </td>
</tr>
<tr>
<td>InvalidBucketName</td>
<td>The bucket name is illegal</td>
<td>400</td>
</tr>
<tr>
<td>InvalidMaxAge</td>
<td>The assigned MaxAge is illegal</td>
<td>400</td>
</tr>
<tr>
<td>InvalidLocationConstraint</td>
<td>The assigned location restriction is illegal</td>
<td>400</td>
</tr>
<tr>
<td>InvalidObjectKey</td>
<td>The file name is illegal</td>
<td>400</td>
</tr>
<tr>
<td>InvalidCompressType</td>
<td>The packing type is illegal, and only zip is supported</td>
<td>400</td>
</tr>
<tr>
<td>InvalidContentLengthError</td>
<td>http header content-length error</td>
<td>400</td>
</tr>
<tr>
<td>InvalidContentMD5Error</td>
<td>http header content-md5 error</td>
<td>400</td>
</tr>
<tr>
<td>EntityTooLarge</td>
<td>The size of the upload file exceeds the required maximum value</td>
<td>413</td>
</tr>
<tr>
<td>CORSConfigurationTooLarge</td>
<td>The CORS configuration file exceeds the allowed maximum value</td>
<td>400</td>
</tr>
<tr>
<td>InvalidCORSConfiguration</td>
<td>The setting of CORS is illegal</td>
<td>400</td>
</tr>
<tr>
<td>InvalidWebsiteConfiguration</td>
<td>Static website hosting setting is illegal</td>
<td>400</td>
</tr>
<tr>
<td>WebsiteConfigurationTooLarge</td>
<td>The static website hosting setting exceeds the allowed maximum value</td>
<td>400</td>
</tr>
<tr>
<td>ImgProtectedConditionTooLarge</td>
<td>The original image protection exceeds the allowed maximum value</td>
<td>400</td>
</tr>
<tr>
<td>MissingContentLength</td>
<td>Header Content-Length is absent</td>
<td>400</td>
</tr>
<tr>
<td>MissingContentMD5</td>
<td>Content-MD5 is absent in the request header</td>
<td>400</td>
</tr>
<tr>
<td>ContentDispositionTooLong</td>
<td>Content Disposition is too long</td>
<td>400</td>
</tr>
<tr>
<td>BadDigest</td>
<td>The assigned Content-MD5 does not match with the one received by us</td>
<td>400</td>
</tr>
<tr>
<td>BadContentLength</td>
<td>The assigned file ContentLength does not match with the one received by us</td>
<td>400</td>
</tr>
<tr>
<td>InvalidRange</td>
<td>The requested file range is illegal</td>
<td>416</td>
</tr>
<tr>
<td>NotSupportMultiRange</td>
<td>The multiple ranges are not supported</td>
<td>416</td>
</tr>
<tr>
<td>KeyTooLong</td>
<td>The file name is too long</td>
<td>400</td>
</tr>
<tr>
<td>InvalidPartOrder</td>
<td>The numbers of upload by parts are not serial</td>
<td>400</td>
</tr>
<tr>
<td>MalformedPolicy</td>
<td>The policy format is wrong</td>
<td>400</td>
</tr>
<tr>
<td>IncorrectNumberOfFilesInPostRequest</td>
<td>Post request only allows uploading one file every time</td>
<td>400</td>
</tr>
<tr>
<td>InvalidToken</td>
<td>Illegal Token</td>
<td>400</td>
</tr>
<tr>
<td>BadRequest</td>
<td>Wrong Request</td>
<td>400</td>
</tr>
<tr>
<td>InvalidURI</td>
<td>The URI is illegal</td>
<td>400</td>
</tr>
<tr>
<td>InvalidArgument</td>
<td>The request parameter is illegal</td>
<td>400</td>
</tr>
<tr>
<td>NoSuchDomain</td>
<td>The assigned domain name does not exist</td>
<td>404</td>
</tr>
<tr>
<td>InvalidPolicyDocument</td>
<td>The policy configuration file is illegal</td>
<td>400</td>
</tr>
<tr>
<td>InvalidImgProtectedCondition</td>
<td>The original image protection configuration file is illegal</td>
<td>400</td>
</tr>
<tr>
<td>MalformedJson</td>
<td>The JSON format is wrong</td>
<td>400</td>
</tr>
<tr>
<td>MissingSecurityHeader</td>
<td>The necessary Header is absent</td>
<td>400</td>
</tr>
<tr>
<td>IncompleteBody</td>
<td>Numerical Value Not Assigned by Content-Length Request Header</td>
<td>400</td>
</tr>
<tr>
<td>AccessDenied</td>
<td>The signature or permission is wrong, and access is denied</td>
<td>403 </td>
</tr>
<tr>
<td>AccountProblem</td>
<td>Your account denies this operation</td>
<td>403 </td>
</tr>
<tr>
<td>AccessKeyLimited</td>
<td>Your signature or permission is stopped by policy</td>
<td>403 </td>
</tr>
<tr>
<td>AccountArrear</td>
<td>The account has arrears</td>
<td>403 </td>
</tr>
<tr>
<td>BucketAlreadyExists</td>
<td>The bucket name already exists and is unique globally</td>
<td>409</td>
</tr>
<tr>
<td>BucketAlreadyOwnedByYou</td>
<td>You have created the Buckett</td>
<td>409</td>
</tr>
<tr>
<td>BucketNotEmpty</td>
<td>The bucket cannot be blank or deleted</td>
<td>409</td>
</tr>
<tr>
<td>BucketHasMutiUploads</td>
<td>There is a multipart upload task, and the bucket cannot be deleted</td>
<td>409</td>
</tr>
<tr>
<td>BucketHasReplicationConfiguration</td>
<td>The bucket has cross-region replication rules and cannot be deleted</td>
<td>400</td>
</tr>
<tr>
<td>BucketHasPictureStyle</td>
<td>The bucket has image style and cannot be deleted</td>
<td>400</td>
</tr>
<tr>
<td>InvalidPart</td>
<td>The parts are absent</td>
<td>400</td>
</tr>
<tr>
<td>TooManyParts</td>
<td>There are too many parts</td>
<td>400</td>
</tr>
<tr>
<td>NoSuchCORSConfiguration</td>
<td>CORS configuration does not exist</td>
<td>404</td>
</tr>
<tr>
<td>NoSuchWebsiteConfiguration</td>
<td>Static website hosting configuration does not exist</td>
<td>404</td>
</tr>
<tr>
<td>NoSuchBucket</td>
<td>The bucket does not existt</td>
<td>404</td>
</tr>
<tr>
<td>NoSuchReplicationConfiguration</td>
<td>The cross-region replication configuration does not exist</td>
<td>404</td>
</tr>
<tr>
<td>NoSuchImgProtectedCondition</td>
<td>The original image protection configuration does not exist</td>
<td>404</td>
</tr>
<tr>
<td>NoSuchKey</td>
<td>The assigned file name does not exist</td>
<td>404</td>
</tr>
<tr>
<td>NoSuchUpload</td>
<td>The assigned multipart upload does not exist</td>
<td>404</td>
</tr>
</table>
5XX Type Error

<table>
<thead>
<tr>
<th>Error Code</th>
<th>Description</th>
<th>HTTP Status Code</th>
</tr>
</thead>
<tbody>
<tr>
<td>InternalErrror</td>
<td>Server Internal Error</td>
<td>500</td>
</tr>
<tr>
<td>DecryptError</td>
<td>The decryption is wrong, and the file is encrypted with a wrong method</td>
<td>500</td>
</tr>
<tr>
<td>NotImplemented</td>
<td>There is an unmanageable method in the Header</td>
<td>501</td>
</tr>
<tr>
<td>ServiceUnavailable</td>
<td>The server is busy, please try again</td>
<td>503</td>
</tr>
</tbody>
</table>
