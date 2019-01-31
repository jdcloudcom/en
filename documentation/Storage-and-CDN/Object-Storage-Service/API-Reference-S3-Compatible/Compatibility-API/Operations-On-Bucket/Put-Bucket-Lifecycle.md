# Put Bucket Lifecycle

## Description

JD Cloud Object Storage Service supports object Lifecycle management function through Bucket rule setting. Expired Objects can be automatically deleted to facilitate maintenance and reduce cost during the use of Bucket. If users manually maintain the life cycle of data, it will take a lot of time and energy; but the failure of maintenance will lead to high cost. The life cycle management can help users automatically complete data life cycle management, realize automatic process of data deletion, and save manpower and money cost.

The operation can set the life cycle rule and substitute the current rule for specified Bucket. **Deletion of expired resources is irreversible. Please configure file life cycle time plan reasonably based on your demands.**

## Request
### Syntax
```
PUT /?lifecycle HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jcloudcs.com
Content-Length: length
Date: date
Authorization: authorization string
Content-MD5: MD5
 
Lifecycle configuration in the request body
```

### Request Parameter

No Request Parameter

### Request Header

No Special Request Header

### Request Elements

Name|Description|Must
---|---|---
LifecycleConfiguration|For the Container of all the Lifecycle Rules, up to 1,000 Rules are allowed for configuration. <br>Type: Container<br>Parent Tag: None<br>Subtag: Rule|Yes
Rule|Subtag under LifecycleConfiguration, the specific rules of a lifecycle Rule; up to 1,000 Rules. <br>Type: Container<br>Parent Tag: LifecycleConfiguration|Yes
ID|The unique identifier of each Rule, with the maximum length of no more than 64 characters. <br>Type: String<br>Parent Tag: Rule|No
Status|Control the availability of Rule. If it is Disable, the Rule shall be ignored; if it is Enable, the defined Rule shall be applied. <br>Type: String<br>Parent Tag: Rule<br>Valid Value: Enabled, Disabled|Yes
Filter|Define the filter conditions of Objects influenced by life cycle management policies, supports filtering through Prefix. If <Filter></Filter> is defined, it shall be considered that all the Objects under the Bucket become valid. <br>Type: Container<br>Parent Tag: Rule<br>Subtag: Prefix|Yes
Prefix|By specifying the Prefix of Object, which Objects are influenced by life cycle management policies is determined; if <Prefix></Prefix> is defined, it shall be considered as a filter condition for matching without prefix. In the Filter of a Rule, only one Prefix is allowed to exist. No more than 1,022 bytes is allowed under utf-8 code. <br>Type: String<br>Parent Tag: Filter|No
Days|Specify the number of days after the Objects meeting the filter conditions are uploaded to Bucket for storage type conversion. If the Date exists under the Expiration tag, Days shall not be specified. <br>Type: Positive Integer<br>Parent Tag: Expiration|If no Date is specified, you must
Date|Specify a date for storage type conversion after the Objects meeting the filter conditions are uploaded to the Bucket. If the Days exist under the Expiration tag, Date shall not be specified. The date format must conform to ISO 8601 format specifications, midnight UTC. <br>Type: String<br>Parent Tag: Expiration|If no Days is specified, you must
Expiration|Specify the time for deleting the expired Objects. <br>Type: Container<br>Subtag: Days and Date<br>Parent Tag: Rule|Yes

## Response
### Response Header
No Special Response Header
### Response Element
No Response Element

## Examples
### Request Example
```
PUT /?lifecycle HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jcloudcs.com
Content-Length: length
Date: date
Authorization: authorization string
Content-MD5: MD5

<LifecycleConfiguration>
  <Rule>
    <ID>id1</ID>
    <Filter>
       <Prefix>documents/</Prefix>
    </Filter>
    <Status>Enabled</Status>
    <Expiration>
      <Days>365</Days>
    </Expiration>
  </Rule>
</LifecycleConfiguration>
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: 9E26D08072A8EF9E
Date: Wed, 14 May 2014 02:11:22 GMT
Content-Length: 0
Server: JDCloudOSS
```
