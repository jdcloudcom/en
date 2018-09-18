# Price Overview
Message Queue charges the fee according to combination of the API Call Fee and Topic Resource Occupancy Fee.
Message Queue Cost = API Call Fee + Topic Resource Occupancy Fee

## API Call Fee
Number of requests: Calling number of sending messages + API calling number of subscription messages, the unit is in millions, accurate to three decimal places.

| Billing by Ladder	| Total Amount of Calling/Month	| Cost of Million Times |
|:--|:-- |--: |
| First Ladder	| 0-1 billion times	| 2 RMB |
| Second Ladder	| 1-5 billion times	| 1.8 RMB |
| Third Ladder	| 5-10 billion times	| 1.5 RMB |
| Forth Ladder	| 10-50 billion times	| 1.3 RMB |
| Fifth Ladder	| 50 billion above	| 1.2 RMB |


## Topic Resource Occupancy Fee

| Billing by Ladder |	Number of Calling/Day/Topic	| Cost/Day/Topic |
|:--|:-- |--: |
| First Ladder	| 0-1 million times	| 2 RMB |
| Second Ladder |	1-5 million times	| 1.5 RMB |
| Third Ladder |	5-10 million times	| 0.5 RMB |
| Forth Ladder	| 10 million times above	| 0 RMB |


### Billing Notes

- The maximum size of the message body is 256KB and is charged by one request per 4 KB publish or subscribe data (less than 4 KB is charged by 4 KB). For example, the one load (publish or subscribe) API call of 64 KB will be charged at 64/4 request.

- Ordered Message: The publish request is charged 25 times at a time, and the subscription request is charged 25 times at a time. For example, publish the order message once, subscribe to the message once, and charge according to 25+25=50 API call.

- Delayed Message: The publish request is charged 25 times at a time, and the subscription is charged according to the general message. For example, publish a delay message once, subscribe to the message once, and charge according to 25+1=26 API call.

- Payment method: Message Queue is Pay-As-You-Go product, pay by consumption; Pay the bill according to the day (output the bill on the next day).

- The call sending and receiving API is billing, the measurement unit is millions of times.
