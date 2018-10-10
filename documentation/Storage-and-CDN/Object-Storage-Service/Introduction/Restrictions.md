# Restrictions

Use limit of Object Storage Service is as below:

|Limit Item|Description|
|-|-|
|Bucket|1. A same user can create a maximum of 20 storage buckets in each region. <br>2. Once successfully created, the name and region of the bucket cannot be modified. <br>3. Name of Bucket is globally unique. <br>4. You need to delete all file resources and image styles in this Bucket before deleting the bucket. <br>5. Naming length of Bucket must be between 3-63 characters and the name can only be composed of lowercase letters, numbers, and line-through (-) and can only start and end with lowercase letters or numbers. |
|Upload File|1. Size of files uploaded through console cannot exceed 1GB <br>2. When uploaded by way of ordinary upload or multipart upload, size of a single file or multipart cannot exceed 5GB. <br>3. If a file size exceeding 5GB is uploaded, the mode of multipart upload must be used. <br>4. File with a same name is supported to be uploaded, but it will replace the original file.
|Delete Object|1. Objects are unrecoverable if deleted. <br>2. If arrearage is not made up within 60 days after the service is suspended due to insufficient balance, all objects will be automatically deleted.
|Access key Management|1. User will not automatically create Access Key when turning on Object Storage Service. <br>2. It needs to be manually created in the AccessKey Management of Personal Center; a maximum of 5 Access Keys can be created.
