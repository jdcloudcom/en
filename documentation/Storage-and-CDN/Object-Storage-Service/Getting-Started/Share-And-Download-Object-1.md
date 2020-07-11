
# Share and Download Objects

After creating bucket and uploading objects to the bucket, you can share and download the objects through obtaining external link of the uploaded objects according to the below specific action steps:

1. Log in [Object Storage Service Console](https://oss-console.jdcloud.com/space);

2. Click **Space Management** menu, and then click the target Bucket name;

3. Click **Object Management** option to go to the File Management List page of this space;

4. Find the file to be shared and downloaded and click **Get External Link** in the [Operations];

5. If the access permission to current bucket is private read/write or customized permission, the below popup will show after users click **Get External Link**, which means you need to set a valid time of the link before obtaining an external link of the file. After time setting, click **Get External Link** to generate an external link; you can replicate the external link by pressing the button on the right side of the external link address;

   ![有效期](../../../../image/Object-Storage-Service/OSS-016.png)

6. If the access permission to current bucket is public read and private write or public read/write, click **Get External Link** to get an external address in the popup. The valid period of the external link is not required because this external link address is valid permanently (unless the access permission to the bucket is changed to private read/write);

7. Replicate the external link address of the file to a browser address bar to complete the access and download of this file.
