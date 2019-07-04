# Build API using the method of subscription Key


## Step I: Create API Group-Create API-Release:

The following process is the guide for creating the API in the API Gateway Console and authorizing and making API calls using a method of subscription Key.


### 1. Log in the API Gateway Console and turn on [API Group Management](https://apigateway-console.jdcloud.com/apiGroupList).

### 2. Click **Create Group

![创建分组](../../../../image/Internet-Middleware/API-Gateway/example_subkey_group.png)

### 3. After redirecting to the created API group page, please fill in the API group information.

![新建API分组](../../../../image/Internet-Middleware/API-Gateway/example_subkey_group2.png)

### 4. After clicking **OK**, the "Creation Succeeded" notification will be given. In such case, please select "API Management" in the pop-up window and redirect to the API list interface of this group.

![新建API分组成功](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createAPIList_success.png)

### 5. You can deploy API via the two methods below.

(1) Create API: Click **Create API** click **OK** after configuring "Name", "Sub-path", "Search Parameter", "Request Body Format" and "Normal Return Format" of API on Details, therefore, API is created. If SDK is required to be generated, Request Body Format and Normal Return Format are required to be defined. If SDK is not required, **Request Body Format** and **Normal Return Format** are left blank.

![新建API1](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createAPI_1.png)

![新建API2](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createAPI_2.png)

(2) Import API: Click **Import API**, upload yaml files conforming to the swagger2.0 specification, and click **OK**. Then, API set in the yaml file will be displayed in the API list interface. [Yaml File Download Link](https://apigateway.s3.cn-north-1.jdcloud-oss.com/demo/demo_PetStoreTest_Yaml.zip)

![导入API1](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createAPI_3.png)

![导入API2](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createAPI_4.png)

![导入API3](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createAPI_5.png)


### 6.	Click the tag page of **Version Amendment List**, click **Release**, configure the following options and click **OK**.

- Release Version: 0.0.1;
- Released As: On-line;
- Backend Service: Unique backend;
- Backend Service Address: http://petstore-demo-endpoint.execute-api.com.

![发布](../../../../image/Internet-Middleware/API-Gateway/example_subkey_deploy_1.png)

![发布2](../../../../image/Internet-Middleware/API-Gateway/example_subkey_deploy_2.png)

## Step II: Obtain Key-create access authorization-associate groups:

1. Turn on [Subscription Key](https://apigateway-console.jdcloud.com/subscriptionKey), and click **Create Key**.

    ![创建订阅密钥1](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createSubkey_1.png)

2. Fill in the name and description (optional) and click **OK**.

    ![创建订阅密钥2](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createSubkey_2.png)

3. Click Key name after creation succeeded, view details of the subscription Key and copy subscription key ID.

    ![创建订阅密钥3](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createSubkey_3.png)

4. Turn on [Access Authorization](https://apigateway-console.jdcloud.com/authorizationList) and click **Create Authorization**, select the authorization type as "Subscription Key". You can select the target key from an existing list of subscription Keys and authorize the API group. When different authorization types access the same API group, API Gateway will verify the authorization information of "Subscription Key" type in priority in the API call process.

    ![创建授权1](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createAuth_1.png)

    ![创建授权2](../../../../image/Internet-Middleware/API-Gateway/example_subkey_createAuth_2.png)
    
Via the above steps, the operation in the API Gateway Console interface is completed. Then, the call can be made to API.
    
## Step III: Call API
1.	 During the call, please enter the required header name when using the subscription Key: jdcloud-apim-subscription-key
2.	Here, an example of calling the API using postman: at the Headers part of postman, enter jdcloud-apim-subscription-key at KEY Location, enter Key of subscription Key at VALUE Location.
3.	Fill in the access path of API group and request path of API at the GET Request part to call API.

    ![调用API1](../../../../image/Internet-Middleware/API-Gateway/example_subkey_consumeAPI_1.png)

    ![调用API2](../../../../image/Internet-Middleware/API-Gateway/example_subkey_consumeAPI_2.png)
    
    ![调用API3](../../../../image/Internet-Middleware/API-Gateway/example_subkey_consumeAPI_3.png)
    
    ![调用API4](../../../../image/Internet-Middleware/API-Gateway/example_subkey_consumeAPI_4.png)

### You are allowed to obtain your API calling conditions in real time via the [API Gateway Monitoring](http://cms-console-north-2a-backup.jdcloud.com/monitor/apigateway), including: success number, traffic, response time, request exception and other information as well as exception condition alarm setting.


