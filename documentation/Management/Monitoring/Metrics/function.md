## Function Service

The servicecode for getting monitoring data by Function Service is function and indicator data are provided from three dimensions of function, version and alias.  
- When indicator data of a specific version is getting, a specific version number shall be designed for version in tags.
- When indicator data of a specific alias is getting, a specific alias shall be designed for alias in tags.  

The provided indicators are as follows:  

metric | Chinese Name  | English Name |Unit | Description
---|--- |--- |--- |--- 
function.avergeduration|平均Duration|AvergeDuration|ms|
function.maxmemorysize|最大内存使用|MaxMemorySize|MB|
function.totalinvocations|TotalInvocations|TotalInvocations|Time(s)|
function.billableinvocations|BillableInvocations|BillableInvocations|Time(s)|
function.throttles|Throttles|Throttles|Time(s)|
function.functionerrors|FunctionErrors|FunctionErrors|Time(s)|
