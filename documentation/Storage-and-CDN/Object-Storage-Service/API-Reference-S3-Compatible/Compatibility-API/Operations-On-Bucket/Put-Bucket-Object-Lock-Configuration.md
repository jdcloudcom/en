# PUT Bucket object lock configuration

## Description

Via this operation, default retention period policy of bucket can be enabled.

## Request
### Syntax

```HTTP
PUT /?object-lock HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Date: date
Authorization: authorization string
 
<ObjectLockConfiguration>
   <ObjectLockEnabled><value></ObjectLockEnabled>
   <Rule>
      <DefaultRetention>
         <Mode><value></Mode>
         <Days><value></Days>
         <Years><value></Years>
      </DefaultRetention>
   </Rule>
</ObjectLockConfiguration>
```

### Request Parameter
No Request Parameter

### Request Element

Name|Description|Must
---|---|---
ObjectLockConfiguration|ObjectLockEnabled and Rule container<br>Type: Container|Yes
ObjectLockEnabled|ObjectLock Status<br>Valid value: Enabled<br>Type: String<br>Parent Tag: ObjectLockConfiguration|Yes
Rule|DefaultRetention Container<br>Type: Container<br>Parent Tag: ObjectLockConfiguration|No
DefaultRetention|Mode, Days and Years Container<br>Type: Container<br>Parent Tag: Rule|Required, if Rule is available
Mode|Retention period mode<br>Valid value: GOVERNANCE and COMPLIANCE<br>Type: String<br>Parent tag: DefaultRetention|Required, if Rule is available
Days|Retention days<br>Valid value: 1-36500<br>Type: Positive Integer<br>Parent tag: DefaultRetention|Exist only when there is a Rule<br>Days or Years must be provided
Years|Retention years<br>Valid value: 1-100<br>Type: Positive Integer<br>Parent tag: DefaultRetention|Exist only when there is a Rule<br>Days or Years must be provided

## Examples
### Request Example

```HTTP
PUT ?object-lock HTTP/1.1
Host: <BUCKET_NAME>.s3.<REGION>.jdcloud-oss.com
Content-Length: 1783
Date: Thu, 12 Apr 2018 21:37:21 GMT
Authorization: authorization string

<ObjectLockConfiguration>
   <ObjectLockEnabled>Enabled</ObjectLockEnabled>
   <Rule>
      <DefaultRetention>
         <Mode>GOVERNANCE</Mode>
         <Days>30</Days>
      </DefaultRetention>
   </Rule>
</ObjectLockConfiguration>
```

### Response Example
```HTTP
HTTP/1.1 200 OK
x-amz-request-id: 7F26D08072A8EF2Z
x-amz-date: Thu, 12 Apr 2018 21:37:21 GMT
Content-Length: 0
Server: JDCloudOSS
```
   
