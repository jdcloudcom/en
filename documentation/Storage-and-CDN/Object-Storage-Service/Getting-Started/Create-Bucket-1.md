# Create Bucket

Once the JD Cloud object storage service is provided, you need to create a bucket to save files. The bucket creating steps are as follows:

1.Log in the JD Cloud console, select Object Storage Service -> bucket Management to log in the bucket management page and click the Create a new bucket:

![新建空间](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-010.png)

2.Click the new bucket creation and the following popup will be shown,

![弹窗](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-011.png)

3.The bucket can be created by choosing and switching different regions. At present, JD Cloud only supports four regions, including cn-north-1, cn-south-1, cn-east-1 and cn-east-2. The resource intranets of different regions can't be connected to each other, and the regions can't be changed after being created. If you need to access the object storage service via the virtual machine intranet, please select the region as the same as that of your virtual machine.

4.In the bucket name text box, the naming of bucket must conform to naming specification (relevant notifications after ? of the text box). The selected bucket  name must be globally universe among all current bucket names of the JD Cloud object storage service. The  bucket name can’t be changed after being created.

5.JD Cloud's bucket supports four access authorities, including “public read”, “private”, “public read/write” and “customized permission” (when creating a bucket , only the “public read”, “private ” and “public read/write” are supported. If you need to set the “customized permission”, please select the “customized permission” in the permission setting of the bucket setting page after creating the bucket and complete the option setting).

* Public read : Only the creator of the bucket can carry out the write action to files in the bucket , anyone (including anonymous access) can carry out the read operation to files in the bucket.

* Private : Only the creator of the bucket can carry out the write and read actions to files in the bucket, and others can’t access files in the bucket.

* Public read/write: Anyone (including anonymous access) can carry out write and read actions to files in the bucket.

* Customized permission: The permissions of GetObject, PutObject, DeleteObject, ListObjects, DeleteBucket for the assigned users can be set, the resources that the permissions can access can be specified, and the IP addresses and Referer white list with the permissions can be specified.

6.Click “OK” button to finish creation of bucket.
