# PUT Bucket notification

## Description
OSS supports[Callback Notification](https://docs.jdcloud.com/en/object-storage-service/callback-notification-2)function, you can specify timely message notification when some resources occur relevant operations. OSS Callback Notification is performed asynchronously, so that OSS operations will not be affected.

You can specify a Bucket to create or change the NotificationConfiguration via PUT Bucket notification. NotificationConfiguration is in XML format. By default, your Bucket is not configured Callback Notification, so NotificationConfiguration is null, you can disable Callback Notification by adding NotificationConfiguration of null.
```
<NotificationConfiguration>
</NotificationConfiguration>
```

## Request
### Syntax
```xml
PUT /?notification HTTP/1.1
Host: <bucket>.s3.<region>.jcloudcs.com
Date: <date>
Authorization: <authorization string> (see Authenticating Requests (AWS Signature Version 4))

<NotificationConfiguration>
    <TopicConfiguration>
        <Id>ConfigurationId</Id>
        <Filter>
            <S3Key>
                <FilterRule>
                    <Name>prefix</Name>
                    <Value>prefix-value</Value>
                </FilterRule>
                <FilterRule>
                    <Name>suffix</Name>
                    <Value>suffix-value</Value>
                </FilterRule>
           </S3Key>
        </Filter>
        <Topic>NS:endpoint1,endpoint2</Topic>
        <Event>event-type</Event>
        <Event>event-type</Event>
        ...
    </TopicConfiguration>
    <CloudFunctionConfiguration>   
        <Id>ConfigurationId</Id>
        <Filter>
	        ...
        </Filter>
        <CloudFunction>function-id</CloudFunction>    
        <Event>event-type</Event> 
        ...         
    </CloudFunctionConfiguration>  
    ...
</NotificationConfiguration>
```

### Request Parameter
No Request Parameters
### Request Header
No Special Request Header
### Request Elements

Name|Description|Must
---|---|---
NotificationConfiguration|Specify the container of Notification Configuration, and if the element is null, the notification function of the bucket is disenabled. <br>Type: Container<br>Children: one or more TopicConfiguration elements.<br>Ancestor: None|Yes
TopicConfiguration|Relevant configuration containing notification service, OSS can send event message to topic through the configuration. <br>When an event is triggered, TopicConfiguration will be matched in orders through the Object and event type. If the match is successful, the message notification will be sent, and the match terminates. <br>Type: Container<br>Children: An Id, Filter, Topic, and one, or more Event.<br>Ancestor: NotificationConfiguration|No
Id|The unique identifier of TopicConfiguration, which is optional. If not configured, OSS will randomly assign Id, and ids of multiple TopicConfiguration cannot be duplicated. <br>Type: String<br>Ancestor: TopicConfiguration|No
Topic|When specified event occurs, OSS will release a piece of message to this topic. Format NS:endpoint1,endpoint2,endpoint3 (where, it must start with 'NS:', followed by the address of callback server, addresses of multiple servers are separated by ',', at most 5 callback servers are allowed to be configured)<br>Type: String<br>Ancestor: TopicConfiguration|It must exist when TopicConfiguration exists
Event|Event Type, which is used for OSS to send notification when an event occurs. <br>Type: String<br>Valid Values: See Event Types Supported by OSS Event Notification for details<br>Ancestor: TopicConfiguration|It must exist when TopicConfiguration exists
Filter|Container of S3Key. S3Key contains filtering rules of object key name. Type: Container<br>Children: S3Key<br>Ancestor: TopicConfiguration|No
FilterRule|Include key-value pair defining filtering rule standard. <br>Type: Container<br>Children: Name and Value<br>Ancestor: S3Key|No
Name|prefix or suffix, i.e., used for filtering one or multiple objects according to object key name. The maximum length is 1,022 bytes both for prefix and suffix. <br>Type: String<br>Ancestor: FilterRule<br>Valid values: prefix or suffix|No
Value|Specify the prefix or suffix of object key name to be filtered. Type: String<br>Ancestor: FilterRule|No
CloudFunction|Function ID to be triggered. Call Function Service when specified event occurs. <br>Type: String<br>Ancestor: CloudFunctionConfiguration|No
CloudFunctionConfiguratio|CloudFunction triggering rules. <br>Type: Container<br>Children: An Id,Filter, CloudFunction, and one, or more Event.<br>Ancestor: NotificationConfiguration|No

## Response
### Response Header
No Special Response Header
### Response Element
No Response Element
### Special Error
HTTP Error|Code|Description
---|---|---
HTTP 400 Bad Request|InvalidArgument|The following conditions may lead to errors:<br>1. Not support specified event type<br>2. Topic naming does not meet the requirements<br>3. Topic is absent, verification failed
HTTP 403 Forbidden|AccessDenied|You are not the owner of the bucket

## Examples
### Request Example
```xml
PUT /?notification HTTP/1.1
Host: oss-example.s3.<region>.jcloudcs.com
Date: <date>
Authorization: <authorization string> 

<NotificationConfiguration>
    <TopicConfiguration>
        <Id>1</Id>
        <Filter>
            <S3Key>
                <FilterRule>
                    <Name>prefix</Name>
                    <Value>images/</Value>
                </FilterRule>
                <FilterRule>
                    <Name>suffix</Name>
                    <Value>.jpg</Value>
                </FilterRule>
           </S3Key>
        </Filter>
        <Topic>NS:http://116.196.97.17:1601/post/callback</Topic>
        <Event>s3:ObjectCreated:Put</Event>
    </TopicConfiguration>
</NotificationConfiguration>
```
### Response Example
```
HTTP/1.1 200 OK
x-amz-request-id: BB1BA8E12D6A80B7
Date: Mon, 13 Oct 2014 22:58:44 GMT
Content-Length: 0
Server: JDCloudOSS
```


