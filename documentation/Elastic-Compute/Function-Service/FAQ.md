# FAQ

## General Questions

**1. How to expand elastically the execution of functions?**

The outstanding advantage of Serverless services is the required resources that can be auto scaled, the function service will execute your functions based on the number of concurrent auto scale resources requested by your functions.

 

**2. Can the machine that runs the functions be accessed?**

No, Function Service is used as Severless service, the user does not need to maintain all the infrastructure, including health checks, application security patches, operating system updates and other daily maintenance.

 

**3. How to access resources within a VPC using functions?**

You can configure information such as VPC and subnet for your functions, Function Service will set ENI with the VPC information you provide to enable your functions to access a particular VPC. Once the VPC configuration is enabled, your functions can run within a specific VPC.

 

**4. How do functions in the VPC access the public network?**

After your Function configures a VPC, it can only access resources in that VPC. If Function accesses both VPC resources and the public Internet, then there must be an internal network address translation instance (NAT) gateway instance in the VPC. Please refer to [NAT Instance Gateway](https://docs.jdcloud.com/en/virtual-private-cloud/nat-instance-gateway) for details.

 

## Function Questions

**1. What is the size of disk space allocated to the function?**

Each Function is allocated with 512 MB of bucket, the maximum allowable deployment package size for a single user is 1G, for resource limits for more functions, please refer to [Restrictions](Introduction/Restrictions.md).

 

**2. Whether a class library can be introduced upon using Function Development Function?**

It supports the introduction of standard library and non-standard tripartite library upon using Function to write functions, no dependency libraries are provided during beta.

 

**3. Whether threads and processes can be used in function code?**

The user can use the functions of the programming language and operating system to create additional threads and processes in the function.

 

**4. Which events can trigger Function?**

For detailed information of the event source, please refer to [Event Source Service](Operation-Guide/invokefunction/triggermanagement/eventsourceservice/eventsource-service.md).

 

**5. Whether Function supports the environment variable?**

You can set the environment variable for the function, without need to change the code, dynamic parameters can be set and passed to the function code and library, Please refer to [Environment Variable](Operation-Guide/ENV-variable.md) for use.

 

**6. Whether Function supports the version control?**

Function supports the version control. By default, each function has code that is unique to the latest (LATEST) version. The function client can call a particular version or get the latest implementation, please refer to [Version Management](Operation-Guide/version.md).

 

**7. How long does Function take to execute？**

Execution of synchronization calls to a function must be completed within 300 seconds. The default time-out is 3 seconds, the time-out event can be set to any value between 3 and 300 seconds, and if the time is out, function will terminate execution.

 

**8. What to do if the function runs longer than its maximum time-out period?**

The maximum running time of the function is 5min, so it is recommended that you split the large function into several small functions to run independently.

 
**9. I have five functions, and all of them use the same common library. Can I upload only one public library code and make these functions share the same library code?**

Different functions have varied loads, tps 50000 and 100 functions must have different scaling requirements to resources. Therefore, the resource scaling of each function in function calculation is performed independently, and the code packages between functions are independent and cannot be shared.
