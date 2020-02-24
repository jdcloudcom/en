
# Function Log

Function Service provides function log through JD Cloud Log Service. For details, please refer to [Log Service](https://docs.jdcloud.com/en/logservice/product-overview).

## Log Configuration

If you want to view the function log, verify function execution. At first, you need to enable JD Cloud Log Service, and create log sets and log topics for storing function logs in the Log Service, and add the collection configuration in which "the product" is "Function Service".

* If you want to **collect all the function logs** in a same log set and log topic, it only needs to simply configure the collection instance type family to be "all instances"; the log set and log topic in which the collection instance type family is "all instances" will collect all function logs in "Function Service" under the user name, including subsequent new functions that will be automatically collected, so it is **unnecessary** to repeatedly configure them in the function advanced configuration in Function Service.

* If you want to **collect a designated function log** in different log sets and log topic, please configure the collection instance type family to be "select instances" to select the designated function, or you can **configure different log sets and log topics for different functions via the Log Service Option in the function advanced configuration**.

For details of log service collection configuration method, please refer to [Cloud Product Log Collection](https://docs.jdcloud.com/en/logservice/cloudresource) and [Configuration Management](https://docs.jdcloud.com/en/logservice/collectionconfigmanagement).

## Log Format

Now, the log type of the Function Service for access of log service is the **Function Execution Log**.

### Field Description
Log Field | Log Description | Log Type
-- | -- | --
time | Log Record Time | time
request_id | Request id | string
function_name | Function Name | string
version | Function Version | string
content | Function Output | string
message | Function Error Information | string
