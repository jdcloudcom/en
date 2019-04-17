# JD Cloud jcq APIs


## Introduction
jcq relevant APIs</br>The product currently supports access control products for user identity management and resource access control. For details, see: https://docs.jdcloud.com/cn/iam/support-services


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**addPermission**|POST|Grant specific permissions to the target user for the current topic|
|**cleanMessages**|POST|Clear message|
|**createSubscription**|POST|Create subscription|
|**createTopic**|POST|Create one topic with a specified name|
|**deleteDeadLetters**|DELETE|Delete dead letter message|
|**deleteSubscription**|DELETE|Delete subscription|
|**deleteTopic**|DELETE|Delete single topic|
|**describeAccessPoint**|GET|View access point APIs|
|**describeConsumerGroupIds**|GET|consumerGroupId List|
|**describeDeadLetterNumbers**|GET|Dead Letter Message Number (according to user or consumerGroupId)|
|**describeDeadLetterNumbersWithTopic**|GET|Dead Letter Message Number|
|**describeMessage**|GET|Search message details|
|**describeMessages**|GET|Message List|
|**describePermission**|GET|View which specific permissions are granted to which target users for the current topic|
|**describeSubscription**|GET|Search subscription details|
|**describeSubscriptions**|GET|Subscription List|
|**describeTopic**|GET|Search topic details|
|**describeTopics**|GET|Search topic list|
|**listDeadLetters**|GET|Dead Letter Queue List|
|**removePermission**|DELETE|Delete the specific permissions granted to the target user for the current topic|
|**resendDeadLetters**|POST|Resend dead letter message|
|**resetConsumeOffset**|POST|Reset consumption bit|
