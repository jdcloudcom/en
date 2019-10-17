# Service Usage Overview


JD Distributed Service Framework of JD Cloud provides services below: Namespace Management, Resource Pool Management, Application Management, Calling Chain Analysis Service, etc. 

**Note:**

-   When creating microservice components, the Private IP resource in the VPC subnet of the user will be occupied, so that the user needs to keep sufficient subnet IP resource and we recommend that at least 15 IP addresses shall be reserved except that of Virtual Machines.

-   Before using the services of the product, please make sure that you have created VPC on JD Cloud. Please refer to: [Create VPC](../../../Networking/Virtual-Private-Cloud/Introduction/Product-Overview.md)

-   The Registration Center and Calling Chain Analysis Service are independent mutually and you can purchase your functions as required.



###  Step 1: Enable Service

#### Register an Account

Register a JD Cloud account. If you have already had a JD Cloud account, you can skip the step and carry out subsequent settings. If you have not registered a JD Cloud account, you can conduct registration at JD Cloud official website, please see [Registration](https://user.jdcloud.com/register).

#### Verification Account

You need to verify your account so as to use the service normally.

Access the Real-name Verification page to select Individual or Enterprise as the Verification Type. Please refer to [Real-name Verification](https://uc.jdcloud.com/account/certify).


#### Enable Service
During Beta, click Apply for Beta on the Product page to enable the service. Please refer to [Purchase Process](../Pricing/Purchase-Process.md) for details.


### Step 2: Evaluate Resources
Evaluate instance resources situation required by your services. To use the registration center under the namespace, you need to evaluate the number of service instances connected the registration center; to use Calling Chain Analysis Service, you need to evaluate TPS which is the number of Concurrent Writes of Calling Chain Log.

###  Step 3: Create a namespace
Enter the namespace management page and create a namespace. For details, please refer to [Create a Namespace](../Operation-Guide/Namespace.md).

### Step 4: Create Calling Chain Analysis Service
If you need to call the analysis service, please enter Calling Chain Analysis Service and click **Create Analysis Service** to create calling chain trace. Calling Chain can trace the calling path of every request of distributed service to help user understand, analyze the time consuming and status of each stages for request processing, so as to completely grasp the service calling relationships and accurately discover the bottleneck of the system and the services with hidden trouble. For details, please refer to: [Create Calling Chain Analysis Service](../Operation-Guide/DevOps/Analysis-Service.md).

**Description: there is no forced sequent relationship between step 4 and step 3. You can directly use Calling Chain Analysis Service.**

###  Step 5: Apply Deployment

For development standard application, it sets application relevant parameters, conducts deployment and running according to created Registration Center Address and Calling Chain Service Address.

For application deployment in the Console, please refer to: [Application Management](../Operation-Guide/APP-Manage/APPList.md)

For examples of using service address in applications, please refer to: [Examples for Getting Started](../Getting-Started/Basic-Example.md).

  
