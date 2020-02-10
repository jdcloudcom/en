# Cloud Event Trigger

Cloud Event Service is an event management and monitoring platform provided by JD Cloud. Via Cloud Event Service, users can view and subscribe events.

 ## Trigger Configuration

See Table 1 for the configuration parameter description for Cloud Event trigger, * is a compulsory item.
 
Table 1 Table of Cloud Event Trigger Information


| Field         | Description                                     |
| ----------- | ---------------------------------------- |
| * Trigger Type | Select "Cloud Event Trigger" in drop-down list           |
| *  Event Subscription   | Select existed Cloud Event subscription rules or create subscription rules  |

Description: Users can create subscription rules for which the event source type is timing event and customized event when creating a Cloud Event trigger, and subscription rules for which the event source type is a system event need to be created on Cloud Event Console.

### Create Timing Event

Table 2 Table of Timing Event Trigger Configuration

| Field         | Description                                     |
| ----------- | ---------------------------------------- |
| * Rule Name |    It shall not be null, and only Chinese, numbers, uppercase and lowercase letters, English underline "_" and line-through "-" are supported, with no more than 32 characters       |
| Rule Description   | Not exceed 256 characters  |
| * Event Source Type  | Timing Event  |
| Timing Mode  | Fixed Frequency (1-100 minutes/hour/day) or [Timing Expression](https://docs.jdcloud.com/en/cloudevents/crongrammar)  |

### Create Customized Event

Table 3 Table of Customized Event Trigger Configuration

| Field         | Description                                     |
| ----------- | ---------------------------------------- |
| * Rule Name |    It shall not be null, and only Chinese, numbers, uppercase and lowercase letters, English underline "_" and line-through "-" are supported, with no more than 32 characters       |
| Rule Description   | Not exceed 256 characters  |
| * Event Source Type  | Customized Event  |
| * Event Source | Define based on the data reported by the customized event  |
| * Event Type | Define based on the data reported by the customized event  |


 
 ### Restrictions for Rule Association

* For Cloud Event trigger, the same subscription rule can associate with multiple functions.


