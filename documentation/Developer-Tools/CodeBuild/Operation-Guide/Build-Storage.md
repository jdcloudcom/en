# Building Type

Based on the construction output package types, the construction types are divided into application package and image.

### Construction Type - Application Package
When you select an application package as the construction type, the construction produces the application package in .tar.gz format and uploads it to the user OSS repository.
 
![](/image/codebuild/createApp4.PNG) 

 * Bucket
 
Select the Bucket in the user Object Storage Service, and store the construction output package.

 * Folder Name
 
The construction output will be uploaded to this directory. If it is null here, the construction output will be uploaded to the root directory of bucket be default.

### Construction Type - Image
 
When you select an image as the construction type, the output is pushed to the Container Registry. Please provide the dockerfile file in the code root directory when you compile.
 
![](/image/codebuild/createApp5.PNG) 

 * Container Registry
Select the user Container Registry and push the constructed image.

