# ListBucketInventoryConfigurations

The API is used for requesting return of all inventory tasks from one bucket.

- [DeleteBucketInventoryConfiguration](https://docs.jdcloud.com/object-storage-service/Delete-Bucket-InventoryConfiguration)
- [PutBucketInventoryConfiguration](https://docs.jdcloud.com/object-storage-service/Put-Bucket-InventoryConfiguration)
- [GetBucketInventoryConfiguration](https://docs.jdcloud.com/object-storage-service/Get-Bucket-InventoryConfiguration)

## Request Syntax
```HTTP
GET /?inventory&ContinuationToken=ContinuationToken HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: <Date>
Authorization: <authorization string>			
```
## Request Parameter

Parameter|Description|Required
---|---|---
continuation-token|When IsTruncated in OSS response body is true and the NextContinuationToken node contains any parameter value, you can use the parameter as the continuation-token parameter value, to obtain inventory task information on the next page. <br/>Type: String<br>Default: None|No

## Response Syntax

```HTTP
HTTP/1.1 200
<?xml version="1.0" encoding="UTF-8"?>
<ListBucketInventoryConfigurationsOutput>
   <ContinuationToken>string</ContinuationToken>
   <InventoryConfiguration>
      <Destination>
         <S3BucketDestination>
            <AccountId>string</AccountId>
            <Bucket>string</Bucket>
            <Format>string</Format>
            <Prefix>string</Prefix>
         </S3BucketDestination>
      </Destination>
      <Filter>
         <Prefix>string</Prefix>
      </Filter>
      <Id>string</Id>
      <IsEnabled>boolean</IsEnabled>
      <OptionalFields>
         <Field>string</Field>
      </OptionalFields>
      <Schedule>
         <Frequency>string</Frequency>
      </Schedule>
   </InventoryConfiguration>
   ...
   <IsTruncated>boolean</IsTruncated>
   <NextContinuationToken>string</NextContinuationToken>
</ListBucketInventoryConfigurationsOutput>
```

## Response Element

Name|Description
---|---
ListBucketInventoryConfigurationsOutput|List of all inventory task information in bucket<br>Type: Container<br>Ancestor: None
ContinuationToken|Identification of inventory list on this page can be interpreted as the page number. This identification corresponds to the continuation-token parameter in a request<br>Type: String<br>Ancestor: ListBucketInventoryConfigurationsOutput
InventoryConfiguration|For XML structure of detailed information containing inventory tasks, please refer to [GetBucketInventoryConfiguration](https://docs.jdcloud.com/object-storage-service/Get-Bucket-InventoryConfiguration). <br>Type: Container<br>Ancestor: ListBucketInventoryConfigurationsOutput
IsTruncated|Is identification of each pieces of inventory task information listed? If yes, the parameter is false, otherwise the parameter is true. <br>Type: Boolean<br>Ancestor: ListBucketInventoryConfigurationsOutput
NextContinuationToken|Identification of inventory list on next page. If the parameter contains any value, such value shall serve as the continuation-token parameter and initiates a GET request to obtain inventory task information on the next page. <br>Type: String<br>Ancestor: ListBucketInventoryConfigurationsOutput

## Example
### Request Example

The following request examples can return inventory configuration information of a bucket.

```HTTP
GET /?inventory HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: Mon, 1 Nov 2010 20:34:56 GMT
Authorization: <authorization string>
Content-Type: text/plain
```
### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 3B3C7C725673C630
Date: Sat, 30 Apr 2016 23:29:37 GMT
Content-Type: application/xml
Content-Length: length
Connection: close
Server: JDCloudOSS

<?xml version="1.0" encoding="UTF-8"?>
<ListInventoryConfigurationsResult xmlns = "http://....">
   <InventoryConfiguration>
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
         <Prefix>prefix/One</Prefix>
      </Filter>
      <OptionalFields>
         <Field>Size</Field>
         <Field>LastModifiedDate</Field>
         <Field>ETag</Field>
         <Field>StorageClass</Field>
      </OptionalFields>
   </InventoryConfiguration>
   <InventoryConfiguration>
      <Id>report2</Id>
      <IsEnabled>true</IsEnabled>
      <Destination>
         <S3BucketDestination>
            <Format>CSV</Format>
            <AccountId>123456789012</AccountId>
            <Bucket>arn:aws:s3:::bucket2</Bucket>
            <Prefix>prefix2</Prefix>
         </S3BucketDestination>
      </Destination>
      <Schedule>
         <Frequency>Daily</Frequency>
      </Schedule>
      <Filter>
         <Prefix>prefix/Two</Prefix>
      </Filter>
      <OptionalFields>
         <Field>Size</Field>
         <Field>LastModifiedDate</Field>
         <Field>ETag</Field>
         <Field>StorageClass</Field>
      </OptionalFields>
   </InventoryConfiguration>
   <InventoryConfiguration>
      <Id>report3</Id>
      <IsEnabled>true</IsEnabled>
      <Destination>
         <S3BucketDestination>
            <Format>CSV</Format>
            <AccountId>123456789012</AccountId>
            <Bucket>arn:aws:s3:::bucket3</Bucket>
            <Prefix>prefix3</Prefix>
         </S3BucketDestination>
      </Destination>
      <Schedule>
         <Frequency>Daily</Frequency>
      </Schedule>
      <Filter>
         <Prefix>prefix/Three</Prefix>
      </Filter>
      <OptionalFields>
         <Field>Size</Field>
         <Field>LastModifiedDate</Field>
         <Field>ETag</Field>
         <Field>StorageClass</Field>
      </OptionalFields>
   </InventoryConfiguration>
    ...
    <IsTruncated>false</IsTruncated>
    <!-- If ContinuationToken was provided in the request. -->
    <ContinuationToken>...</ContinuationToken>
    <!-- if IsTruncated == true -->
    <IsTruncated>true</IsTruncated>
    <NextContinuationToken>...</NextContinuationToken>
</ListInventoryConfigurationsResult>
```
