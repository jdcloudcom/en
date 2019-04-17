
# Function Log

Function Service provides function log through JD Cloud Log Service. For details, please refer to [Log Service](https://docs.jdcloud.com/en/logservice/product-overview).



If you want to view the function log, verify function execution. At first, you need to enable JD Cloud Log Service, and create log sets and log topics for storing function logs in the Log Service, and add the collection configuration in which "the product" is "Function Service".

* If you want to collect all the function logs in the same log set, log topic, it only needs to simply configure the collection instance type to be "all instances"; log sets and log topics in which the collection instance type is "all instances" will collect all function logs in "Function Service" under the user name, including subsequent new functions that will be automatically collected.

* If you want to collect different function logs in different log sets, log topics, please configure the collection instance type to be "select instances"; namely, you can configure different log sets and log topics for different functions by Log Service Option in the advanced configuration of the function.

For details of log service collection configuration method, please refer to [Cloud Product Log Collection](https://docs.jdcloud.com/en/logservice/cloudresource) and [Configuration Management](https://docs.jdcloud.com/en/logservice/collectionconfigmanagement).
