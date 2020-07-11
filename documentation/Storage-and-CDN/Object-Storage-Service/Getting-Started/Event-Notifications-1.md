# Set event notification

OSS supports the event notification function. You can make callback notification in time while specifying relevant operation of some resources. Event notification is performed asynchronously, so that OSS operations will not be affected. Event notification is often seen in the following application scenarios, for example:

New data are uploaded to OSS from image sharing platforms and audio and video platforms.

Relevant contents in OSS are updated.

Important files in OSS are deleted.

You may enable the event notification function for the bucket such that a notification message will be sent to the target in case of each event. This part specifies the method of enabling event notification with the OSS Console.
For information about informing event to REST API, please refer to [Event Notification-API](https://docs.jdcloud.com/en/object-storage-service/callback-notification-2).

 **Type supported by event notification: [OSS can send notification for the following event types](Event-Notifications-1#user-content-1)**

 **Targets supported by event notification: [Targets Reachable by Event Notification Message](Event-Notifications-1#user-content-2)**

 **Event notification setting in the Console: [Event Notification Setting in the Console](Event-Notifications-1#user-content-3)**


# Type and Target Supported by Event Notification

When you configure event notification for the bucket, please be sure to specify which event types are to be notified and the notification receiving targets.

<div id="user-content-1"></div>

## OSS can send notifications for the following event types

Event type|Description
---|---
s3:ObjectCreated:* |Create Object behaviors, including Put Object, Post Object, Copy Object and Complete Multipart Upload
s3:ObjectCreated:Put |Use Put Object to upload files
s3:ObjectCreated:Post |Use Post Object to upload files
s3:ObjectCreated:Copy |Use Put Object-Copy to copy files
s3:ObjectCreated:CompleteMultipartUpload |Complete multipart upload
s3:ObjectRemoved:* |Delete Object behaviors, including Delete Object
s3:ObjectRemoved:Delete |Delete Files

<div id="user-content-1"></div>

## Reachable targets of event notification message:

*  **HTTP(S)**: According to the callback URL configured by you, where there is any event notification triggered in Bucket, OSS will send notification contents in specified format to the callback URL and notification method supports HTTP(S).
*  **Function Service**: The Function Service is an event-driven Serverless computing service. With the Function Service platform, users can elastically, reliably run business codes, rapidly construct applications and services without configuring and managing infrastructures such as servers, and only need to pay for the resources that the codes actually consume.**Now, the Function Service can be configured in North China only**

<div id="user-content-3"></div>

# Event Notification Setting in the Console

1. Log in the JD Cloud Console, select Object Storage Service -> Space Management -> Advanced Configuration, and select **Event Notification**, as shown in the figure:

2. Click **Creation Rules** to open the rule creation page.

 ![事件通知](../../../../image/Object-Storage-Service/OSS-149.png)

3. Please enter the rule name in the **Name** box.

 **Description**

 * At most 100 rules can be created for your bucket.
 * The name shall be restricted to 256 bytes, consisting of the letter, the number, the underline (_) and the line-through (-).

4. Select one or more events for message notification from the **Event Type** drop-down list.

**Description**

* The event type corresponds to different operations of OSS resources. For specific types and meanings, please refer to the following [OSS can send notifications for the following event types](Event-Notifications-1#user-content-1).
* You are allowed to select several events intended to trigger a notification.
* The same event cannot be configured on the same resource for several times (overlapped prefixes and suffixes).
* The same event can be sent to different targets by configuration.
* It is important to note that for each bucket, a single event shall not be configured with prefixes or suffixes that are overlapped; the event notification service shall be matched in turn; and the message notification will be sent and the match is terminated once the match is successfully done.
* The execution sequence shall be subject to the server rules and may be inconsistent with the Console exhibition sequence.

5. Add prefixes and suffixes in the "Resource Description" to complete resource description and screen files.

**Description**

* Resource description: It can be a prefix, a suffix or both a prefix and a suffix. Please note that different resource descriptions shall not have any intersection.
* Prefix and suffix: Some Object targets in the bucket can be exclusively concerned by setting prefixes and suffixes of Object.
      For example:
   -  To concern all files in the bucket, both the prefix and suffix shall not be completed.
   -  To concern all files under the directory jdcloudoss in the bucket, the prefix shall be completed as jdcloudoss/ and suffix shall not be completed.
   -  To concern all .jpg images in the bucket, the prefix shall not be completed while the suffix shall be completed as .jpg.
   -  To concern all films in the .mp3 under the directory jdcloudoss in the bucket, the prefix shall be completed as jdcloudoss/ and suffix shall be completed as .mp3.
  

 6. Select [http(s)] or the [Function Service] in the "Send to" drop-down box to complete setting of the receiving terminal.

**Description**

* [http(s)]: OSS will release message to this address and you can enter 5 callback addresses at most. The address must be the complete URL and the http protocol shall be specified. For more, please refer to [Callback Notification](https://docs.jdcloud.com/en/object-storage-service/callback-notification-2).
* [Function Service]: Function scripts based on OSS events can be run. The Function Service is in the Beta stage now. You need to apply for trial use. For more, please refer to [Function Service](https://www.jdcloud.com/en/products/function-service) and participate in the Beta.
*  Now, the Function Service is supported in cn-north-1 only. The [Function Service] cannot be set in other regions temporarily.
*  Serving as the trigger of Function Service, OSS shall meet the restriction for the Function Service that at most 10 triggers shall be created to a single function. Creation will fail if you exceed such limit. To view configuration details of a single function trigger, please go to [Function Service Console](https://function-console.jdcloud.com/services).

7. Click **Save**.

**Description**

*  Since initiation to [http(s)] selection, OSS will send a test message to the event notification target by clicking **Save**. For your service safety, please complete [Signature Certification Setting for Callback Server]
(https://docs.jdcloud.com/en/object-storage-service/setting-signature-authentication-for-callback-server),so that OSS will complete the address subscription.
*  For message notification format, please refer to [Message Notification](https://docs.jdcloud.com/en/object-storage-service/callback-notification-2).

8. In addition, you may edit or delete event notification rules via the Console

