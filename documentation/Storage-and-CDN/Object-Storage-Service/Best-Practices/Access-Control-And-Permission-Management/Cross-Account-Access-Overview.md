# Cross-account Authorization Overview

All the OSS resources are private by default. If the owner wants to share the resources with any other person, he or she can authorize the person to access OSS resources by cross-account authorization. The method of cross-account authorized access to OSS resources is provided as follows.

- Realize the cross-account access to OSS based on Bucket Policy. Bucket Policy is a resource-based authorization policy. Compared with IAM Policy, Bucket Policy is easy to operate and supports
graphic configuration directly at the console. Bucket Policy supports to grant the access permission with specific IP restrictions and Referer to IAM sub-users, anonymous users, etc. of other accounts.
For detailed introduction and description, please see [Bucket Policy-based Permission Control](../../Operation-Guide/Access-Control/Access-Control-Base-On-Bucket-Policy.md).

Setting Method:

* API/SDK :

[Put Bucket Policy](../../API-Reference-S3-Compatible/Compatibility-API/Operations-On-Bucket/Put-Bucket-Policy-2.md)

[Delete Bucket Policy](../../API-Reference-S3-Compatible/Compatibility-API/Operations-On-Bucket/Delete-Bucket-Policy-2.md)

[Get Bucket Policy](../../API-Reference-S3-Compatible/Compatibility-API/Operations-On-Bucket/Get-Bucket-Policy-2.md)

* Console Setting:

1. Log in OSS Console - Space Management - Click the Bucket requiring authorization - Permission Management - Read/Write Permission Setting - Customized

![Bucket Policy](../../../../../image/Object-Storage-Service/OSS-118.png)

2. Directly edit in the editor.
Bucket policy (legal json), with the size restriction of 16KB.

![Bucket Policy](../../../../../image/Object-Storage-Service/OSS-119.png)

## Bucket policy Example

### 1. Authorize the cross-account the read and write permissions to the specified file

Scenario: Enterprise account A, which has one object, i.e. Object1, under the dir1 directory of the bucket named as Bucket1. Another enterprise account (accountID:123334444455) needs to have the read and write permission of the aforesaid objects.

```
 {
	"Version": "2012-10-17",
	"Id": "BucketId",
	"Statement": [{
		"Sid": "OtherAccountAllow",
		"Effect": "Allow",
		"Principal": {
			"AWS": [
				"arn:aws:iam::123334444455:root"
			]
		},
		"Action": ["s3:GetObject", "s3:PutObject"],
		"Resource": "arn:aws:s3:::Bucket1/dir1/Object1"
	}]
}
```
### 2. Authorize the sub-account the read and write permissions to the specific Bucket

Scenario: Enterprise account A (accountID: 123456789012), which has a bucket named as Bucket1, and intends to authorize its sub-account named as user1 the permission to read and write any object bucket.

```
 {
	"Version": "2012-10-17",
	"Id": "BucketId",
	"Statement": [{
		"Sid": "SubAccountAllow",
		"Effect": "Allow",
		"Principal": {
			"AWS": [
				"arn:aws:iam::123456789012:user/user1"
			]
		},
		"Action": ["s3:GetObject", "s3:PutObject"],
		"Resource": "arn:aws:s3:::Bucket1/*"
	}]
}
```
### 3. Authorize the sub-account of the cross-account the read and write permissions to the specified file


Enterprise account A (accountID: 123456789012), which has a bucket named as Bucket1. Another enterprise account B (accountID:123334444455) named as sub-account user2 needs to have the read and write permissions to the object under dir1 directory in enterprise account A, Bucket1.

The permission transfer is involved. First, enterprise account A needs to use Bucket Policy to grant enterprise account B the permission to read the objects under the directory. Second, sub-account user2 must be explicitly granted the permission of accessing dir1 directory in Bucket1 through IAM policy.

Step 1: Enterprise account A (accountID: 123456789012) grants enterprise account B (accountID:123334444455), through Bucket policy, the read and write permissions to read objects under dir1 directory in Bucket1.

```
{
	"Version": "2012-10-17",
	"Id": "BucketId",
	"Statement": [{
		"Sid": "OtherAccountAllow",
		"Effect": "Allow",
		"Principal": {
			"AWS": [
				"arn:aws:iam::123334444455:root"
			]
		},
		"Action": [
			"s3:GetObject",
			"s3:PutObject"
		],
		"Resource": "arn:aws:s3:::Bucket1/dir1/*"
	}]
}
```

Step 2: Enterprise account (accountID:123334444455) must explicitly grant sub-account user2 through IAM policy the permission of accessing dir1 directory in Bucket1.

```
{
	"Statement": [{
		"Action": [
			"oss:GetObject",
			"oss:PutObject",
			"oss:AbortMultipartUpload"
		],
		"Effect": "Allow",
		"Resource": ["jrn:oss:*:*:Bucket1/dir/*"]
	}],
	"Version": "3"
}

```


