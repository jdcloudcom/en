# Debugging API

After you have configured API, you can initiate a mock API call in the API debugging page to verify the correctness of the API.


#### Entry

Middleware>API Gateway>API Group Management>Manage API, select API and click the Debug API function in the operation.



####   Description:
Currently, the debugging pages can be used to debug API of authentication free type, or API that has been deployed.

- If your API has not yet deployed a release, please release first, or the debugging result will be affected.

- If your API is deployed, you can use it directly if the access authorization type is in authentication free mode. If it is in open access authorization mode, authorization association is required before debugging.




##  Operation Steps:
###  Step 1: Enter the management page of API

First, select the API group, click Manage API menu, and enter the API list page. And then select the API to be debugged, and click the Debug API function in the operation.
 ![API列表](../../../../../image/Internet-Middleware/API-Gateway/apigroup-apilist.png)


###  Step 2: Enter the API debugging page
 ![API列表](../../../../../image/Internet-Middleware/API-Gateway/apigroup-apilist-testapi.png)

Information Items Description:

- Group path prefix: It is the group path prefix entered for you when defining the API group.

- Version number: API group supports multiple versions of operations. Different versions of the same group can be deployed to different environments. The version number shown here is the version number of the API group to which the API currently debugged belongs.

- Sub-path: the sub-path information defined when the API is defined.

- Path parameter: the parameter defined when API is defined. The default value is to be filled in by default. If parameters are configured as compulsory, the compulsiveness will be checked before testing.

- Header parameter: the parameter defined when API is defined. The default value is to be filled in by default. If parameters are configured as compulsory, the compulsiveness will be checked before testing.

- Query parameter: the parameter defined when API is defined. The default value is to be filled in by default. If parameters are configured as compulsory, the compulsiveness will be checked before testing.

- Body parameter: If the request method defines POST, PUT and PATCH, you need to fill in the Body parameter yourself.

- If the authentication method is authentication free: If the access authorization type is in authentication free mode, it can be debugged directly;

- If the authorization method is in open access authorization, you need to conduct authorization association to the group first. If the API user authentication is used at the time of association, please enter the APIKey/APISecret; if the JD Cloud user authentication is used, please enter JD Cloud user AK/SK.




