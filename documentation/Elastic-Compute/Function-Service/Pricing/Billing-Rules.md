# Billing Rules



## Cost of Number of Invokes

The number of calls is the total number of requests for all functions

The cost of number of invokes = (The actual number of invokes of the function - quota of free number of invokes) * unit price of number of invokes

Unit price of number of invokes: RMB 1.197 per million times (RMB 0.000001197/time)

 

## Cost of Execution Time

 The cost of execution time is determined by the memory specification configured by your function and the length of time the function takes to execute. The execution time is calculated from the time the function code starts to execute until the time it returns or terminates, the granularity of measurement is 100 milliseconds, and the execution time when charged is rounded up in 100ms. For example, the function executes 1020 milliseconds. The billing time is 1100 milliseconds.

Cost of execution time = (Function execution time - quota of free execution time) * unit price of execution time

Unit price of execution time = RMB 0.00009997/(GB*seconds) (1GB memory configuration)

Execution time of function = memory specification (GB) * execution time (seconds)

For example: If the function memory specification is 512MB, then the execution time cost of function executing for 100 milliseconds is (512/1024) GB* (100/1000) seconds * RMB 0.00009997/ (GB*seconds) = RMB 0.0000049985, and the like for other memory specifications.

 
## Public Network Traffic Cost 

Only when you use the public network in the function for data transmission, will there be public network traffic cost. The public network traffic cost includes: uplink and downlink traffic cost for public network transmission.

The public network traffic cost = unit price of public network traffic * public network traffic

The unit price of public network traffic: RMB 0.80/GB

For the public network traffic cost, please refer to public network traffic billing of JD Cloud Virtual Machines

 

## Others

In the course of using the function service, if you use other JD Cloud service in combination, you will have to pay an extra fee for that service.

 

## Free Quota

Users of function services can enjoy a certain quota of free number of invokes and free execution time per month. Billing will be deducted from the free quota, and the portion in excess of the free quota is charged according to actual usage.

The free quota starts to reset at the beginning of each month and is emptied at the end of the month, not accumulated. Details of the free quota are shown in Table 1.

Table 1: Table of Free Quota

| Resource Type | Free Quota per Month |
| -------- | ------------ |
| Number of Invokes | 1 Million Times      |
| Execution Time | 400,000 (GB*Seconds) |
| Public Network Traffic | 0            |

 

Function is configured with different specifications of memory, the corresponding free quota of execution time per month is shown in Table 2.

Table 2: Table of Corresponding Free Quota of Memory Specification

| Memory (MB) | Free Length of Time (Second) |
| ---------- | -------------- |
| 128        | 3200000        |
| 256        | 1600000        |
| 384        | 1066667        |
| 512        | 800000         |
| 640        | 640000         |
| 768        | 533333         |
| 896        | 457143         |
| 1024       | 400000         |
