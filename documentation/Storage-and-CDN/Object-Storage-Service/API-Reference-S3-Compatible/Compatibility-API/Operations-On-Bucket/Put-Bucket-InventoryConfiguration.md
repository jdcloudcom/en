# PutBucketInventoryConfiguration

The operation is used for creating inventory tasks in a bucket. You can use the request to create an inventory task after naming the inventory task.

- [DeleteBucketInventoryConfiguration](https://docs.jdcloud.com/object-storage-service/Delete-Bucket-InventoryConfiguration)
- [ListBucketInventoryConfigurations](https://docs.jdcloud.com/object-storage-service/List-Bucket-InventoryConfigurations)
- [GetBucketInventoryConfiguration](https://docs.jdcloud.com/object-storage-service/Get-Bucket-InventoryConfiguration)

## Request Syntax

```HTTP
PUT /?inventory&id=inventory-configuration-ID HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: <Date>
Authorization: <authorization string>
<?xml version="1.0" encoding="UTF-8"?>
<InventoryConfiguration xmlns = "http://....">
   <Destination>
      <S3BucketDestination>
         <AccountId>string</AccountId>
         <Bucket>string</Bucket>
         <Format>string</Format>
         <Prefix>string</Prefix>
      </S3BucketDestination>
   </Destination>
   <IsEnabled>boolean</IsEnabled>
   <Filter>
      <Prefix>string</Prefix>
   </Filter>
   <Id>string</Id>
   <OptionalFields>
      <Field>string</Field>
   </OptionalFields>
   <Schedule>
      <Frequency>string</Frequency>
   </Schedule>
</InventoryConfiguration>
```

## Request Element

| Name                   | Description                                                         | Required |
| ---------------------- | ------------------------------------------------------------ | ---- |
| InventoryConfiguration | List-inclusive Configuration Parameter<br>Type: Container                        | Yes   |
| Destination            | Description information of inventory list saved<br/>Type: Container<br/>Ancestors: InventoryConfiguration | Yes   |
| S3BucketDestination    | Information of bucket used for storing outputted inventory results<br/>Type: Container<br/>Ancestors: InventoryConfiguration.Destination | Yes   |
| AccountId              | Bucket Owner ID<br/>Type: String<br/>Ancestors: InventoryConfiguration.Destination.S3BucketDestination | No   |
| Bucket                 | Name of bucket used for storing inventory analysis result<br/>Type: String<br/>Ancestors: InventoryConfiguration.Destination.S3BucketDestination | Yes   |
| Format                 | The inventory analysis results are displayed in the document format of CSV now<br/>Type: String<br/>Ancestors: InventoryConfiguration.Destination.S3BucketDestination | Yes   |
| Prefix                 | Prefix of inventory analysis result<br/>Type: String<br/>Ancestors: InventoryConfiguration.Destination.S3BucketDestination | No   |
| Filter                 | Select objects to be analyzed. The inventory function can analyze prefix object setting complying with Filter<br/>Type: Container<br/>Ancestors: InventoryConfiguration | No   |
| Prefix                 | Prefix of object to be analyzed<br/>Type: String<br/>Ancestors: InventoryConfiguration.Filter | Yes   |
| Id                     | Inventory name, corresponding to ID of request parameters <br/>Type: <br/>Ancestors: InventoryConfiguration | Yes   |
| IsEnabled              | Identification for enabling inventory or not<br/>Type: Boolean<br/>Ancestors: InventoryConfiguration | Yes   |
| OptionalFields         | Set analysis dimensions to be covered in inventory results<br/>Type: Container<br/>Ancestors: InventoryConfiguration<br/>Valid values：Size, LastModifiedDate, StorageClass, ETag | No   |
| Field                  | Names of optional analysis dimensions in inventory list, including optional fields: Size, LastModifiedDate, StorageClass and ETag<br/>Type: String<br/>Ancestors: InventoryConfiguration.OptionalFields | No   |
| Schedule               | Specify inventory result production period<br/>Type: Container<br/>Ancestors: InventoryConfiguration | Yes   |
| Frequency              | Inventory task period, with options of by day or by week<br/>Type: String<br/>Ancestors: InventoryConfiguration.Schedule | Yes   |

## Response Error Code

Some common errors may be caused by such request. For common error codes, please refer to the document [Error Code](https://docs.jdcloud.com/object-storage-service/error-response-2).

| Error Code                | Description                                           | Status Code               |
| :-------------------- | :--------------------------------------------- | :------------------- |
| InvalidArgument       | Illegal Parameter Value                                 | HTTP 400 Bad Request |
| TooManyConfigurations | The inventory amount has reached the quota of 1,000 entries                   | HTTP 400 Bad Request |
| AccessDenied          | Unauthorized access. You might not have the permission to access the bucket | HTTP 403 Forbidden   |

## Example

### Request Example

The example shows how to add an inventory task in the name of report1 to one bucket.

```HTTP
PUT /?inventory&id=report1 HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Content-Length: length
Date: Thu, 12 Apr 2018 21:37:21 GMT
Authorization: authorization string

<?xml version="1.0" encoding="UTF-8"?>
<InventoryConfiguration xmlns="http://....">
   <Id>report1</Id>
   <IsEnabled>true</IsEnabled>
   <Filter>
      <Prefix>filterPrefix</Prefix>
   </Filter>
   <Destination>
      <S3BucketDestination>
         <Format>CSV</Format>
         <AccountId>123456789012</AccountId>
         <Bucket>arn:aws:s3:::destination-bucket</Bucket>
         <Prefix>prefix1</Prefix>
      </S3BucketDestination>
   </Destination>
   <Schedule>
      <Frequency>Daily</Frequency>
   </Schedule>
   <OptionalFields>
      <Field>Size</Field>
      <Field>LastModifiedDate</Field>
      <Field>ETag</Field>
      <Field>StorageClass</Field>   
   </OptionalFields>
</InventoryConfiguration>
```

### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 7F26D08072A8EF2Z
x-amz-date: Thu, 12 Apr 2018 21:37:21 GMT
Content-Length: 0
Server: JDCloudOSS
```

