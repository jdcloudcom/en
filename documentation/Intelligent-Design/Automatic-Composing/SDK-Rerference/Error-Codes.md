
# Error Code

### 1. System Level Error Code
Return Code (code)|Description (message)
:---|:---
10000|Search succeeded
10001|Wrong Request appkey
10003|Corresponding data information is absent
10004|appkey parameter on the URL cannot be null
10010|The API requires payment, please recharge
10020|System is busy, please try again later
10030|Call Gateway failed, please contact JD Cloud
10040|Over the daily limitation, please continue tomorrow
10041|timestamp parameter on the URL cannot be null
10042|sign parameter on the URL cannot be null
10043|Over the QPS quota, please reduce the call frequency or contact JD Cloud
10044|The cluster QPS exceeds the limitation, please contact JD Cloud
10046|timestamp Parameter Format Error
10047|Request signature sign is invalid, please check signature information
10048|No API permission, please place an order
10050|User account has been disabled
10060|The releases sets the calling permissions, please contact the releaser
11010|Call of releaser’s API is abnormal, please try it later
11030|Return format of releaser’s API is wrong

### 2. Business Error Code

|Error Code|English Description|Specific Description|
|:--|:--|:--|
|12001|illegal params|Illegal parameter|
|12005|fail to process image|Image Processing Failed|
|12007|invalid image type, only jpg, jpeg are allowed|Invalid file type, only support jpg, jpeg|
|12009|file too large|The image size is too large, which cannot exceed 2M|
|12010|Internal Error|Processing Error|

### 3. Gateway System Level Error Code
|Error Code|HTTP Status Code|Error Information|Solutions|
|:--|:--|:--|:--|
|ARGUMENT_NOT_SUPPORT|400|The parameter argument is not supported|	Please check access information|
|ARGUMENT_NOT_FOUND	|400	|The parameter argument is required	|Please check access information|
|ARGUMENT_WRONG_FORMAT	|400	|	Type of parameter argument shall be of a format	|Please check access information|
|OUT_OF_RANGE	|400	|	The parameter value is illegal or exceeds the range	|Please check access information|
|ARGUMENT_MISMATCH	|400	|	The resource does not contain the parameter argument	|Please check access information|
|INVALID_ARGUMENT	|400	|	Parameter Argument Error	|Please check access information|
|FAILED_PRECONDITION	|400	|	The resource is not available for current operation in the current state  |   Please check access information|
|UNAUTHENTICATED	|401	|	Verification Failed	|Please check access information|
|HTTP_FORBIDDEN	|403	|	Verification Failed	|Please authorize the permission to relevant systems or contact relevant administrator for permission authorization|
|RESOURCE_NOT_EXIST	|404	|	Resource Absent	|Please check access information|
|NOT_FOUND	|404	|	resource cannot be found	|Please check access information|
|ABORTED	|409	|	Operation cannot be made to the resource now	|Please check access information|
|ALREADY_EXISTS	|409	|	The resource already exists	|Please check access information|
|CONFLICT	|409	|	The two resources have different parent resources 	 |    Please check access information|
|FAILED_PRECONDITION	|409	|	Parameters are dependent to each other in size	|Please check access information|
|QUOTA_EXCEEDED	|429	|	Insufficient Quota	|Please check access information or increase quota|
|RATE_LIMIT_EXCEEDED	|429	|	Your requests are too frequent	|Please try again later|
|CANCELLED	|499	|		Cancel Operation	| |
|UNKNOWN	|500	|		Unknown Error		| Please try again later |
|INTERNAL	|500	|		Internal Error		| Please try again later |
|NOT_IMPLEMENTED	|501	|		method is not supported now		| Please check access information |
|SOURCE_UNAVAILABLE	|502	|		Origin Server Unavailable		| Please check access information |
|UNAVAILABLE	|503	|		Service Unavailable		| Please check access information |
|DEADLINE_EXCEEDED	|504	|		Time Out		| 	Please try again later |
