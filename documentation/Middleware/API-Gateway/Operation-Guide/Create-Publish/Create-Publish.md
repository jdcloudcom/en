# Release API Groups

After API group created, it is required to publish the API group before using it. Currently, the JD Cloud provides 3 sets of publishing environment: Test, Pre-release and On-line. You can publish and test the API group in Test and pre-release environment, and download the SDK and documents; and officially publish the SDK and documents of on-line API group in on-line environment.

API caller can access and call the API through custom domain or secondary domain after publishing.

Please note that:
- If selecting Mock backend in publishing, directly return to normal constant result instead of requesting the real back service when commissioning. This method applies to test if the request link of API is correct and skip the APP authentication and signature verification;
- The gateway will actually request the backend service if selecting the unique backend and call the backend address.


## Operation Steps:

### STEP1: select the group to be published

Firstly, enter the **API Group Management** page and find the group to be published

![APIgroup list](../../../../../image/Internet-Middleware/API-Gateway/apigroup-rp-apigroup-list.png)




### STEP2: click the **Publish**:

![Publish](../../../../../image/Internet-Middleware/API-Gateway/apigroup-fb.png)


Description:


1) Select the version to be published. API gateway supports the version management of group, so you need to pay attention to select the version to be published when publishing. Subsequently, you can switch or log off different versions in environment management.
   
2) Select the environment to be published. API gateway provides three environments: Test, Pre-release, On-line.

3) Select the publishing type of backend service. Support Mock backend and real backend at present. When commissioning, if selecting Mock backend to publish, then do not request the real backend service, but return to constant result. This method applies to test if the request link of API is correct and skip the APP authentication and signature verification.



### STEP3: Manage the versions published in different environments in the deployment management:
The deployment of different environments can be seen in the page of deployment management after publishing.
![Deployment list](../../../../../image/Internet-Middleware/API-Gateway/bslb-list.png)

API gateway supports to manage the API version used for test/online, so you can publish or off-line the API and switch the version will take effect immediately.
![Switch Version](../../../../../image/Internet-Middleware/API-Gateway/bslb-qhbb.png)

### STEP4: logoff
Directly click the “Off-line” if required, it will take effect in real time.

![Logoff](../../../../../image/Internet-Middleware/API-Gateway/bslb-xx.png)


