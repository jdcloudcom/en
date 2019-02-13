# Service Usage Overview


The functions have been provided by JD Cloud Distributed Service Framework include: Registration Center, Service Management, Calling Chain Analysis Service and Configuration Management. The usage process of Console is shown as below:
 
![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/struct-sylc.png)

**Note:**

-   When creating microservice components, the Private IP resource in the VPC subnet of the user will be occupied, so that the user needs to keep sufficient subnet IP resource and we recommend that at least 15 IP addresses shall be reserved except that of Virtual Machines.

-   Before using the services of the product, please make sure that you have created VPC on JD Cloud. Please refer to: [Create VPC](https://docs.jdcloud.com/cn/virtual-private-cloud/vpc-configuration)

-   The Registration Center and Calling Chain Analysis Service are independent mutually and you can purchase your functions as required.



###  Step 1: Enable Service
#### Register an Account
Register a JD Cloud account. If you have already had a JD Cloud account, you can skip the step and carry out subsequent settings. If you have not registered a JD Cloud account, you can conduct registration at JD Cloud official website, please see [Registration](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=https%3a%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttps%3a%2f%2fwww.jdcloud.com)。

#### Verification Account
You need to verify your account so as to use the service normally.
Access the Real-name Verification page to select Individual or Enterprise as the Verification Type. Please refer to [Real-name Verification](https://uc.jdcloud.com/account/certify).

#### Enable Service
During Beta, click Apply for Beta on the Product page to enable the service. Please refer to [Purchase Process](../Pricing/Purchase-Process.md) for details.


### Step 2: Evaluate Resources
Evaluate instance resources situation required by your services. To use registration center, you need to evaluate the number of service instances connecting the registration center; to use Calling Chain Analysis Service, you need to evaluate TPS which is the number of Concurrent Writes of Calling Chain Log, i.e., use the total TPS of the entire business cluster to time the sampling rate.

###  Step 3: Create Registration Center
The management of the registration center is the core content of microservice governance. Access Registration Center Management to create Registration Center Management. After successful creation of the service center, you can conduct scaling, service authentication configuration, viewing cluster information deletion and other operations. Please refer to [Create Registration Center Cluster](../Operation-Guide/Cluster/Create-Cluster.md) for details.

### Step 4: Create Calling Chain Analysis Service
Enter Calling Chain Analysis Service and click Create Analysis Service to create Calling Chain trace. Calling Chain can trace the calling path of every request of distributed service to help user understand, analyze the time consuming and status of each stages for request processing, so as to completely grasp the service calling relationships and accurately discover the bottleneck of the system and the services with hidden trouble. Please refer to [Calling Chain Analysis Service](../Operation-Guide/Analysis-Service/Create-Analysis-Service.md) for details.

**Description: there is no forced sequent relationship between step 4 and step 3. You can directly use Calling Chain Analysis Service.**

### Step 5: Service Management and Configuration Management
Enter Service Management to view service instance data written in the Registration Center. The currently provided user functions include Service Authentication Configuration, Viewing instance details in the service, viewing data monitoring, etc. Please refer to [Service List](../Operation-Guide/Service-List/Service-List.md) for details.

Enter Configuration Management, Create Configuration to configure Registration Center information. Configuration Management provides the service that conducts centralized management for the configuration information of the distributed system on the Cloud Console, which users can add, delete and modify configurations in real-time and provides update mechanism of configuration information. Please refer to [Configuration List](../Operation-Guide/Config-List/Config-List.md) for details.

###  Step 6: Apply Deployment
For development standard application, it sets application relevant parameters, conducts deployment and running according to created Registration Center Address and Calling Chain Service Address.
Please refer to [Examples for Getting Started](../Getting-Started/Basic-Example.md) for example using service address in the application.


