# Introduction

You can achieve the service opening through creation and configuration of API group.
This paper will lead you to open the API through control panel.
You can open the API service successfully only by completion of the following procedures in turns:
- STEP1: Create API Groups
- STEP2: Create the API under group
- STEP3: Release the API groups to environment
- STEP4: Associate the domain name and configure the traffic control policy and backend signature for the group
- STEP5: Authorize the API caller to access


## Preconditions
- JD Cloud account registered and real-name verification finished. If no account, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1)，or [Real-name verification](https://uc.jdcloud.com/account/certify)


## Operational Steps
### STEP1: Create API groups

1. Login\[API gateway console](https://apigateway-console.jdcloud.com/apiGroupList).

2. On the “API Group Management page”, click **Create New API Group** and go to the “Create” page.

3. Click OK after filling the group information to create the new group. When it is first created, the system will automatically save it as version 0.0.1. Thereafter, maintenance of multiple versions can be performed in Version Management.




### STEP2: Create API under group
You can create API after completion of API group. Creation of API is a process of definition of API request. You need to define the following contents in creation:
- Basic Information of API: Territory, API name, sub route, description and so on.
- API Request: Query parameters, request body type, request body format, response body type, response body format.
- API Advanced Configuration: Backend route, backend parameters, backend constant parameters.


### STEP3: Publish the API group to environment

Publish the API group to the environment through **Publish** operation in the page of **API grouping management**

During publishing, select the environment (Test, pre-launch, online) required to be published and the version to be published, configure the backend address, and then click to publish, namely, the group is published to the environment.


### STEP4: Associate the domain name and configure the traffic control policy and backend signature for the group
1. API gateway associates the domain name based on API group. The API gateway locates to an unique API group through the domain name, and then determines the unique API through the Path+HTTPMethod.

2. Perform the configuration and association of traffic control policy

3. Perform the configuration and association of backend signature



### STEP5: Authorize the API caller to access

The authorization process is divided into two parts:

(1) API caller creates the access key and offer it to the API provider.

(2) API provider uses the access key offered by the API caller to access the API group

