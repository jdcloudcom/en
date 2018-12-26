# Basic Architecture
API Gateway provides both API provider services and API caller services. API provider provides the caller with API calling by managing and deploying API group; API caller uses API through access key and API definer’s authorization access.

## Business Structure
The business structure is shown below:
![](../../../../image/Internet-Middleware/API-Gateway/API-struct.png)

| Concept | Explanation |
| :- | :- |
|  Access Key  |  User needs to create an access key as the identity at the time of calling API. |	
|   API Group |  API service provider manages the API unit. To create a API, it is necessary to first create a group. |
| Traffic Control Policy | It is used by API service providers to limit traffic to API, user and APP by day and hour. |
| Access Authorization   | Grants the caller of one API group to call the permission of the API group, which is done by the API provider.  |
| Backend Signature   | The API provider can be accessed by addition of backend signature when the gateway accessing. |
| Version Revision   | Each API group can maintain multiple versions. You can specify a version to publish in each environment. |
| Deployment List | Service publishing and deployment. At the end of the API group configuration, it should be released to the specific environment before it can provide services externally. The existing environment includes: Test, pre-launch, online. |



## Relevant References

- [Product Advantage](../Introduction/Benefits.md)
- [Product Function](../Introduction/Features.md)
- [Price Overview](../Pricing/Price-Overview.md)
- [Billing Rules](../Pricing/Billing-Rules.md)




