# View Monitoring Information

The Queue Console provides rich performance monitoring data and you can view the running status of a queue at any time.

## Operation Steps

1. Log in [Queue Service Console](https://jqs-console.jdcloud.com/).
2. On the “Queue Management” page, select the target queue and click **Queue Name**, to enter the “Queue Details” page.
3. On the “Queue Details” page, click **Monitoring** to view the monitoring information.
   - You can quickly select to view data from 1 hour to 14 days, or enter a date range to view, with the largest time range of 1 month.

## Monitoring Items Description

| Monitoring Items                 | Unit | Description                                 |
| ---------------------- | ---- | ------------------------------------ |
| Count of Messages Sent         | Piece   | Number of Messages Sent to Queue                 |
| Quantity of Requests for Sending Messages         | Piece   | Number of API Requests of Messages Sent to Queue          |
| Size of Messages Sent         | MB   | Sum of Message Sizes Sent to Queue             |
| Rough Count of Visible Messages       | Piece   | Count of Messages Can be Received From Queue               |
| Rough Count of Invisible Messages     | Piece   | Count of Messages in Invisible Status                 |
| Rough Count of Delayed Messages       | Piece   | Count of Messages in Queue That is Delayed and Cannot be Read Immediately     |
| Count of Messages Received         | Piece   | Count of Messages Pulled from Queue                 |
| Quantity of Request for Receiving Messages        | Piece   | Number of API Requests for Pulling Messages from Queue          |
| Null Message Request Quantity Received     | Piece   | Number of API Requests Without Return of Message Pulling          |
| Number of Messages Deleted         | Piece   | Number of Messages Deleted From Queue                 |
| Quantity of Request for Deleting Messages        | Piece   | Number of Requests for Deleting Messages from Queue             |
| Maximum Time a Message is in a Queue | Second   | The Approximate Time When the Oldest Undeleted Message Stays in the Queue |

