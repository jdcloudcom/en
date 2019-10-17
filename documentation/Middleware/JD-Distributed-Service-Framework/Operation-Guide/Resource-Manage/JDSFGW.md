# JD Distributed Service Gateway

JD Distributed Service Gateway of JD Cloud is used for open service, which can open service to other Intranet services and also can open service to public network access in cooperation with API Gateway.

If the registration center service of JD Distributed Service Framework is used, the JD Distributed Service gateway can automatically complete service discovery and Load Balancer when being called, without using another Load Balancer or gateway service.

If the service is released on the Load Balancer service in Intranet via other methods, seamless connection to the API gateway can also be realized via JD Distributed Service gateway. To avoid exposure to public network, it neither needs to apply for Public IP nor incurs any public network traffic cost.

JD Distributed Service gateway of JD Cloud has the following benefits:

- The JD Distributed Service gateway encapsulates internal structure of the JD Distributed Service application and provides the client with the unified calling entrance. When there is any calling request, the request will be forwarded by JD Distributed Service gateway to the authorized and released JD Distributed Service instance.

- With seamless integration between JD Distributed Service of JD Cloud and JD Cloud API Gateway, you can directly release your JD Distributed Service applications to the public network via API Gateway for calling, avoiding direct service exposure by the service provider, resulting in no need to applying for Public IP and incurring no public network traffic cost.

- Based on API Gateway, API traffic control policy, access authorization and other functions are realized, helping business developers attach more focuses on its own business development. 

- Simplify development workload of the client. The client only needs to interact with the gateway, without focusing on internal details such as service location, scaling of service instance, etc.



## Application Scenarios

JD Distributed Service gateway of JD Cloud helps users to call external JD Distributed Service applications without exposing service. At present, the following two calling methods are provided:


- JD Distributed Service gateway mode:

JD Distributed Service gateway service can serve as the backend service for API group of API gateway; when the API group is released in the deployment environment, users can call JD Distributed Service gateway through API Gateway and further call JD Distributed Service application instances in VPC. The JD Distributed Service gateway completes service discovery and Load Balancer (random mode).

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/st-wffwg.png)


- VPC agent mode:

The JD Distributed Service gateway can serve as the VPC agent, directly exposing any service which is deployed through the ip+ port in vpc to the public network via an API gateway, without direct exposure by Public IP and public network. For specific calling method, please refer to the example: [Use APIs in Open VPC of API Gateway](../../Getting-Started/GW_VPC.md)  

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/st-vpc.png)
 
 
## Relationships Between Concepts

Relationships between API group, JD Distributed Service gateway service, registration center and application of API gateway are as follows:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/st-apijdsf.png)

|Noun|Description|
|---|---|
| API Group  |  The API management unit provided by API provider, one API group comprises several APIs; API release, calling, authorization and flow control are made in the API group unit. For more details, please refer to: [API Gateway Grouping Description](../../../API-Gateway/Operation-Guide/Create-APIGroup/Create-APIGroup.md). |
| API Group Deployment Environment | API running environment, JD Cloud API gateway provides three environments now, including test, pre-release and on-line. API groups can be called when they are deployed to the environments (test, pre-release and on-line). For more details, please refer to: [API Gateway Release Environment Description](../../../API-Gateway/Operation-Guide/Create-APIGroup/Create-Publish.md). |
| JD Distributed Service Gateway Service  |  JD Distributed Service gateway provides the basic service unit; during the process of providing external service by the JD Distributed Service application, a specific JD Distributed Service gateway service instance is required for communication. |

Description:

- When the user needs to release one API group to different deployment environments, several JD Distributed Service gateway services can be selected as the business backend services;

- One JD Distributed Service gateway service can also provide backend service to several API groups under different environments;

- One JD Distributed Service gateway service can be associated with only one registration center.


## Preparatory Work

Assume that a user has created its own VPC on the JD Cloud platform and enabled JD Distributed Service Framework and a namespace, JD Distributed Service applications will be deployed to this namespace at the same time.


## Operation Steps


###   Create service
With the JD Distributed Service of JD Cloud, the service is opened to other services of Intranet and also opened to the public network for access with cooperation of the API gateway.

- If the registration center service of JD Distributed Service Framework is used, the JD Distributed Service gateway can automatically complete service discovery and Load Balancer when being called, without using another Load Balancer or gateway service.

- If the service is released on the Load Balancer service in Intranet via other methods, seamless connection to the API gateway can also be realized via JD Distributed Service gateway. To avoid exposure to public network, it neither needs to apply for Public IP nor incurs any public network traffic cost.

Now, JD Distributed Service Gateway Service supports two calling methods: external calling via API Gateway and calling during applications via the VPC agent mode. How to set up general process for JD Distributed Service Framework of applications based on [JD Cloud API Gateway](../../../API-Gateway/Introduction/Product-Overview.md) and JD Distributed Service Gateway for JD Distributed Service Frame of JD Cloud will be introduced in the document below.


1. 	Log in the JD Distributed Service Framework Console. Click **JD Distributed Service Gateway** on the left side navigation bar and log in the service list page.

2. 	 Click **JD Distributed Service Gateway Service** on the top of service list and log in the creation page.

3.	 Set service information, click **Buy Now** button and complete creation. After creation, the system will create a JD Distributed Service gateway service instance. If the Internet access is required, it is recommended that such service shall be provided via the API gateway.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-create-1.png)


| Information Item |Description |
|---|---|
| Region and Availability Zone | The system assignment method is recommended for use to guarantee high availability of system at the greatest extent. Please note during creation that the different regional resource intranets neither be interconnected to each other, nor be changed upon creation.  |
| JD Distributed Service Gateway Name |  The service name cannot be modified after being created. Subsequently, a bridge between API Gateway and JD Distributed Service Gateway will be built.   |
| Creation Method-General Method of JD Distributed Service Gateway | Used for calling each JD Distributed Service and served as the general method of JD Distributed Service. If the user selects to adopt this method with the API gateway, he/she needs to select the "JD Distributed Service API Group" at the time of selecting the API group type while creating API group in the API Gateway.    |
| Creation Method-VPC Agent | It can call the Internet via the API Gateway when the service of accessing IP and port via the Internet is not enabled, to further guarantee security of user’s external service. If the user selects to adopt this method with the API Gateway, he/she needs to select the "General API Group" at the time of selecting the API group type while creating API group in the API Gateway. |
| Registration Center & Application List  | One JD Distributed Service gateway service can only be affiliated to one registration center. Meanwhile, it needs to select and indicate which applications under this registration center can be called by this JD Distributed Service gateway service. Those unchecked applications will not be discovered by the gateway service. Applications can be added or deleted as required after JD Distributed Service gateway service is created.
|  QPS Specification  | Now, product billing is made as per specification. |


####  Operation Process in Combination with API Gateway

Next, operation processes in combination with API Gateway are specified as below, which comprise two steps: the general step for release JD Distributed Service gateway service via API Gateway and the step of release VPC agent via API Gateway.

Before introduction, it is believed by default that the following preparation is well made by users:

-  The user has enabled API Gateway and JD Distributed Service Framework.

-  The user has created registration center and deployed applications on JD Distributed Service Framework.

-  Users have read common information and process about API gateway products.


#####    General Steps for Release JD Distributed Service Gateway Service via API Gateway

######  STEP 1: Create JD Distributed Service gateway service. In which, the creation method is selected as "JD Distributed Service Gateway".

-  When the method is selected, please specify the registration center of such gateway.

-  It also needs to specify and select those applications providing service via JD Distributed Service gateway under the registration center. The applications are not required to be filled in when service is created and can be updated at any time as required when service is created.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-create-1.png)


######  STEP2: Create an API group. Please select API group type as "JD Distributed Service API Group".

-  There is no forced sequent relationship between Step 1 and Step 2 at the time of creation. The user can create the API group first or the JD Distributed Service gateway service.

-  When API Gateway forwards requests to JD Distributed Service gateway, the JD Distributed Service API group type does not support forwarding of group path prefix content to the JD Distributed Service gateway.

-  To facilitate the demonstration, the "Free Access Authentication" mode is selected as access authorization mode.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-APIdetail-1.png)

Information of created API group is as follows:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-APIdetail-1-1.png)
 
 


######  STEP3: Associate with each other.

-  There are two association entrances:

       -  1. Associate among API gateway products. Click **Associate** operation in the group information on the API group list page.

       -  2. Associate among JD Distributed Service gateway products.

-  The association operations are shown as follows:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-bondAPI.png)

Note:

	-  Each release environment of API group can be associated with only one backend service.
	    
	   For example, where the "pre-release" environment of this group is not associated with any JD Distributed Service, this group under the "pre-release" environment can only be associated to the new JD Distributed Service gateway service;
	
	-  If the API group has been associated with other JD Distributed Service gateway service, it cannot be associated with others.
	
	-  API group information here refers to API group list information which is filtered and can be associated. API groups associated in this environment will not appear in the list.


-  The associated information will show contents such as associated API group information and API group environment information. In addition, operation entrances such as release, off-line and disassociation of API group will be provided.

 ![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-jbxx-3apilist.png)


######   STEP4: Release an API group.

After release, user can call the public network via the API gateway. There are two API group release entrances:

1. Directly click **Release** on the API group list page of JD Distributed Service gateway service. For release here, environment information and version information related to API groups cannot be modified.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-fb-jdsf.png)


2. Click **Release** among API gateway products.

-  For release here, you can select to release the API group to different environments (test, pre-release and on-line).

-  Under each environment, the same or different JD Distributed Service gateway services can be adopted as the backend services.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-fb-apigwjdsfgw.png)


######   STEP5: Call.
There are two calling methods: calling in VPC and calling via API Gateway. They are respectively introduced as follows:

######   Call Method in VPC

1. Open API Group Basic Information tab Tag of JD Distributed Service Gateway Service to see path call rules in VPC. For example:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-mic-detail-1.png)

2. Call services according to the rule spelling path through calling statements. For example:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-mic-detail-2.png)

```
curl -X GET http://jdsf-mgw-126aemarp4s1s-nlb.jvessel-open-hb.jdcloud.com:8080/jdsf-server/server/get
```    

Path Description:

| Content 	| Description	|  
| :- | :- | 
|  http://jdsf-mgw-126aemarp4s1s-nlb.jvessel-open-hb.jdcloud.com:8080/  	|   Call Path Generated for JD Distributed Service Framework	|
| jdsf-server  | Namely, {serviceName} content, which is the application that already exists in your registration center and is normally accessible  | 
| server/get   | Namely, {path} content, which is the path of application  | 



######   Public Network Call Method

1. First ensure that the API Group has been released to the environment. Then, the Internet call path can be obtained from the deployment environment of API Group.

The path to search Internet call has two entries:


-  In JD Distributed Service Gateway, view API Group List tab Tag of JD Distributed Service Gateway Service, click group environment to view the call address as show in the below

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-mic-detail-3.png)


-  In API Gateway, view the call address in release environment tab Tag of group details

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-mic-detail-4.png)


2. Call address.

1) You can enter the call address directly into the browser. For example:

```
    http://w27vqwu8gkzy-preview.cn-north-1.jdcloud-api.net/jdsf-server/server/get
```    


2) Through call statements. For example:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-mic-detail-5.png)

```
curl -X GET http://w27vqwu8gkzy-preview.cn-north-1.jdcloud-api.net/jdsf-server/server/get
```    

Path Description:

| Content 	| Description	|  
| :- | :- | 
|  http://w27vqwu8gkzy-preview.cn-north-1.jdcloud-api.net/ 	|   Perform public network call for call address generated for API Gateway.	|
| jdsf-server  | Namely, {serviceName} content, which is the application that already exists in your registration center and is normally accessible  | 
| server/get   | Namely, {path} content, which is the path of application  | 








#####    Release VPC agent service steps via API gateway

######   STEP 1: Create JD Distributed Service gateway service. Select "VPC" agent as the creation method

-  Please note that the IP forward address is: Private IP+port method and the port is the required option.

-  It needs to specify network information of VPC. Please note that mutual calling can be enabled only in the same VPC.

-  Now, the https  web service of agent backend with the private certificate is not supported now

For example:

Create contents as follows:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-create-2vpc.png)
 
Creation Completed:
 
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-mic-detail-vpc-1.png)

 
 

######   STEP2: Create an API group. Please select API group type as "general API group".

-  The VPC agent is one of the general methods provided to API gateway. Therefore, it is included in the API group as the standard function.

   Note: Currently, you cannot use the VPC agent method if you do not choose "General API Group" for releasing.

-  Therefore, during deployment and release of general API group, VPC agent method can be selected as its backend service. Other methods (such as http/https, mock, etc.) can also be selected as its backend services.

- To facilitate the demonstration, the group information is set as follow, do not forward the group path to the backend, and select Free Access Authentication mode.

For example: Create API Group with the name of vpctest

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-APIdetail-1-ty.png)


######   STEP3: Release. There are two entries:

1. Release among API gateway products.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-fb-apigw.png)

2. Release among JD Distributed Service gateway products.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-fb-jdsf.png)
	


######   STEP4: Call.
There are two calling methods: calling in VPC and calling via API Gateway. They are respectively introduced as follows:

######  Call Method in VPC

1. Open API Group Basic Information tab Tag of JD Distributed Service Gateway Service to see path call rules in VPC.

2. Call services according to the rule spelling path through calling statements. For example:

```
curl -X GET http://jdsf-mgw-l6mnhdd1zpc-nlb.jvessel-open-sh.jdcloud.com:8080/10.0.0.69:9999/server/get
```    

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-mic-detail-vpc-2.png)


Path Description:

| Content 	| Description	|  
| :- | :- | 
|  http://jdsf-mgw-l6mnhdd1zpc-nlb.jvessel-open-sh.jdcloud.com:8080/ 	|   Call Path Generated for JD Distributed Service Framework	|
| 10.0.0.69:9999 | For Private IP+Port | 
| jdsf-server  | Namely, {serviceName} content, which is the application that already exists in your registration center and is normally accessible  | 
| server/get   | Namely, {path} content, which is the path of application  | 




######   Call Method Through API Gateway

1. First ensure that the API Group has been released to the environment. Then, the Internet call path can be obtained from the deployment environment of API Group.

The path to search Internet call has two entries:


-  In JD Distributed Service Gateway, view API Group List tab Tag of JD Distributed Service Gateway Service, click group environment to view the call address as show in the below

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-mic-detail-vpc-3.png)


-  In API Gateway, view the call address in release environment tab Tag of group details



2. Call address.

1) You can enter the call address directly into the browser. For example:

```
    http://w2xmjqwbx62p-test.cn-north-1.jdcloud-api.net/server/get
```    


2) Through call statements. For example:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-mic-detail-vpc-4.png)

```
curl -X GET http://w2xmjqwbx62p-test.cn-north-1.jdcloud-api.net/server/get
```    
 
-   See the DEMO Example [Best Practices](../../Getting-Started/GW_VPC.md) for the above  




###  View JD Distributed Service gateway service details

1. 	Log in the JD Distributed Service Framework Console

2. 	Click **JD Distributed Service Gateway** on the left side navigation bar and log in the service list page

3. 	Click the service name to be viewed in the service list and enter the Details to view information. A JD Distributed Service gateway service comprises two parts: basic information and API group list information.

 
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-jbxx-1.png) 


####  The basic information tab page comprises two information parts:

1.	 Basic information of JD Distributed Service gateway service itself.

2.	 Information related to the registration center served by JD Distributed Service gateway.

-  Users can update application information list under the registration center at any time. Only the selected applications can be discovered by JD Distributed Service gateway service.

-  When users call applications, please access as per calling path rules in VPC.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-jbxx-2.png) 
 
  

####   The API group list tab page shows information summary of API group associated and selected after JD Distributed Service gateway service is released through the API gateway.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-jbxx-3apilist.png) 
 
1.	 One JD Distributed Service gateway service can provide access to several API groups.

2.	 API groups and JD Distributed Service gateway may be in different regions.

3. 	After the client send a request to API gateway, please attach importance to the following items when API gateway switches user requests to backend JD Distributed Service:

-  When the client requests the API gateway, the request path rule is: http(s)://host/group path prefix/{released JD Distributed Service name}/{API path defined in user service}.

-  API Gateway now cannot transmit group path prefix information of API group to the JD Distributed Service gateway service at backend.


4. 	Associate API group operation: the process associating JD Distributed Service gateway service with API groups. During association, it needs to be accurate to the release environment of API group. Note:

-  Only the API group of the "JD Distributed Service API Group" type can appear in the optional association list.

-  Each release environment of API group can be associated with only one backend service. Therefore, during the environment information association process, the API group which has not been associated under this environment can appear in the association list. Moreover, the system will automatically filter API group information which cannot be associated.

For example, the API group with the name of abs has been selected as the backend service for the JD Distributed Service gateway service cjtest_mic_gw under the test environment, then the API group abs can only be associated under the pre-release and on-line environments.


As shown in the figure below, as the API group abs hasn’t been associated with any information in the pre-release environment, it can be associated in the pre-release environment.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-bondAPI.png) 

 

As shown in the figure below, the API group abs will not appear in the associated API group list under the test environment. This is because the test environment of this API group has been associated with other JD Distributed Service gateway services.
 
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-bondAPI-2.png) 

 
5. 	Release operation: Access to JD Distributed Service applications can be provided only when the API group release takes into effect.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-fb-jdsf.png) 

 

6. 	Off-line operation: After the group is off-line under a specific environment (such as the pre-release environment), the service cannot be accessed anymore under this environment.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-xxAPI.png) 

 
 
7.	 Disassociation operation: Release the relationship between the API gateway group and JD Distributed Service gateway service.

- If the API group is released in the release environment, it cannot be disassociated before making the group off-line.
 
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-unbondAPI.png) 

 




###  View list of JD Distributed Service gateway service

1. 	Log in the JD Distributed Service Framework Console

2. 	Click **JD Distributed Service Gateway** on the left side navigation bar and log in the service list page
 
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-list.png) 


Operations which can be made by the user on the service list page include:

1. Create gateway service: Create one new JD Distributed Service gateway service.

2. View details: View details of created JD Distributed Service gateway service.

3. Associate: If it is expected to provide the created JD Distributed Service gateway service externally via the API gateway, it needs to associate the API group for calling by the client.

4. Update application: Update accessible application information.

-  If the general gateway service of JD Distributed Service is selected during creation, the user can update applications under the registration center depending on business conditions upon creation, for calling by JD Distributed Service gateway;

-  The JD Distributed Service gateway service in the VPC agent mode does not have this function.


5. Resize: Upgrade current specification.

-  To guarantee service stability, now it is not allowed to degrade the configuration to the QPS specification during resizing.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-price.png) 


6. Delete: Delete JD Distributed Service gateway service.

-  The precondition for deletion is that the service is not associated with any released API group.

-  If the API group is released in any deployment environment (test, pre-release or on-line), please make it off-line first and then delete.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsfgw-del.png) 






