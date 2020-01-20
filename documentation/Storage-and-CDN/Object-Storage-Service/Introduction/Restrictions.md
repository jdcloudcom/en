# Restrictions

Use limit of Object Storage Service is as below:

|Limit Item|Description|
|-|-|
|Bucket|1. A same user can create a maximum of 20 storage buckets in each region. If you need to increase quota, please contact [after-sales support](https://ticket.jdcloud.com/myorder/submit).<br>2. Once successfully created, the name and region of the bucket cannot be modified. <br>3. Name of Bucket is globally unique, and globally means the regions supported by OSS. <br>4. There is no limit for the capacity of each bucket. <br>5. Naming length of Bucket must be between 3-63 characters and the name can only be composed of lowercase letters, numbers, and line-through (-) and can only start and end with lowercase letters or numbers. |
|Delete Bucket|To delete bucket, you need to: <br>1. First delete all file resources (including uncompleted Part) and image styles under the bucket. <br>2. If incremental data synchronization is enabled, please disable incremental data synchronization rules first.|
|Upload File|1. Size of files uploaded through console cannot exceed 5GB <br>2. When uploaded by way of ordinary upload or multipart upload, the size of a single file or multipart cannot exceed 5GB. <br>3. If a file with the size exceeding 5GB is to be uploaded, the mode of multipart upload must be used; the file size of multipart upload is up to 48.8TB. <br>4. File with a same name is supported to be uploaded, but it will replace the original file.
|Delete Object|1. Objects are unrecoverable if deleted. <br>2. If arrearage is not made up within 60 days after the service is suspended due to insufficient balance, all objects will be automatically deleted.<br>|
|Own Domain Association|1. The associated domains must be filed with the Ministry of Industry and Information Technology. <br>2. Each Bucket can be associated with up to 20 domains, and each domain can only be associated with one Bucket. <br>3. If you need to support https, please refer to [Customized Domain Supports HTTPS Access OSS Service](https://docs.jdcloud.com/en/object-storage-service/custom-domain-name-guidance). <br>|
|Life Cycle Management|Up to 1,000 life cycle rules can be configured for each Bucket.|
|Bucket policy |The policy configuration of each Bucket supports up to 16KB.|
|Image Processing|For original image: <br>* Image format can only be: jpg, jpeg, jp2, png, bmp, gif, webp, and tiff. <br>* The single edge size of input and output image shall be up to 9999 pixels, and no less than 1 pixel.|
|Access key Management|1. User will not automatically create Access Key when turning on Object Storage Service. <br>2. It needs to be manually created in the [AccessKey Management](https://uc.jdcloud.com/account/accesskey) of Personal Center.|
