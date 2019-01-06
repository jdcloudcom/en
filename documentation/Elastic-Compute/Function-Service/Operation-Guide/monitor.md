# Function Monitoring

Function Service collects function indicators in real time through cloud monitoring and displays function execution information.

**Function Monitoring**

Currently, Function Service provides Function Monitoring for the Function dimension, and the monitoring items are shown in Table 1.

Table 1: List of Function Monitoring Items

| Indicator Name            | Unit | Description                                                         |
| ------------------- | ---- | ------------------------------------------------------------ |
| Average Duration        | ms   | Request Duration refers to the running time of the execution code of the user Function from the beginning to the end after invoking the Function.   Unlike the billing system, which rounds up the request Duration in 100 milliseconds as the measuring unit, this refers to the actual execution time of the request. Average Duration refers to the mean value of all the Duration requests within the minute granularity. |
| Maximum memory usage        | MB   | Invoke the maximum memory used by the Function within the aggregation cycle                   |
| TotalInvocations    | Times   | The total times of requests that Invoke the Function, including all requests that call the InvokeFunction interface for access and requests that the system performs asynchronous Invoke.   As shown in the table above, asynchronous Invoke requests are not counted in the total requests when the user initiates the request, but are counted when the asynchronous requests are actually executed by the system. |
| BillableInvocations | Times   | Times of requests that Invoke the Function successfully, such requests are equivalent to Invocations in the measurement items and are billable requests.   A function’s own syntax error or its own execution error is also included in the indicator. |
| Throttles           | Times   | Times of requests that Invoke the Function but are subject to the flow control                           |
| FunctionErrors      | Times   | Invoke the Function but a Function execution error occurs, including Hanled/Unhandled/   timeout and so on. |

 

**Function Alarm**

You can create customized alarms for any function through cloud monitoring based on actual business requirements, for details, please refer to Cloud Monitoring [Set Monitoring Alarm for Resources](https://docs.jdcloud.com/cn/monitoring/set-alarm-rules-details)。
