# Consumption Message (Pull)

Message filter can be carried out when using the Message Queue JCQ SDK consumption messages. If there are multiple consumers under one consumerGroup, carry out the semantics of cluster consumption of consumption implementation; if there are multiple consumers respectively under different consumerGroups, carry out the semantics of broadcast consumption of consumption implementation.

## Configurable Parameters
| Parameter             | Parameter Description                                          |
| ---------------- | ------------------------------------------------- |
| filterExpression | The tag for the messages received by the consumer can be set; 1 tag is supported temporarily |

## Manual ack action
| ackAction             | Parameter Description                                          |
| ---------------- | ------------------------------------------------- |
| SUCCESS | Consumption Succeeded |
| CONSUME_FAILED | Consumption Failed |
| RESEND |Request the server to resend immediately |
| DISCARD | Discard the message and do not resend. Consumption failed but there is no need to resend |

## Example Code:
```java
package com.jcloud.jcq.sdk.demo;

import com.jcloud.jcq.common.filter.FilterExpression;
import com.jcloud.jcq.common.message.AckAction;
import com.jcloud.jcq.sdk.JCQClientFactory;
import com.jcloud.jcq.sdk.auth.UserCredential;
import com.jcloud.jcq.sdk.consumer.PullConsumer;
import com.jcloud.jcq.sdk.consumer.PullConsumerConfig;
import com.jcloud.jcq.sdk.consumer.async.AsyncAckCallback;
import com.jcloud.jcq.sdk.consumer.async.AsyncPullCallback;
import com.jcloud.jcq.sdk.consumer.model.AckResult;
import com.jcloud.jcq.sdk.consumer.model.PullResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Pull Type Consumer demo.
 *
 * @date 2018-05-17
 */
public class PullConsumerDemo {
    private static final Logger logger = LoggerFactory.getLogger(PullConsumerDemo.class);
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
        // Create pull type consumer, applicable to both common and global sequential messages
        UserCredential userCredential = new UserCredential(ACCESS_KEY, SECRET_KEY);
        PullConsumerConfig pullConsumerConfig = PullConsumerConfig.builder()
                .consumerGroupId(CONSUMER_GROUP_ID)
                .metaServerAddress(META_SERVER_ADDRESS)
                .build();
        PullConsumer pullConsumer = JCQClientFactory.getInstance().createPullConsumer(userCredential, pullConsumerConfig);
        pullConsumer.start();

        // Create consumption filter requirements, if needed
        FilterExpression filterExpression = new FilterExpression();
        filterExpression.setExpressionType(FilterExpression.ExpressionType.TAG);
        filterExpression.setExpression("TAG1");

        // Pull the messages synchronously; when a specified tag is needed as a filter condition, the second parameter fills the specific filterExpression
        PullResult pullResult = pullConsumer.pullMessage(TOPIC, null);
        logger.info("Sync pullResult.resultCode:{}, pullResult.ackIndex:{}, pullResult.messages:{}",
                pullResult.getResultCode(), pullResult.getAckIndex(), pullResult.getMessages());

        // Pull the messages asynchronously; when a specified tag is needed as a filter condition, the second parameter fills the specific filterExpression
        pullConsumer.pullMessageAsync(TOPIC, null, new AsyncPullCallback() {
            @Override
            public void onResult(PullResult pullResult) {
                logger.info("Async pullResult.resultCode:{}, pullResult.ackIndex:{}, pullResult.messages:{}",
                        pullResult.getResultCode(), pullResult.getAckIndex(), pullResult.getMessages());
            }

            @Override
            public void onException(Throwable throwable) {
            }
        });

        // Synchronize ack Message
        AckResult ackResult = pullConsumer.ackMessage(TOPIC, pullResult.getAckIndex(), AckAction.SUCCESS);
        logger.info("Sync ackResult:{}", ackResult.getResultCode());

        // Asynchronize ack Message
        pullConsumer.ackMessageAsync(TOPIC, pullResult.getAckIndex(), AckAction.SUCCESS, new AsyncAckCallback() {
            @Override
            public void onResult(AckResult ackResult) {
                logger.info("Async ackResult:{}", ackResult.getResultCode());
            }

            @Override
            public void onException(Throwable throwable) {
            }
        });
    }
}
```
