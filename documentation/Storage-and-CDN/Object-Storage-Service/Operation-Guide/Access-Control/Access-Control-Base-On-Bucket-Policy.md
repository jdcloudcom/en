# Bucket Policy-based Permission Control

## Bucket Policy 

Bucket Policy is a resource-based authorization policy. The access policy uses the JSON-based access policy language. You can execute a specified action to a specified OSS resource by accessing the principal specified by policy language authorization.

### Common application scenarios of Bucket Policy are as follows:

-   Directly authorize other accounts to access.

    You can grant other primary accounts the permission to access your OSS resources.

-   Authorize sub-users of other accounts to access.

    You can grant sub-users of other accounts the permission to access your OSS resources.

-   Grant anonymous users the access permissions with specific restrictions.

     In some scenarios, you need to grant anonymous users the access policies with IP restrictions. For example, in your website providing services externally, static files are stored in OSS to prevent chains from being stolen by others so as to generate unnecessary costs. You can set policies with Referer restrictions through Bucket policy, to specify the list of permitted accesses. If you hope that only internal access is permitted to your enterprise’s internal confidential documents, you can set access policies with IP restrictions based on Bucket Policy. In the above scenarios, if there are a large number of accessing personnel, configuring IAM Policy for each person will be required, and the workload will be huge. Then, you can authorize efficiently and conveniently with Bucket Policy.
     
### Basic Element of Bucket Policy

#### Bucket policy language comprises the elements with the following basic meanings:

* Principal: It describes the entity of policy authorization. For example the user, or maybe other partner (primary account), sub-account, anonymous user, etc. This element is valid for bucket access policy, but it should not be added for user’s access policy.
* Statement: It describes the details of one or more permissions. The element comprises permission or permission sets of several other elements such as effect, action, resource and condition. One policy has only one statement element.
    - Effect: It describes that the result of the statement is "allow" or "deny", including two situations, namely allow and deny. This element is required.
    - Action: It describe the allowed or denied action. The action can be API or function set (a set of specific APIs). This element is required. See details in the following [Element Usage - Action].
    - Resource: It describes and refers to a specific resource or some resources on OSS. Resources are described in six segments. This element is required. For more information about how to specify resources, refer to the following [Element Usage - Resource].
    - Condition: It describes restrictions for effectiveness of policies. Condition comprises operator, operational key and operational value. Condition value may include Referer and IP address information. The element is an optional field.
   
**Description:** 
Currently, there are slight differences in syntax between the Bucket Policy elements and IAM Policy elements. Please make a distinction, and do not confuse the two.
The size restriction for Bucket Policy is 16k.
     
    
## Element Usage 

### principal

The principal element is used to specify the users, accounts, services or other entities allowed or denied to access resources. The element principal only functions in the bucket; is not required to be specified in user policy, as the user policy is directly attached to a specific user. The following is an example to specify a principal in the Bucket Policy.
   
**Description**

- account-ID: It is the account ID of the primary account, obtaining method: after logging in to the JD Cloud console with the primary account, click **Account Management**, and view the basic information page to obtain it.
- Wildcards are not supported for principal.

1. To grant other JD Cloud primary accounts the permission

 In specifying the primary account: "AWS":"arn:aws:iam::account-ID:root", "root" can be omitted.
 Examples
 For example, if the account ID is 123456789012, you can use the following method to specify the account in the Principal element:
    
```
    //Single Account

    "Principal":{"AWS":"arn:aws:iam::123456789012:root"}
 

    //Multiple Accounts

    "Principal": {
    "AWS": [
    "arn:aws:iam::123456789012:root",
    "arn:aws:iam::123456789010"
    ]
    }  

```
    
2. To grant JD Cloud IAM sub-users the permission

  Specify IAM sub-user:"AWS": "arn:aws:iam::account-ID:user/user-name"
  The user-name is the user name of the sub-user that you want to authorize
    
```
    //Single IAM Sub-user
    "Principal": { "AWS": "arn:aws:iam::123456789012:user/user-name" }  
    //Multiple IAM Sub-users
    "Principal": {
    "AWS": [
        "arn:aws:iam::123456789012:user/user-name-1",
        "arn:aws:iam::111111111111:user/UserName2"
     ]
    }

``` 
    
3. To grant everyone the permission, also called as anonymous access
 
  For example, if you configure the bucket as a website, and you need to set all the objects in the bucket open for access, please do as follows: 
  Example:
  
```
  "Principal":{"AWS":"*"}
```
### Effect
Effect means the authorization result of the Statement, which is divided into Allow and Deny. When the matching of several Statements succeeds, the priority of Deny is higher.
If no access permission to resources is explicitly granted (allow), the access is implicitly denied. You can also deny the access to resources, which can guarantee that the user cannot access to the resources, even if any other policy grants the access permission.
Examples
```
"Effect" : "Allow"
//Or
"Effect" : "Deny"

```
### Action

The list of supported Actions in Bucket policy is as follows:

|Action Keyword|Action Description|Corresponding API|Action Level | 
|-|-|-|-|
|s3:PutObject|Upload an Object to the Bucket, supporting normal upload and upload by parts, etc.|PUT Object, POST Object, PUT Object - COPY, Initiate Multipart Upload, Upload Part, Complete Multipart Upload, Abort Multipart Upload|  Object Level Action  |
|s3:GetObject|Get an Object and its relevant information in the Bucket|GET Object, HEAD Object|	Object Level Action  |
|s3:DeleteObject|Delete an Object in the Bucket|DELETE Object|Object Level Action|
|s3:ListBucket|List the Object in the Bucket|GET Bucket (List Objects), HEAD Bucket, List Multipart Upload|Bucket Level Action |
|s3:DeleteBucket|Delete the Bucket|DELETE Bucket|Bucket Level Action |

Example:
For example, with s3:DeleteObject permission, a user can perform a bucket deletion operation on OSS.

### Resource

For your OSS resources, the specifying methods in Bucket policy and IAM policy are slightly different, and the method to specify OSS Resource in Bucket policy:
Instead of specifying regions and namespaces, relative-id specifies your OSS resources, which can be a bucket or some objects or a certain object therein. It supports wildcards (? and /*).
```
arn:aws:s3:::relative-id
//Examples:
arn:aws:s3:::bucket_name 
arn:aws:s3:::bucket_name/key_name
```

Example: For example, the bucket name is examplebucket

|Resource Representation|Description|
|-|-|
|arn:aws:s3:::examplebucket/developers/design_info.doc|It represents objects under /developers/design_info.doc in examplebucket bucket|
|arn:aws:s3:::examplebucket/* |It represents all objects in examplebucket bucket|
|arn:aws:s3:::examplebucket/dir/* |It represents all objects under dir directory in examplebucket bucket|
|arn:aws:s3:::examplebucket/abc*|It represents all objects prefixed with adb in examplebucket bucket|
|arn:aws:s3:::example?bucket/* |It represents all objects in the bucket (such as example1bucket, example2bucket, and example3bucket.)|
### Condition
Bucket policy allows you to specify a condition, which is optional, for the rule to take effect when you grant the permission.
If multiple conditional operators are specified in one Condition, then multiple conditional operators are of AND relationship. If one array is specified in the value of a condition, then the elements inside the array are of OR relationship.
Only restricted user access source (Referer and IP addresses) is currently supported. The list of currently supported operators and descriptions are given below.

1. String Operator

| Condition Operator | Description|
|-|-|
|StringEquals|It represents objects under /developers/design_info.doc in examplebucket bucket|
|NotStringEquals |Unequal comparison of character string ignoring uppercase and lowercase|
|StringLike | Comparison of character string ignoring uppercase and lowercase This value can contain multi-character wildcard * or single-character wildcard? |
|StringNotLike|Comparison of mismatched character string ignoring uppercase and lowercase. This value can contain multi-character wildcard * or single-character wildcard? |

2. IP Address Condition Operator

| Condition Operator | Description|
|-|-|
|IpAddress|Specified IP address or range|
|NotIpAddress |All IP addresses except the specified IP address or range|

3. General Operator

| Condition Operator | Description|
|-|-|
|Null|If it is null or has no value|

Example:

1. Restrict IP access

```
 "Condition": {
         "IpAddress": {"aws:SourceIp": "54.240.143.0/24"},
         "NotIpAddress": {"aws:SourceIp": "54.240.143.188/32"} 
      } 

```
2. Control the specified HTTP Referrer

```
  "Condition":{
        "StringLike":{"aws:Referer":["http://www.example.com/*","http://example2.com"]}
      }

```

### Full Example of Bucket policy

1. The primary account allows anonymous users (all users) to implement download and upload operations for all objects in yourbucket bucket without authentication when the source of the accessing referer is www.abcxxx.com.
For more settings related to authorization, please refer to [Cross-account Authorization](../../Best-Practices/Access-Control-And-Permission-Management/Cross-Account-Access-Overview.md).

```

{
	"Statement": [{
		"Sid": "allowReferer",
		"Effect": "Allow",
		"Principal": {
			"AWS": "*"
		},
		"Action": [
			"s3:PutObject",
			"s3:GetObject"
		],
		"Resource": [
			"arn:aws:s3:::yourbucket/*"
		],
		"Condition": {
			"StringLike": {
				"aws:Referer": [
					"www.abcxxx.com"
				]
			}
		}
	}],
	"Id": "20190125114348155",
	"Version": "2012-10-17"
}


```
2. Authorize the cross-account the read and write permissions for image.png files in the specified bucket testbucket
```
 {
	"Version": "2012-10-17",
	"Id": "BucketId",
	"Statement": [{
		"Sid": "OtherAccountAllow",
		"Effect": "Allow",
		"Principal": {
			"AWS": [
				"arn:aws:iam::123456789012:root"
			]
		},
		"Action": ["s3:GetObject", "s3:PutObject"],
		"Resource": "arn:aws:s3:::testbucket/image.png"
	}]
}
```






