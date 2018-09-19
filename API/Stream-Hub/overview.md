# JD Cloud Stream Hub API


## Introduction
Provide related APIs for Stream Hub topic.


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**addTopic**|POST|When creating topic, only the topic parameter in the topicModel needs to be transmitted, and the other two parameters can be blank|
|**createConsumerGroup**|POST|Create consumerGroupName|
|**deleteConsumerGroup**|DELETE|Delete ConsumerGroupName|
|**deleteTopic**|DELETE|Delete Topic|
|**describeTopic**|GET|Query the assigned subject, the archiving information will be returned if it has been archived|
|**getConsumerGroupList**|GET|View all the consumer groups of the assigned subject|
|**getTopicList**|GET|Query the topic list, return to the topic collection|
|**updateTopic**|PUT|The API can be used to update subjects, create archives, modify archives, delete archives; different functions can be realized by transmitting different parameters. To modify the archives, only the parameters of the corresponding archives need to be modified; to delete the archives, only the archive parameters need to be set as blank|
