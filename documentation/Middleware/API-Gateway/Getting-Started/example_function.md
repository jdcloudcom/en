# Use Function as API backend service

Now, the API gateway can use Function as the backend service. For the API adopting the function computation as the backend service, when the gateway receives a request, the API Gateway will trigger function execution. When the function receives the request, the execution result will be returned to the API Gateway. The detailed introduction to steps of triggering function computation by the API Gateway is given by the following examples.



## Operation Steps
###  Step 1: Create functions in Function


###  Step 2: Create an API group, and create an API under the group
#### Create an API group

1. Log in the [API Gateway Console](https://apigateway-console.jdcloud.com/apiGroupList).

2. Click **Create API Group** in the "API Group Management" page and enter the "Create" page.

3. Click **OK** after filling in the group information and a group is created. For the first creation, the system will automatically save the version number as 0.0.1. Multiple-version management can be made in the version management subsequently.


####  Create API Under Groups

You are allowed to create API once API groups are created. The creation of API is the process defining API requests. You need to define the following contents in order while creating:

- Basic information of API: region, API name, subpath, description, etc.

- API request: search parameters, request body type, request body format, response body type, response body format, etc.

- API backend: Select Function as the backend service


###  Step 3: Release API groups to the environment

On the **API Group Management** page, release API groups into the environment via the action **Release**.

In the release process, environments to be released (test, pre-release, on-line) can be selected, versions to be released can be selected and the backend address can be configured. Then, click **Release** to release groups into the environment.



###  Step 4: Provide authorization access to the API caller

- Authorization Access

When the API provider provides API calling through authorization access, API caller is required to create an access key pair for calling API, and provide the key pair to API provider for authorization association of the group. Before that, API caller cannot use the downloaded SDK package.

- Access without Authentication

When API provider provides API calling without authentication, API caller may directly access through the downloaded SDK.

###  Step 5: API caller downloads and uses SDK package to call functions

- Easy action: [Rapid Release and Call of an API Application](../Best-Practices/example_for_create_api.md)



