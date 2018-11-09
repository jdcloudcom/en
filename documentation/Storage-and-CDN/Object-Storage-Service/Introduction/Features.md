# Features

Before you use the Object Storage Service product, it is recommended that you should read the basic concept of object storage. We here introduce in detail the creation and naming rules of Bucket, Object and definitions of Region, Endpoint and AccessKey, which can help you better understand the following function introduction and description.

The Object Storage Service provides the following functions:

|Function|Description|
|-|-|
|Create Bucket|Before uploading any file to OSS, you need to first create the Bucket to store files. |
|Delete Bucket|If you do not need a Bucket, please delete it to avoid further costs. |
|Modify Bucket Policy |OSS provides permission control Bucket Policy for selecting corresponding permission control when creating Bucket or modifying Bucket Policy in permission setting after the creation. |
|Set Anti-Leech|To reduce extra costs incurred by hotlinking of data stored in OSS, OSS supports to set the anti-leech chain mode based on list header field referer in HTTP header. |
|Cross-Origin Resource Sharing setting |OSS provides cross-origin resource sharing CORS setting in HTML5 Protocol to help you achieve cross-domain access. |
|website hosting|After uploading resources such as pictures, videos and static page to Bucket of OSS, you can assign this space with default home page, error return page and redirect address upon access error. By virtue of this function, user can use a Bucket as a static website. |
|Cross-region Replication |Cross-region replication means to automatically and asynchronously replicate files in Bucket in different regions. It replicates the modification (other than deletion) of files in source Bucket from source Bucket to target Bucket in different regions. |
|Upload file|You can upload any type of files to the Bucket. |
|Create folder|You can manage OSS folder just like managing Windows folder. |
|Search file|Search files with same name prefix in Bucket or folder. |
|Obtain external link|Share and download files through obtaining external link address of the uploaded files. |
|Delete Objcect|Delete a single file. |
|Delete folder|Delete a single folder. |
|Consumption Monitoring|Be aware of usage of OSS service, including relevant data and consumption monitoring graph. |
|Picture service|Make format conversion, crop, scale, rotate, watermark, encapsulation to pictures saved in OSS. |
|Video Service|Provide transcoding services of multiple video formats. |
|API|Provides RESTful API actions and relevant examples supported by OSS. |
|SDK|Provides development operation and relevant examples of mainstream speech SDK. |
