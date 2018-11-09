# OSS API introduction

Object Storage Service (OSS) is a bulk, safe, low-cost, and highly reliable cloud storage service provided externally by JD Cloud. User may upload and download data through the simple RESTful interface provided by this document, at any time, at any place and on any Internet device. Based on OSS, user may build various websites, network disk, personal and enterprise data backup, and other large-scale data based services.

This document specifies the request syntax, response example, and response example of interfaces, as well as precautions when using interfaces, etc., to help you carry out secondary development quickly and be integrated with third party technologies.

## Basic concept

**Bucket**

Bucket is the container you use to store Object, and all objects must belong to a certain bucket. You may set and modify the bucket attribute to control the access permission, and these attribute setting directly apply to all objectives in the bucket, so you may complete different management function by flexibly creating different buckets.

The inside of the same bucket is flat, there is no concept such as directory of file system, and all files directly belong to their corresponding buckets.

Each user may own multiple buckets.

The name of bucket must be unique within the OSS scope, and cannot be modified upon creation.

There’s no limit to the number of objects in the bucket.

The naming specifications of buckets are as follows:

1. The length must be between 3-63 characters;

2. It can only consist of letters in lower case, figures, and line-through (-);

3. The name must start and end with a lowercase letter or number without containing continuous line-throughs.

**Object/File (Object)**

Object is the basic unit of OSS storage data, also called as OSS file. Object consists of user data (Data) and file name (Key). Object is identified with the unique Key in the bucket. Object element information is a key-value pair, representing some attributes of the object, such as last modification time, size and other information.

Based on different uploading methods, the size limits of object are also different. Multipart upload supports up to 48.8TB object size, but a single fragment (or file) supports up to 5GB.

The life cycle of object is from the successful uploading to being deleted. During the whole life cycle, object information cannot be changed. Repeating uploading objects with the same name will cause the previous object being replaced, so OSS does not support modifying part of contents of files and other actions.

The naming specifications of objects are as follows:

1. Use UTF-8 code;

2. The length must be between 1-1022 characters;

3. Files and folders beginning with \ are not supported currently.

Note: Letters in upper and lower cases is required to be identified for object name. Unless otherwise specially specified, objects and files in this document are referred to as Object.

**Region**

Region represents the region (physical location) where the OSS data center is located. User can select the Region for data storage comprehensively based on costs, request sources and others. Generally, the access speed of Region closer to user is faster.

Region is specified when creating Bucket, and cannot be changed once specified. All Objects under the Bucket are stored in the corresponding data center. Currently Object-level Region setting is not supported.

**Access Domain Name-Endpoint**

Endpoint represents the access domain name for external service of OSS. OSS provides service externally in the form of HTTP RESTful API, and different domain names are required when accessing different Regions. Accessing the same Region from intranet and Internet requires different Endpoints, where the extranet refers to the Internet; intranet refers to the domain name used by the JD Cloud virtual machines to access cloud storage service. Access from intranet may achieve better performance and lower network delay. For example, the Internet Endpoint of North China Region is oss.cn-north-1.jcloudcs.com, and the intranet Endpoint is oss-internal.cn-north-1.jcloudcs.com. Endpoints corresponding to each Region are as follows.

|Data Center|Internet Endpoint|Intranet Endpoint|
|-|-|-|
|cn-north-1|oss.cn-north-1.jcloudcs.com|oss-internal.cn-north-1.jcloudcs.com|
|cn-east-1|oss.cn-east-1.jcloudcs.com|oss-internal.cn-east-1.jcloudcs.com|
|cn-east-2|oss.cn-east-2.jcloudcs.com|oss-internal.cn-east-2.jcloudcs.com|
|cn-south-1|oss.cn-south-1.jcloudcs.com|oss-internal.cn-south-1.jcloudcs.com|

**Access Domain Name-BucketName.Endpoint**

For the network requests of OSS, except for API GetService, all the other domains requested are aiming at level-3 domain names of specific Bucket, consisting of BucketName and Endpoint: BucketName.Endpoint.

**Access Key (AccessKey)**

AccessKey, AK in short, refers to AccessKey and AccessKeySecret used in access identity authentication. OSS verifies the identity of a request sender by the method of AccessKey and AccessKeySecret symmetrical encryption.

AccessKey is used to identify users, AccessKeySecret is the key used by users to encrypt signature character strings and by OSS to verify signature character strings, between which the AccessKeySecret must be kept confidential. For OSS, the source of AccessKey includes: AccessKey applied by the owner of Bucket.
