# Uploading and Downloading

[Does OSS have any restriction on uploading and downloading bandwidth? ](Uploads-and-Downloads#user-content-1)

[When an object is uploaded to bucket, will the existing object with the same name be replaced directly or will a new object of different version be added? ](Uploads-and-Downloads#user-content-2)

[Restriction on Upload Object](Uploads-and-Downloads#user-content-3)

------

<div id="user-content-1"></div>

#### Does OSS have any restriction on uploading and downloading bandwidth?

OSS has no restriction on uploading and downloading bandwidth. The specific upload and download speed is related to your local bandwidth.

<div id="user-content-2"></div>

#### When an object is uploaded to bucket, will the existing object with the same name be replaced directly or will a new object of different version be added?

OSS allows users to upload an object with the same name. When an object with the same name is uploaded to bucket, it will directly replace the existing object with the same name.

<div id="user-content-3"></div>

#### Restriction on Upload Object

1. Size of objects uploaded through Console cannot exceed 5GB;
2. When uploaded by way of ordinary upload or multipart upload, size of a single object or multipart cannot exceed 5GB;
3. If an object with the size exceeding 5GB is to be uploaded, the mode of multipart upload must be used; the object size of multipart upload is up to 48.8TB;
4. If you need to upload objects greater than 5GB, please upload them by way of OSS API or SDK.
