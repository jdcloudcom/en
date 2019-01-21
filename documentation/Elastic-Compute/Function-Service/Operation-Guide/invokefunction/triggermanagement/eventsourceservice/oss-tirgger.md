# OSS Trigger

OSS: Object Storage Service is a large-scale distributed object storage service independently researched and developed by JD Cloud. It provides enterprises and individual developers with high-availability, low-cost, and secure cloud storage services. You can implement unified management of data to meet a variety of storage needs.

 ## Trigger Configuration
 
Trigger Example: ossTrigger.yml

```
triggerConfig:
   events:
       s3:ObjectCreated:Put
       s3:ObjectCreated:Post
   filter:
      key:
          prefix: sourcefile/
          suffix: .gif
```

**Note:**

``filter `` is a filtering parameter for the OSS object; an OSS object that meets the filtering criteria can trigger the function, having the following attributes:

 ``key``: the filtering object key (Key) supported by the filter, having the following attributes:
           
 ``prefix``: matching prefix
 ``suffix``: matching suffix



The trigger configuration parameter for OSS trigger is described in Table 1.

Table 1  Table of OSS Trigger Information

|  Field        |  Description                                                         |
| ----------- | ------------------------------------------------------------ |
| * Trigger Type |  Select the "OSS Object Storage Service Trigger" in the drop-down list. |
| * bucket List |  Select the OSS Storage Bucket of the event source. Select from the OSS Storage Bucket that has been created under the same region.|
| * Trigger Event   |  Select the event to enable it to trigger the function. Please refer to Table 1 for the supported event type. |
|  Prefix        |  Matching prefix, you can configure notifications to be filtered by prefixes and suffixes of object names. |
|  Suffix        |  Matching suffix, you can configure notifications to be filtered by prefixes and suffixes of object names. |  



## OSS Event Definition

When an event is captured by OSS, it is passed to the event handling function as the [event parameter](../configtigger-event.md). The current event trigger type of OSS is the same as the supported event type of [OSS invoke Notification](http://docs.jdcloud.com/cn/object-storage-service/invoke-notification-2). Refer to Table 2 for the details and items with * are compulsory items.

Table 2 Type of Event Supported by OSS

| Event Name                                 | Description                                                         |
| ----------------------------------------- | ------------------------------------------------------------ |
| s3:ObjectCreated:*                       | The behavior of creating object, including Put Object,   Post Object, Copy Object, Complete Multipart Upload |
| s3:ObjectCreated:Put                     | Use Put Object to upload files                                       |
| s3:ObjectCreated:Post                    | Use Post Object to upload files                                      |
| s3:ObjectCreated:Copy                    | Use Put Object-Copy to copy files                                  |
| s3:ObjectCreated:CompleteMultipartUpload | Complete multipart upload                                                 |
| s3:ObjectRemoved:*                       | The behavior of deleting object, including Delete   Object                        |
| s3:ObjectRemoved:Delete                  | Delete Files                                                     |



 

## Operation Instructions to OSS Trigger

Resource and event are two elements that make up OSS trigger:
 
 * The resource is composed of bucket and prefix & suffix. The same Bucket is considered the same resource if the prefix is the same or is an inclusive relationship. Similarly, it is deemed as the same resource as well if the suffix is the same or is an inclusion relation. It is considered as the same resource if the prefix and suffix are the same at the same time or are an inclusion relationship respectively.
 
 * The event is a trigger event, including the event type in Table 1.
  
  Currently, OSS gateway trigger only supports function association in the same region; the repeated association between OSS triggers and functions is unrestricted.
  
  **Scenario 1 **: The same OSS resource and the same event can associate the same or more functions. When the association is repeated, the event will only trigger the first function associated.
  
  **Scenario 2 **: The same OSS resource and different events can associate the same or more functions. When the association is repeated, if the event types are inclusive, for example: configuring two triggers; the same Bucket, the types of events are: s3:ObjectCreated:*  and s3:ObjectCreated:Put respectively (s3:ObjectCreated:* including s3:ObjectCreated:Put event); When the user uploads a file to the Bucket, only the first function associated will be triggered.

 
Note:
1. Associated functions can be triggered at the same time only when resources and events are different at the same time.
2. Be sure to avoid the **Loop Triggering** when using the OSS Trigger. A typical loop trigger scenario is that: Uploading file by some Bucket of OSS triggers execution of a function, which generates one or more files and writes back to OSS's Bucket, which triggers the execution of a function and forms a chain loop.
