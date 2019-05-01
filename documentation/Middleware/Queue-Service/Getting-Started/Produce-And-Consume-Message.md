# Send and receive messages

After creating a message queue in the Console, the users can send or receive messages through the Console or by calling SDK.
Batch sending is not supported by the Console, which is mainly used to debug and verify the availability of resources. It is recommended to use SDK to send messages in production step.



## Preconditions

- A queue has been created its status is in service.

- User's AK and SK have been created.

  

## Method 1: Send and receive messages through the Console

1. Find the queue on which you want to send the message on the Queue Management page, and select **Send Message** in the operation.

2. Enter the message content, and add message attributes to the message if you need. As for the standard queue, you can set message latency time for sending latency messages. As for the FIFO queue, you need to set message group ID and message duplicated data deletion ID.

   Standard Queue-Send Message:

   ![标准发送消息](../../../../image/Internet-Middleware/Queue-Service/入门指南-03.png)

   FIFO Queue-Send Message:

   ![FIFO发送消息](../../../../image/Internet-Middleware/Queue-Service/入门指南-04.png)

   ### Description:

   1. The setting of the message latency time will replace the value of the latency delivery on the latency queue.

   2. The message group ID is an identifier to mark the message group to which the message belongs, and the Queue Service will process messages in the same message group in a FIFO manner (but messages in different message groups may be unordered).    Message duplicated data deletion ID is a token used to delete the duplicated message which has been sent, to avoid duplicated acceptance of messages for accurate one-time reception.

      

3. If the message is successfully sent, the notification of successful sending of message, the Message ID as well as related attributes will be returned.

4. Find the queue on which you sent the message, and select **Receive Message** in the operation to enter the message receiving interface.

5. Select the number of messages you want to receive and the waiting time for the queue round robin and click to start **Receive Messages”.

   Setting receiving parameter:

   ![接收参数](../../../../image/Internet-Middleware/Queue-Service/入门指南-05.png)

   Result of receiving messages:

   ![接收结果](../../../../image/Internet-Middleware/Queue-Service/入门指南-06.png)

   ### Description:

   1. The maximum number of messages received is the maximum number of messages that the queue round robin wants to receive. When such number is reached, it will stop the round robin of queue.
   2. The round robin time of queue is the longest time for this round robin, whether or not it reaches the set number of received messages, it will stop the round robin of queue.
   3. You can click to stop **Receive Messages** at any time in the process of queue round robin, to stop the round robin of queue.
   4. For displayed messages, you can choose to delete them from the control interface, provided that the message does not exceed the [Visibility Time-out Period](../Introduction/Core-Concepts.md)(i.e. you still have the right to operate on this message). You can click the message ID to view the message details.

   



## Method 2: Send and receive messages through SDK

For SDK, it is recommended that you use AWS SQS SDK. JD Cloud Queue Service supports the interface of SQS SDK. When using SDK, you need to configure 4 parameters: Accesskey, Secretkey, Endpoint and Region. In which, AK&SK has been created already by you on the [AccessKey Management Page](https://uc.jdcloud.com/account/accesskey). You can obtain Endpoint and Region by clicking “Access Point Address” in the Console. Endopint is the address of a HTTP/S, and Region is the English code of the selected region, as shown in the following figure.

![接入点地址](../../../../image/Internet-Middleware/Queue-Service/入门指南-07.png)

![地址信息](../../../../image/Internet-Middleware/Queue-Service/入门指南-08.png)





Take Java SDK as an example to illustrate; other for methods and development languages, please refer to other chapters.

1. Introduce the dependence in the Maven mode

```
<dependency>  
    <groupId>com.amazonaws</groupId>  
    <artifactId>aws-java-sdk</artifactId>  
    <version>x.x.x</version>      
     //Set as the latest version number of Java SDK 
</dependency>
```

For the latest version number of Java SDK, please [View](https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk).

Or download [AWS SDK](https://aws.amazon.com/cn/sdk-for-java/) to add by yourself.

2. Initialize, and fill in the AK&SK, access point and Region information.

   ```Java
   
  final String accessKey = "your accesskey";
  final String secretKey = "your secretkey";
  final String endpoint = "your region endpoint";
  final String region = "your region";
   
  AmazonSQS sqs = AmazonSQSClientBuilder.standard()
                  .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey,secretKey)))
                  .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint,region))
                  .build();
                  
   ```

3. demo of SDK can be viewed at: [Queue Service Demo Code](https://github.com/awsdocs/aws-doc-sdk-examples/tree/master/java/example_code/sqs).
