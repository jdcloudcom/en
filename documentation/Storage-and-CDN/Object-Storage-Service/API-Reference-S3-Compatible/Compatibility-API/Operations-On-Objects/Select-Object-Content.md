# Select Object Content (Beta)
## Description
This operation can execute SQL statement against files and return the execution result.
## Request
### Syntax
```HTTP
POST /ObjectName?select&select-type=2 HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: date
Authorization: authorization string (See Authenticating Requests (AWS Signature Version4))

<SelectObjectContentRequest>
   <Expression>string</Expression>
   <ExpressionType>string</ExpressionType>
   <RequestProgress>
      <Enabled>boolean</Enabled>
   </RequestProgress>
   <InputSerialization>
      <CompressionType>string</CompressionType>
      <CSV>
         <AllowQuotedRecordDelimiter>boolean</AllowQuotedRecordDelimiter>
         <Comments>string</Comments>
         <FieldDelimiter>string</FieldDelimiter>
         <FileHeaderInfo>string</FileHeaderInfo>
         <QuoteCharacter>string</QuoteCharacter>
         <QuoteEscapeCharacter>string</QuoteEscapeCharacter>
         <RecordDelimiter>string</RecordDelimiter>
      </CSV>
   </InputSerialization>
   <OutputSerialization>
      <CSV>
         <FieldDelimiter>string</FieldDelimiter>
         <QuoteCharacter>string</QuoteCharacter>
         <QuoteEscapeCharacter>string</QuoteEscapeCharacter>
         <QuoteFields>string</QuoteFields>
         <RecordDelimiter>string</RecordDelimiter>
      </CSV>
</SelectObjectContentRequest>
```
### Request Parameter
No Request Parameter

### Request Header
No Special Header

### Request Element
Name|Type|Description
---|---|---
Expression|SQL Expression, Maximum is 256 KB under UTF-8 encoding<br>Type: String|Yes
ExpressionType|Expression Type<br>Type:String<br>Valid Value:SQL|Yes
InputSerialization|Describe request Object format<br>Type: Container|Yes
OutputSerialization|Describe SELECT output format<br>Type: Container|Yes
RequestProgress|Processing progress, message about processing progress is sent regularly upon enabling<br>Type: Container|No

InputSerialization Container:
Name|Type|Description
---|---|---
CompressionType|Describe compression type of request Object<br>Type: String<br>Valid Value: NONE, GZIP<br>Default Value: NONE<br>Parent Tag: InputSerialization|No
CSV|Describe CSV format of request Object<br>Type: Container<br>Parent Tag: InputSerialization|No
RecordDelimiter|Designate line separator, cannot be null<br>Type: String<br>Default Value: \n<br>Parent Tag: CSV|No
FieldDelimiter|Designate column separator, cannot be null<br>Type: String<br>Default Value: ,<br>Parent Tag: CSV|No
QuoteCharacter|Designate quote character, cannot be null. E.g. "a,b", will be resolved to a,b<br>Type: String<br>Default Value: ,<br>Parent Tag: CSV|No
QuoteEscapeCharacter|Designate quote and escape characters, cannot be null. E.g. """a,b""" will be resolved to " a,b "<br>Type: String<br>Default Value: ,<br>Parent Tag: CSV|No
FileHeaderInfo|Describe first-line definition<br>Type: String<br>Valid Value: NONE (Non-column Name)<br>USE (which is a column name that can be used for filtration, e.g. SELECT "name" FROM S3Object)<br>IGNORE (which is a column name that cannot be used for filtration, but you can use _1, _2 instead, e.g. SELECT _1 FROM S3Object) <br>Parent Tag: CSV|No
Comments|Designate description character, cannot be null<br>Type: String<br>Default Value: #<br>Parent Tag: CSV|No
AllowQuotedRecordDelimiter|Designate if data is allowed to contain a line separator. Setting as TURE may result in slower performance<br>Type: Boolean<br>Default Value: FALSE<br>Parent Tag: CSV|No


OutputSerialization Container:
Name|Type|Description
---|---|---
CSV|Describe CSV format of request Object<br>Type: Container<br>Parent Tag: OutputSerialization|No
QuoteFields|Describe if the quote character designated by QuoteCharacter is used<br>Type: String<br>Valid Value: ALWAYS, ASNEEDED<br>Default Value: ASNEEDED<br>Parent Tag: CSV|No
RecordDelimiter|Designate line separator, cannot be null<br>Type: String<br>Default Value: \n<br>Parent Tag: CSV|No
FieldDelimiter|Designate column separator, cannot be null<br>Type: String<br>Default Value: ,<br>Parent Tag: CSV|No
QuoteCharacter|Designate quote character, cannot be null. E.g. "a,b", will be resolved to a,b<br>Type: String<br>Default Value: ,<br>Parent Tag: CSV|No
QuoteEscapeCharacter|Designate quote and escape characters, cannot be null. E.g. """a,b""" will be resolved to " a,b "<br>Type: String<br>Default Value: ,<br>Parent Tag: CSV|No

## Response
### Syntax
```HTTP/1.1 200
<?xml version="1.0" encoding="UTF-8"?>
<Payload>
   <Records>
      <Payload>blob</Payload>
   </Records>
   <Stats>
      <Details>
         <BytesProcessed>long</BytesProcessed>
         <BytesReturned>long</BytesReturned>
         <BytesScanned>long</BytesScanned>
      </Details>
   </Stats>
   <Progress>
      <Details>
         <BytesProcessed>long</BytesProcessed>
         <BytesReturned>long</BytesReturned>
         <BytesScanned>long</BytesScanned>
      </Details>
   </Progress>
   <Cont>
   </Cont>
   <End>
   </End>
</Payload>
```
### Response Header
No Special Header

### Response body
As the size of the response body is unpredictable, OSS will divide the response body into several messages and return. The structure of the response body as a whole is as follows:
```
<Message 1>
<Message 2>
......
<Message n>
```

### Prelude and Data

Each message in response body consists of prelude, data and its CRC verification code. The prelude is composed of total length of message and total length of all headers; the data is composed of Headers and Payload; CRC verification codes of prelude and data are encoded by Big endian and computed by CRC32, with 4 bytes. 

The message structure is as shown in the figure. Each message may contain a number of headers:

![Message](../../../../../../image/Object-Storage-Service/OSS-178.png)


### Message Type

Message is classified into:
Message Type|Description
---|---
Records message|Retrieval information, which may contain a single record, partial records or multiple records based on result length. One response body may contain several Records messages.
Continuation message|Connection information, which will be returned periodically to maintain TCP link. We recommend that the client should be able to recognize and filter such information to prevent dirty data from affecting retrieval results.
Progress message|Progress information, which will be returned periodically to give feedback on current query progress
Stats message|Statistical information, which will periodically return relevant statistical information about this query
End message|End information, which means this query ends when shows
RequestLevelError message|Error information, which will be returned when errors occur. If this information is returned, the End message will not be returned

### Records message

Records message consists of three mastheads, which are ":message-type", ":event-type" and ":content-type". As shown in the figure:

![Records message](../../../../../../image/Object-Storage-Service/OSS-180.png)

The Records message text may contain a single record, partial records or multiple records based on result length.

### Continuation message

Continuation message consists of two mastheads, which are ":message-type" and ":event-type". As shown in the figure:

![Continuation message](../../../../../../image/Object-Storage-Service/OSS-180.png)

Continuation message is provided with masthead only and has no text information.

### Progress Message

Progress Message consists of three mastheads, which are ":message-type", ":event-type" and ":content-type". As shown in the figure:

![Progress Message](../../../../../../image/Object-Storage-Service/OSS-180.png)

Progress Message text is an XML text containing the following information:
* BytesScanned: represents bytes that have been scanned before a file is compressed.
* BytesProcessed: represents bytes that have been scanned after a file is compressed. If a file has not been compressed, this field is same with BytesScanned.
* BytesReturned: Size of current returned result.

The example is as follows:
```
<?xml version="1.0" encoding="UTF-8"?>
<Progress>
     <BytesScanned>512</BytesScanned>
     <BytesProcessed>1024</BytesProcessed>
     <BytesReturned>1024</BytesReturned>
</Progress>
```

### Stats Message

Stats Message consists of three mastheads, which are ":message-type", ":event-type" and ":content-type". As shown in the figure:

![Stats Message](../../../../../../image/Object-Storage-Service/OSS-181.png)

Stats Message text is an XML text containing the following information:
* BytesScanned: represents bytes that have been scanned before a file is compressed.
* BytesProcessed: represents bytes that have been scanned after a file is compressed. If a file has not been compressed, this field is same with BytesScanned.
* BytesReturned: Size of current returned result.

The example is as follows:
```
<?xml version="1.0" encoding="UTF-8"?>
<Progress>
     <BytesScanned>512</BytesScanned>
     <BytesProcessed>1024</BytesProcessed>
     <BytesReturned>1024</BytesReturned>
</Progress>
```

### End Message

End Message consists of two mastheads, which are ":message-type" and ":event-type". As shown in the figure:

![End Message](../../../../../../image/Object-Storage-Service/OSS-182.png)

End Message is provided with masthead only and has no text information.

### Request Level Error Message

Request Level Error Message consists of three mastheads, which are ":error-code", ":error-message" and ":message-type". As shown in the figure:

![Request Level Error Message Message](../../../../../../image/Object-Storage-Service/OSS-183.png)

Request Level Error Message is provided with masthead only and has no text information.


## Example
### Request Example

```POST /exampleobject.csv?select&select-type=2 HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: Tue, 17 Oct 2020 01:49:52 GMT
Authorization: authorization string
Content-Length: content length

<?xml version="1.0" encoding="UTF-8"?>
<SelectRequest>
    <Expression>Select * from S3Object</Expression>
    <ExpressionType>SQL</ExpressionType>
    <InputSerialization>
        <CompressionType>GZIP</CompressionType>
        <CSV>
            <FileHeaderInfo>IGNORE</FileHeaderInfo>
            <RecordDelimiter>\n</RecordDelimiter>
            <FieldDelimiter>,</FieldDelimiter>
            <QuoteCharacter>"</QuoteCharacter>
            <QuoteEscapeCharacter>"</QuoteEscapeCharacter>
            <Comments>#</Comments>
        </CSV>
    </InputSerialization>
    <OutputSerialization>
        <CSV>
            <QuoteFields>ASNEEDED</QuoteFields>
            <RecordDelimiter>\n</RecordDelimiter>
            <FieldDelimiter>,</FieldDelimiter>
            <QuoteCharacter>"</QuoteCharacter>
            <QuoteEscapeCharacter>"</QuoteEscapeCharacter>
        </CSV>                               
    </OutputSerialization>
</SelectRequest> 
```

### Response Example
```HTTP/1.1 200 OK
x-req-id: 81D2740FD887DF42
x-amz-request-id: 81D2740FD887DF42
Date: Tue, 17 Oct 2020 23:54:05 GMT

A series of messages
```
