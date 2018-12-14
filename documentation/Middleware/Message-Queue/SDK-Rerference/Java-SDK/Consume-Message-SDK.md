# Consumption Message (Push)

Message filter can be carried out when using the Message Queue JCQ SDK consumption messages. If there are multiple consumers under one consumerGroup, carry out the semantics of cluster consumption of consumption implementation; if there are multiple consumers respectively under different consumerGroups, carry out the semantics of broadcast consumption of consumption implementation.

## Configurable Parameters
| Parameter             | Parameter Description                                          |
| ---------------- | ------------------------------------------------- |
| filterExpression | The tag for the messages received by the consumer can be set; 1 tag is supported temporarily |

## Example Code:
```java
package com.jcloud.jcq.sdk.demo;

import com.jcloud.jcq.client.consumer.ConsumeResult;
import com.jcloud.jcq.client.consumer.MessageListener;
import com.jcloud.jcq.common.filter.FilterExpression;
import com.jcloud.jcq.protocol.Message;
import com.jcloud.jcq.sdk.JCQClientFactory;
import com.jcloud.jcq.sdk.auth.UserCredential;
import com.jcloud.jcq.sdk.consumer.Consumer;
import com.jcloud.jcq.sdk.consumer.ConsumerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Push Type Consumer demo.
 * @date 2018-05-17
 */
public class ConsumerDemo {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerDemo.class);
    /**
     * User accessKey
     */
    private static final String ACCESS_KEY = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0";
    /**
     * User secretKey
     */
    private static final String SECRET_KEY = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB0";
    /**
     * Metadata Server Address
     */
    private static final String META_SERVER_ADDRESS = "127.0.0.1:18888";
    /**
     * topic Name
     */
    private static final String TOPIC = "testTopic";
    /**
     * Consumer Group Id
     */
    private static final String CONSUMER_GROUP_ID = "testConsumerGroup";

    public static void main(String[] args) throws Exception {
        // Create message consumer, applicable to both common and global sequential messages
        UserCredential userCredential = new UserCredential(ACCESS_KEY, SECRET_KEY);
        ConsumerConfig consumerConfig = ConsumerConfig.builder()
                .consumerGroupId(CONSUMER_GROUP_ID)
                .metaServerAddress(META_SERVER_ADDRESS)
                .build();
        Consumer consumer = JCQClientFactory.getInstance().createConsumer(userCredential, consumerConfig);

        // Create consumption filter requirements, if needed
        FilterExpression filterExpression = new FilterExpression();
        filterExpression.setExpressionType(FilterExpression.ExpressionType.TAG);
        filterExpression.setExpression("TAG");

        // Subscribe topic, with filter conditions
        consumer.subscribeTopic(TOPIC, new MessageListener() {
                    @Override
                    public ConsumeResult consumeMessages(List<Message> list) {
                        logger.info("messages:{}", list);
                        return ConsumeResult.SUCCESS;
                    }
                },
                filterExpression);

        // Subscribe topic1, without filter conditions
        consumer.subscribeTopic("testTopic1", new MessageListener() {
                    @Override
                    public ConsumeResult consumeMessages(List<Message> list) {
                        logger.info("messages:{}", list);
                        return ConsumeResult.SUCCESS;
                    }
                },
                null);

        // Enable consumer, start consumption
        consumer.start();
    }
}
```

