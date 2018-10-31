
# Instance Life Cycle

The life cycle of instance starts at creating (purchasing) and end at releasing (monthly package instances are due; service is suspended due to insufficient balance or user take initiative to get it deleted for pay by configuration instance).

Corresponding status of instance

|   Status  | Status attribute    | Description    |
| --- | --- | --- |
|   Pending  | Intermediate status    |  Console, the status after submitting the instance task created and before entering “Running”; if this status lasts for a long time, it indicates there shall be an exception in creating instance.             |
| Running  | Steady status    | Normal operation status of instance, in this status the instance can run your business and take corresponding operation for Machine at the same time.                  |
|   Stop  | Intermediate status    | Console, the instance is stopped normally and stop providing service externally at the same time. |
|   Error  | Steady status    |  There is exception in creating instance and system shall delete it automatically and return cost.  |
| Deleting   |Intermediate Status      |   Pay By Configuration, Error Status or Monthly Package Expired instances, the status from Submitting Delete Instance to Console to Deleted Successfully.            |
|Starting             | Intermediate status      |  Instance of “Stop” status, status from “Starting” operation in console or according to API to start the status of “Running”; if this status lasts for a long time, it indicates there shall be an exception in creating instance.   |
|Stopping           | Intermediate status      |  Status from “Stop” operation in console to entering the status of “Stop”; if this status lasts for a long time, it indicates there shall be an exception in creating instance.     |
           

If there is an exception in your instance, please open ticket.


