# IAM Policy-based Permission Control
Identity and Access Management (IAM) is a user identity management and resource access control service provided by JD Cloud. IAM Policy is a user-based authorization policy. By setting
IAM Policy, you can centrally manage your users (such as employees, systems, or applications) and control the permission of users on which resources users can access under your name. For example, you can restrict your users to having read permission to only one
Bucket. The sub-account is subordinate to the primary account, and these accounts cannot have any actual resources. All resources belong to the primary account.


**Description**

At present, OSS only supports access of sub-user only in IAM, and the role will be supported later. The premise of using IAM Policy to control the permissions of sub-users is that you must log in to the IAM console, create a new sub-user, and grant its corresponding access policy. [For details, refer to IAM](https://docs.jdcloud.com/en/iam/core-concepts). And in current period, OSS does not support sub-account logging in the console. Your sub-account can only use API/SDK to complete various operations on OSS.

If you have cross-account authorization requirements, please view. [Access Control Based on Bucket policy](./Access-Control-Base-On-Bucket-Policy.md), to complete the cross-account authorization.

## How to construct IAM Policy

- IAM Policy  Basic Elements
- IAM Policy  Example

**Description:** Currently, there are slight difference between the syntax of Bucket Policy elements and IAM Policy elements. Please make a distinction according to your use, and do not confuse the two.
### IAM Policy  Basic Elements

IAM Policy language includes the elements with the following basic meanings:

Version: Version defines the version of IAM Policy. The element value of "version" currently supported is 3.

* Principal: It describes the entity to which the policy grant authorization, which does not need to be specified in user authorized access policy. The sub-account to which IAM Policy is granted is the entity for policy authorization. This element is valid for bucket access policy (Bucket Policy), but it should not be added for user authorized access policy (IAM Policy).

* Statement: It describes the details of one or more permissions. The element comprises permission or permission sets of several other elements such as effect, action and resource. One policy has only one statement element.
    - Effect: It describes that the result of the statement is “allow”; **it does not support to display as “deny” currently. The function is updating, coming soon **. This element is required.
    - Action: It describe the allowed or denied action. The action can be API or function set (a set of specific APIs). This element is required,
             Refer to the text below [Use of OSS IN IAM Policy-Specify the Action].
    - Resource: It describes and refers to a specific resource or some resources on OSS. This element is required. For more information about how to specify resources, refer to the text below
    [Use of OSS IN IAM Policy-Resource].
    
    Policy needs to follow the JSON syntax specification. For more information, please refer to [IAM Policy-Policy Syntax](https://docs.jdcloud.com/en/iam/elements).
    
### Use of OSS IN IAM Policy
#### 1) Specify the Action

List of Action supported in this period in IAM Policy is as follows:

|Action Keyword|Action Description|Corresponding API|Action Level | 
|-|-|-|-|
|oss:PutObject|Upload an Object to the Bucket, supporting normal upload and upload by parts, etc.|PUT Object, POST Object, PUT Object - COPY, Initiate Multipart Upload, Upload Part, Complete Multipart Upload|  Object Level Action  |
|oss:GetObject|Get an Object and its relevant information in the Bucket|GET Object, HEAD Object|	Object Level Action  |
|oss:DeleteObject|Delete the Object in the Bucket|DELETE Object|Object Level Action|
|oss:AbortMultipartUpload|Terminate Multipart Upload|AbortMultipartUpload|Object Level Action |
|oss:ListBucket|List the Object in the Bucket|GET Bucket (List Objects), HEAD Bucket|Bucket Level Action |
|oss:DeleteBucket|Delete the Bucket|DELETE Bucket|Bucket Level Action |
|oss:ListBucketMultipartUploads|List All Multipart Upload Events in Execution in the Bucket|ListMultipartUploads|Bucket Level Action |
|oss:* |All Actions Supported by OSS, Including Service Level Action, Bucket Level Action, Object Level Action| For list of all corresponding API, refer to [API Reference](https://docs.jdcloud.com/en/object-storage-service/compatibility-api-overview)| Actions at All Levels |

Example:

For example, with oss:GetObject permission, a user can perform a download operation on OSS.

**Description**

- In the above list, it shows the specified Action for user customized IAM Policy supported in this period. More actions will continue to be supported later; coming soon.

- The Action supported by OSS falls into three categories:

    * Service level action, corresponding to GetService action, is used to list all Buckets of a certain region belonging to that user. **User customized IAM Policy designation is not supported in this period** 
    * Bucket level action, corresponding to oss:DeleteBucket, oss:ListBucketMultipartUploads, oss:ListBucke. The object of action is Bucket.
    * Object level action, it is divided into oss:GetObject, oss:PutObject, oss:DeleteObjectand oss:AbortMultipartUpload. The object of action is Object.
    
- If you want to authorize the action of a certain category of Object, you can choose one or more of these categories. In addition, all Action must be preceded by the prefix "oss:", as shown in the example above.

#### 1) Specify the Resource

For your OSS resources, the method for specifying in IAM Policy is as follows:
Instead of specifying regions and namespaces, you can replace by "\*" as shown below. relative-id specifies your OSS resources, which can be bucket or some or a certain object therein. It supports the wildcard (\*) only currently.

 For details on description methods of various resources, refer to [IAM-Resource Description Methods](https://docs.jdcloud.com/en/iam/resource)
 
```
//Examples:
jrn:oss:*:*:bucket_name
jrn:oss:*:*:bucket_name/key_name
```

Example: For example, the bucket name is examplebucket

|Resource Representation|Description|
|-|-|
|jrn:oss:*:*:examplebucket/developers/design_info.doc|It represents an object of the developers/design_info.doc in the examplebucket bucket|
|jrn:oss:*:*:examplebucket/* |It represents all objects in examplebucket bucket|
|jrn:oss:*:*:examplebucket/dir/* |It represents all objects under dir directory in examplebucket bucket|
|jrn:oss:*:*:examplebucket/abc*|It represents objects prefixed with adc in examplebucket storage bucket|
|jrn:oss:*:*:examplebucket*|It represents storage buckets prefixed with examplebucket and all objects therein|

### IAM Policy  Example
#### 1. Fully Authorized IAM Policy
The fully authorized IAM Policy indicates that the sub-account is allowed to conduct any action on OSS. You can log in [IAM Console-User Management](https://iam-console.jdcloud.com/subUser/list) to authorize directly the system policy (JDCloudOSSAdmin).
```
{
    "Statement": [
        {
            "Action": [
                "oss:*"
            ],
            "Effect": "Allow",
            "Resource": "*"
        }
    ],
    "Version": "3"
}
```

#### 2. Read-only & not writing IAM Policy that does not Restrict Prefix

This Policy indicates that the sub-user can list and download all Objects under the Bucket named app-base-oss.

```
{
    "Statement": [
        {
            "Action": [
                "oss:GetObject",
                "oss:ListBucket"
            ],
            "Effect": "Allow",
            "Resource": [
                "jrn:oss:*:*:app-base-oss/*",
                "jrn:oss:*:*:app-base-oss"
            ]
        }
    ],
    "Version": "3"
}
```

#### 3. Read-only & not writing IAM Policy that Restricts Prefix
This Policy indicates that the sub-user can list and download all Objects prefixed with myuser1/ under the Bucket named app-base-oss But it cannot download Objects with other prefixes. By using this Policy, the applications under the control of different sub-accounts can correspond to different prefixes, so that the effect of spatial isolation in the same Bucket can be achieved.
```
{
    "Statement": [
        {
            "Action": [
                "oss:GetObject",
                "oss:ListBucket"
            ],
            "Effect": "Allow",
            "Resource": [
                "jrn:oss:*:*:app-base-oss/myuser1/*",
                "jrn:oss:*:*:app-base-oss"
            ]
        }
    ],
    "Version": "3"
}
```

#### 4. Write-only & not reading IAM Policy that does not Restrict Prefix
This Policy indicates that the application can upload the Object prefixed with myuser1/ in the Bucket named app-base-oss. But it cannot upload Objects with other prefixes. By using this Policy, if different applications correspond to different prefixes, the effect of spatial isolation in the same Bucket can be achieved.
```
{
    "Statement": [
        {
            "Action": [
                "oss:PutObject"
            ],
            "Effect": "Allow",
            "Resource": [
                "jrn:oss:*:*:app-base-oss/myuser1/*"
            ]
        }
    ],
    "Version": "3"
}
```
#### 5. Write-only IAM Policy that Restricts Prefix
This Policy indicates that the application can upload the Bucket named app-base-oss only.
```
{
    "Statement": [
        {
            "Action": [
                "oss:PutObject"
            ],
            "Effect": "Allow",
            "Resource": [
                "jrn:oss:*:*:app-base-oss/*"
            ]
        }
    ],
    "Version": "3"
}
```

#### 6. Read/Write IAM Policy that does not Restrict Prefix
This Policy indicates that the application can list, download, upload and delete all Objects under the Bucket named app-base-oss only.
```
{
    "Statement": [
        {
            "Action": [
                "oss:GetObject",
                "oss:PutObject",
                "oss:DeleteObject",
                "oss:ListBucket",
                "oss:AbortMultipartUpload"
            ],
            "Effect": "Allow",
            "Resource": [
                "jrn:oss:*:*:app-base-oss/*",
                "jrn:oss:*:*:app-base-oss"
            ]
        }
    ],
    "Version": "3"
}
```
#### 7. Read/Write IAM Policy that Restricts Prefix
This Policy indicates that the application can list, download, upload and delete Objects prefixed with myuser1/ under the Bucket named app-base-oss, but it cannot read or write Objects with other prefixes. By using this Policy, if different sub-users correspond to different prefixes, the effect of spatial isolation in the same Bucket can be achieved.
```
{
    "Statement": [
        {
            "Action": [
                "oss:GetObject",
                "oss:PutObject",
                "oss:DeleteObject",
                "oss:ListBucket",
                "oss:AbortMultipartUpload"
            ],
            "Effect": "Allow",
            "Resource": [
                "jrn:oss:*:*:app-base-oss/myuser1/*",
                "jrn:oss:*:*:app-base-oss"
            ]
        }
    ],
    "Version": "3"
}
```




    






