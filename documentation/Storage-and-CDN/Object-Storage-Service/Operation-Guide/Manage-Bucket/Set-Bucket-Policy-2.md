# Set bucket policy

## Bucket Policy

Object Storage Service provides flexible permission control mechanism. You can set the access permission of the bucket when creating the bucket, or modify the space permission after creation. In addition to providing the access permission control ofbucket level, you can also conduct flexible permission access configuration to the files and the directory levels. There are currently four access permissions for the Bucket level:

|Permission Name|Permission English Value|Permission Description|
|-|-|-|
|Private Read/Write|Private|Bucket Owner obtains all executable action permissions. Only the Owner of the Bucket can read/write/delete the Object stored in it; others have no permission, and cannot access the Object in the Bucket without authorization|
|Public Read and Private Write|Public-Read|Bucket Owner obtains all executable action permissions. Only the Owner of the Bucket can write/delete the Object stored in it; others (including anonymous access) can read the Object. |
|Public Readand Public Write|Public-Read-Write|Bucket Owner obtains all executable action permissions, others obtain READ and WRITE permissions; all the costs incurred by these actions are borne by the Owner of the Bucket, please use the permission carefully. |
Customized permissions|User-Defined|The permissions of GetObject, PutObject, DeleteObject, ListObjects, DeleteBucket for the assigned users can be set, the resources that the permissions can access can be assigned, and the IP addresses and Referer White List with the permissions can be assigned.|

1.When creating a Bucket on the console, you need to assign an ACL for the Bucket. The effect is as follows:

![创建Bucket-访问权限](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-030.png)

2.You can also modify and configure advanced permissions (i.e. customized permissions) in the created Bucket. After entering the space management page of a space, click Space Settings->Permission Settings. The effect is as follows:

![权限设置](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-031.png)

If you set the permissions of the current Bucket to be customized permissions, you can create a corresponding Bucket Policy for the Bucket. The Bucket Policy defines which users can perform which types of actions on which kinds of resources in the Bucket. The effect is as follows:

![添加自定义权限](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-032.png)

Detail Specification:

(1) A maximum of 10 Bucket Policies can be created for each Bucket;

(2) The definition of each field in the Bucket Policy is as follows:

a. User authorization: It defines the users affected by the Bucket Policy. The default value is *, and the semantics is valid for all users. If it shall only be valid for part of the users, please click **customized users" and enter the user ID of the corresponding users in the text box (Note: User ID is different from user Pin; your user ID can be queried in User Management and the effect is as the image below), one user ID per line, that is, multiple user IDs shall be separated by line feed character intervals.

![用户授权1](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-033.png)

![用户授权2](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-034.png)

b. Involved action: It defines the actions that can be performed on the Bucket. Single-selection and full-selection are both okay, but at least one item shall be selected. Each action is defined as follows:

|Action Item Name|Action item description|
|-|-|
|PutObject|Upload an Object to the Bucket, supporting normal upload and upload by parts|
|GetObject|Get an Object and its relevant information in the Bucket|
|DeleteObject|Delete an Object in the Bucket|
|ListBucket|List the Objects in the Bucket|
|DeleteBucket|Delete the Bucket|

c. Affected resources: It defines which resources under the Bucket are operable or inoperable (i.e. Allow or Deny). “Operable Resources” is selected by default. The default value in the text box is bucketname/*, and the semantics is all resources under the current Bucket are operable; the enter format example is: myBucket/myfolder/object*, myBucket/*; the contents must start with the Bucket name. If the resource has only one slash, it cannot end with a slash; multiple resources can be set, with 1 and at most 1 wildcard in each line. At most 10 records can be added.

d. Referer White List: Since the Object Storage Service is charged by consumption, in order to prevent the chain of data stored in the Object Storage Service from being stolen by others, Object Storage Service supports the Referer anti-leech chain method based on the header field in the HTTP Header. You can set the White List of the Referer field to a Bucket and set whether to allow the request access with blank Referer in the customized permissions on the Object Storage Service console or through API. The following is a detailed explanation of the rules of the Referer White List.

(3) In addition to creating a Bucket Policy through a form, you can also use the customized permission editor to set the Policy (Note: the editor will display all the Policies under the current Bucket, no comments can be added in the editor, and 16KB can be entered at most). The effect is as follows:

![自定义权限编辑器](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-035.png)

(4) If you are creating a Bucket through API or SDK, and you do not assign the Bucket permissions when creating, the system will give the Bucket the default Private permissions, that is, only the Bucket Owner can operate and access the resources under the Bucket, while all requests of all the other users will be denied. To allow certain users to access and operate the resources under the Bucket, please authorize them in the Bucket Policy or change the permissions of the Bucket to Public-Read or Public-Read-Write.

## Referer White List setting

To prevent the data stored in Object Storage Service from hotlinking by others, Object Storage Service supports anti-leech chain method based on HTTP Header Referer field. You can set the White List of Referer field through the console. After setting the White List, only users of Referer field within the White List can access the data stored in Bucket and those requests out of the White List will be denied. However, if the Referer White List is not configured, data can be accessed by default without being limited by the White List.

The usage rules are as follows:

* Referer anti-leech chain rules only apply to Buckets of which the Bucket permissions are "customized permissions". The default rule is "Allow the Referer to be blank and the White List to be blank";

* The blank Referer is defined as: There is no Referer Header in a HTTP request or the contents of the Referer Header are blank;

* Referer White List supports domain name or IP address (if there is no domain name, IP must be added to the White List), multiple of them can be set and separated by line feed characters (carriage returns), case insensitive, and no need to write http:// or https:// before the domain name;

* The entered contents of the anti-leech chain can be 500 at most or the total number of bytes does not exceed 16384 bytes (i.e. 16KB);

* The anti-leech chain Referer domain name or IP parameters support the use of the wildcard "*”; using wildcard such as *.test.com in the domain name prefixes can refer to all multi-level subdomain names under test.com, and the domain name supports http and https protocols;

* IP address: Assign a list of IP addresses that have this permission. Use CIDR method to identify the IPs; each IP can have at most 1 wildcard * and shall end with .* Example: 192.168.0.1/24, 192.168.0.100, 192.168.* or 192.168.1.*;

Semantics Explanation of Referer White List:

* When the user setting allows the Referer and the White List to be blank, the request of the Referer being blank will be allowed, and the other requests (Referer being not blank) will be denied;

* When the user setting allows the Referer to be blank and does not allow the White List to be blank, the request of the Referer being blank and the requests consistent with the White List will be allowed, and the other requests will be denied;

* When the user setting does not allow the Referer to be blank and allow the White List to be blank, regardless of whether the Referer is blank, all the requests will be denied;

* When the user setting does not allow the Referer and the White List to be blank, only the request that the Referer belongs to the White List will be allowed, and the other requests (including the Referer being blank) will be denied;

The reference effect is as follows:

![Referer白名单](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-036.png)
