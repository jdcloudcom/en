# Price Overview

Payment Method: Paying by Consumption

Payment Dimension: Conduct total charging of the Queue Service used with user as the unit, making statistics by day



Queue Service Charge=API Call Cost

### API Call Cost:

The unit of number of API call of Queue Service is million times, accurate to three decimal places.

| Billing by Tier | Cumulative Total of Number of Call/Month | Cost Per Million Times |
| ---------- | --------------- | ------------ |
| Tier 1   | 0~1 billion times        | RMB 2          |
| Tier 2   | 1 billion~5 billion times   | RMB 1.8        |
| Tier 3   | 5 billion~10 billion times  | RMB 1.5        |
| Tier 4   | 10 billion~50 billion times | RMB 1.3        |
| Tier 5   | More than 50 billion times     | RMB 1.2        |

Description:

1. API Operation: API call operation of each Queue Service is counted as a request with a billing cycle of 00:00:00 to 23:59:59 on the current day.

1. Request Content Restriction: A single request can have 1-10 messages with a total load cap of 256 KB and the data of each 4 KB is charged at one request; those less than 4 KB is charged at one request. For example, 1 API call with a load of 64 KB will be charged at 64/4=16 requests.

1. FIFO Queue: API operation of sending, receiving and deleting messages in a FIFO queue and changing the visibility is charged at 2 times of requests, while any other API request is charged at the standard rate. For example, send a sequential message once and receive the message once, it is charged at 2+2=4 API calls.

