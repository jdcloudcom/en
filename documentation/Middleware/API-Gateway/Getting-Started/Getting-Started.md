 # Getting Started Overview

JD Cloud API Gateway provides API whole life cycle management, traffic control policy, access authorization, backend signature, API calling monitoring and other services. In addition to self-system integration and service aggregation, a user can also conveniently and safely open its business functions and data via API Gateway. You may complete the following steps in turn and open the API service at the console:
 
![](../../../../image/Internet-Middleware/API-Gateway/struct-workflow.png)





## Preconditions
- JD Cloud account registration is done and real-name verification is completed. If you don't have an account yet, please [register](https://accounts.jdcloud.com/p/regPage?source=jdcloud)。


## Operation Steps
###  Step 1: Enable the API Gateway service
The product is currently under open beta test, please apply for open beta test: Click **Apply for Beta Tes**t on the API Gateway product page; the user will receive a notice (email or SMS) upon the operator's approval for open beta test, and may access to the console for use. The service is provided on the menu's Middleware, API Gateway.


###  Step 2: Create an API group, and create an API under the group
#### Create an API group

1. Login [API gateway console](https://apigateway-console.jdcloud.com/apiGroupList).

2. On the "API Group Management page", click **Create New API Group** and go to the "Create" page.

3. Click OK after filling the group information to create the new group. When it is first created, the system will automatically save it as version 0.0.1. Thereafter, maintenance of multiple versions can be performed in Version Management.


#### Create API under group

You can create API after completion of API group. Creation of API is a process of definition of API request. You need to define the following contents in creation:

- Basic Information of API: Territory, API name, sub route, description and so on.

- API Request: Query parameters, request body type, request body format, response body type, response body format.



###  Step 3: Configure the backend signature and traffic control policy and associate the customized domain for the group

- Configure the backend signature for the group.

- Configure the traffic control policy for the group.

- Associate the customized domain for the group, which is optional. API Gateway associates the domain based on API group. API Gateway locates the only API group through domain, and determines the only API through Path+HTTPMethod.



### STEP4: Publish the API group to environment

Publish the API group to the environment through **Publish** operation in the page of **API grouping management**

During publishing, select the environment (Test, pre-launch, online) required to be published and the version to be published, configure the backend address, and then click to publish, namely, the group is published to the environment.




###  Step 5: Provide authorization access to the API caller

- Authorization Access

When the API provider provides API calling through authorization access, API caller is required to create an access key pair for calling API, and provide the key pair to API provider for authorization association of the group. Before that, API caller cannot use the downloaded SDK package.

- Access without Authentication

When API provider provides API calling without authentication, API caller may directly access through the downloaded SDK.

###  Step 6: API caller downloads and uses SDK package

- Easy Operation
	- [Rapidly release and call an API application](../Best-Practices/example_for_create_api.md)

