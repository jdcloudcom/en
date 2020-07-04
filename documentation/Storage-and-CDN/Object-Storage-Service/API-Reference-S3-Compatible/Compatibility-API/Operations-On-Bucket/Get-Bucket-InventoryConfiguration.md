# GetBucketInventoryConfiguration

This API is used for search user inventory task information in buckets.

Operation related to this API includes:

- [DeleteBucketInventoryConfiguration](https://docs.jdcloud.com/object-storage-service/Delete-Bucket-InventoryConfiguration)
- [PutBucketInventoryConfiguration](https://docs.jdcloud.com/object-storage-service/Put-Bucket-InventoryConfiguration)
- [ListBucketInventoryConfigurations](https://docs.jdcloud.com/object-storage-service/List-Bucket-InventoryConfigurations)

## Request Syntax
```HTTP
GET /?inventory&id=inventory-configuration-id HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version4))
```

## Response Syntax
```HTTP
HTTP/1.1 200
<?xml version="1.0" encoding="UTF-8"?>
<InventoryConfiguration>
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

## Response Element

Name|Description
---|---
InventoryConfiguration|List-inclusive Configuration Parameters<br>Type: Container
Destination|Description information for inventory storage results<br>Type: Container<br>Ancestors: InventoryConfiguration
S3BucketDestination|Information of bucket used for storing outputted inventory results<br/>Type: Container<br/>Ancestors: InventoryConfiguration.Destination
AccountId|Bucket Owner ID<br/>Type: String<br/>Ancestors: InventoryConfiguration.Destination.S3BucketDestination
Bucket|Name of bucket used for storing inventory analysis result<br/>Type: String<br/>Ancestors: InventoryConfiguration.Destination.S3BucketDestination
Format|The inventory analysis results are displayed in the document format of CSV now<br/>Type: String<br/>Ancestors: InventoryConfiguration.Destination.S3BucketDestination
Prefix|Prefix of inventory analysis result<br/>Type: String<br/>Ancestors: InventoryConfiguration.Destination.S3BucketDestination
Filter|Screen objects to be analyzed. The inventory function can analyze prefix object setting complying with Filter<br>Type: Container<br>Ancestors: InventoryConfiguration
Prefix|Prefix of object to be analyzed<br/>Type: String<br/>Ancestors: InventoryConfiguration.Filter
Id|Inventory name, corresponding to ID of request parameters<br>Type: Container<br>Ancestors: InventoryConfiguration
IsEnabled|Identification for enabling inventory or not<br>Type: Boolean<br>Ancestors: InventoryConfiguration
OptionalFields|Set analysis dimensions to be covered in inventory results<br>Type: Container<br>Ancestors: InventoryConfiguration<br>Valid values: Size, LastModifiedDate, StorageClass, ETag
Field|Names of optional analysis dimensions in inventory list, including optional fields: Size, LastModifiedDate, StorageClass and ETag<br/>Type: String<br/>Ancestors: InventoryConfiguration.OptionalFields
Schedule|Specify inventory result production period<br>Type: Container<br>Ancestors: InventoryConfiguration
Frequency|Inventory task period, with options of by day or by week<br/>Type: String<br/>Ancestors: InventoryConfiguration.Schedule

## Example
### Request Example

The request examples show how to obtain the configuration information of the inventory task list1 from a bucket.

```HTTP
GET /?inventory&id=list1 HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: Wed, 28 Oct 2009 22:32:00 GMT
Authorization: <authorization string>
```
### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 236A8905248E5A02
Date: Mon, 31 Oct 2016 12:00:00 GMT
Server: JDCloudOSS
Content-Length: length

<?xml version="1.0" encoding="UTF-8"?>
<InventoryConfiguration xmlns = "http://....">
  <Id>report1</Id>
  <IsEnabled>true</IsEnabled>
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
  <Filter>
    <Prefix>myprefix/</Prefix>
  </Filter>
  <OptionalFields>
    <Field>Size</Field>
    <Field>LastModifiedDate</Field>
    <Field>ETag</Field>
    <Field>StorageClass</Field>
  </OptionalFields>
</InventoryConfiguration>
```
