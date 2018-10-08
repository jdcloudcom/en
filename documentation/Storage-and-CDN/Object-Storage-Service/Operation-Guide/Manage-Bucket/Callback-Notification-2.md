# Callback Notification

OSS supports the callback notification function. You can make the callback notification in time while specifying relevant operation of some resources. The OSS event notification is carried out asynchronously, causing no influence to the OSS operation. The callback notification is often seen in the following application scenarios, for example:

- New data are uploaded to OSS from picture sharing platforms and audio and video platforms.

- Relevant contents in OSS are updated.

- Important files in OSS are deleted.

OSS callback notification comprises the two parts, including the **configuration callback notification** and the **message notification**.

- Configuration callback notification: When configuring the callback rules in a Bucket, it needs to specify related resources, relevant events and callback URL for initiating the notice. The configuration is only valid for this Bucket.

- Message notification: When the event notification is triggered in the Bucket, the notification content in specified format will be sent to the callback URL. The notification method is HTTP(S).

Callback Notification Process:
1. Specify a Bucket to set the message notification rules.

2. When the message notification rule is triggered by the event, the message notification will be sent to the callback URL.

3. The callback server accepts the message notification and return 200.

4. If the callback server gives no response, OSS will retry for three times. If there is still no response, it is believed that the callback is failed.

**Callback notification support API**：[PUT Bucket notification](https://github.com/jdcloud-cmw/oss/blob/master/S3-API-Document/Operations-on-Bucket/PUT-Bucket-notification.md)、[GET Bucket notification](https://github.com/jdcloud-cmw/oss/blob/master/S3-API-Document/Operations-on-Bucket/GET-Bucket-notification.md)

## Configuration callback notification

You can specify a Bucket to enable the callback notification. Once being enabled, OSS will send the message notification as per rules of NotificationConfiguration.

### Configuration Method
You can specify a Bucket to create or change the NotificationConfiguration via PUT Bucket notification. NotificationConfiguration is in the XML format:

```
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
        ...
    </NotificationConfiguration>
```

Note:
* TopicConfiguration: Relevant configuration rules for message notification, supporting many rules When the event is triggered, TopicConfiguration will be matched one by one in orders via the Object and the event type. If the match is successful, the message notification will be sent and the match is terminated.
* Id: the unique identifier of TopicConfiguration; if it is not set, OSS will assign an ID randomly
* Topic: When the event of occurrence is specified, OSS will send message to this topic in the format of NS:endpoint1,endpoint2,endpoint3 (it must begin with "NS:", several addresses must be separated with ",” and at most 5 addresses are configured)
* Event: Event type triggering notification
* Filter: Resource filtering rule. If no, all resources under the Bucket shall come into force
* S3Key: Defining resource filtering rules
* FilterRule: Defining filtering rules and standard key-value pair
* Name: prefix or suffix, screening one or more objects based on object key name
* Value: Specifying the prefix or suffix of object key name to be selected

### Support event type
Event Type|Description
---|---
s3:ObjectCreated:* |Create Object behavior, including Put Object, Post Object, Copy Object and Complete Multipart Upload
s3:ObjectCreated:Put |Use Put Object to upload files
s3:ObjectCreated:Post |Use Post Object to upload files
s3:ObjectCreated:Copy |Use Put Object-Copy to copy files
s3:ObjectCreated:CompleteMultipartUpload |Complete multipart upload
s3:ObjectRemoved:* |Delete Object behaviors, including Delete Object
s3:ObjectRemoved:Delete |Delete file

### Customized Parameters

OSS supports carrying customized parameters in the request URL. You can bring `x-oss-callback-var=[CallBackVar]` as a url parameter to the request and send it.

The customized parameter begins with "x-oss-callback-". After receiving the request, OSS checks if there is a parameter starting with "x-oss-callback-", and if so, it will be added to the message notification content.
For example, if "x-oss-callback-a=test1" and "x-oss-callback-b=test2" are specified in the request URL, the following content will be added to the message notification:
```
"callBackVar": {
    "callBackVars": {                 
	"a":["test1"],
	"b":["test2"]
    }
}
```

## Message Notification
When the callback notification is triggered, OSS will generate a message notification to the callback URL. The event message is in JSON format and has the following structure:
```
{  
   "Records":[  
      {  
         eventVersion:"1.0",  //Version number, currently "1.0"
         eventSource:"oss",  //Event source, fixed as "oss"
         awsRegion:"cn-north-1",  //The region which Bucket is in
         eventTime:Mon, 06 Aug 2018 10:19:51 GMT,  //Time the event was caused
         eventName:"event-type",  //Event type
         "userIdentity":{  
            principalId:"userId-of-the-user-who-caused-the-event"  //User ID of the user who caused the event
         },
         "requestParameters":{  
            sourceIPAddress:"domain-name-where-request-came-from"  //Domain name where event request came from
         },
         "responseElements":{  
            x-amz-request-id:"OSS generated request ID"  //Request ID of the generated event
         },
         "s3":{  
            s3SchemaVersion:"1.0",  //Version number of the notification content, currently "1.0"
            configurationId:"ID found in the bucket notification configuration",  //ConfigurationId in the event notification configuration
            "bucket":{  
               name:"bucket-name",  //Bucket name
               "ownerIdentity":{  
                  principalId:"userId-of-the-bucket-owner"  //User ID of the Bucket owner
               }
            },
            "object":{  
               key:"object-key",  //Object name
               eTag:"object eTag"  //Object etag, the same as the content of Etag header returned from GetObject request
            }
         },
	"callBackVar": {  //Call back customized parameters in the notification configuration
	    "callBackVars": {                 
		"var1":["value1","value3"],
		"var2":["value2"]
	    }
         }
      }
   ]
}
```

## Callback Server

### Verify the Callback URL
When configuring the callback notification request, OSS sends a verification message to the callback URL to verify whether it is available. The callback server needs to resolve and return as required. If there is no response, the configuration callback notification fails and returns 400. 

Verification Process:

1. OSS sends a request to the callback server with an x-jdcloud-message-type header with a value of "SubscriptionConfiguration" or "Notification". If it is "SubscriptionConfiguration", the request is identified as a subscription confirmation request; if it is "Notification", the request is identified as a message notification request.

2. The callback server needs to verify whether the x-jdcloud-message-type header is "SubscriptionConfiguration". If so, it returns the message encoded by using base64 to confirm the subscription.

You can configure the callback server according to the following examples:

```
import org.springframework.http.HttpHeaders;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;
import java.nio.charset.StandardCharsets;

@RestController
public class SubscriptionTest {

//Messages notification in simple format
    @RequestMapping("/notifications1")
    public String notifications1(@RequestBody String message
            , @RequestHeader HttpHeaders headers) {
		
        if (headers.get("x-jdcloud-message-type").get(0).equals("SubscriptionConfirmation")) {
			//For the verification of url during settings, message needs to be encoded by using base64 and returned
            return Base64Utils.encodeToString(message.getBytes(StandardCharsets.UTF_8));
        } else {
            //Message notification processes your code, http code 200 needs to be returned when processing is completed, and body shall not be verified
            return "";
        }
    }
}
```

### Callback Signature
If your callback server is maliciously attacked by others, as the malicious callback of your application server, the application server receives some illegal requests and the normal logic is affected. In such case, you need to judge if the callback request is from OSS. Please refer to the document: [Callback Signature Verification](../../Best-Practices/Setting-Signature-Authentication-For-Callback-Server.md) for the verification of callback signature.
