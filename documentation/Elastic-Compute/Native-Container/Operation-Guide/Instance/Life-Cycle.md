
# Native Container life cycle

The life cycle of Native Container Instance and Native Container Pod begins from create (buy) to the final release (expiration for Monthly Package, arrear suspension for Pay By Configuration instance or Pay By Configuration instance user actively delete it).

**State Corresponding to Native Container Instance**

|   State   | State Attribute    |Explanation     |
| --- | --- | --- |
|   Pending  | Middle State    |  The state after the console submits the task to create Native Container Instance and before the instance enters into “running”, and if it is in such state for a long time, it indicates that exception occurs during the creation of Native Container Instance.             |
| Running         | Stability State       |  Normal running state of instance, in which your business may be run on the Native Container Instance, and at the same time, the corresponding operation may be done to the Native Container Instance.                  |
| Stopped     |  Stability State    |The Native Container Instance at the console is normally stopped and ceases to provide service externally. |
| Error     |  Stability State        |  Exception occurs during the creation of Native Container Instance, the system automatically deletes it, and fees are returned.  |
|Deleting  |Middle State     |  The state of Native Container Instance of pay by configuration, in error state or of monthly package from the submission by the console of the Native Container Instance to be deleted to the successful deletion.            |
|Starting              | Middle State      |  The state of Native Container Instance in “stopped” state after “start” operation at console or through API and before the “running” state, and if it is in such state for a long time, it indicates that exception occurs.   |
| Stopping      | Middle State    |The state after the “stop” operation is done at the console to the Native Container Instance and before it enters into the “stopped” state, and if it is in such state for a long time, it indicates that exception occurs.     |
| Deleted      | Stability State    |The Native Container Instance is successfully deleted, and the deleted Native Container Instance is kept for 15 minutes before it automatically disappears.     |
           
**State Corresponding to Native Container Pod**

|   State   | State Attribute    |Explanation     |
| --- | --- | --- |
|   Pending  | Middle State    |  The state of console after the task to create Native Container Pod is submitted and before it enters into “running”, and if the console is in such state for a long time, it indicates that exception occurs during the creation of Native Container Pod.             |
| Running         | Stability State       |  Normal running state of Native Container Pod, in which your business may be run on the Native Container Pod, and at the same time, the corresponding operation may be done to the Native Container Pod.                  |
| Stopped     |  Stability State    |The Native Container Pod at the console is normally stopped and ceases to provide service externally. |
| Succeeded         | Stability State       |  All container in the Native Container Pod are successfully stopped and will no longer be restarted.|
| Failed     |  Stability State    |All container in the Native Container Pod are stopped, but the exit code of at least one container is not zero or stopping failed as it is stopped by the system. |
| Error     |  Stability State        |  Exception occurs during the creation of Native Container Pod, the system automatically deletes it, and fees are returned.  |
|Deleting  |Middle State     |  The state of Native Container Pod of pay by configuration, in error state or of monthly package from the submission by the console of the instance to be deleted to the successful deletion.            |
|Starting              | Middle State      |  The state of Native Container Pod in “stopped” state after “start” operation at console or through API and before the “running” state, and if it is in such state for a long time, it indicates that exception occurs.   |
| Stopping      | Middle State    |The state after the “stop” operation is done at the console to the Native Container Pod and before it enters into the “stopped” state, and if it is in such state for a long time, it indicates that exception occurs.     |
| Deleted      | Stability State    |The Native Container Pod is successfully deleted, and the deleted Native Container Pod is kept for 15 minutes before it automatically disappears.     |

If there is an exception in your instance, please open ticket.


