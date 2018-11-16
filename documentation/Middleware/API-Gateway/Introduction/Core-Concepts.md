# Core Concept
The following part shows the concept and explanation used in the help documentation of API gateway, reference only.

| Concept | Explanation |
| :- | :- |
| API Group | API provider manages the API unit. To create a API, it is necessary to first create a group. |
| API Life Cycle | API providers manage APIs in phases, including API creation, test, publishing, offline, version switching, and so on. |
| API Definition | API Information. The rules for the frontend configuration and backend service configuration of API set by the API provider when he creates the API. |
| Call Information | The relevant configurations that API provider offers the API to access and use externally. |
| Advanced Configuration | Connect with the backend actual service of API provider to offer proper configuration of specific functions. |
| Customize Domain Name | Associate the independent domain for group when the API provider opens API service. The client calls API by accessing the separate domain name. |
| Request Method | HTTP method, including GET, POST, PUT, PATCH, DELETE, HEAD. |
| Traffic Control Policy | It is used by API service providers to limit traffic to API, user and APP by day and hour. |
| Access Authorization | Grants the caller of one API group to call the permission of the API group, which is done by the API provider.  |
| Backend Signature | The API provider can be accessed by addition of backend signature when the gateway accessing. |
| Version Revision   | Each API group can maintain multiple versions. You can specify a version to publish in each environment. |
| Deployment List | Service publishing and deployment. At the end of the API group configuration, it should be released to the specific environment before it can provide services externally. The existing environment includes: Test, pre-launch, online. |
| Publish | The process that exposes the API so as to access from outside. The publish object is the service, subject to the current API configuration. API can be accessed externally only after publishing. |
| Access Key | User needs to create an access key as the identity at the time of calling API. |	
| APIKey/APISecret | Key pair for API caller, using when gateway verifies the access of API caller. Place into request to be the signature information after encrypted calculation. |
| AK/SK | Access Key/Access Key Secret JD Cloud user key pair. Normally used by the API definer, applicable for communication between the verification gateway and the server of API provider. |


