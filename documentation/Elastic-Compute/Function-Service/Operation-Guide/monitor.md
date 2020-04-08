# Function Monitoring

Function Service collects function indicators in real time through cloud monitoring and displays function execution information.

**Function Monitoring**

Currently, Function Service provides Function Monitoring for the Function dimension, and the monitoring items are shown in Table 1.

Table 1: List of Function Monitoring Items

| Indicator Name            | Unit | Description                                                         |
| ------------------- | ---- | ------------------------------------------------------------ |
| Average Duration        | ms   | Request Duration refers to the actual running time of the execution code of the user Function from the beginning to the end after invoking the Function. |
| Maximum memory usage        | MB   | Invoke the maximum memory used by the Function within the aggregation cycle.                   |
| TotalInvocations    | Times   | The total times of requests that Invoke the Function, including all requests that invoke the InvokeFunction interface for access and requests that the system performs asynchronous Invoke. Asynchronous Invoke requests, which start counting when actually executed by the system. |
| BillableInvocations | Times   | Times of Invoking the Function successfully, such requests are billable requests, including function syntax errors or running errors. |
| Throttles           | Times   | Times of requests that Invoke the Function but are subject to the flow control.                          |
| FunctionErrors      | Times   | Invoke the Function but a Function execution error occurs. |

 

**Function Alarm**

You can create customized alarms for any function through cloud monitoring based on actual business requirements, for details, please refer to Cloud Monitoring [Set Monitoring Alarm for Resources](https://docs.jdcloud.com/en/monitoring/add-rule).
