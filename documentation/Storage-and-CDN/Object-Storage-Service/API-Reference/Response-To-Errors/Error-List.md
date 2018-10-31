# Error response list

|Error Code|Description|HTTP Status Code|Note|
|-|-|-|-|
|AccessDenied|Access Denied|403|Access Denied|
|AccountProblem|There is a problem with your JSS account that prevents the operation from completing successfully.|403|The account is frozen, generally due to traffic out of limit or any other reason|
|AccessKeyLimited|The access key policy that prevents the operation from completing successfully.|403|Bucket to be created already exists, and Bucket name is globally unique, please select again|
|BucketAlreadyExists|The requested bucket name is not available. The bucket namespace is shared by all users of the system. Please select a different name and try again.|409|The Bucket to be created already exists, and Bucket name is globally unique, please select again|
|InvalidLocationConstraint|The specified location constraint is not valid.|400|The region you selected does not exist|
|BucketAlreadyOwnedByYou|Your previous request to create the named bucket succeeded and you already own it.|409|You have created a bucket with the same name|
|InvalidBucketName|The specified bucket is not valid.|400|The Bucket name to be created is illegal|
|InvalidObjectKey|The specified object key is not valid.|400|The name of specified Object key is illegal|
|EntityTooLarge|Your proposed upload exceeds the maximum allowed object size.|400|The uploaded data size exceeds the limit. Currently maximum allowed size of a single file is 5G|
|EntityTooSmall|Your proposed upload is smaller than the minimum allowed object size.|400| |
|MissingContentLength|You must provide the Content-Length HTTP header.|400|Lack of Content-Length in HTTP Header|
|BucketNotEmpty|The bucket you tried to delete is not empty.|409|The bucket you tried to delete cannot be empty|
|BucketNotEmpty|The bucket you tried to delete has some muti uploads didn't delete.|409|The bucket you tried to delete has some multipart uploads didn't delete|
|BucketNotEmpty|The bucket you tried to delete has acl didn't delete.|409|The bucket you tried to delete has ACL didn't delete|
|BadDigest|The Content-MD5 you specified did not match what we received.|400|The value of Content-MD5 did not match the server computing|
|RequestTimeTooSkewed|The difference between the request time and the server's time is too large.|400|The difference between the request time and the server's local time is too large. Denied|
|InvalidPart|One or more of the specified parts could not be found. The part might not have been uploaded, or the specified entity tag might not have matched the part's entity tag.|400|When completing Multipart Upload, the Part in HTTP request could not be found in the cloud storage. The Part might not have been uploaded|
|TooManyParts|Part number must less than 10000.|400| |
|BadContentLength|Object content length your specified did not match what we received.|400| |
|ConnectionLost|Your socket connection to the server may be lost while we receiving data.|400| |
|RequestTimeout|Your socket connection to the server was not read from or written to within the timeout period.|400| |
|SlowDown|Please reduce your request rate.|400| |
|AccessKeyDenied|the user already has keys.|400| |
|NoSuchFile|The file doesn't exist,please upload the file again!|400| |
|DecryptError|Decrypt the file error, the file encrypt by bad way!|400| |
|ExpiredToken|The provided token has expired.|400| |
|InvalidRange|The requested range cannot be satisfied.|416| |
|KeyTooLong|Your key is too long.|400| |
|NoSuchBucket|The specified bucket does not exist.|404| |
|NoSuchKey|The specified key does not exist.|404| |
|InvalidPartOrder|The list of parts was not in ascending order.Parts list must specified in order by part number.|400| |
|PreconditionFailed|At least one of the preconditions you specified did not hold.|412| |
|MalformedPOSTRequest|The body of your POST request is not well-formed multipart/form-data.|400| |
|MalformedPolicy|The policy of your request is not well-formed.|400| |
|IncorrectNumberOfFilesInPostRequest|POST requires exactly one file upload per request.|400| |
|UserKeyMustBeSpecified|The bucket POST must contain the specified field name. If it is specified, check the order of the fields.|400| |
|TooManyBuckets|You have attempted to create more buckets than allowed.|400| |
|TooManyMultipartUploads|You have attempted to initiate more multipart uploads than allowed.|400| |
|InternalError|We encountered an internal error. Please try again.|500| |
|InvalidToken|The provided token is malformed or otherwise invalid.|403| |
|BadRequest|Bad Request|400| |
|InvalidPolicyDocument|The content of the form does not meet the conditions specified in the policy document.|400| |
|InvalidURI|Couldn't parse the specified URI.|400| |
|SignatureDoesNotMatch|The request signature we calculated does not match the signature you provided.|403| |
|InvalidArgument|InvalidArgument|400| |
|MethodNotAllowed|The specified method is not allowed against this resource.|405| |
|NotSuchBucketPolicy|The specified bucket does not have a bucket policy.|404| |
|InvalidPayer|All access to this object has been disabled.|403| |
|MalformedJson|The JSON you provided was not well-formed or did not validate against our published schema.|400|
|NoSuchUpload|The specified multipart upload does not exist. The upload ID might be invalid, or the multipart upload might have been aborted or completed.|404| |
|MissingSecurityHeader|Your request was missing a required header.|400| |
|InvalidAccessKeyId|The Access Key Id you provided does  not exist in our records.|403| |
|InvalidCallback|upload success but callback failed.|567| |
|NoSuchPattern|The specified pattern does not exist.|404| |
|InvalidTargetObjectKey|The specified target object key has already exists.|400| |
|BucketHasPictureStyle|The bucket you tried to delete has PictureStyle didn't delete.|409| |
|IncompleteBody|You did not provide the number of bytes specified by the Content-Length HTTP header.|400|
