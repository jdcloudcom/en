# Features

## API Group Management

### API Group Information
The API unit managed by API is the API group. Achieve the access authorization, traffic control policy, version management and deployment management based on API group.

### API Management
API information. The API provider specifies the rules for frontend configuration and backend service configuration to achieve the API opening when he creates the API.

### Customized Domain Name Management
Associate the independent domain for group when the API provider opens the API service. The client calls API by accessing the separate domain name.

### Revision Management
Each API group can maintain multiple versions. You can specify a version to publish in each environment.

### Deployment Management
Service publishing and deployment. At the end of the API group configuration, it should be released to the specific environment before it can provide services externally. The existing environment includes: Test, pre-launch, online.



## Access Authorization
Grant the caller of one API group to call the permission of the API group, which is done by the API provider.

## Traffic Control Policy
It is used by API service providers to limit traffic to API, user and APP by day and hour.


## Backend Signature
The API provider can be accessed by addition of backend signature when the gateway accesses the provider.

## Access Key Management
### Access Key
API caller needs to create an access key as the identity information at the time of calling API. API caller can achieve API calling only after the API provider associates the key pair to the API group.

### Authorized API Group
List of all API group information called by API caller.


