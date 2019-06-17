
## Renew Process

For container instances and Pods of different billing methods, renewal operations may realize different functions:
- Instance renewal of billing based on pay by configuration: the instance billing method of pay by configuration will be changed into monthly package, and the renewal time period is 1 month to 9 months, 1 year, 2 years and 3 years.  
- Monthly package billing instance renewal: Expand the use duration of Virtual Machines Monthly Package. The renewal time periods include 1 month ~ 9 moths, 1 year, 2 years and 3 years. If you operate to renew prior to the instance date due, the start time of the new order is expiration time of the original order; if you renew after resource date due, the start time of the new order is expiration time of the date of renewal.  
The renewal operation also supports the follows:
- Associated renewal: During the container instance renewal, the Elastic IPs and cloud disks associated to the instance can be renewed as well after the user select the associated resources to be renewed together based on demands.
- Batch renewal: In [Console - Management - Renew Management](https://renewal-console.jdcloud.com/renew/nativecontainer) batch renewal for multiple resources is supported, and the use duration of selected resources is expanded based on the renewal duration selected by the user.  


**Renew Operation**

1. Open [Console - Elastic Compute - Native Container - Container Instance](https://cns-console.jdcloud.com/host/container/list) or [Console - Elastic Compute - Native Container - Pod](https://cns-console.jdcloud.com/host/pod/list), and select Operations - More - Renew.  
2. Enter into the renewal operation page to renew. Separate renewal of container instance or Pod is supported, and renewal with other associated resources is also supported.  

For more functions on renew management, please open [Console - Management - Renew Management - Native Container Instance](https://renewal-console.jdcloud.com/renew/nativecontainer) or [Console - Management - Renew Management - Native Container Pod](https://renewal-console.jdcloud.com/renew/pod), and please refer to [Renew Management Help Documentation](https://docs.jdcloud.com/en/online-buying/renew-management) for operations.
