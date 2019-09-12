# Produce Common (Unordered) Message
(Note: When the topic type is selected to be the unordered message, this producer should be used to send messages)

Message Queue JCQ SDK supports four sequential message modes: synchronously sending a single message, asynchronously sending a single message, synchronously sending batch messages (up to 32), and asynchronously sending batch messages (up to 32). This document describes the message sending ways, configurable parameters, application scenarios and features; code examples are provided for reference at the same time.

## Different Message Sending Methods

| Message Sending Methods     | TPS  |  Throughput  |Principle |  Application Scenarios                                                     |
| ---------------- | ---- | ------ |---| ------------------------------------------------------------ |
| Send a single message synchronously | Fast | Medium     | Synchronous sending refers to the communication way in which a message sender will not send the next request until the message sender receives the response from the receiver after the message sender sends a request. |Synchronous sending is mainly used is in the business that needs to return the result fastest, such as the recharge result or the feedback of sending result of SMS and email. |
| Send batch messages synchronously | Medium | High     | Synchronous batch sending means that messages are sent in batches on the basis of synchronous sending, that multiple messages can be sent at one request, and that the corresponding server will return the response at a slower rate|                                                           |
| Send a single message asynchronously | Fastest   | Higher   | Asynchronous sending refers to the communication way in which the sender sends the next request without waiting for the response from the receiver (the response result needs to be obtained by the user through the callback function) after the senders sends the request. |Asynchronous sending is mainly used in business that is not sensitive to sending results but is sensitive to response time, such as log collection. |
| Send batch messages asynchronously | Faster | Highest     | Asynchronous batch sending refers to batch sending on the basis of asynchronous sending and then sending the next batch request. |                                                         |


## Configurable Parameters
| Parameter                | Parameter Description                                   |Remark                                       |
| ------------------- | ------------------------------------------ |
| PROPERTY_BUSINESS_ID|Business ID for messages can be set, and users can query messages by business ID|The maximum length is 128 characters                       |
| PROPERTY_TAGS       | The message tag can be set                  | 1 tag is supported temporarily |
| PROPERTY_DELAY_TIME | The message deferred time can be set                     | ranging from 0-3,600 seconds     |
| PROPERTY_RETRY_TIMES| Message retry times at client can be set                 |It is not related to retry times at server, 2 times by default. Namely the message is sent to server for 3 times in total|

## Code Example
```Java
package com.jcloud.jcq.sdk.demo;

import com.jcloud.jcq.common.constants.MessageConstants;
import com.jcloud.jcq.protocol.Message;
import com.jcloud.jcq.sdk.JCQClientFactory;
import com.jcloud.jcq.sdk.auth.UserCredential;
import com.jcloud.jcq.sdk.producer.Producer;
import com.jcloud.jcq.sdk.producer.ProducerConfig;
import com.jcloud.jcq.sdk.producer.async.AsyncSendBatchCallback;
import com.jcloud.jcq.sdk.producer.async.AsyncSendCallback;
import com.jcloud.jcq.sdk.producer.model.SendBatchResult;
import com.jcloud.jcq.sdk.producer.model.SendResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Common Messages Producer  demo.
 * @date 2018-05-17
 */
public class ProducerDemo {
    private static final Logger logger = LoggerFactory.getLogger(ProducerDemo.class);
    /**
     * User accessKey
     */
    private static final String ACCESS_KEY = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0";
    /**
     * User secretKey
     */
    private static final String SECRET_KEY = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB0";
    /**
     * Metadata Server Address (Access Point Address)
     */
    private static final String META_SERVER_ADDRESS = "192.168.166.57:18888";
    /**
     * topic Name
     */
    private static final String TOPIC = "testTopic";

    public static void main(String[] args) throws Exception {
        // Create Common Message  producer
        // If you log in by role, you can simply put the obtained ST Stoken as UserCredential parameter
        UserCredential userCredential = new UserCredential(ACCESS_KEY, SECRET_KEY);
        ProducerConfig producerConfig = ProducerConfig.builder()
                .metaServerAddress(META_SERVER_ADDRESS)
                .build();
        Producer producer = JCQClientFactory.getInstance().createProducer(userCredential, producerConfig);

        // Enable producer
        producer.start();

        // Create message
        Message message = new Message();
        message.setTopic(TOPIC);
        message.setBody(("this is message boy").getBytes());
        Message message1 = new Message();
        message1.setTopic(TOPIC);
        message1.setBody(("this is message1 boy").getBytes());

        // Set the message businessID attribute, if needed
        message.getProperties().put(MessageConstants.PROPERTY_BUSINESS_ID,"yourBusinessID");

        // Set the attribute of message tag Attribute, if needed
        message.getProperties().put(MessageConstants.PROPERTY_TAGS, "TAG");

        // Set the deferred delivery attribute of the message (unit: second), if needed
        message.getProperties().put(MessageConstants.PROPERTY_DELAY_TIME, "1000");

        // Send a single message synchronously
        SendResult sendResult = producer.sendMessage(message);
        logger.info("messageId:{}, resultCode:{}", sendResult.getMessageId(), sendResult.getResultCode());

        // Send a single message asynchronously
        producer.sendMessageAsync(message, new AsyncSendCallback() {
            @Override
            public void onResult(SendResult sendResult) {
                logger.info("messageId:{}, resultCode:{}", sendResult.getMessageId(), sendResult.getResultCode());
            }

            @Override
            public void onException(Throwable throwable) {
                logger.info("exception:{}", throwable);
            }
        });

        // Send batch messages synchronously, up to 32 messages in one batch
        List<Message> messages = new ArrayList<>();
        messages.add(message);
        messages.add(message1);
        SendBatchResult sendBatchResult = producer.sendBatchMessage(messages);
        logger.info("messageIds:{}, resultCode:{}", sendBatchResult.getMessageIds(), sendBatchResult.getResultCode());

        // Send batch messages asynchronously, up to 32 messages in one batch
        producer.sendBatchMessageAsync(messages, new AsyncSendBatchCallback() {
            @Override
            public void onResult(SendBatchResult sendBatchResult) {
                logger.info("messageIds:{}, resultCode:{}", sendBatchResult.getMessageIds(), sendBatchResult.getResultCode());
            }

            @Override
            public void onException(Throwable throwable) {
                logger.info("exception:{}", throwable);
            }
        });
    }
}
```

