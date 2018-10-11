# Core Concepts

|Name|Description|
| - | - |
|Bucket|Bucket is the fundamental organization unit of data in Object Storage Service and all data must be a Bucket. The name of Bucket is globally unique. If you create a Bucket of a certain name, then other users cannot create a Bucket with the same name|
|Object|Object is the fundamental entity in JD Object Storage Service. In this help documentation, Object, Object and File represent the same meaning which is composed of Key, Data and Metadata|
|Endpoint|Object Storage Service allocates an Internet access domain name and an intranet access domain name for each Bucket by default|
|Region|Data center where storage cluster locates, currently there are four data centers, i.e. cn-north-1, cn-south-1, cn-east-1 and cn-east-2|
|Accesskey|AccessKeyId and AccessKeySecret are the identity for user to access JD Object Storage Service. Users can log in user center to create AccessKeyId and AccessKeySecret after applying for and turning on use qualification for JD Cloud products|
|Put Object|User can upload a single Object by way of Put Object in APIs, which is applicable to the scenario where uploading can be done upon any HTTP request interaction, e.g. small file uploading|
|Multipart Upload|Besides PUT Object, OSS provides another uploading mode --- Multipart Upload. If the user cannot determine the size of uploading file or the uploading file is large and requires breakpoint upload, use Multipart Upload uploading mode|
|Get Object|Used to obtain an Object|
|Object Meta|A group of Key-Value combination, consisting of System-Defined Metadata and User-Defined Metadata. Metadata used to describe file information, e.g. length, type, etc.|
|Data|Any type of data uploaded by user, such as text, multimedia, binary|
|Key|Unique name identifier of Object, e.g. test.jpg|
|Bucket Policy|Access permission control of Bucket|
