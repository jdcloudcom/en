# DeleteBucketInventoryConfiguration

The API is used for deleting inventory tasks designated in the bucket and users need to provide names of inventory tasks to be deleted.

Operation related to this API includes:

- [GetBucketInventoryConfiguration](https://docs.jdcloud.com/object-storage-service/Get-Bucket-InventoryConfiguration)
- [PutBucketInventoryConfiguration](https://docs.jdcloud.com/object-storage-service/Put-Bucket-InventoryConfiguration)
- [ListBucketInventoryConfigurations](https://docs.jdcloud.com/object-storage-service/List-Bucket-InventoryConfigurations)

## Request Syntax
```HTTP
DELETE /?inventory&id=inventory-configuration-id HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```
## Example
### Request Example

The request example below displays how to delete the inventory task list1 from a bucket.

```HTTP
DELETE ?/inventory&id=list1 HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: Tue, 04 Apr 2010 20:34:56 GMT  
Authorization: <authorization string>
```
### Response Example

After the request above, when OSS returns the response of `204 No-Content, it means the inventory task list1 in the bucket has been successfully deleted.

```HTTP
HTTP/1.1 204 No Content
x-amz-request-id: 656c76696e672SAMPLE5657374  
Date: Tue, 04 Apr 2010 20:34:56 GMT
Connection: keep-alive
Server: JDCloudOSS
```
