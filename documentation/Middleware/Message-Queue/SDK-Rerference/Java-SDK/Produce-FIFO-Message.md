# Production Sequence Message
(Note: When the topic type is selected to be the global sequential message, this producer should be used to send messages)

Message Queue JCQ SDK supports two sequential message modes: Synchronously sending a single message and synchronously sending batch messages (up to 32). The sequential message is applicable to the scenarios where the message is released and consumed strictly according to the principle of first-in-first-out. The specific parameters and reference examples are as follows.

## Configurable Parameters
| Parameter          | Parameter Description                                   |
| ------------- | ------------------------------------------ |
| PROPERTY_TAGS | The message tag can be set; 1 tag is supported temporarily |

## Code Example
```java
package com.jcloud.jcq.sdk.demo;

import com.jcloud.jcq.protocol.Message;
import com.jcloud.jcq.sdk.JCQClientFactory;
import com.jcloud.jcq.sdk.auth.UserCredential;
import com.jcloud.jcq.sdk.producer.GlobalOrderProducer;
import com.jcloud.jcq.sdk.producer.ProducerConfig;
import com.jcloud.jcq.sdk.producer.model.SendBatchResult;
import com.jcloud.jcq.sdk.producer.model.SendResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Global Sequential Message Producer  demo.
 * @date 2018-05-17
 */
public class GlobalOrderProducerDemo {
    private static final Logger logger = LoggerFactory.getLogger(GlobalOrderProducerDemo.class);
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
    private static final String META_SERVER_ADDRESS = "127.0.0.1:18888";
    /**
     * topic Name
     */
    private static final String TOPIC = "testTopic";

    public static void main(String[] args) throws Exception {
        // Create Global Sequential Message producer
        UserCredential userCredential = new UserCredential(ACCESS_KEY, SECRET_KEY);
        ProducerConfig producerConfig = ProducerConfig.builder()
                .metaServerAddress(META_SERVER_ADDRESS)
                .build();
        GlobalOrderProducer globalOrderProducer = JCQClientFactory.getInstance().createGlobalOrderProducer(userCredential, producerConfig);

        // Enable producer
        globalOrderProducer.start();

        // Create message, Global Sequential Message does not support the attribute setting of deferred delivery
        Message message = new Message();
        message.setTopic(TOPIC);
        message.setBody(("this is message boy").getBytes());
        Message message1 = new Message();
        message1.setTopic(TOPIC);
        message1.setBody(("this is message1 boy").getBytes());

        // Set the attribute of message tag Attribute, if needed
        message.getProperties().put(MessageConstants.PROPERTY_TAGS, "TAG");
        
        // Send a single message synchronously
        SendResult sendResult = globalOrderProducer.sendMessage(message);
        logger.info("messageId:{}, resultCode:{}", sendResult.getMessageId(), sendResult.getResultCode());

        // Send batch messages synchronously, up to 32 messages in one batch
        List<Message> messages = new ArrayList<>();
        messages.add(message);
        messages.add(message1);
        SendBatchResult sendBatchResult = globalOrderProducer.sendBatchMessage(messages);
        logger.info("messageIds:{}, resultCode:{}", sendBatchResult.getMessageIds(), sendBatchResult.getResultCode());
    }
}
```

